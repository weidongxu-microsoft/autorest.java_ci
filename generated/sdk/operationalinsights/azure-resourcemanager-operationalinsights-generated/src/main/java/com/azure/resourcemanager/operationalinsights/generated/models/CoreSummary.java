// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The core summary of a search. */
@Fluent
public final class CoreSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CoreSummary.class);

    /*
     * The status of a core summary.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The number of documents of a core summary.
     */
    @JsonProperty(value = "numberOfDocuments", required = true)
    private long numberOfDocuments;

    /**
     * Get the status property: The status of a core summary.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of a core summary.
     *
     * @param status the status value to set.
     * @return the CoreSummary object itself.
     */
    public CoreSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the numberOfDocuments property: The number of documents of a core summary.
     *
     * @return the numberOfDocuments value.
     */
    public long numberOfDocuments() {
        return this.numberOfDocuments;
    }

    /**
     * Set the numberOfDocuments property: The number of documents of a core summary.
     *
     * @param numberOfDocuments the numberOfDocuments value to set.
     * @return the CoreSummary object itself.
     */
    public CoreSummary withNumberOfDocuments(long numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
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
