// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The related metadata items for the function.
 */
@Fluent
public final class LogAnalyticsQueryPackQuerySearchPropertiesRelated
    implements JsonSerializable<LogAnalyticsQueryPackQuerySearchPropertiesRelated> {
    /*
     * The related categories for the function.
     */
    private List<String> categories;

    /*
     * The related resource types for the function.
     */
    private List<String> resourceTypes;

    /*
     * The related Log Analytics solutions for the function.
     */
    private List<String> solutions;

    /**
     * Creates an instance of LogAnalyticsQueryPackQuerySearchPropertiesRelated class.
     */
    public LogAnalyticsQueryPackQuerySearchPropertiesRelated() {
    }

    /**
     * Get the categories property: The related categories for the function.
     * 
     * @return the categories value.
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: The related categories for the function.
     * 
     * @param categories the categories value to set.
     * @return the LogAnalyticsQueryPackQuerySearchPropertiesRelated object itself.
     */
    public LogAnalyticsQueryPackQuerySearchPropertiesRelated withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the resourceTypes property: The related resource types for the function.
     * 
     * @return the resourceTypes value.
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The related resource types for the function.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the LogAnalyticsQueryPackQuerySearchPropertiesRelated object itself.
     */
    public LogAnalyticsQueryPackQuerySearchPropertiesRelated withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the solutions property: The related Log Analytics solutions for the function.
     * 
     * @return the solutions value.
     */
    public List<String> solutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: The related Log Analytics solutions for the function.
     * 
     * @param solutions the solutions value to set.
     * @return the LogAnalyticsQueryPackQuerySearchPropertiesRelated object itself.
     */
    public LogAnalyticsQueryPackQuerySearchPropertiesRelated withSolutions(List<String> solutions) {
        this.solutions = solutions;
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
        jsonWriter.writeArrayField("categories", this.categories, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("resourceTypes", this.resourceTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("solutions", this.solutions, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogAnalyticsQueryPackQuerySearchPropertiesRelated from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogAnalyticsQueryPackQuerySearchPropertiesRelated if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LogAnalyticsQueryPackQuerySearchPropertiesRelated.
     */
    public static LogAnalyticsQueryPackQuerySearchPropertiesRelated fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogAnalyticsQueryPackQuerySearchPropertiesRelated deserializedLogAnalyticsQueryPackQuerySearchPropertiesRelated
                = new LogAnalyticsQueryPackQuerySearchPropertiesRelated();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("categories".equals(fieldName)) {
                    List<String> categories = reader.readArray(reader1 -> reader1.getString());
                    deserializedLogAnalyticsQueryPackQuerySearchPropertiesRelated.categories = categories;
                } else if ("resourceTypes".equals(fieldName)) {
                    List<String> resourceTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedLogAnalyticsQueryPackQuerySearchPropertiesRelated.resourceTypes = resourceTypes;
                } else if ("solutions".equals(fieldName)) {
                    List<String> solutions = reader.readArray(reader1 -> reader1.getString());
                    deserializedLogAnalyticsQueryPackQuerySearchPropertiesRelated.solutions = solutions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogAnalyticsQueryPackQuerySearchPropertiesRelated;
        });
    }
}
