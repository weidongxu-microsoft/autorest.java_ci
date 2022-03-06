// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Search job execution statistics. */
@Immutable
public final class ResultStatistics {
    /*
     * Search job completion percentage.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private Float progress;

    /*
     * The number of rows that were returned by the search job.
     */
    @JsonProperty(value = "ingestedRecords", access = JsonProperty.Access.WRITE_ONLY)
    private Integer ingestedRecords;

    /**
     * Get the progress property: Search job completion percentage.
     *
     * @return the progress value.
     */
    public Float progress() {
        return this.progress;
    }

    /**
     * Get the ingestedRecords property: The number of rows that were returned by the search job.
     *
     * @return the ingestedRecords value.
     */
    public Integer ingestedRecords() {
        return this.ingestedRecords;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
