// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The signed services accessible with the account SAS. Possible values include: Blob (b), Queue (q), Table (t), File
 * (f).
 */
public final class Services extends ExpandableStringEnum<Services> {
    /**
     * Static value b for Services.
     */
    public static final Services B = fromString("b");

    /**
     * Static value q for Services.
     */
    public static final Services Q = fromString("q");

    /**
     * Static value t for Services.
     */
    public static final Services T = fromString("t");

    /**
     * Static value f for Services.
     */
    public static final Services F = fromString("f");

    /**
     * Creates a new instance of Services value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Services() {
    }

    /**
     * Creates or finds a Services from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Services.
     */
    @JsonCreator
    public static Services fromString(String name) {
        return fromString(name, Services.class);
    }

    /**
     * Gets known Services values.
     * 
     * @return known Services values.
     */
    public static Collection<Services> values() {
        return values(Services.class);
    }
}
