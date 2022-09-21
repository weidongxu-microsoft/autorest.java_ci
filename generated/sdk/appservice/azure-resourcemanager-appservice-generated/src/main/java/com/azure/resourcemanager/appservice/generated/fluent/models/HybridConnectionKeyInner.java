// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hybrid Connection key contract. This has the send key name and value for a Hybrid Connection. */
@Fluent
public final class HybridConnectionKeyInner extends ProxyOnlyResource {
    /*
     * HybridConnectionKey resource specific properties
     */
    @JsonProperty(value = "properties")
    private HybridConnectionKeyProperties innerProperties;

    /** Creates an instance of HybridConnectionKeyInner class. */
    public HybridConnectionKeyInner() {
    }

    /**
     * Get the innerProperties property: HybridConnectionKey resource specific properties.
     *
     * @return the innerProperties value.
     */
    private HybridConnectionKeyProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HybridConnectionKeyInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the sendKeyName property: The name of the send key.
     *
     * @return the sendKeyName value.
     */
    public String sendKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyName();
    }

    /**
     * Get the sendKeyValue property: The value of the send key.
     *
     * @return the sendKeyValue value.
     */
    public String sendKeyValue() {
        return this.innerProperties() == null ? null : this.innerProperties().sendKeyValue();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
