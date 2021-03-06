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

import com.liveagent.legacy.client.model.AgentRow
import com.liveagent.legacy.client.model.ChatRow
import com.liveagent.legacy.client.model.Count
import com.liveagent.legacy.client.model.DepartmentRow
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.EventLogRow
import com.liveagent.legacy.client.model.SlaLogRow
import com.liveagent.legacy.client.model.TagRow
import com.liveagent.legacy.client.model.TicketRow
import com.liveagent.legacy.client.model.TimeReportRow
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object GridApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new GridApi(baseUrl)
}

class GridApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : Seq[AgentRow] (Agents grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   */
  def getAgentsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[AgentRow]] =
    ApiRequest[Seq[AgentRow]](ApiMethods.GET, baseUrl, "/grid/agents", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withSuccessResponse[Seq[AgentRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Agents grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getAgentsGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/agents/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlaLogRow] (Calls sla log grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getCallsSlaLogGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlaLogRow]] =
    ApiRequest[Seq[SlaLogRow]](ApiMethods.GET, baseUrl, "/grid/calls/sla", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[SlaLogRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Calls sla grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getCallsSlaLogGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/calls/sla/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[ChatRow] (Chats grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   */
  def getChatsGridList(perPage: Option[Int] = None, filters: Option[String] = None, cursor: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[ChatRow]] =
    ApiRequest[Seq[ChatRow]](ApiMethods.GET, baseUrl, "/grid/chats", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withSuccessResponse[Seq[ChatRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Tickets grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getChatsGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/chats/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlaLogRow] (Chats sla log grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getChatsSlaLogGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlaLogRow]] =
    ApiRequest[Seq[SlaLogRow]](ApiMethods.GET, baseUrl, "/grid/chats/sla", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[SlaLogRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Chats sla grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getChatsSlaLogGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/chats/sla/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Departments grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getDepartmensGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/departments/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DepartmentRow] (Departments grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   */
  def getDepartmentsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DepartmentRow]] =
    ApiRequest[Seq[DepartmentRow]](ApiMethods.GET, baseUrl, "/grid/departments", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withSuccessResponse[Seq[DepartmentRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[EventLogRow] (Event logs grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getEventLogsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[EventLogRow]] =
    ApiRequest[Seq[EventLogRow]](ApiMethods.GET, baseUrl, "/grid/eventlogs", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[EventLogRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Event logs grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getEventLogsGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/eventlogs/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[TagRow] (Tags grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   */
  def getTagsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[TagRow]] =
    ApiRequest[Seq[TagRow]](ApiMethods.GET, baseUrl, "/grid/tags", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withSuccessResponse[Seq[TagRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Tags grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getTagsGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/tags/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[TicketRow] (Tickets grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getTicketsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[TicketRow]] =
    ApiRequest[Seq[TicketRow]](ApiMethods.GET, baseUrl, "/grid/tickets", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[TicketRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Tickets grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getTicketsGridListCount(filters: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/tickets/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[SlaLogRow] (Tickets sla log grid response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField Sorting field
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getTicketsSlaLogGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[SlaLogRow]] =
    ApiRequest[Seq[SlaLogRow]](ApiMethods.GET, baseUrl, "/grid/tickets/sla", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[SlaLogRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Tickets sla grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getTicketsSlaLogGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/tickets/sla/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[TimeReportRow] (A list of time reports)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   */
  def getTimeReportsGridList(perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, cursor: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[TimeReportRow]] =
    ApiRequest[Seq[TimeReportRow]](ApiMethods.GET, baseUrl, "/grid/reports/time", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withSuccessResponse[Seq[TimeReportRow]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Time reports grid count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getTimeReportsGridListCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/grid/reports/time/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

