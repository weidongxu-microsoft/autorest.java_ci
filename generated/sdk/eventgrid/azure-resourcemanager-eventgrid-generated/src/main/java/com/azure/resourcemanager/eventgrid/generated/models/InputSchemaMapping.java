// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * By default, Event Grid expects events to be in the Event Grid event schema. Specifying an input schema mapping
 * enables publishing to Event Grid using a custom input schema. Currently, the only supported type of
 * InputSchemaMapping is 'JsonInputSchemaMapping'.
 */
@Immutable
public class InputSchemaMapping implements JsonSerializable<InputSchemaMapping> {
    /*
     * Type of the custom mapping
     */
    private InputSchemaMappingType inputSchemaMappingType = InputSchemaMappingType.fromString("InputSchemaMapping");

    /**
     * Creates an instance of InputSchemaMapping class.
     */
    public InputSchemaMapping() {
    }

    /**
     * Get the inputSchemaMappingType property: Type of the custom mapping.
     * 
     * @return the inputSchemaMappingType value.
     */
    public InputSchemaMappingType inputSchemaMappingType() {
        return this.inputSchemaMappingType;
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
        jsonWriter.writeStringField("inputSchemaMappingType",
            this.inputSchemaMappingType == null ? null : this.inputSchemaMappingType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InputSchemaMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InputSchemaMapping if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the InputSchemaMapping.
     */
    public static InputSchemaMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("inputSchemaMappingType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Json".equals(discriminatorValue)) {
                    return JsonInputSchemaMapping.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static InputSchemaMapping fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InputSchemaMapping deserializedInputSchemaMapping = new InputSchemaMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputSchemaMappingType".equals(fieldName)) {
                    deserializedInputSchemaMapping.inputSchemaMappingType
                        = InputSchemaMappingType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInputSchemaMapping;
        });
    }
}
