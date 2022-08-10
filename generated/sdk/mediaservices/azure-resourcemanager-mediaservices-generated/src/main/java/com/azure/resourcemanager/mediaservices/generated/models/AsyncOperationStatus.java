// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Operation status of the async operation. */
public final class AsyncOperationStatus extends ExpandableStringEnum<AsyncOperationStatus> {
    /** Static value Succeeded for AsyncOperationStatus. */
    public static final AsyncOperationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for AsyncOperationStatus. */
    public static final AsyncOperationStatus FAILED = fromString("Failed");

    /** Static value InProgress for AsyncOperationStatus. */
    public static final AsyncOperationStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Creates or finds a AsyncOperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AsyncOperationStatus.
     */
    @JsonCreator
    public static AsyncOperationStatus fromString(String name) {
        return fromString(name, AsyncOperationStatus.class);
    }

    /**
     * Gets known AsyncOperationStatus values.
     *
     * @return known AsyncOperationStatus values.
     */
    public static Collection<AsyncOperationStatus> values() {
        return values(AsyncOperationStatus.class);
    }
}