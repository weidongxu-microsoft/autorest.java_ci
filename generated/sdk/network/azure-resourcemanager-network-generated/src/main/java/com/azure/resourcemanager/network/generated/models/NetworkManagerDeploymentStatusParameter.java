// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network Manager Deployment Status Parameter.
 */
@Fluent
public final class NetworkManagerDeploymentStatusParameter {
    /*
     * List of locations.
     */
    @JsonProperty(value = "regions")
    private List<String> regions;

    /*
     * List of deployment types.
     */
    @JsonProperty(value = "deploymentTypes")
    private List<ConfigurationType> deploymentTypes;

    /*
     * Continuation token for pagination, capturing the next page size and offset, as well as the context of the query.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Creates an instance of NetworkManagerDeploymentStatusParameter class.
     */
    public NetworkManagerDeploymentStatusParameter() {
    }

    /**
     * Get the regions property: List of locations.
     * 
     * @return the regions value.
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: List of locations.
     * 
     * @param regions the regions value to set.
     * @return the NetworkManagerDeploymentStatusParameter object itself.
     */
    public NetworkManagerDeploymentStatusParameter withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the deploymentTypes property: List of deployment types.
     * 
     * @return the deploymentTypes value.
     */
    public List<ConfigurationType> deploymentTypes() {
        return this.deploymentTypes;
    }

    /**
     * Set the deploymentTypes property: List of deployment types.
     * 
     * @param deploymentTypes the deploymentTypes value to set.
     * @return the NetworkManagerDeploymentStatusParameter object itself.
     */
    public NetworkManagerDeploymentStatusParameter withDeploymentTypes(List<ConfigurationType> deploymentTypes) {
        this.deploymentTypes = deploymentTypes;
        return this;
    }

    /**
     * Get the skipToken property: Continuation token for pagination, capturing the next page size and offset, as well
     * as the context of the query.
     * 
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: Continuation token for pagination, capturing the next page size and offset, as well
     * as the context of the query.
     * 
     * @param skipToken the skipToken value to set.
     * @return the NetworkManagerDeploymentStatusParameter object itself.
     */
    public NetworkManagerDeploymentStatusParameter withSkipToken(String skipToken) {
        this.skipToken = skipToken;
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
