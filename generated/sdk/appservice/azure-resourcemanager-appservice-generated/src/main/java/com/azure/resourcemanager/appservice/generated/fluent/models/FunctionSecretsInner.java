// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Function secrets.
 */
@Fluent
public final class FunctionSecretsInner implements JsonSerializable<FunctionSecretsInner> {
    /*
     * Secret key.
     */
    private String key;

    /*
     * Trigger URL.
     */
    private String triggerUrl;

    /**
     * Creates an instance of FunctionSecretsInner class.
     */
    public FunctionSecretsInner() {
    }

    /**
     * Get the key property: Secret key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Secret key.
     * 
     * @param key the key value to set.
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the triggerUrl property: Trigger URL.
     * 
     * @return the triggerUrl value.
     */
    public String triggerUrl() {
        return this.triggerUrl;
    }

    /**
     * Set the triggerUrl property: Trigger URL.
     * 
     * @param triggerUrl the triggerUrl value to set.
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
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
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("trigger_url", this.triggerUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionSecretsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionSecretsInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FunctionSecretsInner.
     */
    public static FunctionSecretsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionSecretsInner deserializedFunctionSecretsInner = new FunctionSecretsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedFunctionSecretsInner.key = reader.getString();
                } else if ("trigger_url".equals(fieldName)) {
                    deserializedFunctionSecretsInner.triggerUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFunctionSecretsInner;
        });
    }
}
