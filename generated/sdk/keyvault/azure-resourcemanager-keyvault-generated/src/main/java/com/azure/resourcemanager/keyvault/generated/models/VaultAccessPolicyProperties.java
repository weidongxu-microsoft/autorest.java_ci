// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the vault access policy.
 */
@Fluent
public final class VaultAccessPolicyProperties implements JsonSerializable<VaultAccessPolicyProperties> {
    /*
     * An array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same
     * tenant ID as the key vault's tenant ID.
     */
    private List<AccessPolicyEntry> accessPolicies;

    /**
     * Creates an instance of VaultAccessPolicyProperties class.
     */
    public VaultAccessPolicyProperties() {
    }

    /**
     * Get the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All identities
     * in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @return the accessPolicies value.
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All identities
     * in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @param accessPolicies the accessPolicies value to set.
     * @return the VaultAccessPolicyProperties object itself.
     */
    public VaultAccessPolicyProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessPolicies() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accessPolicies in model VaultAccessPolicyProperties"));
        } else {
            accessPolicies().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultAccessPolicyProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("accessPolicies", this.accessPolicies,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultAccessPolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultAccessPolicyProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VaultAccessPolicyProperties.
     */
    public static VaultAccessPolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultAccessPolicyProperties deserializedVaultAccessPolicyProperties = new VaultAccessPolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accessPolicies".equals(fieldName)) {
                    List<AccessPolicyEntry> accessPolicies
                        = reader.readArray(reader1 -> AccessPolicyEntry.fromJson(reader1));
                    deserializedVaultAccessPolicyProperties.accessPolicies = accessPolicies;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultAccessPolicyProperties;
        });
    }
}
