// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metric Dimension v1. */
@Fluent
public final class MetricDimensionV1 {
    /*
     * Name of the metrics dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Display name of the metrics dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * To be exported to shoe box.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /** Creates an instance of MetricDimensionV1 class. */
    public MetricDimensionV1() {
    }

    /**
     * Get the name property: Name of the metrics dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metrics dimension.
     *
     * @param name the name value to set.
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of the metrics dimension.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the metrics dimension.
     *
     * @param displayName the displayName value to set.
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: To be exported to shoe box.
     *
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: To be exported to shoe box.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
