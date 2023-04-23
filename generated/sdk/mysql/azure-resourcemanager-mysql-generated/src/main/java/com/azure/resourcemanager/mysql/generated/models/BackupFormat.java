// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Backup Format for the current backup. (CollatedFormat is INTERNAL – DO NOT USE). */
public final class BackupFormat extends ExpandableStringEnum<BackupFormat> {
    /** Static value None for BackupFormat. */
    public static final BackupFormat NONE = fromString("None");

    /** Static value CollatedFormat for BackupFormat. */
    public static final BackupFormat COLLATED_FORMAT = fromString("CollatedFormat");

    /**
     * Creates a new instance of BackupFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupFormat() {
    }

    /**
     * Creates or finds a BackupFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackupFormat.
     */
    @JsonCreator
    public static BackupFormat fromString(String name) {
        return fromString(name, BackupFormat.class);
    }

    /**
     * Gets known BackupFormat values.
     *
     * @return known BackupFormat values.
     */
    public static Collection<BackupFormat> values() {
        return values(BackupFormat.class);
    }
}
