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

import com.liveagent.legacy.client.model.Device
import com.liveagent.legacy.client.model.DeviceDepartment
import com.liveagent.legacy.client.model.DeviceDepartmentList
import com.liveagent.legacy.client.model.DeviceDepartmentPlan
import com.liveagent.legacy.client.model.DeviceDepartmentPlanList
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object DevicesApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new DevicesApi(baseUrl)
}

class DevicesApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 200 : Device (Device response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param device 
   */
  def createDevice(device: Option[Device] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Device] =
    ApiRequest[Device](ApiMethods.POST, baseUrl, "/devices", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(device)
      .withSuccessResponse[Device](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DeviceDepartmentPlan] (Device department response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   * @param plan 
   */
  def createDeviceDepartmentPlans(deviceId: Int, departmentId: String, plan: Option[DeviceDepartmentPlanList] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DeviceDepartmentPlan]] =
    ApiRequest[Seq[DeviceDepartmentPlan]](ApiMethods.POST, baseUrl, "/devices/{deviceId}/departments/{departmentId}/plans", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(plan)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[Seq[DeviceDepartmentPlan]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Any (Device was updated)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   */
  def deleteDevice(deviceId: Int)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/devices/{deviceId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a device department
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   */
  def deleteDeviceDepartment(deviceId: Int, departmentId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/devices/{deviceId}/departments/{departmentId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a device department plans
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 404 : ErrorResponse (Device or department was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   */
  def deleteDeviceDepartmentPlans(deviceId: Int, departmentId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/devices/{deviceId}/departments/{departmentId}/plans", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Deletes a device departments
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param device 
   */
  def deleteDeviceDepartments(deviceId: Int, device: Option[DeviceDepartmentList] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.DELETE, baseUrl, "/devices/{deviceId}/departments", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(device)
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Device (Device response)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   */
  def getDevice(deviceId: Int)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Device] =
    ApiRequest[Device](ApiMethods.GET, baseUrl, "/devices/{deviceId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[Device](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : DeviceDepartment (Device department response)
   *   code 404 : ErrorResponse (Device department was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   */
  def getDeviceDepartment(deviceId: Int, departmentId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[DeviceDepartment] =
    ApiRequest[DeviceDepartment](ApiMethods.GET, baseUrl, "/devices/{deviceId}/departments/{departmentId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[DeviceDepartment](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DeviceDepartmentPlan] (Device department response)
   *   code 404 : ErrorResponse (Device department was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   */
  def getDeviceDepartmentPlan(deviceId: Int, departmentId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DeviceDepartmentPlan]] =
    ApiRequest[Seq[DeviceDepartmentPlan]](ApiMethods.GET, baseUrl, "/devices/{deviceId}/departments/{departmentId}/plans", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[Seq[DeviceDepartmentPlan]](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DeviceDepartment] (Device departments response)
   *   code 206 : Seq[DeviceDepartment] (Device departments response)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param page Page to display. Not used if _from is defined.
   * @param perPage Results per page. Used only if _page is used.
   * @param from Result set start. Takes precedence over _page.
   * @param to Result set end. Used only if _from is used.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param sortFields 'Sort fields (json object {column:direction, ...}).'<br> Direction can be:<br> - \"ASC\" (ascending)<br> - \"DESC\" (descending) If _sortFields is defined, _sortField and _sortDir is ignored.
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   */
  def getDeviceDepartments(deviceId: Int, page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, sortFields: Option[String] = None, filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DeviceDepartment]] =
    ApiRequest[Seq[DeviceDepartment]](ApiMethods.GET, baseUrl, "/devices/{deviceId}/departments", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_sortFields", sortFields)
      .withQueryParam("_filters", filters)
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[Seq[DeviceDepartment]](200)
      .withErrorResponse[Seq[DeviceDepartment]](206)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DeviceDepartment] (Device departments response)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param departmentId 
   */
  def getDeviceDepartmentsByDepartmentId(departmentId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DeviceDepartment]] =
    ApiRequest[Seq[DeviceDepartment]](ApiMethods.GET, baseUrl, "/devices/departments/{departmentId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[Seq[DeviceDepartment]](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Device] (Device response)
   *   code 206 : Seq[Device] (Device response)
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
  def getDevicesList(page: Option[Int] = None, perPage: Option[Int] = None, from: Option[Int] = None, to: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Device]] =
    ApiRequest[Seq[Device]](ApiMethods.GET, baseUrl, "/devices", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withSuccessResponse[Seq[Device]](200)
      .withErrorResponse[Seq[Device]](206)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[Device] (Device response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   */
  def getMyMobileDevicesList()(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Device]] =
    ApiRequest[Seq[Device]](ApiMethods.GET, baseUrl, "/devices/_app_/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withSuccessResponse[Seq[Device]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Device (Device was updated)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param device 
   */
  def updateDevice(deviceId: Int, device: Option[Device] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Device] =
    ApiRequest[Device](ApiMethods.PUT, baseUrl, "/devices/{deviceId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(device)
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[Device](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : DeviceDepartment (Device was updated)
   *   code 404 : ErrorResponse (Device was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   * @param deviceDepartment 
   */
  def updateDeviceDepartment(deviceId: Int, departmentId: String, deviceDepartment: Option[DeviceDepartment] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[DeviceDepartment] =
    ApiRequest[DeviceDepartment](ApiMethods.PUT, baseUrl, "/devices/{deviceId}/departments/{departmentId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(deviceDepartment)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[DeviceDepartment](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : DeviceDepartmentPlan (Device department plan was updated)
   *   code 404 : ErrorResponse (Device department plan was not found)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceId 
   * @param departmentId 
   * @param deviceDepartmentPlan 
   */
  def updateDeviceDepartmentPlan(deviceId: Int, departmentId: String, deviceDepartmentPlan: Option[DeviceDepartmentPlan] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[DeviceDepartmentPlan] =
    ApiRequest[DeviceDepartmentPlan](ApiMethods.PUT, baseUrl, "/devices/{deviceId}/departments/{departmentId}/plans", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(deviceDepartmentPlan)
      .withPathParam("deviceId", deviceId)
      .withPathParam("departmentId", departmentId)
      .withSuccessResponse[DeviceDepartmentPlan](200)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Expected answers:
   *   code 200 : Seq[DeviceDepartment] (Device departments response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param deviceDepartments 
   */
  def updateDeviceDepartments(deviceDepartments: Option[DeviceDepartmentList] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DeviceDepartment]] =
    ApiRequest[Seq[DeviceDepartment]](ApiMethods.PUT, baseUrl, "/devices/departments/update", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(deviceDepartments)
      .withSuccessResponse[Seq[DeviceDepartment]](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

