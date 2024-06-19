// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

/**
 * Indicates the status of the receiver. Receivers that are not Enabled will not receive any communications.
 */
public enum ReceiverStatus {
    /**
     * Enum value NotSpecified.
     */
    NOT_SPECIFIED("NotSpecified"),

    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a ReceiverStatus instance.
     */
    private final String value;

    ReceiverStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReceiverStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ReceiverStatus object, or null if unable to parse.
     */
    public static ReceiverStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        ReceiverStatus[] items = ReceiverStatus.values();
        for (ReceiverStatus item : items) {
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
