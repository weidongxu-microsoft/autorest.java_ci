// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The redundancy Settings of a Vault.
 */
@Fluent
public final class VaultPropertiesRedundancySettings implements JsonSerializable<VaultPropertiesRedundancySettings> {
    /*
     * The storage redundancy setting of a vault
     */
    private StandardTierStorageRedundancy standardTierStorageRedundancy;

    /*
     * Flag to show if Cross Region Restore is enabled on the Vault or not
     */
    private CrossRegionRestore crossRegionRestore;

    /**
     * Creates an instance of VaultPropertiesRedundancySettings class.
     */
    public VaultPropertiesRedundancySettings() {
    }

    /**
     * Get the standardTierStorageRedundancy property: The storage redundancy setting of a vault.
     * 
     * @return the standardTierStorageRedundancy value.
     */
    public StandardTierStorageRedundancy standardTierStorageRedundancy() {
        return this.standardTierStorageRedundancy;
    }

    /**
     * Set the standardTierStorageRedundancy property: The storage redundancy setting of a vault.
     * 
     * @param standardTierStorageRedundancy the standardTierStorageRedundancy value to set.
     * @return the VaultPropertiesRedundancySettings object itself.
     */
    public VaultPropertiesRedundancySettings
        withStandardTierStorageRedundancy(StandardTierStorageRedundancy standardTierStorageRedundancy) {
        this.standardTierStorageRedundancy = standardTierStorageRedundancy;
        return this;
    }

    /**
     * Get the crossRegionRestore property: Flag to show if Cross Region Restore is enabled on the Vault or not.
     * 
     * @return the crossRegionRestore value.
     */
    public CrossRegionRestore crossRegionRestore() {
        return this.crossRegionRestore;
    }

    /**
     * Set the crossRegionRestore property: Flag to show if Cross Region Restore is enabled on the Vault or not.
     * 
     * @param crossRegionRestore the crossRegionRestore value to set.
     * @return the VaultPropertiesRedundancySettings object itself.
     */
    public VaultPropertiesRedundancySettings withCrossRegionRestore(CrossRegionRestore crossRegionRestore) {
        this.crossRegionRestore = crossRegionRestore;
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
        jsonWriter.writeStringField("standardTierStorageRedundancy",
            this.standardTierStorageRedundancy == null ? null : this.standardTierStorageRedundancy.toString());
        jsonWriter.writeStringField("crossRegionRestore",
            this.crossRegionRestore == null ? null : this.crossRegionRestore.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultPropertiesRedundancySettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultPropertiesRedundancySettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VaultPropertiesRedundancySettings.
     */
    public static VaultPropertiesRedundancySettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultPropertiesRedundancySettings deserializedVaultPropertiesRedundancySettings
                = new VaultPropertiesRedundancySettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("standardTierStorageRedundancy".equals(fieldName)) {
                    deserializedVaultPropertiesRedundancySettings.standardTierStorageRedundancy
                        = StandardTierStorageRedundancy.fromString(reader.getString());
                } else if ("crossRegionRestore".equals(fieldName)) {
                    deserializedVaultPropertiesRedundancySettings.crossRegionRestore
                        = CrossRegionRestore.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultPropertiesRedundancySettings;
        });
    }
}
