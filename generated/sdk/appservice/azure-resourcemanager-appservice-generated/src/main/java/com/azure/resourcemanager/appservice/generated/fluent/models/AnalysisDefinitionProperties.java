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
 * AnalysisDefinition resource specific properties.
 */
@Immutable
public final class AnalysisDefinitionProperties implements JsonSerializable<AnalysisDefinitionProperties> {
    /*
     * Description of the Analysis
     */
    private String description;

    /**
     * Creates an instance of AnalysisDefinitionProperties class.
     */
    public AnalysisDefinitionProperties() {
    }

    /**
     * Get the description property: Description of the Analysis.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
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
     * Reads an instance of AnalysisDefinitionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalysisDefinitionProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnalysisDefinitionProperties.
     */
    public static AnalysisDefinitionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnalysisDefinitionProperties deserializedAnalysisDefinitionProperties = new AnalysisDefinitionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedAnalysisDefinitionProperties.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnalysisDefinitionProperties;
        });
    }
}
