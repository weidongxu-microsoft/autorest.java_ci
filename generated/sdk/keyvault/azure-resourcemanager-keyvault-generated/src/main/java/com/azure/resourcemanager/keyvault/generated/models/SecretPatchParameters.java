// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters for patching a secret.
 */
@Fluent
public final class SecretPatchParameters implements JsonSerializable<SecretPatchParameters> {
    /*
     * The tags that will be assigned to the secret.
     */
    private Map<String, String> tags;

    /*
     * Properties of the secret
     */
    private SecretPatchProperties properties;

    /**
     * Creates an instance of SecretPatchParameters class.
     */
    public SecretPatchParameters() {
    }

    /**
     * Get the tags property: The tags that will be assigned to the secret.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the secret.
     * 
     * @param tags the tags value to set.
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the secret.
     * 
     * @return the properties value.
     */
    public SecretPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the secret.
     * 
     * @param properties the properties value to set.
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withProperties(SecretPatchProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretPatchParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretPatchParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretPatchParameters.
     */
    public static SecretPatchParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretPatchParameters deserializedSecretPatchParameters = new SecretPatchParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSecretPatchParameters.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedSecretPatchParameters.properties = SecretPatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretPatchParameters;
        });
    }
}
