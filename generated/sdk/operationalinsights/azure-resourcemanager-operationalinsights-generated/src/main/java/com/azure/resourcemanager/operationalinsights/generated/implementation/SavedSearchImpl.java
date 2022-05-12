// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.SavedSearchInner;
import com.azure.resourcemanager.operationalinsights.generated.models.SavedSearch;
import com.azure.resourcemanager.operationalinsights.generated.models.Tag;
import java.util.Collections;
import java.util.List;

public final class SavedSearchImpl implements SavedSearch, SavedSearch.Definition, SavedSearch.Update {
    private SavedSearchInner innerObject;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String category() {
        return this.innerModel().category();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String query() {
        return this.innerModel().query();
    }

    public String functionAlias() {
        return this.innerModel().functionAlias();
    }

    public String functionParameters() {
        return this.innerModel().functionParameters();
    }

    public Long version() {
        return this.innerModel().version();
    }

    public List<Tag> tags() {
        List<Tag> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SavedSearchInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String savedSearchId;

    public SavedSearchImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public SavedSearch create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, savedSearchId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SavedSearch create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, savedSearchId, this.innerModel(), context)
                .getValue();
        return this;
    }

    SavedSearchImpl(
        String name, com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = new SavedSearchInner();
        this.serviceManager = serviceManager;
        this.savedSearchId = name;
    }

    public SavedSearchImpl update() {
        return this;
    }

    public SavedSearch apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, savedSearchId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SavedSearch apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, savedSearchId, this.innerModel(), context)
                .getValue();
        return this;
    }

    SavedSearchImpl(
        SavedSearchInner innerObject,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.savedSearchId = Utils.getValueFromIdByName(innerObject.id(), "savedSearches");
    }

    public SavedSearch refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .getWithResponse(resourceGroupName, workspaceName, savedSearchId, Context.NONE)
                .getValue();
        return this;
    }

    public SavedSearch refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSavedSearches()
                .getWithResponse(resourceGroupName, workspaceName, savedSearchId, context)
                .getValue();
        return this;
    }

    public SavedSearchImpl withCategory(String category) {
        this.innerModel().withCategory(category);
        return this;
    }

    public SavedSearchImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public SavedSearchImpl withQuery(String query) {
        this.innerModel().withQuery(query);
        return this;
    }

    public SavedSearchImpl withTags(List<Tag> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public SavedSearchImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public SavedSearchImpl withFunctionAlias(String functionAlias) {
        this.innerModel().withFunctionAlias(functionAlias);
        return this;
    }

    public SavedSearchImpl withFunctionParameters(String functionParameters) {
        this.innerModel().withFunctionParameters(functionParameters);
        return this;
    }

    public SavedSearchImpl withVersion(Long version) {
        this.innerModel().withVersion(version);
        return this;
    }
}
