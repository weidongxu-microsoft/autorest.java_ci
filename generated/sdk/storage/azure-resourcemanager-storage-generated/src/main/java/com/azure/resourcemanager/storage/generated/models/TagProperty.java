// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A tag of the LegalHold of a blob container.
 */
@Immutable
public final class TagProperty implements JsonSerializable<TagProperty> {
    /*
     * The tag value.
     */
    private String tag;

    /*
     * Returns the date and time the tag was added.
     */
    private OffsetDateTime timestamp;

    /*
     * Returns the Object ID of the user who added the tag.
     */
    private String objectIdentifier;

    /*
     * Returns the Tenant ID that issued the token for the user who added the tag.
     */
    private String tenantId;

    /*
     * Returns the User Principal Name of the user who added the tag.
     */
    private String upn;

    /**
     * Creates an instance of TagProperty class.
     */
    public TagProperty() {
    }

    /**
     * Get the tag property: The tag value.
     * 
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Get the timestamp property: Returns the date and time the tag was added.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the objectIdentifier property: Returns the Object ID of the user who added the tag.
     * 
     * @return the objectIdentifier value.
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get the tenantId property: Returns the Tenant ID that issued the token for the user who added the tag.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the upn property: Returns the User Principal Name of the user who added the tag.
     * 
     * @return the upn value.
     */
    public String upn() {
        return this.upn;
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
     * Reads an instance of TagProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TagProperty.
     */
    public static TagProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagProperty deserializedTagProperty = new TagProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tag".equals(fieldName)) {
                    deserializedTagProperty.tag = reader.getString();
                } else if ("timestamp".equals(fieldName)) {
                    deserializedTagProperty.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("objectIdentifier".equals(fieldName)) {
                    deserializedTagProperty.objectIdentifier = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedTagProperty.tenantId = reader.getString();
                } else if ("upn".equals(fieldName)) {
                    deserializedTagProperty.upn = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagProperty;
        });
    }
}
