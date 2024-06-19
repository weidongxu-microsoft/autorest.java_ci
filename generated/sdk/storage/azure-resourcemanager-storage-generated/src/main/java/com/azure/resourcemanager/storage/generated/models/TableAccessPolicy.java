// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Table Access Policy Properties Object.
 */
@Fluent
public final class TableAccessPolicy implements JsonSerializable<TableAccessPolicy> {
    /*
     * Start time of the access policy
     */
    private OffsetDateTime startTime;

    /*
     * Expiry time of the access policy
     */
    private OffsetDateTime expiryTime;

    /*
     * Required. List of abbreviated permissions. Supported permission values include 'r','a','u','d'
     */
    private String permission;

    /**
     * Creates an instance of TableAccessPolicy class.
     */
    public TableAccessPolicy() {
    }

    /**
     * Get the startTime property: Start time of the access policy.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the access policy.
     * 
     * @param startTime the startTime value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the expiryTime property: Expiry time of the access policy.
     * 
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: Expiry time of the access policy.
     * 
     * @param expiryTime the expiryTime value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the permission property: Required. List of abbreviated permissions. Supported permission values include
     * 'r','a','u','d'.
     * 
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission property: Required. List of abbreviated permissions. Supported permission values include
     * 'r','a','u','d'.
     * 
     * @param permission the permission value to set.
     * @return the TableAccessPolicy object itself.
     */
    public TableAccessPolicy withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permission() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property permission in model TableAccessPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TableAccessPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("permission", this.permission);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("expiryTime",
            this.expiryTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiryTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableAccessPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableAccessPolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TableAccessPolicy.
     */
    public static TableAccessPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableAccessPolicy deserializedTableAccessPolicy = new TableAccessPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("permission".equals(fieldName)) {
                    deserializedTableAccessPolicy.permission = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedTableAccessPolicy.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiryTime".equals(fieldName)) {
                    deserializedTableAccessPolicy.expiryTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableAccessPolicy;
        });
    }
}
