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

case class CallStatus (
  /* O (callee offline), Q (waiting in queue), R (ringing to an agent), C (calling with an agent), F (finished) */
  status: CallStatusEnums.Status,
  agent: Option[CallAgent] = None,
  queue_position: Option[Double] = None
) extends ApiModel

object CallStatusEnums {
    sealed trait Status extends ApiEnum

    object Status {
        case object `O` extends Status { val value = "O" }
        case object `Q` extends Status { val value = "Q" }
        case object `R` extends Status { val value = "R" }
        case object `C` extends Status { val value = "C" }
        case object `F` extends Status { val value = "F" }

        def fromString(value: String): Status = value match {
          case "O" =>
            Status.`O`
          case "Q" =>
            Status.`Q`
          case "R" =>
            Status.`R`
          case "C" =>
            Status.`C`
          case "F" =>
            Status.`F`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Status")
        }
    }

}

