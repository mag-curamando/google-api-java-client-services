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

package com.google.api.services.verifiedaccess.v1;

/**
 * Service definition for Verifiedaccess (v1).
 *
 * <p>
 * API for Verified Access chrome extension to provide credential verification for chrome devices connecting to an enterprise network
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://www.google.com/work/chrome/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link VerifiedaccessRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Verifiedaccess extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.28.0 of the Verified Access API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://verifiedaccess.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Verifiedaccess(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Verifiedaccess(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Challenge collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Verifiedaccess verifiedaccess = new Verifiedaccess(...);}
   *   {@code Verifiedaccess.Challenge.List request = verifiedaccess.challenge().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Challenge challenge() {
    return new Challenge();
  }

  /**
   * The "challenge" collection of methods.
   */
  public class Challenge {

    /**
     * CreateChallenge API
     *
     * Create a request for the method "challenge.create".
     *
     * This request holds the parameters needed by the verifiedaccess server.  After setting any
     * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.verifiedaccess.v1.model.Empty}
     * @return the request
     */
    public Create create(com.google.api.services.verifiedaccess.v1.model.Empty content) throws java.io.IOException {
      Create result = new Create(content);
      initialize(result);
      return result;
    }

    public class Create extends VerifiedaccessRequest<com.google.api.services.verifiedaccess.v1.model.Challenge> {

      private static final String REST_PATH = "v1/challenge";

      /**
       * CreateChallenge API
       *
       * Create a request for the method "challenge.create".
       *
       * This request holds the parameters needed by the the verifiedaccess server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       * <p> {@link
       * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.verifiedaccess.v1.model.Empty}
       * @since 1.13
       */
      protected Create(com.google.api.services.verifiedaccess.v1.model.Empty content) {
        super(Verifiedaccess.this, "POST", REST_PATH, content, com.google.api.services.verifiedaccess.v1.model.Challenge.class);
      }

      @Override
      public Create set$Xgafv(java.lang.String $Xgafv) {
        return (Create) super.set$Xgafv($Xgafv);
      }

      @Override
      public Create setAccessToken(java.lang.String accessToken) {
        return (Create) super.setAccessToken(accessToken);
      }

      @Override
      public Create setAlt(java.lang.String alt) {
        return (Create) super.setAlt(alt);
      }

      @Override
      public Create setCallback(java.lang.String callback) {
        return (Create) super.setCallback(callback);
      }

      @Override
      public Create setFields(java.lang.String fields) {
        return (Create) super.setFields(fields);
      }

      @Override
      public Create setKey(java.lang.String key) {
        return (Create) super.setKey(key);
      }

      @Override
      public Create setOauthToken(java.lang.String oauthToken) {
        return (Create) super.setOauthToken(oauthToken);
      }

      @Override
      public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Create) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Create setQuotaUser(java.lang.String quotaUser) {
        return (Create) super.setQuotaUser(quotaUser);
      }

      @Override
      public Create setUploadType(java.lang.String uploadType) {
        return (Create) super.setUploadType(uploadType);
      }

      @Override
      public Create setUploadProtocol(java.lang.String uploadProtocol) {
        return (Create) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Create set(String parameterName, Object value) {
        return (Create) super.set(parameterName, value);
      }
    }
    /**
     * VerifyChallengeResponse API
     *
     * Create a request for the method "challenge.verify".
     *
     * This request holds the parameters needed by the verifiedaccess server.  After setting any
     * optional parameters, call the {@link Verify#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseRequest}
     * @return the request
     */
    public Verify verify(com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseRequest content) throws java.io.IOException {
      Verify result = new Verify(content);
      initialize(result);
      return result;
    }

    public class Verify extends VerifiedaccessRequest<com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseResult> {

      private static final String REST_PATH = "v1/challenge:verify";

      /**
       * VerifyChallengeResponse API
       *
       * Create a request for the method "challenge.verify".
       *
       * This request holds the parameters needed by the the verifiedaccess server.  After setting any
       * optional parameters, call the {@link Verify#execute()} method to invoke the remote operation.
       * <p> {@link
       * Verify#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseRequest}
       * @since 1.13
       */
      protected Verify(com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseRequest content) {
        super(Verifiedaccess.this, "POST", REST_PATH, content, com.google.api.services.verifiedaccess.v1.model.VerifyChallengeResponseResult.class);
      }

      @Override
      public Verify set$Xgafv(java.lang.String $Xgafv) {
        return (Verify) super.set$Xgafv($Xgafv);
      }

      @Override
      public Verify setAccessToken(java.lang.String accessToken) {
        return (Verify) super.setAccessToken(accessToken);
      }

      @Override
      public Verify setAlt(java.lang.String alt) {
        return (Verify) super.setAlt(alt);
      }

      @Override
      public Verify setCallback(java.lang.String callback) {
        return (Verify) super.setCallback(callback);
      }

      @Override
      public Verify setFields(java.lang.String fields) {
        return (Verify) super.setFields(fields);
      }

      @Override
      public Verify setKey(java.lang.String key) {
        return (Verify) super.setKey(key);
      }

      @Override
      public Verify setOauthToken(java.lang.String oauthToken) {
        return (Verify) super.setOauthToken(oauthToken);
      }

      @Override
      public Verify setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Verify) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Verify setQuotaUser(java.lang.String quotaUser) {
        return (Verify) super.setQuotaUser(quotaUser);
      }

      @Override
      public Verify setUploadType(java.lang.String uploadType) {
        return (Verify) super.setUploadType(uploadType);
      }

      @Override
      public Verify setUploadProtocol(java.lang.String uploadProtocol) {
        return (Verify) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Verify set(String parameterName, Object value) {
        return (Verify) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Verifiedaccess}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Verifiedaccess}. */
    @Override
    public Verifiedaccess build() {
      return new Verifiedaccess(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link VerifiedaccessRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setVerifiedaccessRequestInitializer(
        VerifiedaccessRequestInitializer verifiedaccessRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(verifiedaccessRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
