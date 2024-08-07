// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ListContainersInclude.
 */
public final class ListContainersInclude extends ExpandableStringEnum<ListContainersInclude> {
    /**
     * Static value deleted for ListContainersInclude.
     */
    public static final ListContainersInclude DELETED = fromString("deleted");

    /**
     * Creates a new instance of ListContainersInclude value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ListContainersInclude() {
    }

    /**
     * Creates or finds a ListContainersInclude from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ListContainersInclude.
     */
    public static ListContainersInclude fromString(String name) {
        return fromString(name, ListContainersInclude.class);
    }

    /**
     * Gets known ListContainersInclude values.
     * 
     * @return known ListContainersInclude values.
     */
    public static Collection<ListContainersInclude> values() {
        return values(ListContainersInclude.class);
    }
}
