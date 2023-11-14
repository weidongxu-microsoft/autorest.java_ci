// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.search.generated.fluent.models.SearchServiceInner;
import com.azure.resourcemanager.search.generated.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.search.generated.models.DataPlaneAuthOptions;
import com.azure.resourcemanager.search.generated.models.EncryptionWithCmk;
import com.azure.resourcemanager.search.generated.models.HostingMode;
import com.azure.resourcemanager.search.generated.models.Identity;
import com.azure.resourcemanager.search.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.search.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.search.generated.models.ProvisioningState;
import com.azure.resourcemanager.search.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.search.generated.models.SearchSemanticSearch;
import com.azure.resourcemanager.search.generated.models.SearchService;
import com.azure.resourcemanager.search.generated.models.SearchServiceStatus;
import com.azure.resourcemanager.search.generated.models.SearchServiceUpdate;
import com.azure.resourcemanager.search.generated.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.search.generated.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class SearchServiceImpl implements SearchService, SearchService.Definition, SearchService.Update {
    private SearchServiceInner innerObject;

    private final com.azure.resourcemanager.search.generated.SearchManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public Integer replicaCount() {
        return this.innerModel().replicaCount();
    }

    public Integer partitionCount() {
        return this.innerModel().partitionCount();
    }

    public HostingMode hostingMode() {
        return this.innerModel().hostingMode();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public SearchServiceStatus status() {
        return this.innerModel().status();
    }

    public String statusDetails() {
        return this.innerModel().statusDetails();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkRuleSet networkRuleSet() {
        return this.innerModel().networkRuleSet();
    }

    public EncryptionWithCmk encryptionWithCmk() {
        return this.innerModel().encryptionWithCmk();
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public DataPlaneAuthOptions authOptions() {
        return this.innerModel().authOptions();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public SearchSemanticSearch semanticSearch() {
        return this.innerModel().semanticSearch();
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResourceInner> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new SharedPrivateLinkResourceImpl(inner1, this.manager())).collect(Collectors.toList()));
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

    public SearchServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.search.generated.SearchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String searchServiceName;

    private UUID createClientRequestId;

    private UUID updateClientRequestId;

    private SearchServiceUpdate updateServiceParam;

    public SearchServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SearchService create() {
        this.innerObject = serviceManager.serviceClient().getServices().createOrUpdate(resourceGroupName,
            searchServiceName, this.innerModel(), createClientRequestId, Context.NONE);
        return this;
    }

    public SearchService create(Context context) {
        this.innerObject = serviceManager.serviceClient().getServices().createOrUpdate(resourceGroupName,
            searchServiceName, this.innerModel(), createClientRequestId, context);
        return this;
    }

    SearchServiceImpl(String name, com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerObject = new SearchServiceInner();
        this.serviceManager = serviceManager;
        this.searchServiceName = name;
        this.createClientRequestId = null;
    }

    public SearchServiceImpl update() {
        this.updateClientRequestId = null;
        this.updateServiceParam = new SearchServiceUpdate();
        return this;
    }

    public SearchService apply() {
        this.innerObject = serviceManager.serviceClient().getServices().updateWithResponse(resourceGroupName,
            searchServiceName, updateServiceParam, updateClientRequestId, Context.NONE).getValue();
        return this;
    }

    public SearchService apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getServices().updateWithResponse(resourceGroupName,
            searchServiceName, updateServiceParam, updateClientRequestId, context).getValue();
        return this;
    }

    SearchServiceImpl(SearchServiceInner innerObject,
        com.azure.resourcemanager.search.generated.SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.searchServiceName = Utils.getValueFromIdByName(innerObject.id(), "searchServices");
    }

    public SearchService refresh() {
        UUID localClientRequestId = null;
        this.innerObject = serviceManager.serviceClient().getServices()
            .getByResourceGroupWithResponse(resourceGroupName, searchServiceName, localClientRequestId, Context.NONE)
            .getValue();
        return this;
    }

    public SearchService refresh(Context context) {
        UUID localClientRequestId = null;
        this.innerObject = serviceManager.serviceClient().getServices()
            .getByResourceGroupWithResponse(resourceGroupName, searchServiceName, localClientRequestId, context)
            .getValue();
        return this;
    }

    public SearchServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SearchServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SearchServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateServiceParam.withTags(tags);
            return this;
        }
    }

    public SearchServiceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateServiceParam.withSku(sku);
            return this;
        }
    }

    public SearchServiceImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateServiceParam.withIdentity(identity);
            return this;
        }
    }

    public SearchServiceImpl withReplicaCount(Integer replicaCount) {
        if (isInCreateMode()) {
            this.innerModel().withReplicaCount(replicaCount);
            return this;
        } else {
            this.updateServiceParam.withReplicaCount(replicaCount);
            return this;
        }
    }

    public SearchServiceImpl withPartitionCount(Integer partitionCount) {
        if (isInCreateMode()) {
            this.innerModel().withPartitionCount(partitionCount);
            return this;
        } else {
            this.updateServiceParam.withPartitionCount(partitionCount);
            return this;
        }
    }

    public SearchServiceImpl withHostingMode(HostingMode hostingMode) {
        if (isInCreateMode()) {
            this.innerModel().withHostingMode(hostingMode);
            return this;
        } else {
            this.updateServiceParam.withHostingMode(hostingMode);
            return this;
        }
    }

    public SearchServiceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateServiceParam.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public SearchServiceImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkRuleSet(networkRuleSet);
            return this;
        } else {
            this.updateServiceParam.withNetworkRuleSet(networkRuleSet);
            return this;
        }
    }

    public SearchServiceImpl withEncryptionWithCmk(EncryptionWithCmk encryptionWithCmk) {
        if (isInCreateMode()) {
            this.innerModel().withEncryptionWithCmk(encryptionWithCmk);
            return this;
        } else {
            this.updateServiceParam.withEncryptionWithCmk(encryptionWithCmk);
            return this;
        }
    }

    public SearchServiceImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        if (isInCreateMode()) {
            this.innerModel().withDisableLocalAuth(disableLocalAuth);
            return this;
        } else {
            this.updateServiceParam.withDisableLocalAuth(disableLocalAuth);
            return this;
        }
    }

    public SearchServiceImpl withAuthOptions(DataPlaneAuthOptions authOptions) {
        if (isInCreateMode()) {
            this.innerModel().withAuthOptions(authOptions);
            return this;
        } else {
            this.updateServiceParam.withAuthOptions(authOptions);
            return this;
        }
    }

    public SearchServiceImpl withSemanticSearch(SearchSemanticSearch semanticSearch) {
        if (isInCreateMode()) {
            this.innerModel().withSemanticSearch(semanticSearch);
            return this;
        } else {
            this.updateServiceParam.withSemanticSearch(semanticSearch);
            return this;
        }
    }

    public SearchServiceImpl withClientRequestId(UUID clientRequestId) {
        if (isInCreateMode()) {
            this.createClientRequestId = clientRequestId;
            return this;
        } else {
            this.updateClientRequestId = clientRequestId;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
