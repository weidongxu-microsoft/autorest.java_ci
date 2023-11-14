// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Name of a public IP prefix SKU.
 */
public final class PublicIpPrefixSkuName extends ExpandableStringEnum<PublicIpPrefixSkuName> {
    /**
     * Static value Standard for PublicIpPrefixSkuName.
     */
    public static final PublicIpPrefixSkuName STANDARD = fromString("Standard");

    /**
     * Creates a new instance of PublicIpPrefixSkuName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicIpPrefixSkuName() {
    }

    /**
     * Creates or finds a PublicIpPrefixSkuName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicIpPrefixSkuName.
     */
    @JsonCreator
    public static PublicIpPrefixSkuName fromString(String name) {
        return fromString(name, PublicIpPrefixSkuName.class);
    }

    /**
     * Gets known PublicIpPrefixSkuName values.
     * 
     * @return known PublicIpPrefixSkuName values.
     */
    public static Collection<PublicIpPrefixSkuName> values() {
        return values(PublicIpPrefixSkuName.class);
    }
}
