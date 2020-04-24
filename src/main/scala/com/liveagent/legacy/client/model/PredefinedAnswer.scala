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

import org.json4s.MappingException

case class PredefinedAnswer (
  id: String,
  userid: Option[String] = None,
  departmentid: Option[String] = None,
  name: Option[String] = None,
  subject: Option[String] = None,
  body: Option[String] = None,
  /* Format of body field: T - text, H - html */
  format: Option[PredefinedAnswerEnums.Format] = None
) extends ApiModel

object PredefinedAnswerEnums {
    sealed trait Format extends ApiEnum

    object Format {
        case object `T` extends Format { val value = "T" }
        case object `H` extends Format { val value = "H" }

        def fromString(value: String): Format = value match {
          case "T" =>
            Format.`T`
          case "H" =>
            Format.`H`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Format")
        }
    }

}

