// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayNatRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list all nat rules to a virtual network gateway. It contains a list of Nat rules and a URL
 * nextLink to get the next set of results.
 */
@Fluent
public final class ListVirtualNetworkGatewayNatRulesResult
    implements JsonSerializable<ListVirtualNetworkGatewayNatRulesResult> {
    /*
     * List of Nat Rules.
     */
    private List<VirtualNetworkGatewayNatRuleInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ListVirtualNetworkGatewayNatRulesResult class.
     */
    public ListVirtualNetworkGatewayNatRulesResult() {
    }

    /**
     * Get the value property: List of Nat Rules.
     * 
     * @return the value value.
     */
    public List<VirtualNetworkGatewayNatRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Nat Rules.
     * 
     * @param value the value value to set.
     * @return the ListVirtualNetworkGatewayNatRulesResult object itself.
     */
    public ListVirtualNetworkGatewayNatRulesResult withValue(List<VirtualNetworkGatewayNatRuleInner> value) {
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
     * @return the ListVirtualNetworkGatewayNatRulesResult object itself.
     */
    public ListVirtualNetworkGatewayNatRulesResult withNextLink(String nextLink) {
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
     * Reads an instance of ListVirtualNetworkGatewayNatRulesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListVirtualNetworkGatewayNatRulesResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListVirtualNetworkGatewayNatRulesResult.
     */
    public static ListVirtualNetworkGatewayNatRulesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListVirtualNetworkGatewayNatRulesResult deserializedListVirtualNetworkGatewayNatRulesResult
                = new ListVirtualNetworkGatewayNatRulesResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VirtualNetworkGatewayNatRuleInner> value
                        = reader.readArray(reader1 -> VirtualNetworkGatewayNatRuleInner.fromJson(reader1));
                    deserializedListVirtualNetworkGatewayNatRulesResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListVirtualNetworkGatewayNatRulesResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListVirtualNetworkGatewayNatRulesResult;
        });
    }
}
