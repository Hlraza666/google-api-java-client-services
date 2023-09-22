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

package com.google.api.services.composer.v1.model;

/**
 * Configuration for resources used by Airflow triggerers.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggererResource extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The number of triggerers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * Optional. CPU request and limit for a single Airflow triggerer replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float cpu;

  /**
   * Optional. Memory (GB) request and limit for a single Airflow triggerer replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float memoryGb;

  /**
   * Optional. The number of triggerers.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * Optional. The number of triggerers.
   * @param count count or {@code null} for none
   */
  public TriggererResource setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Optional. CPU request and limit for a single Airflow triggerer replica.
   * @return value or {@code null} for none
   */
  public java.lang.Float getCpu() {
    return cpu;
  }

  /**
   * Optional. CPU request and limit for a single Airflow triggerer replica.
   * @param cpu cpu or {@code null} for none
   */
  public TriggererResource setCpu(java.lang.Float cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Optional. Memory (GB) request and limit for a single Airflow triggerer replica.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMemoryGb() {
    return memoryGb;
  }

  /**
   * Optional. Memory (GB) request and limit for a single Airflow triggerer replica.
   * @param memoryGb memoryGb or {@code null} for none
   */
  public TriggererResource setMemoryGb(java.lang.Float memoryGb) {
    this.memoryGb = memoryGb;
    return this;
  }

  @Override
  public TriggererResource set(String fieldName, Object value) {
    return (TriggererResource) super.set(fieldName, value);
  }

  @Override
  public TriggererResource clone() {
    return (TriggererResource) super.clone();
  }

}