// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuNameEnum. */
public final class SkuNameEnum extends ExpandableStringEnum<SkuNameEnum> {
    /** Static value Free for SkuNameEnum. */
    public static final SkuNameEnum FREE = fromString("Free");

    /** Static value Standard for SkuNameEnum. */
    public static final SkuNameEnum STANDARD = fromString("Standard");

    /** Static value Premium for SkuNameEnum. */
    public static final SkuNameEnum PREMIUM = fromString("Premium");

    /** Static value PerNode for SkuNameEnum. */
    public static final SkuNameEnum PER_NODE = fromString("PerNode");

    /** Static value PerGB2018 for SkuNameEnum. */
    public static final SkuNameEnum PER_GB2018 = fromString("PerGB2018");

    /** Static value Standalone for SkuNameEnum. */
    public static final SkuNameEnum STANDALONE = fromString("Standalone");

    /** Static value CapacityReservation for SkuNameEnum. */
    public static final SkuNameEnum CAPACITY_RESERVATION = fromString("CapacityReservation");

    /**
     * Creates or finds a SkuNameEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuNameEnum.
     */
    @JsonCreator
    public static SkuNameEnum fromString(String name) {
        return fromString(name, SkuNameEnum.class);
    }

    /**
     * Gets known SkuNameEnum values.
     *
     * @return known SkuNameEnum values.
     */
    public static Collection<SkuNameEnum> values() {
        return values(SkuNameEnum.class);
    }
}
