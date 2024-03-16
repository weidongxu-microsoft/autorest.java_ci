// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings.".
 */
public final class PatchOperationStatus extends ExpandableStringEnum<PatchOperationStatus> {
    /**
     * Static value Unknown for PatchOperationStatus.
     */
    public static final PatchOperationStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value InProgress for PatchOperationStatus.
     */
    public static final PatchOperationStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Failed for PatchOperationStatus.
     */
    public static final PatchOperationStatus FAILED = fromString("Failed");

    /**
     * Static value Succeeded for PatchOperationStatus.
     */
    public static final PatchOperationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value CompletedWithWarnings for PatchOperationStatus.
     */
    public static final PatchOperationStatus COMPLETED_WITH_WARNINGS = fromString("CompletedWithWarnings");

    /**
     * Creates a new instance of PatchOperationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PatchOperationStatus() {
    }

    /**
     * Creates or finds a PatchOperationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PatchOperationStatus.
     */
    @JsonCreator
    public static PatchOperationStatus fromString(String name) {
        return fromString(name, PatchOperationStatus.class);
    }

    /**
     * Gets known PatchOperationStatus values.
     * 
     * @return known PatchOperationStatus values.
     */
    public static Collection<PatchOperationStatus> values() {
        return values(PatchOperationStatus.class);
    }
}
