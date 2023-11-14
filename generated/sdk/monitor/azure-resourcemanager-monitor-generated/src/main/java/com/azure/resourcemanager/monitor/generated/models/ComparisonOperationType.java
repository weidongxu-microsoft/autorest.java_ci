// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * the operator that is used to compare the metric data and the threshold.
 */
public enum ComparisonOperationType {
    /**
     * Enum value Equals.
     */
    EQUALS("Equals"),

    /**
     * Enum value NotEquals.
     */
    NOT_EQUALS("NotEquals"),

    /**
     * Enum value GreaterThan.
     */
    GREATER_THAN("GreaterThan"),

    /**
     * Enum value GreaterThanOrEqual.
     */
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),

    /**
     * Enum value LessThan.
     */
    LESS_THAN("LessThan"),

    /**
     * Enum value LessThanOrEqual.
     */
    LESS_THAN_OR_EQUAL("LessThanOrEqual");

    /**
     * The actual serialized value for a ComparisonOperationType instance.
     */
    private final String value;

    ComparisonOperationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComparisonOperationType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ComparisonOperationType object, or null if unable to parse.
     */
    @JsonCreator
    public static ComparisonOperationType fromString(String value) {
        if (value == null) {
            return null;
        }
        ComparisonOperationType[] items = ComparisonOperationType.values();
        for (ComparisonOperationType item : items) {
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
