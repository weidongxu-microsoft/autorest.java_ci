// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Data Box Edge/Gateway Edge Profile patch.
 */
@Fluent
public final class EdgeProfilePatch implements JsonSerializable<EdgeProfilePatch> {
    /*
     * The Data Box Edge/Gateway Edge Profile Subscription patch
     */
    private EdgeProfileSubscriptionPatch subscription;

    /**
     * Creates an instance of EdgeProfilePatch class.
     */
    public EdgeProfilePatch() {
    }

    /**
     * Get the subscription property: The Data Box Edge/Gateway Edge Profile Subscription patch.
     * 
     * @return the subscription value.
     */
    public EdgeProfileSubscriptionPatch subscription() {
        return this.subscription;
    }

    /**
     * Set the subscription property: The Data Box Edge/Gateway Edge Profile Subscription patch.
     * 
     * @param subscription the subscription value to set.
     * @return the EdgeProfilePatch object itself.
     */
    public EdgeProfilePatch withSubscription(EdgeProfileSubscriptionPatch subscription) {
        this.subscription = subscription;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscription() != null) {
            subscription().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("subscription", this.subscription);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EdgeProfilePatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EdgeProfilePatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EdgeProfilePatch.
     */
    public static EdgeProfilePatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EdgeProfilePatch deserializedEdgeProfilePatch = new EdgeProfilePatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscription".equals(fieldName)) {
                    deserializedEdgeProfilePatch.subscription = EdgeProfileSubscriptionPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEdgeProfilePatch;
        });
    }
}
