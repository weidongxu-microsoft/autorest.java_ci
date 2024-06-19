// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * VPN client protocol enabled for the virtual network gateway.
 */
public final class VpnClientProtocol extends ExpandableStringEnum<VpnClientProtocol> {
    /**
     * Static value IkeV2 for VpnClientProtocol.
     */
    public static final VpnClientProtocol IKE_V2 = fromString("IkeV2");

    /**
     * Static value SSTP for VpnClientProtocol.
     */
    public static final VpnClientProtocol SSTP = fromString("SSTP");

    /**
     * Static value OpenVPN for VpnClientProtocol.
     */
    public static final VpnClientProtocol OPEN_VPN = fromString("OpenVPN");

    /**
     * Creates a new instance of VpnClientProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VpnClientProtocol() {
    }

    /**
     * Creates or finds a VpnClientProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VpnClientProtocol.
     */
    public static VpnClientProtocol fromString(String name) {
        return fromString(name, VpnClientProtocol.class);
    }

    /**
     * Gets known VpnClientProtocol values.
     * 
     * @return known VpnClientProtocol values.
     */
    public static Collection<VpnClientProtocol> values() {
        return values(VpnClientProtocol.class);
    }
}
