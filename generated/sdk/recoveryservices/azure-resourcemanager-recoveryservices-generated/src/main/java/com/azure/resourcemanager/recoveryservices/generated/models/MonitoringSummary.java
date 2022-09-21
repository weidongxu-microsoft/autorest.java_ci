// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of the replication monitoring data for this vault. */
@Fluent
public final class MonitoringSummary {
    /*
     * Count of unhealthy VMs.
     */
    @JsonProperty(value = "unHealthyVmCount")
    private Integer unHealthyVmCount;

    /*
     * Count of unhealthy replication providers.
     */
    @JsonProperty(value = "unHealthyProviderCount")
    private Integer unHealthyProviderCount;

    /*
     * Count of all critical warnings.
     */
    @JsonProperty(value = "eventsCount")
    private Integer eventsCount;

    /*
     * Count of all deprecated recovery service providers.
     */
    @JsonProperty(value = "deprecatedProviderCount")
    private Integer deprecatedProviderCount;

    /*
     * Count of all the supported recovery service providers.
     */
    @JsonProperty(value = "supportedProviderCount")
    private Integer supportedProviderCount;

    /*
     * Count of all the unsupported recovery service providers.
     */
    @JsonProperty(value = "unsupportedProviderCount")
    private Integer unsupportedProviderCount;

    /** Creates an instance of MonitoringSummary class. */
    public MonitoringSummary() {
    }

    /**
     * Get the unHealthyVmCount property: Count of unhealthy VMs.
     *
     * @return the unHealthyVmCount value.
     */
    public Integer unHealthyVmCount() {
        return this.unHealthyVmCount;
    }

    /**
     * Set the unHealthyVmCount property: Count of unhealthy VMs.
     *
     * @param unHealthyVmCount the unHealthyVmCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnHealthyVmCount(Integer unHealthyVmCount) {
        this.unHealthyVmCount = unHealthyVmCount;
        return this;
    }

    /**
     * Get the unHealthyProviderCount property: Count of unhealthy replication providers.
     *
     * @return the unHealthyProviderCount value.
     */
    public Integer unHealthyProviderCount() {
        return this.unHealthyProviderCount;
    }

    /**
     * Set the unHealthyProviderCount property: Count of unhealthy replication providers.
     *
     * @param unHealthyProviderCount the unHealthyProviderCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnHealthyProviderCount(Integer unHealthyProviderCount) {
        this.unHealthyProviderCount = unHealthyProviderCount;
        return this;
    }

    /**
     * Get the eventsCount property: Count of all critical warnings.
     *
     * @return the eventsCount value.
     */
    public Integer eventsCount() {
        return this.eventsCount;
    }

    /**
     * Set the eventsCount property: Count of all critical warnings.
     *
     * @param eventsCount the eventsCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withEventsCount(Integer eventsCount) {
        this.eventsCount = eventsCount;
        return this;
    }

    /**
     * Get the deprecatedProviderCount property: Count of all deprecated recovery service providers.
     *
     * @return the deprecatedProviderCount value.
     */
    public Integer deprecatedProviderCount() {
        return this.deprecatedProviderCount;
    }

    /**
     * Set the deprecatedProviderCount property: Count of all deprecated recovery service providers.
     *
     * @param deprecatedProviderCount the deprecatedProviderCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withDeprecatedProviderCount(Integer deprecatedProviderCount) {
        this.deprecatedProviderCount = deprecatedProviderCount;
        return this;
    }

    /**
     * Get the supportedProviderCount property: Count of all the supported recovery service providers.
     *
     * @return the supportedProviderCount value.
     */
    public Integer supportedProviderCount() {
        return this.supportedProviderCount;
    }

    /**
     * Set the supportedProviderCount property: Count of all the supported recovery service providers.
     *
     * @param supportedProviderCount the supportedProviderCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withSupportedProviderCount(Integer supportedProviderCount) {
        this.supportedProviderCount = supportedProviderCount;
        return this;
    }

    /**
     * Get the unsupportedProviderCount property: Count of all the unsupported recovery service providers.
     *
     * @return the unsupportedProviderCount value.
     */
    public Integer unsupportedProviderCount() {
        return this.unsupportedProviderCount;
    }

    /**
     * Set the unsupportedProviderCount property: Count of all the unsupported recovery service providers.
     *
     * @param unsupportedProviderCount the unsupportedProviderCount value to set.
     * @return the MonitoringSummary object itself.
     */
    public MonitoringSummary withUnsupportedProviderCount(Integer unsupportedProviderCount) {
        this.unsupportedProviderCount = unsupportedProviderCount;
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
