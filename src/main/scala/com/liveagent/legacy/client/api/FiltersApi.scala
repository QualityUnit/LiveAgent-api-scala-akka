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
import com.liveagent.legacy.client.model.Filter
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object FiltersApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new FiltersApi(baseUrl)
}

class FiltersApi(baseUrl: String) {
  
  /**
   * Create new filter
   * 
   * Expected answers:
   *   code 200 : Filter (Created filter)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filter 
   */
  def createFilter(filter: Option[Filter] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Filter] =
    ApiRequest[Filter](ApiMethods.POST, baseUrl, "/filters/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(filter)
      .withSuccessResponse[Filter](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Delete filter
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filterId 
   */
  def deleteFilter(filterId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/filters/{filterId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("filterId", filterId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Filter
   * 
   * Expected answers:
   *   code 200 : Filter (Requested filter)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filterId 
   */
  def getFilter(filterId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Filter] =
    ApiRequest[Filter](ApiMethods.GET, baseUrl, "/filters/{filterId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("filterId", filterId)
      .withSuccessResponse[Filter](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * List of filters
   * 
   * Expected answers:
   *   code 200 : Seq[Filter] (Filters list)
   *   code 206 : Seq[Filter] (Filters list)
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
  def getFilters(page: Option[Int] = None, perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Filter]] =
    ApiRequest[Seq[Filter]](ApiMethods.GET, baseUrl, "/filters/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withSuccessResponse[Seq[Filter]](200)
      .withErrorResponse[Seq[Filter]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update filter
   * 
   * Expected answers:
   *   code 200 : Filter (Updated filter)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filterId 
   * @param filter 
   */
  def updateFilter(filterId: String, filter: Option[Filter] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Filter] =
    ApiRequest[Filter](ApiMethods.PUT, baseUrl, "/filters/{filterId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(filter)
      .withPathParam("filterId", filterId)
      .withSuccessResponse[Filter](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

