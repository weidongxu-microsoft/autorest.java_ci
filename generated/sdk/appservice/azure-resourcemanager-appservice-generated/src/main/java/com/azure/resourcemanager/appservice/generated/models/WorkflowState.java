// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The workflow state. */
public final class WorkflowState extends ExpandableStringEnum<WorkflowState> {
    /** Static value NotSpecified for WorkflowState. */
    public static final WorkflowState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Completed for WorkflowState. */
    public static final WorkflowState COMPLETED = fromString("Completed");

    /** Static value Enabled for WorkflowState. */
    public static final WorkflowState ENABLED = fromString("Enabled");

    /** Static value Disabled for WorkflowState. */
    public static final WorkflowState DISABLED = fromString("Disabled");

    /** Static value Deleted for WorkflowState. */
    public static final WorkflowState DELETED = fromString("Deleted");

    /** Static value Suspended for WorkflowState. */
    public static final WorkflowState SUSPENDED = fromString("Suspended");

    /**
     * Creates a new instance of WorkflowState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WorkflowState() {
    }

    /**
     * Creates or finds a WorkflowState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkflowState.
     */
    @JsonCreator
    public static WorkflowState fromString(String name) {
        return fromString(name, WorkflowState.class);
    }

    /**
     * Gets known WorkflowState values.
     *
     * @return known WorkflowState values.
     */
    public static Collection<WorkflowState> values() {
        return values(WorkflowState.class);
    }
}
