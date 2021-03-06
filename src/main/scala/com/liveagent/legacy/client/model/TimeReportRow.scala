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

import com.liveagent.legacy.client.core.{ApiEnum, ApiModel}
import org.joda.time.DateTime
import java.util.UUID

import org.json4s.MappingException

case class TimeReportRow (
  id: Option[Int] = None,
  agentid: Option[String] = None,
  agent: Option[String] = None,
  conversationid: Option[String] = None,
  ticket: Option[String] = None,
  parentContactid: Option[String] = None,
  company: Option[String] = None,
  contactid: Option[String] = None,
  customer: Option[String] = None,
  customerFirstname: Option[String] = None,
  customerLastname: Option[String] = None,
  customerSystemname: Option[String] = None,
  agentTicket: Option[String] = None,
  reportdate: Option[String] = None,
  reportedtime: Option[String] = None,
  reportedtimeHhmmss: Option[String] = None,
  spenttime: Option[String] = None,
  dateinvoiced: Option[String] = None,
  note: Option[String] = None,
  `type`: Option[TimeReportRowEnums.`Type`] = None
) extends ApiModel

object TimeReportRowEnums {
    sealed trait `Type` extends ApiEnum

    object `Type` {
        case object Auto extends `Type` { val value = "auto" }
        case object Manual extends `Type` { val value = "manual" }

        def fromString(value: String): `Type` = value match {
          case "auto" =>
            `Type`.Auto
          case "manual" =>
            `Type`.Manual
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to `Type`")
        }
    }

}

