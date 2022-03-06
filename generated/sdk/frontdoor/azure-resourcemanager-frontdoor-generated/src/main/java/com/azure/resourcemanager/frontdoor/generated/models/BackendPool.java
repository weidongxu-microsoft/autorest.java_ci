// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.BackendPoolProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A backend pool is a collection of backends that can be routed to. */
@Fluent
public final class BackendPool extends SubResource {
    /*
     * Properties of the Front Door Backend Pool
     */
    @JsonProperty(value = "properties")
    private BackendPoolProperties innerProperties;

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
     * Get the innerProperties property: Properties of the Front Door Backend Pool.
     *
     * @return the innerProperties value.
     */
    private BackendPoolProperties innerProperties() {
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
     * @return the BackendPool object itself.
     */
    public BackendPool withName(String name) {
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
    public BackendPool withId(String id) {
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
     * Get the backends property: The set of backends for this pool.
     *
     * @return the backends value.
     */
    public List<Backend> backends() {
        return this.innerProperties() == null ? null : this.innerProperties().backends();
    }

    /**
     * Set the backends property: The set of backends for this pool.
     *
     * @param backends the backends value to set.
     * @return the BackendPool object itself.
     */
    public BackendPool withBackends(List<Backend> backends) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendPoolProperties();
        }
        this.innerProperties().withBackends(backends);
        return this;
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @return the loadBalancingSettings value.
     */
    public SubResource loadBalancingSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingSettings();
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the BackendPool object itself.
     */
    public BackendPool withLoadBalancingSettings(SubResource loadBalancingSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendPoolProperties();
        }
        this.innerProperties().withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * Get the healthProbeSettings property: L7 health probe settings for a backend pool.
     *
     * @return the healthProbeSettings value.
     */
    public SubResource healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: L7 health probe settings for a backend pool.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the BackendPool object itself.
     */
    public BackendPool withHealthProbeSettings(SubResource healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendPoolProperties();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
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
