// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Policy for controlling export on the disk. */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /** Static value Enabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for PublicNetworkAccess. */
    public static final PublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccess.
     */
    @JsonCreator
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * Gets known PublicNetworkAccess values.
     *
     * @return known PublicNetworkAccess values.
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}
