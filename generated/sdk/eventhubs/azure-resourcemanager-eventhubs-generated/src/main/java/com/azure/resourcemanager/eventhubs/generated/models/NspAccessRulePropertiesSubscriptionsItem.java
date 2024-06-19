// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Subscription for inbound rule.
 */
@Fluent
public final class NspAccessRulePropertiesSubscriptionsItem
    implements JsonSerializable<NspAccessRulePropertiesSubscriptionsItem> {
    /*
     * Fully qualified identifier of subscription
     */
    private String id;

    /**
     * Creates an instance of NspAccessRulePropertiesSubscriptionsItem class.
     */
    public NspAccessRulePropertiesSubscriptionsItem() {
    }

    /**
     * Get the id property: Fully qualified identifier of subscription.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of subscription.
     * 
     * @param id the id value to set.
     * @return the NspAccessRulePropertiesSubscriptionsItem object itself.
     */
    public NspAccessRulePropertiesSubscriptionsItem withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NspAccessRulePropertiesSubscriptionsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NspAccessRulePropertiesSubscriptionsItem if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NspAccessRulePropertiesSubscriptionsItem.
     */
    public static NspAccessRulePropertiesSubscriptionsItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NspAccessRulePropertiesSubscriptionsItem deserializedNspAccessRulePropertiesSubscriptionsItem
                = new NspAccessRulePropertiesSubscriptionsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNspAccessRulePropertiesSubscriptionsItem.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNspAccessRulePropertiesSubscriptionsItem;
        });
    }
}
