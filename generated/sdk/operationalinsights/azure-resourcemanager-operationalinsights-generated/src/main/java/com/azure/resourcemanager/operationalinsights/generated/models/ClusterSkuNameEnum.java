// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The SKU (tier) of a cluster.
 */
public final class ClusterSkuNameEnum extends ExpandableStringEnum<ClusterSkuNameEnum> {
    /**
     * Static value CapacityReservation for ClusterSkuNameEnum.
     */
    public static final ClusterSkuNameEnum CAPACITY_RESERVATION = fromString("CapacityReservation");

    /**
     * Creates a new instance of ClusterSkuNameEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterSkuNameEnum() {
    }

    /**
     * Creates or finds a ClusterSkuNameEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterSkuNameEnum.
     */
    @JsonCreator
    public static ClusterSkuNameEnum fromString(String name) {
        return fromString(name, ClusterSkuNameEnum.class);
    }

    /**
     * Gets known ClusterSkuNameEnum values.
     * 
     * @return known ClusterSkuNameEnum values.
     */
    public static Collection<ClusterSkuNameEnum> values() {
        return values(ClusterSkuNameEnum.class);
    }
}
