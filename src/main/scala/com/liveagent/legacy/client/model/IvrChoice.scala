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

case class IvrChoice (
  /* DTMF symbol of choice */
  dtmf: IvrChoiceEnums.Dtmf,
  /* URL of the sound to play */
  play: Option[String] = None,
  /* Readable name of choice */
  name: Option[String] = None,
  /* Name of IVR to continue in */
  ivr: String
) extends ApiModel

object IvrChoiceEnums {
    sealed trait Dtmf extends ApiEnum

    object Dtmf {
        case object `0` extends Dtmf { val value = "0" }
        case object `1` extends Dtmf { val value = "1" }
        case object `2` extends Dtmf { val value = "2" }
        case object `3` extends Dtmf { val value = "3" }
        case object `4` extends Dtmf { val value = "4" }
        case object `5` extends Dtmf { val value = "5" }
        case object `6` extends Dtmf { val value = "6" }
        case object `7` extends Dtmf { val value = "7" }
        case object `8` extends Dtmf { val value = "8" }
        case object `9` extends Dtmf { val value = "9" }
        case object `*` extends Dtmf { val value = "*" }
        case object `#` extends Dtmf { val value = "#" }

        def fromString(value: String): Dtmf = value match {
          case "0" =>
            Dtmf.`0`
          case "1" =>
            Dtmf.`1`
          case "2" =>
            Dtmf.`2`
          case "3" =>
            Dtmf.`3`
          case "4" =>
            Dtmf.`4`
          case "5" =>
            Dtmf.`5`
          case "6" =>
            Dtmf.`6`
          case "7" =>
            Dtmf.`7`
          case "8" =>
            Dtmf.`8`
          case "9" =>
            Dtmf.`9`
          case "*" =>
            Dtmf.`*`
          case "#" =>
            Dtmf.`#`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Dtmf")
        }
    }

}

