// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A domain specific resource identifier.
 */
@Fluent
public final class IdentifierInner extends ProxyOnlyResource {
    /*
     * Identifier resource specific properties
     */
    @JsonProperty(value = "properties")
    private IdentifierProperties innerProperties;

    /**
     * Creates an instance of IdentifierInner class.
     */
    public IdentifierInner() {
    }

    /**
     * Get the innerProperties property: Identifier resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private IdentifierProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentifierInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the value property: String representation of the identity.
     * 
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: String representation of the identity.
     * 
     * @param value the value value to set.
     * @return the IdentifierInner object itself.
     */
    public IdentifierInner withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IdentifierProperties();
        }
        this.innerProperties().withValue(value);
        return this;
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
