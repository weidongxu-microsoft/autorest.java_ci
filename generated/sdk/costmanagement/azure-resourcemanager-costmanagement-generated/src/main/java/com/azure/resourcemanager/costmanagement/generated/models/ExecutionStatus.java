// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of the export execution.
 */
public final class ExecutionStatus extends ExpandableStringEnum<ExecutionStatus> {
    /**
     * Static value Queued for ExecutionStatus.
     */
    public static final ExecutionStatus QUEUED = fromString("Queued");

    /**
     * Static value InProgress for ExecutionStatus.
     */
    public static final ExecutionStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Completed for ExecutionStatus.
     */
    public static final ExecutionStatus COMPLETED = fromString("Completed");

    /**
     * Static value Failed for ExecutionStatus.
     */
    public static final ExecutionStatus FAILED = fromString("Failed");

    /**
     * Static value Timeout for ExecutionStatus.
     */
    public static final ExecutionStatus TIMEOUT = fromString("Timeout");

    /**
     * Static value NewDataNotAvailable for ExecutionStatus.
     */
    public static final ExecutionStatus NEW_DATA_NOT_AVAILABLE = fromString("NewDataNotAvailable");

    /**
     * Static value DataNotAvailable for ExecutionStatus.
     */
    public static final ExecutionStatus DATA_NOT_AVAILABLE = fromString("DataNotAvailable");

    /**
     * Creates a new instance of ExecutionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExecutionStatus() {
    }

    /**
     * Creates or finds a ExecutionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExecutionStatus.
     */
    @JsonCreator
    public static ExecutionStatus fromString(String name) {
        return fromString(name, ExecutionStatus.class);
    }

    /**
     * Gets known ExecutionStatus values.
     * 
     * @return known ExecutionStatus values.
     */
    public static Collection<ExecutionStatus> values() {
        return values(ExecutionStatus.class);
    }
}
