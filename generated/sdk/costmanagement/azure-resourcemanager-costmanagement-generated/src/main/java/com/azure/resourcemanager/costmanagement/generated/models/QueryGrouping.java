// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The group by expression to be used in the query.
 */
@Fluent
public final class QueryGrouping implements JsonSerializable<QueryGrouping> {
    /*
     * Has type of the column to group.
     */
    private QueryColumnType type;

    /*
     * The name of the column to group.
     */
    private String name;

    /**
     * Creates an instance of QueryGrouping class.
     */
    public QueryGrouping() {
    }

    /**
     * Get the type property: Has type of the column to group.
     * 
     * @return the type value.
     */
    public QueryColumnType type() {
        return this.type;
    }

    /**
     * Set the type property: Has type of the column to group.
     * 
     * @param type the type value to set.
     * @return the QueryGrouping object itself.
     */
    public QueryGrouping withType(QueryColumnType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The name of the column to group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to group.
     * 
     * @param name the name value to set.
     * @return the QueryGrouping object itself.
     */
    public QueryGrouping withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model QueryGrouping"));
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model QueryGrouping"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryGrouping.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueryGrouping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueryGrouping if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QueryGrouping.
     */
    public static QueryGrouping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueryGrouping deserializedQueryGrouping = new QueryGrouping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedQueryGrouping.type = QueryColumnType.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedQueryGrouping.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQueryGrouping;
        });
    }
}
