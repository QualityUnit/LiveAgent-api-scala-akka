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
import com.liveagent.legacy.client.model.PhoneDevice
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object PhonesApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new PhonesApi(baseUrl)
}

class PhonesApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : PhoneDevice (PhoneDevices response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param number 
   * @param `type` S - SIP phone, E - PSTN phone
   * @param name 
   */
  def createPhone(number: String, `type`: Option[String] = None, name: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PhoneDevice] =
    ApiRequest[PhoneDevice](ApiMethods.POST, baseUrl, "/phones", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("number", number)
      .withQueryParam("type", `type`)
      .withQueryParam("name", name)
      .withSuccessResponse[PhoneDevice](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : PhoneDevice (PhoneDevices response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param phoneId 
   */
  def getPhone(phoneId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PhoneDevice] =
    ApiRequest[PhoneDevice](ApiMethods.GET, baseUrl, "/phones/{phoneId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("phoneId", phoneId)
      .withSuccessResponse[PhoneDevice](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[PhoneDevice] (PhoneDevices response)
   *   code 206 : Seq[PhoneDevice] (PhoneDevices response)
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
  def getPhonesList(page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[PhoneDevice]] =
    ApiRequest[Seq[PhoneDevice]](ApiMethods.GET, baseUrl, "/phones", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Seq[PhoneDevice]](200)
      .withErrorResponse[Seq[PhoneDevice]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Phone not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param phoneId 
   */
  def removePhone(phoneId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/phones/{phoneId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("phoneId", phoneId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : PhoneDevice (Phone response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param phoneId 
   * @param name 
   */
  def updatePhone(phoneId: String, name: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PhoneDevice] =
    ApiRequest[PhoneDevice](ApiMethods.PUT, baseUrl, "/phones/{phoneId}", "application/x-www-form-urlencoded")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withFormParam("name", name)
      .withPathParam("phoneId", phoneId)
      .withSuccessResponse[PhoneDevice](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param phoneId 
   * @param params New params
   */
  def updatePhoneParams(phoneId: String, params: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/phones/{phoneId}/_updateParams", "application/x-www-form-urlencoded")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withFormParam("params", params)
      .withPathParam("phoneId", phoneId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      



}

