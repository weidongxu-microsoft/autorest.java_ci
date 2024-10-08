// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.AvailableDelegationInner;
import java.io.IOException;
import java.util.List;

/**
 * An array of available delegations.
 */
@Fluent
public final class AvailableDelegationsResult implements JsonSerializable<AvailableDelegationsResult> {
    /*
     * An array of available delegations.
     */
    private List<AvailableDelegationInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of AvailableDelegationsResult class.
     */
    public AvailableDelegationsResult() {
    }

    /**
     * Get the value property: An array of available delegations.
     * 
     * @return the value value.
     */
    public List<AvailableDelegationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of available delegations.
     * 
     * @param value the value value to set.
     * @return the AvailableDelegationsResult object itself.
     */
    public AvailableDelegationsResult withValue(List<AvailableDelegationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableDelegationsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableDelegationsResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableDelegationsResult.
     */
    public static AvailableDelegationsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableDelegationsResult deserializedAvailableDelegationsResult = new AvailableDelegationsResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AvailableDelegationInner> value
                        = reader.readArray(reader1 -> AvailableDelegationInner.fromJson(reader1));
                    deserializedAvailableDelegationsResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAvailableDelegationsResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableDelegationsResult;
        });
    }
}
