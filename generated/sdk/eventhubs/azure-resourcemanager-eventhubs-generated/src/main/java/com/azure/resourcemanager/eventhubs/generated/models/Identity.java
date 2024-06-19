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
import java.util.Map;

/**
 * Properties to configure Identity for Bring your Own Keys.
 */
@Fluent
public final class Identity implements JsonSerializable<Identity> {
    /*
     * ObjectId from the KeyVault
     */
    private String principalId;

    /*
     * TenantId from the KeyVault
     */
    private String tenantId;

    /*
     * Type of managed service identity.
     */
    private ManagedServiceIdentityType type;

    /*
     * Properties for User Assigned Identities
     */
    private Map<String, UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of Identity class.
     */
    public Identity() {
    }

    /**
     * Get the principalId property: ObjectId from the KeyVault.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: TenantId from the KeyVault.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: Type of managed service identity.
     * 
     * @return the type value.
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of managed service identity.
     * 
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: Properties for User Assigned Identities.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: Properties for User Assigned Identities.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the Identity object itself.
     */
    public Identity withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeMapField("userAssignedIdentities", this.userAssignedIdentities,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Identity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Identity if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Identity.
     */
    public static Identity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Identity deserializedIdentity = new Identity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalId".equals(fieldName)) {
                    deserializedIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedIdentity.tenantId = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIdentity.type = ManagedServiceIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedIdentity> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedIdentity.fromJson(reader1));
                    deserializedIdentity.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentity;
        });
    }
}
