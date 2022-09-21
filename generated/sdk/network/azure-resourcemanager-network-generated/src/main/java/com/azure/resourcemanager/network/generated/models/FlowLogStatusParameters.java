// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define a resource to query flow log and traffic analytics (optional) status. */
@Fluent
public final class FlowLogStatusParameters {
    /*
     * The target resource where getting the flow log and traffic analytics (optional) status.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /** Creates an instance of FlowLogStatusParameters class. */
    public FlowLogStatusParameters() {
    }

    /**
     * Get the targetResourceId property: The target resource where getting the flow log and traffic analytics
     * (optional) status.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource where getting the flow log and traffic analytics
     * (optional) status.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogStatusParameters object itself.
     */
    public FlowLogStatusParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model FlowLogStatusParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlowLogStatusParameters.class);
}
