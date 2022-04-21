// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReportTimeframeType. */
public final class ReportTimeframeType extends ExpandableStringEnum<ReportTimeframeType> {
    /** Static value WeekToDate for ReportTimeframeType. */
    public static final ReportTimeframeType WEEK_TO_DATE = fromString("WeekToDate");

    /** Static value MonthToDate for ReportTimeframeType. */
    public static final ReportTimeframeType MONTH_TO_DATE = fromString("MonthToDate");

    /** Static value YearToDate for ReportTimeframeType. */
    public static final ReportTimeframeType YEAR_TO_DATE = fromString("YearToDate");

    /** Static value Custom for ReportTimeframeType. */
    public static final ReportTimeframeType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ReportTimeframeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportTimeframeType.
     */
    @JsonCreator
    public static ReportTimeframeType fromString(String name) {
        return fromString(name, ReportTimeframeType.class);
    }

    /**
     * Gets known ReportTimeframeType values.
     *
     * @return known ReportTimeframeType values.
     */
    public static Collection<ReportTimeframeType> values() {
        return values(ReportTimeframeType.class);
    }
}
