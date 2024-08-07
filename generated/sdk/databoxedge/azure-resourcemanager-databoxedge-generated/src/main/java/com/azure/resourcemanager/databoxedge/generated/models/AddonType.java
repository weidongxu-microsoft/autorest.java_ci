// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Addon type.
 */
public final class AddonType extends ExpandableStringEnum<AddonType> {
    /**
     * Static value IotEdge for AddonType.
     */
    public static final AddonType IOT_EDGE = fromString("IotEdge");

    /**
     * Static value ArcForKubernetes for AddonType.
     */
    public static final AddonType ARC_FOR_KUBERNETES = fromString("ArcForKubernetes");

    /**
     * Creates a new instance of AddonType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AddonType() {
    }

    /**
     * Creates or finds a AddonType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AddonType.
     */
    public static AddonType fromString(String name) {
        return fromString(name, AddonType.class);
    }

    /**
     * Gets known AddonType values.
     * 
     * @return known AddonType values.
     */
    public static Collection<AddonType> values() {
        return values(AddonType.class);
    }
}
