// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created
 * identity and a set of user-assigned identities. The type 'None' will remove all identities.
 */
public final class IdentityType extends ExpandableStringEnum<IdentityType> {
    /** Static value None for IdentityType. */
    public static final IdentityType NONE = fromString("None");

    /** Static value SystemAssigned for IdentityType. */
    public static final IdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for IdentityType. */
    public static final IdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAssigned, UserAssigned for IdentityType. */
    public static final IdentityType SYSTEM_ASSIGNED_USER_ASSIGNED = fromString("SystemAssigned, UserAssigned");

    /**
     * Creates a new instance of IdentityType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IdentityType() {
    }

    /**
     * Creates or finds a IdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IdentityType.
     */
    @JsonCreator
    public static IdentityType fromString(String name) {
        return fromString(name, IdentityType.class);
    }

    /**
     * Gets known IdentityType values.
     *
     * @return known IdentityType values.
     */
    public static Collection<IdentityType> values() {
        return values(IdentityType.class);
    }
}
