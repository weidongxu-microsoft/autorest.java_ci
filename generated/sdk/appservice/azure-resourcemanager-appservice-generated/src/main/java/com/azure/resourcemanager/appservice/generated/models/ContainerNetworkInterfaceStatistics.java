// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerNetworkInterfaceStatistics model. */
@Fluent
public final class ContainerNetworkInterfaceStatistics {
    /*
     * The rxBytes property.
     */
    @JsonProperty(value = "rxBytes")
    private Long rxBytes;

    /*
     * The rxPackets property.
     */
    @JsonProperty(value = "rxPackets")
    private Long rxPackets;

    /*
     * The rxErrors property.
     */
    @JsonProperty(value = "rxErrors")
    private Long rxErrors;

    /*
     * The rxDropped property.
     */
    @JsonProperty(value = "rxDropped")
    private Long rxDropped;

    /*
     * The txBytes property.
     */
    @JsonProperty(value = "txBytes")
    private Long txBytes;

    /*
     * The txPackets property.
     */
    @JsonProperty(value = "txPackets")
    private Long txPackets;

    /*
     * The txErrors property.
     */
    @JsonProperty(value = "txErrors")
    private Long txErrors;

    /*
     * The txDropped property.
     */
    @JsonProperty(value = "txDropped")
    private Long txDropped;

    /**
     * Get the rxBytes property: The rxBytes property.
     *
     * @return the rxBytes value.
     */
    public Long rxBytes() {
        return this.rxBytes;
    }

    /**
     * Set the rxBytes property: The rxBytes property.
     *
     * @param rxBytes the rxBytes value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withRxBytes(Long rxBytes) {
        this.rxBytes = rxBytes;
        return this;
    }

    /**
     * Get the rxPackets property: The rxPackets property.
     *
     * @return the rxPackets value.
     */
    public Long rxPackets() {
        return this.rxPackets;
    }

    /**
     * Set the rxPackets property: The rxPackets property.
     *
     * @param rxPackets the rxPackets value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withRxPackets(Long rxPackets) {
        this.rxPackets = rxPackets;
        return this;
    }

    /**
     * Get the rxErrors property: The rxErrors property.
     *
     * @return the rxErrors value.
     */
    public Long rxErrors() {
        return this.rxErrors;
    }

    /**
     * Set the rxErrors property: The rxErrors property.
     *
     * @param rxErrors the rxErrors value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withRxErrors(Long rxErrors) {
        this.rxErrors = rxErrors;
        return this;
    }

    /**
     * Get the rxDropped property: The rxDropped property.
     *
     * @return the rxDropped value.
     */
    public Long rxDropped() {
        return this.rxDropped;
    }

    /**
     * Set the rxDropped property: The rxDropped property.
     *
     * @param rxDropped the rxDropped value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withRxDropped(Long rxDropped) {
        this.rxDropped = rxDropped;
        return this;
    }

    /**
     * Get the txBytes property: The txBytes property.
     *
     * @return the txBytes value.
     */
    public Long txBytes() {
        return this.txBytes;
    }

    /**
     * Set the txBytes property: The txBytes property.
     *
     * @param txBytes the txBytes value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withTxBytes(Long txBytes) {
        this.txBytes = txBytes;
        return this;
    }

    /**
     * Get the txPackets property: The txPackets property.
     *
     * @return the txPackets value.
     */
    public Long txPackets() {
        return this.txPackets;
    }

    /**
     * Set the txPackets property: The txPackets property.
     *
     * @param txPackets the txPackets value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withTxPackets(Long txPackets) {
        this.txPackets = txPackets;
        return this;
    }

    /**
     * Get the txErrors property: The txErrors property.
     *
     * @return the txErrors value.
     */
    public Long txErrors() {
        return this.txErrors;
    }

    /**
     * Set the txErrors property: The txErrors property.
     *
     * @param txErrors the txErrors value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withTxErrors(Long txErrors) {
        this.txErrors = txErrors;
        return this;
    }

    /**
     * Get the txDropped property: The txDropped property.
     *
     * @return the txDropped value.
     */
    public Long txDropped() {
        return this.txDropped;
    }

    /**
     * Set the txDropped property: The txDropped property.
     *
     * @param txDropped the txDropped value to set.
     * @return the ContainerNetworkInterfaceStatistics object itself.
     */
    public ContainerNetworkInterfaceStatistics withTxDropped(Long txDropped) {
        this.txDropped = txDropped;
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
