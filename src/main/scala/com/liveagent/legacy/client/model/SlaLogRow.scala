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

case class SlaLogRow (
  id: Option[String] = None,
  conversationid: Option[String] = None,
  code: Option[String] = None,
  slaTicketId: Option[String] = None,
  departmentid: Option[String] = None,
  departmentName: Option[String] = None,
  levelid: Option[String] = None,
  slaLevelName: Option[String] = None,
  sla: Option[String] = None,
  dateCreated: Option[String] = None,
  dateClosed: Option[String] = None,
  dateDue: Option[String] = None,
  slaLevelId: Option[String] = None,
  slaType: Option[DateTime] = None,
  agentid: Option[String] = None,
  agentFirstname: Option[String] = None,
  agentLastname: Option[String] = None,
  agentAvatarUrl: Option[String] = None,
  reqContactid: Option[String] = None,
  reqFirstname: Option[String] = None,
  reqLastname: Option[String] = None,
  reqSystemname: Option[String] = None,
  reqAvatarUrl: Option[String] = None
) extends ApiModel


