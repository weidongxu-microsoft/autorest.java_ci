// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of static member.
 */
@Fluent
public final class StaticMemberProperties implements JsonSerializable<StaticMemberProperties> {
    /*
     * Resource Id.
     */
    private String resourceId;

    /*
     * Resource region.
     */
    private String region;

    /*
     * The provisioning state of the scope assignment resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of StaticMemberProperties class.
     */
    public StaticMemberProperties() {
    }

    /**
     * Get the resourceId property: Resource Id.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id.
     * 
     * @param resourceId the resourceId value to set.
     * @return the StaticMemberProperties object itself.
     */
    public StaticMemberProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the region property: Resource region.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("resourceId", this.resourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticMemberProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticMemberProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticMemberProperties.
     */
    public static StaticMemberProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticMemberProperties deserializedStaticMemberProperties = new StaticMemberProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedStaticMemberProperties.resourceId = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedStaticMemberProperties.region = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedStaticMemberProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticMemberProperties;
        });
    }
}
