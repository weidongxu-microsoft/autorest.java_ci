// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Network protocol this rule applies to. */
public final class SecurityRuleProtocol extends ExpandableStringEnum<SecurityRuleProtocol> {
    /** Static value Tcp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol TCP = fromString("Tcp");

    /** Static value Udp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol UDP = fromString("Udp");

    /** Static value Icmp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ICMP = fromString("Icmp");

    /** Static value Esp for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ESP = fromString("Esp");

    /** Static value * for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol ASTERISK = fromString("*");

    /** Static value Ah for SecurityRuleProtocol. */
    public static final SecurityRuleProtocol AH = fromString("Ah");

    /**
     * Creates or finds a SecurityRuleProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityRuleProtocol.
     */
    @JsonCreator
    public static SecurityRuleProtocol fromString(String name) {
        return fromString(name, SecurityRuleProtocol.class);
    }

    /**
     * Gets known SecurityRuleProtocol values.
     *
     * @return known SecurityRuleProtocol values.
     */
    public static Collection<SecurityRuleProtocol> values() {
        return values(SecurityRuleProtocol.class);
    }
}
