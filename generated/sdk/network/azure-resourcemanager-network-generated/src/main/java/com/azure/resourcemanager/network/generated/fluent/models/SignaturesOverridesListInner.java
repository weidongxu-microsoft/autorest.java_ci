// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes an object containing an array with a single item. */
@Fluent
public final class SignaturesOverridesListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignaturesOverridesListInner.class);

    /*
     * Describes a list consisting exactly one item describing the policy's
     * signature override status
     */
    @JsonProperty(value = "value")
    private List<SignaturesOverridesInner> value;

    /**
     * Get the value property: Describes a list consisting exactly one item describing the policy's signature override
     * status.
     *
     * @return the value value.
     */
    public List<SignaturesOverridesInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Describes a list consisting exactly one item describing the policy's signature override
     * status.
     *
     * @param value the value value to set.
     * @return the SignaturesOverridesListInner object itself.
     */
    public SignaturesOverridesListInner withValue(List<SignaturesOverridesInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
