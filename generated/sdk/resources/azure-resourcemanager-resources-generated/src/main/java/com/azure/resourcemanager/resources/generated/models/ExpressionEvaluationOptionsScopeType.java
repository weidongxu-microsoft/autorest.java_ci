// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The scope to be used for evaluation of parameters, variables and functions in a nested template. */
public final class ExpressionEvaluationOptionsScopeType
    extends ExpandableStringEnum<ExpressionEvaluationOptionsScopeType> {
    /** Static value NotSpecified for ExpressionEvaluationOptionsScopeType. */
    public static final ExpressionEvaluationOptionsScopeType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Outer for ExpressionEvaluationOptionsScopeType. */
    public static final ExpressionEvaluationOptionsScopeType OUTER = fromString("Outer");

    /** Static value Inner for ExpressionEvaluationOptionsScopeType. */
    public static final ExpressionEvaluationOptionsScopeType INNER = fromString("Inner");

    /**
     * Creates or finds a ExpressionEvaluationOptionsScopeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressionEvaluationOptionsScopeType.
     */
    @JsonCreator
    public static ExpressionEvaluationOptionsScopeType fromString(String name) {
        return fromString(name, ExpressionEvaluationOptionsScopeType.class);
    }

    /**
     * Gets known ExpressionEvaluationOptionsScopeType values.
     *
     * @return known ExpressionEvaluationOptionsScopeType values.
     */
    public static Collection<ExpressionEvaluationOptionsScopeType> values() {
        return values(ExpressionEvaluationOptionsScopeType.class);
    }
}
