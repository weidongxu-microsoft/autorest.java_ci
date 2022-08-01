// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether or not private link is enabled. */
public final class PrivateLink extends ExpandableStringEnum<PrivateLink> {
    /** Static value Disabled for PrivateLink. */
    public static final PrivateLink DISABLED = fromString("Disabled");

    /** Static value Enabled for PrivateLink. */
    public static final PrivateLink ENABLED = fromString("Enabled");

    /**
     * Creates or finds a PrivateLink from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateLink.
     */
    @JsonCreator
    public static PrivateLink fromString(String name) {
        return fromString(name, PrivateLink.class);
    }

    /**
     * Gets known PrivateLink values.
     *
     * @return known PrivateLink values.
     */
    public static Collection<PrivateLink> values() {
        return values(PrivateLink.class);
    }
}
