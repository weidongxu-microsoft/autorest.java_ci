// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Additional SQL Server feature settings. */
@Fluent
public final class AdditionalFeaturesServerConfigurations {
    /*
     * Enable or disable R services (SQL 2016 onwards).
     */
    @JsonProperty(value = "isRServicesEnabled")
    private Boolean isRServicesEnabled;

    /** Creates an instance of AdditionalFeaturesServerConfigurations class. */
    public AdditionalFeaturesServerConfigurations() {
    }

    /**
     * Get the isRServicesEnabled property: Enable or disable R services (SQL 2016 onwards).
     *
     * @return the isRServicesEnabled value.
     */
    public Boolean isRServicesEnabled() {
        return this.isRServicesEnabled;
    }

    /**
     * Set the isRServicesEnabled property: Enable or disable R services (SQL 2016 onwards).
     *
     * @param isRServicesEnabled the isRServicesEnabled value to set.
     * @return the AdditionalFeaturesServerConfigurations object itself.
     */
    public AdditionalFeaturesServerConfigurations withIsRServicesEnabled(Boolean isRServicesEnabled) {
        this.isRServicesEnabled = isRServicesEnabled;
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
