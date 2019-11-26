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

import com.liveagent.legacy.client.model.Agent
import com.liveagent.legacy.client.model.AgentActivity
import com.liveagent.legacy.client.model.AgentStatus
import com.liveagent.legacy.client.model.EmailAddressObj
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object AgentsApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new AgentsApi(baseUrl)
}

class AgentsApi(baseUrl: String) {
  
  /**
   * Convert registered visitor to agent
   * 
   * Expected answers:
   *   code 200 : Agent (Agent that was created)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param agent 
   */
  def convertRegisteredVisitor(agent: Option[Agent] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Agent] =
    ApiRequest[Agent](ApiMethods.POST, baseUrl, "/agents/convert", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(agent)
      .withSuccessResponse[Agent](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes an agent
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def deleteAgent(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/agents/{userId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Retrieves an agent
   * 
   * Expected answers:
   *   code 200 : Agent (Requested agent)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def getAgent(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Agent] =
    ApiRequest[Agent](ApiMethods.GET, baseUrl, "/agents/{userId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withSuccessResponse[Agent](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Retrieves an agent
   * 
   * Expected answers:
   *   code 200 : Agent (Requested agent)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param emailAddress 
   */
  def getAgentByEmail(emailAddress: EmailAddressObj)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Agent] =
    ApiRequest[Agent](ApiMethods.POST, baseUrl, "/agents/_by_email", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(emailAddress)
      .withSuccessResponse[Agent](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Gets agent statuses in departments
   * 
   * Expected answers:
   *   code 200 : Seq[AgentStatus] (Agent statuses)
   *   code 404 : ErrorResponse (Agent not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def getAgentStatuses(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[AgentStatus]] =
    ApiRequest[Seq[AgentStatus]](ApiMethods.GET, baseUrl, "/agents/{userId}/status", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withSuccessResponse[Seq[AgentStatus]](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * List of agents
   * 
   * Expected answers:
   *   code 200 : Seq[Agent] (Agent list)
   *   code 206 : Seq[Agent] (Agent list)
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
  def getAgents(page: Option[Int] = None, perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Agent]] =
    ApiRequest[Seq[Agent]](ApiMethods.GET, baseUrl, "/agents/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withSuccessResponse[Seq[Agent]](200)
      .withErrorResponse[Seq[Agent]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * List of online agents with their activity status (A - Available, B - Busy) and open tickets.
   * 
   * Expected answers:
   *   code 200 : Seq[AgentActivity] (Agent Activity list)
   *   code 206 : Seq[AgentActivity] (Agent Activity list)
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
  def getAgentsActivity(page: Option[Int] = None, perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[AgentActivity]] =
    ApiRequest[Seq[AgentActivity]](ApiMethods.GET, baseUrl, "/agents/activity", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withSuccessResponse[Seq[AgentActivity]](200)
      .withErrorResponse[Seq[AgentActivity]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Login agent
   * 
   * Expected answers:
   *   code 302 :  (Login redirection)
   *              Headers :
   *                Location - 
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def loginAgent(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[ErrorResponse] =
    ApiRequest[ErrorResponse](ApiMethods.POST, baseUrl, "/agents/{userId}/_login", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withErrorResponse[Unit](302)
      .withDefaultSuccessResponse[ErrorResponse]
      

  /**
   * Logout an agent
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def logoutAgent(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/agents/{userId}/_logout", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Pauses an agent
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   */
  def pauseAgent(userId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/agents/{userId}/_pause", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("userId", userId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Undelete deleted agent
   * 
   * Expected answers:
   *   code 200 : Agent (Agent that was undeleted)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param agent 
   */
  def undeleteAgent(agent: Option[Agent] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Agent] =
    ApiRequest[Agent](ApiMethods.POST, baseUrl, "/agents/undelete", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(agent)
      .withSuccessResponse[Agent](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update an agent
   * 
   * Expected answers:
   *   code 200 : Agent (Agent that was updated)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param userId 
   * @param agent 
   */
  def updateAgent(userId: String, agent: Option[Agent] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Agent] =
    ApiRequest[Agent](ApiMethods.PUT, baseUrl, "/agents/{userId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(agent)
      .withPathParam("userId", userId)
      .withSuccessResponse[Agent](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

