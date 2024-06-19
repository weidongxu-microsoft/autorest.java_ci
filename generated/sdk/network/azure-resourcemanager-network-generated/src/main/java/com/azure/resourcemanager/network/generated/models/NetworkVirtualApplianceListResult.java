// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListNetworkVirtualAppliances API service call.
 */
@Fluent
public final class NetworkVirtualApplianceListResult implements JsonSerializable<NetworkVirtualApplianceListResult> {
    /*
     * List of Network Virtual Appliances.
     */
    private List<NetworkVirtualApplianceInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of NetworkVirtualApplianceListResult class.
     */
    public NetworkVirtualApplianceListResult() {
    }

    /**
     * Get the value property: List of Network Virtual Appliances.
     * 
     * @return the value value.
     */
    public List<NetworkVirtualApplianceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Network Virtual Appliances.
     * 
     * @param value the value value to set.
     * @return the NetworkVirtualApplianceListResult object itself.
     */
    public NetworkVirtualApplianceListResult withValue(List<NetworkVirtualApplianceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NetworkVirtualApplianceListResult object itself.
     */
    public NetworkVirtualApplianceListResult withNextLink(String nextLink) {
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
     * Reads an instance of NetworkVirtualApplianceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkVirtualApplianceListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkVirtualApplianceListResult.
     */
    public static NetworkVirtualApplianceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkVirtualApplianceListResult deserializedNetworkVirtualApplianceListResult
                = new NetworkVirtualApplianceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkVirtualApplianceInner> value
                        = reader.readArray(reader1 -> NetworkVirtualApplianceInner.fromJson(reader1));
                    deserializedNetworkVirtualApplianceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNetworkVirtualApplianceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkVirtualApplianceListResult;
        });
    }
}
