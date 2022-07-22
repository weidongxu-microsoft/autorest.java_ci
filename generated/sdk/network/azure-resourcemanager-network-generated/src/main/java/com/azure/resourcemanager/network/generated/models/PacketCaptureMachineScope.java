// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of AzureVMSS instances which can be included or excluded to run packet capture. If both included and excluded
 * are empty, then the packet capture will run on all instances of AzureVMSS.
 */
@Fluent
public final class PacketCaptureMachineScope {
    /*
     * List of AzureVMSS instances to run packet capture on.
     */
    @JsonProperty(value = "include")
    private List<String> include;

    /*
     * List of AzureVMSS instances which has to be excluded from the AzureVMSS
     * from running packet capture.
     */
    @JsonProperty(value = "exclude")
    private List<String> exclude;

    /**
     * Get the include property: List of AzureVMSS instances to run packet capture on.
     *
     * @return the include value.
     */
    public List<String> include() {
        return this.include;
    }

    /**
     * Set the include property: List of AzureVMSS instances to run packet capture on.
     *
     * @param include the include value to set.
     * @return the PacketCaptureMachineScope object itself.
     */
    public PacketCaptureMachineScope withInclude(List<String> include) {
        this.include = include;
        return this;
    }

    /**
     * Get the exclude property: List of AzureVMSS instances which has to be excluded from the AzureVMSS from running
     * packet capture.
     *
     * @return the exclude value.
     */
    public List<String> exclude() {
        return this.exclude;
    }

    /**
     * Set the exclude property: List of AzureVMSS instances which has to be excluded from the AzureVMSS from running
     * packet capture.
     *
     * @param exclude the exclude value to set.
     * @return the PacketCaptureMachineScope object itself.
     */
    public PacketCaptureMachineScope withExclude(List<String> exclude) {
        this.exclude = exclude;
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