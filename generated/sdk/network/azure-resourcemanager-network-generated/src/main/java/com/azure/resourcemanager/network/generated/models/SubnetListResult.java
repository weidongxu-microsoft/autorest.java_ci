// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListSubnets API service callRetrieves all subnet that belongs to a virtual network.
 */
@Fluent
public final class SubnetListResult implements JsonSerializable<SubnetListResult> {
    /*
     * The subnets in a virtual network.
     */
    private List<SubnetInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SubnetListResult class.
     */
    public SubnetListResult() {
    }

    /**
     * Get the value property: The subnets in a virtual network.
     * 
     * @return the value value.
     */
    public List<SubnetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The subnets in a virtual network.
     * 
     * @param value the value value to set.
     * @return the SubnetListResult object itself.
     */
    public SubnetListResult withValue(List<SubnetInner> value) {
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
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SubnetListResult object itself.
     */
    public SubnetListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubnetListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubnetListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubnetListResult.
     */
    public static SubnetListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubnetListResult deserializedSubnetListResult = new SubnetListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SubnetInner> value = reader.readArray(reader1 -> SubnetInner.fromJson(reader1));
                    deserializedSubnetListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSubnetListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubnetListResult;
        });
    }
}
