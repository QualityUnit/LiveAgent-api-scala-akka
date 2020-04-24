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

    import java.time.OffsetDateTime
import com.liveagent.legacy.client.core.{ApiEnum, ApiModel}

import org.json4s.MappingException

case class Message (
  id: Option[String] = None,
  userid: Option[String] = None,
  /* M - MESSAGE Y - MESSAGE_LEGACY Q - QUOTED_TEXT I - INTERNAL F - FILE T - TITLE E - END D - DISCONNECT H - HEADER R - TRANSFER S - SYSTEM U - USERAGENT G - TAG V - VOICE 1 - VOICE_INTERNAL N - NOTE L - NOTE_FILE Z - FORMFIELD A - TEXT_HEADER O - TEXT_FOOTER J - STATUS B - SPLITTED W - RANKING_FEATURE_REWARD P - RANKING_FEATURE_PUNISHMENT C - RANKING_FEATURE_COMMENT K - SYSTEM_PUBLIC X - SYSTEM_VISITOR 0 - ERROR_FOOTER 2 - MERGED 3 - INVITATION_REROUTE */
  `type`: Option[MessageEnums.`Type`] = None,
  datecreated: Option[OffsetDateTime] = None,
  /* T - TEXT H - HTML J - JSON X - TEXT_LEGACY // text with possibility of internal form links (e.g. note, ranking comment, quoted, header, footer, internal) Y - HTML_LEGACY // html with possibility of internal form links (e.g. tag) Z - JSON_LEGACY // json with possibility of internal form links (e.g. footer) */
  format: Option[MessageEnums.Format] = None,
  message: Option[String] = None,
  visibility: Option[String] = None
) extends ApiModel

object MessageEnums {
    sealed trait `Type` extends ApiEnum

    object `Type` {
        case object `M` extends `Type` { val value = "M" }
        case object `Y` extends `Type` { val value = "Y" }
        case object `Q` extends `Type` { val value = "Q" }
        case object `I` extends `Type` { val value = "I" }
        case object `F` extends `Type` { val value = "F" }
        case object `T` extends `Type` { val value = "T" }
        case object `E` extends `Type` { val value = "E" }
        case object `D` extends `Type` { val value = "D" }
        case object `H` extends `Type` { val value = "H" }
        case object `R` extends `Type` { val value = "R" }
        case object `S` extends `Type` { val value = "S" }
        case object `U` extends `Type` { val value = "U" }
        case object `G` extends `Type` { val value = "G" }
        case object `V` extends `Type` { val value = "V" }
        case object `1` extends `Type` { val value = "1" }
        case object `N` extends `Type` { val value = "N" }
        case object `L` extends `Type` { val value = "L" }
        case object `Z` extends `Type` { val value = "Z" }
        case object `A` extends `Type` { val value = "A" }
        case object `O` extends `Type` { val value = "O" }
        case object `J` extends `Type` { val value = "J" }
        case object `B` extends `Type` { val value = "B" }
        case object `W` extends `Type` { val value = "W" }
        case object `P` extends `Type` { val value = "P" }
        case object `C` extends `Type` { val value = "C" }
        case object `K` extends `Type` { val value = "K" }
        case object `X` extends `Type` { val value = "X" }
        case object `0` extends `Type` { val value = "0" }
        case object `2` extends `Type` { val value = "2" }
        case object `3` extends `Type` { val value = "3" }

        def fromString(value: String): `Type` = value match {
          case "M" =>
            `Type`.`M`
          case "Y" =>
            `Type`.`Y`
          case "Q" =>
            `Type`.`Q`
          case "I" =>
            `Type`.`I`
          case "F" =>
            `Type`.`F`
          case "T" =>
            `Type`.`T`
          case "E" =>
            `Type`.`E`
          case "D" =>
            `Type`.`D`
          case "H" =>
            `Type`.`H`
          case "R" =>
            `Type`.`R`
          case "S" =>
            `Type`.`S`
          case "U" =>
            `Type`.`U`
          case "G" =>
            `Type`.`G`
          case "V" =>
            `Type`.`V`
          case "1" =>
            `Type`.`1`
          case "N" =>
            `Type`.`N`
          case "L" =>
            `Type`.`L`
          case "Z" =>
            `Type`.`Z`
          case "A" =>
            `Type`.`A`
          case "O" =>
            `Type`.`O`
          case "J" =>
            `Type`.`J`
          case "B" =>
            `Type`.`B`
          case "W" =>
            `Type`.`W`
          case "P" =>
            `Type`.`P`
          case "C" =>
            `Type`.`C`
          case "K" =>
            `Type`.`K`
          case "X" =>
            `Type`.`X`
          case "0" =>
            `Type`.`0`
          case "2" =>
            `Type`.`2`
          case "3" =>
            `Type`.`3`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to `Type`")
        }
    }

    sealed trait Format extends ApiEnum

    object Format {
        case object `T` extends Format { val value = "T" }
        case object `H` extends Format { val value = "H" }
        case object `J` extends Format { val value = "J" }
        case object `X` extends Format { val value = "X" }
        case object `Y` extends Format { val value = "Y" }
        case object `Z` extends Format { val value = "Z" }

        def fromString(value: String): Format = value match {
          case "T" =>
            Format.`T`
          case "H" =>
            Format.`H`
          case "J" =>
            Format.`J`
          case "X" =>
            Format.`X`
          case "Y" =>
            Format.`Y`
          case "Z" =>
            Format.`Z`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Format")
        }
    }

}

