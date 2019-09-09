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

case class Ticket (
  id: Option[String] = None,
  ownerContactid: Option[String] = None,
  ownerEmail: Option[String] = None,
  ownerName: Option[String] = None,
  departmentid: Option[String] = None,
  agentid: Option[String] = None,
  /* <br> I - init<br> N - new<br> T - chatting<br> P - calling<br> R - resolved<br> X - deleted<br> B - spam<br> A - answered<br> C - open<br> W - postponed */
  status: Option[TicketEnums.Status] = None,
  tags: Option[Seq[String]] = None,
  code: Option[String] = None,
  /* <br> E - email<br> B - contact button<br> M - contact form<br> I - invitation<br> C - call<br> W - call button<br> F - facebook<br> A - facebook message<br> T - twitter<br> H - weibo<br> J - weibo private<br> D - tencent<br> N - tencent private<br> Q - forum<br> S - suggestion */
  channelType: Option[String] = None,
  dateCreated: Option[String] = None,
  dateChanged: Option[String] = None,
  dateResolved: Option[String] = None,
  dateDue: Option[String] = None,
  dateDeleted: Option[String] = None,
  lastActivity: Option[String] = None,
  lastActivityPublic: Option[String] = None,
  publicAccessUrlcode: Option[String] = None,
  subject: Option[String] = None,
  customFields: Option[Seq[CustomFields]] = None
) extends ApiModel

object TicketEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val `I` = Value("I")
    val `N` = Value("N")
    val `T` = Value("T")
    val `P` = Value("P")
    val `R` = Value("R")
    val `X` = Value("X")
    val `B` = Value("B")
    val `A` = Value("A")
    val `C` = Value("C")
    val `W` = Value("W")
  }

}

