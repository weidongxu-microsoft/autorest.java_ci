// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current provisioning State of the revision. */
public final class RevisionProvisioningState extends ExpandableStringEnum<RevisionProvisioningState> {
    /** Static value Provisioning for RevisionProvisioningState. */
    public static final RevisionProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for RevisionProvisioningState. */
    public static final RevisionProvisioningState PROVISIONED = fromString("Provisioned");

    /** Static value Failed for RevisionProvisioningState. */
    public static final RevisionProvisioningState FAILED = fromString("Failed");

    /** Static value Deprovisioning for RevisionProvisioningState. */
    public static final RevisionProvisioningState DEPROVISIONING = fromString("Deprovisioning");

    /** Static value Deprovisioned for RevisionProvisioningState. */
    public static final RevisionProvisioningState DEPROVISIONED = fromString("Deprovisioned");

    /**
     * Creates a new instance of RevisionProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RevisionProvisioningState() {
    }

    /**
     * Creates or finds a RevisionProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RevisionProvisioningState.
     */
    @JsonCreator
    public static RevisionProvisioningState fromString(String name) {
        return fromString(name, RevisionProvisioningState.class);
    }

    /**
     * Gets known RevisionProvisioningState values.
     *
     * @return known RevisionProvisioningState values.
     */
    public static Collection<RevisionProvisioningState> values() {
        return values(RevisionProvisioningState.class);
    }
}
