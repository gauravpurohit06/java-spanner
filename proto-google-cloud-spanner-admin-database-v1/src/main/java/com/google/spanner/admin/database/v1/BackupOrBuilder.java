/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/backup.proto

package com.google.spanner.admin.database.v1;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] operation.
   * Name of the database from which this backup was
   * created. This needs to be in the same instance as the backup.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * </pre>
   *
   * <code>string database = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Required for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] operation.
   * Name of the database from which this backup was
   * created. This needs to be in the same instance as the backup.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * </pre>
   *
   * <code>string database = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * Required for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup]
   * operation. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 366 days
   * from the time the CreateBackup request is processed. Once the `expire_time`
   * has passed, the backup is eligible to be automatically deleted by Cloud
   * Spanner to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Required for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup]
   * operation. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 366 days
   * from the time the CreateBackup request is processed. Once the `expire_time`
   * has passed, the backup is eligible to be automatically deleted by Cloud
   * Spanner to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Required for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup]
   * operation. The expiration time of the backup, with microseconds
   * granularity that must be at least 6 hours and at most 366 days
   * from the time the CreateBackup request is processed. Once the `expire_time`
   * has passed, the backup is eligible to be automatically deleted by Cloud
   * Spanner to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] operation.
   * Required for the [UpdateBackup][google.spanner.admin.database.v1.DatabaseAdmin.UpdateBackup] operation.
   * A globally unique identifier for the backup which cannot be
   * changed. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/[a-z][a-z0-9_&#92;-]*[a-z0-9]`
   * The final segment of the name must be between 2 and 60 characters
   * in length.
   * The backup is stored in the location(s) specified in the instance
   * configuration of the instance containing the backup, identified
   * by the prefix of the backup name of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only for the [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] operation.
   * Required for the [UpdateBackup][google.spanner.admin.database.v1.DatabaseAdmin.UpdateBackup] operation.
   * A globally unique identifier for the backup which cannot be
   * changed. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/[a-z][a-z0-9_&#92;-]*[a-z0-9]`
   * The final segment of the name must be between 2 and 60 characters
   * in length.
   * The backup is stored in the location(s) specified in the instance
   * configuration of the instance containing the backup, identified
   * by the prefix of the backup name of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The backup will contain an externally consistent
   * copy of the database at the timestamp specified by
   * `create_time`. `create_time` is approximately the time the
   * [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] request is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The backup will contain an externally consistent
   * copy of the database at the timestamp specified by
   * `create_time`. `create_time` is approximately the time the
   * [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] request is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The backup will contain an externally consistent
   * copy of the database at the timestamp specified by
   * `create_time`. `create_time` is approximately the time the
   * [CreateBackup][google.spanner.admin.database.v1.DatabaseAdmin.CreateBackup] request is received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Size of the backup in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Backup.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the backup.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.Backup.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.spanner.admin.database.v1.Backup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The names of the restored databases that reference the backup.
   * The database names are of
   * the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * Referencing databases may exist in different instances. The existence of
   * any referencing database prevents the backup from being deleted. When a
   * restored database from the backup enters the `READY` state, the reference
   * to the backup is removed.
   * </pre>
   *
   * <code>repeated string referencing_databases = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the referencingDatabases.
   */
  java.util.List<java.lang.String> getReferencingDatabasesList();
  /**
   *
   *
   * <pre>
   * Output only. The names of the restored databases that reference the backup.
   * The database names are of
   * the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * Referencing databases may exist in different instances. The existence of
   * any referencing database prevents the backup from being deleted. When a
   * restored database from the backup enters the `READY` state, the reference
   * to the backup is removed.
   * </pre>
   *
   * <code>repeated string referencing_databases = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of referencingDatabases.
   */
  int getReferencingDatabasesCount();
  /**
   *
   *
   * <pre>
   * Output only. The names of the restored databases that reference the backup.
   * The database names are of
   * the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * Referencing databases may exist in different instances. The existence of
   * any referencing database prevents the backup from being deleted. When a
   * restored database from the backup enters the `READY` state, the reference
   * to the backup is removed.
   * </pre>
   *
   * <code>repeated string referencing_databases = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The referencingDatabases at the given index.
   */
  java.lang.String getReferencingDatabases(int index);
  /**
   *
   *
   * <pre>
   * Output only. The names of the restored databases that reference the backup.
   * The database names are of
   * the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`.
   * Referencing databases may exist in different instances. The existence of
   * any referencing database prevents the backup from being deleted. When a
   * restored database from the backup enters the `READY` state, the reference
   * to the backup is removed.
   * </pre>
   *
   * <code>repeated string referencing_databases = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the referencingDatabases at the given index.
   */
  com.google.protobuf.ByteString getReferencingDatabasesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * If the encryption key protecting this resource is customer managed, then
   * kms_key_version will be filled.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.EncryptionInfo encryption_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * If the encryption key protecting this resource is customer managed, then
   * kms_key_version will be filled.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.EncryptionInfo encryption_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.spanner.admin.database.v1.EncryptionInfo getEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the backup.
   * If the encryption key protecting this resource is customer managed, then
   * kms_key_version will be filled.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.EncryptionInfo encryption_info = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.spanner.admin.database.v1.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();
}
