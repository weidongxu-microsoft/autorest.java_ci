// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the target splits for Spot and Regular priority VMs within a scale set with flexible orchestration mode.
 * With this property the customer is able to specify the base number of regular priority VMs created as the VMSS flex
 * instance scales out and the split between Spot and Regular priority VMs after this base target has been reached.
 */
@Fluent
public final class PriorityMixPolicy {
    /*
     * The base number of regular priority VMs that will be created in this scale set as it scales out.
     */
    @JsonProperty(value = "baseRegularPriorityCount")
    private Integer baseRegularPriorityCount;

    /*
     * The percentage of VM instances, after the base regular priority count has been reached, that are expected to use
     * regular priority.
     */
    @JsonProperty(value = "regularPriorityPercentageAboveBase")
    private Integer regularPriorityPercentageAboveBase;

    /** Creates an instance of PriorityMixPolicy class. */
    public PriorityMixPolicy() {
    }

    /**
     * Get the baseRegularPriorityCount property: The base number of regular priority VMs that will be created in this
     * scale set as it scales out.
     *
     * @return the baseRegularPriorityCount value.
     */
    public Integer baseRegularPriorityCount() {
        return this.baseRegularPriorityCount;
    }

    /**
     * Set the baseRegularPriorityCount property: The base number of regular priority VMs that will be created in this
     * scale set as it scales out.
     *
     * @param baseRegularPriorityCount the baseRegularPriorityCount value to set.
     * @return the PriorityMixPolicy object itself.
     */
    public PriorityMixPolicy withBaseRegularPriorityCount(Integer baseRegularPriorityCount) {
        this.baseRegularPriorityCount = baseRegularPriorityCount;
        return this;
    }

    /**
     * Get the regularPriorityPercentageAboveBase property: The percentage of VM instances, after the base regular
     * priority count has been reached, that are expected to use regular priority.
     *
     * @return the regularPriorityPercentageAboveBase value.
     */
    public Integer regularPriorityPercentageAboveBase() {
        return this.regularPriorityPercentageAboveBase;
    }

    /**
     * Set the regularPriorityPercentageAboveBase property: The percentage of VM instances, after the base regular
     * priority count has been reached, that are expected to use regular priority.
     *
     * @param regularPriorityPercentageAboveBase the regularPriorityPercentageAboveBase value to set.
     * @return the PriorityMixPolicy object itself.
     */
    public PriorityMixPolicy withRegularPriorityPercentageAboveBase(Integer regularPriorityPercentageAboveBase) {
        this.regularPriorityPercentageAboveBase = regularPriorityPercentageAboveBase;
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
