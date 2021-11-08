// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessLevel. */
public final class AccessLevel extends ExpandableStringEnum<AccessLevel> {
    /** Static value None for AccessLevel. */
    public static final AccessLevel NONE = fromString("None");

    /** Static value ReadOnly for AccessLevel. */
    public static final AccessLevel READ_ONLY = fromString("ReadOnly");

    /** Static value ReadWrite for AccessLevel. */
    public static final AccessLevel READ_WRITE = fromString("ReadWrite");

    /** Static value FullAccess for AccessLevel. */
    public static final AccessLevel FULL_ACCESS = fromString("FullAccess");

    /**
     * Creates or finds a AccessLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessLevel.
     */
    @JsonCreator
    public static AccessLevel fromString(String name) {
        return fromString(name, AccessLevel.class);
    }

    /** @return known AccessLevel values. */
    public static Collection<AccessLevel> values() {
        return values(AccessLevel.class);
    }
}
