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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * Stores settings related to Google Cloud Session Length including session duration, the type of
 * challenge (i.e. method) they should face when their session expires, and other related settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReauthSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. How long a user is allowed to take between actions before a new access token must be
   * issued. Presently only set for Cloud Apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxInactivity;

  /**
   * Optional. Reauth method when users GCP session is up.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reauthMethod;

  /**
   * Optional. The session length. Setting this field to zero is equal to disabling. Reauth. Also
   * can set infinite session by flipping the enabled bit to false below. If use_oidc_max_age is
   * true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age
   * param.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String sessionLength;

  /**
   * Optional. Big red button to turn off GCSL. When false, all fields set above will be disregarded
   * and the session length is basically infinite.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sessionLengthEnabled;

  /**
   * Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the
   * authentication request will be ignored. When true, the re-auth period will be the minimum of
   * the session_length field and the max_age OIDC param.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useOidcMaxAge;

  /**
   * Optional. How long a user is allowed to take between actions before a new access token must be
   * issued. Presently only set for Cloud Apps.
   * @return value or {@code null} for none
   */
  public String getMaxInactivity() {
    return maxInactivity;
  }

  /**
   * Optional. How long a user is allowed to take between actions before a new access token must be
   * issued. Presently only set for Cloud Apps.
   * @param maxInactivity maxInactivity or {@code null} for none
   */
  public ReauthSettings setMaxInactivity(String maxInactivity) {
    this.maxInactivity = maxInactivity;
    return this;
  }

  /**
   * Optional. Reauth method when users GCP session is up.
   * @return value or {@code null} for none
   */
  public java.lang.String getReauthMethod() {
    return reauthMethod;
  }

  /**
   * Optional. Reauth method when users GCP session is up.
   * @param reauthMethod reauthMethod or {@code null} for none
   */
  public ReauthSettings setReauthMethod(java.lang.String reauthMethod) {
    this.reauthMethod = reauthMethod;
    return this;
  }

  /**
   * Optional. The session length. Setting this field to zero is equal to disabling. Reauth. Also
   * can set infinite session by flipping the enabled bit to false below. If use_oidc_max_age is
   * true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age
   * param.
   * @return value or {@code null} for none
   */
  public String getSessionLength() {
    return sessionLength;
  }

  /**
   * Optional. The session length. Setting this field to zero is equal to disabling. Reauth. Also
   * can set infinite session by flipping the enabled bit to false below. If use_oidc_max_age is
   * true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age
   * param.
   * @param sessionLength sessionLength or {@code null} for none
   */
  public ReauthSettings setSessionLength(String sessionLength) {
    this.sessionLength = sessionLength;
    return this;
  }

  /**
   * Optional. Big red button to turn off GCSL. When false, all fields set above will be disregarded
   * and the session length is basically infinite.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSessionLengthEnabled() {
    return sessionLengthEnabled;
  }

  /**
   * Optional. Big red button to turn off GCSL. When false, all fields set above will be disregarded
   * and the session length is basically infinite.
   * @param sessionLengthEnabled sessionLengthEnabled or {@code null} for none
   */
  public ReauthSettings setSessionLengthEnabled(java.lang.Boolean sessionLengthEnabled) {
    this.sessionLengthEnabled = sessionLengthEnabled;
    return this;
  }

  /**
   * Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the
   * authentication request will be ignored. When true, the re-auth period will be the minimum of
   * the session_length field and the max_age OIDC param.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseOidcMaxAge() {
    return useOidcMaxAge;
  }

  /**
   * Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the
   * authentication request will be ignored. When true, the re-auth period will be the minimum of
   * the session_length field and the max_age OIDC param.
   * @param useOidcMaxAge useOidcMaxAge or {@code null} for none
   */
  public ReauthSettings setUseOidcMaxAge(java.lang.Boolean useOidcMaxAge) {
    this.useOidcMaxAge = useOidcMaxAge;
    return this;
  }

  @Override
  public ReauthSettings set(String fieldName, Object value) {
    return (ReauthSettings) super.set(fieldName, value);
  }

  @Override
  public ReauthSettings clone() {
    return (ReauthSettings) super.clone();
  }

}
