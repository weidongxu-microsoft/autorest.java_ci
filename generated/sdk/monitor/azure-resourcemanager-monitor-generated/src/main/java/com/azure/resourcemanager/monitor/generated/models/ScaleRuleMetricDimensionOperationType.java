// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being equal to any of the values.
 * 'NotEquals' being not equal to all of the values.
 */
public final class ScaleRuleMetricDimensionOperationType
    extends ExpandableStringEnum<ScaleRuleMetricDimensionOperationType> {
    /** Static value Equals for ScaleRuleMetricDimensionOperationType. */
    public static final ScaleRuleMetricDimensionOperationType EQUALS = fromString("Equals");

    /** Static value NotEquals for ScaleRuleMetricDimensionOperationType. */
    public static final ScaleRuleMetricDimensionOperationType NOT_EQUALS = fromString("NotEquals");

    /**
     * Creates a new instance of ScaleRuleMetricDimensionOperationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScaleRuleMetricDimensionOperationType() {
    }

    /**
     * Creates or finds a ScaleRuleMetricDimensionOperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScaleRuleMetricDimensionOperationType.
     */
    @JsonCreator
    public static ScaleRuleMetricDimensionOperationType fromString(String name) {
        return fromString(name, ScaleRuleMetricDimensionOperationType.class);
    }

    /**
     * Gets known ScaleRuleMetricDimensionOperationType values.
     *
     * @return known ScaleRuleMetricDimensionOperationType values.
     */
    public static Collection<ScaleRuleMetricDimensionOperationType> values() {
        return values(ScaleRuleMetricDimensionOperationType.class);
    }
}
