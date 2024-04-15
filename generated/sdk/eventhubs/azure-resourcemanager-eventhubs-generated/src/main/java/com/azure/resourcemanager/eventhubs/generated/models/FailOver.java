// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.FailOverProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FailOver model.
 */
@Fluent
public final class FailOver {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private FailOverProperties innerProperties;

    /**
     * Creates an instance of FailOver class.
     */
    public FailOver() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private FailOverProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the primaryLocation property: Query parameter for the new primary location after failover.
     * 
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryLocation();
    }

    /**
     * Set the primaryLocation property: Query parameter for the new primary location after failover.
     * 
     * @param primaryLocation the primaryLocation value to set.
     * @return the FailOver object itself.
     */
    public FailOver withPrimaryLocation(String primaryLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FailOverProperties();
        }
        this.innerProperties().withPrimaryLocation(primaryLocation);
        return this;
    }

    /**
     * Get the maximumGracePeriodInMins property: Maximum time duration allowed complete data replication from primary
     * to secondary. Use maximumGracePeriodInMins = 0: For Unplanned Geo-Failover, which switches the role between
     * primary and secondary immediately. The data that is not being replicated yet will be discarded. Use
     * maximumGracePeriodInMins &gt; 0: For Planned Geo-Failover/DR Drill, continue replicating data until grace period
     * expires. Any data that is not replicated during the grace period will be discarded. During the replication the
     * namespace stops accepting any new publishing requests.
     * 
     * @return the maximumGracePeriodInMins value.
     */
    public Integer maximumGracePeriodInMins() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumGracePeriodInMins();
    }

    /**
     * Set the maximumGracePeriodInMins property: Maximum time duration allowed complete data replication from primary
     * to secondary. Use maximumGracePeriodInMins = 0: For Unplanned Geo-Failover, which switches the role between
     * primary and secondary immediately. The data that is not being replicated yet will be discarded. Use
     * maximumGracePeriodInMins &gt; 0: For Planned Geo-Failover/DR Drill, continue replicating data until grace period
     * expires. Any data that is not replicated during the grace period will be discarded. During the replication the
     * namespace stops accepting any new publishing requests.
     * 
     * @param maximumGracePeriodInMins the maximumGracePeriodInMins value to set.
     * @return the FailOver object itself.
     */
    public FailOver withMaximumGracePeriodInMins(Integer maximumGracePeriodInMins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FailOverProperties();
        }
        this.innerProperties().withMaximumGracePeriodInMins(maximumGracePeriodInMins);
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