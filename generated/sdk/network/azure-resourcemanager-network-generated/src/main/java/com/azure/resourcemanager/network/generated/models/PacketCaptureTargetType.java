// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

/**
 * Target type of the resource provided.
 */
public enum PacketCaptureTargetType {
    /**
     * Enum value AzureVM.
     */
    AZURE_VM("AzureVM"),

    /**
     * Enum value AzureVMSS.
     */
    AZURE_VMSS("AzureVMSS");

    /**
     * The actual serialized value for a PacketCaptureTargetType instance.
     */
    private final String value;

    PacketCaptureTargetType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PacketCaptureTargetType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PacketCaptureTargetType object, or null if unable to parse.
     */
    public static PacketCaptureTargetType fromString(String value) {
        if (value == null) {
            return null;
        }
        PacketCaptureTargetType[] items = PacketCaptureTargetType.values();
        for (PacketCaptureTargetType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
