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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-02-19 at 15:39:06 UTC 
 * Modify at your own risk.
 */

package com.appenginecomparison.senddataendpoint;

/**
 * Service definition for Senddataendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link SenddataendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Senddataendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the senddataendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://compscipr.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "senddataendpoint/v1/";

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
  public Senddataendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Senddataendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getSendData".
   *
   * This request holds the parameters needed by the senddataendpoint server.  After setting any
   * optional parameters, call the {@link GetSendData#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetSendData getSendData(java.lang.String id) throws java.io.IOException {
    GetSendData result = new GetSendData(id);
    initialize(result);
    return result;
  }

  public class GetSendData extends SenddataendpointRequest<com.appenginecomparison.senddataendpoint.model.SendData> {

    private static final String REST_PATH = "senddata/{id}";

    /**
     * Create a request for the method "getSendData".
     *
     * This request holds the parameters needed by the the senddataendpoint server.  After setting any
     * optional parameters, call the {@link GetSendData#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetSendData#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetSendData(java.lang.String id) {
      super(Senddataendpoint.this, "GET", REST_PATH, null, com.appenginecomparison.senddataendpoint.model.SendData.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
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
    public GetSendData setAlt(java.lang.String alt) {
      return (GetSendData) super.setAlt(alt);
    }

    @Override
    public GetSendData setFields(java.lang.String fields) {
      return (GetSendData) super.setFields(fields);
    }

    @Override
    public GetSendData setKey(java.lang.String key) {
      return (GetSendData) super.setKey(key);
    }

    @Override
    public GetSendData setOauthToken(java.lang.String oauthToken) {
      return (GetSendData) super.setOauthToken(oauthToken);
    }

    @Override
    public GetSendData setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetSendData) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetSendData setQuotaUser(java.lang.String quotaUser) {
      return (GetSendData) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetSendData setUserIp(java.lang.String userIp) {
      return (GetSendData) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetSendData setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetSendData set(String parameterName, Object value) {
      return (GetSendData) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertSendData".
   *
   * This request holds the parameters needed by the senddataendpoint server.  After setting any
   * optional parameters, call the {@link InsertSendData#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appenginecomparison.senddataendpoint.model.SendData}
   * @return the request
   */
  public InsertSendData insertSendData(com.appenginecomparison.senddataendpoint.model.SendData content) throws java.io.IOException {
    InsertSendData result = new InsertSendData(content);
    initialize(result);
    return result;
  }

  public class InsertSendData extends SenddataendpointRequest<com.appenginecomparison.senddataendpoint.model.SendData> {

    private static final String REST_PATH = "senddata";

    /**
     * Create a request for the method "insertSendData".
     *
     * This request holds the parameters needed by the the senddataendpoint server.  After setting any
     * optional parameters, call the {@link InsertSendData#execute()} method to invoke the remote
     * operation. <p> {@link InsertSendData#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.appenginecomparison.senddataendpoint.model.SendData}
     * @since 1.13
     */
    protected InsertSendData(com.appenginecomparison.senddataendpoint.model.SendData content) {
      super(Senddataendpoint.this, "POST", REST_PATH, content, com.appenginecomparison.senddataendpoint.model.SendData.class);
    }

    @Override
    public InsertSendData setAlt(java.lang.String alt) {
      return (InsertSendData) super.setAlt(alt);
    }

    @Override
    public InsertSendData setFields(java.lang.String fields) {
      return (InsertSendData) super.setFields(fields);
    }

    @Override
    public InsertSendData setKey(java.lang.String key) {
      return (InsertSendData) super.setKey(key);
    }

    @Override
    public InsertSendData setOauthToken(java.lang.String oauthToken) {
      return (InsertSendData) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertSendData setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertSendData) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertSendData setQuotaUser(java.lang.String quotaUser) {
      return (InsertSendData) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertSendData setUserIp(java.lang.String userIp) {
      return (InsertSendData) super.setUserIp(userIp);
    }

    @Override
    public InsertSendData set(String parameterName, Object value) {
      return (InsertSendData) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listSendData".
   *
   * This request holds the parameters needed by the senddataendpoint server.  After setting any
   * optional parameters, call the {@link ListSendData#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListSendData listSendData() throws java.io.IOException {
    ListSendData result = new ListSendData();
    initialize(result);
    return result;
  }

  public class ListSendData extends SenddataendpointRequest<com.appenginecomparison.senddataendpoint.model.CollectionResponseSendData> {

    private static final String REST_PATH = "senddata";

    /**
     * Create a request for the method "listSendData".
     *
     * This request holds the parameters needed by the the senddataendpoint server.  After setting any
     * optional parameters, call the {@link ListSendData#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListSendData#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListSendData() {
      super(Senddataendpoint.this, "GET", REST_PATH, null, com.appenginecomparison.senddataendpoint.model.CollectionResponseSendData.class);
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
    public ListSendData setAlt(java.lang.String alt) {
      return (ListSendData) super.setAlt(alt);
    }

    @Override
    public ListSendData setFields(java.lang.String fields) {
      return (ListSendData) super.setFields(fields);
    }

    @Override
    public ListSendData setKey(java.lang.String key) {
      return (ListSendData) super.setKey(key);
    }

    @Override
    public ListSendData setOauthToken(java.lang.String oauthToken) {
      return (ListSendData) super.setOauthToken(oauthToken);
    }

    @Override
    public ListSendData setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListSendData) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListSendData setQuotaUser(java.lang.String quotaUser) {
      return (ListSendData) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListSendData setUserIp(java.lang.String userIp) {
      return (ListSendData) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListSendData setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListSendData setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListSendData set(String parameterName, Object value) {
      return (ListSendData) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeSendData".
   *
   * This request holds the parameters needed by the senddataendpoint server.  After setting any
   * optional parameters, call the {@link RemoveSendData#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveSendData removeSendData(java.lang.String id) throws java.io.IOException {
    RemoveSendData result = new RemoveSendData(id);
    initialize(result);
    return result;
  }

  public class RemoveSendData extends SenddataendpointRequest<Void> {

    private static final String REST_PATH = "senddata/{id}";

    /**
     * Create a request for the method "removeSendData".
     *
     * This request holds the parameters needed by the the senddataendpoint server.  After setting any
     * optional parameters, call the {@link RemoveSendData#execute()} method to invoke the remote
     * operation. <p> {@link RemoveSendData#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveSendData(java.lang.String id) {
      super(Senddataendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveSendData setAlt(java.lang.String alt) {
      return (RemoveSendData) super.setAlt(alt);
    }

    @Override
    public RemoveSendData setFields(java.lang.String fields) {
      return (RemoveSendData) super.setFields(fields);
    }

    @Override
    public RemoveSendData setKey(java.lang.String key) {
      return (RemoveSendData) super.setKey(key);
    }

    @Override
    public RemoveSendData setOauthToken(java.lang.String oauthToken) {
      return (RemoveSendData) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveSendData setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveSendData) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveSendData setQuotaUser(java.lang.String quotaUser) {
      return (RemoveSendData) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveSendData setUserIp(java.lang.String userIp) {
      return (RemoveSendData) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveSendData setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveSendData set(String parameterName, Object value) {
      return (RemoveSendData) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateSendData".
   *
   * This request holds the parameters needed by the senddataendpoint server.  After setting any
   * optional parameters, call the {@link UpdateSendData#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appenginecomparison.senddataendpoint.model.SendData}
   * @return the request
   */
  public UpdateSendData updateSendData(com.appenginecomparison.senddataendpoint.model.SendData content) throws java.io.IOException {
    UpdateSendData result = new UpdateSendData(content);
    initialize(result);
    return result;
  }

  public class UpdateSendData extends SenddataendpointRequest<com.appenginecomparison.senddataendpoint.model.SendData> {

    private static final String REST_PATH = "senddata";

    /**
     * Create a request for the method "updateSendData".
     *
     * This request holds the parameters needed by the the senddataendpoint server.  After setting any
     * optional parameters, call the {@link UpdateSendData#execute()} method to invoke the remote
     * operation. <p> {@link UpdateSendData#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.appenginecomparison.senddataendpoint.model.SendData}
     * @since 1.13
     */
    protected UpdateSendData(com.appenginecomparison.senddataendpoint.model.SendData content) {
      super(Senddataendpoint.this, "PUT", REST_PATH, content, com.appenginecomparison.senddataendpoint.model.SendData.class);
    }

    @Override
    public UpdateSendData setAlt(java.lang.String alt) {
      return (UpdateSendData) super.setAlt(alt);
    }

    @Override
    public UpdateSendData setFields(java.lang.String fields) {
      return (UpdateSendData) super.setFields(fields);
    }

    @Override
    public UpdateSendData setKey(java.lang.String key) {
      return (UpdateSendData) super.setKey(key);
    }

    @Override
    public UpdateSendData setOauthToken(java.lang.String oauthToken) {
      return (UpdateSendData) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateSendData setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateSendData) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateSendData setQuotaUser(java.lang.String quotaUser) {
      return (UpdateSendData) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateSendData setUserIp(java.lang.String userIp) {
      return (UpdateSendData) super.setUserIp(userIp);
    }

    @Override
    public UpdateSendData set(String parameterName, Object value) {
      return (UpdateSendData) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Senddataendpoint}.
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
    }

    /** Builds a new instance of {@link Senddataendpoint}. */
    @Override
    public Senddataendpoint build() {
      return new Senddataendpoint(this);
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
     * Set the {@link SenddataendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setSenddataendpointRequestInitializer(
        SenddataendpointRequestInitializer senddataendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(senddataendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}