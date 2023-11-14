// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.EndpointType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the properties of a preconfigured endpoint.
 */
@Fluent
public final class PreconfiguredEndpointProperties {
    /*
     * The description of the endpoint
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The endpoint that is preconfigured
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * The type of endpoint
     */
    @JsonProperty(value = "endpointType")
    private EndpointType endpointType;

    /*
     * The preconfigured endpoint backend
     */
    @JsonProperty(value = "backend")
    private String backend;

    /**
     * Creates an instance of PreconfiguredEndpointProperties class.
     */
    public PreconfiguredEndpointProperties() {
    }

    /**
     * Get the description property: The description of the endpoint.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the endpoint.
     * 
     * @param description the description value to set.
     * @return the PreconfiguredEndpointProperties object itself.
     */
    public PreconfiguredEndpointProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the endpoint property: The endpoint that is preconfigured.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint that is preconfigured.
     * 
     * @param endpoint the endpoint value to set.
     * @return the PreconfiguredEndpointProperties object itself.
     */
    public PreconfiguredEndpointProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the endpointType property: The type of endpoint.
     * 
     * @return the endpointType value.
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Set the endpointType property: The type of endpoint.
     * 
     * @param endpointType the endpointType value to set.
     * @return the PreconfiguredEndpointProperties object itself.
     */
    public PreconfiguredEndpointProperties withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * Get the backend property: The preconfigured endpoint backend.
     * 
     * @return the backend value.
     */
    public String backend() {
        return this.backend;
    }

    /**
     * Set the backend property: The preconfigured endpoint backend.
     * 
     * @param backend the backend value to set.
     * @return the PreconfiguredEndpointProperties object itself.
     */
    public PreconfiguredEndpointProperties withBackend(String backend) {
        this.backend = backend;
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
