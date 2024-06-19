// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The Sku tier.
 */
public final class SkuTier extends ExpandableStringEnum<SkuTier> {
    /**
     * Static value Standard for SkuTier.
     */
    public static final SkuTier STANDARD = fromString("Standard");

    /**
     * Creates a new instance of SkuTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuTier() {
    }

    /**
     * Creates or finds a SkuTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuTier.
     */
    public static SkuTier fromString(String name) {
        return fromString(name, SkuTier.class);
    }

    /**
     * Gets known SkuTier values.
     * 
     * @return known SkuTier values.
     */
    public static Collection<SkuTier> values() {
        return values(SkuTier.class);
    }
}
