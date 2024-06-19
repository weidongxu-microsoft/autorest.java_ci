// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

/**
 * The type of action.
 */
public enum KeyRotationPolicyActionType {
    /**
     * Enum value rotate.
     */
    ROTATE("rotate"),

    /**
     * Enum value notify.
     */
    NOTIFY("notify");

    /**
     * The actual serialized value for a KeyRotationPolicyActionType instance.
     */
    private final String value;

    KeyRotationPolicyActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyRotationPolicyActionType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed KeyRotationPolicyActionType object, or null if unable to parse.
     */
    public static KeyRotationPolicyActionType fromString(String value) {
        if (value == null) {
            return null;
        }
        KeyRotationPolicyActionType[] items = KeyRotationPolicyActionType.values();
        for (KeyRotationPolicyActionType item : items) {
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
