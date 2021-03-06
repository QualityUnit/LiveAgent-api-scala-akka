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

import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.SlackConversation
import com.liveagent.legacy.client.model.SlackTemplate
import com.liveagent.legacy.client.model.SlackUser
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object SlackApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new SlackApi(baseUrl)
}

class SlackApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : SlackConversation (A slack channel)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param id 
   */
  def getConversation(id: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[SlackConversation] =
    ApiRequest[SlackConversation](ApiMethods.GET, baseUrl, "/slack/conversation/{id}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[SlackConversation](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlackConversation] (A list of slack channels)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param perPage Results per page.
   */
  def getConversations(cursor: Option[String] = None, perPage: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlackConversation]] =
    ApiRequest[Seq[SlackConversation]](ApiMethods.GET, baseUrl, "/slack/conversations", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_perPage", perPage)
      .withSuccessResponse[Seq[SlackConversation]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : SlackUser (A slack user)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param id 
   */
  def getSlackUser(id: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[SlackUser] =
    ApiRequest[SlackUser](ApiMethods.GET, baseUrl, "/slack/user/{id}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[SlackUser](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : SlackTemplate (A slack template)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param id 
   */
  def getTemplate(id: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[SlackTemplate] =
    ApiRequest[SlackTemplate](ApiMethods.GET, baseUrl, "/slack/template/{id}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("id", id)
      .withSuccessResponse[SlackTemplate](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlackTemplate] (A list of slack notification templates)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   */
  def getTemplates()(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlackTemplate]] =
    ApiRequest[Seq[SlackTemplate]](ApiMethods.GET, baseUrl, "/slack/templates/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withSuccessResponse[Seq[SlackTemplate]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlackUser] (A list of slack users)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param perPage Results per page.
   */
  def getUsers(cursor: Option[String] = None, perPage: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlackUser]] =
    ApiRequest[Seq[SlackUser]](ApiMethods.GET, baseUrl, "/slack/users", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_perPage", perPage)
      .withSuccessResponse[Seq[SlackUser]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : SlackTemplate (A slack template)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param id 
   * @param template 
   */
  def saveTemplate(id: String, template: Option[SlackTemplate] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[SlackTemplate] =
    ApiRequest[SlackTemplate](ApiMethods.PUT, baseUrl, "/slack/template/{id}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(template)
      .withPathParam("id", id)
      .withSuccessResponse[SlackTemplate](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

