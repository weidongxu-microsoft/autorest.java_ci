// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A metric dimension.
 */
@Immutable
public final class MetricDimension implements JsonSerializable<MetricDimension> {
    /*
     * The metric dimension name.
     */
    private String name;

    /*
     * The display name for the dimension.
     */
    private String displayName;

    /*
     * Whether to export metric to shoebox.
     */
    private Boolean toBeExportedForShoebox;

    /**
     * Creates an instance of MetricDimension class.
     */
    public MetricDimension() {
    }

    /**
     * Get the name property: The metric dimension name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the displayName property: The display name for the dimension.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the toBeExportedForShoebox property: Whether to export metric to shoebox.
     * 
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
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
     * Reads an instance of MetricDimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricDimension if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricDimension.
     */
    public static MetricDimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricDimension deserializedMetricDimension = new MetricDimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMetricDimension.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedMetricDimension.displayName = reader.getString();
                } else if ("toBeExportedForShoebox".equals(fieldName)) {
                    deserializedMetricDimension.toBeExportedForShoebox = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricDimension;
        });
    }
}
