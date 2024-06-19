// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The secret management attributes.
 */
@Fluent
public final class SecretAttributes extends Attributes {
    /*
     * Creation time in seconds since 1970-01-01T00:00:00Z.
     */
    private Long created;

    /*
     * Last updated time in seconds since 1970-01-01T00:00:00Z.
     */
    private Long updated;

    /**
     * Creates an instance of SecretAttributes class.
     */
    public SecretAttributes() {
    }

    /**
     * Get the created property: Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the created value.
     */
    @Override
    public OffsetDateTime created() {
        if (this.created == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.created), ZoneOffset.UTC);
    }

    /**
     * Get the updated property: Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     * @return the updated value.
     */
    @Override
    public OffsetDateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.updated), ZoneOffset.UTC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretAttributes withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretAttributes withNotBefore(OffsetDateTime notBefore) {
        super.withNotBefore(notBefore);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecretAttributes withExpires(OffsetDateTime expires) {
        super.withExpires(expires);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", enabled());
        if (notBefore() != null) {
            jsonWriter.writeNumberField("nbf", notBefore().toEpochSecond());
        }
        if (expires() != null) {
            jsonWriter.writeNumberField("exp", expires().toEpochSecond());
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretAttributes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretAttributes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretAttributes.
     */
    public static SecretAttributes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretAttributes deserializedSecretAttributes = new SecretAttributes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedSecretAttributes.withEnabled(reader.getNullable(JsonReader::getBoolean));
                } else if ("nbf".equals(fieldName)) {
                    Long notBeforeHolder = reader.getNullable(JsonReader::getLong);
                    if (notBeforeHolder != null) {
                        deserializedSecretAttributes.withNotBefore(
                            OffsetDateTime.ofInstant(Instant.ofEpochSecond(notBeforeHolder), ZoneOffset.UTC));
                    }
                } else if ("exp".equals(fieldName)) {
                    Long expiresHolder = reader.getNullable(JsonReader::getLong);
                    if (expiresHolder != null) {
                        deserializedSecretAttributes.withExpires(
                            OffsetDateTime.ofInstant(Instant.ofEpochSecond(expiresHolder), ZoneOffset.UTC));
                    }
                } else if ("created".equals(fieldName)) {
                    deserializedSecretAttributes.created = reader.getNullable(JsonReader::getLong);
                } else if ("updated".equals(fieldName)) {
                    deserializedSecretAttributes.updated = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretAttributes;
        });
    }
}
