// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The access key to regenerate. */
public final class KeyType extends ExpandableStringEnum<KeyType> {
    /** Static value PrimaryKey for KeyType. */
    public static final KeyType PRIMARY_KEY = fromString("PrimaryKey");

    /** Static value SecondaryKey for KeyType. */
    public static final KeyType SECONDARY_KEY = fromString("SecondaryKey");

    /**
     * Creates a new instance of KeyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyType() {
    }

    /**
     * Creates or finds a KeyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyType.
     */
    @JsonCreator
    public static KeyType fromString(String name) {
        return fromString(name, KeyType.class);
    }

    /**
     * Gets known KeyType values.
     *
     * @return known KeyType values.
     */
    public static Collection<KeyType> values() {
        return values(KeyType.class);
    }
}
