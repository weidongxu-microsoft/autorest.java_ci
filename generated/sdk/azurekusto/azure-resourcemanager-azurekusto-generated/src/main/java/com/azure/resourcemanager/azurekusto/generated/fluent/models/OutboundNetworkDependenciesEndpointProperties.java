// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurekusto.generated.models.EndpointDependency;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Endpoints accessed for a common purpose that the Kusto Service Environment requires outbound network access to. */
@Fluent
public final class OutboundNetworkDependenciesEndpointProperties {
    /*
     * The type of service accessed by the Kusto Service Environment, e.g.,
     * Azure Storage, Azure SQL Database, and Azure Active Directory.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The endpoints that the Kusto Service Environment reaches the service at.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointDependency> endpoints;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     *
     * @param category the category value to set.
     * @return the OutboundNetworkDependenciesEndpointProperties object itself.
     */
    public OutboundNetworkDependenciesEndpointProperties withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     *
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     *
     * @param endpoints the endpoints value to set.
     * @return the OutboundNetworkDependenciesEndpointProperties object itself.
     */
    public OutboundNetworkDependenciesEndpointProperties withEndpoints(List<EndpointDependency> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }
}
