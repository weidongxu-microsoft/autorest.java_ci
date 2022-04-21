// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ItemScopePath. */
public final class ItemScopePath extends ExpandableStringEnum<ItemScopePath> {
    /** Static value analyticsItems for ItemScopePath. */
    public static final ItemScopePath ANALYTICS_ITEMS = fromString("analyticsItems");

    /** Static value myanalyticsItems for ItemScopePath. */
    public static final ItemScopePath MYANALYTICS_ITEMS = fromString("myanalyticsItems");

    /**
     * Creates or finds a ItemScopePath from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ItemScopePath.
     */
    @JsonCreator
    public static ItemScopePath fromString(String name) {
        return fromString(name, ItemScopePath.class);
    }

    /**
     * Gets known ItemScopePath values.
     *
     * @return known ItemScopePath values.
     */
    public static Collection<ItemScopePath> values() {
        return values(ItemScopePath.class);
    }
}
