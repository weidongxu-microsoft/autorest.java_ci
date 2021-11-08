// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure container mapping of the endpoint. */
@Fluent
public final class AzureContainerInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureContainerInfo.class);

    /*
     * ID of the storage account credential used to access storage.
     */
    @JsonProperty(value = "storageAccountCredentialId", required = true)
    private String storageAccountCredentialId;

    /*
     * Container name (Based on the data format specified, this represents the
     * name of Azure Files/Page blob/Block blob).
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * Storage format used for the file represented by the share.
     */
    @JsonProperty(value = "dataFormat", required = true)
    private AzureContainerDataFormat dataFormat;

    /**
     * Get the storageAccountCredentialId property: ID of the storage account credential used to access storage.
     *
     * @return the storageAccountCredentialId value.
     */
    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    /**
     * Set the storageAccountCredentialId property: ID of the storage account credential used to access storage.
     *
     * @param storageAccountCredentialId the storageAccountCredentialId value to set.
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.storageAccountCredentialId = storageAccountCredentialId;
        return this;
    }

    /**
     * Get the containerName property: Container name (Based on the data format specified, this represents the name of
     * Azure Files/Page blob/Block blob).
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Container name (Based on the data format specified, this represents the name of
     * Azure Files/Page blob/Block blob).
     *
     * @param containerName the containerName value to set.
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the dataFormat property: Storage format used for the file represented by the share.
     *
     * @return the dataFormat value.
     */
    public AzureContainerDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set the dataFormat property: Storage format used for the file represented by the share.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the AzureContainerInfo object itself.
     */
    public AzureContainerInfo withDataFormat(AzureContainerDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountCredentialId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageAccountCredentialId in model AzureContainerInfo"));
        }
        if (containerName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property containerName in model AzureContainerInfo"));
        }
        if (dataFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataFormat in model AzureContainerInfo"));
        }
    }
}
