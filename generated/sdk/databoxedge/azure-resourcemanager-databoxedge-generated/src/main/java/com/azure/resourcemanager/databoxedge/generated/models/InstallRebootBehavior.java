// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates if updates are available and at least one of the updates needs a reboot.
 */
public final class InstallRebootBehavior extends ExpandableStringEnum<InstallRebootBehavior> {
    /**
     * Static value NeverReboots for InstallRebootBehavior.
     */
    public static final InstallRebootBehavior NEVER_REBOOTS = fromString("NeverReboots");

    /**
     * Static value RequiresReboot for InstallRebootBehavior.
     */
    public static final InstallRebootBehavior REQUIRES_REBOOT = fromString("RequiresReboot");

    /**
     * Static value RequestReboot for InstallRebootBehavior.
     */
    public static final InstallRebootBehavior REQUEST_REBOOT = fromString("RequestReboot");

    /**
     * Creates a new instance of InstallRebootBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InstallRebootBehavior() {
    }

    /**
     * Creates or finds a InstallRebootBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding InstallRebootBehavior.
     */
    public static InstallRebootBehavior fromString(String name) {
        return fromString(name, InstallRebootBehavior.class);
    }

    /**
     * Gets known InstallRebootBehavior values.
     * 
     * @return known InstallRebootBehavior values.
     */
    public static Collection<InstallRebootBehavior> values() {
        return values(InstallRebootBehavior.class);
    }
}
