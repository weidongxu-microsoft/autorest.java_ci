// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * DataResidencyType enum.
 */
public final class DataResidencyType extends ExpandableStringEnum<DataResidencyType> {
    /**
     * Static value GeoZoneReplication for DataResidencyType.
     */
    public static final DataResidencyType GEO_ZONE_REPLICATION = fromString("GeoZoneReplication");

    /**
     * Static value ZoneReplication for DataResidencyType.
     */
    public static final DataResidencyType ZONE_REPLICATION = fromString("ZoneReplication");

    /**
     * Creates a new instance of DataResidencyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataResidencyType() {
    }

    /**
     * Creates or finds a DataResidencyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataResidencyType.
     */
    @JsonCreator
    public static DataResidencyType fromString(String name) {
        return fromString(name, DataResidencyType.class);
    }

    /**
     * Gets known DataResidencyType values.
     * 
     * @return known DataResidencyType values.
     */
    public static Collection<DataResidencyType> values() {
        return values(DataResidencyType.class);
    }
}
