// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.SchemaGroupInner;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaCompatibility;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaGroup;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class SchemaGroupImpl implements SchemaGroup, SchemaGroup.Definition, SchemaGroup.Update {
    private SchemaGroupInner innerObject;

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

    public OffsetDateTime updatedAtUtc() {
        return this.innerModel().updatedAtUtc();
    }

    public OffsetDateTime createdAtUtc() {
        return this.innerModel().createdAtUtc();
    }

    public UUID etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> groupProperties() {
        Map<String, String> inner = this.innerModel().groupProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SchemaCompatibility schemaCompatibility() {
        return this.innerModel().schemaCompatibility();
    }

    public SchemaType schemaType() {
        return this.innerModel().schemaType();
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

    public SchemaGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String schemaGroupName;

    public SchemaGroupImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public SchemaGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, schemaGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SchemaGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, schemaGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SchemaGroupImpl(String name, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = new SchemaGroupInner();
        this.serviceManager = serviceManager;
        this.schemaGroupName = name;
    }

    public SchemaGroupImpl update() {
        return this;
    }

    public SchemaGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, schemaGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SchemaGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, schemaGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SchemaGroupImpl(
        SchemaGroupInner innerObject, com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.schemaGroupName = Utils.getValueFromIdByName(innerObject.id(), "schemagroups");
    }

    public SchemaGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .getWithResponse(resourceGroupName, namespaceName, schemaGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public SchemaGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSchemaRegistries()
                .getWithResponse(resourceGroupName, namespaceName, schemaGroupName, context)
                .getValue();
        return this;
    }

    public SchemaGroupImpl withGroupProperties(Map<String, String> groupProperties) {
        this.innerModel().withGroupProperties(groupProperties);
        return this;
    }

    public SchemaGroupImpl withSchemaCompatibility(SchemaCompatibility schemaCompatibility) {
        this.innerModel().withSchemaCompatibility(schemaCompatibility);
        return this;
    }

    public SchemaGroupImpl withSchemaType(SchemaType schemaType) {
        this.innerModel().withSchemaType(schemaType);
        return this;
    }
}
