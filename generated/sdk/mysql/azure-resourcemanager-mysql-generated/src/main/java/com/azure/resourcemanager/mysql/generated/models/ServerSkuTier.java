// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The tier of the particular SKU, e.g. GeneralPurpose.
 */
public final class ServerSkuTier extends ExpandableStringEnum<ServerSkuTier> {
    /**
     * Static value Burstable for ServerSkuTier.
     */
    public static final ServerSkuTier BURSTABLE = fromString("Burstable");

    /**
     * Static value GeneralPurpose for ServerSkuTier.
     */
    public static final ServerSkuTier GENERAL_PURPOSE = fromString("GeneralPurpose");

    /**
     * Static value MemoryOptimized for ServerSkuTier.
     */
    public static final ServerSkuTier MEMORY_OPTIMIZED = fromString("MemoryOptimized");

    /**
     * Creates a new instance of ServerSkuTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerSkuTier() {
    }

    /**
     * Creates or finds a ServerSkuTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerSkuTier.
     */
    @JsonCreator
    public static ServerSkuTier fromString(String name) {
        return fromString(name, ServerSkuTier.class);
    }

    /**
     * Gets known ServerSkuTier values.
     * 
     * @return known ServerSkuTier values.
     */
    public static Collection<ServerSkuTier> values() {
        return values(ServerSkuTier.class);
    }
}