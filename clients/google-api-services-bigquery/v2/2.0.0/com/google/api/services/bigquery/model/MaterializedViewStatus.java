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

package com.google.api.services.bigquery.model;

/**
 * Status of a materialized view. The last refresh timestamp status is omitted here, but is present
 * in the MaterializedViewDefinition message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaterializedViewStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Error result of the last automatic refresh. If present, indicates that the last
   * automatic refresh was unsuccessful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorProto lastRefreshStatus;

  /**
   * Output only. Refresh watermark of materialized view. The base tables' data were collected into
   * the materialized view cache until this time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String refreshWatermark;

  /**
   * Output only. Error result of the last automatic refresh. If present, indicates that the last
   * automatic refresh was unsuccessful.
   * @return value or {@code null} for none
   */
  public ErrorProto getLastRefreshStatus() {
    return lastRefreshStatus;
  }

  /**
   * Output only. Error result of the last automatic refresh. If present, indicates that the last
   * automatic refresh was unsuccessful.
   * @param lastRefreshStatus lastRefreshStatus or {@code null} for none
   */
  public MaterializedViewStatus setLastRefreshStatus(ErrorProto lastRefreshStatus) {
    this.lastRefreshStatus = lastRefreshStatus;
    return this;
  }

  /**
   * Output only. Refresh watermark of materialized view. The base tables' data were collected into
   * the materialized view cache until this time.
   * @return value or {@code null} for none
   */
  public String getRefreshWatermark() {
    return refreshWatermark;
  }

  /**
   * Output only. Refresh watermark of materialized view. The base tables' data were collected into
   * the materialized view cache until this time.
   * @param refreshWatermark refreshWatermark or {@code null} for none
   */
  public MaterializedViewStatus setRefreshWatermark(String refreshWatermark) {
    this.refreshWatermark = refreshWatermark;
    return this;
  }

  @Override
  public MaterializedViewStatus set(String fieldName, Object value) {
    return (MaterializedViewStatus) super.set(fieldName, value);
  }

  @Override
  public MaterializedViewStatus clone() {
    return (MaterializedViewStatus) super.clone();
  }

}
