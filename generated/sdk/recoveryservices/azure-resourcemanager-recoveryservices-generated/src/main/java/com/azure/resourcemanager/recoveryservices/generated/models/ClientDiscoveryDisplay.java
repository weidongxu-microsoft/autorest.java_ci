// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Localized display information of an operation. */
@Fluent
public final class ClientDiscoveryDisplay {
    /*
     * Name of the provider for display purposes
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * ResourceType for which this Operation can be performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Operations Name itself.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description of the operation having details of what operation is about.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of ClientDiscoveryDisplay class. */
    public ClientDiscoveryDisplay() {
    }

    /**
     * Get the provider property: Name of the provider for display purposes.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Name of the provider for display purposes.
     *
     * @param provider the provider value to set.
     * @return the ClientDiscoveryDisplay object itself.
     */
    public ClientDiscoveryDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: ResourceType for which this Operation can be performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: ResourceType for which this Operation can be performed.
     *
     * @param resource the resource value to set.
     * @return the ClientDiscoveryDisplay object itself.
     */
    public ClientDiscoveryDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Operations Name itself.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operations Name itself.
     *
     * @param operation the operation value to set.
     * @return the ClientDiscoveryDisplay object itself.
     */
    public ClientDiscoveryDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description of the operation having details of what operation is about.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the operation having details of what operation is about.
     *
     * @param description the description value to set.
     * @return the ClientDiscoveryDisplay object itself.
     */
    public ClientDiscoveryDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
