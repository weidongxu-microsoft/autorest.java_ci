// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Activity Log alert condition that is met when all its member conditions are met. */
@Fluent
public final class ActivityLogAlertAllOfCondition {
    /*
     * The list of activity log alert conditions.
     */
    @JsonProperty(value = "allOf", required = true)
    private List<ActivityLogAlertLeafCondition> allOf;

    /**
     * Get the allOf property: The list of activity log alert conditions.
     *
     * @return the allOf value.
     */
    public List<ActivityLogAlertLeafCondition> allOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: The list of activity log alert conditions.
     *
     * @param allOf the allOf value to set.
     * @return the ActivityLogAlertAllOfCondition object itself.
     */
    public ActivityLogAlertAllOfCondition withAllOf(List<ActivityLogAlertLeafCondition> allOf) {
        this.allOf = allOf;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allOf() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property allOf in model ActivityLogAlertAllOfCondition"));
        } else {
            allOf().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActivityLogAlertAllOfCondition.class);
}
