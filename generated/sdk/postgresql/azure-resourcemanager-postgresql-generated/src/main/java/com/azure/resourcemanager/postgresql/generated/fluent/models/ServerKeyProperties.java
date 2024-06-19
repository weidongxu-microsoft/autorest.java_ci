// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresql.generated.models.ServerKeyType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties for a key execution.
 */
@Fluent
public final class ServerKeyProperties implements JsonSerializable<ServerKeyProperties> {
    /*
     * The key type like 'AzureKeyVault'.
     */
    private ServerKeyType serverKeyType;

    /*
     * The URI of the key.
     */
    private String uri;

    /*
     * The key creation date.
     */
    private OffsetDateTime creationDate;

    /**
     * Creates an instance of ServerKeyProperties class.
     */
    public ServerKeyProperties() {
    }

    /**
     * Get the serverKeyType property: The key type like 'AzureKeyVault'.
     * 
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The key type like 'AzureKeyVault'.
     * 
     * @param serverKeyType the serverKeyType value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the key.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the key.
     * 
     * @param uri the uri value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the creationDate property: The key creation date.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverKeyType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property serverKeyType in model ServerKeyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerKeyProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("serverKeyType", this.serverKeyType == null ? null : this.serverKeyType.toString());
        jsonWriter.writeStringField("uri", this.uri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerKeyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerKeyProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerKeyProperties.
     */
    public static ServerKeyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerKeyProperties deserializedServerKeyProperties = new ServerKeyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serverKeyType".equals(fieldName)) {
                    deserializedServerKeyProperties.serverKeyType = ServerKeyType.fromString(reader.getString());
                } else if ("uri".equals(fieldName)) {
                    deserializedServerKeyProperties.uri = reader.getString();
                } else if ("creationDate".equals(fieldName)) {
                    deserializedServerKeyProperties.creationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerKeyProperties;
        });
    }
}
