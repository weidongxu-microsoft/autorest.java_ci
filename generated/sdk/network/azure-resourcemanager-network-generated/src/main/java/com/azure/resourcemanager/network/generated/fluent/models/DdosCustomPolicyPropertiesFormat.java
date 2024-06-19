// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * DDoS custom policy properties.
 */
@Immutable
public final class DdosCustomPolicyPropertiesFormat implements JsonSerializable<DdosCustomPolicyPropertiesFormat> {
    /*
     * The resource GUID property of the DDoS custom policy resource. It uniquely identifies the resource, even if the
     * user changes its name or migrate the resource across subscriptions or resource groups.
     */
    private String resourceGuid;

    /*
     * The provisioning state of the DDoS custom policy resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of DdosCustomPolicyPropertiesFormat class.
     */
    public DdosCustomPolicyPropertiesFormat() {
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS custom policy resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS custom policy resource.
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DdosCustomPolicyPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DdosCustomPolicyPropertiesFormat if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DdosCustomPolicyPropertiesFormat.
     */
    public static DdosCustomPolicyPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DdosCustomPolicyPropertiesFormat deserializedDdosCustomPolicyPropertiesFormat
                = new DdosCustomPolicyPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceGuid".equals(fieldName)) {
                    deserializedDdosCustomPolicyPropertiesFormat.resourceGuid = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDdosCustomPolicyPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDdosCustomPolicyPropertiesFormat;
        });
    }
}
