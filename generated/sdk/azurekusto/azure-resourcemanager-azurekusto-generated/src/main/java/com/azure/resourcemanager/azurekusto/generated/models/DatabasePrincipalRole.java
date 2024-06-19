// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Database principal role.
 */
public final class DatabasePrincipalRole extends ExpandableStringEnum<DatabasePrincipalRole> {
    /**
     * Static value Admin for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole ADMIN = fromString("Admin");

    /**
     * Static value Ingestor for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole INGESTOR = fromString("Ingestor");

    /**
     * Static value Monitor for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole MONITOR = fromString("Monitor");

    /**
     * Static value User for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole USER = fromString("User");

    /**
     * Static value UnrestrictedViewer for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole UNRESTRICTED_VIEWER = fromString("UnrestrictedViewer");

    /**
     * Static value Viewer for DatabasePrincipalRole.
     */
    public static final DatabasePrincipalRole VIEWER = fromString("Viewer");

    /**
     * Creates a new instance of DatabasePrincipalRole value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabasePrincipalRole() {
    }

    /**
     * Creates or finds a DatabasePrincipalRole from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DatabasePrincipalRole.
     */
    public static DatabasePrincipalRole fromString(String name) {
        return fromString(name, DatabasePrincipalRole.class);
    }

    /**
     * Gets known DatabasePrincipalRole values.
     * 
     * @return known DatabasePrincipalRole values.
     */
    public static Collection<DatabasePrincipalRole> values() {
        return values(DatabasePrincipalRole.class);
    }
}
