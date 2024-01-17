// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LogAnalyticsQueryPackQueryInner;
import com.azure.resourcemanager.operationalinsights.generated.models.LogAnalyticsQueryPackQuery;
import com.azure.resourcemanager.operationalinsights.generated.models.LogAnalyticsQueryPackQueryPropertiesRelated;
import com.azure.resourcemanager.operationalinsights.generated.models.SystemDataAutoGenerated;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class LogAnalyticsQueryPackQueryImpl
    implements LogAnalyticsQueryPackQuery, LogAnalyticsQueryPackQuery.Definition, LogAnalyticsQueryPackQuery.Update {
    private LogAnalyticsQueryPackQueryInner innerObject;

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

    public SystemDataAutoGenerated systemData() {
        return this.innerModel().systemData();
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public OffsetDateTime timeModified() {
        return this.innerModel().timeModified();
    }

    public String author() {
        return this.innerModel().author();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String body() {
        return this.innerModel().body();
    }

    public LogAnalyticsQueryPackQueryPropertiesRelated related() {
        return this.innerModel().related();
    }

    public Map<String, List<String>> tags() {
        Map<String, List<String>> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public LogAnalyticsQueryPackQueryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String queryPackName;

    private String id;

    public LogAnalyticsQueryPackQueryImpl withExistingQueryPack(String resourceGroupName, String queryPackName) {
        this.resourceGroupName = resourceGroupName;
        this.queryPackName = queryPackName;
        return this;
    }

    public LogAnalyticsQueryPackQuery create() {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .putWithResponse(resourceGroupName, queryPackName, id, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public LogAnalyticsQueryPackQuery create(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .putWithResponse(resourceGroupName, queryPackName, id, this.innerModel(), context).getValue();
        return this;
    }

    LogAnalyticsQueryPackQueryImpl(String name,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = new LogAnalyticsQueryPackQueryInner();
        this.serviceManager = serviceManager;
        this.id = name;
    }

    public LogAnalyticsQueryPackQueryImpl update() {
        return this;
    }

    public LogAnalyticsQueryPackQuery apply() {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .updateWithResponse(resourceGroupName, queryPackName, id, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public LogAnalyticsQueryPackQuery apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .updateWithResponse(resourceGroupName, queryPackName, id, this.innerModel(), context).getValue();
        return this;
    }

    LogAnalyticsQueryPackQueryImpl(LogAnalyticsQueryPackQueryInner innerObject,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.queryPackName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "queryPacks");
        this.id = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "queries");
    }

    public LogAnalyticsQueryPackQuery refresh() {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .getWithResponse(resourceGroupName, queryPackName, id, Context.NONE).getValue();
        return this;
    }

    public LogAnalyticsQueryPackQuery refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueries()
            .getWithResponse(resourceGroupName, queryPackName, id, context).getValue();
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withTags(Map<String, List<String>> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withBody(String body) {
        this.innerModel().withBody(body);
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withRelated(LogAnalyticsQueryPackQueryPropertiesRelated related) {
        this.innerModel().withRelated(related);
        return this;
    }

    public LogAnalyticsQueryPackQueryImpl withProperties(Object properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
