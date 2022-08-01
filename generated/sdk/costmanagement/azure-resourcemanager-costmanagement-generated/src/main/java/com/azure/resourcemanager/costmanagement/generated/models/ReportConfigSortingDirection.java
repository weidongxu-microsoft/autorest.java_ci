// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Direction of sort. */
public final class ReportConfigSortingDirection extends ExpandableStringEnum<ReportConfigSortingDirection> {
    /** Static value Ascending for ReportConfigSortingDirection. */
    public static final ReportConfigSortingDirection ASCENDING = fromString("Ascending");

    /** Static value Descending for ReportConfigSortingDirection. */
    public static final ReportConfigSortingDirection DESCENDING = fromString("Descending");

    /**
     * Creates or finds a ReportConfigSortingDirection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportConfigSortingDirection.
     */
    @JsonCreator
    public static ReportConfigSortingDirection fromString(String name) {
        return fromString(name, ReportConfigSortingDirection.class);
    }

    /**
     * Gets known ReportConfigSortingDirection values.
     *
     * @return known ReportConfigSortingDirection values.
     */
    public static Collection<ReportConfigSortingDirection> values() {
        return values(ReportConfigSortingDirection.class);
    }
}
