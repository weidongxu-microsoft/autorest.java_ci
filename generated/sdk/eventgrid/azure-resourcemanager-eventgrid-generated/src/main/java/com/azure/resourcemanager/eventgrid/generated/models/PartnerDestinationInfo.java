// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Properties of the corresponding partner destination of a Channel.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "endpointType",
    defaultImpl = PartnerDestinationInfo.class,
    visible = true)
@JsonTypeName("PartnerDestinationInfo")
@JsonSubTypes({ @JsonSubTypes.Type(name = "WebHook", value = WebhookPartnerDestinationInfo.class) })
@Fluent
public class PartnerDestinationInfo {
    /*
     * Type of the endpoint for the partner destination
     */
    @JsonTypeId
    @JsonProperty(value = "endpointType", required = true)
    private PartnerEndpointType endpointType;

    /*
     * Azure subscription ID of the subscriber. The partner destination associated with the channel will be
     * created under this Azure subscription.
     */
    @JsonProperty(value = "azureSubscriptionId")
    private String azureSubscriptionId;

    /*
     * Azure Resource Group of the subscriber. The partner destination associated with the channel will be
     * created under this resource group.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * Name of the partner destination associated with the channel.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Additional context of the partner destination endpoint.
     */
    @JsonProperty(value = "endpointServiceContext")
    private String endpointServiceContext;

    /*
     * Change history of the resource move.
     */
    @JsonProperty(value = "resourceMoveChangeHistory")
    private List<ResourceMoveChangeHistory> resourceMoveChangeHistory;

    /**
     * Creates an instance of PartnerDestinationInfo class.
     */
    public PartnerDestinationInfo() {
        this.endpointType = PartnerEndpointType.fromString("PartnerDestinationInfo");
    }

    /**
     * Get the endpointType property: Type of the endpoint for the partner destination.
     * 
     * @return the endpointType value.
     */
    public PartnerEndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Get the azureSubscriptionId property: Azure subscription ID of the subscriber. The partner destination associated
     * with the channel will be
     * created under this Azure subscription.
     * 
     * @return the azureSubscriptionId value.
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Set the azureSubscriptionId property: Azure subscription ID of the subscriber. The partner destination associated
     * with the channel will be
     * created under this Azure subscription.
     * 
     * @param azureSubscriptionId the azureSubscriptionId value to set.
     * @return the PartnerDestinationInfo object itself.
     */
    public PartnerDestinationInfo withAzureSubscriptionId(String azureSubscriptionId) {
        this.azureSubscriptionId = azureSubscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure Resource Group of the subscriber. The partner destination associated
     * with the channel will be
     * created under this resource group.
     * 
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Azure Resource Group of the subscriber. The partner destination associated
     * with the channel will be
     * created under this resource group.
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the PartnerDestinationInfo object itself.
     */
    public PartnerDestinationInfo withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the name property: Name of the partner destination associated with the channel.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the partner destination associated with the channel.
     * 
     * @param name the name value to set.
     * @return the PartnerDestinationInfo object itself.
     */
    public PartnerDestinationInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointServiceContext property: Additional context of the partner destination endpoint.
     * 
     * @return the endpointServiceContext value.
     */
    public String endpointServiceContext() {
        return this.endpointServiceContext;
    }

    /**
     * Set the endpointServiceContext property: Additional context of the partner destination endpoint.
     * 
     * @param endpointServiceContext the endpointServiceContext value to set.
     * @return the PartnerDestinationInfo object itself.
     */
    public PartnerDestinationInfo withEndpointServiceContext(String endpointServiceContext) {
        this.endpointServiceContext = endpointServiceContext;
        return this;
    }

    /**
     * Get the resourceMoveChangeHistory property: Change history of the resource move.
     * 
     * @return the resourceMoveChangeHistory value.
     */
    public List<ResourceMoveChangeHistory> resourceMoveChangeHistory() {
        return this.resourceMoveChangeHistory;
    }

    /**
     * Set the resourceMoveChangeHistory property: Change history of the resource move.
     * 
     * @param resourceMoveChangeHistory the resourceMoveChangeHistory value to set.
     * @return the PartnerDestinationInfo object itself.
     */
    public PartnerDestinationInfo
        withResourceMoveChangeHistory(List<ResourceMoveChangeHistory> resourceMoveChangeHistory) {
        this.resourceMoveChangeHistory = resourceMoveChangeHistory;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceMoveChangeHistory() != null) {
            resourceMoveChangeHistory().forEach(e -> e.validate());
        }
    }
}
