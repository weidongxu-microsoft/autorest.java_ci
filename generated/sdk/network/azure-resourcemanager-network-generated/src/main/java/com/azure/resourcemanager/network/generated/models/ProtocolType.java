// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProtocolType. */
public final class ProtocolType extends ExpandableStringEnum<ProtocolType> {
    /** Static value DoNotUse for ProtocolType. */
    public static final ProtocolType DO_NOT_USE = fromString("DoNotUse");

    /** Static value Icmp for ProtocolType. */
    public static final ProtocolType ICMP = fromString("Icmp");

    /** Static value Tcp for ProtocolType. */
    public static final ProtocolType TCP = fromString("Tcp");

    /** Static value Udp for ProtocolType. */
    public static final ProtocolType UDP = fromString("Udp");

    /** Static value Gre for ProtocolType. */
    public static final ProtocolType GRE = fromString("Gre");

    /** Static value Esp for ProtocolType. */
    public static final ProtocolType ESP = fromString("Esp");

    /** Static value Ah for ProtocolType. */
    public static final ProtocolType AH = fromString("Ah");

    /** Static value Vxlan for ProtocolType. */
    public static final ProtocolType VXLAN = fromString("Vxlan");

    /** Static value All for ProtocolType. */
    public static final ProtocolType ALL = fromString("All");

    /**
     * Creates or finds a ProtocolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProtocolType.
     */
    @JsonCreator
    public static ProtocolType fromString(String name) {
        return fromString(name, ProtocolType.class);
    }

    /**
     * Gets known ProtocolType values.
     *
     * @return known ProtocolType values.
     */
    public static Collection<ProtocolType> values() {
        return values(ProtocolType.class);
    }
}
