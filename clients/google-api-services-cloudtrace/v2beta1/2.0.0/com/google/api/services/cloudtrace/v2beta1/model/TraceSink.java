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

package com.google.api.services.cloudtrace.v2beta1.model;

/**
 * Describes a sink used to export traces to a BigQuery dataset. The sink must be created within a
 * project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Trace API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TraceSink extends com.google.api.client.json.GenericJson {

  /**
   * Identifier. The canonical sink resource name, unique within the project. Must be of the form:
   * projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-
   * trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following
   * characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The export destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutputConfig outputConfig;

  /**
   * Output only. A service account name for exporting the data. This field is set by sinks.create
   * and sinks.update. The service account will need to be granted write access to the destination
   * specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-
   * roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create
   * tables and to write data, this account needs the `dataEditor` role. Read more about roles in
   * the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.:
   * "service-00000001@00000002.iam.gserviceaccount.com"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writerIdentity;

  /**
   * Identifier. The canonical sink resource name, unique within the project. Must be of the form:
   * projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-
   * trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following
   * characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The canonical sink resource name, unique within the project. Must be of the form:
   * projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-
   * trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following
   * characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
   * @param name name or {@code null} for none
   */
  public TraceSink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The export destination.
   * @return value or {@code null} for none
   */
  public OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Required. The export destination.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public TraceSink setOutputConfig(OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Output only. A service account name for exporting the data. This field is set by sinks.create
   * and sinks.update. The service account will need to be granted write access to the destination
   * specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-
   * roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create
   * tables and to write data, this account needs the `dataEditor` role. Read more about roles in
   * the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.:
   * "service-00000001@00000002.iam.gserviceaccount.com"
   * @return value or {@code null} for none
   */
  public java.lang.String getWriterIdentity() {
    return writerIdentity;
  }

  /**
   * Output only. A service account name for exporting the data. This field is set by sinks.create
   * and sinks.update. The service account will need to be granted write access to the destination
   * specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-
   * roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create
   * tables and to write data, this account needs the `dataEditor` role. Read more about roles in
   * the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.:
   * "service-00000001@00000002.iam.gserviceaccount.com"
   * @param writerIdentity writerIdentity or {@code null} for none
   */
  public TraceSink setWriterIdentity(java.lang.String writerIdentity) {
    this.writerIdentity = writerIdentity;
    return this;
  }

  @Override
  public TraceSink set(String fieldName, Object value) {
    return (TraceSink) super.set(fieldName, value);
  }

  @Override
  public TraceSink clone() {
    return (TraceSink) super.clone();
  }

}
