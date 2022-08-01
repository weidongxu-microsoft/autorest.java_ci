// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of access to be allowed for the client. */
public final class ClientPermissionType extends ExpandableStringEnum<ClientPermissionType> {
    /** Static value NoAccess for ClientPermissionType. */
    public static final ClientPermissionType NO_ACCESS = fromString("NoAccess");

    /** Static value ReadOnly for ClientPermissionType. */
    public static final ClientPermissionType READ_ONLY = fromString("ReadOnly");

    /** Static value ReadWrite for ClientPermissionType. */
    public static final ClientPermissionType READ_WRITE = fromString("ReadWrite");

    /**
     * Creates or finds a ClientPermissionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClientPermissionType.
     */
    @JsonCreator
    public static ClientPermissionType fromString(String name) {
        return fromString(name, ClientPermissionType.class);
    }

    /**
     * Gets known ClientPermissionType values.
     *
     * @return known ClientPermissionType values.
     */
    public static Collection<ClientPermissionType> values() {
        return values(ClientPermissionType.class);
    }
}
