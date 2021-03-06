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

package com.google.api.services.pagespeedonline;

/**
 * Service definition for Pagespeedonline (v1).
 *
 * <p>
 * Analyzes the performance of a web page and provides tailored suggestions to make that page faster.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/speed/docs/insights/v1/getting_started" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PagespeedonlineRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Pagespeedonline extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.3 of the PageSpeed Insights API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "pagespeedonline/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/pagespeedonline/v1";

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
  public Pagespeedonline(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Pagespeedonline(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Pagespeedapi collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Pagespeedonline pagespeedonline = new Pagespeedonline(...);}
   *   {@code Pagespeedonline.Pagespeedapi.List request = pagespeedonline.pagespeedapi().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Pagespeedapi pagespeedapi() {
    return new Pagespeedapi();
  }

  /**
   * The "pagespeedapi" collection of methods.
   */
  public class Pagespeedapi {

    /**
     * Runs PageSpeed analysis on the page at the specified URL, and returns a PageSpeed score, a list
     * of suggestions to make that page faster, and other information.
     *
     * Create a request for the method "pagespeedapi.runpagespeed".
     *
     * This request holds the parameters needed by the pagespeedonline server.  After setting any
     * optional parameters, call the {@link Runpagespeed#execute()} method to invoke the remote
     * operation.
     *
     * @param url The URL to fetch and analyze
     * @return the request
     */
    public Runpagespeed runpagespeed(java.lang.String url) throws java.io.IOException {
      Runpagespeed result = new Runpagespeed(url);
      initialize(result);
      return result;
    }

    public class Runpagespeed extends PagespeedonlineRequest<com.google.api.services.pagespeedonline.model.Result> {

      private static final String REST_PATH = "runPagespeed";

      private final java.util.regex.Pattern URL_PATTERN =
          java.util.regex.Pattern.compile("(?i)http(s)?://.*");

      private final java.util.regex.Pattern LOCALE_PATTERN =
          java.util.regex.Pattern.compile("[a-zA-Z]+(_[a-zA-Z]+)?");

      private final java.util.regex.Pattern RULE_PATTERN =
          java.util.regex.Pattern.compile("[a-zA-Z]+");

      /**
       * Runs PageSpeed analysis on the page at the specified URL, and returns a PageSpeed score, a list
       * of suggestions to make that page faster, and other information.
       *
       * Create a request for the method "pagespeedapi.runpagespeed".
       *
       * This request holds the parameters needed by the the pagespeedonline server.  After setting any
       * optional parameters, call the {@link Runpagespeed#execute()} method to invoke the remote
       * operation. <p> {@link
       * Runpagespeed#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param url The URL to fetch and analyze
       * @since 1.13
       */
      protected Runpagespeed(java.lang.String url) {
        super(Pagespeedonline.this, "GET", REST_PATH, null, com.google.api.services.pagespeedonline.model.Result.class);
        this.url = com.google.api.client.util.Preconditions.checkNotNull(url, "Required parameter url must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(URL_PATTERN.matcher(url).matches(),
              "Parameter url must conform to the pattern " +
              "(?i)http(s)?://.*");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Runpagespeed setAlt(java.lang.String alt) {
        return (Runpagespeed) super.setAlt(alt);
      }

      @Override
      public Runpagespeed setFields(java.lang.String fields) {
        return (Runpagespeed) super.setFields(fields);
      }

      @Override
      public Runpagespeed setKey(java.lang.String key) {
        return (Runpagespeed) super.setKey(key);
      }

      @Override
      public Runpagespeed setOauthToken(java.lang.String oauthToken) {
        return (Runpagespeed) super.setOauthToken(oauthToken);
      }

      @Override
      public Runpagespeed setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Runpagespeed) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Runpagespeed setQuotaUser(java.lang.String quotaUser) {
        return (Runpagespeed) super.setQuotaUser(quotaUser);
      }

      @Override
      public Runpagespeed setUserIp(java.lang.String userIp) {
        return (Runpagespeed) super.setUserIp(userIp);
      }

      /** The URL to fetch and analyze */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /** The URL to fetch and analyze
       */
      public java.lang.String getUrl() {
        return url;
      }

      /** The URL to fetch and analyze */
      public Runpagespeed setUrl(java.lang.String url) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(URL_PATTERN.matcher(url).matches(),
              "Parameter url must conform to the pattern " +
              "(?i)http(s)?://.*");
        }
        this.url = url;
        return this;
      }

      /** Indicates if third party resources should be filtered out before PageSpeed analysis. */
      @com.google.api.client.util.Key("filter_third_party_resources")
      private java.lang.Boolean filterThirdPartyResources;

      /** Indicates if third party resources should be filtered out before PageSpeed analysis. [default:
     false]
       */
      public java.lang.Boolean getFilterThirdPartyResources() {
        return filterThirdPartyResources;
      }

      /** Indicates if third party resources should be filtered out before PageSpeed analysis. */
      public Runpagespeed setFilterThirdPartyResources(java.lang.Boolean filterThirdPartyResources) {
        this.filterThirdPartyResources = filterThirdPartyResources;
        return this;
      }

      /**
       * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
       *
       * <p>
       * Boolean properties can have four possible values:
       * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
       * or {@link Boolean#FALSE}.
       * </p>
       *
       * <p>
       * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
       * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
       * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * </p>
       *
       * <p>
       * Indicates if third party resources should be filtered out before PageSpeed analysis.
       * </p>
       */
      public boolean isFilterThirdPartyResources() {
        if (filterThirdPartyResources == null || filterThirdPartyResources == com.google.api.client.util.Data.NULL_BOOLEAN) {
          return false;
        }
        return filterThirdPartyResources;
      }

      /** The locale used to localize formatted results */
      @com.google.api.client.util.Key
      private java.lang.String locale;

      /** The locale used to localize formatted results
       */
      public java.lang.String getLocale() {
        return locale;
      }

      /** The locale used to localize formatted results */
      public Runpagespeed setLocale(java.lang.String locale) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(LOCALE_PATTERN.matcher(locale).matches(),
              "Parameter locale must conform to the pattern " +
              "[a-zA-Z]+(_[a-zA-Z]+)?");
        }
        this.locale = locale;
        return this;
      }

      /** A PageSpeed rule to run; if none are given, all rules are run */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> rule;

      /** A PageSpeed rule to run; if none are given, all rules are run
       */
      public java.util.List<java.lang.String> getRule() {
        return rule;
      }

      /** A PageSpeed rule to run; if none are given, all rules are run */
      public Runpagespeed setRule(java.util.List<java.lang.String> rule) {
        if (!getSuppressPatternChecks()) {
          for (String ruleElem : rule) {
            com.google.api.client.util.Preconditions.checkArgument(RULE_PATTERN.matcher(ruleElem).matches(),
                "Parameter rule elements must conform to the pattern " +
                "[a-zA-Z]+");
          }
        }
        this.rule = rule;
        return this;
      }

      /** Indicates if binary data containing a screenshot should be included */
      @com.google.api.client.util.Key
      private java.lang.Boolean screenshot;

      /** Indicates if binary data containing a screenshot should be included [default: false]
       */
      public java.lang.Boolean getScreenshot() {
        return screenshot;
      }

      /** Indicates if binary data containing a screenshot should be included */
      public Runpagespeed setScreenshot(java.lang.Boolean screenshot) {
        this.screenshot = screenshot;
        return this;
      }

      /**
       * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
       *
       * <p>
       * Boolean properties can have four possible values:
       * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
       * or {@link Boolean#FALSE}.
       * </p>
       *
       * <p>
       * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
       * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
       * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
       * </p>
       *
       * <p>
       * Indicates if binary data containing a screenshot should be included
       * </p>
       */
      public boolean isScreenshot() {
        if (screenshot == null || screenshot == com.google.api.client.util.Data.NULL_BOOLEAN) {
          return false;
        }
        return screenshot;
      }

      /** The analysis strategy to use */
      @com.google.api.client.util.Key
      private java.lang.String strategy;

      /** The analysis strategy to use
       */
      public java.lang.String getStrategy() {
        return strategy;
      }

      /** The analysis strategy to use */
      public Runpagespeed setStrategy(java.lang.String strategy) {
        this.strategy = strategy;
        return this;
      }

      @Override
      public Runpagespeed set(String parameterName, Object value) {
        return (Runpagespeed) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Pagespeedonline}.
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

    /** Builds a new instance of {@link Pagespeedonline}. */
    @Override
    public Pagespeedonline build() {
      return new Pagespeedonline(this);
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
     * Set the {@link PagespeedonlineRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPagespeedonlineRequestInitializer(
        PagespeedonlineRequestInitializer pagespeedonlineRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(pagespeedonlineRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
