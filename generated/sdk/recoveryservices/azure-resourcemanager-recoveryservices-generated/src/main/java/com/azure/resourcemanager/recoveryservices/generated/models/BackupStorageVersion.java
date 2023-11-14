// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Backup storage version.
 */
public final class BackupStorageVersion extends ExpandableStringEnum<BackupStorageVersion> {
    /**
     * Static value V1 for BackupStorageVersion.
     */
    public static final BackupStorageVersion V1 = fromString("V1");

    /**
     * Static value V2 for BackupStorageVersion.
     */
    public static final BackupStorageVersion V2 = fromString("V2");

    /**
     * Static value Unassigned for BackupStorageVersion.
     */
    public static final BackupStorageVersion UNASSIGNED = fromString("Unassigned");

    /**
     * Creates a new instance of BackupStorageVersion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupStorageVersion() {
    }

    /**
     * Creates or finds a BackupStorageVersion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupStorageVersion.
     */
    @JsonCreator
    public static BackupStorageVersion fromString(String name) {
        return fromString(name, BackupStorageVersion.class);
    }

    /**
     * Gets known BackupStorageVersion values.
     * 
     * @return known BackupStorageVersion values.
     */
    public static Collection<BackupStorageVersion> values() {
        return values(BackupStorageVersion.class);
    }
}
