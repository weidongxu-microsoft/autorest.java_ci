// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The reseller properties.
 */
@Immutable
public final class Reseller implements JsonSerializable<Reseller> {
    /*
     * The reseller property ID.
     */
    private String resellerId;

    /*
     * The reseller property description.
     */
    private String resellerDescription;

    /**
     * Creates an instance of Reseller class.
     */
    public Reseller() {
    }

    /**
     * Get the resellerId property: The reseller property ID.
     * 
     * @return the resellerId value.
     */
    public String resellerId() {
        return this.resellerId;
    }

    /**
     * Get the resellerDescription property: The reseller property description.
     * 
     * @return the resellerDescription value.
     */
    public String resellerDescription() {
        return this.resellerDescription;
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
     * Reads an instance of Reseller from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Reseller if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Reseller.
     */
    public static Reseller fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Reseller deserializedReseller = new Reseller();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resellerId".equals(fieldName)) {
                    deserializedReseller.resellerId = reader.getString();
                } else if ("resellerDescription".equals(fieldName)) {
                    deserializedReseller.resellerDescription = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReseller;
        });
    }
}
