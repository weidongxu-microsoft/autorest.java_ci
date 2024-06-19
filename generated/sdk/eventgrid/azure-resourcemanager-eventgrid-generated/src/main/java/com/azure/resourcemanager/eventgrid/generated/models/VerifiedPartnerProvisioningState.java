// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the verified partner.
 */
public final class VerifiedPartnerProvisioningState extends ExpandableStringEnum<VerifiedPartnerProvisioningState> {
    /**
     * Static value Creating for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for VerifiedPartnerProvisioningState.
     */
    public static final VerifiedPartnerProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of VerifiedPartnerProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VerifiedPartnerProvisioningState() {
    }

    /**
     * Creates or finds a VerifiedPartnerProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VerifiedPartnerProvisioningState.
     */
    public static VerifiedPartnerProvisioningState fromString(String name) {
        return fromString(name, VerifiedPartnerProvisioningState.class);
    }

    /**
     * Gets known VerifiedPartnerProvisioningState values.
     * 
     * @return known VerifiedPartnerProvisioningState values.
     */
    public static Collection<VerifiedPartnerProvisioningState> values() {
        return values(VerifiedPartnerProvisioningState.class);
    }
}
