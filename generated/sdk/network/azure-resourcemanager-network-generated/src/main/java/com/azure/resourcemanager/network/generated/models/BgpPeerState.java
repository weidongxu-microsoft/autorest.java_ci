// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The BGP peer state. */
public final class BgpPeerState extends ExpandableStringEnum<BgpPeerState> {
    /** Static value Unknown for BgpPeerState. */
    public static final BgpPeerState UNKNOWN = fromString("Unknown");

    /** Static value Stopped for BgpPeerState. */
    public static final BgpPeerState STOPPED = fromString("Stopped");

    /** Static value Idle for BgpPeerState. */
    public static final BgpPeerState IDLE = fromString("Idle");

    /** Static value Connecting for BgpPeerState. */
    public static final BgpPeerState CONNECTING = fromString("Connecting");

    /** Static value Connected for BgpPeerState. */
    public static final BgpPeerState CONNECTED = fromString("Connected");

    /**
     * Creates or finds a BgpPeerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BgpPeerState.
     */
    @JsonCreator
    public static BgpPeerState fromString(String name) {
        return fromString(name, BgpPeerState.class);
    }

    /**
     * Gets known BgpPeerState values.
     *
     * @return known BgpPeerState values.
     */
    public static Collection<BgpPeerState> values() {
        return values(BgpPeerState.class);
    }
}
