// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of dynamic delivery attribute mapping.
 */
@Fluent
public final class DynamicDeliveryAttributeMappingProperties
    implements JsonSerializable<DynamicDeliveryAttributeMappingProperties> {
    /*
     * JSON path in the event which contains attribute value.
     */
    private String sourceField;

    /**
     * Creates an instance of DynamicDeliveryAttributeMappingProperties class.
     */
    public DynamicDeliveryAttributeMappingProperties() {
    }

    /**
     * Get the sourceField property: JSON path in the event which contains attribute value.
     * 
     * @return the sourceField value.
     */
    public String sourceField() {
        return this.sourceField;
    }

    /**
     * Set the sourceField property: JSON path in the event which contains attribute value.
     * 
     * @param sourceField the sourceField value to set.
     * @return the DynamicDeliveryAttributeMappingProperties object itself.
     */
    public DynamicDeliveryAttributeMappingProperties withSourceField(String sourceField) {
        this.sourceField = sourceField;
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
        jsonWriter.writeStringField("sourceField", this.sourceField);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DynamicDeliveryAttributeMappingProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicDeliveryAttributeMappingProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DynamicDeliveryAttributeMappingProperties.
     */
    public static DynamicDeliveryAttributeMappingProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DynamicDeliveryAttributeMappingProperties deserializedDynamicDeliveryAttributeMappingProperties
                = new DynamicDeliveryAttributeMappingProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceField".equals(fieldName)) {
                    deserializedDynamicDeliveryAttributeMappingProperties.sourceField = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDynamicDeliveryAttributeMappingProperties;
        });
    }
}
