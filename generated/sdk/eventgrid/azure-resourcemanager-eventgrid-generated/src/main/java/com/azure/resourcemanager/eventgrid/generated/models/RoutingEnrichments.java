// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RoutingEnrichments model. */
@Fluent
public final class RoutingEnrichments {
    /*
     * The static property.
     */
    @JsonProperty(value = "static")
    private List<StaticRoutingEnrichment> staticProperty;

    /*
     * The dynamic property.
     */
    @JsonProperty(value = "dynamic")
    private List<DynamicRoutingEnrichment> dynamic;

    /** Creates an instance of RoutingEnrichments class. */
    public RoutingEnrichments() {
    }

    /**
     * Get the staticProperty property: The static property.
     *
     * @return the staticProperty value.
     */
    public List<StaticRoutingEnrichment> staticProperty() {
        return this.staticProperty;
    }

    /**
     * Set the staticProperty property: The static property.
     *
     * @param staticProperty the staticProperty value to set.
     * @return the RoutingEnrichments object itself.
     */
    public RoutingEnrichments withStaticProperty(List<StaticRoutingEnrichment> staticProperty) {
        this.staticProperty = staticProperty;
        return this;
    }

    /**
     * Get the dynamic property: The dynamic property.
     *
     * @return the dynamic value.
     */
    public List<DynamicRoutingEnrichment> dynamic() {
        return this.dynamic;
    }

    /**
     * Set the dynamic property: The dynamic property.
     *
     * @param dynamic the dynamic value to set.
     * @return the RoutingEnrichments object itself.
     */
    public RoutingEnrichments withDynamic(List<DynamicRoutingEnrichment> dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (staticProperty() != null) {
            staticProperty().forEach(e -> e.validate());
        }
        if (dynamic() != null) {
            dynamic().forEach(e -> e.validate());
        }
    }
}