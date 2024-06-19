// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Name of this SKU.
 */
public final class ClusterSkuName extends ExpandableStringEnum<ClusterSkuName> {
    /**
     * Static value Dedicated for ClusterSkuName.
     */
    public static final ClusterSkuName DEDICATED = fromString("Dedicated");

    /**
     * Creates a new instance of ClusterSkuName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterSkuName() {
    }

    /**
     * Creates or finds a ClusterSkuName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterSkuName.
     */
    public static ClusterSkuName fromString(String name) {
        return fromString(name, ClusterSkuName.class);
    }

    /**
     * Gets known ClusterSkuName values.
     * 
     * @return known ClusterSkuName values.
     */
    public static Collection<ClusterSkuName> values() {
        return values(ClusterSkuName.class);
    }
}
