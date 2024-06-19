// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The QueryColumn model.
 */
@Fluent
public final class QueryColumn implements JsonSerializable<QueryColumn> {
    /*
     * The name of column.
     */
    private String name;

    /*
     * The type of column.
     */
    private String type;

    /**
     * Creates an instance of QueryColumn class.
     */
    public QueryColumn() {
    }

    /**
     * Get the name property: The name of column.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of column.
     * 
     * @param name the name value to set.
     * @return the QueryColumn object itself.
     */
    public QueryColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of column.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of column.
     * 
     * @param type the type value to set.
     * @return the QueryColumn object itself.
     */
    public QueryColumn withType(String type) {
        this.type = type;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryColumn from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryColumn if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueryColumn.
     */
    public static QueryColumn fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryColumn deserializedQueryColumn = new QueryColumn();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedQueryColumn.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedQueryColumn.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryColumn;
        });
    }
}
