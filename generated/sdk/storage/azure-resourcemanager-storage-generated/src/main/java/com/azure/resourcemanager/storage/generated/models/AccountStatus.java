// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets the status indicating whether the primary location of the storage account is available or unavailable.
 */
public enum AccountStatus {
    /**
     * Enum value available.
     */
    AVAILABLE("available"),

    /**
     * Enum value unavailable.
     */
    UNAVAILABLE("unavailable");

    /**
     * The actual serialized value for a AccountStatus instance.
     */
    private final String value;

    AccountStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccountStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AccountStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static AccountStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        AccountStatus[] items = AccountStatus.values();
        for (AccountStatus item : items) {
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
