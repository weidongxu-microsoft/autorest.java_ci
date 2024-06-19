// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The shared keys for a workspace.
 */
@Fluent
public final class SharedKeysInner implements JsonSerializable<SharedKeysInner> {
    /*
     * The primary shared key of a workspace.
     */
    private String primarySharedKey;

    /*
     * The secondary shared key of a workspace.
     */
    private String secondarySharedKey;

    /**
     * Creates an instance of SharedKeysInner class.
     */
    public SharedKeysInner() {
    }

    /**
     * Get the primarySharedKey property: The primary shared key of a workspace.
     * 
     * @return the primarySharedKey value.
     */
    public String primarySharedKey() {
        return this.primarySharedKey;
    }

    /**
     * Set the primarySharedKey property: The primary shared key of a workspace.
     * 
     * @param primarySharedKey the primarySharedKey value to set.
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withPrimarySharedKey(String primarySharedKey) {
        this.primarySharedKey = primarySharedKey;
        return this;
    }

    /**
     * Get the secondarySharedKey property: The secondary shared key of a workspace.
     * 
     * @return the secondarySharedKey value.
     */
    public String secondarySharedKey() {
        return this.secondarySharedKey;
    }

    /**
     * Set the secondarySharedKey property: The secondary shared key of a workspace.
     * 
     * @param secondarySharedKey the secondarySharedKey value to set.
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withSecondarySharedKey(String secondarySharedKey) {
        this.secondarySharedKey = secondarySharedKey;
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
        jsonWriter.writeStringField("primarySharedKey", this.primarySharedKey);
        jsonWriter.writeStringField("secondarySharedKey", this.secondarySharedKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SharedKeysInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SharedKeysInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SharedKeysInner.
     */
    public static SharedKeysInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SharedKeysInner deserializedSharedKeysInner = new SharedKeysInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primarySharedKey".equals(fieldName)) {
                    deserializedSharedKeysInner.primarySharedKey = reader.getString();
                } else if ("secondarySharedKey".equals(fieldName)) {
                    deserializedSharedKeysInner.secondarySharedKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSharedKeysInner;
        });
    }
}
