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
 * StringNotEndsWith Filter.
 */
@Fluent
public final class StringNotEndsWithFilter extends Filter {
    /*
     * The set of filter values.
     */
    private List<String> values;

    /**
     * Creates an instance of StringNotEndsWithFilter class.
     */
    public StringNotEndsWithFilter() {
        this.operatorType = FilterOperatorType.STRING_NOT_ENDS_WITH;
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
     * @return the StringNotEndsWithFilter object itself.
     */
    public StringNotEndsWithFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StringNotEndsWithFilter withKey(String key) {
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
        toJsonShared(jsonWriter);
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringNotEndsWithFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringNotEndsWithFilter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StringNotEndsWithFilter.
     */
    public static StringNotEndsWithFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StringNotEndsWithFilter deserializedStringNotEndsWithFilter = new StringNotEndsWithFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedStringNotEndsWithFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedStringNotEndsWithFilter.operatorType
                        = FilterOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedStringNotEndsWithFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStringNotEndsWithFilter;
        });
    }
}
