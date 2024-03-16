// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventhubs.generated.models.ClusterSku;
import com.azure.resourcemanager.eventhubs.generated.models.ProvisioningState;
import com.azure.resourcemanager.eventhubs.generated.models.UpgradePreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Single Event Hubs Cluster resource in List or Get operations.
 */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * Properties of the cluster SKU.
     */
    @JsonProperty(value = "sku")
    private ClusterSku sku;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Event Hubs Cluster properties supplied in responses in List or Get operations.
     */
    @JsonProperty(value = "properties")
    private ClusterProperties innerProperties;

    /**
     * Creates an instance of ClusterInner class.
     */
    public ClusterInner() {
    }

    /**
     * Get the sku property: Properties of the cluster SKU.
     * 
     * @return the sku value.
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of the cluster SKU.
     * 
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Event Hubs Cluster properties supplied in responses in List or Get operations.
     * 
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the createdAt property: The UTC time when the Event Hubs Cluster was created.
     * 
     * @return the createdAt value.
     */
    public String createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the provisioningState property: Provisioning state of the Cluster.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the updatedAt property: The UTC time when the Event Hubs Cluster was last updated.
     * 
     * @return the updatedAt value.
     */
    public String updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the metricId property: The metric ID of the cluster resource. Provided by the service and not modifiable by the user.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricId();
    }

    /**
     * Get the status property: Status of the Cluster resource.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the supportsScaling property: A value that indicates whether Scaling is Supported.
     * 
     * @return the supportsScaling value.
     */
    public Boolean supportsScaling() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsScaling();
    }

    /**
     * Set the supportsScaling property: A value that indicates whether Scaling is Supported.
     * 
     * @param supportsScaling the supportsScaling value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSupportsScaling(Boolean supportsScaling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withSupportsScaling(supportsScaling);
        return this;
    }

    /**
     * Get the upgradePreferences property: Properties of the cluster upgrade preferences.
     * 
     * @return the upgradePreferences value.
     */
    public UpgradePreferences upgradePreferences() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePreferences();
    }

    /**
     * Set the upgradePreferences property: Properties of the cluster upgrade preferences.
     * 
     * @param upgradePreferences the upgradePreferences value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradePreferences(UpgradePreferences upgradePreferences) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradePreferences(upgradePreferences);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
