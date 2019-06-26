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
 * Creative Group Assignment.
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
public final class CreativeGroupAssignment extends com.google.api.client.json.GenericJson {

  /**
   * ID of the creative group to be assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creativeGroupId;

  /**
   * Creative group number of the creative group assignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeGroupNumber;

  /**
   * ID of the creative group to be assigned.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreativeGroupId() {
    return creativeGroupId;
  }

  /**
   * ID of the creative group to be assigned.
   * @param creativeGroupId creativeGroupId or {@code null} for none
   */
  public CreativeGroupAssignment setCreativeGroupId(java.lang.Long creativeGroupId) {
    this.creativeGroupId = creativeGroupId;
    return this;
  }

  /**
   * Creative group number of the creative group assignment.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeGroupNumber() {
    return creativeGroupNumber;
  }

  /**
   * Creative group number of the creative group assignment.
   * @param creativeGroupNumber creativeGroupNumber or {@code null} for none
   */
  public CreativeGroupAssignment setCreativeGroupNumber(java.lang.String creativeGroupNumber) {
    this.creativeGroupNumber = creativeGroupNumber;
    return this;
  }

  @Override
  public CreativeGroupAssignment set(String fieldName, Object value) {
    return (CreativeGroupAssignment) super.set(fieldName, value);
  }

  @Override
  public CreativeGroupAssignment clone() {
    return (CreativeGroupAssignment) super.clone();
  }

}
