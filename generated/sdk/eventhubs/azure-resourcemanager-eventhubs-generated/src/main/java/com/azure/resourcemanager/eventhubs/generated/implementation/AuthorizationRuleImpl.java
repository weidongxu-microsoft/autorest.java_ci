// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import com.azure.resourcemanager.eventhubs.generated.models.AccessKeys;
import com.azure.resourcemanager.eventhubs.generated.models.AccessRights;
import com.azure.resourcemanager.eventhubs.generated.models.AuthorizationRule;
import com.azure.resourcemanager.eventhubs.generated.models.RegenerateAccessKeyParameters;
import java.util.Collections;
import java.util.List;

public final class AuthorizationRuleImpl
    implements AuthorizationRule, AuthorizationRule.Definition, AuthorizationRule.Update {
    private AuthorizationRuleInner innerObject;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

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

    public String location() {
        return this.innerModel().location();
    }

    public List<AccessRights> rights() {
        List<AccessRights> inner = this.innerModel().rights();
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

    public AuthorizationRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String authorizationRuleName;

    public AuthorizationRuleImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public AuthorizationRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AuthorizationRuleImpl(String name, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = new AuthorizationRuleInner();
        this.serviceManager = serviceManager;
        this.authorizationRuleName = name;
    }

    public AuthorizationRuleImpl update() {
        return this;
    }

    public AuthorizationRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .createOrUpdateAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AuthorizationRuleImpl(
        AuthorizationRuleInner innerObject,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.authorizationRuleName = Utils.getValueFromIdByName(innerObject.id(), "authorizationRules");
    }

    public AuthorizationRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public AuthorizationRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamespaces()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context)
                .getValue();
        return this;
    }

    public AccessKeys listKeys() {
        return serviceManager.namespaces().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<AccessKeys> listKeysWithResponse(Context context) {
        return serviceManager
            .namespaces()
            .listKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public AccessKeys regenerateKeys(RegenerateAccessKeyParameters parameters) {
        return serviceManager
            .namespaces()
            .regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
    }

    public Response<AccessKeys> regenerateKeysWithResponse(RegenerateAccessKeyParameters parameters, Context context) {
        return serviceManager
            .namespaces()
            .regenerateKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, parameters, context);
    }

    public AuthorizationRuleImpl withRights(List<AccessRights> rights) {
        this.innerModel().withRights(rights);
        return this;
    }
}
