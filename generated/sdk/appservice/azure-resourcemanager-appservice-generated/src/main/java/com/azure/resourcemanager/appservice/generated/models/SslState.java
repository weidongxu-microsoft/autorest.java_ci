// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** SSL type. */
public enum SslState {
    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value SniEnabled. */
    SNI_ENABLED("SniEnabled"),

    /** Enum value IpBasedEnabled. */
    IP_BASED_ENABLED("IpBasedEnabled");

    /** The actual serialized value for a SslState instance. */
    private final String value;

    SslState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SslState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SslState object, or null if unable to parse.
     */
    @JsonCreator
    public static SslState fromString(String value) {
        if (value == null) {
            return null;
        }
        SslState[] items = SslState.values();
        for (SslState item : items) {
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
