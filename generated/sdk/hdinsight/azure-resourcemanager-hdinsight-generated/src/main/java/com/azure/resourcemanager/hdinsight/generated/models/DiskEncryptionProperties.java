// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The disk encryption properties.
 */
@Fluent
public final class DiskEncryptionProperties implements JsonSerializable<DiskEncryptionProperties> {
    /*
     * Base key vault URI where the customers key is located eg. https://myvault.vault.azure.net
     */
    private String vaultUri;

    /*
     * Key name that is used for enabling disk encryption.
     */
    private String keyName;

    /*
     * Specific key version that is used for enabling disk encryption.
     */
    private String keyVersion;

    /*
     * Algorithm identifier for encryption, default RSA-OAEP.
     */
    private JsonWebKeyEncryptionAlgorithm encryptionAlgorithm;

    /*
     * Resource ID of Managed Identity that is used to access the key vault.
     */
    private String msiResourceId;

    /*
     * Indicates whether or not resource disk encryption is enabled.
     */
    private Boolean encryptionAtHost;

    /**
     * Creates an instance of DiskEncryptionProperties class.
     */
    public DiskEncryptionProperties() {
    }

    /**
     * Get the vaultUri property: Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net.
     * 
     * @return the vaultUri value.
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri property: Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net.
     * 
     * @param vaultUri the vaultUri value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the keyName property: Key name that is used for enabling disk encryption.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Key name that is used for enabling disk encryption.
     * 
     * @param keyName the keyName value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: Specific key version that is used for enabling disk encryption.
     * 
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: Specific key version that is used for enabling disk encryption.
     * 
     * @param keyVersion the keyVersion value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the encryptionAlgorithm property: Algorithm identifier for encryption, default RSA-OAEP.
     * 
     * @return the encryptionAlgorithm value.
     */
    public JsonWebKeyEncryptionAlgorithm encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Set the encryptionAlgorithm property: Algorithm identifier for encryption, default RSA-OAEP.
     * 
     * @param encryptionAlgorithm the encryptionAlgorithm value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withEncryptionAlgorithm(JsonWebKeyEncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Get the msiResourceId property: Resource ID of Managed Identity that is used to access the key vault.
     * 
     * @return the msiResourceId value.
     */
    public String msiResourceId() {
        return this.msiResourceId;
    }

    /**
     * Set the msiResourceId property: Resource ID of Managed Identity that is used to access the key vault.
     * 
     * @param msiResourceId the msiResourceId value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withMsiResourceId(String msiResourceId) {
        this.msiResourceId = msiResourceId;
        return this;
    }

    /**
     * Get the encryptionAtHost property: Indicates whether or not resource disk encryption is enabled.
     * 
     * @return the encryptionAtHost value.
     */
    public Boolean encryptionAtHost() {
        return this.encryptionAtHost;
    }

    /**
     * Set the encryptionAtHost property: Indicates whether or not resource disk encryption is enabled.
     * 
     * @param encryptionAtHost the encryptionAtHost value to set.
     * @return the DiskEncryptionProperties object itself.
     */
    public DiskEncryptionProperties withEncryptionAtHost(Boolean encryptionAtHost) {
        this.encryptionAtHost = encryptionAtHost;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vaultUri", this.vaultUri);
        jsonWriter.writeStringField("keyName", this.keyName);
        jsonWriter.writeStringField("keyVersion", this.keyVersion);
        jsonWriter.writeStringField("encryptionAlgorithm",
            this.encryptionAlgorithm == null ? null : this.encryptionAlgorithm.toString());
        jsonWriter.writeStringField("msiResourceId", this.msiResourceId);
        jsonWriter.writeBooleanField("encryptionAtHost", this.encryptionAtHost);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskEncryptionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskEncryptionProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiskEncryptionProperties.
     */
    public static DiskEncryptionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskEncryptionProperties deserializedDiskEncryptionProperties = new DiskEncryptionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vaultUri".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.vaultUri = reader.getString();
                } else if ("keyName".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.keyName = reader.getString();
                } else if ("keyVersion".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.keyVersion = reader.getString();
                } else if ("encryptionAlgorithm".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.encryptionAlgorithm
                        = JsonWebKeyEncryptionAlgorithm.fromString(reader.getString());
                } else if ("msiResourceId".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.msiResourceId = reader.getString();
                } else if ("encryptionAtHost".equals(fieldName)) {
                    deserializedDiskEncryptionProperties.encryptionAtHost = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskEncryptionProperties;
        });
    }
}
