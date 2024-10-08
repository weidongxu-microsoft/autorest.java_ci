// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Key Vault Secret Url and vault id of the encryption key.
 */
@Fluent
public final class KeyVaultAndSecretReference implements JsonSerializable<KeyVaultAndSecretReference> {
    /*
     * Resource id of the KeyVault containing the key or secret
     */
    private SourceVault sourceVault;

    /*
     * Url pointing to a key or secret in KeyVault
     */
    private String secretUrl;

    /**
     * Creates an instance of KeyVaultAndSecretReference class.
     */
    public KeyVaultAndSecretReference() {
    }

    /**
     * Get the sourceVault property: Resource id of the KeyVault containing the key or secret.
     * 
     * @return the sourceVault value.
     */
    public SourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: Resource id of the KeyVault containing the key or secret.
     * 
     * @param sourceVault the sourceVault value to set.
     * @return the KeyVaultAndSecretReference object itself.
     */
    public KeyVaultAndSecretReference withSourceVault(SourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the secretUrl property: Url pointing to a key or secret in KeyVault.
     * 
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: Url pointing to a key or secret in KeyVault.
     * 
     * @param secretUrl the secretUrl value to set.
     * @return the KeyVaultAndSecretReference object itself.
     */
    public KeyVaultAndSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceVault() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceVault in model KeyVaultAndSecretReference"));
        } else {
            sourceVault().validate();
        }
        if (secretUrl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property secretUrl in model KeyVaultAndSecretReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultAndSecretReference.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sourceVault", this.sourceVault);
        jsonWriter.writeStringField("secretUrl", this.secretUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultAndSecretReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultAndSecretReference if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyVaultAndSecretReference.
     */
    public static KeyVaultAndSecretReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultAndSecretReference deserializedKeyVaultAndSecretReference = new KeyVaultAndSecretReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceVault".equals(fieldName)) {
                    deserializedKeyVaultAndSecretReference.sourceVault = SourceVault.fromJson(reader);
                } else if ("secretUrl".equals(fieldName)) {
                    deserializedKeyVaultAndSecretReference.secretUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultAndSecretReference;
        });
    }
}
