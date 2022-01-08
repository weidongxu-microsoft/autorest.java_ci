// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Sku. */
public final class Sku extends ExpandableStringEnum<Sku> {
    /** Static value Basic for Sku. */
    public static final Sku BASIC = fromString("Basic");

    /** Static value Premium for Sku. */
    public static final Sku PREMIUM = fromString("Premium");

    /**
     * Creates or finds a Sku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Sku.
     */
    @JsonCreator
    public static Sku fromString(String name) {
        return fromString(name, Sku.class);
    }

    /** @return known Sku values. */
    public static Collection<Sku> values() {
        return values(Sku.class);
    }
}
