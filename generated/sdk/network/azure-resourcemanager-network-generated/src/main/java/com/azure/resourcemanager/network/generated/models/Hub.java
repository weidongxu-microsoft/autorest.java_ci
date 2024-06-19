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
 * Hub Item.
 */
@Fluent
public final class Hub implements JsonSerializable<Hub> {
    /*
     * Resource Id.
     */
    private String resourceId;

    /*
     * Resource Type.
     */
    private String resourceType;

    /**
     * Creates an instance of Hub class.
     */
    public Hub() {
    }

    /**
     * Get the resourceId property: Resource Id.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id.
     * 
     * @param resourceId the resourceId value to set.
     * @return the Hub object itself.
     */
    public Hub withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: Resource Type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the Hub object itself.
     */
    public Hub withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Hub from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Hub if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Hub.
     */
    public static Hub fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Hub deserializedHub = new Hub();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedHub.resourceId = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedHub.resourceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHub;
        });
    }
}
