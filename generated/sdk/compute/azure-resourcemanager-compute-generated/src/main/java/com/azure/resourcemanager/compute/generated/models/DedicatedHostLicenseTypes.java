// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the software license type that will be applied to the VMs deployed on the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The default value is: **None.**.
 */
public enum DedicatedHostLicenseTypes {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value Windows_Server_Hybrid.
     */
    WINDOWS_SERVER_HYBRID("Windows_Server_Hybrid"),

    /**
     * Enum value Windows_Server_Perpetual.
     */
    WINDOWS_SERVER_PERPETUAL("Windows_Server_Perpetual");

    /**
     * The actual serialized value for a DedicatedHostLicenseTypes instance.
     */
    private final String value;

    DedicatedHostLicenseTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DedicatedHostLicenseTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DedicatedHostLicenseTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static DedicatedHostLicenseTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        DedicatedHostLicenseTypes[] items = DedicatedHostLicenseTypes.values();
        for (DedicatedHostLicenseTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
