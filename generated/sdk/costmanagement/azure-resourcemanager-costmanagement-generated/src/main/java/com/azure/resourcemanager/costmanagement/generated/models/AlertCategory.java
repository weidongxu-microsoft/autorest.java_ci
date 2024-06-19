// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Alert category.
 */
public final class AlertCategory extends ExpandableStringEnum<AlertCategory> {
    /**
     * Static value Cost for AlertCategory.
     */
    public static final AlertCategory COST = fromString("Cost");

    /**
     * Static value Usage for AlertCategory.
     */
    public static final AlertCategory USAGE = fromString("Usage");

    /**
     * Static value Billing for AlertCategory.
     */
    public static final AlertCategory BILLING = fromString("Billing");

    /**
     * Static value System for AlertCategory.
     */
    public static final AlertCategory SYSTEM = fromString("System");

    /**
     * Creates a new instance of AlertCategory value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlertCategory() {
    }

    /**
     * Creates or finds a AlertCategory from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlertCategory.
     */
    public static AlertCategory fromString(String name) {
        return fromString(name, AlertCategory.class);
    }

    /**
     * Gets known AlertCategory values.
     * 
     * @return known AlertCategory values.
     */
    public static Collection<AlertCategory> values() {
        return values(AlertCategory.class);
    }
}
