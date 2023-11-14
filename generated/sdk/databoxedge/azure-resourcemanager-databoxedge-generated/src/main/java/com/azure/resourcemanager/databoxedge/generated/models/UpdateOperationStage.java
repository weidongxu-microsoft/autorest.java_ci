// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Current stage of the update operation.
 */
public final class UpdateOperationStage extends ExpandableStringEnum<UpdateOperationStage> {
    /**
     * Static value Unknown for UpdateOperationStage.
     */
    public static final UpdateOperationStage UNKNOWN = fromString("Unknown");

    /**
     * Static value Initial for UpdateOperationStage.
     */
    public static final UpdateOperationStage INITIAL = fromString("Initial");

    /**
     * Static value ScanStarted for UpdateOperationStage.
     */
    public static final UpdateOperationStage SCAN_STARTED = fromString("ScanStarted");

    /**
     * Static value ScanComplete for UpdateOperationStage.
     */
    public static final UpdateOperationStage SCAN_COMPLETE = fromString("ScanComplete");

    /**
     * Static value ScanFailed for UpdateOperationStage.
     */
    public static final UpdateOperationStage SCAN_FAILED = fromString("ScanFailed");

    /**
     * Static value DownloadStarted for UpdateOperationStage.
     */
    public static final UpdateOperationStage DOWNLOAD_STARTED = fromString("DownloadStarted");

    /**
     * Static value DownloadComplete for UpdateOperationStage.
     */
    public static final UpdateOperationStage DOWNLOAD_COMPLETE = fromString("DownloadComplete");

    /**
     * Static value DownloadFailed for UpdateOperationStage.
     */
    public static final UpdateOperationStage DOWNLOAD_FAILED = fromString("DownloadFailed");

    /**
     * Static value InstallStarted for UpdateOperationStage.
     */
    public static final UpdateOperationStage INSTALL_STARTED = fromString("InstallStarted");

    /**
     * Static value InstallComplete for UpdateOperationStage.
     */
    public static final UpdateOperationStage INSTALL_COMPLETE = fromString("InstallComplete");

    /**
     * Static value InstallFailed for UpdateOperationStage.
     */
    public static final UpdateOperationStage INSTALL_FAILED = fromString("InstallFailed");

    /**
     * Static value RebootInitiated for UpdateOperationStage.
     */
    public static final UpdateOperationStage REBOOT_INITIATED = fromString("RebootInitiated");

    /**
     * Static value Success for UpdateOperationStage.
     */
    public static final UpdateOperationStage SUCCESS = fromString("Success");

    /**
     * Static value Failure for UpdateOperationStage.
     */
    public static final UpdateOperationStage FAILURE = fromString("Failure");

    /**
     * Static value RescanStarted for UpdateOperationStage.
     */
    public static final UpdateOperationStage RESCAN_STARTED = fromString("RescanStarted");

    /**
     * Static value RescanComplete for UpdateOperationStage.
     */
    public static final UpdateOperationStage RESCAN_COMPLETE = fromString("RescanComplete");

    /**
     * Static value RescanFailed for UpdateOperationStage.
     */
    public static final UpdateOperationStage RESCAN_FAILED = fromString("RescanFailed");

    /**
     * Creates a new instance of UpdateOperationStage value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateOperationStage() {
    }

    /**
     * Creates or finds a UpdateOperationStage from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateOperationStage.
     */
    @JsonCreator
    public static UpdateOperationStage fromString(String name) {
        return fromString(name, UpdateOperationStage.class);
    }

    /**
     * Gets known UpdateOperationStage values.
     * 
     * @return known UpdateOperationStage values.
     */
    public static Collection<UpdateOperationStage> values() {
        return values(UpdateOperationStage.class);
    }
}
