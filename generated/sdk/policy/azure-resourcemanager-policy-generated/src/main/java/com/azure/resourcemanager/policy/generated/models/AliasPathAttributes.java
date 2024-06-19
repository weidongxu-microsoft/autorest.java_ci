// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The attributes of the token that the alias path is referring to.
 */
public final class AliasPathAttributes extends ExpandableStringEnum<AliasPathAttributes> {
    /**
     * Static value None for AliasPathAttributes.
     */
    public static final AliasPathAttributes NONE = fromString("None");

    /**
     * Static value Modifiable for AliasPathAttributes.
     */
    public static final AliasPathAttributes MODIFIABLE = fromString("Modifiable");

    /**
     * Creates a new instance of AliasPathAttributes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AliasPathAttributes() {
    }

    /**
     * Creates or finds a AliasPathAttributes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AliasPathAttributes.
     */
    public static AliasPathAttributes fromString(String name) {
        return fromString(name, AliasPathAttributes.class);
    }

    /**
     * Gets known AliasPathAttributes values.
     * 
     * @return known AliasPathAttributes values.
     */
    public static Collection<AliasPathAttributes> values() {
        return values(AliasPathAttributes.class);
    }
}
