// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * NetworkVirtualApplianceConnection list.
 */
@Fluent
public final class NetworkVirtualApplianceConnectionList
    implements JsonSerializable<NetworkVirtualApplianceConnectionList> {
    /*
     * The list of NetworkVirtualAppliance connections.
     */
    private List<NetworkVirtualApplianceConnectionInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of NetworkVirtualApplianceConnectionList class.
     */
    public NetworkVirtualApplianceConnectionList() {
    }

    /**
     * Get the value property: The list of NetworkVirtualAppliance connections.
     * 
     * @return the value value.
     */
    public List<NetworkVirtualApplianceConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of NetworkVirtualAppliance connections.
     * 
     * @param value the value value to set.
     * @return the NetworkVirtualApplianceConnectionList object itself.
     */
    public NetworkVirtualApplianceConnectionList withValue(List<NetworkVirtualApplianceConnectionInner> value) {
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
     * @return the NetworkVirtualApplianceConnectionList object itself.
     */
    public NetworkVirtualApplianceConnectionList withNextLink(String nextLink) {
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
     * Reads an instance of NetworkVirtualApplianceConnectionList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkVirtualApplianceConnectionList if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkVirtualApplianceConnectionList.
     */
    public static NetworkVirtualApplianceConnectionList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkVirtualApplianceConnectionList deserializedNetworkVirtualApplianceConnectionList
                = new NetworkVirtualApplianceConnectionList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkVirtualApplianceConnectionInner> value
                        = reader.readArray(reader1 -> NetworkVirtualApplianceConnectionInner.fromJson(reader1));
                    deserializedNetworkVirtualApplianceConnectionList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNetworkVirtualApplianceConnectionList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkVirtualApplianceConnectionList;
        });
    }
}
