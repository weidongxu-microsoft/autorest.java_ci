// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the channel. */
public final class ChannelProvisioningState extends ExpandableStringEnum<ChannelProvisioningState> {
    /** Static value Creating for ChannelProvisioningState. */
    public static final ChannelProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ChannelProvisioningState. */
    public static final ChannelProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for ChannelProvisioningState. */
    public static final ChannelProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for ChannelProvisioningState. */
    public static final ChannelProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for ChannelProvisioningState. */
    public static final ChannelProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for ChannelProvisioningState. */
    public static final ChannelProvisioningState FAILED = fromString("Failed");

    /** Static value IdleDueToMirroredPartnerTopicDeletion for ChannelProvisioningState. */
    public static final ChannelProvisioningState IDLE_DUE_TO_MIRRORED_PARTNER_TOPIC_DELETION =
        fromString("IdleDueToMirroredPartnerTopicDeletion");

    /**
     * Creates or finds a ChannelProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChannelProvisioningState.
     */
    @JsonCreator
    public static ChannelProvisioningState fromString(String name) {
        return fromString(name, ChannelProvisioningState.class);
    }

    /**
     * Gets known ChannelProvisioningState values.
     *
     * @return known ChannelProvisioningState values.
     */
    public static Collection<ChannelProvisioningState> values() {
        return values(ChannelProvisioningState.class);
    }
}
