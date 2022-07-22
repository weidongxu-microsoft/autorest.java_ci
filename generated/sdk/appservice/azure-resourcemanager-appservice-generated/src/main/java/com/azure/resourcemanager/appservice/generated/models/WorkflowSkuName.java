// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkflowSkuName. */
public final class WorkflowSkuName extends ExpandableStringEnum<WorkflowSkuName> {
    /** Static value NotSpecified for WorkflowSkuName. */
    public static final WorkflowSkuName NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Free for WorkflowSkuName. */
    public static final WorkflowSkuName FREE = fromString("Free");

    /** Static value Shared for WorkflowSkuName. */
    public static final WorkflowSkuName SHARED = fromString("Shared");

    /** Static value Basic for WorkflowSkuName. */
    public static final WorkflowSkuName BASIC = fromString("Basic");

    /** Static value Standard for WorkflowSkuName. */
    public static final WorkflowSkuName STANDARD = fromString("Standard");

    /** Static value Premium for WorkflowSkuName. */
    public static final WorkflowSkuName PREMIUM = fromString("Premium");

    /**
     * Creates or finds a WorkflowSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkflowSkuName.
     */
    @JsonCreator
    public static WorkflowSkuName fromString(String name) {
        return fromString(name, WorkflowSkuName.class);
    }

    /**
     * Gets known WorkflowSkuName values.
     *
     * @return known WorkflowSkuName values.
     */
    public static Collection<WorkflowSkuName> values() {
        return values(WorkflowSkuName.class);
    }
}