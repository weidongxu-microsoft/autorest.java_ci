// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.generated.models.KeyForDiskEncryptionSet;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The EncryptionSetProperties model.
 */
@Fluent
public final class EncryptionSetProperties implements JsonSerializable<EncryptionSetProperties> {
    /*
     * The type of key used to encrypt the data of the disk.
     */
    private DiskEncryptionSetType encryptionType;

    /*
     * The key vault key which is currently used by this disk encryption set.
     */
    private KeyForDiskEncryptionSet activeKey;

    /*
     * A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in
     * progress. It will be empty if there is no ongoing key rotation.
     */
    private List<KeyForDiskEncryptionSet> previousKeys;

    /*
     * The disk encryption set provisioning state.
     */
    private String provisioningState;

    /*
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     */
    private Boolean rotationToLatestKeyVersionEnabled;

    /*
     * The time when the active key of this disk encryption set was updated.
     */
    private OffsetDateTime lastKeyRotationTimestamp;

    /*
     * The error that was encountered during auto-key rotation. If an error is present, then auto-key rotation will not
     * be attempted until the error on this disk encryption set is fixed.
     */
    private ApiError autoKeyRotationError;

    /*
     * Multi-tenant application client id to access key vault in a different tenant. Setting the value to 'None' will
     * clear the property.
     */
    private String federatedClientId;

    /**
     * Creates an instance of EncryptionSetProperties class.
     */
    public EncryptionSetProperties() {
    }

    /**
     * Get the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @return the encryptionType value.
     */
    public DiskEncryptionSetType encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @param encryptionType the encryptionType value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withEncryptionType(DiskEncryptionSetType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Get the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @return the activeKey value.
     */
    public KeyForDiskEncryptionSet activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @param activeKey the activeKey value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withActiveKey(KeyForDiskEncryptionSet activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Get the previousKeys property: A readonly collection of key vault keys previously used by this disk encryption
     * set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     * @return the previousKeys value.
     */
    public List<KeyForDiskEncryptionSet> previousKeys() {
        return this.previousKeys;
    }

    /**
     * Get the provisioningState property: The disk encryption set provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @return the rotationToLatestKeyVersionEnabled value.
     */
    public Boolean rotationToLatestKeyVersionEnabled() {
        return this.rotationToLatestKeyVersionEnabled;
    }

    /**
     * Set the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @param rotationToLatestKeyVersionEnabled the rotationToLatestKeyVersionEnabled value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withRotationToLatestKeyVersionEnabled(Boolean rotationToLatestKeyVersionEnabled) {
        this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
        return this;
    }

    /**
     * Get the lastKeyRotationTimestamp property: The time when the active key of this disk encryption set was updated.
     * 
     * @return the lastKeyRotationTimestamp value.
     */
    public OffsetDateTime lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    /**
     * Get the autoKeyRotationError property: The error that was encountered during auto-key rotation. If an error is
     * present, then auto-key rotation will not be attempted until the error on this disk encryption set is fixed.
     * 
     * @return the autoKeyRotationError value.
     */
    public ApiError autoKeyRotationError() {
        return this.autoKeyRotationError;
    }

    /**
     * Get the federatedClientId property: Multi-tenant application client id to access key vault in a different tenant.
     * Setting the value to 'None' will clear the property.
     * 
     * @return the federatedClientId value.
     */
    public String federatedClientId() {
        return this.federatedClientId;
    }

    /**
     * Set the federatedClientId property: Multi-tenant application client id to access key vault in a different tenant.
     * Setting the value to 'None' will clear the property.
     * 
     * @param federatedClientId the federatedClientId value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withFederatedClientId(String federatedClientId) {
        this.federatedClientId = federatedClientId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeKey() != null) {
            activeKey().validate();
        }
        if (previousKeys() != null) {
            previousKeys().forEach(e -> e.validate());
        }
        if (autoKeyRotationError() != null) {
            autoKeyRotationError().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("encryptionType",
            this.encryptionType == null ? null : this.encryptionType.toString());
        jsonWriter.writeJsonField("activeKey", this.activeKey);
        jsonWriter.writeBooleanField("rotationToLatestKeyVersionEnabled", this.rotationToLatestKeyVersionEnabled);
        jsonWriter.writeStringField("federatedClientId", this.federatedClientId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionSetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionSetProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionSetProperties.
     */
    public static EncryptionSetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionSetProperties deserializedEncryptionSetProperties = new EncryptionSetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("encryptionType".equals(fieldName)) {
                    deserializedEncryptionSetProperties.encryptionType
                        = DiskEncryptionSetType.fromString(reader.getString());
                } else if ("activeKey".equals(fieldName)) {
                    deserializedEncryptionSetProperties.activeKey = KeyForDiskEncryptionSet.fromJson(reader);
                } else if ("previousKeys".equals(fieldName)) {
                    List<KeyForDiskEncryptionSet> previousKeys
                        = reader.readArray(reader1 -> KeyForDiskEncryptionSet.fromJson(reader1));
                    deserializedEncryptionSetProperties.previousKeys = previousKeys;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedEncryptionSetProperties.provisioningState = reader.getString();
                } else if ("rotationToLatestKeyVersionEnabled".equals(fieldName)) {
                    deserializedEncryptionSetProperties.rotationToLatestKeyVersionEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("lastKeyRotationTimestamp".equals(fieldName)) {
                    deserializedEncryptionSetProperties.lastKeyRotationTimestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("autoKeyRotationError".equals(fieldName)) {
                    deserializedEncryptionSetProperties.autoKeyRotationError = ApiError.fromJson(reader);
                } else if ("federatedClientId".equals(fieldName)) {
                    deserializedEncryptionSetProperties.federatedClientId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionSetProperties;
        });
    }
}
