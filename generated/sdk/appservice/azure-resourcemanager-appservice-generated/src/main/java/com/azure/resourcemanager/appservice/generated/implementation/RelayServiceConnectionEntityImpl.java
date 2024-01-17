// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.RelayServiceConnectionEntityInner;
import com.azure.resourcemanager.appservice.generated.models.RelayServiceConnectionEntity;

public final class RelayServiceConnectionEntityImpl implements RelayServiceConnectionEntity,
    RelayServiceConnectionEntity.Definition, RelayServiceConnectionEntity.Update {
    private RelayServiceConnectionEntityInner innerObject;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public String entityName() {
        return this.innerModel().entityName();
    }

    public String entityConnectionString() {
        return this.innerModel().entityConnectionString();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String resourceConnectionString() {
        return this.innerModel().resourceConnectionString();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public String biztalkUri() {
        return this.innerModel().biztalkUri();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public RelayServiceConnectionEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String entityName;

    public RelayServiceConnectionEntityImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public RelayServiceConnectionEntity create() {
        this.innerObject = serviceManager.serviceClient().getWebApps().createOrUpdateRelayServiceConnectionWithResponse(
            resourceGroupName, name, entityName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public RelayServiceConnectionEntity create(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps().createOrUpdateRelayServiceConnectionWithResponse(
            resourceGroupName, name, entityName, this.innerModel(), context).getValue();
        return this;
    }

    RelayServiceConnectionEntityImpl(String name,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new RelayServiceConnectionEntityInner();
        this.serviceManager = serviceManager;
        this.entityName = name;
    }

    public RelayServiceConnectionEntityImpl update() {
        return this;
    }

    public RelayServiceConnectionEntity apply() {
        this.innerObject
            = serviceManager.serviceClient().getWebApps().updateRelayServiceConnectionWithResponse(resourceGroupName,
                name, entityName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public RelayServiceConnectionEntity apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .updateRelayServiceConnectionWithResponse(resourceGroupName, name, entityName, this.innerModel(), context)
            .getValue();
        return this;
    }

    RelayServiceConnectionEntityImpl(RelayServiceConnectionEntityInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sites");
        this.entityName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "hybridconnection");
    }

    public RelayServiceConnectionEntity refresh() {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .getRelayServiceConnectionWithResponse(resourceGroupName, name, entityName, Context.NONE).getValue();
        return this;
    }

    public RelayServiceConnectionEntity refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .getRelayServiceConnectionWithResponse(resourceGroupName, name, entityName, context).getValue();
        return this;
    }

    public RelayServiceConnectionEntityImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public RelayServiceConnectionEntityImpl withEntityName(String entityName) {
        this.innerModel().withEntityName(entityName);
        return this;
    }

    public RelayServiceConnectionEntityImpl withEntityConnectionString(String entityConnectionString) {
        this.innerModel().withEntityConnectionString(entityConnectionString);
        return this;
    }

    public RelayServiceConnectionEntityImpl withResourceType(String resourceType) {
        this.innerModel().withResourceType(resourceType);
        return this;
    }

    public RelayServiceConnectionEntityImpl withResourceConnectionString(String resourceConnectionString) {
        this.innerModel().withResourceConnectionString(resourceConnectionString);
        return this;
    }

    public RelayServiceConnectionEntityImpl withHostname(String hostname) {
        this.innerModel().withHostname(hostname);
        return this;
    }

    public RelayServiceConnectionEntityImpl withPort(Integer port) {
        this.innerModel().withPort(port);
        return this;
    }

    public RelayServiceConnectionEntityImpl withBiztalkUri(String biztalkUri) {
        this.innerModel().withBiztalkUri(biztalkUri);
        return this;
    }
}
