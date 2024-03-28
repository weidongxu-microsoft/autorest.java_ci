// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysql.generated.fluent.models.MaintenancePropertiesForUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Represents a maintenance update parameter.
 */
@Fluent
public final class MaintenanceUpdate {
    /*
     * The properties of a maintenance update parameter
     */
    @JsonProperty(value = "properties")
    private MaintenancePropertiesForUpdate innerProperties;

    /**
     * Creates an instance of MaintenanceUpdate class.
     */
    public MaintenanceUpdate() {
    }

    /**
     * Get the innerProperties property: The properties of a maintenance update parameter.
     * 
     * @return the innerProperties value.
     */
    private MaintenancePropertiesForUpdate innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @return the maintenanceStartTime value.
     */
    public OffsetDateTime maintenanceStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceStartTime();
    }

    /**
     * Set the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @param maintenanceStartTime the maintenanceStartTime value to set.
     * @return the MaintenanceUpdate object itself.
     */
    public MaintenanceUpdate withMaintenanceStartTime(OffsetDateTime maintenanceStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenancePropertiesForUpdate();
        }
        this.innerProperties().withMaintenanceStartTime(maintenanceStartTime);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}