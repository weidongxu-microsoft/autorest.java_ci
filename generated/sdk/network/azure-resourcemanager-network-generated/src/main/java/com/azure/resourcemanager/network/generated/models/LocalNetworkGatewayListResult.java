// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListLocalNetworkGateways API service call.
 */
@Fluent
public final class LocalNetworkGatewayListResult implements JsonSerializable<LocalNetworkGatewayListResult> {
    /*
     * A list of local network gateways that exists in a resource group.
     */
    private List<LocalNetworkGatewayInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of LocalNetworkGatewayListResult class.
     */
    public LocalNetworkGatewayListResult() {
    }

    /**
     * Get the value property: A list of local network gateways that exists in a resource group.
     * 
     * @return the value value.
     */
    public List<LocalNetworkGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of local network gateways that exists in a resource group.
     * 
     * @param value the value value to set.
     * @return the LocalNetworkGatewayListResult object itself.
     */
    public LocalNetworkGatewayListResult withValue(List<LocalNetworkGatewayInner> value) {
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
     * Reads an instance of LocalNetworkGatewayListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalNetworkGatewayListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LocalNetworkGatewayListResult.
     */
    public static LocalNetworkGatewayListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalNetworkGatewayListResult deserializedLocalNetworkGatewayListResult
                = new LocalNetworkGatewayListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LocalNetworkGatewayInner> value
                        = reader.readArray(reader1 -> LocalNetworkGatewayInner.fromJson(reader1));
                    deserializedLocalNetworkGatewayListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLocalNetworkGatewayListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalNetworkGatewayListResult;
        });
    }
}
