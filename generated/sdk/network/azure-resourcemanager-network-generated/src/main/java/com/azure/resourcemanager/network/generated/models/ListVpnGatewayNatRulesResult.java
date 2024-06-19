// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayNatRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list all nat rules to a virtual wan vpn gateway. It contains a list of Nat rules and a URL
 * nextLink to get the next set of results.
 */
@Fluent
public final class ListVpnGatewayNatRulesResult implements JsonSerializable<ListVpnGatewayNatRulesResult> {
    /*
     * List of Nat Rules.
     */
    private List<VpnGatewayNatRuleInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of ListVpnGatewayNatRulesResult class.
     */
    public ListVpnGatewayNatRulesResult() {
    }

    /**
     * Get the value property: List of Nat Rules.
     * 
     * @return the value value.
     */
    public List<VpnGatewayNatRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Nat Rules.
     * 
     * @param value the value value to set.
     * @return the ListVpnGatewayNatRulesResult object itself.
     */
    public ListVpnGatewayNatRulesResult withValue(List<VpnGatewayNatRuleInner> value) {
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
     * @return the ListVpnGatewayNatRulesResult object itself.
     */
    public ListVpnGatewayNatRulesResult withNextLink(String nextLink) {
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
     * Reads an instance of ListVpnGatewayNatRulesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListVpnGatewayNatRulesResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListVpnGatewayNatRulesResult.
     */
    public static ListVpnGatewayNatRulesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListVpnGatewayNatRulesResult deserializedListVpnGatewayNatRulesResult = new ListVpnGatewayNatRulesResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<VpnGatewayNatRuleInner> value
                        = reader.readArray(reader1 -> VpnGatewayNatRuleInner.fromJson(reader1));
                    deserializedListVpnGatewayNatRulesResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListVpnGatewayNatRulesResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListVpnGatewayNatRulesResult;
        });
    }
}
