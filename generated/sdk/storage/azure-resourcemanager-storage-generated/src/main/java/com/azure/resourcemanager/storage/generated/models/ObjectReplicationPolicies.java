// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.fluent.models.ObjectReplicationPolicyInner;
import java.io.IOException;
import java.util.List;

/**
 * List storage account object replication policies.
 */
@Fluent
public final class ObjectReplicationPolicies implements JsonSerializable<ObjectReplicationPolicies> {
    /*
     * The replication policy between two storage accounts.
     */
    private List<ObjectReplicationPolicyInner> value;

    /**
     * Creates an instance of ObjectReplicationPolicies class.
     */
    public ObjectReplicationPolicies() {
    }

    /**
     * Get the value property: The replication policy between two storage accounts.
     * 
     * @return the value value.
     */
    public List<ObjectReplicationPolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The replication policy between two storage accounts.
     * 
     * @param value the value value to set.
     * @return the ObjectReplicationPolicies object itself.
     */
    public ObjectReplicationPolicies withValue(List<ObjectReplicationPolicyInner> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObjectReplicationPolicies from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObjectReplicationPolicies if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObjectReplicationPolicies.
     */
    public static ObjectReplicationPolicies fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObjectReplicationPolicies deserializedObjectReplicationPolicies = new ObjectReplicationPolicies();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ObjectReplicationPolicyInner> value
                        = reader.readArray(reader1 -> ObjectReplicationPolicyInner.fromJson(reader1));
                    deserializedObjectReplicationPolicies.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedObjectReplicationPolicies;
        });
    }
}
