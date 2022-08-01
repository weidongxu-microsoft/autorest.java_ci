// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The Approval status for the connection to the Private Link. */
public final class PrivateEndpointStatus extends ExpandableStringEnum<PrivateEndpointStatus> {
    /** Static value Pending for PrivateEndpointStatus. */
    public static final PrivateEndpointStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateEndpointStatus. */
    public static final PrivateEndpointStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateEndpointStatus. */
    public static final PrivateEndpointStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateEndpointStatus. */
    public static final PrivateEndpointStatus DISCONNECTED = fromString("Disconnected");

    /** Static value Timeout for PrivateEndpointStatus. */
    public static final PrivateEndpointStatus TIMEOUT = fromString("Timeout");

    /**
     * Creates or finds a PrivateEndpointStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointStatus.
     */
    @JsonCreator
    public static PrivateEndpointStatus fromString(String name) {
        return fromString(name, PrivateEndpointStatus.class);
    }

    /**
     * Gets known PrivateEndpointStatus values.
     *
     * @return known PrivateEndpointStatus values.
     */
    public static Collection<PrivateEndpointStatus> values() {
        return values(PrivateEndpointStatus.class);
    }
}
