// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BackupAndExport API Request.
 */
@Fluent
public final class BackupAndExportRequest extends BackupRequestBase {
    /*
     * Backup Target Store Details
     */
    @JsonProperty(value = "targetDetails", required = true)
    private BackupStoreDetails targetDetails;

    /**
     * Creates an instance of BackupAndExportRequest class.
     */
    public BackupAndExportRequest() {
    }

    /**
     * Get the targetDetails property: Backup Target Store Details.
     * 
     * @return the targetDetails value.
     */
    public BackupStoreDetails targetDetails() {
        return this.targetDetails;
    }

    /**
     * Set the targetDetails property: Backup Target Store Details.
     * 
     * @param targetDetails the targetDetails value to set.
     * @return the BackupAndExportRequest object itself.
     */
    public BackupAndExportRequest withTargetDetails(BackupStoreDetails targetDetails) {
        this.targetDetails = targetDetails;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupAndExportRequest withBackupSettings(BackupSettings backupSettings) {
        super.withBackupSettings(backupSettings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (targetDetails() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetDetails in model BackupAndExportRequest"));
        } else {
            targetDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupAndExportRequest.class);
}
