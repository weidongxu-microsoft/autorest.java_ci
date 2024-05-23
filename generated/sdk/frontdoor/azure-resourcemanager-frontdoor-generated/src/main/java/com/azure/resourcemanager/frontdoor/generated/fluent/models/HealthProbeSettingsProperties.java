// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.generated.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeEnabled;
import com.azure.resourcemanager.frontdoor.generated.models.HealthProbeSettingsUpdateParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties required to create a health probe settings.
 */
@Fluent
public final class HealthProbeSettingsProperties extends HealthProbeSettingsUpdateParameters {
    /*
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /**
     * Creates an instance of HealthProbeSettingsProperties class.
     */
    public HealthProbeSettingsProperties() {
    }

    /**
     * Get the resourceState property: Resource status.
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
    public HealthProbeSettingsProperties withPath(String path) {
        super.withPath(path);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withProtocol(FrontDoorProtocol protocol) {
        super.withProtocol(protocol);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withIntervalInSeconds(Integer intervalInSeconds) {
        super.withIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        super.withHealthProbeMethod(healthProbeMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthProbeSettingsProperties withEnabledState(HealthProbeEnabled enabledState) {
        super.withEnabledState(enabledState);
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
