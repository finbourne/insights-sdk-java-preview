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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DTO of Finbourne.AspNetCore.Http.TrackingEntry.ResponseInformation.
 */
@ApiModel(description = "DTO of Finbourne.AspNetCore.Http.TrackingEntry.ResponseInformation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Response {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, List<String>> headers = null;

  public static final String SERIALIZED_NAME_CONTENT_LENGTH = "contentLength";
  @SerializedName(SERIALIZED_NAME_CONTENT_LENGTH)
  private Long contentLength;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_BODY_WAS_TRUNCATED = "bodyWasTruncated";
  @SerializedName(SERIALIZED_NAME_BODY_WAS_TRUNCATED)
  private Boolean bodyWasTruncated;

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Response headers(Map<String, List<String>> headers) {
    this.headers = headers; 
    return this;
  }

  public Response putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * The headers
   * @return headers
  **/
  @ApiModelProperty(value = "The headers")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }


  public Response contentLength(Long contentLength) {
    this.contentLength = contentLength; 
    return this;
  }

   /**
   * The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Response.Body  (e.g. if actual Body is large, or not convertible to a string)
   * @return contentLength
  **/
  @ApiModelProperty(value = "The actual length of the body, which may be larger than the data recorded in Finbourne.Insights.WebApi.Dtos.Response.Body  (e.g. if actual Body is large, or not convertible to a string)")
  public Long getContentLength() {
    return contentLength;
  }

  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }


  public Response contentType(String contentType) {
    this.contentType = contentType; 
    return this;
  }

   /**
   * The content type
   * @return contentType
  **/
  @ApiModelProperty(value = "The content type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Response body(String body) {
    this.body = body; 
    return this;
  }

   /**
   * The recorded content.
   * @return body
  **/
  @ApiModelProperty(value = "The recorded content.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  public Response bodyWasTruncated(Boolean bodyWasTruncated) {
    this.bodyWasTruncated = bodyWasTruncated; 
    return this;
  }

   /**
   * Determines if the recorded body was truncated.
   * @return bodyWasTruncated
  **/
  @ApiModelProperty(value = "Determines if the recorded body was truncated.")
  public Boolean getBodyWasTruncated() {
    return bodyWasTruncated;
  }

  public void setBodyWasTruncated(Boolean bodyWasTruncated) {
    this.bodyWasTruncated = bodyWasTruncated;
  }


  public Response statusCode(Integer statusCode) {
    this.statusCode = statusCode; 
    return this;
  }

   /**
   * Http Status Code of the request.
   * @return statusCode
  **/
  @ApiModelProperty(value = "Http Status Code of the request.")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public Response links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Response addLinksItem(Link linksItem) {
   
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
    sb.append("class Response {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyWasTruncated: ").append(toIndentedString(bodyWasTruncated)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
