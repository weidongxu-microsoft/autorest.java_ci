// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Cluster type. */
public final class ClusterConfiguration extends ExpandableStringEnum<ClusterConfiguration> {
    /** Static value Domainful for ClusterConfiguration. */
    public static final ClusterConfiguration DOMAINFUL = fromString("Domainful");

    /**
     * Creates a new instance of ClusterConfiguration value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterConfiguration() {
    }

    /**
     * Creates or finds a ClusterConfiguration from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterConfiguration.
     */
    @JsonCreator
    public static ClusterConfiguration fromString(String name) {
        return fromString(name, ClusterConfiguration.class);
    }

    /**
     * Gets known ClusterConfiguration values.
     *
     * @return known ClusterConfiguration values.
     */
    public static Collection<ClusterConfiguration> values() {
        return values(ClusterConfiguration.class);
    }
}
