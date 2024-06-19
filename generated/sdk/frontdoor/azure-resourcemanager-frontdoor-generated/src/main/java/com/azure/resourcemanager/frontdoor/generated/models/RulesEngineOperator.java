// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Describes operator to apply to the match condition.
 */
public final class RulesEngineOperator extends ExpandableStringEnum<RulesEngineOperator> {
    /**
     * Static value Any for RulesEngineOperator.
     */
    public static final RulesEngineOperator ANY = fromString("Any");

    /**
     * Static value IPMatch for RulesEngineOperator.
     */
    public static final RulesEngineOperator IPMATCH = fromString("IPMatch");

    /**
     * Static value GeoMatch for RulesEngineOperator.
     */
    public static final RulesEngineOperator GEO_MATCH = fromString("GeoMatch");

    /**
     * Static value Equal for RulesEngineOperator.
     */
    public static final RulesEngineOperator EQUAL = fromString("Equal");

    /**
     * Static value Contains for RulesEngineOperator.
     */
    public static final RulesEngineOperator CONTAINS = fromString("Contains");

    /**
     * Static value LessThan for RulesEngineOperator.
     */
    public static final RulesEngineOperator LESS_THAN = fromString("LessThan");

    /**
     * Static value GreaterThan for RulesEngineOperator.
     */
    public static final RulesEngineOperator GREATER_THAN = fromString("GreaterThan");

    /**
     * Static value LessThanOrEqual for RulesEngineOperator.
     */
    public static final RulesEngineOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /**
     * Static value GreaterThanOrEqual for RulesEngineOperator.
     */
    public static final RulesEngineOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /**
     * Static value BeginsWith for RulesEngineOperator.
     */
    public static final RulesEngineOperator BEGINS_WITH = fromString("BeginsWith");

    /**
     * Static value EndsWith for RulesEngineOperator.
     */
    public static final RulesEngineOperator ENDS_WITH = fromString("EndsWith");

    /**
     * Creates a new instance of RulesEngineOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RulesEngineOperator() {
    }

    /**
     * Creates or finds a RulesEngineOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RulesEngineOperator.
     */
    public static RulesEngineOperator fromString(String name) {
        return fromString(name, RulesEngineOperator.class);
    }

    /**
     * Gets known RulesEngineOperator values.
     * 
     * @return known RulesEngineOperator values.
     */
    public static Collection<RulesEngineOperator> values() {
        return values(RulesEngineOperator.class);
    }
}
