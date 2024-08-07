// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.HubIpConfigurationInner;
import java.io.IOException;
import java.util.List;

/**
 * VirtualHubIpConfigurations list.
 */
@Fluent
public final class ListVirtualHubIpConfigurationResults
    implements JsonSerializable<ListVirtualHubIpConfigurationResults> {
    /*
     * The list of VirtualHubIpConfigurations.
     */
    private List<HubIpConfigurationInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ListVirtualHubIpConfigurationResults class.
     */
    public ListVirtualHubIpConfigurationResults() {
    }

    /**
     * Get the value property: The list of VirtualHubIpConfigurations.
     * 
     * @return the value value.
     */
    public List<HubIpConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VirtualHubIpConfigurations.
     * 
     * @param value the value value to set.
     * @return the ListVirtualHubIpConfigurationResults object itself.
     */
    public ListVirtualHubIpConfigurationResults withValue(List<HubIpConfigurationInner> value) {
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
     * @return the ListVirtualHubIpConfigurationResults object itself.
     */
    public ListVirtualHubIpConfigurationResults withNextLink(String nextLink) {
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
     * Reads an instance of ListVirtualHubIpConfigurationResults from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListVirtualHubIpConfigurationResults if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListVirtualHubIpConfigurationResults.
     */
    public static ListVirtualHubIpConfigurationResults fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListVirtualHubIpConfigurationResults deserializedListVirtualHubIpConfigurationResults
                = new ListVirtualHubIpConfigurationResults();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<HubIpConfigurationInner> value
                        = reader.readArray(reader1 -> HubIpConfigurationInner.fromJson(reader1));
                    deserializedListVirtualHubIpConfigurationResults.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListVirtualHubIpConfigurationResults.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListVirtualHubIpConfigurationResults;
        });
    }
}
