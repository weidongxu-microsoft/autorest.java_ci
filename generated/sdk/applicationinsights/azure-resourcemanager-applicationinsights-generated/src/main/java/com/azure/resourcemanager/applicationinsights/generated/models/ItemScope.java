// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
 */
public final class ItemScope extends ExpandableStringEnum<ItemScope> {
    /**
     * Static value shared for ItemScope.
     */
    public static final ItemScope SHARED = fromString("shared");

    /**
     * Static value user for ItemScope.
     */
    public static final ItemScope USER = fromString("user");

    /**
     * Creates a new instance of ItemScope value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ItemScope() {
    }

    /**
     * Creates or finds a ItemScope from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ItemScope.
     */
    @JsonCreator
    public static ItemScope fromString(String name) {
        return fromString(name, ItemScope.class);
    }

    /**
     * Gets known ItemScope values.
     * 
     * @return known ItemScope values.
     */
    public static Collection<ItemScope> values() {
        return values(ItemScope.class);
    }
}
