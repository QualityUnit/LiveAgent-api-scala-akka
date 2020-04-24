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

case class CustomButton (
  id: Option[String] = None,
  name: Option[String] = None,
  url: String,
  method: CustomButtonEnums.Method,
  image_url: Option[String] = None,
  /* - E (External) - content will be opened in new browser tab */
  `type`: CustomButtonEnums.`Type`,
  /* - A - Active - I - Inactive */
  status: Option[CustomButtonEnums.Status] = None,
  parameters: Option[String] = None
) extends ApiModel

object CustomButtonEnums {
    sealed trait Method extends ApiEnum

    object Method {
        case object GET extends Method { val value = "GET" }
        case object POST extends Method { val value = "POST" }

        def fromString(value: String): Method = value match {
          case "GET" =>
            Method.GET
          case "POST" =>
            Method.POST
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Method")
        }
    }

    sealed trait `Type` extends ApiEnum

    object `Type` {
        case object `E` extends `Type` { val value = "E" }
        case object `B` extends `Type` { val value = "B" }

        def fromString(value: String): `Type` = value match {
          case "E" =>
            `Type`.`E`
          case "B" =>
            `Type`.`B`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to `Type`")
        }
    }

    sealed trait Status extends ApiEnum

    object Status {
        case object `A` extends Status { val value = "A" }
        case object `I` extends Status { val value = "I" }

        def fromString(value: String): Status = value match {
          case "A" =>
            Status.`A`
          case "I" =>
            Status.`I`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Status")
        }
    }

}

