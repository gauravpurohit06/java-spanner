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
import com.google.cloud.spanner.Statement;
import com.google.cloud.spanner.Value;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

public class UpdateProtoColumnSample {

  static void updateProtoData() {
    String projectId = "span-cloud-testing";
    String instanceId = "gaurav-test";
    String databaseId = "music";

    try (Spanner spanner =
        SpannerOptions.newBuilder().setHost("https://staging-wrenchworks.sandbox.googleapis.com")
            .setProjectId(projectId).build().getService()) {
      DatabaseClient client =
          spanner.getDatabaseClient(DatabaseId.of(projectId, instanceId, databaseId));
      updateProtoData1(client);
    }
  }

  /*
   * Assuming a table Library with two columns bookId & bookProto
   * */
  static void updateProtoData1(DatabaseClient client) {
    SingerInfo singerInfo =
        SingerInfo.newBuilder()
            .setSingerId(11)
            .setNationality("Country1")
            .build();

    client
        .readWriteTransaction()
        .run(transaction -> {
          Statement statement =
              Statement.newBuilder(
                      "INSERT INTO SingerTest (singer_id, singer_info, genre) VALUES "
                          + "(1025,  NEW spanner.examples.music.SingerInfo(29 AS singer_id, \"gg\" as nationality), @bb )")
                  .bind("bb")
                  .to(Genre.ROCK)
                  .build();
          long rowCount = transaction.executeUpdate(statement);
          System.out.printf("%d record inserted.%n", rowCount);
          return null;
        });
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
            Mutation.newInsertOrUpdateBuilder("SingerTest")
                .set("singer_id")
                .to(32)
                .set("singer_info")
                .to(singerInfo)
                .set("genre")
                .to(Genre.JAZZ)
                .set("singer_info_list")
                .toProtoMessageArray(Arrays.asList(singerInfo, null, SingerInfo.getDefaultInstance()), SingerInfo.getDescriptor())
                .set("genre_list")
                .toProtoEnumArray(Arrays.asList(Genre.FOLK, null, Genre.ROCK), Genre.getDescriptor())
                .build()));
  }
  public static void main(String[] args) {
    updateProtoData();
  }
}

