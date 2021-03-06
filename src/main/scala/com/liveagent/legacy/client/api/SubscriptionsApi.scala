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
package com.liveagent.legacy.client.api

import com.liveagent.legacy.client.model.Addon
import com.liveagent.legacy.client.model.AddonList
import com.liveagent.legacy.client.model.AttributeSimple
import com.liveagent.legacy.client.model.BillingInfo
import com.liveagent.legacy.client.model.BillingMetric
import com.liveagent.legacy.client.model.BillingStatus
import com.liveagent.legacy.client.model.Customer
import com.liveagent.legacy.client.model.DiscountValue
import com.liveagent.legacy.client.model.Domain
import com.liveagent.legacy.client.model.ErrorResponse
import com.liveagent.legacy.client.model.InvoiceList
import com.liveagent.legacy.client.model.PaymentInfo
import com.liveagent.legacy.client.model.PaymentMethod
import com.liveagent.legacy.client.model.PaymentProcessorType
import com.liveagent.legacy.client.model.StopReason
import com.liveagent.legacy.client.model.Subscription
import com.liveagent.legacy.client.model.Upgrade
import com.liveagent.legacy.client.model.UsageData
import com.liveagent.legacy.client.model.VariationUpgrades
import com.liveagent.legacy.client.core._
import com.liveagent.legacy.client.core.CollectionFormats._
import com.liveagent.legacy.client.core.ApiKeyLocations._

object SubscriptionsApi {

  def apply(baseUrl: String = "https://localhost/api/v3") = new SubscriptionsApi(baseUrl)
}

class SubscriptionsApi(baseUrl: String) {
  
