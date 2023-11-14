// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the PermissionBinding resource.
 */
public final class PermissionBindingProvisioningState extends ExpandableStringEnum<PermissionBindingProvisioningState> {
    /**
     * Static value Creating for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleted for PermissionBindingProvisioningState.
     */
    public static final PermissionBindingProvisioningState DELETED = fromString("Deleted");

    /**
     * Creates a new instance of PermissionBindingProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PermissionBindingProvisioningState() {
    }

    /**
     * Creates or finds a PermissionBindingProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PermissionBindingProvisioningState.
     */
    @JsonCreator
    public static PermissionBindingProvisioningState fromString(String name) {
        return fromString(name, PermissionBindingProvisioningState.class);
    }

    /**
     * Gets known PermissionBindingProvisioningState values.
     * 
     * @return known PermissionBindingProvisioningState values.
     */
    public static Collection<PermissionBindingProvisioningState> values() {
        return values(PermissionBindingProvisioningState.class);
    }
}
