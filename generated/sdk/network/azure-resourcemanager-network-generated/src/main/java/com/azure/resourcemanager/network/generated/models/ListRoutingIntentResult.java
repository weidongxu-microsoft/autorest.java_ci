// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.RoutingIntentInner;
import java.io.IOException;
import java.util.List;

/**
 * List of the routing intent result and a URL nextLink to get the next set of results.
 */
@Fluent
public final class ListRoutingIntentResult implements JsonSerializable<ListRoutingIntentResult> {
    /*
     * List of RoutingIntent resource.
     */
    private List<RoutingIntentInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ListRoutingIntentResult class.
     */
    public ListRoutingIntentResult() {
    }

    /**
     * Get the value property: List of RoutingIntent resource.
     * 
     * @return the value value.
     */
    public List<RoutingIntentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of RoutingIntent resource.
     * 
     * @param value the value value to set.
     * @return the ListRoutingIntentResult object itself.
     */
    public ListRoutingIntentResult withValue(List<RoutingIntentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListRoutingIntentResult object itself.
     */
    public ListRoutingIntentResult withNextLink(String nextLink) {
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
     * Reads an instance of ListRoutingIntentResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListRoutingIntentResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListRoutingIntentResult.
     */
    public static ListRoutingIntentResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListRoutingIntentResult deserializedListRoutingIntentResult = new ListRoutingIntentResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RoutingIntentInner> value = reader.readArray(reader1 -> RoutingIntentInner.fromJson(reader1));
                    deserializedListRoutingIntentResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListRoutingIntentResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListRoutingIntentResult;
        });
    }
}
