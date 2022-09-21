// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Snapshot resource specific properties. */
@Immutable
public final class SnapshotProperties {
    /*
     * The time the snapshot was taken.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private String time;

    /** Creates an instance of SnapshotProperties class. */
    public SnapshotProperties() {
    }

    /**
     * Get the time property: The time the snapshot was taken.
     *
     * @return the time value.
     */
    public String time() {
        return this.time;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
