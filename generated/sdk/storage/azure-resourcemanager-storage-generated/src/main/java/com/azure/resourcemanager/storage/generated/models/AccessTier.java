// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Required for storage accounts where kind = BlobStorage. The access tier is used for billing. The 'Premium' access
 * tier is the default value for premium block blobs storage account type and it cannot be changed for the premium block
 * blobs storage account type.
 */
public enum AccessTier {
    /**
     * Enum value Hot.
     */
    HOT("Hot"),

    /**
     * Enum value Cool.
     */
    COOL("Cool"),

    /**
     * Enum value Premium.
     */
    PREMIUM("Premium");

    /**
     * The actual serialized value for a AccessTier instance.
     */
    private final String value;

    AccessTier(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessTier instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AccessTier object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessTier fromString(String value) {
        if (value == null) {
            return null;
        }
        AccessTier[] items = AccessTier.values();
        for (AccessTier item : items) {
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
