// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.azurekusto.generated.models.AcceptedAudiences;
import com.azure.resourcemanager.azurekusto.generated.models.AzureSku;
import com.azure.resourcemanager.azurekusto.generated.models.Cluster;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterNetworkAccessFlag;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterUpdate;
import com.azure.resourcemanager.azurekusto.generated.models.DiagnoseVirtualNetworkResult;
import com.azure.resourcemanager.azurekusto.generated.models.EngineType;
import com.azure.resourcemanager.azurekusto.generated.models.FollowerDatabaseDefinition;
import com.azure.resourcemanager.azurekusto.generated.models.Identity;
import com.azure.resourcemanager.azurekusto.generated.models.KeyVaultProperties;
import com.azure.resourcemanager.azurekusto.generated.models.LanguageExtension;
import com.azure.resourcemanager.azurekusto.generated.models.LanguageExtensionsList;
import com.azure.resourcemanager.azurekusto.generated.models.OptimizedAutoscale;
import com.azure.resourcemanager.azurekusto.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.azure.resourcemanager.azurekusto.generated.models.PublicIpType;
import com.azure.resourcemanager.azurekusto.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.azurekusto.generated.models.State;
import com.azure.resourcemanager.azurekusto.generated.models.TrustedExternalTenant;
import com.azure.resourcemanager.azurekusto.generated.models.VirtualNetworkConfiguration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

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

    public AzureSku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public State state() {
        return this.innerModel().state();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String dataIngestionUri() {
        return this.innerModel().dataIngestionUri();
    }

    public String stateReason() {
        return this.innerModel().stateReason();
    }

    public List<TrustedExternalTenant> trustedExternalTenants() {
        List<TrustedExternalTenant> inner = this.innerModel().trustedExternalTenants();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OptimizedAutoscale optimizedAutoscale() {
        return this.innerModel().optimizedAutoscale();
    }

    public Boolean enableDiskEncryption() {
        return this.innerModel().enableDiskEncryption();
    }

    public Boolean enableStreamingIngest() {
        return this.innerModel().enableStreamingIngest();
    }

    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.innerModel().virtualNetworkConfiguration();
    }

    public KeyVaultProperties keyVaultProperties() {
        return this.innerModel().keyVaultProperties();
    }

    public Boolean enablePurge() {
        return this.innerModel().enablePurge();
    }

    public LanguageExtensionsList languageExtensions() {
        return this.innerModel().languageExtensions();
    }

    public Boolean enableDoubleEncryption() {
        return this.innerModel().enableDoubleEncryption();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<String> allowedIpRangeList() {
        List<String> inner = this.innerModel().allowedIpRangeList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public EngineType engineType() {
        return this.innerModel().engineType();
    }

    public List<AcceptedAudiences> acceptedAudiences() {
        List<AcceptedAudiences> inner = this.innerModel().acceptedAudiences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableAutoStop() {
        return this.innerModel().enableAutoStop();
    }

    public ClusterNetworkAccessFlag restrictOutboundNetworkAccess() {
        return this.innerModel().restrictOutboundNetworkAccess();
    }

    public List<String> allowedFqdnList() {
        List<String> inner = this.innerModel().allowedFqdnList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PublicIpType publicIpType() {
        return this.innerModel().publicIpType();
    }

    public String virtualClusterGraduationProperties() {
        return this.innerModel().virtualClusterGraduationProperties();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
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

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private ClusterUpdate updateParameters;

    public ClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(
                    resourceGroupName, clusterName, this.innerModel(), createIfMatch, createIfNoneMatch, Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(
                    resourceGroupName, clusterName, this.innerModel(), createIfMatch, createIfNoneMatch, context);
        return this;
    }

    ClusterImpl(String name, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public ClusterImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new ClusterUpdate();
        return this;
    }

    public Cluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterName, updateParameters, updateIfMatch, Context.NONE);
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterName, updateParameters, updateIfMatch, context);
        return this;
    }

    ClusterImpl(ClusterInner innerObject, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, context)
                .getValue();
        return this;
    }

    public void stop() {
        serviceManager.clusters().stop(resourceGroupName, clusterName);
    }

    public void stop(Context context) {
        serviceManager.clusters().stop(resourceGroupName, clusterName, context);
    }

    public void start() {
        serviceManager.clusters().start(resourceGroupName, clusterName);
    }

    public void start(Context context) {
        serviceManager.clusters().start(resourceGroupName, clusterName, context);
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases() {
        return serviceManager.clusters().listFollowerDatabases(resourceGroupName, clusterName);
    }

    public PagedIterable<FollowerDatabaseDefinition> listFollowerDatabases(Context context) {
        return serviceManager.clusters().listFollowerDatabases(resourceGroupName, clusterName, context);
    }

    public void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove) {
        serviceManager.clusters().detachFollowerDatabases(resourceGroupName, clusterName, followerDatabaseToRemove);
    }

    public void detachFollowerDatabases(FollowerDatabaseDefinitionInner followerDatabaseToRemove, Context context) {
        serviceManager
            .clusters()
            .detachFollowerDatabases(resourceGroupName, clusterName, followerDatabaseToRemove, context);
    }

    public DiagnoseVirtualNetworkResult diagnoseVirtualNetwork() {
        return serviceManager.clusters().diagnoseVirtualNetwork(resourceGroupName, clusterName);
    }

    public DiagnoseVirtualNetworkResult diagnoseVirtualNetwork(Context context) {
        return serviceManager.clusters().diagnoseVirtualNetwork(resourceGroupName, clusterName, context);
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions() {
        return serviceManager.clusters().listLanguageExtensions(resourceGroupName, clusterName);
    }

    public PagedIterable<LanguageExtension> listLanguageExtensions(Context context) {
        return serviceManager.clusters().listLanguageExtensions(resourceGroupName, clusterName, context);
    }

    public void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd) {
        serviceManager.clusters().addLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToAdd);
    }

    public void addLanguageExtensions(LanguageExtensionsList languageExtensionsToAdd, Context context) {
        serviceManager
            .clusters()
            .addLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToAdd, context);
    }

    public void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove) {
        serviceManager.clusters().removeLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToRemove);
    }

    public void removeLanguageExtensions(LanguageExtensionsList languageExtensionsToRemove, Context context) {
        serviceManager
            .clusters()
            .removeLanguageExtensions(resourceGroupName, clusterName, languageExtensionsToRemove, context);
    }

    public ClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ClusterImpl withSku(AzureSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ClusterImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public ClusterImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ClusterImpl withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants) {
        if (isInCreateMode()) {
            this.innerModel().withTrustedExternalTenants(trustedExternalTenants);
            return this;
        } else {
            this.updateParameters.withTrustedExternalTenants(trustedExternalTenants);
            return this;
        }
    }

    public ClusterImpl withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale) {
        if (isInCreateMode()) {
            this.innerModel().withOptimizedAutoscale(optimizedAutoscale);
            return this;
        } else {
            this.updateParameters.withOptimizedAutoscale(optimizedAutoscale);
            return this;
        }
    }

    public ClusterImpl withEnableDiskEncryption(Boolean enableDiskEncryption) {
        if (isInCreateMode()) {
            this.innerModel().withEnableDiskEncryption(enableDiskEncryption);
            return this;
        } else {
            this.updateParameters.withEnableDiskEncryption(enableDiskEncryption);
            return this;
        }
    }

    public ClusterImpl withEnableStreamingIngest(Boolean enableStreamingIngest) {
        if (isInCreateMode()) {
            this.innerModel().withEnableStreamingIngest(enableStreamingIngest);
            return this;
        } else {
            this.updateParameters.withEnableStreamingIngest(enableStreamingIngest);
            return this;
        }
    }

    public ClusterImpl withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualNetworkConfiguration(virtualNetworkConfiguration);
            return this;
        } else {
            this.updateParameters.withVirtualNetworkConfiguration(virtualNetworkConfiguration);
            return this;
        }
    }

    public ClusterImpl withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        if (isInCreateMode()) {
            this.innerModel().withKeyVaultProperties(keyVaultProperties);
            return this;
        } else {
            this.updateParameters.withKeyVaultProperties(keyVaultProperties);
            return this;
        }
    }

    public ClusterImpl withEnablePurge(Boolean enablePurge) {
        if (isInCreateMode()) {
            this.innerModel().withEnablePurge(enablePurge);
            return this;
        } else {
            this.updateParameters.withEnablePurge(enablePurge);
            return this;
        }
    }

    public ClusterImpl withLanguageExtensions(LanguageExtensionsList languageExtensions) {
        if (isInCreateMode()) {
            this.innerModel().withLanguageExtensions(languageExtensions);
            return this;
        } else {
            this.updateParameters.withLanguageExtensions(languageExtensions);
            return this;
        }
    }

    public ClusterImpl withEnableDoubleEncryption(Boolean enableDoubleEncryption) {
        if (isInCreateMode()) {
            this.innerModel().withEnableDoubleEncryption(enableDoubleEncryption);
            return this;
        } else {
            this.updateParameters.withEnableDoubleEncryption(enableDoubleEncryption);
            return this;
        }
    }

    public ClusterImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public ClusterImpl withAllowedIpRangeList(List<String> allowedIpRangeList) {
        if (isInCreateMode()) {
            this.innerModel().withAllowedIpRangeList(allowedIpRangeList);
            return this;
        } else {
            this.updateParameters.withAllowedIpRangeList(allowedIpRangeList);
            return this;
        }
    }

    public ClusterImpl withEngineType(EngineType engineType) {
        if (isInCreateMode()) {
            this.innerModel().withEngineType(engineType);
            return this;
        } else {
            this.updateParameters.withEngineType(engineType);
            return this;
        }
    }

    public ClusterImpl withAcceptedAudiences(List<AcceptedAudiences> acceptedAudiences) {
        if (isInCreateMode()) {
            this.innerModel().withAcceptedAudiences(acceptedAudiences);
            return this;
        } else {
            this.updateParameters.withAcceptedAudiences(acceptedAudiences);
            return this;
        }
    }

    public ClusterImpl withEnableAutoStop(Boolean enableAutoStop) {
        if (isInCreateMode()) {
            this.innerModel().withEnableAutoStop(enableAutoStop);
            return this;
        } else {
            this.updateParameters.withEnableAutoStop(enableAutoStop);
            return this;
        }
    }

    public ClusterImpl withRestrictOutboundNetworkAccess(ClusterNetworkAccessFlag restrictOutboundNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withRestrictOutboundNetworkAccess(restrictOutboundNetworkAccess);
            return this;
        } else {
            this.updateParameters.withRestrictOutboundNetworkAccess(restrictOutboundNetworkAccess);
            return this;
        }
    }

    public ClusterImpl withAllowedFqdnList(List<String> allowedFqdnList) {
        if (isInCreateMode()) {
            this.innerModel().withAllowedFqdnList(allowedFqdnList);
            return this;
        } else {
            this.updateParameters.withAllowedFqdnList(allowedFqdnList);
            return this;
        }
    }

    public ClusterImpl withPublicIpType(PublicIpType publicIpType) {
        if (isInCreateMode()) {
            this.innerModel().withPublicIpType(publicIpType);
            return this;
        } else {
            this.updateParameters.withPublicIpType(publicIpType);
            return this;
        }
    }

    public ClusterImpl withVirtualClusterGraduationProperties(String virtualClusterGraduationProperties) {
        this.innerModel().withVirtualClusterGraduationProperties(virtualClusterGraduationProperties);
        return this;
    }

    public ClusterImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public ClusterImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
