// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Geo-physical location to run a web test from. You must specify one or more locations for the test to run from. */
@Fluent
public final class WebTestGeolocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebTestGeolocation.class);

    /*
     * Location ID for the webtest to run from.
     */
    @JsonProperty(value = "Id")
    private String location;

    /**
     * Get the location property: Location ID for the webtest to run from.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location ID for the webtest to run from.
     *
     * @param location the location value to set.
     * @return the WebTestGeolocation object itself.
     */
    public WebTestGeolocation withLocation(String location) {
        this.location = location;
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
