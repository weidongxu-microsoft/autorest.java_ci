// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageAccountType. */
public final class StorageAccountType extends ExpandableStringEnum<StorageAccountType> {
    /** Static value Primary for StorageAccountType. */
    public static final StorageAccountType PRIMARY = fromString("Primary");

    /** Static value Secondary for StorageAccountType. */
    public static final StorageAccountType SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a StorageAccountType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageAccountType.
     */
    @JsonCreator
    public static StorageAccountType fromString(String name) {
        return fromString(name, StorageAccountType.class);
    }

    /**
     * Gets known StorageAccountType values.
     *
     * @return known StorageAccountType values.
     */
    public static Collection<StorageAccountType> values() {
        return values(StorageAccountType.class);
    }
}
