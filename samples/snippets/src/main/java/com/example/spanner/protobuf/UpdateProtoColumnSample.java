/*
 * Copyright 2021 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.spanner.protobuf;

import com.example.spanner.protobuf.SingerProto.Genre;
import com.example.spanner.protobuf.SingerProto.SingerInfo;
import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.common.collect.ImmutableList;

public class UpdateProtoColumnSample {

  static void updateProtoData() {
    String projectId = "my-project";
    String instanceId = "my-instance";
    String databaseId = "my-database";

    try (Spanner spanner =
        SpannerOptions.newBuilder().setProjectId(projectId).build().getService()) {
      DatabaseClient client =
          spanner.getDatabaseClient(DatabaseId.of(projectId, instanceId, databaseId));
      updateProtoData(client);
    }
  }

  /*
   * Assuming a table Library with columns (singer_id, singer_info, genre)
   * */
  static void updateProtoData(DatabaseClient client) {
    SingerInfo singerInfo =
        SingerInfo.newBuilder()
            .setSingerId(11)
            .setNationality("Country1")
            .build();

    client.write(
        ImmutableList.of(
            Mutation.newInsertOrUpdateBuilder("Singer")
                .set("singer_id")
                .to(32)
                .set("singer_info")
                .to(singerInfo)
                .set("genre")
                .to(Genre.JAZZ)
                .build()));
  }
}
