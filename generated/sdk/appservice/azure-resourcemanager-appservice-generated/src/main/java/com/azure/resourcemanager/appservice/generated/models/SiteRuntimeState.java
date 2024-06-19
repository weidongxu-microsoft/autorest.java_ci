// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

/**
 * Defines values for SiteRuntimeState.
 */
public enum SiteRuntimeState {
    /**
     * Enum value READY.
     */
    READY("READY"),

    /**
     * Enum value STOPPED.
     */
    STOPPED("STOPPED"),

    /**
     * Enum value UNKNOWN.
     */
    UNKNOWN("UNKNOWN");

    /**
     * The actual serialized value for a SiteRuntimeState instance.
     */
    private final String value;

    SiteRuntimeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SiteRuntimeState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed SiteRuntimeState object, or null if unable to parse.
     */
    public static SiteRuntimeState fromString(String value) {
        if (value == null) {
            return null;
        }
        SiteRuntimeState[] items = SiteRuntimeState.values();
        for (SiteRuntimeState item : items) {
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
