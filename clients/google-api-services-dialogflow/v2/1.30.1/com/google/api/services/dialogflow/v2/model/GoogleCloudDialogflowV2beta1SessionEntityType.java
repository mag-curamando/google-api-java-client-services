/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents a session entity type.
 *
 * Extends or replaces a developer entity type at the user session level (we refer to the entity
 * types defined at the agent level as "developer entity types").
 *
 * Note: session entity types apply to all queries, regardless of the language.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1SessionEntityType extends com.google.api.client.json.GenericJson {

  /**
   * Required. The collection of entities associated with this session entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> entities;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1EntityTypeEntity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1EntityTypeEntity.class);
  }

  /**
   * Required. Indicates whether the additional data should override or supplement the developer
   * entity type definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityOverrideMode;

  /**
   * Required. The unique identifier of this session entity type. Format:
   * `projects//agent/sessions//entityTypes/`, or
   * `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not
   * specified, we assume default 'draft' environment. If `User ID` is not specified, we assume
   * default '-' user.
   *
   * `` must be the display name of an existing entity type in the same agent that will be
   * overridden or supplemented.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The collection of entities associated with this session entity type.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> getEntities() {
    return entities;
  }

  /**
   * Required. The collection of entities associated with this session entity type.
   * @param entities entities or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SessionEntityType setEntities(java.util.List<GoogleCloudDialogflowV2beta1EntityTypeEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * Required. Indicates whether the additional data should override or supplement the developer
   * entity type definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityOverrideMode() {
    return entityOverrideMode;
  }

  /**
   * Required. Indicates whether the additional data should override or supplement the developer
   * entity type definition.
   * @param entityOverrideMode entityOverrideMode or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SessionEntityType setEntityOverrideMode(java.lang.String entityOverrideMode) {
    this.entityOverrideMode = entityOverrideMode;
    return this;
  }

  /**
   * Required. The unique identifier of this session entity type. Format:
   * `projects//agent/sessions//entityTypes/`, or
   * `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not
   * specified, we assume default 'draft' environment. If `User ID` is not specified, we assume
   * default '-' user.
   *
   * `` must be the display name of an existing entity type in the same agent that will be
   * overridden or supplemented.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of this session entity type. Format:
   * `projects//agent/sessions//entityTypes/`, or
   * `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not
   * specified, we assume default 'draft' environment. If `User ID` is not specified, we assume
   * default '-' user.
   *
   * `` must be the display name of an existing entity type in the same agent that will be
   * overridden or supplemented.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SessionEntityType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1SessionEntityType set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1SessionEntityType) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1SessionEntityType clone() {
    return (GoogleCloudDialogflowV2beta1SessionEntityType) super.clone();
  }

}
