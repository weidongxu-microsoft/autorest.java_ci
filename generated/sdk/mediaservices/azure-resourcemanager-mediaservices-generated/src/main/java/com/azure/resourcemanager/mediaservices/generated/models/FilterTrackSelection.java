// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Representing a list of FilterTrackPropertyConditions to select a track. The filters are combined using a logical AND
 * operation.
 */
@Fluent
public final class FilterTrackSelection {
    /*
     * The track selections.
     */
    @JsonProperty(value = "trackSelections", required = true)
    private List<FilterTrackPropertyCondition> trackSelections;

    /**
     * Creates an instance of FilterTrackSelection class.
     */
    public FilterTrackSelection() {
    }

    /**
     * Get the trackSelections property: The track selections.
     * 
     * @return the trackSelections value.
     */
    public List<FilterTrackPropertyCondition> trackSelections() {
        return this.trackSelections;
    }

    /**
     * Set the trackSelections property: The track selections.
     * 
     * @param trackSelections the trackSelections value to set.
     * @return the FilterTrackSelection object itself.
     */
    public FilterTrackSelection withTrackSelections(List<FilterTrackPropertyCondition> trackSelections) {
        this.trackSelections = trackSelections;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trackSelections() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property trackSelections in model FilterTrackSelection"));
        } else {
            trackSelections().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilterTrackSelection.class);
}
