// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * AzureFirewall NAT Rule Collection Action.
 */
@Fluent
public final class AzureFirewallNatRCAction implements JsonSerializable<AzureFirewallNatRCAction> {
    /*
     * The type of action.
     */
    private AzureFirewallNatRCActionType type;

    /**
     * Creates an instance of AzureFirewallNatRCAction class.
     */
    public AzureFirewallNatRCAction() {
    }

    /**
     * Get the type property: The type of action.
     * 
     * @return the type value.
     */
    public AzureFirewallNatRCActionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     * 
     * @param type the type value to set.
     * @return the AzureFirewallNatRCAction object itself.
     */
    public AzureFirewallNatRCAction withType(AzureFirewallNatRCActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallNatRCAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallNatRCAction if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallNatRCAction.
     */
    public static AzureFirewallNatRCAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallNatRCAction deserializedAzureFirewallNatRCAction = new AzureFirewallNatRCAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedAzureFirewallNatRCAction.type
                        = AzureFirewallNatRCActionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallNatRCAction;
        });
    }
}
