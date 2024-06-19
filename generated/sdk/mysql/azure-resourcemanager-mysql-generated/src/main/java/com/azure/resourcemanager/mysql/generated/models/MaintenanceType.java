// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of this maintenance.
 */
public final class MaintenanceType extends ExpandableStringEnum<MaintenanceType> {
    /**
     * Static value RoutineMaintenance for MaintenanceType.
     */
    public static final MaintenanceType ROUTINE_MAINTENANCE = fromString("RoutineMaintenance");

    /**
     * Static value MinorVersionUpgrade for MaintenanceType.
     */
    public static final MaintenanceType MINOR_VERSION_UPGRADE = fromString("MinorVersionUpgrade");

    /**
     * Static value SecurityPatches for MaintenanceType.
     */
    public static final MaintenanceType SECURITY_PATCHES = fromString("SecurityPatches");

    /**
     * Static value HotFixes for MaintenanceType.
     */
    public static final MaintenanceType HOT_FIXES = fromString("HotFixes");

    /**
     * Creates a new instance of MaintenanceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MaintenanceType() {
    }

    /**
     * Creates or finds a MaintenanceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MaintenanceType.
     */
    public static MaintenanceType fromString(String name) {
        return fromString(name, MaintenanceType.class);
    }

    /**
     * Gets known MaintenanceType values.
     * 
     * @return known MaintenanceType values.
     */
    public static Collection<MaintenanceType> values() {
        return values(MaintenanceType.class);
    }
}
