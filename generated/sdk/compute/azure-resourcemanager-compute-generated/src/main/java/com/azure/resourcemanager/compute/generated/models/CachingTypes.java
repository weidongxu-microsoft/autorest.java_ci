// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the caching requirements. Possible values are: **None,** **ReadOnly,** **ReadWrite.** The default values are: **None for Standard storage. ReadOnly for Premium storage**.
 */
public enum CachingTypes {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value ReadOnly.
     */
    READ_ONLY("ReadOnly"),

    /**
     * Enum value ReadWrite.
     */
    READ_WRITE("ReadWrite");

    /**
     * The actual serialized value for a CachingTypes instance.
     */
    private final String value;

    CachingTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CachingTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CachingTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static CachingTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        CachingTypes[] items = CachingTypes.values();
        for (CachingTypes item : items) {
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
