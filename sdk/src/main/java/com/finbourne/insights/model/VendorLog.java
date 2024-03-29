/*
 * FINBOURNE Insights API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.661
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
 * Holds logged information about a request made to an external vendor.
 */
@ApiModel(description = "Holds logged information about a request made to an external vendor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorLog {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESTINATION_URL = "destinationUrl";
  @SerializedName(SERIALIZED_NAME_DESTINATION_URL)
  private String destinationUrl;

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

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public VendorLog id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The identifier of a log entry.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of a log entry.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public VendorLog provider(String provider) {
    this.provider = provider; 
    return this;
  }

   /**
   * The provider or service name.
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "The provider or service name.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public VendorLog timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp; 
    return this;
  }

   /**
   * Timestamp of when the log was generated.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp of when the log was generated.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public VendorLog type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * Type of log. Possible values: HttpResponse.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of log. Possible values: HttpResponse.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public VendorLog destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl; 
    return this;
  }

   /**
   * The destination URL of the task.
   * @return destinationUrl
  **/
  @ApiModelProperty(required = true, value = "The destination URL of the task.")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }


  public VendorLog operation(String operation) {
    this.operation = operation; 
    return this;
  }

   /**
   * The operation performed. Possible values: Evaluate.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The operation performed. Possible values: Evaluate.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public VendorLog outcome(String outcome) {
    this.outcome = outcome; 
    return this;
  }

   /**
   * The outcome of the operation. Possible values: Success, Failure.
   * @return outcome
  **/
  @ApiModelProperty(required = true, value = "The outcome of the operation. Possible values: Success, Failure.")
  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }


  public VendorLog duration(java.math.BigDecimal duration) {
    this.duration = duration; 
    return this;
  }

   /**
   * The duration of the operation in ms.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration of the operation in ms.")
  public java.math.BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(java.math.BigDecimal duration) {
    this.duration = duration;
  }


  public VendorLog httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode; 
    return this;
  }

   /**
   * The status code of the operation.
   * @return httpStatusCode
  **/
  @ApiModelProperty(required = true, value = "The status code of the operation.")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public VendorLog userId(String userId) {
    this.userId = userId; 
    return this;
  }

   /**
   * The user that made the request to LUSID.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The user that made the request to LUSID.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public VendorLog requestId(String requestId) {
    this.requestId = requestId; 
    return this;
  }

   /**
   * The ID of the request to LUSID.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "The ID of the request to LUSID.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public VendorLog links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public VendorLog addLinksItem(Link linksItem) {
   
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
    sb.append("class VendorLog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
