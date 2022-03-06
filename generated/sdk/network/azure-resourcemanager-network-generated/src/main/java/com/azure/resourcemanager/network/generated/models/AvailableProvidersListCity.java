// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** City or town details. */
@Fluent
public final class AvailableProvidersListCity {
    /*
     * The city or town name.
     */
    @JsonProperty(value = "cityName")
    private String cityName;

    /*
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * Get the cityName property: The city or town name.
     *
     * @return the cityName value.
     */
    public String cityName() {
        return this.cityName;
    }

    /**
     * Set the cityName property: The city or town name.
     *
     * @param cityName the cityName value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    /**
     * Get the providers property: A list of Internet service providers.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: A list of Internet service providers.
     *
     * @param providers the providers value to set.
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withProviders(List<String> providers) {
        this.providers = providers;
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
