// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** State of the private endpoint connection. */
public final class PrivateEndpointProvisioningState extends ExpandableStringEnum<PrivateEndpointProvisioningState> {
    /** Static value Approving for PrivateEndpointProvisioningState. */
    public static final PrivateEndpointProvisioningState APPROVING = fromString("Approving");

    /** Static value Ready for PrivateEndpointProvisioningState. */
    public static final PrivateEndpointProvisioningState READY = fromString("Ready");

    /** Static value Dropping for PrivateEndpointProvisioningState. */
    public static final PrivateEndpointProvisioningState DROPPING = fromString("Dropping");

    /** Static value Failed for PrivateEndpointProvisioningState. */
    public static final PrivateEndpointProvisioningState FAILED = fromString("Failed");

    /** Static value Rejecting for PrivateEndpointProvisioningState. */
    public static final PrivateEndpointProvisioningState REJECTING = fromString("Rejecting");

    /**
     * Creates a new instance of PrivateEndpointProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateEndpointProvisioningState() {
    }

    /**
     * Creates or finds a PrivateEndpointProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointProvisioningState.
     */
    @JsonCreator
    public static PrivateEndpointProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointProvisioningState.class);
    }

    /**
     * Gets known PrivateEndpointProvisioningState values.
     *
     * @return known PrivateEndpointProvisioningState values.
     */
    public static Collection<PrivateEndpointProvisioningState> values() {
        return values(PrivateEndpointProvisioningState.class);
    }
}
