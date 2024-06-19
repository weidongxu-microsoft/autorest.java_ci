// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mediaservices.generated.models.EdgeUsageDataCollectionPolicy;
import java.io.IOException;

/**
 * The EdgePolicies model.
 */
@Fluent
public final class EdgePoliciesInner implements JsonSerializable<EdgePoliciesInner> {
    /*
     * The usageDataCollectionPolicy property.
     */
    private EdgeUsageDataCollectionPolicy usageDataCollectionPolicy;

    /**
     * Creates an instance of EdgePoliciesInner class.
     */
    public EdgePoliciesInner() {
    }

    /**
     * Get the usageDataCollectionPolicy property: The usageDataCollectionPolicy property.
     * 
     * @return the usageDataCollectionPolicy value.
     */
    public EdgeUsageDataCollectionPolicy usageDataCollectionPolicy() {
        return this.usageDataCollectionPolicy;
    }

    /**
     * Set the usageDataCollectionPolicy property: The usageDataCollectionPolicy property.
     * 
     * @param usageDataCollectionPolicy the usageDataCollectionPolicy value to set.
     * @return the EdgePoliciesInner object itself.
     */
    public EdgePoliciesInner withUsageDataCollectionPolicy(EdgeUsageDataCollectionPolicy usageDataCollectionPolicy) {
        this.usageDataCollectionPolicy = usageDataCollectionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (usageDataCollectionPolicy() != null) {
            usageDataCollectionPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("usageDataCollectionPolicy", this.usageDataCollectionPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EdgePoliciesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EdgePoliciesInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EdgePoliciesInner.
     */
    public static EdgePoliciesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EdgePoliciesInner deserializedEdgePoliciesInner = new EdgePoliciesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("usageDataCollectionPolicy".equals(fieldName)) {
                    deserializedEdgePoliciesInner.usageDataCollectionPolicy
                        = EdgeUsageDataCollectionPolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEdgePoliciesInner;
        });
    }
}
