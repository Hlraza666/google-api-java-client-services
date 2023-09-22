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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * The bundle details for a line item corresponding to a hard bundle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionLineItemBundleDetails extends com.google.api.client.json.GenericJson {

  /**
   * The details for each element in the hard bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemBundleDetailsBundleElementDetails> bundleElementDetails;

  static {
    // hack to force ProGuard to consider GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemBundleDetailsBundleElementDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemBundleDetailsBundleElementDetails.class);
  }

  /**
   * The details for each element in the hard bundle.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemBundleDetailsBundleElementDetails> getBundleElementDetails() {
    return bundleElementDetails;
  }

  /**
   * The details for each element in the hard bundle.
   * @param bundleElementDetails bundleElementDetails or {@code null} for none
   */
  public SubscriptionLineItemBundleDetails setBundleElementDetails(java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemBundleDetailsBundleElementDetails> bundleElementDetails) {
    this.bundleElementDetails = bundleElementDetails;
    return this;
  }

  @Override
  public SubscriptionLineItemBundleDetails set(String fieldName, Object value) {
    return (SubscriptionLineItemBundleDetails) super.set(fieldName, value);
  }

  @Override
  public SubscriptionLineItemBundleDetails clone() {
    return (SubscriptionLineItemBundleDetails) super.clone();
  }

}