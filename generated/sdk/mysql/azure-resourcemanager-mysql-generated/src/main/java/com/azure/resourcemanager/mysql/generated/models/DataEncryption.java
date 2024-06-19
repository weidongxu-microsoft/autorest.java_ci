// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The date encryption for cmk.
 */
@Fluent
public final class DataEncryption implements JsonSerializable<DataEncryption> {
    /*
     * Primary user identity resource id
     */
    private String primaryUserAssignedIdentityId;

    /*
     * Primary key uri
     */
    private String primaryKeyUri;

    /*
     * Geo backup user identity resource id as identity can't cross region, need identity in same region as geo backup
     */
    private String geoBackupUserAssignedIdentityId;

    /*
     * Geo backup key uri as key vault can't cross region, need cmk in same region as geo backup
     */
    private String geoBackupKeyUri;

    /*
     * The key type, AzureKeyVault for enable cmk, SystemManaged for disable cmk.
     */
    private DataEncryptionType type;

    /**
     * Creates an instance of DataEncryption class.
     */
    public DataEncryption() {
    }

    /**
     * Get the primaryUserAssignedIdentityId property: Primary user identity resource id.
     * 
     * @return the primaryUserAssignedIdentityId value.
     */
    public String primaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId;
    }

    /**
     * Set the primaryUserAssignedIdentityId property: Primary user identity resource id.
     * 
     * @param primaryUserAssignedIdentityId the primaryUserAssignedIdentityId value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withPrimaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        return this;
    }

    /**
     * Get the primaryKeyUri property: Primary key uri.
     * 
     * @return the primaryKeyUri value.
     */
    public String primaryKeyUri() {
        return this.primaryKeyUri;
    }

    /**
     * Set the primaryKeyUri property: Primary key uri.
     * 
     * @param primaryKeyUri the primaryKeyUri value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withPrimaryKeyUri(String primaryKeyUri) {
        this.primaryKeyUri = primaryKeyUri;
        return this;
    }

    /**
     * Get the geoBackupUserAssignedIdentityId property: Geo backup user identity resource id as identity can't cross
     * region, need identity in same region as geo backup.
     * 
     * @return the geoBackupUserAssignedIdentityId value.
     */
    public String geoBackupUserAssignedIdentityId() {
        return this.geoBackupUserAssignedIdentityId;
    }

    /**
     * Set the geoBackupUserAssignedIdentityId property: Geo backup user identity resource id as identity can't cross
     * region, need identity in same region as geo backup.
     * 
     * @param geoBackupUserAssignedIdentityId the geoBackupUserAssignedIdentityId value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withGeoBackupUserAssignedIdentityId(String geoBackupUserAssignedIdentityId) {
        this.geoBackupUserAssignedIdentityId = geoBackupUserAssignedIdentityId;
        return this;
    }

    /**
     * Get the geoBackupKeyUri property: Geo backup key uri as key vault can't cross region, need cmk in same region as
     * geo backup.
     * 
     * @return the geoBackupKeyUri value.
     */
    public String geoBackupKeyUri() {
        return this.geoBackupKeyUri;
    }

    /**
     * Set the geoBackupKeyUri property: Geo backup key uri as key vault can't cross region, need cmk in same region as
     * geo backup.
     * 
     * @param geoBackupKeyUri the geoBackupKeyUri value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withGeoBackupKeyUri(String geoBackupKeyUri) {
        this.geoBackupKeyUri = geoBackupKeyUri;
        return this;
    }

    /**
     * Get the type property: The key type, AzureKeyVault for enable cmk, SystemManaged for disable cmk.
     * 
     * @return the type value.
     */
    public DataEncryptionType type() {
        return this.type;
    }

    /**
     * Set the type property: The key type, AzureKeyVault for enable cmk, SystemManaged for disable cmk.
     * 
     * @param type the type value to set.
     * @return the DataEncryption object itself.
     */
    public DataEncryption withType(DataEncryptionType type) {
        this.type = type;
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
        jsonWriter.writeStringField("primaryUserAssignedIdentityId", this.primaryUserAssignedIdentityId);
        jsonWriter.writeStringField("primaryKeyURI", this.primaryKeyUri);
        jsonWriter.writeStringField("geoBackupUserAssignedIdentityId", this.geoBackupUserAssignedIdentityId);
        jsonWriter.writeStringField("geoBackupKeyURI", this.geoBackupKeyUri);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataEncryption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataEncryption if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataEncryption.
     */
    public static DataEncryption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataEncryption deserializedDataEncryption = new DataEncryption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("primaryUserAssignedIdentityId".equals(fieldName)) {
                    deserializedDataEncryption.primaryUserAssignedIdentityId = reader.getString();
                } else if ("primaryKeyURI".equals(fieldName)) {
                    deserializedDataEncryption.primaryKeyUri = reader.getString();
                } else if ("geoBackupUserAssignedIdentityId".equals(fieldName)) {
                    deserializedDataEncryption.geoBackupUserAssignedIdentityId = reader.getString();
                } else if ("geoBackupKeyURI".equals(fieldName)) {
                    deserializedDataEncryption.geoBackupKeyUri = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDataEncryption.type = DataEncryptionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataEncryption;
        });
    }
}
