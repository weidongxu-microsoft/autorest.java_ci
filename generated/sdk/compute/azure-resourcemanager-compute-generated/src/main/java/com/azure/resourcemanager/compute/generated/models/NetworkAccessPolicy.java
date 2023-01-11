// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Policy for accessing the disk via network. */
public final class NetworkAccessPolicy extends ExpandableStringEnum<NetworkAccessPolicy> {
    /** Static value AllowAll for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy ALLOW_ALL = fromString("AllowAll");

    /** Static value AllowPrivate for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy ALLOW_PRIVATE = fromString("AllowPrivate");

    /** Static value DenyAll for NetworkAccessPolicy. */
    public static final NetworkAccessPolicy DENY_ALL = fromString("DenyAll");

    /**
     * Creates a new instance of NetworkAccessPolicy value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkAccessPolicy() {
    }

    /**
     * Creates or finds a NetworkAccessPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkAccessPolicy.
     */
    @JsonCreator
    public static NetworkAccessPolicy fromString(String name) {
        return fromString(name, NetworkAccessPolicy.class);
    }

    /**
     * Gets known NetworkAccessPolicy values.
     *
     * @return known NetworkAccessPolicy values.
     */
    public static Collection<NetworkAccessPolicy> values() {
        return values(NetworkAccessPolicy.class);
    }
}
