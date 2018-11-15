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

package com.google.api.services.appengine.model;

/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutomaticScaling extends com.google.api.client.json.GenericJson {

  /**
   * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should
   * wait before it starts collecting information from a new instance. This prevents the autoscaler
   * from collecting information when the instance is initializing, during which the collected usage
   * would not be reliable. Only applicable in the App Engine flexible environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String coolDownPeriod;

  /**
   * Target scaling by CPU usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CpuUtilization cpuUtilization;

  /**
   * Target scaling by user-provided metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomMetric> customMetrics;

  static {
    // hack to force ProGuard to consider CustomMetric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomMetric.class);
  }

  /**
   * Target scaling by disk usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskUtilization diskUtilization;

  /**
   * Number of concurrent requests an automatic scaling instance can accept before the scheduler
   * spawns a new instance.Defaults to a runtime-specific value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxConcurrentRequests;

  /**
   * Maximum number of idle instances that should be maintained for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxIdleInstances;

  /**
   * Maximum amount of time that a request should wait in the pending queue before starting a new
   * instance to handle it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxPendingLatency;

  /**
   * Maximum number of instances that should be started to handle requests for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxTotalInstances;

  /**
   * Minimum number of idle instances that should be maintained for this version. Only applicable
   * for the default version of a service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minIdleInstances;

  /**
   * Minimum amount of time a request should wait in the pending queue before starting a new
   * instance to handle it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minPendingLatency;

  /**
   * Minimum number of running instances that should be maintained for this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minTotalInstances;

  /**
   * Target scaling by network usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkUtilization networkUtilization;

  /**
   * Target scaling by request utilization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestUtilization requestUtilization;

  /**
   * Scheduler settings for standard environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StandardSchedulerSettings standardSchedulerSettings;

  /**
   * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should
   * wait before it starts collecting information from a new instance. This prevents the autoscaler
   * from collecting information when the instance is initializing, during which the collected usage
   * would not be reliable. Only applicable in the App Engine flexible environment.
   * @return value or {@code null} for none
   */
  public String getCoolDownPeriod() {
    return coolDownPeriod;
  }

  /**
   * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should
   * wait before it starts collecting information from a new instance. This prevents the autoscaler
   * from collecting information when the instance is initializing, during which the collected usage
   * would not be reliable. Only applicable in the App Engine flexible environment.
   * @param coolDownPeriod coolDownPeriod or {@code null} for none
   */
  public AutomaticScaling setCoolDownPeriod(String coolDownPeriod) {
    this.coolDownPeriod = coolDownPeriod;
    return this;
  }

  /**
   * Target scaling by CPU usage.
   * @return value or {@code null} for none
   */
  public CpuUtilization getCpuUtilization() {
    return cpuUtilization;
  }

  /**
   * Target scaling by CPU usage.
   * @param cpuUtilization cpuUtilization or {@code null} for none
   */
  public AutomaticScaling setCpuUtilization(CpuUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
    return this;
  }

  /**
   * Target scaling by user-provided metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomMetric> getCustomMetrics() {
    return customMetrics;
  }

  /**
   * Target scaling by user-provided metrics.
   * @param customMetrics customMetrics or {@code null} for none
   */
  public AutomaticScaling setCustomMetrics(java.util.List<CustomMetric> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  /**
   * Target scaling by disk usage.
   * @return value or {@code null} for none
   */
  public DiskUtilization getDiskUtilization() {
    return diskUtilization;
  }

  /**
   * Target scaling by disk usage.
   * @param diskUtilization diskUtilization or {@code null} for none
   */
  public AutomaticScaling setDiskUtilization(DiskUtilization diskUtilization) {
    this.diskUtilization = diskUtilization;
    return this;
  }

  /**
   * Number of concurrent requests an automatic scaling instance can accept before the scheduler
   * spawns a new instance.Defaults to a runtime-specific value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxConcurrentRequests() {
    return maxConcurrentRequests;
  }

  /**
   * Number of concurrent requests an automatic scaling instance can accept before the scheduler
   * spawns a new instance.Defaults to a runtime-specific value.
   * @param maxConcurrentRequests maxConcurrentRequests or {@code null} for none
   */
  public AutomaticScaling setMaxConcurrentRequests(java.lang.Integer maxConcurrentRequests) {
    this.maxConcurrentRequests = maxConcurrentRequests;
    return this;
  }

  /**
   * Maximum number of idle instances that should be maintained for this version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxIdleInstances() {
    return maxIdleInstances;
  }

  /**
   * Maximum number of idle instances that should be maintained for this version.
   * @param maxIdleInstances maxIdleInstances or {@code null} for none
   */
  public AutomaticScaling setMaxIdleInstances(java.lang.Integer maxIdleInstances) {
    this.maxIdleInstances = maxIdleInstances;
    return this;
  }

  /**
   * Maximum amount of time that a request should wait in the pending queue before starting a new
   * instance to handle it.
   * @return value or {@code null} for none
   */
  public String getMaxPendingLatency() {
    return maxPendingLatency;
  }

  /**
   * Maximum amount of time that a request should wait in the pending queue before starting a new
   * instance to handle it.
   * @param maxPendingLatency maxPendingLatency or {@code null} for none
   */
  public AutomaticScaling setMaxPendingLatency(String maxPendingLatency) {
    this.maxPendingLatency = maxPendingLatency;
    return this;
  }

  /**
   * Maximum number of instances that should be started to handle requests for this version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxTotalInstances() {
    return maxTotalInstances;
  }

  /**
   * Maximum number of instances that should be started to handle requests for this version.
   * @param maxTotalInstances maxTotalInstances or {@code null} for none
   */
  public AutomaticScaling setMaxTotalInstances(java.lang.Integer maxTotalInstances) {
    this.maxTotalInstances = maxTotalInstances;
    return this;
  }

  /**
   * Minimum number of idle instances that should be maintained for this version. Only applicable
   * for the default version of a service.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinIdleInstances() {
    return minIdleInstances;
  }

  /**
   * Minimum number of idle instances that should be maintained for this version. Only applicable
   * for the default version of a service.
   * @param minIdleInstances minIdleInstances or {@code null} for none
   */
  public AutomaticScaling setMinIdleInstances(java.lang.Integer minIdleInstances) {
    this.minIdleInstances = minIdleInstances;
    return this;
  }

  /**
   * Minimum amount of time a request should wait in the pending queue before starting a new
   * instance to handle it.
   * @return value or {@code null} for none
   */
  public String getMinPendingLatency() {
    return minPendingLatency;
  }

  /**
   * Minimum amount of time a request should wait in the pending queue before starting a new
   * instance to handle it.
   * @param minPendingLatency minPendingLatency or {@code null} for none
   */
  public AutomaticScaling setMinPendingLatency(String minPendingLatency) {
    this.minPendingLatency = minPendingLatency;
    return this;
  }

  /**
   * Minimum number of running instances that should be maintained for this version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinTotalInstances() {
    return minTotalInstances;
  }

  /**
   * Minimum number of running instances that should be maintained for this version.
   * @param minTotalInstances minTotalInstances or {@code null} for none
   */
  public AutomaticScaling setMinTotalInstances(java.lang.Integer minTotalInstances) {
    this.minTotalInstances = minTotalInstances;
    return this;
  }

  /**
   * Target scaling by network usage.
   * @return value or {@code null} for none
   */
  public NetworkUtilization getNetworkUtilization() {
    return networkUtilization;
  }

  /**
   * Target scaling by network usage.
   * @param networkUtilization networkUtilization or {@code null} for none
   */
  public AutomaticScaling setNetworkUtilization(NetworkUtilization networkUtilization) {
    this.networkUtilization = networkUtilization;
    return this;
  }

  /**
   * Target scaling by request utilization.
   * @return value or {@code null} for none
   */
  public RequestUtilization getRequestUtilization() {
    return requestUtilization;
  }

  /**
   * Target scaling by request utilization.
   * @param requestUtilization requestUtilization or {@code null} for none
   */
  public AutomaticScaling setRequestUtilization(RequestUtilization requestUtilization) {
    this.requestUtilization = requestUtilization;
    return this;
  }

  /**
   * Scheduler settings for standard environment.
   * @return value or {@code null} for none
   */
  public StandardSchedulerSettings getStandardSchedulerSettings() {
    return standardSchedulerSettings;
  }

  /**
   * Scheduler settings for standard environment.
   * @param standardSchedulerSettings standardSchedulerSettings or {@code null} for none
   */
  public AutomaticScaling setStandardSchedulerSettings(StandardSchedulerSettings standardSchedulerSettings) {
    this.standardSchedulerSettings = standardSchedulerSettings;
    return this;
  }

  @Override
  public AutomaticScaling set(String fieldName, Object value) {
    return (AutomaticScaling) super.set(fieldName, value);
  }

  @Override
  public AutomaticScaling clone() {
    return (AutomaticScaling) super.clone();
  }

}