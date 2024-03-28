// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure retention settings for the eventhub.
 */
@Fluent
public final class RetentionDescription {
    /*
     * Enumerates the possible values for cleanup policy
     */
    @JsonProperty(value = "cleanupPolicy")
    private CleanupPolicyRetentionDescription cleanupPolicy;

    /*
     * Number of hours to retain the events for this Event Hub. This value is only used when cleanupPolicy is Delete. If cleanupPolicy is Compact the returned value of this property is Long.MaxValue 
     */
    @JsonProperty(value = "retentionTimeInHours")
    private Long retentionTimeInHours;

    /*
     * Number of hours to retain the tombstone markers of a compacted Event Hub. This value is only used when cleanupPolicy is Compact. Consumer must complete reading the tombstone marker within this specified amount of time if consumer begins from starting offset to ensure they get a valid snapshot for the specific key described by the tombstone marker within the compacted Event Hub
     */
    @JsonProperty(value = "tombstoneRetentionTimeInHours")
    private Integer tombstoneRetentionTimeInHours;

    /**
     * Creates an instance of RetentionDescription class.
     */
    public RetentionDescription() {
    }

    /**
     * Get the cleanupPolicy property: Enumerates the possible values for cleanup policy.
     * 
     * @return the cleanupPolicy value.
     */
    public CleanupPolicyRetentionDescription cleanupPolicy() {
        return this.cleanupPolicy;
    }

    /**
     * Set the cleanupPolicy property: Enumerates the possible values for cleanup policy.
     * 
     * @param cleanupPolicy the cleanupPolicy value to set.
     * @return the RetentionDescription object itself.
     */
    public RetentionDescription withCleanupPolicy(CleanupPolicyRetentionDescription cleanupPolicy) {
        this.cleanupPolicy = cleanupPolicy;
        return this;
    }

    /**
     * Get the retentionTimeInHours property: Number of hours to retain the events for this Event Hub. This value is
     * only used when cleanupPolicy is Delete. If cleanupPolicy is Compact the returned value of this property is
     * Long.MaxValue.
     * 
     * @return the retentionTimeInHours value.
     */
    public Long retentionTimeInHours() {
        return this.retentionTimeInHours;
    }

    /**
     * Set the retentionTimeInHours property: Number of hours to retain the events for this Event Hub. This value is
     * only used when cleanupPolicy is Delete. If cleanupPolicy is Compact the returned value of this property is
     * Long.MaxValue.
     * 
     * @param retentionTimeInHours the retentionTimeInHours value to set.
     * @return the RetentionDescription object itself.
     */
    public RetentionDescription withRetentionTimeInHours(Long retentionTimeInHours) {
        this.retentionTimeInHours = retentionTimeInHours;
        return this;
    }

    /**
     * Get the tombstoneRetentionTimeInHours property: Number of hours to retain the tombstone markers of a compacted
     * Event Hub. This value is only used when cleanupPolicy is Compact. Consumer must complete reading the tombstone
     * marker within this specified amount of time if consumer begins from starting offset to ensure they get a valid
     * snapshot for the specific key described by the tombstone marker within the compacted Event Hub.
     * 
     * @return the tombstoneRetentionTimeInHours value.
     */
    public Integer tombstoneRetentionTimeInHours() {
        return this.tombstoneRetentionTimeInHours;
    }

    /**
     * Set the tombstoneRetentionTimeInHours property: Number of hours to retain the tombstone markers of a compacted
     * Event Hub. This value is only used when cleanupPolicy is Compact. Consumer must complete reading the tombstone
     * marker within this specified amount of time if consumer begins from starting offset to ensure they get a valid
     * snapshot for the specific key described by the tombstone marker within the compacted Event Hub.
     * 
     * @param tombstoneRetentionTimeInHours the tombstoneRetentionTimeInHours value to set.
     * @return the RetentionDescription object itself.
     */
    public RetentionDescription withTombstoneRetentionTimeInHours(Integer tombstoneRetentionTimeInHours) {
        this.tombstoneRetentionTimeInHours = tombstoneRetentionTimeInHours;
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
