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

import com.liveagent.legacy.client.model.CannedMessage
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object CannedMessagesApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new CannedMessagesApi(baseUrl)
}

class CannedMessagesApi(baseUrl: String) {
  
  /**
   * Create new canned message
   * 
   * Expected answers:
   *   code 200 : CannedMessage (Canned message that was created)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cannedMessage 
   */
  def createCannedMessage(cannedMessage: Option[CannedMessage] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[CannedMessage] =
    ApiRequest[CannedMessage](ApiMethods.POST, baseUrl, "/canned_messages", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withBody(cannedMessage)
      .withSuccessResponse[CannedMessage](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a canned message
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cannedMessageId 
   */
  def deleteCannedMessage(cannedMessageId: String)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/canned_messages/{cannedMessageId}", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withPathParam("cannedMessageId", cannedMessageId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : CannedMessage (Canned message response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cannedMessageId 
   */
  def getCannedMessage(cannedMessageId: String)(implicit apiKeyValue: ApiKeyValue): ApiRequest[CannedMessage] =
    ApiRequest[CannedMessage](ApiMethods.GET, baseUrl, "/canned_messages/{cannedMessageId}", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withPathParam("cannedMessageId", cannedMessageId)
      .withSuccessResponse[CannedMessage](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[CannedMessage] (Canned message response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param page Page to display. Not used if _from is defined.
   * @param perPage Results per page. Used only if _page is used.
   * @param from Result set start. Takes precedence over _page.
   * @param to Result set end. Used only if _from is used.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getCannedMessagesList(page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Seq[CannedMessage]] =
    ApiRequest[Seq[CannedMessage]](ApiMethods.GET, baseUrl, "/canned_messages", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Seq[CannedMessage]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update a canned message
   * 
   * Expected answers:
   *   code 200 : CannedMessage (Canned message that was updated)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param cannedMessageId 
   * @param cannedMessage 
   */
  def updateCannedMessage(cannedMessageId: String, cannedMessage: Option[CannedMessage] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[CannedMessage] =
    ApiRequest[CannedMessage](ApiMethods.PUT, baseUrl, "/canned_messages/{cannedMessageId}", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withBody(cannedMessage)
      .withPathParam("cannedMessageId", cannedMessageId)
      .withSuccessResponse[CannedMessage](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

