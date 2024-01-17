// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.DatabaseConnection;
import com.azure.resourcemanager.appservice.generated.models.DatabaseConnectionOverview;
import com.azure.resourcemanager.appservice.generated.models.EnterpriseGradeCdnStatus;
import com.azure.resourcemanager.appservice.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.generated.models.ResponseMessageEnvelopeRemotePrivateEndpointConnection;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.StagingEnvironmentPolicy;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteBuildProperties;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteLinkedBackend;
import com.azure.resourcemanager.appservice.generated.models.StaticSitePatchResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteResetPropertiesArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteTemplateOptions;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserInvitationRequestResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserInvitationResponseResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserProvidedFunctionApp;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteZipDeploymentArmResource;
import com.azure.resourcemanager.appservice.generated.models.StringDictionary;
import com.azure.resourcemanager.appservice.generated.models.StringList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StaticSiteArmResourceImpl
    implements StaticSiteArmResource, StaticSiteArmResource.Definition, StaticSiteArmResource.Update {
    private StaticSiteArmResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SkuDescription sku() {
        return this.innerModel().sku();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String defaultHostname() {
        return this.innerModel().defaultHostname();
    }

    public String repositoryUrl() {
        return this.innerModel().repositoryUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public List<String> customDomains() {
        List<String> inner = this.innerModel().customDomains();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String repositoryToken() {
        return this.innerModel().repositoryToken();
    }

    public StaticSiteBuildProperties buildProperties() {
        return this.innerModel().buildProperties();
    }

    public List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> privateEndpointConnections() {
        List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> inner
            = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StagingEnvironmentPolicy stagingEnvironmentPolicy() {
        return this.innerModel().stagingEnvironmentPolicy();
    }

    public Boolean allowConfigFileUpdates() {
        return this.innerModel().allowConfigFileUpdates();
    }

    public StaticSiteTemplateOptions templateProperties() {
        return this.innerModel().templateProperties();
    }

    public String contentDistributionEndpoint() {
        return this.innerModel().contentDistributionEndpoint();
    }

    public String keyVaultReferenceIdentity() {
        return this.innerModel().keyVaultReferenceIdentity();
    }

    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        List<StaticSiteUserProvidedFunctionApp> inner = this.innerModel().userProvidedFunctionApps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<StaticSiteLinkedBackend> linkedBackends() {
        List<StaticSiteLinkedBackend> inner = this.innerModel().linkedBackends();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provider() {
        return this.innerModel().provider();
    }

    public EnterpriseGradeCdnStatus enterpriseGradeCdnStatus() {
        return this.innerModel().enterpriseGradeCdnStatus();
    }

    public String publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<DatabaseConnectionOverview> databaseConnections() {
        List<DatabaseConnectionOverview> inner = this.innerModel().databaseConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StaticSiteArmResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private StaticSitePatchResource updateStaticSiteEnvelope;

    public StaticSiteArmResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StaticSiteArmResource create() {
        this.innerObject = serviceManager.serviceClient().getStaticSites().createOrUpdateStaticSite(resourceGroupName,
            name, this.innerModel(), Context.NONE);
        return this;
    }

    public StaticSiteArmResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getStaticSites().createOrUpdateStaticSite(resourceGroupName,
            name, this.innerModel(), context);
        return this;
    }

    StaticSiteArmResourceImpl(String name,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new StaticSiteArmResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public StaticSiteArmResourceImpl update() {
        this.updateStaticSiteEnvelope = new StaticSitePatchResource();
        return this;
    }

    public StaticSiteArmResource apply() {
        this.innerObject = serviceManager.serviceClient().getStaticSites()
            .updateStaticSiteWithResponse(resourceGroupName, name, updateStaticSiteEnvelope, Context.NONE).getValue();
        return this;
    }

    public StaticSiteArmResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getStaticSites()
            .updateStaticSiteWithResponse(resourceGroupName, name, updateStaticSiteEnvelope, context).getValue();
        return this;
    }

    StaticSiteArmResourceImpl(StaticSiteArmResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "staticSites");
    }

    public StaticSiteArmResource refresh() {
        this.innerObject = serviceManager.serviceClient().getStaticSites()
            .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
        return this;
    }

    public StaticSiteArmResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getStaticSites()
            .getByResourceGroupWithResponse(resourceGroupName, name, context).getValue();
        return this;
    }

    public Response<StaticSiteUserInvitationResponseResource> createUserRolesInvitationLinkWithResponse(
        StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope, Context context) {
        return serviceManager.staticSites().createUserRolesInvitationLinkWithResponse(resourceGroupName, name,
            staticSiteUserRolesInvitationEnvelope, context);
    }

    public StaticSiteUserInvitationResponseResource
        createUserRolesInvitationLink(StaticSiteUserInvitationRequestResource staticSiteUserRolesInvitationEnvelope) {
        return serviceManager.staticSites().createUserRolesInvitationLink(resourceGroupName, name,
            staticSiteUserRolesInvitationEnvelope);
    }

    public void detachStaticSite() {
        serviceManager.staticSites().detachStaticSite(resourceGroupName, name);
    }

    public void detachStaticSite(Context context) {
        serviceManager.staticSites().detachStaticSite(resourceGroupName, name, context);
    }

    public Response<StringDictionary> listStaticSiteAppSettingsWithResponse(Context context) {
        return serviceManager.staticSites().listStaticSiteAppSettingsWithResponse(resourceGroupName, name, context);
    }

    public StringDictionary listStaticSiteAppSettings() {
        return serviceManager.staticSites().listStaticSiteAppSettings(resourceGroupName, name);
    }

    public Response<StringList> listStaticSiteConfiguredRolesWithResponse(Context context) {
        return serviceManager.staticSites().listStaticSiteConfiguredRolesWithResponse(resourceGroupName, name, context);
    }

    public StringList listStaticSiteConfiguredRoles() {
        return serviceManager.staticSites().listStaticSiteConfiguredRoles(resourceGroupName, name);
    }

    public Response<StringDictionary> listStaticSiteFunctionAppSettingsWithResponse(Context context) {
        return serviceManager.staticSites().listStaticSiteFunctionAppSettingsWithResponse(resourceGroupName, name,
            context);
    }

    public StringDictionary listStaticSiteFunctionAppSettings() {
        return serviceManager.staticSites().listStaticSiteFunctionAppSettings(resourceGroupName, name);
    }

    public Response<StringDictionary> listStaticSiteSecretsWithResponse(Context context) {
        return serviceManager.staticSites().listStaticSiteSecretsWithResponse(resourceGroupName, name, context);
    }

    public StringDictionary listStaticSiteSecrets() {
        return serviceManager.staticSites().listStaticSiteSecrets(resourceGroupName, name);
    }

    public Response<Void> resetStaticSiteApiKeyWithResponse(
        StaticSiteResetPropertiesArmResource resetPropertiesEnvelope, Context context) {
        return serviceManager.staticSites().resetStaticSiteApiKeyWithResponse(resourceGroupName, name,
            resetPropertiesEnvelope, context);
    }

    public void resetStaticSiteApiKey(StaticSiteResetPropertiesArmResource resetPropertiesEnvelope) {
        serviceManager.staticSites().resetStaticSiteApiKey(resourceGroupName, name, resetPropertiesEnvelope);
    }

    public PagedIterable<DatabaseConnection> getDatabaseConnectionsWithDetails() {
        return serviceManager.staticSites().getDatabaseConnectionsWithDetails(resourceGroupName, name);
    }

    public PagedIterable<DatabaseConnection> getDatabaseConnectionsWithDetails(Context context) {
        return serviceManager.staticSites().getDatabaseConnectionsWithDetails(resourceGroupName, name, context);
    }

    public void createZipDeploymentForStaticSite(StaticSiteZipDeploymentArmResource staticSiteZipDeploymentEnvelope) {
        serviceManager.staticSites().createZipDeploymentForStaticSite(resourceGroupName, name,
            staticSiteZipDeploymentEnvelope);
    }

    public void createZipDeploymentForStaticSite(StaticSiteZipDeploymentArmResource staticSiteZipDeploymentEnvelope,
        Context context) {
        serviceManager.staticSites().createZipDeploymentForStaticSite(resourceGroupName, name,
            staticSiteZipDeploymentEnvelope, context);
    }

    public StaticSiteArmResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public StaticSiteArmResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public StaticSiteArmResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StaticSiteArmResourceImpl withSku(SkuDescription sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public StaticSiteArmResourceImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public StaticSiteArmResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withKind(kind);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withRepositoryUrl(String repositoryUrl) {
        if (isInCreateMode()) {
            this.innerModel().withRepositoryUrl(repositoryUrl);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withRepositoryUrl(repositoryUrl);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withBranch(String branch) {
        if (isInCreateMode()) {
            this.innerModel().withBranch(branch);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withBranch(branch);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withRepositoryToken(String repositoryToken) {
        if (isInCreateMode()) {
            this.innerModel().withRepositoryToken(repositoryToken);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withRepositoryToken(repositoryToken);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withBuildProperties(StaticSiteBuildProperties buildProperties) {
        if (isInCreateMode()) {
            this.innerModel().withBuildProperties(buildProperties);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withBuildProperties(buildProperties);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withStagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withStagingEnvironmentPolicy(stagingEnvironmentPolicy);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withStagingEnvironmentPolicy(stagingEnvironmentPolicy);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withAllowConfigFileUpdates(Boolean allowConfigFileUpdates) {
        if (isInCreateMode()) {
            this.innerModel().withAllowConfigFileUpdates(allowConfigFileUpdates);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withAllowConfigFileUpdates(allowConfigFileUpdates);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withTemplateProperties(StaticSiteTemplateOptions templateProperties) {
        if (isInCreateMode()) {
            this.innerModel().withTemplateProperties(templateProperties);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withTemplateProperties(templateProperties);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withProvider(String provider) {
        if (isInCreateMode()) {
            this.innerModel().withProvider(provider);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withProvider(provider);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withEnterpriseGradeCdnStatus(EnterpriseGradeCdnStatus enterpriseGradeCdnStatus) {
        if (isInCreateMode()) {
            this.innerModel().withEnterpriseGradeCdnStatus(enterpriseGradeCdnStatus);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withEnterpriseGradeCdnStatus(enterpriseGradeCdnStatus);
            return this;
        }
    }

    public StaticSiteArmResourceImpl withPublicNetworkAccess(String publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateStaticSiteEnvelope.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
