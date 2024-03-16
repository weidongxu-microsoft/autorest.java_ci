// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The StaticStringRoutingEnrichment model.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "valueType",
    defaultImpl = StaticStringRoutingEnrichment.class,
    visible = true)
@JsonTypeName("String")
@Fluent
public final class StaticStringRoutingEnrichment extends StaticRoutingEnrichment {
    /*
     * String type routing enrichment value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of StaticStringRoutingEnrichment class.
     */
    public StaticStringRoutingEnrichment() {
        withValueType(StaticRoutingEnrichmentType.STRING);
    }

    /**
     * Get the value property: String type routing enrichment value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: String type routing enrichment value.
     * 
     * @param value the value value to set.
     * @return the StaticStringRoutingEnrichment object itself.
     */
    public StaticStringRoutingEnrichment withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticStringRoutingEnrichment withKey(String key) {
        super.withKey(key);
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
    }
}
