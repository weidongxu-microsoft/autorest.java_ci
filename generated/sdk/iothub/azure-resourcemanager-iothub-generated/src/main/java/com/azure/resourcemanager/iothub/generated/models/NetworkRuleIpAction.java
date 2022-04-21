// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkRuleIpAction. */
public final class NetworkRuleIpAction extends ExpandableStringEnum<NetworkRuleIpAction> {
    /** Static value Allow for NetworkRuleIpAction. */
    public static final NetworkRuleIpAction ALLOW = fromString("Allow");

    /**
     * Creates or finds a NetworkRuleIpAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkRuleIpAction.
     */
    @JsonCreator
    public static NetworkRuleIpAction fromString(String name) {
        return fromString(name, NetworkRuleIpAction.class);
    }

    /**
     * Gets known NetworkRuleIpAction values.
     *
     * @return known NetworkRuleIpAction values.
     */
    public static Collection<NetworkRuleIpAction> values() {
        return values(NetworkRuleIpAction.class);
    }
}
