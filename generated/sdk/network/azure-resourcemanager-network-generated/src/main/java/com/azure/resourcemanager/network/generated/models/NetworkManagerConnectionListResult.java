// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * List of network manager connections.
 */
@Fluent
public final class NetworkManagerConnectionListResult implements JsonSerializable<NetworkManagerConnectionListResult> {
    /*
     * List of network manager connections.
     */
    private List<NetworkManagerConnectionInner> value;

    /*
     * Gets the URL to get the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of NetworkManagerConnectionListResult class.
     */
    public NetworkManagerConnectionListResult() {
    }

    /**
     * Get the value property: List of network manager connections.
     * 
     * @return the value value.
     */
    public List<NetworkManagerConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of network manager connections.
     * 
     * @param value the value value to set.
     * @return the NetworkManagerConnectionListResult object itself.
     */
    public NetworkManagerConnectionListResult withValue(List<NetworkManagerConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next page of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NetworkManagerConnectionListResult object itself.
     */
    public NetworkManagerConnectionListResult withNextLink(String nextLink) {
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
     * Reads an instance of NetworkManagerConnectionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkManagerConnectionListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkManagerConnectionListResult.
     */
    public static NetworkManagerConnectionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkManagerConnectionListResult deserializedNetworkManagerConnectionListResult
                = new NetworkManagerConnectionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkManagerConnectionInner> value
                        = reader.readArray(reader1 -> NetworkManagerConnectionInner.fromJson(reader1));
                    deserializedNetworkManagerConnectionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNetworkManagerConnectionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkManagerConnectionListResult;
        });
    }
}
