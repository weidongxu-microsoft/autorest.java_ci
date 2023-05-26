// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** User Session clause variable. */
public final class ApplicationGatewayFirewallUserSessionVariable
    extends ExpandableStringEnum<ApplicationGatewayFirewallUserSessionVariable> {
    /** Static value ClientAddr for ApplicationGatewayFirewallUserSessionVariable. */
    public static final ApplicationGatewayFirewallUserSessionVariable CLIENT_ADDR = fromString("ClientAddr");

    /** Static value GeoLocation for ApplicationGatewayFirewallUserSessionVariable. */
    public static final ApplicationGatewayFirewallUserSessionVariable GEO_LOCATION = fromString("GeoLocation");

    /** Static value None for ApplicationGatewayFirewallUserSessionVariable. */
    public static final ApplicationGatewayFirewallUserSessionVariable NONE = fromString("None");

    /**
     * Creates a new instance of ApplicationGatewayFirewallUserSessionVariable value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayFirewallUserSessionVariable() {
    }

    /**
     * Creates or finds a ApplicationGatewayFirewallUserSessionVariable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayFirewallUserSessionVariable.
     */
    @JsonCreator
    public static ApplicationGatewayFirewallUserSessionVariable fromString(String name) {
        return fromString(name, ApplicationGatewayFirewallUserSessionVariable.class);
    }

    /**
     * Gets known ApplicationGatewayFirewallUserSessionVariable values.
     *
     * @return known ApplicationGatewayFirewallUserSessionVariable values.
     */
    public static Collection<ApplicationGatewayFirewallUserSessionVariable> values() {
        return values(ApplicationGatewayFirewallUserSessionVariable.class);
    }
}