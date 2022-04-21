// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClusterNetworkAccessFlag. */
public final class ClusterNetworkAccessFlag extends ExpandableStringEnum<ClusterNetworkAccessFlag> {
    /** Static value Enabled for ClusterNetworkAccessFlag. */
    public static final ClusterNetworkAccessFlag ENABLED = fromString("Enabled");

    /** Static value Disabled for ClusterNetworkAccessFlag. */
    public static final ClusterNetworkAccessFlag DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ClusterNetworkAccessFlag from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterNetworkAccessFlag.
     */
    @JsonCreator
    public static ClusterNetworkAccessFlag fromString(String name) {
        return fromString(name, ClusterNetworkAccessFlag.class);
    }

    /**
     * Gets known ClusterNetworkAccessFlag values.
     *
     * @return known ClusterNetworkAccessFlag values.
     */
    public static Collection<ClusterNetworkAccessFlag> values() {
        return values(ClusterNetworkAccessFlag.class);
    }
}
