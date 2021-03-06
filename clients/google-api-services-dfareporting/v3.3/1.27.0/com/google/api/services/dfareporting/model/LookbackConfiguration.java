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
 * Lookback configuration settings.
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
public final class LookbackConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * Lookback window, in days, from the last time a given user clicked on one of your ads. If you
   * enter 0, clicks will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer clickDuration;

  /**
   * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter
   * 0, impressions will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer postImpressionActivitiesDuration;

  /**
   * Lookback window, in days, from the last time a given user clicked on one of your ads. If you
   * enter 0, clicks will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getClickDuration() {
    return clickDuration;
  }

  /**
   * Lookback window, in days, from the last time a given user clicked on one of your ads. If you
   * enter 0, clicks will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * @param clickDuration clickDuration or {@code null} for none
   */
  public LookbackConfiguration setClickDuration(java.lang.Integer clickDuration) {
    this.clickDuration = clickDuration;
    return this;
  }

  /**
   * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter
   * 0, impressions will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPostImpressionActivitiesDuration() {
    return postImpressionActivitiesDuration;
  }

  /**
   * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter
   * 0, impressions will not be considered as triggering events for floodlight tracking. If you
   * leave this field blank, the default value for your account will be used. Acceptable values are
   * 0 to 90, inclusive.
   * @param postImpressionActivitiesDuration postImpressionActivitiesDuration or {@code null} for none
   */
  public LookbackConfiguration setPostImpressionActivitiesDuration(java.lang.Integer postImpressionActivitiesDuration) {
    this.postImpressionActivitiesDuration = postImpressionActivitiesDuration;
    return this;
  }

  @Override
  public LookbackConfiguration set(String fieldName, Object value) {
    return (LookbackConfiguration) super.set(fieldName, value);
  }

  @Override
  public LookbackConfiguration clone() {
    return (LookbackConfiguration) super.clone();
  }

}
