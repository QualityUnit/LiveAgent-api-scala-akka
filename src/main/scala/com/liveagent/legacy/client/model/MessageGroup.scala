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

  type `Type` = `Type`.Value
  type Status = Status.Value
  object `Type` extends Enumeration {
    val `M` = Value("M")
    val `C` = Value("C")
    val `P` = Value("P")
    val `V` = Value("V")
    val `1` = Value("1")
    val `I` = Value("I")
    val `U` = Value("U")
    val `Z` = Value("Z")
    val `S` = Value("S")
    val `T` = Value("T")
    val `R` = Value("R")
    val `J` = Value("J")
    val `X` = Value("X")
    val `B` = Value("B")
    val `G` = Value("G")
    val `F` = Value("F")
    val `W` = Value("W")
    val `H` = Value("H")
    val `E` = Value("E")
    val `D` = Value("D")
    val `N` = Value("N")
    val `Y` = Value("Y")
    val `A` = Value("A")
    val `K` = Value("K")
    val `O` = Value("O")
    val `Q` = Value("Q")
    val `L` = Value("L")
    val `2` = Value("2")
  }

  object Status extends Enumeration {
    val `D` = Value("D")
    val `P` = Value("P")
    val `V` = Value("V")
    val `S` = Value("S")
    val `M` = Value("M")
    val `I` = Value("I")
    val `R` = Value("R")
    val `C` = Value("C")
  }

}

