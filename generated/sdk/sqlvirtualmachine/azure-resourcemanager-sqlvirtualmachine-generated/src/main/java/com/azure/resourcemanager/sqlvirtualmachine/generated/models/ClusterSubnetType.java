// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Cluster subnet type. */
public final class ClusterSubnetType extends ExpandableStringEnum<ClusterSubnetType> {
    /** Static value SingleSubnet for ClusterSubnetType. */
    public static final ClusterSubnetType SINGLE_SUBNET = fromString("SingleSubnet");

    /** Static value MultiSubnet for ClusterSubnetType. */
    public static final ClusterSubnetType MULTI_SUBNET = fromString("MultiSubnet");

    /**
     * Creates a new instance of ClusterSubnetType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterSubnetType() {
    }

    /**
     * Creates or finds a ClusterSubnetType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterSubnetType.
     */
    @JsonCreator
    public static ClusterSubnetType fromString(String name) {
        return fromString(name, ClusterSubnetType.class);
    }

    /**
     * Gets known ClusterSubnetType values.
     *
     * @return known ClusterSubnetType values.
     */
    public static Collection<ClusterSubnetType> values() {
        return values(ClusterSubnetType.class);
    }
}
