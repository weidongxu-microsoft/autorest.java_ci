// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * HybridConnectionLimits resource specific properties.
 */
@Immutable
public final class HybridConnectionLimitsProperties implements JsonSerializable<HybridConnectionLimitsProperties> {
    /*
     * The current number of Hybrid Connections.
     */
    private Integer current;

    /*
     * The maximum number of Hybrid Connections allowed.
     */
    private Integer maximum;

    /**
     * Creates an instance of HybridConnectionLimitsProperties class.
     */
    public HybridConnectionLimitsProperties() {
    }

    /**
     * Get the current property: The current number of Hybrid Connections.
     * 
     * @return the current value.
     */
    public Integer current() {
        return this.current;
    }

    /**
     * Get the maximum property: The maximum number of Hybrid Connections allowed.
     * 
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
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
     * Reads an instance of HybridConnectionLimitsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridConnectionLimitsProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HybridConnectionLimitsProperties.
     */
    public static HybridConnectionLimitsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridConnectionLimitsProperties deserializedHybridConnectionLimitsProperties
                = new HybridConnectionLimitsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("current".equals(fieldName)) {
                    deserializedHybridConnectionLimitsProperties.current = reader.getNullable(JsonReader::getInt);
                } else if ("maximum".equals(fieldName)) {
                    deserializedHybridConnectionLimitsProperties.maximum = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridConnectionLimitsProperties;
        });
    }
}
