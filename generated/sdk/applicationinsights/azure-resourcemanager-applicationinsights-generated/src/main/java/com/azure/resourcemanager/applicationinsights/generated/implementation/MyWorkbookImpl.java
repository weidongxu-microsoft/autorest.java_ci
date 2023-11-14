// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.MyWorkbookInner;
import com.azure.resourcemanager.applicationinsights.generated.models.MyWorkbook;
import com.azure.resourcemanager.applicationinsights.generated.models.SharedTypeKind;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MyWorkbookImpl implements MyWorkbook, MyWorkbook.Definition, MyWorkbook.Update {
    private MyWorkbookInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

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

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SharedTypeKind kind() {
        return this.innerModel().kind();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String serializedData() {
        return this.innerModel().serializedData();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String timeModified() {
        return this.innerModel().timeModified();
    }

    public String category() {
        return this.innerModel().category();
    }

    public List<String> tagsPropertiesTags() {
        List<String> inner = this.innerModel().tagsPropertiesTags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String userId() {
        return this.innerModel().userId();
    }

    public String sourceId() {
        return this.innerModel().sourceId();
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

    public MyWorkbookInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    public MyWorkbookImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public MyWorkbook create() {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public MyWorkbook create(Context context) {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), context).getValue();
        return this;
    }

    MyWorkbookImpl(String name,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = new MyWorkbookInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public MyWorkbookImpl update() {
        return this;
    }

    public MyWorkbook apply() {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .updateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public MyWorkbook apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .updateWithResponse(resourceGroupName, resourceName, this.innerModel(), context).getValue();
        return this;
    }

    MyWorkbookImpl(MyWorkbookInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "myWorkbooks");
    }

    public MyWorkbook refresh() {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
        return this;
    }

    public MyWorkbook refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getMyWorkbooks()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, context).getValue();
        return this;
    }

    public MyWorkbookImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MyWorkbookImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public MyWorkbookImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public MyWorkbookImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public MyWorkbookImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public MyWorkbookImpl withKind(SharedTypeKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public MyWorkbookImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public MyWorkbookImpl withSerializedData(String serializedData) {
        this.innerModel().withSerializedData(serializedData);
        return this;
    }

    public MyWorkbookImpl withVersion(String version) {
        this.innerModel().withVersion(version);
        return this;
    }

    public MyWorkbookImpl withCategory(String category) {
        this.innerModel().withCategory(category);
        return this;
    }

    public MyWorkbookImpl withTagsPropertiesTags(List<String> tagsPropertiesTags) {
        this.innerModel().withTagsPropertiesTags(tagsPropertiesTags);
        return this;
    }

    public MyWorkbookImpl withSourceId(String sourceId) {
        this.innerModel().withSourceId(sourceId);
        return this;
    }
}
