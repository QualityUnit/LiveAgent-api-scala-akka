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

object AgentPhoneApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new AgentPhoneApi(baseUrl)
}

class AgentPhoneApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : PhoneDevice (PhoneDevices response)
   *   code 404 : ErrorResponse (Error response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param agentId 
   * @param `type` API (I - default), SIP (S)
   */
  def getAgentPhone(agentId: String, `type`: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[PhoneDevice] =
    ApiRequest[PhoneDevice](ApiMethods.GET, baseUrl, "/agent_phone/{agentId}", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withQueryParam("type", `type`)
      .withPathParam("agentId", agentId)
      .withSuccessResponse[PhoneDevice](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param agentId 
   * @param phoneId New phone ID
   */
  def setAgentPhone(agentId: String, phoneId: String)(implicit apiKey: ApiKeyValue): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/agent_phone/{agentId}", "application/json")
      .withApiKey(apiKey, "apikey", HEADER)
      .withQueryParam("phoneId", phoneId)
      .withPathParam("agentId", agentId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

