// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Shared/dedicated workers. */
public enum ComputeModeOptions {
    /** Enum value Shared. */
    SHARED("Shared"),

    /** Enum value Dedicated. */
    DEDICATED("Dedicated"),

    /** Enum value Dynamic. */
    DYNAMIC("Dynamic");

    /** The actual serialized value for a ComputeModeOptions instance. */
    private final String value;

    ComputeModeOptions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeModeOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeModeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeModeOptions fromString(String value) {
        if (value == null) {
            return null;
        }
        ComputeModeOptions[] items = ComputeModeOptions.values();
        for (ComputeModeOptions item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
