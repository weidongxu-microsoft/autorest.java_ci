// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Tells the encoder how to choose its encoding settings. Quality will provide for a higher compression ratio but at a
 * higher cost and longer compute time. Speed will produce a relatively larger file but is faster and more economical.
 * The default value is Balanced.
 */
public final class H265Complexity extends ExpandableStringEnum<H265Complexity> {
    /**
     * Static value Speed for H265Complexity.
     */
    public static final H265Complexity SPEED = fromString("Speed");

    /**
     * Static value Balanced for H265Complexity.
     */
    public static final H265Complexity BALANCED = fromString("Balanced");

    /**
     * Static value Quality for H265Complexity.
     */
    public static final H265Complexity QUALITY = fromString("Quality");

    /**
     * Creates a new instance of H265Complexity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public H265Complexity() {
    }

    /**
     * Creates or finds a H265Complexity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding H265Complexity.
     */
    @JsonCreator
    public static H265Complexity fromString(String name) {
        return fromString(name, H265Complexity.class);
    }

    /**
     * Gets known H265Complexity values.
     * 
     * @return known H265Complexity values.
     */
    public static Collection<H265Complexity> values() {
        return values(H265Complexity.class);
    }
}
