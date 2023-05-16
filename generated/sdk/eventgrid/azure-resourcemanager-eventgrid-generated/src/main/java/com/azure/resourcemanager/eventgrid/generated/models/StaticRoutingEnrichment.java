// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StaticRoutingEnrichment model. */
@Fluent
public final class StaticRoutingEnrichment {
    /*
     * Static routing enrichment key.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * Static routing enrichment value type. For e.g. this property value can be 'String'.
     */
    @JsonProperty(value = "valueType")
    private StaticRoutingEnrichmentType valueType;

    /** Creates an instance of StaticRoutingEnrichment class. */
    public StaticRoutingEnrichment() {
    }

    /**
     * Get the key property: Static routing enrichment key.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Static routing enrichment key.
     *
     * @param key the key value to set.
     * @return the StaticRoutingEnrichment object itself.
     */
    public StaticRoutingEnrichment withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the valueType property: Static routing enrichment value type. For e.g. this property value can be 'String'.
     *
     * @return the valueType value.
     */
    public StaticRoutingEnrichmentType valueType() {
        return this.valueType;
    }

    /**
     * Set the valueType property: Static routing enrichment value type. For e.g. this property value can be 'String'.
     *
     * @param valueType the valueType value to set.
     * @return the StaticRoutingEnrichment object itself.
     */
    public StaticRoutingEnrichment withValueType(StaticRoutingEnrichmentType valueType) {
        this.valueType = valueType;
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
