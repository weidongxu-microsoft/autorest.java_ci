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
 * NumberInRange Filter.
 */
@Fluent
public final class NumberInRangeFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.NUMBER_IN_RANGE;

    /*
     * The set of filter values.
     */
    private List<List<Double>> values;

    /**
     * Creates an instance of NumberInRangeFilter class.
     */
    public NumberInRangeFilter() {
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
    public List<List<Double>> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the NumberInRangeFilter object itself.
     */
    public NumberInRangeFilter withValues(List<List<Double>> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NumberInRangeFilter withKey(String key) {
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
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", key());
        jsonWriter.writeStringField("operatorType", this.operatorType == null ? null : this.operatorType.toString());
        jsonWriter.writeArrayField("values", this.values,
            (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeDouble(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NumberInRangeFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NumberInRangeFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NumberInRangeFilter.
     */
    public static NumberInRangeFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NumberInRangeFilter deserializedNumberInRangeFilter = new NumberInRangeFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedNumberInRangeFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedNumberInRangeFilter.operatorType = FilterOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<List<Double>> values
                        = reader.readArray(reader1 -> reader1.readArray(reader2 -> reader2.getDouble()));
                    deserializedNumberInRangeFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNumberInRangeFilter;
        });
    }
}
