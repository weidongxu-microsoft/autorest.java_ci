// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BoolEquals Filter.
 */
@Fluent
public final class BoolEqualsFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.BOOL_EQUALS;

    /*
     * The boolean filter value.
     */
    private Boolean value;

    /**
     * Creates an instance of BoolEqualsFilter class.
     */
    public BoolEqualsFilter() {
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
     * Get the value property: The boolean filter value.
     * 
     * @return the value value.
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value property: The boolean filter value.
     * 
     * @param value the value value to set.
     * @return the BoolEqualsFilter object itself.
     */
    public BoolEqualsFilter withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoolEqualsFilter withKey(String key) {
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
        jsonWriter.writeBooleanField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BoolEqualsFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BoolEqualsFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BoolEqualsFilter.
     */
    public static BoolEqualsFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BoolEqualsFilter deserializedBoolEqualsFilter = new BoolEqualsFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedBoolEqualsFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedBoolEqualsFilter.operatorType = FilterOperatorType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedBoolEqualsFilter.value = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBoolEqualsFilter;
        });
    }
}
