// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of custom IP prefix. Should be Singular, Parent, or Child. */
public final class CustomIpPrefixType extends ExpandableStringEnum<CustomIpPrefixType> {
    /** Static value Singular for CustomIpPrefixType. */
    public static final CustomIpPrefixType SINGULAR = fromString("Singular");

    /** Static value Parent for CustomIpPrefixType. */
    public static final CustomIpPrefixType PARENT = fromString("Parent");

    /** Static value Child for CustomIpPrefixType. */
    public static final CustomIpPrefixType CHILD = fromString("Child");

    /**
     * Creates a new instance of CustomIpPrefixType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomIpPrefixType() {
    }

    /**
     * Creates or finds a CustomIpPrefixType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomIpPrefixType.
     */
    @JsonCreator
    public static CustomIpPrefixType fromString(String name) {
        return fromString(name, CustomIpPrefixType.class);
    }

    /**
     * Gets known CustomIpPrefixType values.
     *
     * @return known CustomIpPrefixType values.
     */
    public static Collection<CustomIpPrefixType> values() {
        return values(CustomIpPrefixType.class);
    }
}
