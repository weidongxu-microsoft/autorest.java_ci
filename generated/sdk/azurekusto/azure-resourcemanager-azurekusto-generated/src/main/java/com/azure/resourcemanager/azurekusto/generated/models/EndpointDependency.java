// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A domain name that a service is reached at, including details of the current connection status.
 */
@Fluent
public final class EndpointDependency {
    /*
     * The domain name of the dependency.
     */
    @JsonProperty(value = "domainName")
    private String domainName;

    /*
     * The ports used when connecting to DomainName.
     */
    @JsonProperty(value = "endpointDetails")
    private List<EndpointDetail> endpointDetails;

    /**
     * Creates an instance of EndpointDependency class.
     */
    public EndpointDependency() {
    }

    /**
     * Get the domainName property: The domain name of the dependency.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The domain name of the dependency.
     * 
     * @param domainName the domainName value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the endpointDetails property: The ports used when connecting to DomainName.
     * 
     * @return the endpointDetails value.
     */
    public List<EndpointDetail> endpointDetails() {
        return this.endpointDetails;
    }

    /**
     * Set the endpointDetails property: The ports used when connecting to DomainName.
     * 
     * @param endpointDetails the endpointDetails value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withEndpointDetails(List<EndpointDetail> endpointDetails) {
        this.endpointDetails = endpointDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointDetails() != null) {
            endpointDetails().forEach(e -> e.validate());
        }
    }
}
