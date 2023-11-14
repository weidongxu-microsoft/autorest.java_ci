// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FailOverProperties model.
 */
@Fluent
public final class FailOverProperties {
    /*
     * Query parameter for the new primary location after failover.
     */
    @JsonProperty(value = "primaryLocation")
    private String primaryLocation;

    /*
     * Maximum time duration allowed complete data replication from primary to secondary. Use maximumGracePeriodInMins
     * = 0: For Unplanned Geo-Failover, which switches the role between primary and secondary immediately. The data
     * that is not being replicated yet will be discarded. Use maximumGracePeriodInMins > 0: For Planned
     * Geo-Failover/DR Drill, continue replicating data until grace period expires. Any data that is not replicated
     * during the grace period will be discarded. During the replication the namespace stops accepting any new
     * publishing requests
     */
    @JsonProperty(value = "maximumGracePeriodInMins")
    private Integer maximumGracePeriodInMins;

    /**
     * Creates an instance of FailOverProperties class.
     */
    public FailOverProperties() {
    }

    /**
     * Get the primaryLocation property: Query parameter for the new primary location after failover.
     * 
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Set the primaryLocation property: Query parameter for the new primary location after failover.
     * 
     * @param primaryLocation the primaryLocation value to set.
     * @return the FailOverProperties object itself.
     */
    public FailOverProperties withPrimaryLocation(String primaryLocation) {
        this.primaryLocation = primaryLocation;
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
        return this.maximumGracePeriodInMins;
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
     * @return the FailOverProperties object itself.
     */
    public FailOverProperties withMaximumGracePeriodInMins(Integer maximumGracePeriodInMins) {
        this.maximumGracePeriodInMins = maximumGracePeriodInMins;
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
