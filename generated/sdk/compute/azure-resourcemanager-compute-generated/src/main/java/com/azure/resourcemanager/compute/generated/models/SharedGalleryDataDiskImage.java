// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the data disk image.
 */
@Fluent
public final class SharedGalleryDataDiskImage extends SharedGalleryDiskImage {
    /*
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * Creates an instance of SharedGalleryDataDiskImage class.
     */
    public SharedGalleryDataDiskImage() {
    }

    /**
     * Get the lun property: This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     * @param lun the lun value to set.
     * @return the SharedGalleryDataDiskImage object itself.
     */
    public SharedGalleryDataDiskImage withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharedGalleryDataDiskImage withHostCaching(SharedGalleryHostCaching hostCaching) {
        super.withHostCaching(hostCaching);
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
    }
}
