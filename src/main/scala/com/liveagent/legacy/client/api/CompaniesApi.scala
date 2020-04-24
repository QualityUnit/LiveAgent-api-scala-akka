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

import com.liveagent.legacy.client.model.Company
import com.liveagent.legacy.client.model.CompanyListItem
import com.liveagent.legacy.client.model.CompanyRequest
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object CompaniesApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new CompaniesApi(baseUrl)
}

class CompaniesApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : Company (Company was created)
   *   code 400 : ErrorResponse (Data is missing)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param company 
   */
  def createCompany(company: Option[CompanyRequest] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.POST, baseUrl, "/companies", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(company)
      .withSuccessResponse[Company](200)
      .withErrorResponse[ErrorResponse](400)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a company
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Company was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param companyId 
   * @param deleteTickets <u>true</u>: Delete company from all lists and also delete all its tickets.<br> <u>false</u>: Delete company from all lists but leave its tickets intact.
   */
  def deleteCompany(companyId: String, deleteTickets: Boolean)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/companies/{companyId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("deleteTickets", deleteTickets)
      .withPathParam("companyId", companyId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[CompanyListItem] (Company response)
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
  def getCompaniesList(page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[CompanyListItem]] =
    ApiRequest[Seq[CompanyListItem]](ApiMethods.GET, baseUrl, "/companies", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Seq[CompanyListItem]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Company (Company response)
   *   code 404 : ErrorResponse (Company was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param companyId 
   */
  def getSpecificCompany(companyId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.GET, baseUrl, "/companies/{companyId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("companyId", companyId)
      .withSuccessResponse[Company](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Company (Company was registered)
   *   code 400 : ErrorResponse (Data is missing)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param companyId 
   * @param registrationEmail 
   */
  def registerCompany(companyId: String, registrationEmail: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.PUT, baseUrl, "/companies/{companyId}/_register", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("registration_email", registrationEmail)
      .withPathParam("companyId", companyId)
      .withSuccessResponse[Company](200)
      .withErrorResponse[ErrorResponse](400)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Company (Company was unregistered)
   *   code 400 : ErrorResponse (Data is missing)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param companyId 
   */
  def unregisterCompany(companyId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.DELETE, baseUrl, "/companies/{companyId}/_unregister", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("companyId", companyId)
      .withSuccessResponse[Company](200)
      .withErrorResponse[ErrorResponse](400)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Company (Company was updated)
   *   code 400 : ErrorResponse (Data is missing)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param companyId 
   * @param company 
   */
  def updateCompany(companyId: String, company: Option[CompanyRequest] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Company] =
    ApiRequest[Company](ApiMethods.PUT, baseUrl, "/companies/{companyId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(company)
      .withPathParam("companyId", companyId)
      .withSuccessResponse[Company](200)
      .withErrorResponse[ErrorResponse](400)
      .withDefaultErrorResponse[ErrorResponse]
      



}

