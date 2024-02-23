// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Virtual Machine operation response.
 */
@Fluent
public final class VirtualMachineScaleSetListWithLinkResult {
    /*
     * The list of virtual machine scale sets.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetInner> value;

    /*
     * The uri to fetch the next page of Virtual Machine Scale Sets. Call ListNext() with this to fetch the next page of
     * Virtual Machine Scale Sets.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VirtualMachineScaleSetListWithLinkResult class.
     */
    public VirtualMachineScaleSetListWithLinkResult() {
    }

    /**
     * Get the value property: The list of virtual machine scale sets.
     * 
     * @return the value value.
     */
    public List<VirtualMachineScaleSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine scale sets.
     * 
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetListWithLinkResult object itself.
     */
    public VirtualMachineScaleSetListWithLinkResult withValue(List<VirtualMachineScaleSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Virtual Machine Scale Sets. Call ListNext() with
     * this to fetch the next page of Virtual Machine Scale Sets.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Virtual Machine Scale Sets. Call ListNext() with
     * this to fetch the next page of Virtual Machine Scale Sets.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetListWithLinkResult object itself.
     */
    public VirtualMachineScaleSetListWithLinkResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model VirtualMachineScaleSetListWithLinkResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetListWithLinkResult.class);
}
