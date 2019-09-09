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
package com.liveagent.legacy.client.core

sealed trait ResponseState

object ResponseState {

  case object Success extends ResponseState

  case object Error extends ResponseState

}

case class ApiRequest[U](
  // required fields
  method: ApiMethod,
  basePath: String,
  operationPath: String,
  contentType: String,

  // optional fields
  responses: Map[Int, (Manifest[_], ResponseState)] = Map.empty,
  bodyParam: Option[Any] = None,
  formParams: Map[String, Any] = Map.empty,
  pathParams: Map[String, Any] = Map.empty,
  queryParams: Map[String, Any] = Map.empty,
  headerParams: Map[String, Any] = Map.empty,
  credentials: Seq[Credentials] = List.empty) {

  def withCredentials(cred: Credentials): ApiRequest[U] = copy[U](credentials = credentials :+ cred)

  def withApiKey(key: ApiKeyValue, keyName: String, location: ApiKeyLocation): ApiRequest[U] = withCredentials(ApiKeyCredentials(key, keyName, location))

  def withSuccessResponse[T](code: Int)(implicit m: Manifest[T]): ApiRequest[U] = copy[U](responses = responses + (code -> (m, ResponseState.Success)))

  def withErrorResponse[T](code: Int)(implicit m: Manifest[T]): ApiRequest[U] = copy[U](responses = responses + (code -> (m, ResponseState.Error)))

  def withDefaultSuccessResponse[T](implicit m: Manifest[T]): ApiRequest[U] = withSuccessResponse[T](0)

  def withDefaultErrorResponse[T](implicit m: Manifest[T]): ApiRequest[U] = withErrorResponse[T](0)

  def responseForCode(statusCode: Int): Option[(Manifest[_], ResponseState)] = responses.get(statusCode) orElse responses.get(0)

  def withoutBody(): ApiRequest[U] = copy[U](bodyParam = None)

  def withBody(body: Any): ApiRequest[U] = copy[U](bodyParam = Some(body))

  def withFormParam(name: String, value: Any): ApiRequest[U] = copy[U](formParams = formParams + (name -> value))

  def withPathParam(name: String, value: Any): ApiRequest[U] = copy[U](pathParams = pathParams + (name -> value))

  def withQueryParam(name: String, value: Any): ApiRequest[U] = copy[U](queryParams = queryParams + (name -> value))

  def withHeaderParam(name: String, value: Any): ApiRequest[U] = copy[U](headerParams = headerParams + (name -> value))
}
