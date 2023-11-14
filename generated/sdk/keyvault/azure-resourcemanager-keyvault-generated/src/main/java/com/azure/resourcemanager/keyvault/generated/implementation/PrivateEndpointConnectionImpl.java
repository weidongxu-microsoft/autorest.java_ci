// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.keyvault.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.keyvault.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.keyvault.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.keyvault.generated.models.PrivateLinkServiceConnectionState;
import java.util.Collections;
import java.util.Map;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingVault(String resourceGroupName, String vaultName) {
        this.resourceGroupName = resourceGroupName;
        this.vaultName = vaultName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject
            = serviceManager.serviceClient().getPrivateEndpointConnections().putWithResponse(resourceGroupName,
                vaultName, privateEndpointConnectionName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .putWithResponse(resourceGroupName, vaultName, privateEndpointConnectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(String name,
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject
            = serviceManager.serviceClient().getPrivateEndpointConnections().putWithResponse(resourceGroupName,
                vaultName, privateEndpointConnectionName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .putWithResponse(resourceGroupName, vaultName, privateEndpointConnectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, vaultName, privateEndpointConnectionName, Context.NONE).getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, vaultName, privateEndpointConnectionName, context).getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PrivateEndpointConnectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PrivateEndpointConnectionImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PrivateEndpointConnectionImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl
        withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    public PrivateEndpointConnectionImpl
        withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }
}
