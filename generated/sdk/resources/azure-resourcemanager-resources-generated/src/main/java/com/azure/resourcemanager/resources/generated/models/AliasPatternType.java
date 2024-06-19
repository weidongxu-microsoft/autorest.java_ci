// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

/**
 * The type of alias pattern.
 */
public enum AliasPatternType {
    /**
     * Enum value NotSpecified.
     */
    NOT_SPECIFIED("NotSpecified"),

    /**
     * Enum value Extract.
     */
    EXTRACT("Extract");

    /**
     * The actual serialized value for a AliasPatternType instance.
     */
    private final String value;

    AliasPatternType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AliasPatternType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AliasPatternType object, or null if unable to parse.
     */
    public static AliasPatternType fromString(String value) {
        if (value == null) {
            return null;
        }
        AliasPatternType[] items = AliasPatternType.values();
        for (AliasPatternType item : items) {
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
