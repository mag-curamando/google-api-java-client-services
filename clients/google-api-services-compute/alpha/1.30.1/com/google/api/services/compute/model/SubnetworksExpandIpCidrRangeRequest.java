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

package com.google.api.services.compute.model;

/**
 * Model definition for SubnetworksExpandIpCidrRangeRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubnetworksExpandIpCidrRangeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   * This range should be disjoint from other subnetworks within this network. This range can only
   * be larger than (i.e. a superset of) the range previously defined before the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * The type of IP CIDR range to associate with this subnetwork. The default is RFC_1918. When
   * expanding to a non-RFC 1918 range, this field must be be set to NON_RFC_1918.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rangeType;

  /**
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   * This range should be disjoint from other subnetworks within this network. This range can only
   * be larger than (i.e. a superset of) the range previously defined before the update.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork.
   * This range should be disjoint from other subnetworks within this network. This range can only
   * be larger than (i.e. a superset of) the range previously defined before the update.
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public SubnetworksExpandIpCidrRangeRequest setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * The type of IP CIDR range to associate with this subnetwork. The default is RFC_1918. When
   * expanding to a non-RFC 1918 range, this field must be be set to NON_RFC_1918.
   * @return value or {@code null} for none
   */
  public java.lang.String getRangeType() {
    return rangeType;
  }

  /**
   * The type of IP CIDR range to associate with this subnetwork. The default is RFC_1918. When
   * expanding to a non-RFC 1918 range, this field must be be set to NON_RFC_1918.
   * @param rangeType rangeType or {@code null} for none
   */
  public SubnetworksExpandIpCidrRangeRequest setRangeType(java.lang.String rangeType) {
    this.rangeType = rangeType;
    return this;
  }

  @Override
  public SubnetworksExpandIpCidrRangeRequest set(String fieldName, Object value) {
    return (SubnetworksExpandIpCidrRangeRequest) super.set(fieldName, value);
  }

  @Override
  public SubnetworksExpandIpCidrRangeRequest clone() {
    return (SubnetworksExpandIpCidrRangeRequest) super.clone();
  }

}
