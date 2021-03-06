// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Activity Log alert condition that is met by comparing an activity log field and value. */
@Fluent
public final class ActivityLogAlertLeafCondition {
    /*
     * The name of the field that this condition will examine. The possible values for this field are
     * (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName', 'resourceGroup',
     * 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with 'properties.'.
     */
    @JsonProperty(value = "field", required = true)
    private String field;

    /*
     * The field value will be compared to this value (case-insensitive) to determine if the condition is met.
     */
    @JsonProperty(value = "equals", required = true)
    private String equals;

    /**
     * Get the field property: The name of the field that this condition will examine. The possible values for this
     * field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName', 'resourceGroup',
     * 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with 'properties.'.
     *
     * @return the field value.
     */
    public String field() {
        return this.field;
    }

    /**
     * Set the field property: The name of the field that this condition will examine. The possible values for this
     * field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName', 'resourceGroup',
     * 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with 'properties.'.
     *
     * @param field the field value to set.
     * @return the ActivityLogAlertLeafCondition object itself.
     */
    public ActivityLogAlertLeafCondition withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the equals property: The field value will be compared to this value (case-insensitive) to determine if the
     * condition is met.
     *
     * @return the equals value.
     */
    public String equals() {
        return this.equals;
    }

    /**
     * Set the equals property: The field value will be compared to this value (case-insensitive) to determine if the
     * condition is met.
     *
     * @param equals the equals value to set.
     * @return the ActivityLogAlertLeafCondition object itself.
     */
    public ActivityLogAlertLeafCondition withEquals(String equals) {
        this.equals = equals;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (field() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property field in model ActivityLogAlertLeafCondition"));
        }
        if (equals() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property equals in model ActivityLogAlertLeafCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActivityLogAlertLeafCondition.class);
}
