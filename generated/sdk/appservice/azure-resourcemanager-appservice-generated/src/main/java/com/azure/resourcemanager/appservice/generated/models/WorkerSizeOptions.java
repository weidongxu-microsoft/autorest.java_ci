// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Size of the machines.
 */
public enum WorkerSizeOptions {
    /**
     * Enum value Small.
     */
    SMALL("Small"),

    /**
     * Enum value Medium.
     */
    MEDIUM("Medium"),

    /**
     * Enum value Large.
     */
    LARGE("Large"),

    /**
     * Enum value D1.
     */
    D1("D1"),

    /**
     * Enum value D2.
     */
    D2("D2"),

    /**
     * Enum value D3.
     */
    D3("D3"),

    /**
     * Enum value SmallV3.
     */
    SMALL_V3("SmallV3"),

    /**
     * Enum value MediumV3.
     */
    MEDIUM_V3("MediumV3"),

    /**
     * Enum value LargeV3.
     */
    LARGE_V3("LargeV3"),

    /**
     * Enum value NestedSmall.
     */
    NESTED_SMALL("NestedSmall"),

    /**
     * Enum value NestedSmallLinux.
     */
    NESTED_SMALL_LINUX("NestedSmallLinux"),

    /**
     * Enum value Default.
     */
    DEFAULT("Default");

    /**
     * The actual serialized value for a WorkerSizeOptions instance.
     */
    private final String value;

    WorkerSizeOptions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkerSizeOptions instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed WorkerSizeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkerSizeOptions fromString(String value) {
        if (value == null) {
            return null;
        }
        WorkerSizeOptions[] items = WorkerSizeOptions.values();
        for (WorkerSizeOptions item : items) {
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
