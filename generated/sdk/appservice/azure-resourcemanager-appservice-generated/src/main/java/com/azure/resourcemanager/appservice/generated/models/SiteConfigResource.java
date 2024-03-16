// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigResourceInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of SiteConfigResource.
 */
public interface SiteConfigResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the numberOfWorkers property: Number of workers.
     * 
     * @return the numberOfWorkers value.
     */
    Integer numberOfWorkers();

    /**
     * Gets the defaultDocuments property: Default documents.
     * 
     * @return the defaultDocuments value.
     */
    List<String> defaultDocuments();

    /**
     * Gets the netFrameworkVersion property: .NET Framework version.
     * 
     * @return the netFrameworkVersion value.
     */
    String netFrameworkVersion();

    /**
     * Gets the phpVersion property: Version of PHP.
     * 
     * @return the phpVersion value.
     */
    String phpVersion();

    /**
     * Gets the pythonVersion property: Version of Python.
     * 
     * @return the pythonVersion value.
     */
    String pythonVersion();

    /**
     * Gets the nodeVersion property: Version of Node.js.
     * 
     * @return the nodeVersion value.
     */
    String nodeVersion();

    /**
     * Gets the powerShellVersion property: Version of PowerShell.
     * 
     * @return the powerShellVersion value.
     */
    String powerShellVersion();

    /**
     * Gets the linuxFxVersion property: Linux App Framework and version.
     * 
     * @return the linuxFxVersion value.
     */
    String linuxFxVersion();

    /**
     * Gets the windowsFxVersion property: Xenon App Framework and version.
     * 
     * @return the windowsFxVersion value.
     */
    String windowsFxVersion();

    /**
     * Gets the requestTracingEnabled property: &lt;code&gt;true&lt;/code&gt; if request tracing is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the requestTracingEnabled value.
     */
    Boolean requestTracingEnabled();

    /**
     * Gets the requestTracingExpirationTime property: Request tracing expiration time.
     * 
     * @return the requestTracingExpirationTime value.
     */
    OffsetDateTime requestTracingExpirationTime();

    /**
     * Gets the remoteDebuggingEnabled property: &lt;code&gt;true&lt;/code&gt; if remote debugging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the remoteDebuggingEnabled value.
     */
    Boolean remoteDebuggingEnabled();

    /**
     * Gets the remoteDebuggingVersion property: Remote debugging version.
     * 
     * @return the remoteDebuggingVersion value.
     */
    String remoteDebuggingVersion();

    /**
     * Gets the httpLoggingEnabled property: &lt;code&gt;true&lt;/code&gt; if HTTP logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the httpLoggingEnabled value.
     */
    Boolean httpLoggingEnabled();

    /**
     * Gets the acrUseManagedIdentityCreds property: Flag to use Managed Identity Creds for ACR pull.
     * 
     * @return the acrUseManagedIdentityCreds value.
     */
    Boolean acrUseManagedIdentityCreds();

    /**
     * Gets the acrUserManagedIdentityId property: If using user managed identity, the user managed identity ClientId.
     * 
     * @return the acrUserManagedIdentityId value.
     */
    String acrUserManagedIdentityId();

    /**
     * Gets the logsDirectorySizeLimit property: HTTP logs directory size limit.
     * 
     * @return the logsDirectorySizeLimit value.
     */
    Integer logsDirectorySizeLimit();

    /**
     * Gets the detailedErrorLoggingEnabled property: &lt;code&gt;true&lt;/code&gt; if detailed error logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the detailedErrorLoggingEnabled value.
     */
    Boolean detailedErrorLoggingEnabled();

    /**
     * Gets the publishingUsername property: Publishing user name.
     * 
     * @return the publishingUsername value.
     */
    String publishingUsername();

    /**
     * Gets the appSettings property: Application settings.
     * 
     * @return the appSettings value.
     */
    List<NameValuePair> appSettings();

    /**
     * Gets the metadata property: Application metadata. This property cannot be retrieved, since it may contain secrets.
     * 
     * @return the metadata value.
     */
    List<NameValuePair> metadata();

    /**
     * Gets the connectionStrings property: Connection strings.
     * 
     * @return the connectionStrings value.
     */
    List<ConnStringInfo> connectionStrings();

    /**
     * Gets the machineKey property: Site MachineKey.
     * 
     * @return the machineKey value.
     */
    SiteMachineKey machineKey();

    /**
     * Gets the handlerMappings property: Handler mappings.
     * 
     * @return the handlerMappings value.
     */
    List<HandlerMapping> handlerMappings();

    /**
     * Gets the documentRoot property: Document root.
     * 
     * @return the documentRoot value.
     */
    String documentRoot();

    /**
     * Gets the scmType property: SCM type.
     * 
     * @return the scmType value.
     */
    ScmType scmType();

    /**
     * Gets the use32BitWorkerProcess property: &lt;code&gt;true&lt;/code&gt; to use 32-bit worker process; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the use32BitWorkerProcess value.
     */
    Boolean use32BitWorkerProcess();

    /**
     * Gets the webSocketsEnabled property: &lt;code&gt;true&lt;/code&gt; if WebSocket is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the webSocketsEnabled value.
     */
    Boolean webSocketsEnabled();

    /**
     * Gets the alwaysOn property: &lt;code&gt;true&lt;/code&gt; if Always On is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the alwaysOn value.
     */
    Boolean alwaysOn();

    /**
     * Gets the javaVersion property: Java version.
     * 
     * @return the javaVersion value.
     */
    String javaVersion();

    /**
     * Gets the javaContainer property: Java container.
     * 
     * @return the javaContainer value.
     */
    String javaContainer();

    /**
     * Gets the javaContainerVersion property: Java container version.
     * 
     * @return the javaContainerVersion value.
     */
    String javaContainerVersion();

    /**
     * Gets the appCommandLine property: App command line to launch.
     * 
     * @return the appCommandLine value.
     */
    String appCommandLine();

    /**
     * Gets the managedPipelineMode property: Managed pipeline mode.
     * 
     * @return the managedPipelineMode value.
     */
    ManagedPipelineMode managedPipelineMode();

    /**
     * Gets the virtualApplications property: Virtual applications.
     * 
     * @return the virtualApplications value.
     */
    List<VirtualApplication> virtualApplications();

    /**
     * Gets the loadBalancing property: Site load balancing.
     * 
     * @return the loadBalancing value.
     */
    SiteLoadBalancing loadBalancing();

    /**
     * Gets the experiments property: This is work around for polymorphic types.
     * 
     * @return the experiments value.
     */
    Experiments experiments();

    /**
     * Gets the limits property: Site limits.
     * 
     * @return the limits value.
     */
    SiteLimits limits();

    /**
     * Gets the autoHealEnabled property: &lt;code&gt;true&lt;/code&gt; if Auto Heal is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the autoHealEnabled value.
     */
    Boolean autoHealEnabled();

    /**
     * Gets the autoHealRules property: Auto Heal rules.
     * 
     * @return the autoHealRules value.
     */
    AutoHealRules autoHealRules();

    /**
     * Gets the tracingOptions property: Tracing options.
     * 
     * @return the tracingOptions value.
     */
    String tracingOptions();

    /**
     * Gets the vnetName property: Virtual Network name.
     * 
     * @return the vnetName value.
     */
    String vnetName();

    /**
     * Gets the vnetRouteAllEnabled property: Virtual Network Route All enabled. This causes all outbound traffic to have Virtual Network Security Groups and User Defined Routes applied.
     * 
     * @return the vnetRouteAllEnabled value.
     */
    Boolean vnetRouteAllEnabled();

    /**
     * Gets the vnetPrivatePortsCount property: The number of private ports assigned to this app. These will be assigned dynamically on runtime.
     * 
     * @return the vnetPrivatePortsCount value.
     */
    Integer vnetPrivatePortsCount();

    /**
     * Gets the cors property: Cross-Origin Resource Sharing (CORS) settings.
     * 
     * @return the cors value.
     */
    CorsSettings cors();

    /**
     * Gets the push property: Push endpoint settings.
     * 
     * @return the push value.
     */
    PushSettings push();

    /**
     * Gets the apiDefinition property: Information about the formal API definition for the app.
     * 
     * @return the apiDefinition value.
     */
    ApiDefinitionInfo apiDefinition();

    /**
     * Gets the apiManagementConfig property: Azure API management settings linked to the app.
     * 
     * @return the apiManagementConfig value.
     */
    ApiManagementConfig apiManagementConfig();

    /**
     * Gets the autoSwapSlotName property: Auto-swap slot name.
     * 
     * @return the autoSwapSlotName value.
     */
    String autoSwapSlotName();

    /**
     * Gets the localMySqlEnabled property: &lt;code&gt;true&lt;/code&gt; to enable local MySQL; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the localMySqlEnabled value.
     */
    Boolean localMySqlEnabled();

    /**
     * Gets the managedServiceIdentityId property: Managed Service Identity Id.
     * 
     * @return the managedServiceIdentityId value.
     */
    Integer managedServiceIdentityId();

    /**
     * Gets the xManagedServiceIdentityId property: Explicit Managed Service Identity Id.
     * 
     * @return the xManagedServiceIdentityId value.
     */
    Integer xManagedServiceIdentityId();

    /**
     * Gets the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     * 
     * @return the keyVaultReferenceIdentity value.
     */
    String keyVaultReferenceIdentity();

    /**
     * Gets the ipSecurityRestrictions property: IP security restrictions for main.
     * 
     * @return the ipSecurityRestrictions value.
     */
    List<IpSecurityRestriction> ipSecurityRestrictions();

    /**
     * Gets the ipSecurityRestrictionsDefaultAction property: Default action for main access restriction if no rules are matched.
     * 
     * @return the ipSecurityRestrictionsDefaultAction value.
     */
    DefaultAction ipSecurityRestrictionsDefaultAction();

    /**
     * Gets the scmIpSecurityRestrictions property: IP security restrictions for scm.
     * 
     * @return the scmIpSecurityRestrictions value.
     */
    List<IpSecurityRestriction> scmIpSecurityRestrictions();

    /**
     * Gets the scmIpSecurityRestrictionsDefaultAction property: Default action for scm access restriction if no rules are matched.
     * 
     * @return the scmIpSecurityRestrictionsDefaultAction value.
     */
    DefaultAction scmIpSecurityRestrictionsDefaultAction();

    /**
     * Gets the scmIpSecurityRestrictionsUseMain property: IP security restrictions for scm to use main.
     * 
     * @return the scmIpSecurityRestrictionsUseMain value.
     */
    Boolean scmIpSecurityRestrictionsUseMain();

    /**
     * Gets the http20Enabled property: Http20Enabled: configures a web site to allow clients to connect over http2.0.
     * 
     * @return the http20Enabled value.
     */
    Boolean http20Enabled();

    /**
     * Gets the minTlsVersion property: MinTlsVersion: configures the minimum version of TLS required for SSL requests.
     * 
     * @return the minTlsVersion value.
     */
    SupportedTlsVersions minTlsVersion();

    /**
     * Gets the minTlsCipherSuite property: The minimum strength TLS cipher suite allowed for an application.
     * 
     * @return the minTlsCipherSuite value.
     */
    TlsCipherSuites minTlsCipherSuite();

    /**
     * Gets the scmMinTlsVersion property: ScmMinTlsVersion: configures the minimum version of TLS required for SSL requests for SCM site.
     * 
     * @return the scmMinTlsVersion value.
     */
    SupportedTlsVersions scmMinTlsVersion();

    /**
     * Gets the ftpsState property: State of FTP / FTPS service.
     * 
     * @return the ftpsState value.
     */
    FtpsState ftpsState();

    /**
     * Gets the preWarmedInstanceCount property: Number of preWarmed instances.
     * This setting only applies to the Consumption and Elastic Plans.
     * 
     * @return the preWarmedInstanceCount value.
     */
    Integer preWarmedInstanceCount();

    /**
     * Gets the functionAppScaleLimit property: Maximum number of workers that a site can scale out to.
     * This setting only applies to the Consumption and Elastic Premium Plans.
     * 
     * @return the functionAppScaleLimit value.
     */
    Integer functionAppScaleLimit();

    /**
     * Gets the elasticWebAppScaleLimit property: Maximum number of workers that a site can scale out to.
     * This setting only applies to apps in plans where ElasticScaleEnabled is &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the elasticWebAppScaleLimit value.
     */
    Integer elasticWebAppScaleLimit();

    /**
     * Gets the healthCheckPath property: Health check path.
     * 
     * @return the healthCheckPath value.
     */
    String healthCheckPath();

    /**
     * Gets the functionsRuntimeScaleMonitoringEnabled property: Gets or sets a value indicating whether functions runtime scale monitoring is enabled. When enabled,
     * the ScaleController will not monitor event sources directly, but will instead call to the
     * runtime to get scale status.
     * 
     * @return the functionsRuntimeScaleMonitoringEnabled value.
     */
    Boolean functionsRuntimeScaleMonitoringEnabled();

    /**
     * Gets the websiteTimeZone property: Sets the time zone a site uses for generating timestamps. Compatible with Linux and Windows App Service. Setting the WEBSITE_TIME_ZONE app setting takes precedence over this config. For Linux, expects tz database values https://www.iana.org/time-zones (for a quick reference see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). For Windows, expects one of the time zones listed under HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * 
     * @return the websiteTimeZone value.
     */
    String websiteTimeZone();

    /**
     * Gets the minimumElasticInstanceCount property: Number of minimum instance count for a site
     * This setting only applies to the Elastic Plans.
     * 
     * @return the minimumElasticInstanceCount value.
     */
    Integer minimumElasticInstanceCount();

    /**
     * Gets the azureStorageAccounts property: List of Azure Storage Accounts.
     * 
     * @return the azureStorageAccounts value.
     */
    Map<String, AzureStorageInfoValue> azureStorageAccounts();

    /**
     * Gets the publicNetworkAccess property: Property to allow or block all public traffic.
     * 
     * @return the publicNetworkAccess value.
     */
    String publicNetworkAccess();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigResourceInner object.
     * 
     * @return the inner object.
     */
    SiteConfigResourceInner innerModel();
}