  /**
   * Change active subscription addons
   * 
   * Expected answers:
   *   code 200 : Seq[Addon] (New subscription addons list (without price field))
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def changeAddons(subscriptionId: String, body: Option[AddonList] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Addon]] =
    ApiRequest[Seq[Addon]](ApiMethods.PUT, baseUrl, "/subscriptions/{subscriptionId}/addons/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Seq[Addon]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Upgrade subscription to another variation. In case of upgrade from paid to paid, it's possible to change country without changing payment method. If change is between EU and not EU, different payment rules might apply.
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def changePlan(subscriptionId: String, body: Option[Upgrade] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/subscriptions/{subscriptionId}/_upgrade", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Active subscription addons
   * 
   * Expected answers:
   *   code 200 : Seq[Addon] (Subscription addon list (without price field))
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getActiveAddons(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[Addon]] =
    ApiRequest[Seq[Addon]](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/addons/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Seq[Addon]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get billing info
   * 
   * Expected answers:
   *   code 200 : Customer (Billing info)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getBillingInfo(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Customer] =
    ApiRequest[Customer](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/billingInfo", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Customer](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get billing metrics
   * 
   * Expected answers:
   *   code 200 : Seq[BillingMetric] (Billing metrics)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getBillingMetrics(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[BillingMetric]] =
    ApiRequest[Seq[BillingMetric]](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/billingMetrics", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Seq[BillingMetric]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get billing status
   * 
   * Expected answers:
   *   code 200 : BillingStatus (Billing info)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getBillingStatus(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[BillingStatus] =
    ApiRequest[BillingStatus](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/billingStatus", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[BillingStatus](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get domain info
   * 
   * Expected answers:
   *   code 200 : Domain (Domain info)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getDomainInfo(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Domain] =
    ApiRequest[Domain](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/domain", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Domain](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get payment method
   * 
   * Expected answers:
   *   code 200 : PaymentInfo (Payment method info)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getPaymentMethod(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PaymentInfo] =
    ApiRequest[PaymentInfo](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/paymentMethod", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[PaymentInfo](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get payment processor to generate token for when updating payment method
   * 
   * Expected answers:
   *   code 200 : PaymentProcessorType (Payment processor type)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param paymentType 
   * @param country 
   */
  def getPaymentProcessor(subscriptionId: String, paymentType: String, country: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PaymentProcessorType] =
    ApiRequest[PaymentProcessorType](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/paymentProcessor", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("paymentType", paymentType)
      .withQueryParam("country", country)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[PaymentProcessorType](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get subscription
   * 
   * Expected answers:
   *   code 200 : Subscription (Subscription response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getSubscription(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Subscription] =
    ApiRequest[Subscription](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Subscription](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Subscription attributes list
   * 
   * Expected answers:
   *   code 200 : Seq[AttributeSimple] (Invoices response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getSubscriptionAttributes(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[AttributeSimple]] =
    ApiRequest[Seq[AttributeSimple]](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/attributes/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Seq[AttributeSimple]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Returns all active discounts for specified subscription
   * 
   * Expected answers:
   *   code 200 : Seq[DiscountValue] (Discounts)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def getSubscriptionDiscounts(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Seq[DiscountValue]] =
    ApiRequest[Seq[DiscountValue]](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/discounts", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Seq[DiscountValue]](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Subscription invoices list
   * 
   * Expected answers:
   *   code 200 : InvoiceList (Invoices response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param page Page to display. Not used if _from is defined.
   * @param perPage Results per page. Used only if _page is used.
   * @param sortDir Sorting direction ASC or DESC
   * @param sortField Sorting field
   * @param filters Filters (json object {column:value, ...} or json array [[column,operator,value], ...])
   * @param from Result set start. Takes precedence over _page.
   * @param to Result set end. Used only if _from is used.
   */
  def getSubscriptionInvoices(subscriptionId: String, page: Option[Int] = None, perPage: Option[Int] = None, sortDir: Option[String] = None, sortField: Option[String] = None, filters: Option[String] = None, from: Option[Int] = None, to: Option[Int] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[InvoiceList] =
    ApiRequest[InvoiceList](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/invoices/", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("_page", page)
      .withQueryParam("_perPage", perPage)
      .withQueryParam("_sortDir", sortDir)
      .withQueryParam("_sortField", sortField)
      .withQueryParam("_filters", filters)
      .withQueryParam("_from", from)
      .withQueryParam("_to", to)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[InvoiceList](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * List of variations user can upgrade to and their current variation.
   * 
   * Expected answers:
   *   code 200 : VariationUpgrades (Available upgrades response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param country 
   * @param vatId 
   */
  def getUpgradeVariations(subscriptionId: String, country: Option[String] = None, vatId: Option[String] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[VariationUpgrades] =
    ApiRequest[VariationUpgrades](ApiMethods.GET, baseUrl, "/subscriptions/{subscriptionId}/upgradeVariations", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withQueryParam("country", country)
      .withQueryParam("vatId", vatId)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[VariationUpgrades](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * If account billing is stopped, restart it.
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def resumeBilling(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/subscriptions/{subscriptionId}/_cancelStop", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update billing info
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def setBillingInfo(subscriptionId: String, body: Option[BillingInfo] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/subscriptions/{subscriptionId}/billingInfo", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Park custom domain on an account
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body Domain can be sent anytime. Custom domain can be sent by itself or along with both certificate and key.
   */
  def setCustomDomain(subscriptionId: String, body: Option[Domain] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/subscriptions/{subscriptionId}/domain", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update payment method
   * 
   * Expected answers:
   *   code 200 : PaymentInfo (New payment method info)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def setPaymentMethod(subscriptionId: String, body: Option[PaymentMethod] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[PaymentInfo] =
    ApiRequest[PaymentInfo](ApiMethods.PUT, baseUrl, "/subscriptions/{subscriptionId}/paymentMethod", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[PaymentInfo](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Get subscription invoices
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def setSubscriptionUsage(subscriptionId: String, body: Option[UsageData] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.PUT, baseUrl, "/subscriptions/{subscriptionId}/usage", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Stop account. Account won't be billed anymore and will continue to work till next billing date.
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param reason Reason for stopping
   */
  def stopBilling(subscriptionId: String, reason: Option[StopReason] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/subscriptions/{subscriptionId}/_stop", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(reason)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Update subscription to latest version
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   */
  def updateApplication(subscriptionId: String)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/subscriptions/{subscriptionId}/_update", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withDefaultErrorResponse[ErrorResponse]
      

  /**
   * Checks if billing info can be updated without issues. Field 'force' in BillingInfo is ignored in this call.
   * 
   * Expected answers:
   *   code 200 : Any (OK response)
   *   code 403 : ErrorResponse (When provided billing info is valid, but updating would cause payment method to be removed because of deprecation.)
   *   code 404 : ErrorResponse (When some parts of provided billing info are missing or invalid.)
   *   code 0 : ErrorResponse (Error response)
   * 
   * Available security schemes:
   *   apikey (apiKey)
   * 
   * @param subscriptionId 
   * @param body 
   */
  def validateBillingInfo(subscriptionId: String, body: Option[BillingInfo] = None)(implicit apiKeyValueFromRequest: ApiKeyValueFromRequest): ApiRequest[Any] =
    ApiRequest[Any](ApiMethods.POST, baseUrl, "/subscriptions/{subscriptionId}/_validateBillingInfo", "application/json")
      .withApiKey(apiKeyValueFromRequest, "apikey", HEADER)
      .withBody(body)
      .withPathParam("subscriptionId", subscriptionId)
      .withSuccessResponse[Any](200)
      .withErrorResponse[ErrorResponse](403)
      .withErrorResponse[ErrorResponse](404)
      .withDefaultErrorResponse[ErrorResponse]
      



}

