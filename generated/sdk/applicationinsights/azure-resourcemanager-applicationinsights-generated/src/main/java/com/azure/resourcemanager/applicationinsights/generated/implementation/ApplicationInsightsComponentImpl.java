// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponent;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationType;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentPurgeBody;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentPurgeResponse;
import com.azure.resourcemanager.applicationinsights.generated.models.FlowType;
import com.azure.resourcemanager.applicationinsights.generated.models.IngestionMode;
import com.azure.resourcemanager.applicationinsights.generated.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.applicationinsights.generated.models.PublicNetworkAccessType;
import com.azure.resourcemanager.applicationinsights.generated.models.RequestSource;
import com.azure.resourcemanager.applicationinsights.generated.models.TagsResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationInsightsComponentImpl implements ApplicationInsightsComponent,
    ApplicationInsightsComponent.Definition, ApplicationInsightsComponent.Update {
    private ApplicationInsightsComponentInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public String applicationId() {
        return this.innerModel().applicationId();
    }

    public String appId() {
        return this.innerModel().appId();
    }

    public ApplicationType applicationType() {
        return this.innerModel().applicationType();
    }

    public FlowType flowType() {
        return this.innerModel().flowType();
    }

    public RequestSource requestSource() {
        return this.innerModel().requestSource();
    }

    public String instrumentationKey() {
        return this.innerModel().instrumentationKey();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String hockeyAppId() {
        return this.innerModel().hockeyAppId();
    }

    public String hockeyAppToken() {
        return this.innerModel().hockeyAppToken();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Double samplingPercentage() {
        return this.innerModel().samplingPercentage();
    }

    public String connectionString() {
        return this.innerModel().connectionString();
    }

    public Integer retentionInDays() {
        return this.innerModel().retentionInDays();
    }

    public Boolean disableIpMasking() {
        return this.innerModel().disableIpMasking();
    }

    public Boolean immediatePurgeDataOn30Days() {
        return this.innerModel().immediatePurgeDataOn30Days();
    }

    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        List<PrivateLinkScopedResource> inner = this.innerModel().privateLinkScopedResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.innerModel().publicNetworkAccessForIngestion();
    }

    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.innerModel().publicNetworkAccessForQuery();
    }

    public IngestionMode ingestionMode() {
        return this.innerModel().ingestionMode();
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

    public ApplicationInsightsComponentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private TagsResource updateComponentTags;

    public ApplicationInsightsComponentImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ApplicationInsightsComponent create() {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public ApplicationInsightsComponent create(Context context) {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), context).getValue();
        return this;
    }

    ApplicationInsightsComponentImpl(String name,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = new ApplicationInsightsComponentInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public ApplicationInsightsComponentImpl update() {
        this.updateComponentTags = new TagsResource();
        return this;
    }

    public ApplicationInsightsComponent apply() {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .updateTagsWithResponse(resourceGroupName, resourceName, updateComponentTags, Context.NONE).getValue();
        return this;
    }

    public ApplicationInsightsComponent apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .updateTagsWithResponse(resourceGroupName, resourceName, updateComponentTags, context).getValue();
        return this;
    }

    ApplicationInsightsComponentImpl(ApplicationInsightsComponentInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "components");
    }

    public ApplicationInsightsComponent refresh() {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
        return this;
    }

    public ApplicationInsightsComponent refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getComponents()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, context).getValue();
        return this;
    }

    public Response<ComponentPurgeResponse> purgeWithResponse(ComponentPurgeBody body, Context context) {
        return serviceManager.components().purgeWithResponse(resourceGroupName, resourceName, body, context);
    }

    public ComponentPurgeResponse purge(ComponentPurgeBody body) {
        return serviceManager.components().purge(resourceGroupName, resourceName, body);
    }

    public ApplicationInsightsComponentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationInsightsComponentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationInsightsComponentImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ApplicationInsightsComponentImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateComponentTags.withTags(tags);
            return this;
        }
    }

    public ApplicationInsightsComponentImpl withApplicationType(ApplicationType applicationType) {
        this.innerModel().withApplicationType(applicationType);
        return this;
    }

    public ApplicationInsightsComponentImpl withFlowType(FlowType flowType) {
        this.innerModel().withFlowType(flowType);
        return this;
    }

    public ApplicationInsightsComponentImpl withRequestSource(RequestSource requestSource) {
        this.innerModel().withRequestSource(requestSource);
        return this;
    }

    public ApplicationInsightsComponentImpl withHockeyAppId(String hockeyAppId) {
        this.innerModel().withHockeyAppId(hockeyAppId);
        return this;
    }

    public ApplicationInsightsComponentImpl withSamplingPercentage(Double samplingPercentage) {
        this.innerModel().withSamplingPercentage(samplingPercentage);
        return this;
    }

    public ApplicationInsightsComponentImpl withRetentionInDays(Integer retentionInDays) {
        this.innerModel().withRetentionInDays(retentionInDays);
        return this;
    }

    public ApplicationInsightsComponentImpl withDisableIpMasking(Boolean disableIpMasking) {
        this.innerModel().withDisableIpMasking(disableIpMasking);
        return this;
    }

    public ApplicationInsightsComponentImpl withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        this.innerModel().withImmediatePurgeDataOn30Days(immediatePurgeDataOn30Days);
        return this;
    }

    public ApplicationInsightsComponentImpl
        withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        this.innerModel().withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
        return this;
    }

    public ApplicationInsightsComponentImpl
        withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        this.innerModel().withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
        return this;
    }

    public ApplicationInsightsComponentImpl withIngestionMode(IngestionMode ingestionMode) {
        this.innerModel().withIngestionMode(ingestionMode);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
