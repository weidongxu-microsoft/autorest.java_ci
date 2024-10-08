// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceMetricDefinitionInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection of metric definitions.
 */
@Fluent
public final class ResourceMetricDefinitionCollection implements JsonSerializable<ResourceMetricDefinitionCollection> {
    /*
     * Collection of resources.
     */
    private List<ResourceMetricDefinitionInner> value;

    /*
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Creates an instance of ResourceMetricDefinitionCollection class.
     */
    public ResourceMetricDefinitionCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     * 
     * @return the value value.
     */
    public List<ResourceMetricDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     * 
     * @param value the value value to set.
     * @return the ResourceMetricDefinitionCollection object itself.
     */
    public ResourceMetricDefinitionCollection withValue(List<ResourceMetricDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ResourceMetricDefinitionCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceMetricDefinitionCollection.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceMetricDefinitionCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceMetricDefinitionCollection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceMetricDefinitionCollection.
     */
    public static ResourceMetricDefinitionCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceMetricDefinitionCollection deserializedResourceMetricDefinitionCollection
                = new ResourceMetricDefinitionCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ResourceMetricDefinitionInner> value
                        = reader.readArray(reader1 -> ResourceMetricDefinitionInner.fromJson(reader1));
                    deserializedResourceMetricDefinitionCollection.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedResourceMetricDefinitionCollection.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceMetricDefinitionCollection;
        });
    }
}
