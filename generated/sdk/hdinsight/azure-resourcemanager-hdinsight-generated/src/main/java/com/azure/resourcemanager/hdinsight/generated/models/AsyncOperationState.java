// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The async operation state.
 */
public final class AsyncOperationState extends ExpandableStringEnum<AsyncOperationState> {
    /**
     * Static value InProgress for AsyncOperationState.
     */
    public static final AsyncOperationState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Succeeded for AsyncOperationState.
     */
    public static final AsyncOperationState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for AsyncOperationState.
     */
    public static final AsyncOperationState FAILED = fromString("Failed");

    /**
     * Creates a new instance of AsyncOperationState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AsyncOperationState() {
    }

    /**
     * Creates or finds a AsyncOperationState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AsyncOperationState.
     */
    public static AsyncOperationState fromString(String name) {
        return fromString(name, AsyncOperationState.class);
    }

    /**
     * Gets known AsyncOperationState values.
     * 
     * @return known AsyncOperationState values.
     */
    public static Collection<AsyncOperationState> values() {
        return values(AsyncOperationState.class);
    }
}
