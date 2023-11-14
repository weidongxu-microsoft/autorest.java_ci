// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.azurekusto.generated.models.EndpointDependency;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Endpoints accessed for a common purpose that the Kusto Service Environment requires outbound network access to.
 */
@Fluent
public final class OutboundNetworkDependenciesEndpointInner extends ProxyResource {
    /*
     * The outbound environment endpoint properties.
     */
    @JsonProperty(value = "properties")
    private OutboundNetworkDependenciesEndpointProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of OutboundNetworkDependenciesEndpointInner class.
     */
    public OutboundNetworkDependenciesEndpointInner() {
    }

    /**
     * Get the innerProperties property: The outbound environment endpoint properties.
     * 
     * @return the innerProperties value.
     */
    private OutboundNetworkDependenciesEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     * 
     * @return the category value.
     */
    public String category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: The type of service accessed by the Kusto Service Environment, e.g., Azure Storage,
     * Azure SQL Database, and Azure Active Directory.
     * 
     * @param category the category value to set.
     * @return the OutboundNetworkDependenciesEndpointInner object itself.
     */
    public OutboundNetworkDependenciesEndpointInner withCategory(String category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundNetworkDependenciesEndpointProperties();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     * 
     * @return the endpoints value.
     */
    public List<EndpointDependency> endpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoints();
    }

    /**
     * Set the endpoints property: The endpoints that the Kusto Service Environment reaches the service at.
     * 
     * @param endpoints the endpoints value to set.
     * @return the OutboundNetworkDependenciesEndpointInner object itself.
     */
    public OutboundNetworkDependenciesEndpointInner withEndpoints(List<EndpointDependency> endpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundNetworkDependenciesEndpointProperties();
        }
        this.innerProperties().withEndpoints(endpoints);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
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
