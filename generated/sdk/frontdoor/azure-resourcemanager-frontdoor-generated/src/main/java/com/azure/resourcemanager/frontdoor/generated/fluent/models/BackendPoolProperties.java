// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.frontdoor.generated.models.Backend;
import com.azure.resourcemanager.frontdoor.generated.models.BackendPoolUpdateParameters;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The JSON object that contains the properties required to create a Backend Pool.
 */
@Fluent
public final class BackendPoolProperties extends BackendPoolUpdateParameters {
    /*
     * Resource status of the Front Door or Front Door SubResource.
     * 
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Creates an instance of BackendPoolProperties class.
     */
    public BackendPoolProperties() {
    }

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource.
     * 
     * Resource status.
     * 
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackendPoolProperties withBackends(List<Backend> backends) {
        super.withBackends(backends);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackendPoolProperties withLoadBalancingSettings(SubResource loadBalancingSettings) {
        super.withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackendPoolProperties withHealthProbeSettings(SubResource healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
