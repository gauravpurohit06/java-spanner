/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner;

import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public interface AsyncRunner {

  interface AsyncWork<R> {
    /**
     * Performs a single transaction attempt. All reads/writes should be performed using {@code
     * txn}.
     *
     * <p>Implementations of this method should not attempt to commit the transaction directly:
     * returning normally will result in the runner attempting to commit the transaction once the
     * returned future completes, retrying on abort.
     *
     * <p>In most cases, the implementation will not need to catch {@code SpannerException}s from
     * Spanner operations, instead letting these propagate to the framework. The transaction runner
     *
     * <p>will take appropriate action based on the type of exception. In particular,
     * implementations should never catch an exception of type {@link SpannerErrors#isAborted}:
     * these indicate that some reads may have returned inconsistent data and the transaction
     * attempt must be aborted.
     *
     * <p>If any exception is thrown, the runner will validate the reads performed in the current
     * transaction attempt using {@link Transaction#commitReadsOnly}: if validation succeeds, the
     * exception is propagated to the caller; if validation aborts, the exception is thrown away and
     * the work is retried; if the commit fails for some other reason, the corresponding {@code
     * SpannerException} is returned to the caller. Any buffered mutations will be ignored.
     *
     * @param txn the transaction
     * @return future over the result of the work
     *     <p>TODO(loite): It's probably better to let this method return `R` instead of
     *     `ApiFuture<R>`, as we need to wait until the result of the work has actually finished
     *     before we can commit the transaction. Returning an ApiFuture<R> here just means that the
     *     underlying framework code still has to call {@link ApiFuture#get()} before committing.
     */
    ApiFuture<R> doWorkAsync(TransactionContext txn);
  }

  <R> ApiFuture<R> runAsync(AsyncWork<R> work, Executor executor);

  /**
   * Returns the timestamp at which the transaction committed. {@link ApiFuture#get()} will throw an
   * {@link ExecutionException} if the transaction did not commit.
   */
  ApiFuture<Timestamp> getCommitTimestamp();
}
