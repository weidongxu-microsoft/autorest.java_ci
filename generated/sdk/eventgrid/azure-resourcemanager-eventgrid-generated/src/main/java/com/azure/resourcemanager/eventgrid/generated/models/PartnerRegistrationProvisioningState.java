// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the partner registration. */
public final class PartnerRegistrationProvisioningState
    extends ExpandableStringEnum<PartnerRegistrationProvisioningState> {
    /** Static value Creating for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for PartnerRegistrationProvisioningState. */
    public static final PartnerRegistrationProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a PartnerRegistrationProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerRegistrationProvisioningState.
     */
    @JsonCreator
    public static PartnerRegistrationProvisioningState fromString(String name) {
        return fromString(name, PartnerRegistrationProvisioningState.class);
    }

    /**
     * Gets known PartnerRegistrationProvisioningState values.
     *
     * @return known PartnerRegistrationProvisioningState values.
     */
    public static Collection<PartnerRegistrationProvisioningState> values() {
        return values(PartnerRegistrationProvisioningState.class);
    }
}
