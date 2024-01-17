// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.RestorePointCollectionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RestorePointInner;
import com.azure.resourcemanager.compute.generated.models.RestorePoint;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollection;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionExpandOptions;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionSourceProperties;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RestorePointCollectionImpl
    implements RestorePointCollection, RestorePointCollection.Definition, RestorePointCollection.Update {
    private RestorePointCollectionInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

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

    public RestorePointCollectionSourceProperties source() {
        return this.innerModel().source();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String restorePointCollectionId() {
        return this.innerModel().restorePointCollectionId();
    }

    public List<RestorePoint> restorePoints() {
        List<RestorePointInner> inner = this.innerModel().restorePoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new RestorePointImpl(inner1, this.manager())).collect(Collectors.toList()));
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

    public RestorePointCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String restorePointCollectionName;

    private RestorePointCollectionUpdate updateParameters;

    public RestorePointCollectionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RestorePointCollection create() {
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .createOrUpdateWithResponse(resourceGroupName, restorePointCollectionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public RestorePointCollection create(Context context) {
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .createOrUpdateWithResponse(resourceGroupName, restorePointCollectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    RestorePointCollectionImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new RestorePointCollectionInner();
        this.serviceManager = serviceManager;
        this.restorePointCollectionName = name;
    }

    public RestorePointCollectionImpl update() {
        this.updateParameters = new RestorePointCollectionUpdate();
        return this;
    }

    public RestorePointCollection apply() {
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .updateWithResponse(resourceGroupName, restorePointCollectionName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public RestorePointCollection apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .updateWithResponse(resourceGroupName, restorePointCollectionName, updateParameters, context).getValue();
        return this;
    }

    RestorePointCollectionImpl(RestorePointCollectionInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.restorePointCollectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "restorePointCollections");
    }

    public RestorePointCollection refresh() {
        RestorePointCollectionExpandOptions localExpand = null;
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .getByResourceGroupWithResponse(resourceGroupName, restorePointCollectionName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public RestorePointCollection refresh(Context context) {
        RestorePointCollectionExpandOptions localExpand = null;
        this.innerObject = serviceManager.serviceClient().getRestorePointCollections()
            .getByResourceGroupWithResponse(resourceGroupName, restorePointCollectionName, localExpand, context)
            .getValue();
        return this;
    }

    public RestorePointCollectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RestorePointCollectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RestorePointCollectionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public RestorePointCollectionImpl withSource(RestorePointCollectionSourceProperties source) {
        if (isInCreateMode()) {
            this.innerModel().withSource(source);
            return this;
        } else {
            this.updateParameters.withSource(source);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
