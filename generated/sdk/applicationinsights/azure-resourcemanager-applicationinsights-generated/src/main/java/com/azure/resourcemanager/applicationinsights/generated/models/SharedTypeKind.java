// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SharedTypeKind. */
public final class SharedTypeKind extends ExpandableStringEnum<SharedTypeKind> {
    /** Static value user for SharedTypeKind. */
    public static final SharedTypeKind USER = fromString("user");

    /** Static value shared for SharedTypeKind. */
    public static final SharedTypeKind SHARED = fromString("shared");

    /**
     * Creates or finds a SharedTypeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SharedTypeKind.
     */
    @JsonCreator
    public static SharedTypeKind fromString(String name) {
        return fromString(name, SharedTypeKind.class);
    }

    /**
     * Gets known SharedTypeKind values.
     *
     * @return known SharedTypeKind values.
     */
    public static Collection<SharedTypeKind> values() {
        return values(SharedTypeKind.class);
    }
}
