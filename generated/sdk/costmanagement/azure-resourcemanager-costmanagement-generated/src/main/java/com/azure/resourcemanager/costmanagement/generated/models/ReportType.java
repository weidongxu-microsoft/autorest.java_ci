// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the report. Usage represents actual usage, forecast represents forecasted data and UsageAndForecast
 * represents both usage and forecasted data. Actual usage and forecasted data can be differentiated based on dates.
 */
public final class ReportType extends ExpandableStringEnum<ReportType> {
    /**
     * Static value Usage for ReportType.
     */
    public static final ReportType USAGE = fromString("Usage");

    /**
     * Creates a new instance of ReportType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReportType() {
    }

    /**
     * Creates or finds a ReportType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ReportType.
     */
    @JsonCreator
    public static ReportType fromString(String name) {
        return fromString(name, ReportType.class);
    }

    /**
     * Gets known ReportType values.
     * 
     * @return known ReportType values.
     */
    public static Collection<ReportType> values() {
        return values(ReportType.class);
    }
}
