// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

/**
 * Defines values for InstanceViewTypes.
 */
public enum InstanceViewTypes {
    /**
     * Enum value instanceView.
     */
    INSTANCE_VIEW("instanceView"),

    /**
     * Enum value userData.
     */
    USER_DATA("userData");

    /**
     * The actual serialized value for a InstanceViewTypes instance.
     */
    private final String value;

    InstanceViewTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InstanceViewTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed InstanceViewTypes object, or null if unable to parse.
     */
    public static InstanceViewTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        InstanceViewTypes[] items = InstanceViewTypes.values();
        for (InstanceViewTypes item : items) {
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
