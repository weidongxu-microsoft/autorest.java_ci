// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The properties of an enrichment that your IoT hub applies to messages delivered to endpoints.
 */
@Fluent
public final class EnrichmentProperties implements JsonSerializable<EnrichmentProperties> {
    /*
     * The key or name for the enrichment property.
     */
    private String key;

    /*
     * The value for the enrichment property.
     */
    private String value;

    /*
     * The list of endpoints for which the enrichment is applied to the message.
     */
    private List<String> endpointNames;

    /**
     * Creates an instance of EnrichmentProperties class.
     */
    public EnrichmentProperties() {
    }

    /**
     * Get the key property: The key or name for the enrichment property.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The key or name for the enrichment property.
     * 
     * @param key the key value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value for the enrichment property.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value for the enrichment property.
     * 
     * @param value the value value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the endpointNames property: The list of endpoints for which the enrichment is applied to the message.
     * 
     * @return the endpointNames value.
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the endpointNames property: The list of endpoints for which the enrichment is applied to the message.
     * 
     * @param endpointNames the endpointNames value to set.
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property key in model EnrichmentProperties"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model EnrichmentProperties"));
        }
        if (endpointNames() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpointNames in model EnrichmentProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnrichmentProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeArrayField("endpointNames", this.endpointNames,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnrichmentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnrichmentProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EnrichmentProperties.
     */
    public static EnrichmentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnrichmentProperties deserializedEnrichmentProperties = new EnrichmentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedEnrichmentProperties.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedEnrichmentProperties.value = reader.getString();
                } else if ("endpointNames".equals(fieldName)) {
                    List<String> endpointNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedEnrichmentProperties.endpointNames = endpointNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnrichmentProperties;
        });
    }
}
