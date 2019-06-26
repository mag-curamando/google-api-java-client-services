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

package com.google.api.services.dfareporting.model;

/**
 * Event Tag List Response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventTagsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Event tag collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventTag> eventTags;

  static {
    // hack to force ProGuard to consider EventTag used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EventTag.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#eventTagsListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Event tag collection.
   * @return value or {@code null} for none
   */
  public java.util.List<EventTag> getEventTags() {
    return eventTags;
  }

  /**
   * Event tag collection.
   * @param eventTags eventTags or {@code null} for none
   */
  public EventTagsListResponse setEventTags(java.util.List<EventTag> eventTags) {
    this.eventTags = eventTags;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#eventTagsListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#eventTagsListResponse".
   * @param kind kind or {@code null} for none
   */
  public EventTagsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public EventTagsListResponse set(String fieldName, Object value) {
    return (EventTagsListResponse) super.set(fieldName, value);
  }

  @Override
  public EventTagsListResponse clone() {
    return (EventTagsListResponse) super.clone();
  }

}
