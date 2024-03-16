// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * L7 health probe settings for a backend pool.
 */
@Fluent
public class HealthProbeSettingsUpdateParameters {
    /*
     * The path to use for the health probe. Default is /
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Protocol scheme to use for this probe
     */
    @JsonProperty(value = "protocol")
    private FrontDoorProtocol protocol;

    /*
     * The number of seconds between health probes.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /*
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     */
    @JsonProperty(value = "healthProbeMethod")
    private FrontDoorHealthProbeMethod healthProbeMethod;

    /*
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     */
    @JsonProperty(value = "enabledState")
    private HealthProbeEnabled enabledState;

    /**
     * Creates an instance of HealthProbeSettingsUpdateParameters class.
     */
    public HealthProbeSettingsUpdateParameters() {
    }

    /**
     * Get the path property: The path to use for the health probe. Default is /.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path to use for the health probe. Default is /.
     * 
     * @param path the path value to set.
     * @return the HealthProbeSettingsUpdateParameters object itself.
     */
    public HealthProbeSettingsUpdateParameters withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocol property: Protocol scheme to use for this probe.
     * 
     * @return the protocol value.
     */
    public FrontDoorProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol scheme to use for this probe.
     * 
     * @param protocol the protocol value to set.
     * @return the HealthProbeSettingsUpdateParameters object itself.
     */
    public HealthProbeSettingsUpdateParameters withProtocol(FrontDoorProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The number of seconds between health probes.
     * 
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The number of seconds between health probes.
     * 
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the HealthProbeSettingsUpdateParameters object itself.
     */
    public HealthProbeSettingsUpdateParameters withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     * @return the healthProbeMethod value.
     */
    public FrontDoorHealthProbeMethod healthProbeMethod() {
        return this.healthProbeMethod;
    }

    /**
     * Set the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     * @param healthProbeMethod the healthProbeMethod value to set.
     * @return the HealthProbeSettingsUpdateParameters object itself.
     */
    public HealthProbeSettingsUpdateParameters withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        this.healthProbeMethod = healthProbeMethod;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     * @return the enabledState value.
     */
    public HealthProbeEnabled enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     * @param enabledState the enabledState value to set.
     * @return the HealthProbeSettingsUpdateParameters object itself.
     */
    public HealthProbeSettingsUpdateParameters withEnabledState(HealthProbeEnabled enabledState) {
        this.enabledState = enabledState;
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
