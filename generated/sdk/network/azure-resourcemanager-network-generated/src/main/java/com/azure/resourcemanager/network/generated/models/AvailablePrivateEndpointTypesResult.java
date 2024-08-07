// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.AvailablePrivateEndpointTypeInner;
import java.io.IOException;
import java.util.List;

/**
 * An array of available PrivateEndpoint types.
 */
@Fluent
public final class AvailablePrivateEndpointTypesResult
    implements JsonSerializable<AvailablePrivateEndpointTypesResult> {
    /*
     * An array of available privateEndpoint type.
     */
    private List<AvailablePrivateEndpointTypeInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of AvailablePrivateEndpointTypesResult class.
     */
    public AvailablePrivateEndpointTypesResult() {
    }

    /**
     * Get the value property: An array of available privateEndpoint type.
     * 
     * @return the value value.
     */
    public List<AvailablePrivateEndpointTypeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of available privateEndpoint type.
     * 
     * @param value the value value to set.
     * @return the AvailablePrivateEndpointTypesResult object itself.
     */
    public AvailablePrivateEndpointTypesResult withValue(List<AvailablePrivateEndpointTypeInner> value) {
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
     * Reads an instance of AvailablePrivateEndpointTypesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailablePrivateEndpointTypesResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailablePrivateEndpointTypesResult.
     */
    public static AvailablePrivateEndpointTypesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailablePrivateEndpointTypesResult deserializedAvailablePrivateEndpointTypesResult
                = new AvailablePrivateEndpointTypesResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AvailablePrivateEndpointTypeInner> value
                        = reader.readArray(reader1 -> AvailablePrivateEndpointTypeInner.fromJson(reader1));
                    deserializedAvailablePrivateEndpointTypesResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAvailablePrivateEndpointTypesResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailablePrivateEndpointTypesResult;
        });
    }
}
