// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryType. */
public final class DirectoryType extends ExpandableStringEnum<DirectoryType> {
    /** Static value ActiveDirectory for DirectoryType. */
    public static final DirectoryType ACTIVE_DIRECTORY = fromString("ActiveDirectory");

    /**
     * Creates or finds a DirectoryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryType.
     */
    @JsonCreator
    public static DirectoryType fromString(String name) {
        return fromString(name, DirectoryType.class);
    }

    /**
     * Gets known DirectoryType values.
     *
     * @return known DirectoryType values.
     */
    public static Collection<DirectoryType> values() {
        return values(DirectoryType.class);
    }
}
