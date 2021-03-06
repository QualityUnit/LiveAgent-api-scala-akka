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
import com.liveagent.legacy.client.model.Tag
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object TagsApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new TagsApi(baseUrl)
}

class TagsApi(baseUrl: String) {
  
  /**
   * Create new tag
   * 
   * Expected answers:
   *   code 200 : Tag (Tag that was created)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param tag 
   */
  def createTag(tag: Option[Tag] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Tag] =
    ApiRequest[Tag](ApiMethods.POST, baseUrl, "/tags", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(tag)
      .withSuccessResponse[Tag](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a tag
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param tagId 
   */
  def deleteTag(tagId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/tags/{tagId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("tagId", tagId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Tag] (Tag response)
   *   code 404 : ErrorResponse (Tag was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param tagId 
   */
  def getTagById(tagId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Tag]] =
    ApiRequest[Seq[Tag]](ApiMethods.GET, baseUrl, "/tags/{tagId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("tagId", tagId)
      .withSuccessResponse[Seq[Tag]](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Tag] (Tags response)
   *   code 206 : Seq[Tag] (Tags response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param page Page to display. Not used if _from is defined.
   * @param perPage Results per page. Used only if _page is used.
   * @param from Result set start. Takes precedence over _page.
   * @param to Result set end. Used only if _from is used.
   */
  def getTagsList(page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Tag]] =
    ApiRequest[Seq[Tag]](ApiMethods.GET, baseUrl, "/tags", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withSuccessResponse[Seq[Tag]](200)
      .withErrorResponse[Seq[Tag]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Tag] (Tag was updated)
   *   code 400 : ErrorResponse (Data is missing)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param tagId 
   * @param tag 
   */
  def updateTag(tagId: String, tag: Option[Tag] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Tag]] =
    ApiRequest[Seq[Tag]](ApiMethods.PUT, baseUrl, "/tags/{tagId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(tag)
      .withPathParam("tagId", tagId)
      .withSuccessResponse[Seq[Tag]](200)
      .withErrorResponse[ErrorResponse](400)
      .withDefaultErrorResponse[ErrorResponse]
      



}

