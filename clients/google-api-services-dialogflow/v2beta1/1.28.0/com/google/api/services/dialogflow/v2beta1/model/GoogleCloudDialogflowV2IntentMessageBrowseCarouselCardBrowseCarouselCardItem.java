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
 * Browsing carousel tile
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Description of the carousel item. Maximum of four lines of text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of
   * text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String footer;

  /**
   * Optional. Hero image for the carousel item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageImage image;

  /**
   * Required. Action to present to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction openUriAction;

  /**
   * Required. Title of the carousel item. Maximum of two lines of text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. Description of the carousel item. Maximum of four lines of text.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the carousel item. Maximum of four lines of text.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of
   * text.
   * @return value or {@code null} for none
   */
  public java.lang.String getFooter() {
    return footer;
  }

  /**
   * Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of
   * text.
   * @param footer footer or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem setFooter(java.lang.String footer) {
    this.footer = footer;
    return this;
  }

  /**
   * Optional. Hero image for the carousel item.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageImage getImage() {
    return image;
  }

  /**
   * Optional. Hero image for the carousel item.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem setImage(GoogleCloudDialogflowV2IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Required. Action to present to the user.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction getOpenUriAction() {
    return openUriAction;
  }

  /**
   * Required. Action to present to the user.
   * @param openUriAction openUriAction or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem setOpenUriAction(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlAction openUriAction) {
    this.openUriAction = openUriAction;
    return this;
  }

  /**
   * Required. Title of the carousel item. Maximum of two lines of text.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Title of the carousel item. Maximum of two lines of text.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem clone() {
    return (GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem) super.clone();
  }

}
