// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be
 * used to encrypt disks.
 */
@Fluent
public final class EncryptionSetIdentity implements JsonSerializable<EncryptionSetIdentity> {
    /*
     * The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is supported for new creations.
     * Disk Encryption Sets can be updated with Identity type None during migration of subscription to a new Azure
     * Active Directory tenant; it will cause the encrypted resources to lose access to the keys.
     */
    private DiskEncryptionSetIdentityType type;

    /*
     * The object id of the Managed Identity Resource. This will be sent to the RP from ARM via the
     * x-ms-identity-principal-id header in the PUT request if the resource has a systemAssigned(implicit) identity
     */
    private String principalId;

    /*
     * The tenant id of the Managed Identity Resource. This will be sent to the RP from ARM via the
     * x-ms-client-tenant-id header in the PUT request if the resource has a systemAssigned(implicit) identity
     */
    private String tenantId;

    /*
     * The list of user identities associated with the disk encryption set. The user identity dictionary key references
     * will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/
     * userAssignedIdentities/{identityName}'.
     */
    private Map<String, UserAssignedIdentitiesValue> userAssignedIdentities;

    /**
     * Creates an instance of EncryptionSetIdentity class.
     */
    public EncryptionSetIdentity() {
    }

    /**
     * Get the type property: The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is
     * supported for new creations. Disk Encryption Sets can be updated with Identity type None during migration of
     * subscription to a new Azure Active Directory tenant; it will cause the encrypted resources to lose access to the
     * keys.
     * 
     * @return the type value.
     */
    public DiskEncryptionSetIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is
     * supported for new creations. Disk Encryption Sets can be updated with Identity type None during migration of
     * subscription to a new Azure Active Directory tenant; it will cause the encrypted resources to lose access to the
     * keys.
     * 
     * @param type the type value to set.
     * @return the EncryptionSetIdentity object itself.
     */
    public EncryptionSetIdentity withType(DiskEncryptionSetIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The object id of the Managed Identity Resource. This will be sent to the RP from
     * ARM via the x-ms-identity-principal-id header in the PUT request if the resource has a systemAssigned(implicit)
     * identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id of the Managed Identity Resource. This will be sent to the RP from ARM
     * via the x-ms-client-tenant-id header in the PUT request if the resource has a systemAssigned(implicit) identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the disk encryption set. The
     * user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentitiesValue> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the disk encryption set. The
     * user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the EncryptionSetIdentity object itself.
     */
    public EncryptionSetIdentity
        withUserAssignedIdentities(Map<String, UserAssignedIdentitiesValue> userAssignedIdentities) {
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
     * Reads an instance of EncryptionSetIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionSetIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionSetIdentity.
     */
    public static EncryptionSetIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionSetIdentity deserializedEncryptionSetIdentity = new EncryptionSetIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedEncryptionSetIdentity.type
                        = DiskEncryptionSetIdentityType.fromString(reader.getString());
                } else if ("principalId".equals(fieldName)) {
                    deserializedEncryptionSetIdentity.principalId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedEncryptionSetIdentity.tenantId = reader.getString();
                } else if ("userAssignedIdentities".equals(fieldName)) {
                    Map<String, UserAssignedIdentitiesValue> userAssignedIdentities
                        = reader.readMap(reader1 -> UserAssignedIdentitiesValue.fromJson(reader1));
                    deserializedEncryptionSetIdentity.userAssignedIdentities = userAssignedIdentities;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionSetIdentity;
        });
    }
}
