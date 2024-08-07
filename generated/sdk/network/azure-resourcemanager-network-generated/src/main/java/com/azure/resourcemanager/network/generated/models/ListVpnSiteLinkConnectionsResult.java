// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list all vpn connections to a virtual wan vpn gateway. It contains a list of Vpn Connections
 * and a URL nextLink to get the next set of results.
 */
@Fluent
public final class ListVpnSiteLinkConnectionsResult implements JsonSerializable<ListVpnSiteLinkConnectionsResult> {
    /*
     * List of VpnSiteLinkConnections.
     */
    private List<VpnSiteLinkConnectionInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ListVpnSiteLinkConnectionsResult class.
     */
    public ListVpnSiteLinkConnectionsResult() {
    }

    /**
     * Get the value property: List of VpnSiteLinkConnections.
     * 
     * @return the value value.
     */
    public List<VpnSiteLinkConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnSiteLinkConnections.
     * 
     * @param value the value value to set.
     * @return the ListVpnSiteLinkConnectionsResult object itself.
     */
    public ListVpnSiteLinkConnectionsResult withValue(List<VpnSiteLinkConnectionInner> value) {
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
     * @return the ListVpnSiteLinkConnectionsResult object itself.
     */
    public ListVpnSiteLinkConnectionsResult withNextLink(String nextLink) {
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
     * Reads an instance of ListVpnSiteLinkConnectionsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListVpnSiteLinkConnectionsResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListVpnSiteLinkConnectionsResult.
     */
    public static ListVpnSiteLinkConnectionsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListVpnSiteLinkConnectionsResult deserializedListVpnSiteLinkConnectionsResult
                = new ListVpnSiteLinkConnectionsResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VpnSiteLinkConnectionInner> value
                        = reader.readArray(reader1 -> VpnSiteLinkConnectionInner.fromJson(reader1));
                    deserializedListVpnSiteLinkConnectionsResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListVpnSiteLinkConnectionsResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListVpnSiteLinkConnectionsResult;
        });
    }
}
