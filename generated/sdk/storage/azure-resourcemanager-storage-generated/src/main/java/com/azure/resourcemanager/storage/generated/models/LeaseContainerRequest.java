// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lease Container request schema.
 */
@Fluent
public final class LeaseContainerRequest {
    /*
     * Specifies the lease action. Can be one of the available actions.
     */
    @JsonProperty(value = "action", required = true)
    private LeaseContainerRequestAction action;

    /*
     * Identifies the lease. Can be specified in any valid GUID string format.
     */
    @JsonProperty(value = "leaseId")
    private String leaseId;

    /*
     * Optional. For a break action, proposed duration the lease should continue before it is broken, in seconds,
     * between 0 and 60.
     */
    @JsonProperty(value = "breakPeriod")
    private Integer breakPeriod;

    /*
     * Required for acquire. Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that
     * never expires.
     */
    @JsonProperty(value = "leaseDuration")
    private Integer leaseDuration;

    /*
     * Optional for acquire, required for change. Proposed lease ID, in a GUID string format.
     */
    @JsonProperty(value = "proposedLeaseId")
    private String proposedLeaseId;

    /**
     * Creates an instance of LeaseContainerRequest class.
     */
    public LeaseContainerRequest() {
    }

    /**
     * Get the action property: Specifies the lease action. Can be one of the available actions.
     * 
     * @return the action value.
     */
    public LeaseContainerRequestAction action() {
        return this.action;
    }

    /**
     * Set the action property: Specifies the lease action. Can be one of the available actions.
     * 
     * @param action the action value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withAction(LeaseContainerRequestAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the leaseId property: Identifies the lease. Can be specified in any valid GUID string format.
     * 
     * @return the leaseId value.
     */
    public String leaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: Identifies the lease. Can be specified in any valid GUID string format.
     * 
     * @param leaseId the leaseId value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get the breakPeriod property: Optional. For a break action, proposed duration the lease should continue before
     * it is broken, in seconds, between 0 and 60.
     * 
     * @return the breakPeriod value.
     */
    public Integer breakPeriod() {
        return this.breakPeriod;
    }

    /**
     * Set the breakPeriod property: Optional. For a break action, proposed duration the lease should continue before
     * it is broken, in seconds, between 0 and 60.
     * 
     * @param breakPeriod the breakPeriod value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withBreakPeriod(Integer breakPeriod) {
        this.breakPeriod = breakPeriod;
        return this;
    }

    /**
     * Get the leaseDuration property: Required for acquire. Specifies the duration of the lease, in seconds, or
     * negative one (-1) for a lease that never expires.
     * 
     * @return the leaseDuration value.
     */
    public Integer leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: Required for acquire. Specifies the duration of the lease, in seconds, or
     * negative one (-1) for a lease that never expires.
     * 
     * @param leaseDuration the leaseDuration value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withLeaseDuration(Integer leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the proposedLeaseId property: Optional for acquire, required for change. Proposed lease ID, in a GUID string
     * format.
     * 
     * @return the proposedLeaseId value.
     */
    public String proposedLeaseId() {
        return this.proposedLeaseId;
    }

    /**
     * Set the proposedLeaseId property: Optional for acquire, required for change. Proposed lease ID, in a GUID string
     * format.
     * 
     * @param proposedLeaseId the proposedLeaseId value to set.
     * @return the LeaseContainerRequest object itself.
     */
    public LeaseContainerRequest withProposedLeaseId(String proposedLeaseId) {
        this.proposedLeaseId = proposedLeaseId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property action in model LeaseContainerRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LeaseContainerRequest.class);
}
