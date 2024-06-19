// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The association type of the child resource to the parent resource.
 */
public final class AssociationType extends ExpandableStringEnum<AssociationType> {
    /**
     * Static value Associated for AssociationType.
     */
    public static final AssociationType ASSOCIATED = fromString("Associated");

    /**
     * Static value Contains for AssociationType.
     */
    public static final AssociationType CONTAINS = fromString("Contains");

    /**
     * Creates a new instance of AssociationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AssociationType() {
    }

    /**
     * Creates or finds a AssociationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AssociationType.
     */
    public static AssociationType fromString(String name) {
        return fromString(name, AssociationType.class);
    }

    /**
     * Gets known AssociationType values.
     * 
     * @return known AssociationType values.
     */
    public static Collection<AssociationType> values() {
        return values(AssociationType.class);
    }
}
