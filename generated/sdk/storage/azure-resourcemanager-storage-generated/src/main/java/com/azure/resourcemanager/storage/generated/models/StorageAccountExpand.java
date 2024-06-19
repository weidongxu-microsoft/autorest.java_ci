// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

/**
 * Defines values for StorageAccountExpand.
 */
public enum StorageAccountExpand {
    /**
     * Enum value geoReplicationStats.
     */
    GEO_REPLICATION_STATS("geoReplicationStats"),

    /**
     * Enum value blobRestoreStatus.
     */
    BLOB_RESTORE_STATUS("blobRestoreStatus");

    /**
     * The actual serialized value for a StorageAccountExpand instance.
     */
    private final String value;

    StorageAccountExpand(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StorageAccountExpand instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed StorageAccountExpand object, or null if unable to parse.
     */
    public static StorageAccountExpand fromString(String value) {
        if (value == null) {
            return null;
        }
        StorageAccountExpand[] items = StorageAccountExpand.values();
        for (StorageAccountExpand item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
