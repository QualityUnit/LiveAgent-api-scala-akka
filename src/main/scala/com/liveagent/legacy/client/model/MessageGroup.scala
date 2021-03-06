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

case class MessageGroup (
  id: Option[String] = None,
  parentId: Option[String] = None,
  userid: Option[String] = None,
  userFullName: Option[String] = None,
  /* M - OFFLINE C - CHAT P - CALL V - OUTGOING_CALL 1 - INTERNAL_CALL I - INTERNAL U - INTERNAL_OFFLINE Z - INTERNAL_COLLAPSED S - STARTINFO T - TRANSFER R - RESOLVE J - POSTPONE X - DELETE B - SPAM G - TAG F - FACEBOOK W - TWITTER H - WEIBO E - WEIBO_COMMENT D - TENCENT N - TENCENT_COMMENT Y - RETWEET A - KNOWLEDGEBASE_START K - KNOWLEDGEBASE O - FORWARD Q - FORWARD_REPLY L - SPLITTED 2 - MERGED */
  `type`: Option[MessageGroupEnums.`Type`] = None,
  /* D - DELETED P - PROMOTED V - VISIBLE S - SPLITTED M - MERGED I - INITIALIZING R - CONNECTING C - CALLING */
  status: Option[MessageGroupEnums.Status] = None,
  datecreated: Option[DateTime] = None,
  datefinished: Option[DateTime] = None,
  sortOrder: Option[Int] = None,
  mailMsgId: Option[String] = None,
  pop3MsgId: Option[String] = None,
  messages: Option[Seq[Message]] = None
) extends ApiModel

object MessageGroupEnums {
    sealed trait `Type` extends ApiEnum

    object `Type` {
        case object `M` extends `Type` { val value = "M" }
        case object `C` extends `Type` { val value = "C" }
        case object `P` extends `Type` { val value = "P" }
        case object `V` extends `Type` { val value = "V" }
        case object `1` extends `Type` { val value = "1" }
        case object `I` extends `Type` { val value = "I" }
        case object `U` extends `Type` { val value = "U" }
        case object `Z` extends `Type` { val value = "Z" }
        case object `S` extends `Type` { val value = "S" }
        case object `T` extends `Type` { val value = "T" }
        case object `R` extends `Type` { val value = "R" }
        case object `J` extends `Type` { val value = "J" }
        case object `X` extends `Type` { val value = "X" }
        case object `B` extends `Type` { val value = "B" }
        case object `G` extends `Type` { val value = "G" }
        case object `F` extends `Type` { val value = "F" }
        case object `W` extends `Type` { val value = "W" }
        case object `H` extends `Type` { val value = "H" }
        case object `E` extends `Type` { val value = "E" }
        case object `D` extends `Type` { val value = "D" }
        case object `N` extends `Type` { val value = "N" }
        case object `Y` extends `Type` { val value = "Y" }
        case object `A` extends `Type` { val value = "A" }
        case object `K` extends `Type` { val value = "K" }
        case object `O` extends `Type` { val value = "O" }
        case object `Q` extends `Type` { val value = "Q" }
        case object `L` extends `Type` { val value = "L" }
        case object `2` extends `Type` { val value = "2" }

        def fromString(value: String): `Type` = value match {
          case "M" =>
            `Type`.`M`
          case "C" =>
            `Type`.`C`
          case "P" =>
            `Type`.`P`
          case "V" =>
            `Type`.`V`
          case "1" =>
            `Type`.`1`
          case "I" =>
            `Type`.`I`
          case "U" =>
            `Type`.`U`
          case "Z" =>
            `Type`.`Z`
          case "S" =>
            `Type`.`S`
          case "T" =>
            `Type`.`T`
          case "R" =>
            `Type`.`R`
          case "J" =>
            `Type`.`J`
          case "X" =>
            `Type`.`X`
          case "B" =>
            `Type`.`B`
          case "G" =>
            `Type`.`G`
          case "F" =>
            `Type`.`F`
          case "W" =>
            `Type`.`W`
          case "H" =>
            `Type`.`H`
          case "E" =>
            `Type`.`E`
          case "D" =>
            `Type`.`D`
          case "N" =>
            `Type`.`N`
          case "Y" =>
            `Type`.`Y`
          case "A" =>
            `Type`.`A`
          case "K" =>
            `Type`.`K`
          case "O" =>
            `Type`.`O`
          case "Q" =>
            `Type`.`Q`
          case "L" =>
            `Type`.`L`
          case "2" =>
            `Type`.`2`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to `Type`")
        }
    }

    sealed trait Status extends ApiEnum

    object Status {
        case object `D` extends Status { val value = "D" }
        case object `P` extends Status { val value = "P" }
        case object `V` extends Status { val value = "V" }
        case object `S` extends Status { val value = "S" }
        case object `M` extends Status { val value = "M" }
        case object `I` extends Status { val value = "I" }
        case object `R` extends Status { val value = "R" }
        case object `C` extends Status { val value = "C" }

        def fromString(value: String): Status = value match {
          case "D" =>
            Status.`D`
          case "P" =>
            Status.`P`
          case "V" =>
            Status.`V`
          case "S" =>
            Status.`S`
          case "M" =>
            Status.`M`
          case "I" =>
            Status.`I`
          case "R" =>
            Status.`R`
          case "C" =>
            Status.`C`
          case unknown =>
            throw new MappingException(s"Can't convert $unknown to Status")
        }
    }

}

