// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The direction for the resource provider connection.
 */
public final class ResourceProviderConnection extends ExpandableStringEnum<ResourceProviderConnection> {
    /**
     * Static value Inbound for ResourceProviderConnection.
     */
    public static final ResourceProviderConnection INBOUND = fromString("Inbound");

    /**
     * Static value Outbound for ResourceProviderConnection.
     */
    public static final ResourceProviderConnection OUTBOUND = fromString("Outbound");

    /**
     * Creates a new instance of ResourceProviderConnection value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceProviderConnection() {
    }

    /**
     * Creates or finds a ResourceProviderConnection from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceProviderConnection.
     */
    public static ResourceProviderConnection fromString(String name) {
        return fromString(name, ResourceProviderConnection.class);
    }

    /**
     * Gets known ResourceProviderConnection values.
     * 
     * @return known ResourceProviderConnection values.
     */
    public static Collection<ResourceProviderConnection> values() {
        return values(ResourceProviderConnection.class);
    }
}
