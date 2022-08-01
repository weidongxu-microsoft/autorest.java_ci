// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The name of the current provisioning operation. */
public enum ProvisioningOperation {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Create. */
    CREATE("Create"),

    /** Enum value Delete. */
    DELETE("Delete"),

    /** Enum value Waiting. */
    WAITING("Waiting"),

    /** Enum value AzureAsyncOperationWaiting. */
    AZURE_ASYNC_OPERATION_WAITING("AzureAsyncOperationWaiting"),

    /** Enum value ResourceCacheWaiting. */
    RESOURCE_CACHE_WAITING("ResourceCacheWaiting"),

    /** Enum value Action. */
    ACTION("Action"),

    /** Enum value Read. */
    READ("Read"),

    /** Enum value EvaluateDeploymentOutput. */
    EVALUATE_DEPLOYMENT_OUTPUT("EvaluateDeploymentOutput"),

    /** Enum value DeploymentCleanup. */
    DEPLOYMENT_CLEANUP("DeploymentCleanup");

    /** The actual serialized value for a ProvisioningOperation instance. */
    private final String value;

    ProvisioningOperation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProvisioningOperation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProvisioningOperation object, or null if unable to parse.
     */
    @JsonCreator
    public static ProvisioningOperation fromString(String value) {
        if (value == null) {
            return null;
        }
        ProvisioningOperation[] items = ProvisioningOperation.values();
        for (ProvisioningOperation item : items) {
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
