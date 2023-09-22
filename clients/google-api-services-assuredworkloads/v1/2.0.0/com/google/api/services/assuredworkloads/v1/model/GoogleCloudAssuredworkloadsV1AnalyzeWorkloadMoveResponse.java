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

package com.google.api.services.assuredworkloads.v1.model;

/**
 * Response containing the analysis results for the hypothetical resource move.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of analysis results for each asset in scope.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAssuredworkloadsV1AssetMoveAnalysis> assetMoveAnalyses;

  /**
   * The next page token. Is empty if the last page is reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of analysis results for each asset in scope.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAssuredworkloadsV1AssetMoveAnalysis> getAssetMoveAnalyses() {
    return assetMoveAnalyses;
  }

  /**
   * List of analysis results for each asset in scope.
   * @param assetMoveAnalyses assetMoveAnalyses or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse setAssetMoveAnalyses(java.util.List<GoogleCloudAssuredworkloadsV1AssetMoveAnalysis> assetMoveAnalyses) {
    this.assetMoveAnalyses = assetMoveAnalyses;
    return this;
  }

  /**
   * The next page token. Is empty if the last page is reached.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The next page token. Is empty if the last page is reached.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse clone() {
    return (GoogleCloudAssuredworkloadsV1AnalyzeWorkloadMoveResponse) super.clone();
  }

}