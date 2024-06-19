// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Operational state of the application gateway resource.
 */
public final class ApplicationGatewayOperationalState extends ExpandableStringEnum<ApplicationGatewayOperationalState> {
    /**
     * Static value Stopped for ApplicationGatewayOperationalState.
     */
    public static final ApplicationGatewayOperationalState STOPPED = fromString("Stopped");

    /**
     * Static value Starting for ApplicationGatewayOperationalState.
     */
    public static final ApplicationGatewayOperationalState STARTING = fromString("Starting");

    /**
     * Static value Running for ApplicationGatewayOperationalState.
     */
    public static final ApplicationGatewayOperationalState RUNNING = fromString("Running");

    /**
     * Static value Stopping for ApplicationGatewayOperationalState.
     */
    public static final ApplicationGatewayOperationalState STOPPING = fromString("Stopping");

    /**
     * Creates a new instance of ApplicationGatewayOperationalState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayOperationalState() {
    }

    /**
     * Creates or finds a ApplicationGatewayOperationalState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayOperationalState.
     */
    public static ApplicationGatewayOperationalState fromString(String name) {
        return fromString(name, ApplicationGatewayOperationalState.class);
    }

    /**
     * Gets known ApplicationGatewayOperationalState values.
     * 
     * @return known ApplicationGatewayOperationalState values.
     */
    public static Collection<ApplicationGatewayOperationalState> values() {
        return values(ApplicationGatewayOperationalState.class);
    }
}
