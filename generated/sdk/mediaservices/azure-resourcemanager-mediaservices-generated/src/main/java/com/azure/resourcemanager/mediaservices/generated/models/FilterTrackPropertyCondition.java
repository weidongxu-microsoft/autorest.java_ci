// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The class to specify one track property condition.
 */
@Fluent
public final class FilterTrackPropertyCondition implements JsonSerializable<FilterTrackPropertyCondition> {
    /*
     * The track property type.
     */
    private FilterTrackPropertyType property;

    /*
     * The track property value.
     */
    private String value;

    /*
     * The track property condition operation.
     */
    private FilterTrackPropertyCompareOperation operation;

    /**
     * Creates an instance of FilterTrackPropertyCondition class.
     */
    public FilterTrackPropertyCondition() {
    }

    /**
     * Get the property property: The track property type.
     * 
     * @return the property value.
     */
    public FilterTrackPropertyType property() {
        return this.property;
    }

    /**
     * Set the property property: The track property type.
     * 
     * @param property the property value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withProperty(FilterTrackPropertyType property) {
        this.property = property;
        return this;
    }

    /**
     * Get the value property: The track property value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The track property value.
     * 
     * @param value the value value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the operation property: The track property condition operation.
     * 
     * @return the operation value.
     */
    public FilterTrackPropertyCompareOperation operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The track property condition operation.
     * 
     * @param operation the operation value to set.
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withOperation(FilterTrackPropertyCompareOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (property() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property property in model FilterTrackPropertyCondition"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model FilterTrackPropertyCondition"));
        }
        if (operation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operation in model FilterTrackPropertyCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilterTrackPropertyCondition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("property", this.property == null ? null : this.property.toString());
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("operation", this.operation == null ? null : this.operation.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FilterTrackPropertyCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FilterTrackPropertyCondition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FilterTrackPropertyCondition.
     */
    public static FilterTrackPropertyCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FilterTrackPropertyCondition deserializedFilterTrackPropertyCondition = new FilterTrackPropertyCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    deserializedFilterTrackPropertyCondition.property
                        = FilterTrackPropertyType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedFilterTrackPropertyCondition.value = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    deserializedFilterTrackPropertyCondition.operation
                        = FilterTrackPropertyCompareOperation.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFilterTrackPropertyCondition;
        });
    }
}
