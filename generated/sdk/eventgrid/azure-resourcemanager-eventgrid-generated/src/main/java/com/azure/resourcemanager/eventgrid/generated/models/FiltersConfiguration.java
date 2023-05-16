// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Filters configuration for the Event Subscription. */
@Fluent
public final class FiltersConfiguration {
    /*
     * A list of applicable event types that need to be part of the event subscription. If it is desired to subscribe
     * to all default event types, set the IncludedEventTypes to null.
     */
    @JsonProperty(value = "includedEventTypes")
    private List<String> includedEventTypes;

    /*
     * An array of filters that are used for filtering event subscriptions.
     */
    @JsonProperty(value = "filters")
    private List<Filter> filters;

    /** Creates an instance of FiltersConfiguration class. */
    public FiltersConfiguration() {
    }

    /**
     * Get the includedEventTypes property: A list of applicable event types that need to be part of the event
     * subscription. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @return the includedEventTypes value.
     */
    public List<String> includedEventTypes() {
        return this.includedEventTypes;
    }

    /**
     * Set the includedEventTypes property: A list of applicable event types that need to be part of the event
     * subscription. If it is desired to subscribe to all default event types, set the IncludedEventTypes to null.
     *
     * @param includedEventTypes the includedEventTypes value to set.
     * @return the FiltersConfiguration object itself.
     */
    public FiltersConfiguration withIncludedEventTypes(List<String> includedEventTypes) {
        this.includedEventTypes = includedEventTypes;
        return this;
    }

    /**
     * Get the filters property: An array of filters that are used for filtering event subscriptions.
     *
     * @return the filters value.
     */
    public List<Filter> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: An array of filters that are used for filtering event subscriptions.
     *
     * @param filters the filters value to set.
     * @return the FiltersConfiguration object itself.
     */
    public FiltersConfiguration withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
    }
}
