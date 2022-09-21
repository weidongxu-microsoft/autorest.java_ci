// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.generated.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccountStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The storage account properties. */
@Fluent
public final class StorageAccountProperties {
    /*
     * Description for the storage Account.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Current status of the storage account
     */
    @JsonProperty(value = "storageAccountStatus")
    private StorageAccountStatus storageAccountStatus;

    /*
     * Data policy of the storage Account.
     */
    @JsonProperty(value = "dataPolicy", required = true)
    private DataPolicy dataPolicy;

    /*
     * Storage Account Credential Id
     */
    @JsonProperty(value = "storageAccountCredentialId")
    private String storageAccountCredentialId;

    /*
     * BlobEndpoint of Storage Account
     */
    @JsonProperty(value = "blobEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String blobEndpoint;

    /*
     * The Container Count. Present only for Storage Accounts with DataPolicy set to Cloud.
     */
    @JsonProperty(value = "containerCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer containerCount;

    /** Creates an instance of StorageAccountProperties class. */
    public StorageAccountProperties() {
    }

    /**
     * Get the description property: Description for the storage Account.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the storage Account.
     *
     * @param description the description value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the storageAccountStatus property: Current status of the storage account.
     *
     * @return the storageAccountStatus value.
     */
    public StorageAccountStatus storageAccountStatus() {
        return this.storageAccountStatus;
    }

    /**
     * Set the storageAccountStatus property: Current status of the storage account.
     *
     * @param storageAccountStatus the storageAccountStatus value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withStorageAccountStatus(StorageAccountStatus storageAccountStatus) {
        this.storageAccountStatus = storageAccountStatus;
        return this;
    }

    /**
     * Get the dataPolicy property: Data policy of the storage Account.
     *
     * @return the dataPolicy value.
     */
    public DataPolicy dataPolicy() {
        return this.dataPolicy;
    }

    /**
     * Set the dataPolicy property: Data policy of the storage Account.
     *
     * @param dataPolicy the dataPolicy value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withDataPolicy(DataPolicy dataPolicy) {
        this.dataPolicy = dataPolicy;
        return this;
    }

    /**
     * Get the storageAccountCredentialId property: Storage Account Credential Id.
     *
     * @return the storageAccountCredentialId value.
     */
    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    /**
     * Set the storageAccountCredentialId property: Storage Account Credential Id.
     *
     * @param storageAccountCredentialId the storageAccountCredentialId value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.storageAccountCredentialId = storageAccountCredentialId;
        return this;
    }

    /**
     * Get the blobEndpoint property: BlobEndpoint of Storage Account.
     *
     * @return the blobEndpoint value.
     */
    public String blobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * Get the containerCount property: The Container Count. Present only for Storage Accounts with DataPolicy set to
     * Cloud.
     *
     * @return the containerCount value.
     */
    public Integer containerCount() {
        return this.containerCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataPolicy() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataPolicy in model StorageAccountProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountProperties.class);
}
