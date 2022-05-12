/*
 * FINBOURNE Insights API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.287
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holds logged information about an access check performed on an API.
 */
@ApiModel(description = "Holds logged information about an access check performed on an API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessEvaluationLog {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_USER_TYPE = "userType";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private String userType;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private java.math.BigDecimal duration;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_AUTHORITATIVE_ROLE_ID = "authoritativeRoleId";
  @SerializedName(SERIALIZED_NAME_AUTHORITATIVE_ROLE_ID)
  private String authoritativeRoleId;

  public static final String SERIALIZED_NAME_AUTHORITATIVE_POLICY_ID = "authoritativePolicyId";
  @SerializedName(SERIALIZED_NAME_AUTHORITATIVE_POLICY_ID)
  private String authoritativePolicyId;

  public static final String SERIALIZED_NAME_AUTHORITATIVE_SELECTOR = "authoritativeSelector";
  @SerializedName(SERIALIZED_NAME_AUTHORITATIVE_SELECTOR)
  private String authoritativeSelector;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private Map<String, String> resource = null;

  public static final String SERIALIZED_NAME_RESOURCE_FROM_EFFECTIVE_DATE = "resourceFromEffectiveDate";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FROM_EFFECTIVE_DATE)
  private String resourceFromEffectiveDate;

  public static final String SERIALIZED_NAME_RESOURCE_TO_EFFECTIVE_DATE = "resourceToEffectiveDate";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TO_EFFECTIVE_DATE)
  private String resourceToEffectiveDate;

  public static final String SERIALIZED_NAME_RESOURCE_FROM_AS_AT = "resourceFromAsAt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FROM_AS_AT)
  private String resourceFromAsAt;

  public static final String SERIALIZED_NAME_RESOURCE_TO_AS_AT = "resourceToAsAt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TO_AS_AT)
  private String resourceToAsAt;

  public static final String SERIALIZED_NAME_ACCESS_EXECUTION_TIME = "accessExecutionTime";
  @SerializedName(SERIALIZED_NAME_ACCESS_EXECUTION_TIME)
  private String accessExecutionTime;

  public static final String SERIALIZED_NAME_ACCESS_AS_AT_TIME = "accessAsAtTime";
  @SerializedName(SERIALIZED_NAME_ACCESS_AS_AT_TIME)
  private String accessAsAtTime;

  public static final String SERIALIZED_NAME_REQUIRED_LICENCE_POLICY_ID = "requiredLicencePolicyId";
  @SerializedName(SERIALIZED_NAME_REQUIRED_LICENCE_POLICY_ID)
  private String requiredLicencePolicyId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public AccessEvaluationLog timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp; 
    return this;
  }

   /**
   * The timestamp of the access evaluation.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the access evaluation.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public AccessEvaluationLog application(String application) {
    this.application = application; 
    return this;
  }

   /**
   * The name of the application that the request was made from.
   * @return application
  **/
  @ApiModelProperty(required = true, value = "The name of the application that the request was made from.")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }


  public AccessEvaluationLog id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The ID of the access evaluation.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the access evaluation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AccessEvaluationLog requestId(String requestId) {
    this.requestId = requestId; 
    return this;
  }

   /**
   * The identifier of the request.
   * @return requestId
  **/
  @ApiModelProperty(value = "The identifier of the request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public AccessEvaluationLog sessionId(String sessionId) {
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


  public AccessEvaluationLog user(String user) {
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


  public AccessEvaluationLog userType(String userType) {
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


  public AccessEvaluationLog duration(java.math.BigDecimal duration) {
    this.duration = duration; 
    return this;
  }

   /**
   * The duration of the access evaluation.
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration of the access evaluation.")
  public java.math.BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(java.math.BigDecimal duration) {
    this.duration = duration;
  }


  public AccessEvaluationLog result(String result) {
    this.result = result; 
    return this;
  }

   /**
   * The result of the access evaluation.
   * @return result
  **/
  @ApiModelProperty(value = "The result of the access evaluation.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public AccessEvaluationLog authoritativeRoleId(String authoritativeRoleId) {
    this.authoritativeRoleId = authoritativeRoleId; 
    return this;
  }

   /**
   * The role that matched the access evaluation to provide a result.
   * @return authoritativeRoleId
  **/
  @ApiModelProperty(value = "The role that matched the access evaluation to provide a result.")
  public String getAuthoritativeRoleId() {
    return authoritativeRoleId;
  }

  public void setAuthoritativeRoleId(String authoritativeRoleId) {
    this.authoritativeRoleId = authoritativeRoleId;
  }


  public AccessEvaluationLog authoritativePolicyId(String authoritativePolicyId) {
    this.authoritativePolicyId = authoritativePolicyId; 
    return this;
  }

   /**
   * The policy that matched the access evaluation to provide a result.
   * @return authoritativePolicyId
  **/
  @ApiModelProperty(value = "The policy that matched the access evaluation to provide a result.")
  public String getAuthoritativePolicyId() {
    return authoritativePolicyId;
  }

  public void setAuthoritativePolicyId(String authoritativePolicyId) {
    this.authoritativePolicyId = authoritativePolicyId;
  }


  public AccessEvaluationLog authoritativeSelector(String authoritativeSelector) {
    this.authoritativeSelector = authoritativeSelector; 
    return this;
  }

   /**
   * The selector that matched the access evaluation to provide a result.
   * @return authoritativeSelector
  **/
  @ApiModelProperty(value = "The selector that matched the access evaluation to provide a result.")
  public String getAuthoritativeSelector() {
    return authoritativeSelector;
  }

  public void setAuthoritativeSelector(String authoritativeSelector) {
    this.authoritativeSelector = authoritativeSelector;
  }


  public AccessEvaluationLog resourceType(String resourceType) {
    this.resourceType = resourceType; 
    return this;
  }

   /**
   * The type of the resource that the access evaluation is for.
   * @return resourceType
  **/
  @ApiModelProperty(value = "The type of the resource that the access evaluation is for.")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public AccessEvaluationLog action(String action) {
    this.action = action; 
    return this;
  }

   /**
   * The action key of the access evaluation.
   * @return action
  **/
  @ApiModelProperty(value = "The action key of the access evaluation.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public AccessEvaluationLog resource(Map<String, String> resource) {
    this.resource = resource; 
    return this;
  }

  public AccessEvaluationLog putResourceItem(String key, String resourceItem) {
    if (this.resource == null) {
      this.resource = new HashMap<>();
    }
    this.resource.put(key, resourceItem);
    return this;
  }

   /**
   * The ID of the resource that the access evaluation is for. If the ResourceID could not be converted to a dictionary, it will return a single-value dictionary with the key \&quot;resourceId\&quot;.
   * @return resource
  **/
  @ApiModelProperty(value = "The ID of the resource that the access evaluation is for. If the ResourceID could not be converted to a dictionary, it will return a single-value dictionary with the key \"resourceId\".")
  public Map<String, String> getResource() {
    return resource;
  }

  public void setResource(Map<String, String> resource) {
    this.resource = resource;
  }


  public AccessEvaluationLog resourceFromEffectiveDate(String resourceFromEffectiveDate) {
    this.resourceFromEffectiveDate = resourceFromEffectiveDate; 
    return this;
  }

   /**
   * The From effective date of the resource.
   * @return resourceFromEffectiveDate
  **/
  @ApiModelProperty(value = "The From effective date of the resource.")
  public String getResourceFromEffectiveDate() {
    return resourceFromEffectiveDate;
  }

  public void setResourceFromEffectiveDate(String resourceFromEffectiveDate) {
    this.resourceFromEffectiveDate = resourceFromEffectiveDate;
  }


  public AccessEvaluationLog resourceToEffectiveDate(String resourceToEffectiveDate) {
    this.resourceToEffectiveDate = resourceToEffectiveDate; 
    return this;
  }

   /**
   * The To effective date of the resource.
   * @return resourceToEffectiveDate
  **/
  @ApiModelProperty(value = "The To effective date of the resource.")
  public String getResourceToEffectiveDate() {
    return resourceToEffectiveDate;
  }

  public void setResourceToEffectiveDate(String resourceToEffectiveDate) {
    this.resourceToEffectiveDate = resourceToEffectiveDate;
  }


  public AccessEvaluationLog resourceFromAsAt(String resourceFromAsAt) {
    this.resourceFromAsAt = resourceFromAsAt; 
    return this;
  }

   /**
   * The From AsAt date of the resource.
   * @return resourceFromAsAt
  **/
  @ApiModelProperty(value = "The From AsAt date of the resource.")
  public String getResourceFromAsAt() {
    return resourceFromAsAt;
  }

  public void setResourceFromAsAt(String resourceFromAsAt) {
    this.resourceFromAsAt = resourceFromAsAt;
  }


  public AccessEvaluationLog resourceToAsAt(String resourceToAsAt) {
    this.resourceToAsAt = resourceToAsAt; 
    return this;
  }

   /**
   * The To AsAt date of the resource.
   * @return resourceToAsAt
  **/
  @ApiModelProperty(value = "The To AsAt date of the resource.")
  public String getResourceToAsAt() {
    return resourceToAsAt;
  }

  public void setResourceToAsAt(String resourceToAsAt) {
    this.resourceToAsAt = resourceToAsAt;
  }


  public AccessEvaluationLog accessExecutionTime(String accessExecutionTime) {
    this.accessExecutionTime = accessExecutionTime; 
    return this;
  }

   /**
   * The execution time of the entitlement.
   * @return accessExecutionTime
  **/
  @ApiModelProperty(value = "The execution time of the entitlement.")
  public String getAccessExecutionTime() {
    return accessExecutionTime;
  }

  public void setAccessExecutionTime(String accessExecutionTime) {
    this.accessExecutionTime = accessExecutionTime;
  }


  public AccessEvaluationLog accessAsAtTime(String accessAsAtTime) {
    this.accessAsAtTime = accessAsAtTime; 
    return this;
  }

   /**
   * The AsAt time of the entitlement.
   * @return accessAsAtTime
  **/
  @ApiModelProperty(value = "The AsAt time of the entitlement.")
  public String getAccessAsAtTime() {
    return accessAsAtTime;
  }

  public void setAccessAsAtTime(String accessAsAtTime) {
    this.accessAsAtTime = accessAsAtTime;
  }


  public AccessEvaluationLog requiredLicencePolicyId(String requiredLicencePolicyId) {
    this.requiredLicencePolicyId = requiredLicencePolicyId; 
    return this;
  }

   /**
   * ID of the required licence policy.
   * @return requiredLicencePolicyId
  **/
  @ApiModelProperty(value = "ID of the required licence policy.")
  public String getRequiredLicencePolicyId() {
    return requiredLicencePolicyId;
  }

  public void setRequiredLicencePolicyId(String requiredLicencePolicyId) {
    this.requiredLicencePolicyId = requiredLicencePolicyId;
  }


  public AccessEvaluationLog links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public AccessEvaluationLog addLinksItem(Link linksItem) {
   
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
    sb.append("class AccessEvaluationLog {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    authoritativeRoleId: ").append(toIndentedString(authoritativeRoleId)).append("\n");
    sb.append("    authoritativePolicyId: ").append(toIndentedString(authoritativePolicyId)).append("\n");
    sb.append("    authoritativeSelector: ").append(toIndentedString(authoritativeSelector)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceFromEffectiveDate: ").append(toIndentedString(resourceFromEffectiveDate)).append("\n");
    sb.append("    resourceToEffectiveDate: ").append(toIndentedString(resourceToEffectiveDate)).append("\n");
    sb.append("    resourceFromAsAt: ").append(toIndentedString(resourceFromAsAt)).append("\n");
    sb.append("    resourceToAsAt: ").append(toIndentedString(resourceToAsAt)).append("\n");
    sb.append("    accessExecutionTime: ").append(toIndentedString(accessExecutionTime)).append("\n");
    sb.append("    accessAsAtTime: ").append(toIndentedString(accessAsAtTime)).append("\n");
    sb.append("    requiredLicencePolicyId: ").append(toIndentedString(requiredLicencePolicyId)).append("\n");
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
