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

import com.liveagent.legacy.client.model.Count
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.Extension
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object ExtensionsApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new ExtensionsApi(baseUrl)
}

class ExtensionsApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : Extension (Extension response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param extensionId 
   */
  def getExtension(extensionId: String)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Extension] =
    ApiRequest[Extension](ApiMethods.GET, baseUrl, "/extensions/{extensionId}", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withPathParam("extensionId", extensionId)
      .withSuccessResponse[Extension](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Extensions count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getExtensionsCount(filters: Option[String] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/extensions/count", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Extension] (Extension response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page. Used only if _page is used.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration throght resultset. Cursor identifies specific page in resultset.
   */
  def getExtensionsList(perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Seq[Extension]] =
    ApiRequest[Seq[Extension]](ApiMethods.GET, baseUrl, "/extensions", "application/json")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withSuccessResponse[Seq[Extension]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Extension (Extension response)
   *   code 403 : ErrorResponse (Number is already in use)
   *   code 404 : ErrorResponse (Extension not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param extensionId 
   * @param number 
   * @param departmentId 
   * @param status E - Enabled, D - Disabled
   */
  def setExtension(extensionId: String, number: Option[String] = None, departmentId: Option[String] = None, status: Option[String] = None)(implicit apiKeyValue: ApiKeyValue): ApiRequest[Extension] =
    ApiRequest[Extension](ApiMethods.PUT, baseUrl, "/extensions/{extensionId}", "application/x-www-form-urlencoded")
      .withApiKey(apiKeyValue, "apikey", HEADER)
      .withFormParam("number", number)
      .withFormParam("departmentId", departmentId)
      .withFormParam("status", status)
      .withPathParam("extensionId", extensionId)
      .withSuccessResponse[Extension](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      



}

