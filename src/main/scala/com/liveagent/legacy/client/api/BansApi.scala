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

import com.liveagent.legacy.client.model.Ban
import com.liveagent.legacy.client.model.BanListItem
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object BansApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new BansApi(baseUrl)
}

class BansApi(baseUrl: String) {
  
  /**
   * Create new ban record
   * 
   * Expected answers:
   *   code 200 : Ban (Created ban)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param ban 
   */
  def createBan(ban: Option[Ban] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Ban] =
    ApiRequest[Ban](ApiMethods.POST, baseUrl, "/bans/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(ban)
      .withSuccessResponse[Ban](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Exclude IP from banned IP ranges
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param ipAddress IP address you want exclude form IP Ban
   */
  def excludeIPBan(ipAddress: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/bans/_exclude", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("ipAddress", ipAddress)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expire ban
   * 
   * Expected answers:
   *   code 200 : Ban (Expired ban)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param banId 
   */
  def expireBan(banId: Int)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Ban] =
    ApiRequest[Ban](ApiMethods.POST, baseUrl, "/bans/{banId}/_expire", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("banId", banId)
      .withSuccessResponse[Ban](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Ban item
   * 
   * Expected answers:
   *   code 200 : Ban (Requested ban)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param banId 
   */
  def getBan(banId: Int)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Ban] =
    ApiRequest[Ban](ApiMethods.GET, baseUrl, "/bans/{banId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("banId", banId)
      .withSuccessResponse[Ban](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * List of bans
   * 
   * Expected answers:
   *   code 200 : Seq[BanListItem] (Bans list)
   *   code 206 : Seq[BanListItem] (Bans list)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param page Page to display. Not used if _from is defined.
   * @param perPage Results per page. Used only if _page is used.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param from Result set start. Takes precedence over _page.
   * @param to Result set end. Used only if _from is used.
   */
  def getBans(page: Option[Int] = None, perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[BanListItem]] =
    ApiRequest[Seq[BanListItem]](ApiMethods.GET, baseUrl, "/bans/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withSuccessResponse[Seq[BanListItem]](200)
      .withErrorResponse[Seq[BanListItem]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update ban
   * 
   * Expected answers:
   *   code 200 : Ban (Updated ban)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param banId 
   * @param ban 
   */
  def updateBan(banId: Int, ban: Option[Ban] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Ban] =
    ApiRequest[Ban](ApiMethods.PUT, baseUrl, "/bans/{banId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(ban)
      .withPathParam("banId", banId)
      .withSuccessResponse[Ban](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

