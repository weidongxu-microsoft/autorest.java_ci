// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The response from the List namespace operation.
 */
@Fluent
public final class NWRuleSetIpRules implements JsonSerializable<NWRuleSetIpRules> {
    /*
     * IP Mask
     */
    private String ipMask;

    /*
     * The IP Filter Action
     */
    private NetworkRuleIpAction action;

    /**
     * Creates an instance of NWRuleSetIpRules class.
     */
    public NWRuleSetIpRules() {
    }

    /**
     * Get the ipMask property: IP Mask.
     * 
     * @return the ipMask value.
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask property: IP Mask.
     * 
     * @param ipMask the ipMask value to set.
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Get the action property: The IP Filter Action.
     * 
     * @return the action value.
     */
    public NetworkRuleIpAction action() {
        return this.action;
    }

    /**
     * Set the action property: The IP Filter Action.
     * 
     * @param action the action value to set.
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withAction(NetworkRuleIpAction action) {
        this.action = action;
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
        jsonWriter.writeStringField("ipMask", this.ipMask);
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NWRuleSetIpRules from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NWRuleSetIpRules if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NWRuleSetIpRules.
     */
    public static NWRuleSetIpRules fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NWRuleSetIpRules deserializedNWRuleSetIpRules = new NWRuleSetIpRules();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipMask".equals(fieldName)) {
                    deserializedNWRuleSetIpRules.ipMask = reader.getString();
                } else if ("action".equals(fieldName)) {
                    deserializedNWRuleSetIpRules.action = NetworkRuleIpAction.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNWRuleSetIpRules;
        });
    }
}
