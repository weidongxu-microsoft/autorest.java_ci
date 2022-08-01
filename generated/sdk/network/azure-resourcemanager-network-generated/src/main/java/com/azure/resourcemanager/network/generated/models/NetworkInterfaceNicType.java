// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of Network Interface resource. */
public final class NetworkInterfaceNicType extends ExpandableStringEnum<NetworkInterfaceNicType> {
    /** Static value Standard for NetworkInterfaceNicType. */
    public static final NetworkInterfaceNicType STANDARD = fromString("Standard");

    /** Static value Elastic for NetworkInterfaceNicType. */
    public static final NetworkInterfaceNicType ELASTIC = fromString("Elastic");

    /**
     * Creates or finds a NetworkInterfaceNicType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkInterfaceNicType.
     */
    @JsonCreator
    public static NetworkInterfaceNicType fromString(String name) {
        return fromString(name, NetworkInterfaceNicType.class);
    }

    /**
     * Gets known NetworkInterfaceNicType values.
     *
     * @return known NetworkInterfaceNicType values.
     */
    public static Collection<NetworkInterfaceNicType> values() {
        return values(NetworkInterfaceNicType.class);
    }
}
