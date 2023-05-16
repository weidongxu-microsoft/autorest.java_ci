// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.generated.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.generated.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.generated.models.Namespace;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceSku;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.generated.models.TlsVersion;
import com.azure.resourcemanager.eventgrid.generated.models.TopicSpacesConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.TopicsConfiguration;
import com.azure.resourcemanager.eventgrid.generated.models.UpdateTopicSpacesConfigurationInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class NamespaceImpl implements Namespace, Namespace.Definition, Namespace.Update {
    private NamespaceInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

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

    public NamespaceSku sku() {
        return this.innerModel().sku();
    }

    public IdentityInfo identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public NamespaceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public TopicsConfiguration topicsConfiguration() {
        return this.innerModel().topicsConfiguration();
    }

    public TopicSpacesConfiguration topicSpacesConfiguration() {
        return this.innerModel().topicSpacesConfiguration();
    }

    public Boolean isZoneRedundant() {
        return this.innerModel().isZoneRedundant();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<InboundIpRule> inboundIpRules() {
        List<InboundIpRule> inner = this.innerModel().inboundIpRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TlsVersion minimumTlsVersionAllowed() {
        return this.innerModel().minimumTlsVersionAllowed();
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

    public NamespaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private NamespaceUpdateParameters updateNamespaceUpdateParameters;

    public NamespaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Namespace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdate(resourceGroupName, namespaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Namespace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdate(resourceGroupName, namespaceName, this.innerModel(), context);
        return this;
    }

    NamespaceImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new NamespaceInner();
        this.serviceManager = serviceManager;
        this.namespaceName = name;
    }

    public NamespaceImpl update() {
        this.updateNamespaceUpdateParameters = new NamespaceUpdateParameters();
        return this;
    }

    public Namespace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .update(resourceGroupName, namespaceName, updateNamespaceUpdateParameters, Context.NONE);
        return this;
    }

    public Namespace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .update(resourceGroupName, namespaceName, updateNamespaceUpdateParameters, context);
        return this;
    }

    NamespaceImpl(
        NamespaceInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
    }

    public Namespace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Namespace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getByResourceGroupWithResponse(resourceGroupName, namespaceName, context)
                .getValue();
        return this;
    }

    public Response<NamespaceSharedAccessKeys> listSharedAccessKeysWithResponse(Context context) {
        return serviceManager.namespaces().listSharedAccessKeysWithResponse(resourceGroupName, namespaceName, context);
    }

    public NamespaceSharedAccessKeys listSharedAccessKeys() {
        return serviceManager.namespaces().listSharedAccessKeys(resourceGroupName, namespaceName);
    }

    public NamespaceSharedAccessKeys regenerateKey(NamespaceRegenerateKeyRequest regenerateKeyRequest) {
        return serviceManager.namespaces().regenerateKey(resourceGroupName, namespaceName, regenerateKeyRequest);
    }

    public NamespaceSharedAccessKeys regenerateKey(
        NamespaceRegenerateKeyRequest regenerateKeyRequest, Context context) {
        return serviceManager
            .namespaces()
            .regenerateKey(resourceGroupName, namespaceName, regenerateKeyRequest, context);
    }

    public NamespaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NamespaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NamespaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateNamespaceUpdateParameters.withTags(tags);
            return this;
        }
    }

    public NamespaceImpl withSku(NamespaceSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateNamespaceUpdateParameters.withSku(sku);
            return this;
        }
    }

    public NamespaceImpl withIdentity(IdentityInfo identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateNamespaceUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public NamespaceImpl withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.innerModel().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    public NamespaceImpl withTopicsConfiguration(TopicsConfiguration topicsConfiguration) {
        this.innerModel().withTopicsConfiguration(topicsConfiguration);
        return this;
    }

    public NamespaceImpl withTopicSpacesConfiguration(TopicSpacesConfiguration topicSpacesConfiguration) {
        this.innerModel().withTopicSpacesConfiguration(topicSpacesConfiguration);
        return this;
    }

    public NamespaceImpl withIsZoneRedundant(Boolean isZoneRedundant) {
        this.innerModel().withIsZoneRedundant(isZoneRedundant);
        return this;
    }

    public NamespaceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateNamespaceUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public NamespaceImpl withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (isInCreateMode()) {
            this.innerModel().withInboundIpRules(inboundIpRules);
            return this;
        } else {
            this.updateNamespaceUpdateParameters.withInboundIpRules(inboundIpRules);
            return this;
        }
    }

    public NamespaceImpl withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        this.innerModel().withMinimumTlsVersionAllowed(minimumTlsVersionAllowed);
        return this;
    }

    public NamespaceImpl withTopicSpacesConfiguration(UpdateTopicSpacesConfigurationInfo topicSpacesConfiguration) {
        this.updateNamespaceUpdateParameters.withTopicSpacesConfiguration(topicSpacesConfiguration);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
