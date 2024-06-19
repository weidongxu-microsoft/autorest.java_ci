// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The response of the List NetworkRuleSet operation.
 */
@Fluent
public final class NetworkRuleSetListResultInner implements JsonSerializable<NetworkRuleSetListResultInner> {
    /*
     * Result of the List NetworkRuleSet operation
     */
    private List<NetworkRuleSetInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of NetworkRuleSet.
     */
    private String nextLink;

    /**
     * Creates an instance of NetworkRuleSetListResultInner class.
     */
    public NetworkRuleSetListResultInner() {
    }

    /**
     * Get the value property: Result of the List NetworkRuleSet operation.
     * 
     * @return the value value.
     */
    public List<NetworkRuleSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List NetworkRuleSet operation.
     * 
     * @param value the value value to set.
     * @return the NetworkRuleSetListResultInner object itself.
     */
    public NetworkRuleSetListResultInner withValue(List<NetworkRuleSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NetworkRuleSet.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NetworkRuleSet.
     * 
     * @param nextLink the nextLink value to set.
     * @return the NetworkRuleSetListResultInner object itself.
     */
    public NetworkRuleSetListResultInner withNextLink(String nextLink) {
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
     * Reads an instance of NetworkRuleSetListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSetListResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkRuleSetListResultInner.
     */
    public static NetworkRuleSetListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSetListResultInner deserializedNetworkRuleSetListResultInner
                = new NetworkRuleSetListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<NetworkRuleSetInner> value
                        = reader.readArray(reader1 -> NetworkRuleSetInner.fromJson(reader1));
                    deserializedNetworkRuleSetListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedNetworkRuleSetListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSetListResultInner;
        });
    }
}
