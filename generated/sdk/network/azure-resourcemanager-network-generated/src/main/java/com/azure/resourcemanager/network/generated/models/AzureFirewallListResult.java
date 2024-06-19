// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.AzureFirewallInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListAzureFirewalls API service call.
 */
@Fluent
public final class AzureFirewallListResult implements JsonSerializable<AzureFirewallListResult> {
    /*
     * List of Azure Firewalls in a resource group.
     */
    private List<AzureFirewallInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of AzureFirewallListResult class.
     */
    public AzureFirewallListResult() {
    }

    /**
     * Get the value property: List of Azure Firewalls in a resource group.
     * 
     * @return the value value.
     */
    public List<AzureFirewallInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Azure Firewalls in a resource group.
     * 
     * @param value the value value to set.
     * @return the AzureFirewallListResult object itself.
     */
    public AzureFirewallListResult withValue(List<AzureFirewallInner> value) {
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
     * @return the AzureFirewallListResult object itself.
     */
    public AzureFirewallListResult withNextLink(String nextLink) {
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
     * Reads an instance of AzureFirewallListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallListResult.
     */
    public static AzureFirewallListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallListResult deserializedAzureFirewallListResult = new AzureFirewallListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AzureFirewallInner> value = reader.readArray(reader1 -> AzureFirewallInner.fromJson(reader1));
                    deserializedAzureFirewallListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAzureFirewallListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallListResult;
        });
    }
}
