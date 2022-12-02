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
import com.google.cloud.spanner.Key;
import com.google.cloud.spanner.KeySet;
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.Statement;
import com.google.cloud.spanner.TimestampBound;
import java.util.Arrays;

public class QueryProtoColumnSample {

  static void queryProtoColumn() {
    String projectId = "span-cloud-testing";
    String instanceId = "gaurav-test";
    String databaseId = "music";

    try (Spanner spanner =
        SpannerOptions.newBuilder().setHost("https://staging-wrenchworks.sandbox.googleapis.com")
            .setProjectId(projectId).build().getService()) {
      DatabaseClient client =
          spanner.getDatabaseClient(DatabaseId.of(projectId, instanceId, databaseId));
      queryProtoColumn1(client);
    }
  }

  static void queryProtoColumn1(DatabaseClient client) {

    try (ResultSet resultSet = client.singleUse(TimestampBound.strong())
        .read(
            "SingersNew",
            KeySet.newBuilder()
                .addKey(Key.of("in", null))
                .build(),
            Arrays.asList("SingerId", "SingerInfo", "SingerGenre"))) {
      while (resultSet.next()) {
        System.out.printf(
            "singer_id: %s, singer_info: %s , genre: %s %n",
            resultSet.getLong("SingerId"),
            resultSet.getProtoMessage("SingerInfo", SingerInfo.getDefaultInstance()),
            resultSet.getProtoEnum("SingerGenre", Genre::forNumber));
      }
    }
  }


  static void queryProtoColumn(DatabaseClient client) {
    Statement statement =
        Statement.newBuilder("SELECT singer_id, singer_info, genre, singer_info_list, genre_list\n"
            + "FROM SingerTest").build();

    try (ResultSet resultSet = client.singleUse().executeQuery(statement)) {
      while (resultSet.next()) {
        System.out.printf(
            "singer_id: %s, singer_info: %s , genre: %s, "
                + "singer_info_list: %s, genre_list: %s%n ",
            resultSet.getLong("singer_id"),
            resultSet.getProtoMessage("singer_info", SingerInfo.getDefaultInstance()),
            resultSet.getProtoEnum("genre", Genre::forNumber),
            resultSet.getProtoMessageList("singer_info_list", SingerInfo.getDefaultInstance()),
            resultSet.getProtoEnumList("genre_list", Genre::forNumber));
      }
    }
  }

  public static void main(String[] args) {
    queryProtoColumn();
  }
}
