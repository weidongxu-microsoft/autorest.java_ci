// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * RemoteApplicationType for which remote support settings is being modified.
 */
@Fluent
public final class RemoteSupportSettings implements JsonSerializable<RemoteSupportSettings> {
    /*
     * Remote application type
     */
    private RemoteApplicationType remoteApplicationType;

    /*
     * Access level allowed for this remote application type
     */
    private AccessLevel accessLevel;

    /*
     * Expiration time stamp
     */
    private OffsetDateTime expirationTimestampInUtc;

    /**
     * Creates an instance of RemoteSupportSettings class.
     */
    public RemoteSupportSettings() {
    }

    /**
     * Get the remoteApplicationType property: Remote application type.
     * 
     * @return the remoteApplicationType value.
     */
    public RemoteApplicationType remoteApplicationType() {
        return this.remoteApplicationType;
    }

    /**
     * Set the remoteApplicationType property: Remote application type.
     * 
     * @param remoteApplicationType the remoteApplicationType value to set.
     * @return the RemoteSupportSettings object itself.
     */
    public RemoteSupportSettings withRemoteApplicationType(RemoteApplicationType remoteApplicationType) {
        this.remoteApplicationType = remoteApplicationType;
        return this;
    }

    /**
     * Get the accessLevel property: Access level allowed for this remote application type.
     * 
     * @return the accessLevel value.
     */
    public AccessLevel accessLevel() {
        return this.accessLevel;
    }

    /**
     * Set the accessLevel property: Access level allowed for this remote application type.
     * 
     * @param accessLevel the accessLevel value to set.
     * @return the RemoteSupportSettings object itself.
     */
    public RemoteSupportSettings withAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * Get the expirationTimestampInUtc property: Expiration time stamp.
     * 
     * @return the expirationTimestampInUtc value.
     */
    public OffsetDateTime expirationTimestampInUtc() {
        return this.expirationTimestampInUtc;
    }

    /**
     * Set the expirationTimestampInUtc property: Expiration time stamp.
     * 
     * @param expirationTimestampInUtc the expirationTimestampInUtc value to set.
     * @return the RemoteSupportSettings object itself.
     */
    public RemoteSupportSettings withExpirationTimestampInUtc(OffsetDateTime expirationTimestampInUtc) {
        this.expirationTimestampInUtc = expirationTimestampInUtc;
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
        jsonWriter.writeStringField("remoteApplicationType",
            this.remoteApplicationType == null ? null : this.remoteApplicationType.toString());
        jsonWriter.writeStringField("accessLevel", this.accessLevel == null ? null : this.accessLevel.toString());
        jsonWriter.writeStringField("expirationTimeStampInUTC",
            this.expirationTimestampInUtc == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationTimestampInUtc));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RemoteSupportSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemoteSupportSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RemoteSupportSettings.
     */
    public static RemoteSupportSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemoteSupportSettings deserializedRemoteSupportSettings = new RemoteSupportSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("remoteApplicationType".equals(fieldName)) {
                    deserializedRemoteSupportSettings.remoteApplicationType
                        = RemoteApplicationType.fromString(reader.getString());
                } else if ("accessLevel".equals(fieldName)) {
                    deserializedRemoteSupportSettings.accessLevel = AccessLevel.fromString(reader.getString());
                } else if ("expirationTimeStampInUTC".equals(fieldName)) {
                    deserializedRemoteSupportSettings.expirationTimestampInUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRemoteSupportSettings;
        });
    }
}
