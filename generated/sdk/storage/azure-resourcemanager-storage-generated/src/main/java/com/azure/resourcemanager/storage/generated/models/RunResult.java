// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Represents the overall result of the execution for the run instance.
 */
public final class RunResult extends ExpandableStringEnum<RunResult> {
    /**
     * Static value Succeeded for RunResult.
     */
    public static final RunResult SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for RunResult.
     */
    public static final RunResult FAILED = fromString("Failed");

    /**
     * Creates a new instance of RunResult value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RunResult() {
    }

    /**
     * Creates or finds a RunResult from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RunResult.
     */
    public static RunResult fromString(String name) {
        return fromString(name, RunResult.class);
    }

    /**
     * Gets known RunResult values.
     * 
     * @return known RunResult values.
     */
    public static Collection<RunResult> values() {
        return values(RunResult.class);
    }
}
