// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Network security perimeter subscription inbound access rule.
 */
@Fluent
public final class NetworkSecurityPerimeterSubscription
    implements JsonSerializable<NetworkSecurityPerimeterSubscription> {
    /*
     * Subscription id.
     */
    private String id;

    /**
     * Creates an instance of NetworkSecurityPerimeterSubscription class.
     */
    public NetworkSecurityPerimeterSubscription() {
    }

    /**
     * Get the id property: Subscription id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Subscription id.
     * 
     * @param id the id value to set.
     * @return the NetworkSecurityPerimeterSubscription object itself.
     */
    public NetworkSecurityPerimeterSubscription withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityPerimeterSubscription from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeterSubscription if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeterSubscription.
     */
    public static NetworkSecurityPerimeterSubscription fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeterSubscription deserializedNetworkSecurityPerimeterSubscription
                = new NetworkSecurityPerimeterSubscription();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterSubscription.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeterSubscription;
        });
    }
}
