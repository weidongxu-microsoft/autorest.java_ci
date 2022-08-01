// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * When matchVariable is a collection, operate on the selector to specify which elements in the collection this
 * exclusion applies to.
 */
public final class OwaspCrsExclusionEntrySelectorMatchOperator
    extends ExpandableStringEnum<OwaspCrsExclusionEntrySelectorMatchOperator> {
    /** Static value Equals for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator EQUALS = fromString("Equals");

    /** Static value Contains for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator CONTAINS = fromString("Contains");

    /** Static value StartsWith for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator STARTS_WITH = fromString("StartsWith");

    /** Static value EndsWith for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator ENDS_WITH = fromString("EndsWith");

    /** Static value EqualsAny for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator EQUALS_ANY = fromString("EqualsAny");

    /**
     * Creates or finds a OwaspCrsExclusionEntrySelectorMatchOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OwaspCrsExclusionEntrySelectorMatchOperator.
     */
    @JsonCreator
    public static OwaspCrsExclusionEntrySelectorMatchOperator fromString(String name) {
        return fromString(name, OwaspCrsExclusionEntrySelectorMatchOperator.class);
    }

    /**
     * Gets known OwaspCrsExclusionEntrySelectorMatchOperator values.
     *
     * @return known OwaspCrsExclusionEntrySelectorMatchOperator values.
     */
    public static Collection<OwaspCrsExclusionEntrySelectorMatchOperator> values() {
        return values(OwaspCrsExclusionEntrySelectorMatchOperator.class);
    }
}
