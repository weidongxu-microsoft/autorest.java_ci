// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a single resource change predicted by What-If operation. */
@Fluent
public final class WhatIfChange {
    /*
     * Resource ID
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * Type of change that will be made to the resource when the deployment is executed.
     */
    @JsonProperty(value = "changeType", required = true)
    private ChangeType changeType;

    /*
     * The snapshot of the resource before the deployment is executed.
     */
    @JsonProperty(value = "before")
    private Object before;

    /*
     * The predicted snapshot of the resource after the deployment is executed.
     */
    @JsonProperty(value = "after")
    private Object after;

    /*
     * The predicted changes to resource properties.
     */
    @JsonProperty(value = "delta")
    private List<WhatIfPropertyChange> delta;

    /** Creates an instance of WhatIfChange class. */
    public WhatIfChange() {
    }

    /**
     * Get the resourceId property: Resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource ID.
     *
     * @param resourceId the resourceId value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the changeType property: Type of change that will be made to the resource when the deployment is executed.
     *
     * @return the changeType value.
     */
    public ChangeType changeType() {
        return this.changeType;
    }

    /**
     * Set the changeType property: Type of change that will be made to the resource when the deployment is executed.
     *
     * @param changeType the changeType value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withChangeType(ChangeType changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * Get the before property: The snapshot of the resource before the deployment is executed.
     *
     * @return the before value.
     */
    public Object before() {
        return this.before;
    }

    /**
     * Set the before property: The snapshot of the resource before the deployment is executed.
     *
     * @param before the before value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withBefore(Object before) {
        this.before = before;
        return this;
    }

    /**
     * Get the after property: The predicted snapshot of the resource after the deployment is executed.
     *
     * @return the after value.
     */
    public Object after() {
        return this.after;
    }

    /**
     * Set the after property: The predicted snapshot of the resource after the deployment is executed.
     *
     * @param after the after value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withAfter(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get the delta property: The predicted changes to resource properties.
     *
     * @return the delta value.
     */
    public List<WhatIfPropertyChange> delta() {
        return this.delta;
    }

    /**
     * Set the delta property: The predicted changes to resource properties.
     *
     * @param delta the delta value to set.
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withDelta(List<WhatIfPropertyChange> delta) {
        this.delta = delta;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model WhatIfChange"));
        }
        if (changeType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property changeType in model WhatIfChange"));
        }
        if (delta() != null) {
            delta().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WhatIfChange.class);
}
