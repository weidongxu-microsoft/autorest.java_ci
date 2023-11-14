// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates if the client is enabled or not. Default value is Enabled.
 */
public final class ClientState extends ExpandableStringEnum<ClientState> {
    /**
     * Static value Enabled for ClientState.
     */
    public static final ClientState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for ClientState.
     */
    public static final ClientState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of ClientState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClientState() {
    }

    /**
     * Creates or finds a ClientState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClientState.
     */
    @JsonCreator
    public static ClientState fromString(String name) {
        return fromString(name, ClientState.class);
    }

    /**
     * Gets known ClientState values.
     * 
     * @return known ClientState values.
     */
    public static Collection<ClientState> values() {
        return values(ClientState.class);
    }
}
