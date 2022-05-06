/*
 * FINBOURNE Insights API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.285
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.insights.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.insights.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Holds logged information about a request performed on an API.
 */
@ApiModel(description = "Holds logged information about a request performed on an API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestLog {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private String verb;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private String outcome;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private java.math.BigDecimal duration;

  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private Integer httpStatusCode;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_SDK_LANGUAGE = "sdkLanguage";
  @SerializedName(SERIALIZED_NAME_SDK_LANGUAGE)
  private String sdkLanguage;

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdkVersion";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  public static final String SERIALIZED_NAME_SOURCE_APPLICATION = "sourceApplication";
  @SerializedName(SERIALIZED_NAME_SOURCE_APPLICATION)
  private String sourceApplication;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private List<String> correlationId = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public RequestLog timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp; 
    return this;
  }

   /**
   * The timestamp of the request.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the request.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public RequestLog application(String application) {
    this.application = application; 
    return this;
  }

   /**
   * The name of the application that the request was made to.
   * @return application
  **/
  @ApiModelProperty(required = true, value = "The name of the application that the request was made to.")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }


  public RequestLog id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The identifier of the request.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RequestLog sessionId(String sessionId) {
    this.sessionId = sessionId; 
    return this;
  }

   /**
   * The identifier of the session that the request was made in.
   * @return sessionId
  **/
  @ApiModelProperty(value = "The identifier of the session that the request was made in.")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public RequestLog verb(String verb) {
    this.verb = verb; 
    return this;
  }

   /**
   * The HTTP verb of the request.
   * @return verb
  **/
  @ApiModelProperty(required = true, value = "The HTTP verb of the request.")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }


  public RequestLog url(String url) {
    this.url = url; 
    return this;
  }

   /**
   * The URL of the request.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL of the request.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public RequestLog domain(String domain) {
    this.domain = domain; 
    return this;
  }

   /**
   * The domain of the request.
   * @return domain
  **/
  @ApiModelProperty(value = "The domain of the request.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  public RequestLog user(String user) {
    this.user = user; 
    return this;
  }

   /**
   * The user who made the request.
   * @return user
  **/
  @ApiModelProperty(required = true, value = "The user who made the request.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public RequestLog userType(String userType) {
    this.userType = userType; 
    return this;
  }

   /**
   * The type of the user who made the request.
   * @return userType
  **/
  @ApiModelProperty(value = "The type of the user who made the request.")
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  public RequestLog operation(String operation) {
    this.operation = operation; 
    return this;
  }

   /**
   * The API operation invoked by the request.
   * @return operation
  **/
  @ApiModelProperty(value = "The API operation invoked by the request.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public RequestLog outcome(String outcome) {
    this.outcome = outcome; 
    return this;
  }

   /**
   * The outcome of the request: Success, Failure or Error.
   * @return outcome
  **/
  @ApiModelProperty(required = true, value = "The outcome of the request: Success, Failure or Error.")
  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public RequestLog duration(java.math.BigDecimal duration) {
    this.duration = duration; 
    return this;
  }

   /**
   * The duration of the request in milliseconds.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration of the request in milliseconds.")
  public java.math.BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(java.math.BigDecimal duration) {
    this.duration = duration;
  }


  public RequestLog httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode; 
    return this;
  }

   /**
   * The status code of the request.
   * @return httpStatusCode
  **/
  @ApiModelProperty(required = true, value = "The status code of the request.")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public RequestLog errorCode(String errorCode) {
    this.errorCode = errorCode; 
    return this;
  }

   /**
   * Error code, if the request had a failure or error.
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code, if the request had a failure or error.")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RequestLog sdkLanguage(String sdkLanguage) {
    this.sdkLanguage = sdkLanguage; 
    return this;
  }

   /**
   * The language of the SDK used.
   * @return sdkLanguage
  **/
  @ApiModelProperty(value = "The language of the SDK used.")
  public String getSdkLanguage() {
    return sdkLanguage;
  }

  public void setSdkLanguage(String sdkLanguage) {
    this.sdkLanguage = sdkLanguage;
  }


  public RequestLog sdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion; 
    return this;
  }

   /**
   * The version of the SDK used.
   * @return sdkVersion
  **/
  @ApiModelProperty(value = "The version of the SDK used.")
  public String getSdkVersion() {
    return sdkVersion;
  }

  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }


  public RequestLog sourceApplication(String sourceApplication) {
    this.sourceApplication = sourceApplication; 
    return this;
  }

   /**
   * The name of the application that made the request.
   * @return sourceApplication
  **/
  @ApiModelProperty(value = "The name of the application that made the request.")
  public String getSourceApplication() {
    return sourceApplication;
  }

  public void setSourceApplication(String sourceApplication) {
    this.sourceApplication = sourceApplication;
  }


  public RequestLog correlationId(List<String> correlationId) {
    this.correlationId = correlationId; 
    return this;
  }

  public RequestLog addCorrelationIdItem(String correlationIdItem) {
   
    if (this.correlationId == null) {
      this.correlationId = new ArrayList<>();
    }
    this.correlationId.add(correlationIdItem);
    return this;
  }

   /**
   * The chain of requestIds preceding this request
   * @return correlationId
  **/
  @ApiModelProperty(value = "The chain of requestIds preceding this request")
  public List<String> getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(List<String> correlationId) {
    this.correlationId = correlationId;
  }


  public RequestLog links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public RequestLog addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestLog {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    sdkLanguage: ").append(toIndentedString(sdkLanguage)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    sourceApplication: ").append(toIndentedString(sourceApplication)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
