// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The network group. */
public final class NetworkGroup extends ExpandableStringEnum<NetworkGroup> {
    /** Static value None for NetworkGroup. */
    public static final NetworkGroup NONE = fromString("None");

    /** Static value NonRDMA for NetworkGroup. */
    public static final NetworkGroup NON_RDMA = fromString("NonRDMA");

    /** Static value RDMA for NetworkGroup. */
    public static final NetworkGroup RDMA = fromString("RDMA");

    /**
     * Creates or finds a NetworkGroup from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkGroup.
     */
    @JsonCreator
    public static NetworkGroup fromString(String name) {
        return fromString(name, NetworkGroup.class);
    }

    /**
     * Gets known NetworkGroup values.
     *
     * @return known NetworkGroup values.
     */
    public static Collection<NetworkGroup> values() {
        return values(NetworkGroup.class);
    }
}
