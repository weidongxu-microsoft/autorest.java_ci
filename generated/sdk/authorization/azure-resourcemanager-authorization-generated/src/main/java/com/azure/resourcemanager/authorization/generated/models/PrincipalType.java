// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The principal type of the assigned principal ID. */
public final class PrincipalType extends ExpandableStringEnum<PrincipalType> {
    /** Static value User for PrincipalType. */
    public static final PrincipalType USER = fromString("User");

    /** Static value Group for PrincipalType. */
    public static final PrincipalType GROUP = fromString("Group");

    /** Static value ServicePrincipal for PrincipalType. */
    public static final PrincipalType SERVICE_PRINCIPAL = fromString("ServicePrincipal");

    /** Static value ForeignGroup for PrincipalType. */
    public static final PrincipalType FOREIGN_GROUP = fromString("ForeignGroup");

    /**
     * Creates a new instance of PrincipalType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrincipalType() {
    }

    /**
     * Creates or finds a PrincipalType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrincipalType.
     */
    @JsonCreator
    public static PrincipalType fromString(String name) {
        return fromString(name, PrincipalType.class);
    }

    /**
     * Gets known PrincipalType values.
     *
     * @return known PrincipalType values.
     */
    public static Collection<PrincipalType> values() {
        return values(PrincipalType.class);
    }
}
