// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityConfigurationRuleAccess. */
public final class SecurityConfigurationRuleAccess extends ExpandableStringEnum<SecurityConfigurationRuleAccess> {
    /** Static value Allow for SecurityConfigurationRuleAccess. */
    public static final SecurityConfigurationRuleAccess ALLOW = fromString("Allow");

    /** Static value Deny for SecurityConfigurationRuleAccess. */
    public static final SecurityConfigurationRuleAccess DENY = fromString("Deny");

    /** Static value AlwaysAllow for SecurityConfigurationRuleAccess. */
    public static final SecurityConfigurationRuleAccess ALWAYS_ALLOW = fromString("AlwaysAllow");

    /**
     * Creates or finds a SecurityConfigurationRuleAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityConfigurationRuleAccess.
     */
    @JsonCreator
    public static SecurityConfigurationRuleAccess fromString(String name) {
        return fromString(name, SecurityConfigurationRuleAccess.class);
    }

    /**
     * Gets known SecurityConfigurationRuleAccess values.
     *
     * @return known SecurityConfigurationRuleAccess values.
     */
    public static Collection<SecurityConfigurationRuleAccess> values() {
        return values(SecurityConfigurationRuleAccess.class);
    }
}