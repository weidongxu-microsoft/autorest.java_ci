// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.DeleteRetentionPolicy;
import com.azure.resourcemanager.storage.generated.models.ProtocolSettings;
import java.io.IOException;

/**
 * The properties of File services in storage account.
 */
@Fluent
public final class FileServicePropertiesProperties implements JsonSerializable<FileServicePropertiesProperties> {
    /*
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no
     * CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for
     * the File service.
     */
    private CorsRules cors;

    /*
     * The file service properties for share soft delete.
     */
    private DeleteRetentionPolicy shareDeleteRetentionPolicy;

    /*
     * Protocol settings for file service
     */
    private ProtocolSettings protocolSettings;

    /**
     * Creates an instance of FileServicePropertiesProperties class.
     */
    public FileServicePropertiesProperties() {
    }

    /**
     * Get the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set the cors property: Specifies CORS rules for the File service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the File service.
     * 
     * @param cors the cors value to set.
     * @return the FileServicePropertiesProperties object itself.
     */
    public FileServicePropertiesProperties withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     * 
     * @return the shareDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy shareDeleteRetentionPolicy() {
        return this.shareDeleteRetentionPolicy;
    }

    /**
     * Set the shareDeleteRetentionPolicy property: The file service properties for share soft delete.
     * 
     * @param shareDeleteRetentionPolicy the shareDeleteRetentionPolicy value to set.
     * @return the FileServicePropertiesProperties object itself.
     */
    public FileServicePropertiesProperties
        withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        return this;
    }

    /**
     * Get the protocolSettings property: Protocol settings for file service.
     * 
     * @return the protocolSettings value.
     */
    public ProtocolSettings protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * Set the protocolSettings property: Protocol settings for file service.
     * 
     * @param protocolSettings the protocolSettings value to set.
     * @return the FileServicePropertiesProperties object itself.
     */
    public FileServicePropertiesProperties withProtocolSettings(ProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cors() != null) {
            cors().validate();
        }
        if (shareDeleteRetentionPolicy() != null) {
            shareDeleteRetentionPolicy().validate();
        }
        if (protocolSettings() != null) {
            protocolSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("cors", this.cors);
        jsonWriter.writeJsonField("shareDeleteRetentionPolicy", this.shareDeleteRetentionPolicy);
        jsonWriter.writeJsonField("protocolSettings", this.protocolSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileServicePropertiesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileServicePropertiesProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FileServicePropertiesProperties.
     */
    public static FileServicePropertiesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileServicePropertiesProperties deserializedFileServicePropertiesProperties
                = new FileServicePropertiesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cors".equals(fieldName)) {
                    deserializedFileServicePropertiesProperties.cors = CorsRules.fromJson(reader);
                } else if ("shareDeleteRetentionPolicy".equals(fieldName)) {
                    deserializedFileServicePropertiesProperties.shareDeleteRetentionPolicy
                        = DeleteRetentionPolicy.fromJson(reader);
                } else if ("protocolSettings".equals(fieldName)) {
                    deserializedFileServicePropertiesProperties.protocolSettings = ProtocolSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileServicePropertiesProperties;
        });
    }
}
