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

import com.liveagent.legacy.client.model.Call
import com.liveagent.legacy.client.model.CallListItem
import com.liveagent.legacy.client.model.CallMessage
import com.liveagent.legacy.client.model.CallStatus
import com.liveagent.legacy.client.model.CallTransferResult
import com.liveagent.legacy.client.model.Count
import com.liveagent.legacy.client.model.ErrorResponse
import java.io.File
import com.liveagent.legacy.client.model.Ivr
import com.liveagent.legacy.client.model.IvrFetch
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object CallsApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new CallsApi(baseUrl)
}

class CallsApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param body 
   */
  def callAddMessage(callId: String, body: Option[CallMessage] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/messages", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param file 
   */
  def callAddRecording(callId: String, file: Option[File] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/recordings", "multipart/form-data")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withFormParam("file", file)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 403 : ErrorResponse (Call is active or finished)
   *   code 404 : ErrorResponse (Call or active phone not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param toNumber callee number
   * @param channelId Channel ID
   */
  def callAnswer(callId: String, toNumber: String, channelId: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/_answer", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("to_number", toNumber)
      .withQueryParam("channelId", channelId)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 403 : ErrorResponse (Call is finished)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   * @param status run (\"R\" - default), hold (\"H\")
   */
  def callChangeChannelStatus(callId: String, channelId: String, status: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/calls/{callId}/channels/{channelId}/_status", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("status", status)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Creates new call (incoming / outgoing / internal). Does not initiate the outgoing call
   * 
   * Expected answers:
   *   code 200 : Call (Call info)
   *   code 403 : ErrorResponse (Call already exists, other active call in ticket or number is not owner of ticket)
   *   code 404 : ErrorResponse (Ticket not found or active number not found for internal call)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param toNumber callee number
   * @param fromNumber caller number
   * @param channelId Channel ID
   * @param viaNumber trunk number via which call was made / received
   * @param ticketId ticket id or code
   * @param direction incoming call ('in' - default), outgoing call ('out'), internal call('int'), auto decide direction of call based on to_number ('auto')
   */
  def callCreate(callId: String, toNumber: String, fromNumber: String, channelId: Option[String] = None, viaNumber: Option[String] = None, ticketId: Option[String] = None, direction: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Call] =
    ApiRequest[Call](ApiMethods.POST, baseUrl, "/calls/{callId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("channelId", channelId)
      .withQueryParam("to_number", toNumber)
      .withQueryParam("via_number", viaNumber)
      .withQueryParam("from_number", fromNumber)
      .withQueryParam("ticketId", ticketId)
      .withQueryParam("direction", direction)
      .withPathParam("callId", callId)
      .withSuccessResponse[Call](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Ivr] (List of IVRs. Execution starts in start IVR)
   *   code 403 : ErrorResponse (Call is not incoming or is active already)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param fetch 
   */
  def callFetchIvr(callId: String, fetch: IvrFetch)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Ivr]] =
    ApiRequest[Seq[Ivr]](ApiMethods.POST, baseUrl, "/calls/{callId}/_fetchIvr", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(fetch)
      .withPathParam("callId", callId)
      .withSuccessResponse[Seq[Ivr]](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : CallStatus (Call status)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param unreachableAgents Identifiers of unreachable agents that should be excluded from routing
   */
  def callGetStatus(callId: String, unreachableAgents: Seq[String])(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[CallStatus] =
    ApiRequest[CallStatus](ApiMethods.GET, baseUrl, "/calls/{callId}/status", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("unreachableAgents", ArrayValues(unreachableAgents, CSV))
      .withPathParam("callId", callId)
      .withSuccessResponse[CallStatus](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   * @param toCallId Target call
   */
  def callMoveChannel(callId: String, channelId: String, toCallId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_move", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("to_callId", toCallId)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def callRemoveChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/calls/{callId}/channels/{channelId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Lets the call ring to an another agent if available
   * 
   * Expected answers:
   *   code 200 : CallStatus (Call status)
   *   code 403 : ErrorResponse (Call is outgoing, active or finished)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param reason T - timeout, D - decline, DNR - device not registered, CHE - channel error
   * @param unreachableAgents Identifiers of unreachable agents that should be excluded from routing
   */
  def callReroute(callId: String, reason: Option[String] = None, unreachableAgents: Seq[String])(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[CallStatus] =
    ApiRequest[CallStatus](ApiMethods.POST, baseUrl, "/calls/{callId}/_reroute", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("reason", reason)
      .withQueryParam("unreachableAgents", ArrayValues(unreachableAgents, CSV))
      .withPathParam("callId", callId)
      .withSuccessResponse[CallStatus](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Lets the call ring to an agent or adds it to queue if all agents are busy
   * 
   * Expected answers:
   *   code 200 : CallStatus (Call status)
   *   code 403 : ErrorResponse (Call is outgoing, active or finished)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param departmentId Department ID
   * @param toNumber callee number
   */
  def callRing(callId: String, departmentId: Option[String] = None, toNumber: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[CallStatus] =
    ApiRequest[CallStatus](ApiMethods.POST, baseUrl, "/calls/{callId}/_ring", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("departmentId", departmentId)
      .withQueryParam("to_number", toNumber)
      .withPathParam("callId", callId)
      .withSuccessResponse[CallStatus](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Starts new call by ringing agent device and the dialing customer after agent has picked up his phone 
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param toNumber callee number
   * @param fromNumber caller number
   * @param ticketId ticket id or code
   * @param viaNumber trunk number via which call was made
   */
  def callStart(toNumber: String, fromNumber: String, ticketId: String, viaNumber: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/call/_start", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("to_number", toNumber)
      .withQueryParam("from_number", fromNumber)
      .withQueryParam("via_number", viaNumber)
      .withQueryParam("ticketId", ticketId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Callback is delivered only of HW phones
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId Call ID
   */
  def callStartCanceled(callId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/call/_startCanceled", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Callback is delivered only of HW phones
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId Call ID
   */
  def callStartFailed(callId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/call/_startFailed", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param fromNumber from number
   */
  def callStop(callId: String, fromNumber: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/_stop", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("from_number", fromNumber)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Transfer can be called on incoming calls before they start ringing to agents
   * 
   * Expected answers:
   *   code 200 : CallTransferResult (Call transfer result)
   *   code 403 : ErrorResponse (Call is not incoming or is active already)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param to Department ID or extension
   */
  def callTransfer(callId: String, to: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[CallTransferResult] =
    ApiRequest[CallTransferResult](ApiMethods.POST, baseUrl, "/calls/{callId}/_transfer", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("to", to)
      .withPathParam("callId", callId)
      .withSuccessResponse[CallTransferResult](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Confirms that the call is ringing to an agent
   * 
   * Expected answers:
   *   code 200 : Any (Call status)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param toNumber callee number
   * @param channelId Channel ID
   */
  def confirmRing(callId: String, toNumber: Option[String] = None, channelId: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/_confirmRing", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("to_number", toNumber)
      .withQueryParam("channelId", channelId)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   * @param dtmf DTMF To send
   */
  def dtmfChannel(callId: String, channelId: String, dtmf: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_dtmf", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("dtmf", dtmf)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def endChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_end", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Count (Calls count response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getCallsCount(filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Count] =
    ApiRequest[Count](ApiMethods.GET, baseUrl, "/calls/count", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Count](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[CallListItem] (Call response)
   *   code 206 : Seq[CallListItem] (Call response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param perPage Results per page.
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param cursor used for iteration through resultset. Cursor identifies specific page in resultset.
   * @param sortField 
   * @param sortDir Sorting direction ASC or DESC
   * @param timezoneOffset difference between client and server time in seconds
   */
  def getCallsList(perPage: Option[Int] = None, filters: Option[String] = None, cursor: Option[String] = None, sortField: Option[String] = None, sortDir: Option[String] = None, timezoneOffset: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[CallListItem]] =
    ApiRequest[Seq[CallListItem]](ApiMethods.GET, baseUrl, "/calls", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_filters", filters)
      .withQueryParam("_cursor", cursor)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_sortDir", sortDir)
      .withHeaderParam("Timezone-Offset", timezoneOffset)
      .withSuccessResponse[Seq[CallListItem]](200)
      .withErrorResponse[Seq[CallListItem]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def holdChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_hold", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Merge secondary call into main call
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param secCallId Secondary call ID
   * @param agentId Agent ID for removing from the call
   */
  def merge(callId: String, secCallId: String, agentId: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/_merge", "application/x-www-form-urlencoded")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withFormParam("secCallId", secCallId)
      .withFormParam("agentId", agentId)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def muteChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_mute", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Call goes to offline state after this
   * 
   * Expected answers:
   *   code 200 : Any (Call status)
   *   code 404 : ErrorResponse (Call not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   */
  def stopRing(callId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/_stopRing", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def unholdChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_unhold", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Call or channel not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param callId 
   * @param channelId 
   */
  def unmuteChannel(callId: String, channelId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/calls/{callId}/channels/{channelId}/_unmute", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("callId", callId)
      .withPathParam("channelId", channelId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      



}

