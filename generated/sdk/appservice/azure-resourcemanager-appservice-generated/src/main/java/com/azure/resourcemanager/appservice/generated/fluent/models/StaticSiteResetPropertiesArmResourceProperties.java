// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * StaticSiteResetPropertiesARMResource resource specific properties.
 */
@Fluent
public final class StaticSiteResetPropertiesArmResourceProperties
    implements JsonSerializable<StaticSiteResetPropertiesArmResourceProperties> {
    /*
     * The token which proves admin privileges to the repository.
     */
    private String repositoryToken;

    /*
     * Determines whether the repository should be updated with the new properties.
     */
    private Boolean shouldUpdateRepository;

    /**
     * Creates an instance of StaticSiteResetPropertiesArmResourceProperties class.
     */
    public StaticSiteResetPropertiesArmResourceProperties() {
    }

    /**
     * Get the repositoryToken property: The token which proves admin privileges to the repository.
     * 
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.repositoryToken;
    }

    /**
     * Set the repositoryToken property: The token which proves admin privileges to the repository.
     * 
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSiteResetPropertiesArmResourceProperties object itself.
     */
    public StaticSiteResetPropertiesArmResourceProperties withRepositoryToken(String repositoryToken) {
        this.repositoryToken = repositoryToken;
        return this;
    }

    /**
     * Get the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     * 
     * @return the shouldUpdateRepository value.
     */
    public Boolean shouldUpdateRepository() {
        return this.shouldUpdateRepository;
    }

    /**
     * Set the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     * 
     * @param shouldUpdateRepository the shouldUpdateRepository value to set.
     * @return the StaticSiteResetPropertiesArmResourceProperties object itself.
     */
    public StaticSiteResetPropertiesArmResourceProperties withShouldUpdateRepository(Boolean shouldUpdateRepository) {
        this.shouldUpdateRepository = shouldUpdateRepository;
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
        jsonWriter.writeStringField("repositoryToken", this.repositoryToken);
        jsonWriter.writeBooleanField("shouldUpdateRepository", this.shouldUpdateRepository);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteResetPropertiesArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteResetPropertiesArmResourceProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteResetPropertiesArmResourceProperties.
     */
    public static StaticSiteResetPropertiesArmResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteResetPropertiesArmResourceProperties deserializedStaticSiteResetPropertiesArmResourceProperties
                = new StaticSiteResetPropertiesArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("repositoryToken".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResourceProperties.repositoryToken = reader.getString();
                } else if ("shouldUpdateRepository".equals(fieldName)) {
                    deserializedStaticSiteResetPropertiesArmResourceProperties.shouldUpdateRepository
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteResetPropertiesArmResourceProperties;
        });
    }
}
