// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Table's current provisioning state. If set to 'updating', indicates a resource lock due to ongoing operation,
 * forbidding any update to the table until the ongoing operation is concluded.
 */
public final class ProvisioningStateEnum extends ExpandableStringEnum<ProvisioningStateEnum> {
    /** Static value Updating for ProvisioningStateEnum. */
    public static final ProvisioningStateEnum UPDATING = fromString("Updating");

    /** Static value InProgress for ProvisioningStateEnum. */
    public static final ProvisioningStateEnum IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for ProvisioningStateEnum. */
    public static final ProvisioningStateEnum SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a ProvisioningStateEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningStateEnum.
     */
    @JsonCreator
    public static ProvisioningStateEnum fromString(String name) {
        return fromString(name, ProvisioningStateEnum.class);
    }

    /**
     * Gets known ProvisioningStateEnum values.
     *
     * @return known ProvisioningStateEnum values.
     */
    public static Collection<ProvisioningStateEnum> values() {
        return values(ProvisioningStateEnum.class);
    }
}
