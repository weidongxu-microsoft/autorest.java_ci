// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListServiceEndpointPolicyDefinition API service call. Retrieves all service endpoint policy definition
 * that belongs to a service endpoint policy.
 */
@Fluent
public final class ServiceEndpointPolicyDefinitionListResult {
    /*
     * The service endpoint policy definition in a service endpoint policy.
     */
    @JsonProperty(value = "value")
    private List<ServiceEndpointPolicyDefinitionInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ServiceEndpointPolicyDefinitionListResult class. */
    public ServiceEndpointPolicyDefinitionListResult() {
    }

    /**
     * Get the value property: The service endpoint policy definition in a service endpoint policy.
     *
     * @return the value value.
     */
    public List<ServiceEndpointPolicyDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The service endpoint policy definition in a service endpoint policy.
     *
     * @param value the value value to set.
     * @return the ServiceEndpointPolicyDefinitionListResult object itself.
     */
    public ServiceEndpointPolicyDefinitionListResult withValue(List<ServiceEndpointPolicyDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ServiceEndpointPolicyDefinitionListResult object itself.
     */
    public ServiceEndpointPolicyDefinitionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
