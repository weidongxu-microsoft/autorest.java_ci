// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuName. */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Free for SkuName. */
    public static final SkuName FREE = fromString("Free");

    /** Static value Shared for SkuName. */
    public static final SkuName SHARED = fromString("Shared");

    /** Static value Basic for SkuName. */
    public static final SkuName BASIC = fromString("Basic");

    /** Static value Standard for SkuName. */
    public static final SkuName STANDARD = fromString("Standard");

    /** Static value Premium for SkuName. */
    public static final SkuName PREMIUM = fromString("Premium");

    /** Static value Dynamic for SkuName. */
    public static final SkuName DYNAMIC = fromString("Dynamic");

    /** Static value Isolated for SkuName. */
    public static final SkuName ISOLATED = fromString("Isolated");

    /** Static value IsolatedV2 for SkuName. */
    public static final SkuName ISOLATED_V2 = fromString("IsolatedV2");

    /** Static value PremiumV2 for SkuName. */
    public static final SkuName PREMIUM_V2 = fromString("PremiumV2");

    /** Static value PremiumV3 for SkuName. */
    public static final SkuName PREMIUM_V3 = fromString("PremiumV3");

    /** Static value PremiumContainer for SkuName. */
    public static final SkuName PREMIUM_CONTAINER = fromString("PremiumContainer");

    /** Static value ElasticPremium for SkuName. */
    public static final SkuName ELASTIC_PREMIUM = fromString("ElasticPremium");

    /** Static value ElasticIsolated for SkuName. */
    public static final SkuName ELASTIC_ISOLATED = fromString("ElasticIsolated");

    /**
     * Creates a new instance of SkuName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuName() {
    }

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     *
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
