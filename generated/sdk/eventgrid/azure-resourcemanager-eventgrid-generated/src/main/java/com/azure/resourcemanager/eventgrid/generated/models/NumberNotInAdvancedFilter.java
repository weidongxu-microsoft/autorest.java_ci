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
 * NumberNotIn Advanced Filter.
 */
@Fluent
public final class NumberNotInAdvancedFilter extends AdvancedFilter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private AdvancedFilterOperatorType operatorType = AdvancedFilterOperatorType.NUMBER_NOT_IN;

    /*
     * The set of filter values.
     */
    private List<Double> values;

    /**
     * Creates an instance of NumberNotInAdvancedFilter class.
     */
    public NumberNotInAdvancedFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public AdvancedFilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the values property: The set of filter values.
     * 
     * @return the values value.
     */
    public List<Double> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the NumberNotInAdvancedFilter object itself.
     */
    public NumberNotInAdvancedFilter withValues(List<Double> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NumberNotInAdvancedFilter withKey(String key) {
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
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeDouble(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NumberNotInAdvancedFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NumberNotInAdvancedFilter if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NumberNotInAdvancedFilter.
     */
    public static NumberNotInAdvancedFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NumberNotInAdvancedFilter deserializedNumberNotInAdvancedFilter = new NumberNotInAdvancedFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedNumberNotInAdvancedFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedNumberNotInAdvancedFilter.operatorType
                        = AdvancedFilterOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<Double> values = reader.readArray(reader1 -> reader1.getDouble());
                    deserializedNumberNotInAdvancedFilter.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNumberNotInAdvancedFilter;
        });
    }
}
