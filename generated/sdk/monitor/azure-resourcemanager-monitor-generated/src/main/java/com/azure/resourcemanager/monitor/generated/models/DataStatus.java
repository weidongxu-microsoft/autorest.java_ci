// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of VM Insights data from the resource. When reported as `present` the data array will contain information
 * about the data containers to which data for the specified resource is being routed.
 */
public final class DataStatus extends ExpandableStringEnum<DataStatus> {
    /**
     * Static value present for DataStatus.
     */
    public static final DataStatus PRESENT = fromString("present");

    /**
     * Static value notPresent for DataStatus.
     */
    public static final DataStatus NOT_PRESENT = fromString("notPresent");

    /**
     * Creates a new instance of DataStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataStatus() {
    }

    /**
     * Creates or finds a DataStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataStatus.
     */
    public static DataStatus fromString(String name) {
        return fromString(name, DataStatus.class);
    }

    /**
     * Gets known DataStatus values.
     * 
     * @return known DataStatus values.
     */
    public static Collection<DataStatus> values() {
        return values(DataStatus.class);
    }
}
