// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The recoverable server's properties.
 */
@Immutable
public final class RecoverableServerProperties implements JsonSerializable<RecoverableServerProperties> {
    /*
     * The last available backup date time.
     */
    private String lastAvailableBackupDateTime;

    /*
     * The service level objective
     */
    private String serviceLevelObjective;

    /*
     * Edition of the performance tier.
     */
    private String edition;

    /*
     * vCore associated with the service level objective
     */
    private Integer vCore;

    /*
     * Hardware generation associated with the service level objective
     */
    private String hardwareGeneration;

    /*
     * The PostgreSQL version
     */
    private String version;

    /**
     * Creates an instance of RecoverableServerProperties class.
     */
    public RecoverableServerProperties() {
    }

    /**
     * Get the lastAvailableBackupDateTime property: The last available backup date time.
     * 
     * @return the lastAvailableBackupDateTime value.
     */
    public String lastAvailableBackupDateTime() {
        return this.lastAvailableBackupDateTime;
    }

    /**
     * Get the serviceLevelObjective property: The service level objective.
     * 
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the edition property: Edition of the performance tier.
     * 
     * @return the edition value.
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Get the vCore property: vCore associated with the service level objective.
     * 
     * @return the vCore value.
     */
    public Integer vCore() {
        return this.vCore;
    }

    /**
     * Get the hardwareGeneration property: Hardware generation associated with the service level objective.
     * 
     * @return the hardwareGeneration value.
     */
    public String hardwareGeneration() {
        return this.hardwareGeneration;
    }

    /**
     * Get the version property: The PostgreSQL version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
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
     * Reads an instance of RecoverableServerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoverableServerProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoverableServerProperties.
     */
    public static RecoverableServerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoverableServerProperties deserializedRecoverableServerProperties = new RecoverableServerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lastAvailableBackupDateTime".equals(fieldName)) {
                    deserializedRecoverableServerProperties.lastAvailableBackupDateTime = reader.getString();
                } else if ("serviceLevelObjective".equals(fieldName)) {
                    deserializedRecoverableServerProperties.serviceLevelObjective = reader.getString();
                } else if ("edition".equals(fieldName)) {
                    deserializedRecoverableServerProperties.edition = reader.getString();
                } else if ("vCore".equals(fieldName)) {
                    deserializedRecoverableServerProperties.vCore = reader.getNullable(JsonReader::getInt);
                } else if ("hardwareGeneration".equals(fieldName)) {
                    deserializedRecoverableServerProperties.hardwareGeneration = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedRecoverableServerProperties.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoverableServerProperties;
        });
    }
}
