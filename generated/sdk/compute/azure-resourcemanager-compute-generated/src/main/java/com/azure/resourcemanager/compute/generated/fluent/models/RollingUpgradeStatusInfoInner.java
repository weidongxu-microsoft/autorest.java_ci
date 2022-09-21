// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.RollingUpgradePolicy;
import com.azure.resourcemanager.compute.generated.models.RollingUpgradeProgressInfo;
import com.azure.resourcemanager.compute.generated.models.RollingUpgradeRunningStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The status of the latest virtual machine scale set rolling upgrade. */
@Fluent
public final class RollingUpgradeStatusInfoInner extends Resource {
    /*
     * The status of the latest virtual machine scale set rolling upgrade.
     */
    @JsonProperty(value = "properties")
    private RollingUpgradeStatusInfoProperties innerProperties;

    /** Creates an instance of RollingUpgradeStatusInfoInner class. */
    public RollingUpgradeStatusInfoInner() {
    }

    /**
     * Get the innerProperties property: The status of the latest virtual machine scale set rolling upgrade.
     *
     * @return the innerProperties value.
     */
    private RollingUpgradeStatusInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RollingUpgradeStatusInfoInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RollingUpgradeStatusInfoInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the policy property: The rolling upgrade policies applied for this upgrade.
     *
     * @return the policy value.
     */
    public RollingUpgradePolicy policy() {
        return this.innerProperties() == null ? null : this.innerProperties().policy();
    }

    /**
     * Get the runningStatus property: Information about the current running state of the overall upgrade.
     *
     * @return the runningStatus value.
     */
    public RollingUpgradeRunningStatus runningStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().runningStatus();
    }

    /**
     * Get the progress property: Information about the number of virtual machine instances in each upgrade state.
     *
     * @return the progress value.
     */
    public RollingUpgradeProgressInfo progress() {
        return this.innerProperties() == null ? null : this.innerProperties().progress();
    }

    /**
     * Get the error property: Error details for this upgrade, if there are any.
     *
     * @return the error value.
     */
    public ApiError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
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
