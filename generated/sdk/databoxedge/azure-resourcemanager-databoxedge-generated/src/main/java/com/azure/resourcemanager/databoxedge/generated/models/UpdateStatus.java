// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Status of the update.
 */
public final class UpdateStatus extends ExpandableStringEnum<UpdateStatus> {
    /**
     * Static value DownloadPending for UpdateStatus.
     */
    public static final UpdateStatus DOWNLOAD_PENDING = fromString("DownloadPending");

    /**
     * Static value DownloadStarted for UpdateStatus.
     */
    public static final UpdateStatus DOWNLOAD_STARTED = fromString("DownloadStarted");

    /**
     * Static value DownloadCompleted for UpdateStatus.
     */
    public static final UpdateStatus DOWNLOAD_COMPLETED = fromString("DownloadCompleted");

    /**
     * Static value InstallStarted for UpdateStatus.
     */
    public static final UpdateStatus INSTALL_STARTED = fromString("InstallStarted");

    /**
     * Static value InstallCompleted for UpdateStatus.
     */
    public static final UpdateStatus INSTALL_COMPLETED = fromString("InstallCompleted");

    /**
     * Creates a new instance of UpdateStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateStatus() {
    }

    /**
     * Creates or finds a UpdateStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateStatus.
     */
    @JsonCreator
    public static UpdateStatus fromString(String name) {
        return fromString(name, UpdateStatus.class);
    }

    /**
     * Gets known UpdateStatus values.
     * 
     * @return known UpdateStatus values.
     */
    public static Collection<UpdateStatus> values() {
        return values(UpdateStatus.class);
    }
}
