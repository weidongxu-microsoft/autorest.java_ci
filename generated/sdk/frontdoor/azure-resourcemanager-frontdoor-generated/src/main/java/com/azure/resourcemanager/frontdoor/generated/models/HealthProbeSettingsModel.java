// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.HealthProbeSettingsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Load balancing settings for a backend pool. */
@Fluent
public final class HealthProbeSettingsModel extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthProbeSettingsModel.class);

    /*
     * Properties of the health probe settings
     */
    @JsonProperty(value = "properties")
    private HealthProbeSettingsProperties innerProperties;

    /*
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the health probe settings.
     *
     * @return the innerProperties value.
     */
    private HealthProbeSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public HealthProbeSettingsModel withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource. Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the path property: The path to use for the health probe. Default is /.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: The path to use for the health probe. Default is /.
     *
     * @param path the path value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HealthProbeSettingsProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the protocol property: Protocol scheme to use for this probe.
     *
     * @return the protocol value.
     */
    public FrontDoorProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: Protocol scheme to use for this probe.
     *
     * @param protocol the protocol value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withProtocol(FrontDoorProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HealthProbeSettingsProperties();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the intervalInSeconds property: The number of seconds between health probes.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().intervalInSeconds();
    }

    /**
     * Set the intervalInSeconds property: The number of seconds between health probes.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withIntervalInSeconds(Integer intervalInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HealthProbeSettingsProperties();
        }
        this.innerProperties().withIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * Get the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under
     * backendPools.
     *
     * @return the healthProbeMethod value.
     */
    public FrontDoorHealthProbeMethod healthProbeMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeMethod();
    }

    /**
     * Set the healthProbeMethod property: Configures which HTTP method to use to probe the backends defined under
     * backendPools.
     *
     * @param healthProbeMethod the healthProbeMethod value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withHealthProbeMethod(FrontDoorHealthProbeMethod healthProbeMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HealthProbeSettingsProperties();
        }
        this.innerProperties().withHealthProbeMethod(healthProbeMethod);
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @return the enabledState value.
     */
    public HealthProbeEnabled enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @param enabledState the enabledState value to set.
     * @return the HealthProbeSettingsModel object itself.
     */
    public HealthProbeSettingsModel withEnabledState(HealthProbeEnabled enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HealthProbeSettingsProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
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
