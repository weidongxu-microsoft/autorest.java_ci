// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.relay.generated.models.ProvisioningStateEnum;
import com.azure.resourcemanager.relay.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Description of a namespace resource. */
@Fluent
public final class RelayNamespaceInner extends Resource {
    /*
     * SKU of the namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Description of Relay namespace
     */
    @JsonProperty(value = "properties")
    private RelayNamespaceProperties innerProperties;

    /**
     * Get the sku property: SKU of the namespace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the namespace.
     *
     * @param sku the sku value to set.
     * @return the RelayNamespaceInner object itself.
     */
    public RelayNamespaceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Description of Relay namespace.
     *
     * @return the innerProperties value.
     */
    private RelayNamespaceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RelayNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RelayNamespaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateEnum provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusEndpoint();
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricId();
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
