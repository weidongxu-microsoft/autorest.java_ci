// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Name value pair.
 */
@Fluent
public final class NameValuePair implements JsonSerializable<NameValuePair> {
    /*
     * Pair name.
     */
    private String name;

    /*
     * Pair value.
     */
    private String value;

    /**
     * Creates an instance of NameValuePair class.
     */
    public NameValuePair() {
    }

    /**
     * Get the name property: Pair name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Pair name.
     * 
     * @param name the name value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Pair value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Pair value.
     * 
     * @param value the value value to set.
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NameValuePair from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NameValuePair if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NameValuePair.
     */
    public static NameValuePair fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NameValuePair deserializedNameValuePair = new NameValuePair();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNameValuePair.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedNameValuePair.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNameValuePair;
        });
    }
}
