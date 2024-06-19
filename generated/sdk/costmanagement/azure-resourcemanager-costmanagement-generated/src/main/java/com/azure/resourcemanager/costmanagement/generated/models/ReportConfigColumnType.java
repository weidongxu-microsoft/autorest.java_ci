// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the column in the report.
 */
public final class ReportConfigColumnType extends ExpandableStringEnum<ReportConfigColumnType> {
    /**
     * Static value Tag for ReportConfigColumnType.
     */
    public static final ReportConfigColumnType TAG = fromString("Tag");

    /**
     * Static value Dimension for ReportConfigColumnType.
     */
    public static final ReportConfigColumnType DIMENSION = fromString("Dimension");

    /**
     * Creates a new instance of ReportConfigColumnType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReportConfigColumnType() {
    }

    /**
     * Creates or finds a ReportConfigColumnType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReportConfigColumnType.
     */
    public static ReportConfigColumnType fromString(String name) {
        return fromString(name, ReportConfigColumnType.class);
    }

    /**
     * Gets known ReportConfigColumnType values.
     * 
     * @return known ReportConfigColumnType values.
     */
    public static Collection<ReportConfigColumnType> values() {
        return values(ReportConfigColumnType.class);
    }
}
