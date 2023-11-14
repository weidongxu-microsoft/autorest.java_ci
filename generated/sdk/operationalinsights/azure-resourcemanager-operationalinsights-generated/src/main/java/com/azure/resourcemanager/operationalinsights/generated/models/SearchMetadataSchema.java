// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema metadata for search.
 */
@Fluent
public final class SearchMetadataSchema {
    /*
     * The name of the metadata schema.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The version of the metadata schema.
     */
    @JsonProperty(value = "version")
    private Integer version;

    /**
     * Creates an instance of SearchMetadataSchema class.
     */
    public SearchMetadataSchema() {
    }

    /**
     * Get the name property: The name of the metadata schema.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metadata schema.
     * 
     * @param name the name value to set.
     * @return the SearchMetadataSchema object itself.
     */
    public SearchMetadataSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the metadata schema.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the metadata schema.
     * 
     * @param version the version value to set.
     * @return the SearchMetadataSchema object itself.
     */
    public SearchMetadataSchema withVersion(Integer version) {
        this.version = version;
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
