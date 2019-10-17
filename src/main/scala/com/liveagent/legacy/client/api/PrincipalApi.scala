/**
 * LiveAgent API
 * This page contains complete API documentation for LiveAgent software. To display additional info and examples for specific API method, just click on the method name in the list below.<br/><br/>To be able to make API requests you need to generate an API key in your admin panel first. [See this article for detailed info.](https://support.ladesk.com/741982-API-key)<br/><br/>Additional info about more advanced agent, contact or ticket API filters can be found [in this article](https://support.ladesk.com/513528-APIv3-advanced-filter-examples).<br/><br/>If you have any question or doubts regarding this API, please do not hesitate to contact our support team.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: support@qualityunit.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.liveagent.legacy.client.api

import com.liveagent.legacy.client.model.Browser
import com.liveagent.legacy.client.model.BrowserId
import com.liveagent.legacy.client.model.Departments
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.PrincipalCredentials
import com.liveagent.legacy.client.model.Role
import com.liveagent.legacy.client.model.SessionId
import com.liveagent.legacy.client.model.UserId
import com.liveagent.legacy.client.model.Visitor
import com.liveagent.legacy.client.model.VisitorId
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object PrincipalApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new PrincipalApi(baseUrl)
}

class PrincipalApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : Departments (List of departments)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param principalId Principal id
   */
  def getDepartments(principalId: String)(implicit apiKey: ApiKeyValue): ApiRequest[Departments] =
    ApiRequest[Departments](ApiMethods.GET, baseUrl, "/principal/{principalId}/departments", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withPathParam("principalId", principalId)
      .withSuccessResponse[Departments](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Role (Role)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param principalId Principal id
   */
  def getRole(principalId: String)(implicit apiKey: ApiKeyValue): ApiRequest[Role] =
    ApiRequest[Role](ApiMethods.GET, baseUrl, "/principal/{principalId}/role", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withPathParam("principalId", principalId)
      .withSuccessResponse[Role](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Browser (BrowserId)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param browserId 
   */
  def resolveBrowser(browserId: Option[BrowserId] = None)(implicit apiKey: ApiKeyValue): ApiRequest[Browser] =
    ApiRequest[Browser](ApiMethods.POST, baseUrl, "/principal/resolveBrowser", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withBody(browserId)
      .withSuccessResponse[Browser](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : UserId (UserId)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param sessionId 
   */
  def resolveUserIdFromSession(sessionId: SessionId)(implicit apiKey: ApiKeyValue): ApiRequest[UserId] =
    ApiRequest[UserId](ApiMethods.POST, baseUrl, "/principal/resolveUserIdFromSession", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withBody(sessionId)
      .withSuccessResponse[UserId](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : UserId (UserId)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param visitorId 
   */
  def resolveUserIdFromVisitorId(visitorId: VisitorId)(implicit apiKey: ApiKeyValue): ApiRequest[UserId] =
    ApiRequest[UserId](ApiMethods.POST, baseUrl, "/principal/resolveUserIdFromVisitorId", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withBody(visitorId)
      .withSuccessResponse[UserId](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Visitor (Visitor)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param visitorId 
   */
  def resolveVisitor(visitorId: VisitorId)(implicit apiKey: ApiKeyValue): ApiRequest[Visitor] =
    ApiRequest[Visitor](ApiMethods.POST, baseUrl, "/principal/resolveVisitor", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withBody(visitorId)
      .withSuccessResponse[Visitor](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Validate principal credentials
   * 
   * Expected answers:
   *   code 200 : UserId (UserId)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param credentials 
   */
  def validateCredentials(credentials: PrincipalCredentials)(implicit apiKey: ApiKeyValue): ApiRequest[UserId] =
    ApiRequest[UserId](ApiMethods.POST, baseUrl, "/principal/validateCredentials", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withBody(credentials)
      .withSuccessResponse[UserId](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

