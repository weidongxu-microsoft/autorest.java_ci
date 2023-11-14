// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage Profile properties of a server.
 */
@Fluent
public final class StorageProfile {
    /*
     * Backup retention days for the server.
     */
    @JsonProperty(value = "backupRetentionDays")
    private Integer backupRetentionDays;

    /*
     * Enable Geo-redundant or not for server backup.
     */
    @JsonProperty(value = "geoRedundantBackup")
    private GeoRedundantBackup geoRedundantBackup;

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "storageMB")
    private Integer storageMB;

    /*
     * Enable Storage Auto Grow.
     */
    @JsonProperty(value = "storageAutogrow")
    private StorageAutogrow storageAutogrow;

    /**
     * Creates an instance of StorageProfile class.
     */
    public StorageProfile() {
    }

    /**
     * Get the backupRetentionDays property: Backup retention days for the server.
     * 
     * @return the backupRetentionDays value.
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set the backupRetentionDays property: Backup retention days for the server.
     * 
     * @param backupRetentionDays the backupRetentionDays value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get the geoRedundantBackup property: Enable Geo-redundant or not for server backup.
     * 
     * @return the geoRedundantBackup value.
     */
    public GeoRedundantBackup geoRedundantBackup() {
        return this.geoRedundantBackup;
    }

    /**
     * Set the geoRedundantBackup property: Enable Geo-redundant or not for server backup.
     * 
     * @param geoRedundantBackup the geoRedundantBackup value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withGeoRedundantBackup(GeoRedundantBackup geoRedundantBackup) {
        this.geoRedundantBackup = geoRedundantBackup;
        return this;
    }

    /**
     * Get the storageMB property: Max storage allowed for a server.
     * 
     * @return the storageMB value.
     */
    public Integer storageMB() {
        return this.storageMB;
    }

    /**
     * Set the storageMB property: Max storage allowed for a server.
     * 
     * @param storageMB the storageMB value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageMB(Integer storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get the storageAutogrow property: Enable Storage Auto Grow.
     * 
     * @return the storageAutogrow value.
     */
    public StorageAutogrow storageAutogrow() {
        return this.storageAutogrow;
    }

    /**
     * Set the storageAutogrow property: Enable Storage Auto Grow.
     * 
     * @param storageAutogrow the storageAutogrow value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageAutogrow(StorageAutogrow storageAutogrow) {
        this.storageAutogrow = storageAutogrow;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
