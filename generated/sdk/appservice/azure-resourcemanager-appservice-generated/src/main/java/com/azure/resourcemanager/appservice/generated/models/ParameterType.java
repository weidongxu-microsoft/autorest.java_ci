// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The parameter type. */
public final class ParameterType extends ExpandableStringEnum<ParameterType> {
    /** Static value NotSpecified for ParameterType. */
    public static final ParameterType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value String for ParameterType. */
    public static final ParameterType STRING = fromString("String");

    /** Static value SecureString for ParameterType. */
    public static final ParameterType SECURE_STRING = fromString("SecureString");

    /** Static value Int for ParameterType. */
    public static final ParameterType INT = fromString("Int");

    /** Static value Float for ParameterType. */
    public static final ParameterType FLOAT = fromString("Float");

    /** Static value Bool for ParameterType. */
    public static final ParameterType BOOL = fromString("Bool");

    /** Static value Array for ParameterType. */
    public static final ParameterType ARRAY = fromString("Array");

    /** Static value Object for ParameterType. */
    public static final ParameterType OBJECT = fromString("Object");

    /** Static value SecureObject for ParameterType. */
    public static final ParameterType SECURE_OBJECT = fromString("SecureObject");

    /**
     * Creates a new instance of ParameterType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ParameterType() {
    }

    /**
     * Creates or finds a ParameterType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ParameterType.
     */
    @JsonCreator
    public static ParameterType fromString(String name) {
        return fromString(name, ParameterType.class);
    }

    /**
     * Gets known ParameterType values.
     *
     * @return known ParameterType values.
     */
    public static Collection<ParameterType> values() {
        return values(ParameterType.class);
    }
}
