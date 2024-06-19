// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

/**
 * The operation status.
 */
public enum OperationStatus {
    /**
     * Enum value Pending.
     */
    PENDING("Pending"),

    /**
     * Enum value InProgress.
     */
    IN_PROGRESS("InProgress"),

    /**
     * Enum value Succeeded.
     */
    SUCCEEDED("Succeeded"),

    /**
     * Enum value Failed.
     */
    FAILED("Failed"),

    /**
     * Enum value CancelInProgress.
     */
    CANCEL_IN_PROGRESS("CancelInProgress"),

    /**
     * Enum value Canceled.
     */
    CANCELED("Canceled");

    /**
     * The actual serialized value for a OperationStatus instance.
     */
    private final String value;

    OperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed OperationStatus object, or null if unable to parse.
     */
    public static OperationStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        OperationStatus[] items = OperationStatus.values();
        for (OperationStatus item : items) {
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
