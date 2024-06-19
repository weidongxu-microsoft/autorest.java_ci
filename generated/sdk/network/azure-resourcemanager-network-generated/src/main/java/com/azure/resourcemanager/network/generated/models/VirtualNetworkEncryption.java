// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Indicates if encryption is enabled on virtual network and if VM without encryption is allowed in encrypted VNet.
 */
@Fluent
public final class VirtualNetworkEncryption implements JsonSerializable<VirtualNetworkEncryption> {
    /*
     * Indicates if encryption is enabled on the virtual network.
     */
    private boolean enabled;

    /*
     * If the encrypted VNet allows VM that does not support encryption
     */
    private VirtualNetworkEncryptionEnforcement enforcement;

    /**
     * Creates an instance of VirtualNetworkEncryption class.
     */
    public VirtualNetworkEncryption() {
    }

    /**
     * Get the enabled property: Indicates if encryption is enabled on the virtual network.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates if encryption is enabled on the virtual network.
     * 
     * @param enabled the enabled value to set.
     * @return the VirtualNetworkEncryption object itself.
     */
    public VirtualNetworkEncryption withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enforcement property: If the encrypted VNet allows VM that does not support encryption.
     * 
     * @return the enforcement value.
     */
    public VirtualNetworkEncryptionEnforcement enforcement() {
        return this.enforcement;
    }

    /**
     * Set the enforcement property: If the encrypted VNet allows VM that does not support encryption.
     * 
     * @param enforcement the enforcement value to set.
     * @return the VirtualNetworkEncryption object itself.
     */
    public VirtualNetworkEncryption withEnforcement(VirtualNetworkEncryptionEnforcement enforcement) {
        this.enforcement = enforcement;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("enforcement", this.enforcement == null ? null : this.enforcement.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkEncryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkEncryption if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualNetworkEncryption.
     */
    public static VirtualNetworkEncryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkEncryption deserializedVirtualNetworkEncryption = new VirtualNetworkEncryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedVirtualNetworkEncryption.enabled = reader.getBoolean();
                } else if ("enforcement".equals(fieldName)) {
                    deserializedVirtualNetworkEncryption.enforcement
                        = VirtualNetworkEncryptionEnforcement.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkEncryption;
        });
    }
}
