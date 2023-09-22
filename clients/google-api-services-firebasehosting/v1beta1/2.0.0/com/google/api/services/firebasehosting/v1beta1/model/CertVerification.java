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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A set of ACME challenges you can use to allow Hosting to create an SSL certificate for your
 * domain name before directing traffic to Hosting servers. Use either the DNS or HTTP challenge;
 * it's not necessary to provide both.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CertVerification extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A `TXT` record to add to your DNS records that confirms your intent to let Hosting
   * create an SSL cert for your domain name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DnsUpdates dns;

  /**
   * Output only. A file to add to your existing, non-Hosting hosting service that confirms your
   * intent to let Hosting create an SSL cert for your domain name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpUpdate http;

  /**
   * Output only. A `TXT` record to add to your DNS records that confirms your intent to let Hosting
   * create an SSL cert for your domain name.
   * @return value or {@code null} for none
   */
  public DnsUpdates getDns() {
    return dns;
  }

  /**
   * Output only. A `TXT` record to add to your DNS records that confirms your intent to let Hosting
   * create an SSL cert for your domain name.
   * @param dns dns or {@code null} for none
   */
  public CertVerification setDns(DnsUpdates dns) {
    this.dns = dns;
    return this;
  }

  /**
   * Output only. A file to add to your existing, non-Hosting hosting service that confirms your
   * intent to let Hosting create an SSL cert for your domain name.
   * @return value or {@code null} for none
   */
  public HttpUpdate getHttp() {
    return http;
  }

  /**
   * Output only. A file to add to your existing, non-Hosting hosting service that confirms your
   * intent to let Hosting create an SSL cert for your domain name.
   * @param http http or {@code null} for none
   */
  public CertVerification setHttp(HttpUpdate http) {
    this.http = http;
    return this;
  }

  @Override
  public CertVerification set(String fieldName, Object value) {
    return (CertVerification) super.set(fieldName, value);
  }

  @Override
  public CertVerification clone() {
    return (CertVerification) super.clone();
  }

}