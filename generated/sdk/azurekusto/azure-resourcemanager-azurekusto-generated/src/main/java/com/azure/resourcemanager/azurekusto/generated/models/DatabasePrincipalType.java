// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Database principal type. */
public final class DatabasePrincipalType extends ExpandableStringEnum<DatabasePrincipalType> {
    /** Static value App for DatabasePrincipalType. */
    public static final DatabasePrincipalType APP = fromString("App");

    /** Static value Group for DatabasePrincipalType. */
    public static final DatabasePrincipalType GROUP = fromString("Group");

    /** Static value User for DatabasePrincipalType. */
    public static final DatabasePrincipalType USER = fromString("User");

    /**
     * Creates a new instance of DatabasePrincipalType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabasePrincipalType() {
    }

    /**
     * Creates or finds a DatabasePrincipalType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatabasePrincipalType.
     */
    @JsonCreator
    public static DatabasePrincipalType fromString(String name) {
        return fromString(name, DatabasePrincipalType.class);
    }

    /**
     * Gets known DatabasePrincipalType values.
     *
     * @return known DatabasePrincipalType values.
     */
    public static Collection<DatabasePrincipalType> values() {
        return values(DatabasePrincipalType.class);
    }
}
