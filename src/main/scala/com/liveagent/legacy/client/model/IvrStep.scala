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

case class IvrStep (
  /* P - play message (URL in params), R - ring to agent (optional departmentId in params), V - redirect to voicemail, D - choice (choices), G - goto (IVR name in params), T - transfer (optional ivr settings in choices {\"1\":\"online\",\"0\":\"offline\",\"9\":\"queue\"}), F - fetch next IVR steps from URL in params, I - wait for DTMF input and then fetch next IVR steps from URL in params */
  `type`: IvrStepEnums.`Type`,
  params: Option[String] = None,
  choices: Option[Seq[IvrChoice]] = None
) extends ApiModel

object IvrStepEnums {
    sealed trait `Type` extends ApiEnum

    object `Type` {
        case object `P` extends `Type` { val value = "P" }
        case object `R` extends `Type` { val value = "R" }
        case object `V` extends `Type` { val value = "V" }
        case object `D` extends `Type` { val value = "D" }
        case object `G` extends `Type` { val value = "G" }
        case object `T` extends `Type` { val value = "T" }
        case object `F` extends `Type` { val value = "F" }
        case object `I` extends `Type` { val value = "I" }

        def fromString(value: String): `Type` = value match {
          case "P" =>
            `Type`.`P`
          case "R" =>
            `Type`.`R`
          case "V" =>
            `Type`.`V`
          case "D" =>
            `Type`.`D`
          case "G" =>
            `Type`.`G`
          case "T" =>
            `Type`.`T`
          case "F" =>
            `Type`.`F`
          case "I" =>
            `Type`.`I`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to `Type`")
        }
    }

}

