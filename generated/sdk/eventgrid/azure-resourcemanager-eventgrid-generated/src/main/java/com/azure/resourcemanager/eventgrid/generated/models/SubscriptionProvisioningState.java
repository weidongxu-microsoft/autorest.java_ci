// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the event subscription.
 */
public final class SubscriptionProvisioningState extends ExpandableStringEnum<SubscriptionProvisioningState> {
    /**
     * Static value Creating for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState FAILED = fromString("Failed");

    /**
     * Static value AwaitingManualAction for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState AWAITING_MANUAL_ACTION = fromString("AwaitingManualAction");

    /**
     * Static value Deleted for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState DELETED = fromString("Deleted");

    /**
     * Static value DeleteFailed for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState DELETE_FAILED = fromString("DeleteFailed");

    /**
     * Static value CreateFailed for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState CREATE_FAILED = fromString("CreateFailed");

    /**
     * Static value UpdatedFailed for SubscriptionProvisioningState.
     */
    public static final SubscriptionProvisioningState UPDATED_FAILED = fromString("UpdatedFailed");

    /**
     * Creates a new instance of SubscriptionProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SubscriptionProvisioningState() {
    }

    /**
     * Creates or finds a SubscriptionProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SubscriptionProvisioningState.
     */
    public static SubscriptionProvisioningState fromString(String name) {
        return fromString(name, SubscriptionProvisioningState.class);
    }

    /**
     * Gets known SubscriptionProvisioningState values.
     * 
     * @return known SubscriptionProvisioningState values.
     */
    public static Collection<SubscriptionProvisioningState> values() {
        return values(SubscriptionProvisioningState.class);
    }
}
