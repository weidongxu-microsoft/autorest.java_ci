// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.AzureADAdministratorInner;
import com.azure.resourcemanager.mysql.generated.models.AdministratorName;
import com.azure.resourcemanager.mysql.generated.models.AdministratorType;
import com.azure.resourcemanager.mysql.generated.models.AzureADAdministrator;

public final class AzureADAdministratorImpl
    implements AzureADAdministrator, AzureADAdministrator.Definition, AzureADAdministrator.Update {
    private AzureADAdministratorInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AdministratorType administratorType() {
        return this.innerModel().administratorType();
    }

    public String login() {
        return this.innerModel().login();
    }

    public String sid() {
        return this.innerModel().sid();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String identityResourceId() {
        return this.innerModel().identityResourceId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AzureADAdministratorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private AdministratorName administratorName;

    public AzureADAdministratorImpl withExistingFlexibleServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public AzureADAdministrator create() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .createOrUpdate(resourceGroupName, serverName, administratorName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureADAdministrator create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .createOrUpdate(resourceGroupName, serverName, administratorName, this.innerModel(), context);
        return this;
    }

    AzureADAdministratorImpl(AdministratorName name,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = new AzureADAdministratorInner();
        this.serviceManager = serviceManager;
        this.administratorName = name;
    }

    public AzureADAdministratorImpl update() {
        return this;
    }

    public AzureADAdministrator apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .createOrUpdate(resourceGroupName, serverName, administratorName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureADAdministrator apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .createOrUpdate(resourceGroupName, serverName, administratorName, this.innerModel(), context);
        return this;
    }

    AzureADAdministratorImpl(AzureADAdministratorInner innerObject,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "flexibleServers");
        this.administratorName = AdministratorName
            .fromString(ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "administrators"));
    }

    public AzureADAdministrator refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .getWithResponse(resourceGroupName, serverName, administratorName, Context.NONE)
            .getValue();
        return this;
    }

    public AzureADAdministrator refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureADAdministrators()
            .getWithResponse(resourceGroupName, serverName, administratorName, context)
            .getValue();
        return this;
    }

    public AzureADAdministratorImpl withAdministratorType(AdministratorType administratorType) {
        this.innerModel().withAdministratorType(administratorType);
        return this;
    }

    public AzureADAdministratorImpl withLogin(String login) {
        this.innerModel().withLogin(login);
        return this;
    }

    public AzureADAdministratorImpl withSid(String sid) {
        this.innerModel().withSid(sid);
        return this;
    }

    public AzureADAdministratorImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }

    public AzureADAdministratorImpl withIdentityResourceId(String identityResourceId) {
        this.innerModel().withIdentityResourceId(identityResourceId);
        return this;
    }
}
