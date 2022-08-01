// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The application protocol type of a Rule. */
public final class FirewallPolicyRuleApplicationProtocolType
    extends ExpandableStringEnum<FirewallPolicyRuleApplicationProtocolType> {
    /** Static value Http for FirewallPolicyRuleApplicationProtocolType. */
    public static final FirewallPolicyRuleApplicationProtocolType HTTP = fromString("Http");

    /** Static value Https for FirewallPolicyRuleApplicationProtocolType. */
    public static final FirewallPolicyRuleApplicationProtocolType HTTPS = fromString("Https");

    /**
     * Creates or finds a FirewallPolicyRuleApplicationProtocolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleApplicationProtocolType.
     */
    @JsonCreator
    public static FirewallPolicyRuleApplicationProtocolType fromString(String name) {
        return fromString(name, FirewallPolicyRuleApplicationProtocolType.class);
    }

    /**
     * Gets known FirewallPolicyRuleApplicationProtocolType values.
     *
     * @return known FirewallPolicyRuleApplicationProtocolType values.
     */
    public static Collection<FirewallPolicyRuleApplicationProtocolType> values() {
        return values(FirewallPolicyRuleApplicationProtocolType.class);
    }
}
