// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * MUA Settings of vault.
 */
public final class MultiUserAuthorization extends ExpandableStringEnum<MultiUserAuthorization> {
    /**
     * Static value Invalid for MultiUserAuthorization.
     */
    public static final MultiUserAuthorization INVALID = fromString("Invalid");

    /**
     * Static value Enabled for MultiUserAuthorization.
     */
    public static final MultiUserAuthorization ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for MultiUserAuthorization.
     */
    public static final MultiUserAuthorization DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of MultiUserAuthorization value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MultiUserAuthorization() {
    }

    /**
     * Creates or finds a MultiUserAuthorization from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MultiUserAuthorization.
     */
    @JsonCreator
    public static MultiUserAuthorization fromString(String name) {
        return fromString(name, MultiUserAuthorization.class);
    }

    /**
     * Gets known MultiUserAuthorization values.
     * 
     * @return known MultiUserAuthorization values.
     */
    public static Collection<MultiUserAuthorization> values() {
        return values(MultiUserAuthorization.class);
    }
}
