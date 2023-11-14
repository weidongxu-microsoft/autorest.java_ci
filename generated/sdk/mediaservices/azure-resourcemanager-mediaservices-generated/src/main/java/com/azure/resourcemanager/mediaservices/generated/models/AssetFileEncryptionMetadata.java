// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * The Asset File Storage encryption metadata.
 */
@Fluent
public final class AssetFileEncryptionMetadata {
    /*
     * The Asset File initialization vector.
     */
    @JsonProperty(value = "initializationVector")
    private String initializationVector;

    /*
     * The Asset File name.
     */
    @JsonProperty(value = "assetFileName")
    private String assetFileName;

    /*
     * The Asset File Id.
     */
    @JsonProperty(value = "assetFileId", required = true)
    private UUID assetFileId;

    /**
     * Creates an instance of AssetFileEncryptionMetadata class.
     */
    public AssetFileEncryptionMetadata() {
    }

    /**
     * Get the initializationVector property: The Asset File initialization vector.
     * 
     * @return the initializationVector value.
     */
    public String initializationVector() {
        return this.initializationVector;
    }

    /**
     * Set the initializationVector property: The Asset File initialization vector.
     * 
     * @param initializationVector the initializationVector value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * Get the assetFileName property: The Asset File name.
     * 
     * @return the assetFileName value.
     */
    public String assetFileName() {
        return this.assetFileName;
    }

    /**
     * Set the assetFileName property: The Asset File name.
     * 
     * @param assetFileName the assetFileName value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileName(String assetFileName) {
        this.assetFileName = assetFileName;
        return this;
    }

    /**
     * Get the assetFileId property: The Asset File Id.
     * 
     * @return the assetFileId value.
     */
    public UUID assetFileId() {
        return this.assetFileId;
    }

    /**
     * Set the assetFileId property: The Asset File Id.
     * 
     * @param assetFileId the assetFileId value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileId(UUID assetFileId) {
        this.assetFileId = assetFileId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (assetFileId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property assetFileId in model AssetFileEncryptionMetadata"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetFileEncryptionMetadata.class);
}
