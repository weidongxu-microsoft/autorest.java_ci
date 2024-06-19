// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DynamicDeliveryAttributeMappingProperties;
import java.io.IOException;

/**
 * Dynamic delivery attribute mapping details.
 */
@Fluent
public final class DynamicDeliveryAttributeMapping extends DeliveryAttributeMapping {
    /*
     * Type of the delivery attribute or header name.
     */
    private DeliveryAttributeMappingType type = DeliveryAttributeMappingType.DYNAMIC;

    /*
     * Properties of dynamic delivery attribute mapping.
     */
    private DynamicDeliveryAttributeMappingProperties innerProperties;

    /**
     * Creates an instance of DynamicDeliveryAttributeMapping class.
     */
    public DynamicDeliveryAttributeMapping() {
    }

    /**
     * Get the type property: Type of the delivery attribute or header name.
     * 
     * @return the type value.
     */
    @Override
    public DeliveryAttributeMappingType type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Properties of dynamic delivery attribute mapping.
     * 
     * @return the innerProperties value.
     */
    private DynamicDeliveryAttributeMappingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DynamicDeliveryAttributeMapping withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Get the sourceField property: JSON path in the event which contains attribute value.
     * 
     * @return the sourceField value.
     */
    public String sourceField() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceField();
    }

    /**
     * Set the sourceField property: JSON path in the event which contains attribute value.
     * 
     * @param sourceField the sourceField value to set.
     * @return the DynamicDeliveryAttributeMapping object itself.
     */
    public DynamicDeliveryAttributeMapping withSourceField(String sourceField) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DynamicDeliveryAttributeMappingProperties();
        }
        this.innerProperties().withSourceField(sourceField);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DynamicDeliveryAttributeMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicDeliveryAttributeMapping if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DynamicDeliveryAttributeMapping.
     */
    public static DynamicDeliveryAttributeMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DynamicDeliveryAttributeMapping deserializedDynamicDeliveryAttributeMapping
                = new DynamicDeliveryAttributeMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDynamicDeliveryAttributeMapping.withName(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedDynamicDeliveryAttributeMapping.type
                        = DeliveryAttributeMappingType.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedDynamicDeliveryAttributeMapping.innerProperties
                        = DynamicDeliveryAttributeMappingProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDynamicDeliveryAttributeMapping;
        });
    }
}
