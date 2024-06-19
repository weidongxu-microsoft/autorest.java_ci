// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6.
 * Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
 */
public final class IpVersions extends ExpandableStringEnum<IpVersions> {
    /**
     * Static value IPv4 for IpVersions.
     */
    public static final IpVersions IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for IpVersions.
     */
    public static final IpVersions IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of IpVersions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpVersions() {
    }

    /**
     * Creates or finds a IpVersions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IpVersions.
     */
    public static IpVersions fromString(String name) {
        return fromString(name, IpVersions.class);
    }

    /**
     * Gets known IpVersions values.
     * 
     * @return known IpVersions values.
     */
    public static Collection<IpVersions> values() {
        return values(IpVersions.class);
    }
}
