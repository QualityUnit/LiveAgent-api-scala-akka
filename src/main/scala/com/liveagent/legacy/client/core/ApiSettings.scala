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
package com.liveagent.legacy.client.core

import java.util.concurrent.TimeUnit

import akka.actor.{ ExtendedActorSystem, Extension, ExtensionKey }
import akka.http.scaladsl.model.StatusCodes.CustomStatusCode
import akka.http.scaladsl.model.headers.RawHeader
import com.typesafe.config.Config

import scala.collection.JavaConverters._
import scala.concurrent.duration.FiniteDuration

class ApiSettings(config: Config) extends Extension {
  def this(system: ExtendedActorSystem) = this(system.settings.config)

  private def cfg = config.getConfig("com.liveagent.legacy.client.apiRequest")

  val alwaysTrustCertificates: Boolean = cfg.getBoolean("trust-certificates")
  val defaultHeaders: List[RawHeader] = cfg.getConfig("default-headers").entrySet.asScala.toList.map(c => RawHeader(c.getKey, c.getValue.render))
  val connectionTimeout = FiniteDuration(cfg.getDuration("connection-timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
  val compressionEnabled: Boolean = cfg.getBoolean("compression.enabled")
  val compressionSizeThreshold: Int = cfg.getBytes("compression.size-threshold").toInt
  val customCodes: List[CustomStatusCode] = cfg.getConfigList("custom-codes").asScala.toList.map { c =>
    CustomStatusCode(
      c.getInt("code"))(
      c.getString("reason"),
      if (c.hasPath("defaultMessage")) c.getString("defaultMessage") else c.getString("reason"),
      c.getBoolean("success"),
      if (c.hasPath("allowsEntity")) c.getBoolean("allowsEntity") else true
    )
  }
}

object ApiSettings extends ExtensionKey[ApiSettings]
