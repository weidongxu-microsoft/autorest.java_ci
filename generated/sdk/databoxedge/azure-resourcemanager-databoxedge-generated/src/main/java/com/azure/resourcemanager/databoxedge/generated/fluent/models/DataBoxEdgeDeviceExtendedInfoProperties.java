// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.generated.models.KeyVaultSyncStatus;
import com.azure.resourcemanager.databoxedge.generated.models.Secret;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The properties of the Data Box Edge/Gateway device extended info. */
@Fluent
public final class DataBoxEdgeDeviceExtendedInfoProperties {
    /*
     * The digital signature of encrypted certificate.
     */
    @JsonProperty(value = "encryptionKeyThumbprint")
    private String encryptionKeyThumbprint;

    /*
     * The public part of the encryption certificate. Client uses this to
     * encrypt any secret.
     */
    @JsonProperty(value = "encryptionKey")
    private String encryptionKey;

    /*
     * The Resource ID of the Resource.
     */
    @JsonProperty(value = "resourceKey", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceKey;

    /*
     * The Key Vault ARM Id for client secrets
     */
    @JsonProperty(value = "clientSecretStoreId")
    private String clientSecretStoreId;

    /*
     * The url to access the Client Key Vault
     */
    @JsonProperty(value = "clientSecretStoreUrl")
    private String clientSecretStoreUrl;

    /*
     * The name of Channel Integrity Key stored in the Client Key Vault
     */
    @JsonProperty(value = "channelIntegrityKeyName")
    private String channelIntegrityKeyName;

    /*
     * The version of Channel Integrity Key stored in the Client Key Vault
     */
    @JsonProperty(value = "channelIntegrityKeyVersion")
    private String channelIntegrityKeyVersion;

    /*
     * Key vault sync status
     */
    @JsonProperty(value = "keyVaultSyncStatus")
    private KeyVaultSyncStatus keyVaultSyncStatus;

    /*
     * Device secrets, will be returned only with ODataFilter
     * $expand=deviceSecrets
     */
    @JsonProperty(value = "deviceSecrets", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Secret> deviceSecrets;

    /**
     * Get the encryptionKeyThumbprint property: The digital signature of encrypted certificate.
     *
     * @return the encryptionKeyThumbprint value.
     */
    public String encryptionKeyThumbprint() {
        return this.encryptionKeyThumbprint;
    }

    /**
     * Set the encryptionKeyThumbprint property: The digital signature of encrypted certificate.
     *
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        return this;
    }

    /**
     * Get the encryptionKey property: The public part of the encryption certificate. Client uses this to encrypt any
     * secret.
     *
     * @return the encryptionKey value.
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set the encryptionKey property: The public part of the encryption certificate. Client uses this to encrypt any
     * secret.
     *
     * @param encryptionKey the encryptionKey value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get the resourceKey property: The Resource ID of the Resource.
     *
     * @return the resourceKey value.
     */
    public String resourceKey() {
        return this.resourceKey;
    }

    /**
     * Get the clientSecretStoreId property: The Key Vault ARM Id for client secrets.
     *
     * @return the clientSecretStoreId value.
     */
    public String clientSecretStoreId() {
        return this.clientSecretStoreId;
    }

    /**
     * Set the clientSecretStoreId property: The Key Vault ARM Id for client secrets.
     *
     * @param clientSecretStoreId the clientSecretStoreId value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withClientSecretStoreId(String clientSecretStoreId) {
        this.clientSecretStoreId = clientSecretStoreId;
        return this;
    }

    /**
     * Get the clientSecretStoreUrl property: The url to access the Client Key Vault.
     *
     * @return the clientSecretStoreUrl value.
     */
    public String clientSecretStoreUrl() {
        return this.clientSecretStoreUrl;
    }

    /**
     * Set the clientSecretStoreUrl property: The url to access the Client Key Vault.
     *
     * @param clientSecretStoreUrl the clientSecretStoreUrl value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withClientSecretStoreUrl(String clientSecretStoreUrl) {
        this.clientSecretStoreUrl = clientSecretStoreUrl;
        return this;
    }

    /**
     * Get the channelIntegrityKeyName property: The name of Channel Integrity Key stored in the Client Key Vault.
     *
     * @return the channelIntegrityKeyName value.
     */
    public String channelIntegrityKeyName() {
        return this.channelIntegrityKeyName;
    }

    /**
     * Set the channelIntegrityKeyName property: The name of Channel Integrity Key stored in the Client Key Vault.
     *
     * @param channelIntegrityKeyName the channelIntegrityKeyName value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withChannelIntegrityKeyName(String channelIntegrityKeyName) {
        this.channelIntegrityKeyName = channelIntegrityKeyName;
        return this;
    }

    /**
     * Get the channelIntegrityKeyVersion property: The version of Channel Integrity Key stored in the Client Key Vault.
     *
     * @return the channelIntegrityKeyVersion value.
     */
    public String channelIntegrityKeyVersion() {
        return this.channelIntegrityKeyVersion;
    }

    /**
     * Set the channelIntegrityKeyVersion property: The version of Channel Integrity Key stored in the Client Key Vault.
     *
     * @param channelIntegrityKeyVersion the channelIntegrityKeyVersion value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withChannelIntegrityKeyVersion(String channelIntegrityKeyVersion) {
        this.channelIntegrityKeyVersion = channelIntegrityKeyVersion;
        return this;
    }

    /**
     * Get the keyVaultSyncStatus property: Key vault sync status.
     *
     * @return the keyVaultSyncStatus value.
     */
    public KeyVaultSyncStatus keyVaultSyncStatus() {
        return this.keyVaultSyncStatus;
    }

    /**
     * Set the keyVaultSyncStatus property: Key vault sync status.
     *
     * @param keyVaultSyncStatus the keyVaultSyncStatus value to set.
     * @return the DataBoxEdgeDeviceExtendedInfoProperties object itself.
     */
    public DataBoxEdgeDeviceExtendedInfoProperties withKeyVaultSyncStatus(KeyVaultSyncStatus keyVaultSyncStatus) {
        this.keyVaultSyncStatus = keyVaultSyncStatus;
        return this;
    }

    /**
     * Get the deviceSecrets property: Device secrets, will be returned only with ODataFilter $expand=deviceSecrets.
     *
     * @return the deviceSecrets value.
     */
    public Map<String, Secret> deviceSecrets() {
        return this.deviceSecrets;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceSecrets() != null) {
            deviceSecrets()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
