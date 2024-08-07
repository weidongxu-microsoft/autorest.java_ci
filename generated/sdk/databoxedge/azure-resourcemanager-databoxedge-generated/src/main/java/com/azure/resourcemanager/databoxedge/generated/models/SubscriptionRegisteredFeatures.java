// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SubscriptionRegisteredFeatures model.
 */
@Fluent
public final class SubscriptionRegisteredFeatures implements JsonSerializable<SubscriptionRegisteredFeatures> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The state property.
     */
    private String state;

    /**
     * Creates an instance of SubscriptionRegisteredFeatures class.
     */
    public SubscriptionRegisteredFeatures() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the SubscriptionRegisteredFeatures object itself.
     */
    public SubscriptionRegisteredFeatures withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the state property: The state property.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     * 
     * @param state the state value to set.
     * @return the SubscriptionRegisteredFeatures object itself.
     */
    public SubscriptionRegisteredFeatures withState(String state) {
        this.state = state;
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
        jsonWriter.writeStringField("state", this.state);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubscriptionRegisteredFeatures from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubscriptionRegisteredFeatures if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubscriptionRegisteredFeatures.
     */
    public static SubscriptionRegisteredFeatures fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubscriptionRegisteredFeatures deserializedSubscriptionRegisteredFeatures
                = new SubscriptionRegisteredFeatures();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSubscriptionRegisteredFeatures.name = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedSubscriptionRegisteredFeatures.state = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubscriptionRegisteredFeatures;
        });
    }
}
