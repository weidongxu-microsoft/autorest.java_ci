// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for BlobInventoryPolicyName.
 */
public final class BlobInventoryPolicyName extends ExpandableStringEnum<BlobInventoryPolicyName> {
    /**
     * Static value default for BlobInventoryPolicyName.
     */
    public static final BlobInventoryPolicyName DEFAULT = fromString("default");

    /**
     * Creates a new instance of BlobInventoryPolicyName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlobInventoryPolicyName() {
    }

    /**
     * Creates or finds a BlobInventoryPolicyName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BlobInventoryPolicyName.
     */
    @JsonCreator
    public static BlobInventoryPolicyName fromString(String name) {
        return fromString(name, BlobInventoryPolicyName.class);
    }

    /**
     * Gets known BlobInventoryPolicyName values.
     * 
     * @return known BlobInventoryPolicyName values.
     */
    public static Collection<BlobInventoryPolicyName> values() {
        return values(BlobInventoryPolicyName.class);
    }
}
