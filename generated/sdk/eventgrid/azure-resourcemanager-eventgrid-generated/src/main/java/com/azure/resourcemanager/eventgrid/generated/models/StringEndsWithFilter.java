// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * StringEndsWith Filter.
 */
@Fluent
public final class StringEndsWithFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.STRING_ENDS_WITH;

    /*
     * The set of filter values.
     */
    private List<String> values;

    /**
     * Creates an instance of StringEndsWithFilter class.
     */
    public StringEndsWithFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public FilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the values property: The set of filter values.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the StringEndsWithFilter object itself.
     */
    public StringEndsWithFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringEndsWithFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", key());
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringEndsWithFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringEndsWithFilter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StringEndsWithFilter.
     */
    public static StringEndsWithFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StringEndsWithFilter deserializedStringEndsWithFilter = new StringEndsWithFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedStringEndsWithFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedStringEndsWithFilter.operatorType = FilterOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedStringEndsWithFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStringEndsWithFilter;
        });
    }
}
