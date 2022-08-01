// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the job. */
public final class JobType extends ExpandableStringEnum<JobType> {
    /** Static value Invalid for JobType. */
    public static final JobType INVALID = fromString("Invalid");

    /** Static value ScanForUpdates for JobType. */
    public static final JobType SCAN_FOR_UPDATES = fromString("ScanForUpdates");

    /** Static value DownloadUpdates for JobType. */
    public static final JobType DOWNLOAD_UPDATES = fromString("DownloadUpdates");

    /** Static value InstallUpdates for JobType. */
    public static final JobType INSTALL_UPDATES = fromString("InstallUpdates");

    /** Static value RefreshShare for JobType. */
    public static final JobType REFRESH_SHARE = fromString("RefreshShare");

    /** Static value RefreshContainer for JobType. */
    public static final JobType REFRESH_CONTAINER = fromString("RefreshContainer");

    /** Static value Backup for JobType. */
    public static final JobType BACKUP = fromString("Backup");

    /** Static value Restore for JobType. */
    public static final JobType RESTORE = fromString("Restore");

    /** Static value TriggerSupportPackage for JobType. */
    public static final JobType TRIGGER_SUPPORT_PACKAGE = fromString("TriggerSupportPackage");

    /**
     * Creates or finds a JobType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobType.
     */
    @JsonCreator
    public static JobType fromString(String name) {
        return fromString(name, JobType.class);
    }

    /**
     * Gets known JobType values.
     *
     * @return known JobType values.
     */
    public static Collection<JobType> values() {
        return values(JobType.class);
    }
}
