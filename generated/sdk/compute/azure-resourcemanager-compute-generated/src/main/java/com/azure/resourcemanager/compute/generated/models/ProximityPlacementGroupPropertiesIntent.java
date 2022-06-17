// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies the user intent of the proximity placement group. */
@Fluent
public final class ProximityPlacementGroupPropertiesIntent {
    /*
     * Specifies possible sizes of virtual machines that can be created in the
     * proximity placement group.
     */
    @JsonProperty(value = "vmSizes")
    private List<String> vmSizes;

    /**
     * Get the vmSizes property: Specifies possible sizes of virtual machines that can be created in the proximity
     * placement group.
     *
     * @return the vmSizes value.
     */
    public List<String> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: Specifies possible sizes of virtual machines that can be created in the proximity
     * placement group.
     *
     * @param vmSizes the vmSizes value to set.
     * @return the ProximityPlacementGroupPropertiesIntent object itself.
     */
    public ProximityPlacementGroupPropertiesIntent withVmSizes(List<String> vmSizes) {
        this.vmSizes = vmSizes;
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