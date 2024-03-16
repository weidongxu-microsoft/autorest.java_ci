// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the last provisioning operation performed on the search service. Provisioning is an intermediate state that occurs while service capacity is being established. After capacity is set up, provisioningState changes to either 'succeeded' or 'failed'. Client applications can poll provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search Service operation to see when an operation is completed. If you are using the free service, this value tends to come back as 'succeeded' directly in the call to Create search service. This is because the free service uses capacity that is already set up.
 */
public enum ProvisioningState {
    /**
     * Enum value succeeded.
     */
    SUCCEEDED("succeeded"),

    /**
     * Enum value provisioning.
     */
    PROVISIONING("provisioning"),

    /**
     * Enum value failed.
     */
    FAILED("failed");

    /**
     * The actual serialized value for a ProvisioningState instance.
     */
    private final String value;

    ProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProvisioningState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static ProvisioningState fromString(String value) {
        if (value == null) {
            return null;
        }
        ProvisioningState[] items = ProvisioningState.values();
        for (ProvisioningState item : items) {
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
