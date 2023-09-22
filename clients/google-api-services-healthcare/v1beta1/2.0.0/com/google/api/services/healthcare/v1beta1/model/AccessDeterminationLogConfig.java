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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Configures consent audit log config for FHIR create, read, update, and delete (CRUD) operations.
 * Cloud audit log for healthcare API must be [enabled](https://cloud.google.com/logging/docs/audit
 * /configure-data-access#config-console-enable). The consent-related logs are included as part of
 * `protoPayload.metadata`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessDeterminationLogConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Controls the amount of detail to include as part of the audit logs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logLevel;

  /**
   * Optional. Controls the amount of detail to include as part of the audit logs.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogLevel() {
    return logLevel;
  }

  /**
   * Optional. Controls the amount of detail to include as part of the audit logs.
   * @param logLevel logLevel or {@code null} for none
   */
  public AccessDeterminationLogConfig setLogLevel(java.lang.String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  @Override
  public AccessDeterminationLogConfig set(String fieldName, Object value) {
    return (AccessDeterminationLogConfig) super.set(fieldName, value);
  }

  @Override
  public AccessDeterminationLogConfig clone() {
    return (AccessDeterminationLogConfig) super.clone();
  }

}