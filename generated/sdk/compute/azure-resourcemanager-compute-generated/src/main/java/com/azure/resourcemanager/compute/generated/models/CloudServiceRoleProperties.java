// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The cloud service role properties.
 */
@Immutable
public final class CloudServiceRoleProperties implements JsonSerializable<CloudServiceRoleProperties> {
    /*
     * Specifies the ID which uniquely identifies a cloud service role.
     */
    private String uniqueId;

    /**
     * Creates an instance of CloudServiceRoleProperties class.
     */
    public CloudServiceRoleProperties() {
    }

    /**
     * Get the uniqueId property: Specifies the ID which uniquely identifies a cloud service role.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudServiceRoleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudServiceRoleProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudServiceRoleProperties.
     */
    public static CloudServiceRoleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudServiceRoleProperties deserializedCloudServiceRoleProperties = new CloudServiceRoleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uniqueId".equals(fieldName)) {
                    deserializedCloudServiceRoleProperties.uniqueId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudServiceRoleProperties;
        });
    }
}
