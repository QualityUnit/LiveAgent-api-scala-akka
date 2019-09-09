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

case class Company (
  id: Option[String] = None,
  name: Option[String] = None,
  systemName: Option[String] = None,
  description: Option[String] = None,
  avatarUrl: Option[String] = None,
  /* V - visitor, R - registered visitor */
  `type`: Option[CompanyEnums.`Type`] = None,
  dateCreated: Option[DateTime] = None,
  /* Set automatically */
  dateChanged: Option[DateTime] = None,
  language: Option[String] = None,
  city: Option[String] = None,
  countrycode: Option[String] = None,
  ip: Option[String] = None,
  emails: Option[Seq[String]] = None,
  phones: Option[Seq[String]] = None,
  groups: Option[Seq[String]] = None,
  note: Option[String] = None,
  useragent: Option[String] = None,
  screen: Option[String] = None,
  timeOffset: Option[Double] = None,
  latitude: Option[Double] = None,
  longitude: Option[Double] = None,
  customFields: Option[Seq[CustomFields]] = None
) extends ApiModel

object CompanyEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val `V` = Value("V")
    val `R` = Value("R")
  }

}

