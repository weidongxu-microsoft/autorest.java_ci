// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties to configure Encryption.
 */
@Fluent
public final class Encryption implements JsonSerializable<Encryption> {
    /*
     * Properties of KeyVault
     */
    private List<KeyVaultProperties> keyVaultProperties;

    /*
     * Enumerates the possible value of keySource for Encryption
     */
    private KeySource keySource;

    /*
     * Enable Infrastructure Encryption (Double Encryption)
     */
    private Boolean requireInfrastructureEncryption;

    /**
     * Creates an instance of Encryption class.
     */
    public Encryption() {
    }

    /**
     * Get the keyVaultProperties property: Properties of KeyVault.
     * 
     * @return the keyVaultProperties value.
     */
    public List<KeyVaultProperties> keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Properties of KeyVault.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultProperties(List<KeyVaultProperties> keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the keySource property: Enumerates the possible value of keySource for Encryption.
     * 
     * @return the keySource value.
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: Enumerates the possible value of keySource for Encryption.
     * 
     * @param keySource the keySource value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: Enable Infrastructure Encryption (Double Encryption).
     * 
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: Enable Infrastructure Encryption (Double Encryption).
     * 
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("keyVaultProperties", this.keyVaultProperties,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("keySource", this.keySource == null ? null : this.keySource.toString());
        jsonWriter.writeBooleanField("requireInfrastructureEncryption", this.requireInfrastructureEncryption);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Encryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Encryption if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Encryption.
     */
    public static Encryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Encryption deserializedEncryption = new Encryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyVaultProperties".equals(fieldName)) {
                    List<KeyVaultProperties> keyVaultProperties
                        = reader.readArray(reader1 -> KeyVaultProperties.fromJson(reader1));
                    deserializedEncryption.keyVaultProperties = keyVaultProperties;
                } else if ("keySource".equals(fieldName)) {
                    deserializedEncryption.keySource = KeySource.fromString(reader.getString());
                } else if ("requireInfrastructureEncryption".equals(fieldName)) {
                    deserializedEncryption.requireInfrastructureEncryption = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryption;
        });
    }
}
