// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for the ListVirtualNetworks API service call.
 */
@Fluent
public final class VirtualNetworkListResult implements JsonSerializable<VirtualNetworkListResult> {
    /*
     * A list of VirtualNetwork resources in a resource group.
     */
    private List<VirtualNetworkInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of VirtualNetworkListResult class.
     */
    public VirtualNetworkListResult() {
    }

    /**
     * Get the value property: A list of VirtualNetwork resources in a resource group.
     * 
     * @return the value value.
     */
    public List<VirtualNetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of VirtualNetwork resources in a resource group.
     * 
     * @param value the value value to set.
     * @return the VirtualNetworkListResult object itself.
     */
    public VirtualNetworkListResult withValue(List<VirtualNetworkInner> value) {
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
     * @return the VirtualNetworkListResult object itself.
     */
    public VirtualNetworkListResult withNextLink(String nextLink) {
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
     * Reads an instance of VirtualNetworkListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkListResult.
     */
    public static VirtualNetworkListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkListResult deserializedVirtualNetworkListResult = new VirtualNetworkListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VirtualNetworkInner> value
                        = reader.readArray(reader1 -> VirtualNetworkInner.fromJson(reader1));
                    deserializedVirtualNetworkListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedVirtualNetworkListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkListResult;
        });
    }
}
