// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The storage profile.
 */
@Fluent
public final class StorageProfile implements JsonSerializable<StorageProfile> {
    /*
     * The list of storage accounts in the cluster.
     */
    private List<StorageAccount> storageaccounts;

    /**
     * Creates an instance of StorageProfile class.
     */
    public StorageProfile() {
    }

    /**
     * Get the storageaccounts property: The list of storage accounts in the cluster.
     * 
     * @return the storageaccounts value.
     */
    public List<StorageAccount> storageaccounts() {
        return this.storageaccounts;
    }

    /**
     * Set the storageaccounts property: The list of storage accounts in the cluster.
     * 
     * @param storageaccounts the storageaccounts value to set.
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageaccounts(List<StorageAccount> storageaccounts) {
        this.storageaccounts = storageaccounts;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageaccounts() != null) {
            storageaccounts().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("storageaccounts", this.storageaccounts,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageProfile.
     */
    public static StorageProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageProfile deserializedStorageProfile = new StorageProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageaccounts".equals(fieldName)) {
                    List<StorageAccount> storageaccounts
                        = reader.readArray(reader1 -> StorageAccount.fromJson(reader1));
                    deserializedStorageProfile.storageaccounts = storageaccounts;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageProfile;
        });
    }
}
