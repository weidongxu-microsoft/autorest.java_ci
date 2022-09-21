// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specification for an App Service Environment to use for this resource. */
@Fluent
public final class HostingEnvironmentProfile {
    /*
     * Resource ID of the App Service Environment.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the App Service Environment.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type of the App Service Environment.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of HostingEnvironmentProfile class. */
    public HostingEnvironmentProfile() {
    }

    /**
     * Get the id property: Resource ID of the App Service Environment.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID of the App Service Environment.
     *
     * @param id the id value to set.
     * @return the HostingEnvironmentProfile object itself.
     */
    public HostingEnvironmentProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the App Service Environment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type of the App Service Environment.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
