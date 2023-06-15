// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the long running operation. */
public final class OperationStatusType extends ExpandableStringEnum<OperationStatusType> {
    /** Static value Running for OperationStatusType. */
    public static final OperationStatusType RUNNING = fromString("Running");

    /** Static value Completed for OperationStatusType. */
    public static final OperationStatusType COMPLETED = fromString("Completed");

    /** Static value Failed for OperationStatusType. */
    public static final OperationStatusType FAILED = fromString("Failed");

    /**
     * Creates a new instance of OperationStatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationStatusType() {
    }

    /**
     * Creates or finds a OperationStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationStatusType.
     */
    @JsonCreator
    public static OperationStatusType fromString(String name) {
        return fromString(name, OperationStatusType.class);
    }

    /**
     * Gets known OperationStatusType values.
     *
     * @return known OperationStatusType values.
     */
    public static Collection<OperationStatusType> values() {
        return values(OperationStatusType.class);
    }
}
