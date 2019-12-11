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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The response message for EntityTypes.ListEntityTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1ListEntityTypesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of agent entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2beta1EntityType> entityTypes;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2beta1EntityType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2beta1EntityType.class);
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of agent entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2beta1EntityType> getEntityTypes() {
    return entityTypes;
  }

  /**
   * The list of agent entity types. There will be a maximum number of items returned based on the
   * page_size field in the request.
   * @param entityTypes entityTypes or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ListEntityTypesResponse setEntityTypes(java.util.List<GoogleCloudDialogflowV2beta1EntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ListEntityTypesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1ListEntityTypesResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1ListEntityTypesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1ListEntityTypesResponse clone() {
    return (GoogleCloudDialogflowV2beta1ListEntityTypesResponse) super.clone();
  }

}
