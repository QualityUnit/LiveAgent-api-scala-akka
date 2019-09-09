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

case class ApiKeyWithPrivileges (
  id: Option[Double] = None,
  key: Option[String] = None,
  validToDate: Option[String] = None,
  role: Option[String] = None,
  name: Option[String] = None,
  /* - A - API - C - Chat - P - Phone - T - Ticket - W - Web (Agent Panel) */
  `type`: Option[ApiKeyWithPrivilegesEnums.`Type`] = None,
  installid: Option[String] = None,
  userid: Option[String] = None,
  whitelist: Option[String] = None,
  privileges: Option[Seq[ApiPrivilege]] = None
) extends ApiModel

object ApiKeyWithPrivilegesEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val `A` = Value("A")
    val `C` = Value("C")
    val `P` = Value("P")
    val `T` = Value("T")
    val `W` = Value("W")
  }

}

