// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ApplicationGroupInner;
import com.azure.resourcemanager.eventhubs.generated.models.ApplicationGroup;
import com.azure.resourcemanager.eventhubs.generated.models.ApplicationGroupPolicy;
import java.util.Collections;
import java.util.List;

public final class ApplicationGroupImpl
    implements ApplicationGroup, ApplicationGroup.Definition, ApplicationGroup.Update {
    private ApplicationGroupInner innerObject;

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

    public Boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public String clientAppGroupIdentifier() {
        return this.innerModel().clientAppGroupIdentifier();
    }

    public List<ApplicationGroupPolicy> policies() {
        List<ApplicationGroupPolicy> inner = this.innerModel().policies();
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

    public ApplicationGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String applicationGroupName;

    public ApplicationGroupImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public ApplicationGroup create() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .createOrUpdateApplicationGroupWithResponse(resourceGroupName, namespaceName, applicationGroupName,
                this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationGroup create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .createOrUpdateApplicationGroupWithResponse(resourceGroupName, namespaceName, applicationGroupName,
                this.innerModel(), context)
            .getValue();
        return this;
    }

    ApplicationGroupImpl(String name, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = new ApplicationGroupInner();
        this.serviceManager = serviceManager;
        this.applicationGroupName = name;
    }

    public ApplicationGroupImpl update() {
        return this;
    }

    public ApplicationGroup apply() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .createOrUpdateApplicationGroupWithResponse(resourceGroupName, namespaceName, applicationGroupName,
                this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationGroup apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .createOrUpdateApplicationGroupWithResponse(resourceGroupName, namespaceName, applicationGroupName,
                this.innerModel(), context)
            .getValue();
        return this;
    }

    ApplicationGroupImpl(ApplicationGroupInner innerObject,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.applicationGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "applicationGroups");
    }

    public ApplicationGroup refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .getWithResponse(resourceGroupName, namespaceName, applicationGroupName, Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationGroup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationGroups()
            .getWithResponse(resourceGroupName, namespaceName, applicationGroupName, context)
            .getValue();
        return this;
    }

    public ApplicationGroupImpl withIsEnabled(Boolean isEnabled) {
        this.innerModel().withIsEnabled(isEnabled);
        return this;
    }

    public ApplicationGroupImpl withClientAppGroupIdentifier(String clientAppGroupIdentifier) {
        this.innerModel().withClientAppGroupIdentifier(clientAppGroupIdentifier);
        return this;
    }

    public ApplicationGroupImpl withPolicies(List<ApplicationGroupPolicy> policies) {
        this.innerModel().withPolicies(policies);
        return this;
    }
}
