// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an accepted audience trusted by the cluster. */
@Fluent
public final class AcceptedAudiences {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AcceptedAudiences.class);

    /*
     * GUID or valid URL representing an accepted audience.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: GUID or valid URL representing an accepted audience.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: GUID or valid URL representing an accepted audience.
     *
     * @param value the value value to set.
     * @return the AcceptedAudiences object itself.
     */
    public AcceptedAudiences withValue(String value) {
        this.value = value;
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
