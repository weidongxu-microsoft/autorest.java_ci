// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The provisioning state of the private link service connection. Valid values are Updating, Deleting, Failed,
 * Succeeded, Incomplete, or Canceled.
 */
public final class PrivateLinkServiceConnectionProvisioningState
    extends ExpandableStringEnum<PrivateLinkServiceConnectionProvisioningState> {
    /**
     * Static value Updating for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Failed for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Incomplete for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState INCOMPLETE = fromString("Incomplete");

    /**
     * Static value Canceled for PrivateLinkServiceConnectionProvisioningState.
     */
    public static final PrivateLinkServiceConnectionProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of PrivateLinkServiceConnectionProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateLinkServiceConnectionProvisioningState() {
    }

    /**
     * Creates or finds a PrivateLinkServiceConnectionProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateLinkServiceConnectionProvisioningState.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionProvisioningState fromString(String name) {
        return fromString(name, PrivateLinkServiceConnectionProvisioningState.class);
    }

    /**
     * Gets known PrivateLinkServiceConnectionProvisioningState values.
     * 
     * @return known PrivateLinkServiceConnectionProvisioningState values.
     */
    public static Collection<PrivateLinkServiceConnectionProvisioningState> values() {
        return values(PrivateLinkServiceConnectionProvisioningState.class);
    }
}
