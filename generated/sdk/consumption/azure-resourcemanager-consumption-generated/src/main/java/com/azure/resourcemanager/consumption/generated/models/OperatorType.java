// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperatorType. */
public final class OperatorType extends ExpandableStringEnum<OperatorType> {
    /** Static value EqualTo for OperatorType. */
    public static final OperatorType EQUAL_TO = fromString("EqualTo");

    /** Static value GreaterThan for OperatorType. */
    public static final OperatorType GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqualTo for OperatorType. */
    public static final OperatorType GREATER_THAN_OR_EQUAL_TO = fromString("GreaterThanOrEqualTo");

    /**
     * Creates or finds a OperatorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperatorType.
     */
    @JsonCreator
    public static OperatorType fromString(String name) {
        return fromString(name, OperatorType.class);
    }

    /**
     * Gets known OperatorType values.
     *
     * @return known OperatorType values.
     */
    public static Collection<OperatorType> values() {
        return values(OperatorType.class);
    }
}
