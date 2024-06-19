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
 * IsNotNull Filter.
 */
@Fluent
public final class IsNotNullFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    private FilterOperatorType operatorType = FilterOperatorType.IS_NOT_NULL;

    /**
     * Creates an instance of IsNotNullFilter class.
     */
    public IsNotNullFilter() {
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
     * {@inheritDoc}
     */
    @Override
    public IsNotNullFilter withKey(String key) {
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IsNotNullFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IsNotNullFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IsNotNullFilter.
     */
    public static IsNotNullFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IsNotNullFilter deserializedIsNotNullFilter = new IsNotNullFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("key".equals(fieldName)) {
                    deserializedIsNotNullFilter.withKey(reader.getString());
                } else if ("operatorType".equals(fieldName)) {
                    deserializedIsNotNullFilter.operatorType = FilterOperatorType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIsNotNullFilter;
        });
    }
}
