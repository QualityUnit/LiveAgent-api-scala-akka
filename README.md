# api-client

LiveAgent API
- API version: 3.0.0

This page contains complete API documentation for LiveAgent software. To display additional info and examples for specific API method, just click on the method name in the list below.<br/><br/>To be able to make API requests you need to generate an API key in your admin panel first. [See this article for detailed info.](https://support.ladesk.com/741982-API-key)<br/><br/>Additional info about more advanced agent, contact or ticket API filters can be found [in this article](https://support.ladesk.com/513528-APIv3-advanced-filter-examples).<br/><br/>If you have any question or doubts regarding this API, please do not hesitate to contact our support team.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.liveagent.legacy</groupId>
  <artifactId>api-client</artifactId>
  <version>4.1.11</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.liveagent.legacy:api-client:4.1.11"
```

### SBT users

```scala
libraryDependencies += "com.liveagent.legacy" % "api-client" % "4.1.11"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentPhoneApi* | **getAgentPhone** | **GET** /agent_phone/{agentId} | Gets phone currently used by agent (use me as agentId for self)
*AgentPhoneApi* | **setAgentPhone** | **PUT** /agent_phone/{agentId} | Sets phone currently used by agent (use me as agentId for self)
*AgentsApi* | **convertRegisteredVisitor** | **POST** /agents/convert | Convert registered visitor
*AgentsApi* | **deleteAgent** | **DELETE** /agents/{userId} | Agent
*AgentsApi* | **getAgent** | **GET** /agents/{userId} | Agent
*AgentsApi* | **getAgentByEmail** | **POST** /agents/_by_email | Agent
*AgentsApi* | **getAgentStatuses** | **GET** /agents/{userId}/status | Get agent statuses in departments
*AgentsApi* | **getAgents** | **GET** /agents/ | Agent list
*AgentsApi* | **getAgentsActivity** | **GET** /agents/activity | Agent Activity list
*AgentsApi* | **loginAgent** | **POST** /agents/{userId}/_login | Login agent
*AgentsApi* | **logoutAgent** | **POST** /agents/{userId}/_logout | Logout agent
*AgentsApi* | **pauseAgent** | **POST** /agents/{userId}/_pause | Pause agent
*AgentsApi* | **undeleteAgent** | **POST** /agents/undelete | Undelete agent
*AgentsApi* | **updateAgent** | **PUT** /agents/{userId} | Update agent
*ApiApi* | **createApiKeys** | **POST** /apikeys | Creates api key
*ApiApi* | **deleteApiKey** | **DELETE** /apikeys/{apikeyId} | Deletes api key
*ApiApi* | **generateApiKey** | **POST** /apikeys/_generate | Gets new api keys
*ApiApi* | **getApiInfo** | **GET** /api/info/{apiVersion} | Gets api info
*ApiApi* | **getApiKey** | **GET** /apikeys/{apikeyId} | Gets api keys
*ApiApi* | **getApiKeys** | **GET** /apikeys | Gets api keys
*ApiApi* | **getApiPrivileges** | **GET** /api/privileges | Gets api privileges
*ApiApi* | **getApiV3KeysCount** | **GET** /api/v3/count | Gets count for api v3 keys
*ApiApi* | **login** | **POST** /apikeys/_login | Creates or returns API key from login.
*ApiApi* | **updateApiKey** | **PUT** /apikeys/{apikeyId} | Updates api key
*BansApi* | **createBan** | **POST** /bans/ | Create ban
*BansApi* | **expireBan** | **POST** /bans/{banId}/_expire | Expire ban
*BansApi* | **getBan** | **GET** /bans/{banId} | Get ban item
*BansApi* | **getBans** | **GET** /bans/ | Bans list
*BansApi* | **updateBan** | **PUT** /bans/{banId} | Update ban
*BillingApi* | **checkVat** | **POST** /billing/_check_vat | Vat validity
*BillingApi* | **getCoupon** | **GET** /coupons/{couponCode} | Coupon
*CallsApi* | **callAddMessage** | **POST** /calls/{callId}/messages | Adds a message to the call group in corresponfing ticket
*CallsApi* | **callAddRecording** | **POST** /calls/{callId}/recordings | Adds a recording to the call group in corresponfing ticket
*CallsApi* | **callAnswer** | **POST** /calls/{callId}/_answer | Set call as answered by agent
*CallsApi* | **callChangeChannelStatus** | **PUT** /calls/{callId}/channels/{channelId}/_status | Change channel status
*CallsApi* | **callCreate** | **POST** /calls/{callId} | Create new call
*CallsApi* | **callFetchIvr** | **POST** /calls/{callId}/_fetchIvr | Fetches IVR for the call from external URL
*CallsApi* | **callGetStatus** | **GET** /calls/{callId}/status | Return the status of call
*CallsApi* | **callMoveChannel** | **POST** /calls/{callId}/channels/{channelId}/_move | Moves existing channel to target call
*CallsApi* | **callRemoveChannel** | **DELETE** /calls/{callId}/channels/{channelId} | Removes channel from the call
*CallsApi* | **callReroute** | **POST** /calls/{callId}/_reroute | Let the call ring to another agent
*CallsApi* | **callRing** | **POST** /calls/{callId}/_ring | Let the call ring
*CallsApi* | **callStart** | **POST** /call/_start | Starts new outcoming / internal call
*CallsApi* | **callStartCanceled** | **POST** /call/_startCanceled | Callback that starting call canceled
*CallsApi* | **callStartFailed** | **POST** /call/_startFailed | Callback that starting call failed
*CallsApi* | **callStop** | **POST** /calls/{callId}/_stop | Stops the call
*CallsApi* | **callTransfer** | **POST** /calls/{callId}/_transfer | Transfers call to different department / agent
*CallsApi* | **confirmRing** | **POST** /calls/{callId}/_confirmRing | Confirm that call is ringing
*CallsApi* | **dtmfChannel** | **POST** /calls/{callId}/channels/{channelId}/_dtmf | Send provided DTMF to channel
*CallsApi* | **endChannel** | **POST** /calls/{callId}/channels/{channelId}/_end | End channel
*CallsApi* | **getCallsList** | **GET** /calls | Gets list of calls
*CallsApi* | **holdChannel** | **POST** /calls/{callId}/channels/{channelId}/_hold | Hold channel
*CallsApi* | **merge** | **POST** /calls/{callId}/_merge | Merge two calls
*CallsApi* | **muteChannel** | **POST** /calls/{callId}/channels/{channelId}/_mute | Mute channel
*CallsApi* | **stopRing** | **POST** /calls/{callId}/_stopRing | Stop ringing of call
*CallsApi* | **unholChannel** | **POST** /calls/{callId}/channels/{channelId}/_unhold | Unhold channel
*CallsApi* | **unmuteChannel** | **POST** /calls/{callId}/channels/{channelId}/_unmute | Unmute channel
*CannedMessagesApi* | **createCannedMessage** | **POST** /canned_messages | Create canned message
*CannedMessagesApi* | **deleteCannedMessage** | **DELETE** /canned_messages/{cannedMessageId} | Canned message
*CannedMessagesApi* | **getCannedMessage** | **GET** /canned_messages/{cannedMessageId} | Gets canned message
*CannedMessagesApi* | **getCannedMessagesList** | **GET** /canned_messages | Gets list of canned messages
*CannedMessagesApi* | **updateCannedMessage** | **PUT** /canned_messages/{cannedMessageId} | Update canned message
*ChatsApi* | **getChatsList** | **GET** /chats | Gets list of chats
*CompaniesApi* | **createCompany** | **POST** /companies | Create new company
*CompaniesApi* | **deleteCompany** | **DELETE** /companies/{companyId} | Delete company
*CompaniesApi* | **getCompaniesList** | **GET** /companies | Gets list of companies
*CompaniesApi* | **getSpecificCompany** | **GET** /companies/{companyId} | Get company by specific id
*CompaniesApi* | **updateCompany** | **PUT** /companies/{companyId} | Update company
*ContactPhonesApi* | **getContactPhone** | **GET** /contact_phones/{phone} | Get contact phone
*ContactPhonesApi* | **getContactPhonesList** | **GET** /contact_phones | Gets list of contact phones
*ContactsApi* | **createContact** | **POST** /contacts | Create new contact
*ContactsApi* | **deleteContact** | **DELETE** /contacts/{contactId} | Delete contact
*ContactsApi* | **getContactsList** | **GET** /contacts | Gets list of contacts
*ContactsApi* | **getSpecificContact** | **GET** /contacts/{contactId} | Get contact by specific id
*ContactsApi* | **patchContact** | **PATCH** /contacts/{contactId} | Update contact partially
*ContactsApi* | **registerContact** | **PUT** /contacts/{contactId}/_register | Register contact
*ContactsApi* | **updateContact** | **PUT** /contacts/{contactId} | Update whole contact
*CountriesApi* | **getCountries** | **GET** /countries/ | Country list
*CustomButtonsApi* | **createCustomButton** | **POST** /custom_buttons | Create new custom button
*CustomButtonsApi* | **deleteCustomButton** | **DELETE** /custom_buttons/{customButtonId} | Delete custom button
*CustomButtonsApi* | **getCustomButton** | **GET** /custom_buttons/{customButtonId} | Get custom button by id
*CustomButtonsApi* | **getCustomButtonsList** | **GET** /custom_buttons | Gets list of custom buttons
*CustomButtonsApi* | **updateCustomButton** | **PUT** /custom_buttons/{customButtonId} | Update custom button
*DefaultApi* | **ping** | **GET** /ping | Check that API is responding
*DepartmentsApi* | **getDepartmentList** | **GET** /departments | Gets list of departments
*DepartmentsApi* | **getSpecificDepartment** | **GET** /departments/{departmentId} | Get department by specific id
*DepartmentsApi* | **ifAgentIsInDepartment** | **GET** /departments/{departmentId}/{agentId} | Is agent is department
*DepartmentsApi* | **updateDepartmentMailAccount** | **PUT** /departments/{departmentId}/mailAccount/{mailAccountId} | Update department mail account
*DevicesApi* | **createDevice** | **POST** /devices | Create new device
*DevicesApi* | **createDeviceDepartmentPlans** | **POST** /devices/{deviceId}/departments/{departmentId}/plans | Create device department plans
*DevicesApi* | **deleteDevice** | **DELETE** /devices/{deviceId} | Delete device
*DevicesApi* | **deleteDeviceDepartment** | **DELETE** /devices/{deviceId}/departments/{departmentId} | Delete device department
*DevicesApi* | **deleteDeviceDepartmentPlans** | **DELETE** /devices/{deviceId}/departments/{departmentId}/plans | Delete device department plans
*DevicesApi* | **deleteDeviceDepartments** | **DELETE** /devices/{deviceId}/departments | Delete device departments
*DevicesApi* | **getDevice** | **GET** /devices/{deviceId} | Get device by id
*DevicesApi* | **getDeviceDepartment** | **GET** /devices/{deviceId}/departments/{departmentId} | Get device department by id
*DevicesApi* | **getDeviceDepartmentPlan** | **GET** /devices/{deviceId}/departments/{departmentId}/plans | Get device department plan
*DevicesApi* | **getDeviceDepartments** | **GET** /devices/{deviceId}/departments | Get device departments
*DevicesApi* | **getDeviceDepartmentsByDepartmentId** | **GET** /devices/departments/{departmentId} | Get device departments by department id
*DevicesApi* | **getDevicesList** | **GET** /devices | Gets list of devices
*DevicesApi* | **getMyMobileDevicesList** | **GET** /devices/_app_/ | Gets list of current agent&#39;s mobile devices. Creates new one if there are no devices.
*DevicesApi* | **updateDevice** | **PUT** /devices/{deviceId} | Update device
*DevicesApi* | **updateDeviceDepartment** | **PUT** /devices/{deviceId}/departments/{departmentId} | Update device department
*DevicesApi* | **updateDeviceDepartmentPlan** | **PUT** /devices/{deviceId}/departments/{departmentId}/plans | Update device department plan
*DevicesApi* | **updateDeviceDepartments** | **PUT** /devices/departments/update | Update device departments
*ExtensionsApi* | **getExtension** | **GET** /extensions/{extensionId} | Gets Extension
*ExtensionsApi* | **getExtensionsCount** | **GET** /extensions/count | Gets count for extensions
*ExtensionsApi* | **getExtensionsList** | **GET** /extensions | Gets list of extensions
*ExtensionsApi* | **setExtension** | **PUT** /extensions/{extensionId} | Set extension
*FilesApi* | **uploadFile** | **POST** /files | Upload new file to the system
*FiltersApi* | **createFilter** | **POST** /filters/ | Create filter
*FiltersApi* | **deleteFilter** | **DELETE** /filters/{filterId} | Delete filter
*FiltersApi* | **getFilter** | **GET** /filters/{filterId} | Get filter
*FiltersApi* | **getFilters** | **GET** /filters/ | Filters list
*FiltersApi* | **updateFilter** | **PUT** /filters/{filterId} | Update filter
*GridApi* | **getCallsSlaLogGridList** | **GET** /grid/calls/sla | Gets list of call slas for grid
*GridApi* | **getCallsSlaLogGridListCount** | **GET** /grid/calls/sla/count | Gets count of calls for tickets sla grid
*GridApi* | **getChatsSlaLogGridList** | **GET** /grid/chats/sla | Gets list of chat slas for grid
*GridApi* | **getChatsSlaLogGridListCount** | **GET** /grid/chats/sla/count | Gets count of chats for chats sla grid
*GridApi* | **getEventLogsGridList** | **GET** /grid/eventlogs | Gets list of event logs for grid
*GridApi* | **getEventLogsGridListCount** | **GET** /grid/eventlogs/count | Gets count of tickets for tickets grid
*GridApi* | **getTicketsGridList** | **GET** /grid/tickets | Gets list of tickets for tickets grid
*GridApi* | **getTicketsGridListCount** | **GET** /grid/tickets/count | Gets count of tickets for tickets grid
*GridApi* | **getTicketsSlaLogGridList** | **GET** /grid/tickets/sla | Gets list of ticket slas for grid
*GridApi* | **getTicketsSlaLogGridListCount** | **GET** /grid/tickets/sla/count | Gets count of tickets for tickets sla grid
*GroupsApi* | **createGroup** | **POST** /groups | Create contact group
*GroupsApi* | **deleteGroup** | **DELETE** /groups/{groupId} | Delete contact group
*GroupsApi* | **getGroupById** | **GET** /groups/{groupId} | Get contact group by group id
*GroupsApi* | **getGroupsList** | **GET** /groups | Gets list of contact groups
*GroupsApi* | **updateGroup** | **PUT** /groups/{groupId} | Update contact group
*HostingApi* | **getInfo** | **GET** /hosting/info | Used hosting system info
*InvoicesApi* | **dowloadInvoice** | **POST** /invoices/{invoiceNumber}/_download | Download invoice
*InvoicesApi* | **getInvoices** | **GET** /invoices/ | Invoice list
*MailAccountApi* | **getMailAccount** | **GET** /mail_accounts/{mailAccountId} | Gets mail account
*MailAccountApi* | **getMailAccountByEmailAddress** | **POST** /mail_accounts/_by_email | Gets mail account by email address
*MailAccountApi* | **getMailAccountList** | **GET** /mail_accounts | Gets list of mail accounts
*MessagesApi* | **getMessage** | **GET** /messages/{messageId} | Get message
*MicroservicesApi* | **getAgentNames** | **POST** /agent_names | Agent names
*MicroservicesApi* | **getDepartmentNames** | **POST** /department_names | Department names
*MicroservicesApi* | **getDepartments** | **GET** /principal/{principalId}/departments | Get principal departments
*MicroservicesApi* | **getRole** | **GET** /principal/{principalId}/role | Get principal role
*MicroservicesApi* | **resolveBrowser** | **POST** /principal/resolveBrowser | Resolve browser
*MicroservicesApi* | **resolveUserIdFromApiKey** | **POST** /principal/resolveUserIdFromApiKey | Get user id from apikey
*MicroservicesApi* | **resolveUserIdFromSession** | **POST** /principal/resolveUserIdFromSession | Get user id from session
*MicroservicesApi* | **resolveUserIdFromVisitorId** | **POST** /principal/resolveUserIdFromVisitorId | Get user id from visitor id
*MicroservicesApi* | **resolveVisitor** | **POST** /principal/resolveVisitor | Resolve visitor
*MicroservicesApi* | **validateCredentials** | **POST** /principal/validateCredentials | Validate principal credentials
*MicroservicesGmailApi* | **activateGmailAccount** | **POST** /gmail_accounts/{gmailAccountId}/_activate | 
*MicroservicesGmailApi* | **createGmailAccount** | **POST** /gmail_accounts/{gmailAccountId} | 
*MicroservicesGmailApi* | **deactivateGmailAccount** | **POST** /gmail_accounts/{gmailAccountId}/_deactivate | 
*MicroservicesGmailApi* | **deleteGmailAccount** | **DELETE** /gmail_accounts/{gmailAccountId} | 
*MicroservicesGmailApi* | **rejectGmailAccount** | **POST** /gmail_accounts/{gmailAccountId}/_reject | 
*MicroservicesGmailApi* | **updateGmailAccount** | **PUT** /gmail_accounts/{gmailAccountId} | 
*PageVisitsApi* | **getPageVisitByContactId** | **GET** /page_visits/{contactId}/contact | Gets a page visits
*PhoneNumbersApi* | **addNumber** | **POST** /phone_numbers | Add new number
*PhoneNumbersApi* | **getPhoneNumber** | **GET** /phone_numbers/{phoneNumberId} | Gets phone number
*PhoneNumbersApi* | **getPhoneNumbersList** | **GET** /phone_numbers | Gets list of available phone numbers
*PhoneNumbersApi* | **removePhoneNumber** | **DELETE** /phone_numbers/{phoneNumberId} | Remove phone number
*PhoneNumbersApi* | **updatePhoneNumber** | **PUT** /phone_numbers/{phoneNumberId} | Update phone number
*PhoneNumbersApi* | **updatePhoneNumberStatus** | **PUT** /phone_numbers/{phoneNumberId}/status | Update phone number status
*PhonesApi* | **createPhone** | **POST** /phones | Creates external phone
*PhonesApi* | **getPhone** | **GET** /phones/{phoneId} | Gets phone device (use _app_ for LiveAgent Phone app device and _web_ for web device)
*PhonesApi* | **getPhonesList** | **GET** /phones | Gets list of available phone devices. Special filters (userId - filter phones available for specified user only) 
*PhonesApi* | **removePhone** | **DELETE** /phones/{phoneId} | Remove phone
*PhonesApi* | **updatePhone** | **PUT** /phones/{phoneId} | Update phone
*PhonesApi* | **updatePhoneParams** | **PUT** /phones/{phoneId}/_updateParams | Update phone paramas
*PlansApi* | **getDeviceDepartmentPlan** | **GET** /devices/{deviceId}/departments/{departmentId}/plans | Get device department plan
*PredefinedAnswersApi* | **createPredefinedAnswer** | **POST** /predefined_answers | Create predefined answer
*PredefinedAnswersApi* | **deletePredefinedAnswer** | **DELETE** /predefined_answers/{predefinedAnswerId} | Predefined answer
*PredefinedAnswersApi* | **getPredefinedAnswer** | **GET** /predefined_answers/{predefinedAnswerId} | Gets canned message
*PredefinedAnswersApi* | **getPredefinedAnswersList** | **GET** /predefined_answers | Gets list of predefined answers
*PredefinedAnswersApi* | **updatePredefinedAnswer** | **PUT** /predefined_answers/{predefinedAnswerId} | Update predefined answer
*QueueApi* | **getQueueBatch** | **GET** /queue/batch/{batchId} | Retrieves the batch status and remaining items to process
*SettingsApi* | **getSettings** | **GET** /settings | Gets settings list
*SlasApi* | **getSla** | **GET** /slas/{levelId} | Gets sla
*SlasApi* | **getSlaTicketHistory** | **GET** /slas/{ticketId}/history | Gets ticket sla history
*SlasApi* | **getSlasList** | **GET** /slas | Gets list of slas
*SubscriptionsApi* | **changeAddons** | **PUT** /subscriptions/{subscriptionId}/addons/ | Addon change
*SubscriptionsApi* | **changePlan** | **POST** /subscriptions/{subscriptionId}/_upgrade | Change plan
*SubscriptionsApi* | **getActiveAddons** | **GET** /subscriptions/{subscriptionId}/addons/ | Addon list
*SubscriptionsApi* | **getBillingInfo** | **GET** /subscriptions/{subscriptionId}/billingInfo | Billing info
*SubscriptionsApi* | **getBillingMetrics** | **GET** /subscriptions/{subscriptionId}/billingMetrics | Billing metrics
*SubscriptionsApi* | **getBillingStatus** | **GET** /subscriptions/{subscriptionId}/billingStatus | Billing status
*SubscriptionsApi* | **getDomainInfo** | **GET** /subscriptions/{subscriptionId}/domain | Domain info
*SubscriptionsApi* | **getPaymentMethod** | **GET** /subscriptions/{subscriptionId}/paymentMethod | Payment method
*SubscriptionsApi* | **getPaymentProcessor** | **GET** /subscriptions/{subscriptionId}/paymentProcessor | Payment processor
*SubscriptionsApi* | **getSubscription** | **GET** /subscriptions/{subscriptionId} | Subscription
*SubscriptionsApi* | **getSubscriptionAttributes** | **GET** /subscriptions/{subscriptionId}/attributes/ | Subscription attribute list
*SubscriptionsApi* | **getSubscriptionDiscounts** | **GET** /subscriptions/{subscriptionId}/discounts | Subscription discounts
*SubscriptionsApi* | **getSubscriptionInvoices** | **GET** /subscriptions/{subscriptionId}/invoices/ | Subscription invoice list
*SubscriptionsApi* | **getUpgradeVariations** | **GET** /subscriptions/{subscriptionId}/upgradeVariations | Upgrade variation list
*SubscriptionsApi* | **resumeBilling** | **POST** /subscriptions/{subscriptionId}/_cancelStop | Restart billing
*SubscriptionsApi* | **setBillingInfo** | **PUT** /subscriptions/{subscriptionId}/billingInfo | Billing info
*SubscriptionsApi* | **setCustomDomain** | **PUT** /subscriptions/{subscriptionId}/domain | Custom domain
*SubscriptionsApi* | **setPaymentMethod** | **PUT** /subscriptions/{subscriptionId}/paymentMethod | Payment method
*SubscriptionsApi* | **setSubscriptionUsage** | **PUT** /subscriptions/{subscriptionId}/usage | Subscription usage
*SubscriptionsApi* | **stopBilling** | **POST** /subscriptions/{subscriptionId}/_stop | Stop billing
*SubscriptionsApi* | **updateApplication** | **POST** /subscriptions/{subscriptionId}/_update | Update subscription
*SubscriptionsApi* | **validateBillingInfo** | **POST** /subscriptions/{subscriptionId}/_validateBillingInfo | Test Billing info
*TagsApi* | **createTag** | **POST** /tags | Create tag
*TagsApi* | **deleteTag** | **DELETE** /tags/{tagId} | Delete tag
*TagsApi* | **getTagById** | **GET** /tags/{tagId} | Get tag by tag id
*TagsApi* | **getTagsList** | **GET** /tags | Gets list of tags
*TagsApi* | **updateTag** | **PUT** /tags/{tagId} | Update tag
*TicketsApi* | **createTicket** | **POST** /tickets | Create ticket
*TicketsApi* | **deleteTicket** | **DELETE** /tickets/{ticketId} | Deletes ticket
*TicketsApi* | **getTicket** | **GET** /tickets/{ticketId} | Gets ticket
*TicketsApi* | **getTicketAttribute** | **GET** /tickets/{ticketId}/attributes/{attributeName} | Gets ticket attribute
*TicketsApi* | **getTicketHistory** | **GET** /tickets/history | Gets ticket
*TicketsApi* | **getTicketHistoryCount** | **GET** /tickets/history/count | Gets count for ticket history
*TicketsApi* | **getTicketHistory_0** | **GET** /tickets/{ticketId}/history | Gets ticket history
*TicketsApi* | **getTicketMessageGroups** | **GET** /tickets/{ticketId}/messages | Gets ticket message groups and messages
*TicketsApi* | **getTicketSla** | **GET** /tickets/{ticketId}/sla | Gets ticket Sla
*TicketsApi* | **getTicketsList** | **GET** /tickets | Gets list of tickets
*TicketsApi* | **setTicketAttribute** | **PUT** /tickets/{ticketId}/attributes/{attributeName} | Sets ticket attribute
*TicketsApi* | **setTicketPostpone** | **PUT** /tickets/{ticketId}/postpone | Sets postpone status to ticket
*TicketsApi* | **updateTicket** | **PUT** /tickets/{ticketId} | Updates ticket
*TokenApi* | **getAccessToken** | **GET** /token | Access token
*UserApi* | **getUser** | **GET** /users/{userId} | User
*VariationsApi* | **getVariation** | **GET** /variations/{variationId} | Variation


## Documentation for Models

 - [ActiveTicket](ActiveTicket.md)
 - [Addon](Addon.md)
 - [AddonList](AddonList.md)
 - [Agent](Agent.md)
 - [AgentActivity](AgentActivity.md)
 - [AgentName](AgentName.md)
 - [AgentStatus](AgentStatus.md)
 - [AgentStatuses](AgentStatuses.md)
 - [ApiInfo](ApiInfo.md)
 - [ApiKey](ApiKey.md)
 - [ApiKeyLogin](ApiKeyLogin.md)
 - [ApiKeyValue](ApiKeyValue.md)
 - [ApiKeyWithPrivileges](ApiKeyWithPrivileges.md)
 - [ApiKeyWithPrivilegesAllOf](ApiKeyWithPrivilegesAllOf.md)
 - [ApiPrivilege](ApiPrivilege.md)
 - [AttributeSimple](AttributeSimple.md)
 - [Ban](Ban.md)
 - [BanListItem](BanListItem.md)
 - [BanListItemAllOf](BanListItemAllOf.md)
 - [Batch](Batch.md)
 - [BillingInfo](BillingInfo.md)
 - [BillingMetric](BillingMetric.md)
 - [BillingStatus](BillingStatus.md)
 - [Browser](Browser.md)
 - [BrowserId](BrowserId.md)
 - [Call](Call.md)
 - [CallAgent](CallAgent.md)
 - [CallListItem](CallListItem.md)
 - [CallMessage](CallMessage.md)
 - [CallStatus](CallStatus.md)
 - [CallTransferResult](CallTransferResult.md)
 - [CannedMessage](CannedMessage.md)
 - [ChatInformation](ChatInformation.md)
 - [Company](Company.md)
 - [CompanyAllOf](CompanyAllOf.md)
 - [CompanyListItem](CompanyListItem.md)
 - [Contact](Contact.md)
 - [ContactAllOf](ContactAllOf.md)
 - [ContactListItem](ContactListItem.md)
 - [ContactPhone](ContactPhone.md)
 - [Count](Count.md)
 - [Country](Country.md)
 - [Coupon](Coupon.md)
 - [CustomButton](CustomButton.md)
 - [CustomFields](CustomFields.md)
 - [Customer](Customer.md)
 - [DayInterval](DayInterval.md)
 - [Department](Department.md)
 - [DepartmentName](DepartmentName.md)
 - [Departments](Departments.md)
 - [Device](Device.md)
 - [DeviceDepartment](DeviceDepartment.md)
 - [DeviceDepartmentList](DeviceDepartmentList.md)
 - [DeviceDepartmentPlan](DeviceDepartmentPlan.md)
 - [DeviceDepartmentPlanList](DeviceDepartmentPlanList.md)
 - [DiscountValue](DiscountValue.md)
 - [Domain](Domain.md)
 - [EmailAddressObj](EmailAddressObj.md)
 - [ErrorResponse](ErrorResponse.md)
 - [EventLogRow](EventLogRow.md)
 - [Extension](Extension.md)
 - [Filter](Filter.md)
 - [FilterCondition](FilterCondition.md)
 - [GmailAccountSettings](GmailAccountSettings.md)
 - [Group](Group.md)
 - [HostingInfo](HostingInfo.md)
 - [Ids](Ids.md)
 - [Invoice](Invoice.md)
 - [InvoiceItem](InvoiceItem.md)
 - [InvoiceList](InvoiceList.md)
 - [Ivr](Ivr.md)
 - [IvrChoice](IvrChoice.md)
 - [IvrFetch](IvrFetch.md)
 - [IvrFetchParam](IvrFetchParam.md)
 - [IvrStep](IvrStep.md)
 - [MailAccount](MailAccount.md)
 - [Message](Message.md)
 - [MessageGroup](MessageGroup.md)
 - [PageVisit](PageVisit.md)
 - [PaymentInfo](PaymentInfo.md)
 - [PaymentMethod](PaymentMethod.md)
 - [PaymentProcessorType](PaymentProcessorType.md)
 - [PhoneDevice](PhoneDevice.md)
 - [PhoneNumber](PhoneNumber.md)
 - [PredefinedAnswer](PredefinedAnswer.md)
 - [PrincipalCredentials](PrincipalCredentials.md)
 - [Role](Role.md)
 - [SessionId](SessionId.md)
 - [Setting](Setting.md)
 - [Sla](Sla.md)
 - [SlaBusinessHours](SlaBusinessHours.md)
 - [SlaHistory](SlaHistory.md)
 - [SlaLogRow](SlaLogRow.md)
 - [SlaValues](SlaValues.md)
 - [StopReason](StopReason.md)
 - [StoredFile](StoredFile.md)
 - [Subscription](Subscription.md)
 - [Tag](Tag.md)
 - [Ticket](Ticket.md)
 - [TicketAttribute](TicketAttribute.md)
 - [TicketHistory](TicketHistory.md)
 - [TicketInformation](TicketInformation.md)
 - [TicketListItem](TicketListItem.md)
 - [TicketPostpone](TicketPostpone.md)
 - [TicketRow](TicketRow.md)
 - [TicketSla](TicketSla.md)
 - [TicketUpdatable](TicketUpdatable.md)
 - [Token](Token.md)
 - [Upgrade](Upgrade.md)
 - [UsageData](UsageData.md)
 - [User](User.md)
 - [UserId](UserId.md)
 - [Variation](Variation.md)
 - [VariationUpgrade](VariationUpgrade.md)
 - [VariationUpgrades](VariationUpgrades.md)
 - [Visitor](Visitor.md)
 - [VisitorId](VisitorId.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apikey

- **Type**: API key
- **API key parameter name**: apikey
- **Location**: HTTP header


## Author

support@qualityunit.com
