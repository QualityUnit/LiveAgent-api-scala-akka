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

import com.liveagent.legacy.client.model.Coupon
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object BillingApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new BillingApi(baseUrl)
}

class BillingApi(baseUrl: String) {
  
  /**
   * Vat validity check
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * @param vatId 
   */
  def checkVat(vatId: String): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/billing/_check_vat", "application/json")
      .withQueryParam("vatId", vatId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get coupon
   * 
   * Expected answers:
   *   code 200 : Coupon (Coupon)
   *   code 0 : ErrorResponse (Error response)
   * 
   * @param couponCode 
   */
  def getCoupon(couponCode: String): ApiRequest[Coupon] =
    ApiRequest[Coupon](ApiMethods.GET, baseUrl, "/coupons/{couponCode}", "application/json")
      .withPathParam("couponCode", couponCode)
      .withSuccessResponse[Coupon](200)
      .withDefaultErrorResponse[ErrorResponse]
      



}

