// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class that contains database statistics information. */
@Fluent
public final class DatabaseStatistics {
    /*
     * The database size - the total size of compressed data and index in bytes.
     */
    @JsonProperty(value = "size")
    private Float size;

    /** Creates an instance of DatabaseStatistics class. */
    public DatabaseStatistics() {
    }

    /**
     * Get the size property: The database size - the total size of compressed data and index in bytes.
     *
     * @return the size value.
     */
    public Float size() {
        return this.size;
    }

    /**
     * Set the size property: The database size - the total size of compressed data and index in bytes.
     *
     * @param size the size value to set.
     * @return the DatabaseStatistics object itself.
     */
    public DatabaseStatistics withSize(Float size) {
        this.size = size;
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
