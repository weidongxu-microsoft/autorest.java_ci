// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The details of the latest move operation performed on the Azure Resource. */
@Immutable
public final class VaultPropertiesMoveDetails {
    /*
     * OperationId of the Resource Move Operation
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * Start Time of the Resource Move Operation
     */
    @JsonProperty(value = "startTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTimeUtc;

    /*
     * End Time of the Resource Move Operation
     */
    @JsonProperty(value = "completionTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime completionTimeUtc;

    /*
     * Source Resource of the Resource Move Operation
     */
    @JsonProperty(value = "sourceResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceResourceId;

    /*
     * Target Resource of the Resource Move Operation
     */
    @JsonProperty(value = "targetResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceId;

    /**
     * Get the operationId property: OperationId of the Resource Move Operation.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the startTimeUtc property: Start Time of the Resource Move Operation.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Get the completionTimeUtc property: End Time of the Resource Move Operation.
     *
     * @return the completionTimeUtc value.
     */
    public OffsetDateTime completionTimeUtc() {
        return this.completionTimeUtc;
    }

    /**
     * Get the sourceResourceId property: Source Resource of the Resource Move Operation.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Get the targetResourceId property: Target Resource of the Resource Move Operation.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
