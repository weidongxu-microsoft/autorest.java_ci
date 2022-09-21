// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkGroupProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The network configuration group resource. */
@Fluent
public final class ConfigurationGroup {
    /*
     * Network group ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The network configuration group properties
     */
    @JsonProperty(value = "properties")
    private NetworkGroupProperties innerProperties;

    /** Creates an instance of ConfigurationGroup class. */
    public ConfigurationGroup() {
    }

    /**
     * Get the id property: Network group ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Network group ID.
     *
     * @param id the id value to set.
     * @return the ConfigurationGroup object itself.
     */
    public ConfigurationGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the innerProperties property: The network configuration group properties.
     *
     * @return the innerProperties value.
     */
    private NetworkGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: A description of the network group.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the network group.
     *
     * @param description the description value to set.
     * @return the ConfigurationGroup object itself.
     */
    public ConfigurationGroup withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkGroupProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
