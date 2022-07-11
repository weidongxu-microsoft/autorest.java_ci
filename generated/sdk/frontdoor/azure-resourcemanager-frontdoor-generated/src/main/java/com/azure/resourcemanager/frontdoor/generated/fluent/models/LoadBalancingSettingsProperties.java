// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.LoadBalancingSettingsUpdateParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties required to create load balancing settings. */
@Fluent
public final class LoadBalancingSettingsProperties extends LoadBalancingSettingsUpdateParameters {
    /*
     * Resource status of the Front Door or Front Door SubResource.
     *
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource.
     *
     * <p>Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancingSettingsProperties withSampleSize(Integer sampleSize) {
        super.withSampleSize(sampleSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancingSettingsProperties withSuccessfulSamplesRequired(Integer successfulSamplesRequired) {
        super.withSuccessfulSamplesRequired(successfulSamplesRequired);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancingSettingsProperties withAdditionalLatencyMilliseconds(Integer additionalLatencyMilliseconds) {
        super.withAdditionalLatencyMilliseconds(additionalLatencyMilliseconds);
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
