// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BackupAndExport Response Properties.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = BackupAndExportResponseType.class,
    visible = true)
@JsonTypeName("BackupAndExportResponse")
@Fluent
public final class BackupAndExportResponseType extends OperationProgressResponseType {
    /*
     * Identifies the type of source operation
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private ObjectType objectType = ObjectType.BACKUP_AND_EXPORT_RESPONSE;

    /*
     * Size of datasource in bytes
     */
    @JsonProperty(value = "datasourceSizeInBytes")
    private Long datasourceSizeInBytes;

    /*
     * Data transferred in bytes
     */
    @JsonProperty(value = "dataTransferredInBytes")
    private Long dataTransferredInBytes;

    /*
     * Metadata related to backup to be stored for restoring resource in key-value pairs.
     */
    @JsonProperty(value = "backupMetadata")
    private String backupMetadata;

    /**
     * Creates an instance of BackupAndExportResponseType class.
     */
    public BackupAndExportResponseType() {
    }

    /**
     * Get the objectType property: Identifies the type of source operation.
     * 
     * @return the objectType value.
     */
    @Override
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Get the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @return the datasourceSizeInBytes value.
     */
    public Long datasourceSizeInBytes() {
        return this.datasourceSizeInBytes;
    }

    /**
     * Set the datasourceSizeInBytes property: Size of datasource in bytes.
     * 
     * @param datasourceSizeInBytes the datasourceSizeInBytes value to set.
     * @return the BackupAndExportResponseType object itself.
     */
    public BackupAndExportResponseType withDatasourceSizeInBytes(Long datasourceSizeInBytes) {
        this.datasourceSizeInBytes = datasourceSizeInBytes;
        return this;
    }

    /**
     * Get the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @return the dataTransferredInBytes value.
     */
    public Long dataTransferredInBytes() {
        return this.dataTransferredInBytes;
    }

    /**
     * Set the dataTransferredInBytes property: Data transferred in bytes.
     * 
     * @param dataTransferredInBytes the dataTransferredInBytes value to set.
     * @return the BackupAndExportResponseType object itself.
     */
    public BackupAndExportResponseType withDataTransferredInBytes(Long dataTransferredInBytes) {
        this.dataTransferredInBytes = dataTransferredInBytes;
        return this;
    }

    /**
     * Get the backupMetadata property: Metadata related to backup to be stored for restoring resource in key-value
     * pairs.
     * 
     * @return the backupMetadata value.
     */
    public String backupMetadata() {
        return this.backupMetadata;
    }

    /**
     * Set the backupMetadata property: Metadata related to backup to be stored for restoring resource in key-value
     * pairs.
     * 
     * @param backupMetadata the backupMetadata value to set.
     * @return the BackupAndExportResponseType object itself.
     */
    public BackupAndExportResponseType withBackupMetadata(String backupMetadata) {
        this.backupMetadata = backupMetadata;
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