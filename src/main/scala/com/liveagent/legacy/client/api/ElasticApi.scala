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

import com.liveagent.legacy.client.model.ElasticMessage
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.IndexStatusData
import com.liveagent.legacy.client.model.ReindexData
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object ElasticApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new ElasticApi(baseUrl)
}

class ElasticApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : IndexStatusData (Index status data)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   */
  def getIndexStatus()(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[IndexStatusData] =
    ApiRequest[IndexStatusData](ApiMethods.GET, baseUrl, "/elastic/status", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withSuccessResponse[IndexStatusData](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : ElasticMessage (Reindex response message)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param reindexData 
   */
  def reindex(reindexData: Option[ReindexData] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[ElasticMessage] =
    ApiRequest[ElasticMessage](ApiMethods.POST, baseUrl, "/elastic/reindex", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(reindexData)
      .withSuccessResponse[ElasticMessage](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : ElasticMessage (Reindex response message)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   */
  def reindexAll()(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[ElasticMessage] =
    ApiRequest[ElasticMessage](ApiMethods.POST, baseUrl, "/elastic/reindexAll", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withSuccessResponse[ElasticMessage](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

