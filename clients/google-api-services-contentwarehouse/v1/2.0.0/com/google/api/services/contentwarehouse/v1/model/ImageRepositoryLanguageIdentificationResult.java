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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Model definition for ImageRepositoryLanguageIdentificationResult.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageRepositoryLanguageIdentificationResult extends com.google.api.client.json.GenericJson {

  /**
   * Whether the locale got stripped from the original result before further processing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean localeStripped;

  /**
   * From cs/symbol:speech.s3.LanguageIdentificationResult owned by go/s3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String s3TopLocale;

  /**
   * From cs/symbol:video_platform.operation.AudioLanguage owned gy go/ytcaps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ytCapsAudioLanguage;

  /**
   * Whether the locale got stripped from the original result before further processing.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLocaleStripped() {
    return localeStripped;
  }

  /**
   * Whether the locale got stripped from the original result before further processing.
   * @param localeStripped localeStripped or {@code null} for none
   */
  public ImageRepositoryLanguageIdentificationResult setLocaleStripped(java.lang.Boolean localeStripped) {
    this.localeStripped = localeStripped;
    return this;
  }

  /**
   * From cs/symbol:speech.s3.LanguageIdentificationResult owned by go/s3.
   * @return value or {@code null} for none
   */
  public java.lang.String getS3TopLocale() {
    return s3TopLocale;
  }

  /**
   * From cs/symbol:speech.s3.LanguageIdentificationResult owned by go/s3.
   * @param s3TopLocale s3TopLocale or {@code null} for none
   */
  public ImageRepositoryLanguageIdentificationResult setS3TopLocale(java.lang.String s3TopLocale) {
    this.s3TopLocale = s3TopLocale;
    return this;
  }

  /**
   * From cs/symbol:video_platform.operation.AudioLanguage owned gy go/ytcaps.
   * @return value or {@code null} for none
   */
  public java.lang.String getYtCapsAudioLanguage() {
    return ytCapsAudioLanguage;
  }

  /**
   * From cs/symbol:video_platform.operation.AudioLanguage owned gy go/ytcaps.
   * @param ytCapsAudioLanguage ytCapsAudioLanguage or {@code null} for none
   */
  public ImageRepositoryLanguageIdentificationResult setYtCapsAudioLanguage(java.lang.String ytCapsAudioLanguage) {
    this.ytCapsAudioLanguage = ytCapsAudioLanguage;
    return this;
  }

  @Override
  public ImageRepositoryLanguageIdentificationResult set(String fieldName, Object value) {
    return (ImageRepositoryLanguageIdentificationResult) super.set(fieldName, value);
  }

  @Override
  public ImageRepositoryLanguageIdentificationResult clone() {
    return (ImageRepositoryLanguageIdentificationResult) super.clone();
  }

}