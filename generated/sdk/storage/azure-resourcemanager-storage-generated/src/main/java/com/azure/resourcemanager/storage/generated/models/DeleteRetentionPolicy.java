// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service properties for soft delete.
 */
@Fluent
public final class DeleteRetentionPolicy {
    /*
     * Indicates whether DeleteRetentionPolicy is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /*
     * This property when set to true allows deletion of the soft deleted blob versions and snapshots. This property cannot be used blob restore policy. This property only applies to blob service and does not apply to containers or file share.
     */
    @JsonProperty(value = "allowPermanentDelete")
    private Boolean allowPermanentDelete;

    /**
     * Creates an instance of DeleteRetentionPolicy class.
     */
    public DeleteRetentionPolicy() {
    }

    /**
     * Get the enabled property: Indicates whether DeleteRetentionPolicy is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether DeleteRetentionPolicy is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     * @param days the days value to set.
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the allowPermanentDelete property: This property when set to true allows deletion of the soft deleted blob versions and snapshots. This property cannot be used blob restore policy. This property only applies to blob service and does not apply to containers or file share.
     * 
     * @return the allowPermanentDelete value.
     */
    public Boolean allowPermanentDelete() {
        return this.allowPermanentDelete;
    }

    /**
     * Set the allowPermanentDelete property: This property when set to true allows deletion of the soft deleted blob versions and snapshots. This property cannot be used blob restore policy. This property only applies to blob service and does not apply to containers or file share.
     * 
     * @param allowPermanentDelete the allowPermanentDelete value to set.
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withAllowPermanentDelete(Boolean allowPermanentDelete) {
        this.allowPermanentDelete = allowPermanentDelete;
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
