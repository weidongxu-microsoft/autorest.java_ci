// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The billing frequency.
 */
public final class BillingFrequency extends ExpandableStringEnum<BillingFrequency> {
    /**
     * Static value Month for BillingFrequency.
     */
    public static final BillingFrequency MONTH = fromString("Month");

    /**
     * Static value Quarter for BillingFrequency.
     */
    public static final BillingFrequency QUARTER = fromString("Quarter");

    /**
     * Static value Year for BillingFrequency.
     */
    public static final BillingFrequency YEAR = fromString("Year");

    /**
     * Creates a new instance of BillingFrequency value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BillingFrequency() {
    }

    /**
     * Creates or finds a BillingFrequency from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BillingFrequency.
     */
    @JsonCreator
    public static BillingFrequency fromString(String name) {
        return fromString(name, BillingFrequency.class);
    }

    /**
     * Gets known BillingFrequency values.
     * 
     * @return known BillingFrequency values.
     */
    public static Collection<BillingFrequency> values() {
        return values(BillingFrequency.class);
    }
}
