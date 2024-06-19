// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the export execution.
 */
public final class ExecutionType extends ExpandableStringEnum<ExecutionType> {
    /**
     * Static value OnDemand for ExecutionType.
     */
    public static final ExecutionType ON_DEMAND = fromString("OnDemand");

    /**
     * Static value Scheduled for ExecutionType.
     */
    public static final ExecutionType SCHEDULED = fromString("Scheduled");

    /**
     * Creates a new instance of ExecutionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExecutionType() {
    }

    /**
     * Creates or finds a ExecutionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExecutionType.
     */
    public static ExecutionType fromString(String name) {
        return fromString(name, ExecutionType.class);
    }

    /**
     * Gets known ExecutionType values.
     * 
     * @return known ExecutionType values.
     */
    public static Collection<ExecutionType> values() {
        return values(ExecutionType.class);
    }
}
