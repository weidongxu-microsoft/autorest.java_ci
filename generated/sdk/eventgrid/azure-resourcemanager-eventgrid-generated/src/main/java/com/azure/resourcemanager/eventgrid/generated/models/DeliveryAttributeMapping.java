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
 * Delivery attribute mapping details.
 */
@Fluent
public class DeliveryAttributeMapping implements JsonSerializable<DeliveryAttributeMapping> {
    /*
     * Type of the delivery attribute or header name.
     */
    private DeliveryAttributeMappingType type = DeliveryAttributeMappingType.fromString("DeliveryAttributeMapping");

    /*
     * Name of the delivery attribute or header.
     */
    private String name;

    /**
     * Creates an instance of DeliveryAttributeMapping class.
     */
    public DeliveryAttributeMapping() {
    }

    /**
     * Get the type property: Type of the delivery attribute or header name.
     * 
     * @return the type value.
     */
    public DeliveryAttributeMappingType type() {
        return this.type;
    }

    /**
     * Get the name property: Name of the delivery attribute or header.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the delivery attribute or header.
     * 
     * @param name the name value to set.
     * @return the DeliveryAttributeMapping object itself.
     */
    public DeliveryAttributeMapping withName(String name) {
        this.name = name;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeliveryAttributeMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeliveryAttributeMapping if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeliveryAttributeMapping.
     */
    public static DeliveryAttributeMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Static".equals(discriminatorValue)) {
                    return StaticDeliveryAttributeMapping.fromJson(readerToUse.reset());
                } else if ("Dynamic".equals(discriminatorValue)) {
                    return DynamicDeliveryAttributeMapping.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static DeliveryAttributeMapping fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeliveryAttributeMapping deserializedDeliveryAttributeMapping = new DeliveryAttributeMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedDeliveryAttributeMapping.type
                        = DeliveryAttributeMappingType.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedDeliveryAttributeMapping.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeliveryAttributeMapping;
        });
    }
}
