// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The vault's create mode to indicate whether the vault need to be recovered or not.
 */
public enum CreateMode {
    /**
     * Enum value recover.
     */
    RECOVER("recover"),

    /**
     * Enum value default.
     */
    DEFAULT("default");

    /**
     * The actual serialized value for a CreateMode instance.
     */
    private final String value;

    CreateMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateMode object, or null if unable to parse.
     */
    @JsonCreator
    public static CreateMode fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateMode[] items = CreateMode.values();
        for (CreateMode item : items) {
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
