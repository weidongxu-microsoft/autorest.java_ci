// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SecurityAlertPolicyName.
 */
public final class SecurityAlertPolicyName extends ExpandableStringEnum<SecurityAlertPolicyName> {
    /**
     * Static value Default for SecurityAlertPolicyName.
     */
    public static final SecurityAlertPolicyName DEFAULT = fromString("Default");

    /**
     * Creates a new instance of SecurityAlertPolicyName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityAlertPolicyName() {
    }

    /**
     * Creates or finds a SecurityAlertPolicyName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SecurityAlertPolicyName.
     */
    @JsonCreator
    public static SecurityAlertPolicyName fromString(String name) {
        return fromString(name, SecurityAlertPolicyName.class);
    }

    /**
     * Gets known SecurityAlertPolicyName values.
     * 
     * @return known SecurityAlertPolicyName values.
     */
    public static Collection<SecurityAlertPolicyName> values() {
        return values(SecurityAlertPolicyName.class);
    }
}
