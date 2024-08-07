// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.RouteInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for the ListRoute API service call.
 */
@Fluent
public final class RouteListResult implements JsonSerializable<RouteListResult> {
    /*
     * A list of routes in a resource group.
     */
    private List<RouteInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of RouteListResult class.
     */
    public RouteListResult() {
    }

    /**
     * Get the value property: A list of routes in a resource group.
     * 
     * @return the value value.
     */
    public List<RouteInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of routes in a resource group.
     * 
     * @param value the value value to set.
     * @return the RouteListResult object itself.
     */
    public RouteListResult withValue(List<RouteInner> value) {
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
     * @return the RouteListResult object itself.
     */
    public RouteListResult withNextLink(String nextLink) {
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
     * Reads an instance of RouteListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouteListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RouteListResult.
     */
    public static RouteListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RouteListResult deserializedRouteListResult = new RouteListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RouteInner> value = reader.readArray(reader1 -> RouteInner.fromJson(reader1));
                    deserializedRouteListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRouteListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRouteListResult;
        });
    }
}
