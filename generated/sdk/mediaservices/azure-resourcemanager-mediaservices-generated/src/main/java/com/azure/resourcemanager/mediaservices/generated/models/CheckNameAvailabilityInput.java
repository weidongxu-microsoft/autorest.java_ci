// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The input to the check name availability request. */
@Fluent
public final class CheckNameAvailabilityInput {
    /*
     * The account name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The account type. For a Media Services account, this should be 'MediaServices'.
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of CheckNameAvailabilityInput class. */
    public CheckNameAvailabilityInput() {
    }

    /**
     * Get the name property: The account name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The account name.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The account type. For a Media Services account, this should be 'MediaServices'.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The account type. For a Media Services account, this should be 'MediaServices'.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityInput object itself.
     */
    public CheckNameAvailabilityInput withType(String type) {
        this.type = type;
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
