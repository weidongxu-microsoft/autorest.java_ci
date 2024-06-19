// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the token that the alias path is referring to.
 */
public final class AliasPathTokenType extends ExpandableStringEnum<AliasPathTokenType> {
    /**
     * Static value NotSpecified for AliasPathTokenType.
     */
    public static final AliasPathTokenType NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value Any for AliasPathTokenType.
     */
    public static final AliasPathTokenType ANY = fromString("Any");

    /**
     * Static value String for AliasPathTokenType.
     */
    public static final AliasPathTokenType STRING = fromString("String");

    /**
     * Static value Object for AliasPathTokenType.
     */
    public static final AliasPathTokenType OBJECT = fromString("Object");

    /**
     * Static value Array for AliasPathTokenType.
     */
    public static final AliasPathTokenType ARRAY = fromString("Array");

    /**
     * Static value Integer for AliasPathTokenType.
     */
    public static final AliasPathTokenType INTEGER = fromString("Integer");

    /**
     * Static value Number for AliasPathTokenType.
     */
    public static final AliasPathTokenType NUMBER = fromString("Number");

    /**
     * Static value Boolean for AliasPathTokenType.
     */
    public static final AliasPathTokenType BOOLEAN = fromString("Boolean");

    /**
     * Creates a new instance of AliasPathTokenType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AliasPathTokenType() {
    }

    /**
     * Creates or finds a AliasPathTokenType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AliasPathTokenType.
     */
    public static AliasPathTokenType fromString(String name) {
        return fromString(name, AliasPathTokenType.class);
    }

    /**
     * Gets known AliasPathTokenType values.
     * 
     * @return known AliasPathTokenType values.
     */
    public static Collection<AliasPathTokenType> values() {
        return values(AliasPathTokenType.class);
    }
}
