// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

/**
 * Defines values for ListKeyExpand.
 */
public enum ListKeyExpand {
    /**
     * Enum value kerb.
     */
    KERB("kerb");

    /**
     * The actual serialized value for a ListKeyExpand instance.
     */
    private final String value;

    ListKeyExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ListKeyExpand instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ListKeyExpand object, or null if unable to parse.
     */
    public static ListKeyExpand fromString(String value) {
        if (value == null) {
            return null;
        }
        ListKeyExpand[] items = ListKeyExpand.values();
        for (ListKeyExpand item : items) {
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
