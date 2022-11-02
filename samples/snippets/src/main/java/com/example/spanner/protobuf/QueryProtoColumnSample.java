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
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.Statement;

public class QueryProtoColumnSample {

  static void queryProtoColumn() {
    String projectId = "my-project";
    String instanceId = "my-instance";
    String databaseId = "my-database";

    try (Spanner spanner =
        SpannerOptions.newBuilder().setProjectId(projectId).build().getService()) {
      DatabaseClient client =
          spanner.getDatabaseClient(DatabaseId.of(projectId, instanceId, databaseId));
      queryProtoColumn(client);
    }
  }

  static void queryProtoColumn(DatabaseClient client) {
    Statement statement =
        Statement.newBuilder("SELECT singer_id, singer_info, genre\n" + "FROM Singer").build();

    try (ResultSet resultSet = client.singleUse().executeQuery(statement)) {
      while (resultSet.next()) {
        System.out.printf(
            "singer_id: %s, singer_info: %s , genre: %s%n",
            resultSet.getLong("singer_id"),
            resultSet.getProtoMessage("singer_info", SingerInfo.getDefaultInstance()),
            resultSet.getProtoEnum("genre", Genre::forNumber));
      }
    }
  }
}
