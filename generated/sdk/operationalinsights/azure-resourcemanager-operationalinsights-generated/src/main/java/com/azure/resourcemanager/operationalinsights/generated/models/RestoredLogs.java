// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Restore parameters. */
@Fluent
public final class RestoredLogs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestoredLogs.class);

    /*
     * The timestamp to start the restore from (UTC).
     */
    @JsonProperty(value = "startRestoreTime")
    private OffsetDateTime startRestoreTime;

    /*
     * The timestamp to end the restore by (UTC).
     */
    @JsonProperty(value = "endRestoreTime")
    private OffsetDateTime endRestoreTime;

    /*
     * The table to restore data from.
     */
    @JsonProperty(value = "sourceTable", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceTable;

    /**
     * Get the startRestoreTime property: The timestamp to start the restore from (UTC).
     *
     * @return the startRestoreTime value.
     */
    public OffsetDateTime startRestoreTime() {
        return this.startRestoreTime;
    }

    /**
     * Set the startRestoreTime property: The timestamp to start the restore from (UTC).
     *
     * @param startRestoreTime the startRestoreTime value to set.
     * @return the RestoredLogs object itself.
     */
    public RestoredLogs withStartRestoreTime(OffsetDateTime startRestoreTime) {
        this.startRestoreTime = startRestoreTime;
        return this;
    }

    /**
     * Get the endRestoreTime property: The timestamp to end the restore by (UTC).
     *
     * @return the endRestoreTime value.
     */
    public OffsetDateTime endRestoreTime() {
        return this.endRestoreTime;
    }

    /**
     * Set the endRestoreTime property: The timestamp to end the restore by (UTC).
     *
     * @param endRestoreTime the endRestoreTime value to set.
     * @return the RestoredLogs object itself.
     */
    public RestoredLogs withEndRestoreTime(OffsetDateTime endRestoreTime) {
        this.endRestoreTime = endRestoreTime;
        return this;
    }

    /**
     * Get the sourceTable property: The table to restore data from.
     *
     * @return the sourceTable value.
     */
    public String sourceTable() {
        return this.sourceTable;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
