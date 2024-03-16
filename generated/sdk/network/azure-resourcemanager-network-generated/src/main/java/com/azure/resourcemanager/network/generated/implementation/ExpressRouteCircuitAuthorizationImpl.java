// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitAuthorizationInner;
import com.azure.resourcemanager.network.generated.models.AuthorizationUseStatus;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitAuthorization;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class ExpressRouteCircuitAuthorizationImpl implements ExpressRouteCircuitAuthorization,
    ExpressRouteCircuitAuthorization.Definition, ExpressRouteCircuitAuthorization.Update {
    private ExpressRouteCircuitAuthorizationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String authorizationKey() {
        return this.innerModel().authorizationKey();
    }

    public AuthorizationUseStatus authorizationUseStatus() {
        return this.innerModel().authorizationUseStatus();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ExpressRouteCircuitAuthorizationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String circuitName;

    private String authorizationName;

    public ExpressRouteCircuitAuthorizationImpl withExistingExpressRouteCircuit(String resourceGroupName,
        String circuitName) {
        this.resourceGroupName = resourceGroupName;
        this.circuitName = circuitName;
        return this;
    }

    public ExpressRouteCircuitAuthorization create() {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteCircuitAuthorization create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, this.innerModel(), context);
        return this;
    }

    ExpressRouteCircuitAuthorizationImpl(String name,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new ExpressRouteCircuitAuthorizationInner();
        this.serviceManager = serviceManager;
        this.authorizationName = name;
    }

    public ExpressRouteCircuitAuthorizationImpl update() {
        return this;
    }

    public ExpressRouteCircuitAuthorization apply() {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ExpressRouteCircuitAuthorization apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .createOrUpdate(resourceGroupName, circuitName, authorizationName, this.innerModel(), context);
        return this;
    }

    ExpressRouteCircuitAuthorizationImpl(ExpressRouteCircuitAuthorizationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.circuitName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "expressRouteCircuits");
        this.authorizationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "authorizations");
    }

    public ExpressRouteCircuitAuthorization refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .getWithResponse(resourceGroupName, circuitName, authorizationName, Context.NONE)
            .getValue();
        return this;
    }

    public ExpressRouteCircuitAuthorization refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getExpressRouteCircuitAuthorizations()
            .getWithResponse(resourceGroupName, circuitName, authorizationName, context)
            .getValue();
        return this;
    }

    public ExpressRouteCircuitAuthorizationImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public ExpressRouteCircuitAuthorizationImpl withAuthorizationKey(String authorizationKey) {
        this.innerModel().withAuthorizationKey(authorizationKey);
        return this;
    }

    public ExpressRouteCircuitAuthorizationImpl
        withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus) {
        this.innerModel().withAuthorizationUseStatus(authorizationUseStatus);
        return this;
    }
}
