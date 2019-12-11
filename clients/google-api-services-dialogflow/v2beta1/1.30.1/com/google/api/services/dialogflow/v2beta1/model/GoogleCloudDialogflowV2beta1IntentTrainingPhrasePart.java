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
 * Represents a part of a training phrase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The parameter name for the value extracted from the annotated part of the example.
   * This field is required for annotated parts of the training phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alias;

  /**
   * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of
   * the training phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityType;

  /**
   * Required. The text for this part.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Optional. Indicates whether the text was manually annotated. This field is set to true when the
   * Dialogflow Console is used to manually annotate the part. When creating an annotated part with
   * the API, you must set this to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean userDefined;

  /**
   * Optional. The parameter name for the value extracted from the annotated part of the example.
   * This field is required for annotated parts of the training phrase.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlias() {
    return alias;
  }

  /**
   * Optional. The parameter name for the value extracted from the annotated part of the example.
   * This field is required for annotated parts of the training phrase.
   * @param alias alias or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart setAlias(java.lang.String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of
   * the training phrase.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityType() {
    return entityType;
  }

  /**
   * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of
   * the training phrase.
   * @param entityType entityType or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Required. The text for this part.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Required. The text for this part.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Optional. Indicates whether the text was manually annotated. This field is set to true when the
   * Dialogflow Console is used to manually annotate the part. When creating an annotated part with
   * the API, you must set this to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUserDefined() {
    return userDefined;
  }

  /**
   * Optional. Indicates whether the text was manually annotated. This field is set to true when the
   * Dialogflow Console is used to manually annotate the part. When creating an annotated part with
   * the API, you must set this to true.
   * @param userDefined userDefined or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart setUserDefined(java.lang.Boolean userDefined) {
    this.userDefined = userDefined;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart clone() {
    return (GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart) super.clone();
  }

}
