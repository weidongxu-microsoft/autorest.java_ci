// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Data Residency Boundary of the resource. */
public final class DataResidencyBoundary extends ExpandableStringEnum<DataResidencyBoundary> {
    /** Static value WithinGeopair for DataResidencyBoundary. */
    public static final DataResidencyBoundary WITHIN_GEOPAIR = fromString("WithinGeopair");

    /** Static value WithinRegion for DataResidencyBoundary. */
    public static final DataResidencyBoundary WITHIN_REGION = fromString("WithinRegion");

    /**
     * Creates or finds a DataResidencyBoundary from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataResidencyBoundary.
     */
    @JsonCreator
    public static DataResidencyBoundary fromString(String name) {
        return fromString(name, DataResidencyBoundary.class);
    }

    /**
     * Gets known DataResidencyBoundary values.
     *
     * @return known DataResidencyBoundary values.
     */
    public static Collection<DataResidencyBoundary> values() {
        return values(DataResidencyBoundary.class);
    }
}
