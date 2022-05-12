// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ChannelInner;
import com.azure.resourcemanager.eventgrid.generated.models.Channel;
import com.azure.resourcemanager.eventgrid.generated.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.ChannelType;
import com.azure.resourcemanager.eventgrid.generated.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerDestinationInfo;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.generated.models.ReadinessState;
import java.time.OffsetDateTime;

public final class ChannelImpl implements Channel, Channel.Definition, Channel.Update {
    private ChannelInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

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

    public ChannelType channelType() {
        return this.innerModel().channelType();
    }

    public PartnerTopicInfo partnerTopicInfo() {
        return this.innerModel().partnerTopicInfo();
    }

    public PartnerDestinationInfo partnerDestinationInfo() {
        return this.innerModel().partnerDestinationInfo();
    }

    public String messageForActivation() {
        return this.innerModel().messageForActivation();
    }

    public ChannelProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ReadinessState readinessState() {
        return this.innerModel().readinessState();
    }

    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerModel().expirationTimeIfNotActivatedUtc();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ChannelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String partnerNamespaceName;

    private String channelName;

    public ChannelImpl withExistingPartnerNamespace(String resourceGroupName, String partnerNamespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.partnerNamespaceName = partnerNamespaceName;
        return this;
    }

    public Channel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .createOrUpdateWithResponse(
                    resourceGroupName, partnerNamespaceName, channelName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Channel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .createOrUpdateWithResponse(
                    resourceGroupName, partnerNamespaceName, channelName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ChannelImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new ChannelInner();
        this.serviceManager = serviceManager;
        this.channelName = name;
    }

    public ChannelImpl update() {
        return this;
    }

    public Channel apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .createOrUpdateWithResponse(
                    resourceGroupName, partnerNamespaceName, channelName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Channel apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .createOrUpdateWithResponse(
                    resourceGroupName, partnerNamespaceName, channelName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ChannelImpl(
        ChannelInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.partnerNamespaceName = Utils.getValueFromIdByName(innerObject.id(), "partnerNamespaces");
        this.channelName = Utils.getValueFromIdByName(innerObject.id(), "channels");
    }

    public Channel refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .getWithResponse(resourceGroupName, partnerNamespaceName, channelName, Context.NONE)
                .getValue();
        return this;
    }

    public Channel refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getChannels()
                .getWithResponse(resourceGroupName, partnerNamespaceName, channelName, context)
                .getValue();
        return this;
    }

    public EventSubscriptionFullUrl getFullUrl() {
        return serviceManager.channels().getFullUrl(resourceGroupName, partnerNamespaceName, channelName);
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(Context context) {
        return serviceManager
            .channels()
            .getFullUrlWithResponse(resourceGroupName, partnerNamespaceName, channelName, context);
    }

    public ChannelImpl withChannelType(ChannelType channelType) {
        this.innerModel().withChannelType(channelType);
        return this;
    }

    public ChannelImpl withPartnerTopicInfo(PartnerTopicInfo partnerTopicInfo) {
        this.innerModel().withPartnerTopicInfo(partnerTopicInfo);
        return this;
    }

    public ChannelImpl withPartnerDestinationInfo(PartnerDestinationInfo partnerDestinationInfo) {
        this.innerModel().withPartnerDestinationInfo(partnerDestinationInfo);
        return this;
    }

    public ChannelImpl withMessageForActivation(String messageForActivation) {
        this.innerModel().withMessageForActivation(messageForActivation);
        return this;
    }

    public ChannelImpl withProvisioningState(ChannelProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public ChannelImpl withReadinessState(ReadinessState readinessState) {
        this.innerModel().withReadinessState(readinessState);
        return this;
    }

    public ChannelImpl withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.innerModel().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }
}
