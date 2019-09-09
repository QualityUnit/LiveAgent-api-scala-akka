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
package com.liveagent.legacy.client.model

import com.liveagent.legacy.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class BillingStatus (
  /* N - No billing A - Billing active S = Billing stopped  */
  status: Option[BillingStatusEnums.Status] = None,
  validToDate: Option[DateTime] = None,
  nextBillingDate: Option[DateTime] = None,
  /* Number of charge errors since last successful billing or account unsuspend. */
  errors: Option[Int] = None,
  /* Time an date of the last failed charge attempt. Only present if number or errors is greater than 0. */
  lastErrorDate: Option[DateTime] = None,
  /* True if used payment method is fully compatible with selected country, false otherwise. False when either payment method or country is not set. */
  paymentCompatible: Option[Boolean] = None
) extends ApiModel

object BillingStatusEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val `N` = Value("N")
    val `A` = Value("A")
    val `S` = Value("S")
  }

}

