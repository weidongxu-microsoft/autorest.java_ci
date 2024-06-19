// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.generated.models.PermissionScope;
import com.azure.resourcemanager.storage.generated.models.SshPublicKey;
import java.io.IOException;
import java.util.List;

/**
 * The local user associated with the storage accounts.
 */
@Fluent
public final class LocalUserInner extends ProxyResource {
    /*
     * Storage account local user properties.
     */
    private LocalUserProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of LocalUserInner class.
     */
    public LocalUserInner() {
    }

    /**
     * Get the innerProperties property: Storage account local user properties.
     * 
     * @return the innerProperties value.
     */
    private LocalUserProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the permissionScopes property: The permission scopes of the local user.
     * 
     * @return the permissionScopes value.
     */
    public List<PermissionScope> permissionScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().permissionScopes();
    }

    /**
     * Set the permissionScopes property: The permission scopes of the local user.
     * 
     * @param permissionScopes the permissionScopes value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withPermissionScopes(List<PermissionScope> permissionScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withPermissionScopes(permissionScopes);
        return this;
    }

    /**
     * Get the homeDirectory property: Optional, local user home directory.
     * 
     * @return the homeDirectory value.
     */
    public String homeDirectory() {
        return this.innerProperties() == null ? null : this.innerProperties().homeDirectory();
    }

    /**
     * Set the homeDirectory property: Optional, local user home directory.
     * 
     * @param homeDirectory the homeDirectory value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHomeDirectory(String homeDirectory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * Get the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     * 
     * @return the sshAuthorizedKeys value.
     */
    public List<SshPublicKey> sshAuthorizedKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().sshAuthorizedKeys();
    }

    /**
     * Set the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     * 
     * @param sshAuthorizedKeys the sshAuthorizedKeys value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withSshAuthorizedKeys(sshAuthorizedKeys);
        return this;
    }

    /**
     * Get the sid property: A unique Security Identifier that is generated by the server.
     * 
     * @return the sid value.
     */
    public String sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Get the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     * 
     * @return the hasSharedKey value.
     */
    public Boolean hasSharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSharedKey();
    }

    /**
     * Set the hasSharedKey property: Indicates whether shared key exists. Set it to false to remove existing shared
     * key.
     * 
     * @param hasSharedKey the hasSharedKey value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSharedKey(Boolean hasSharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSharedKey(hasSharedKey);
        return this;
    }

    /**
     * Get the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     * @return the hasSshKey value.
     */
    public Boolean hasSshKey() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSshKey();
    }

    /**
     * Set the hasSshKey property: Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     * @param hasSshKey the hasSshKey value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSshKey(Boolean hasSshKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSshKey(hasSshKey);
        return this;
    }

    /**
     * Get the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     * 
     * @return the hasSshPassword value.
     */
    public Boolean hasSshPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().hasSshPassword();
    }

    /**
     * Set the hasSshPassword property: Indicates whether ssh password exists. Set it to false to remove existing SSH
     * password.
     * 
     * @param hasSshPassword the hasSshPassword value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withHasSshPassword(Boolean hasSshPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withHasSshPassword(hasSshPassword);
        return this;
    }

    /**
     * Get the userId property: A unique Identifier that is generated by the server.
     * 
     * @return the userId value.
     */
    public Integer userId() {
        return this.innerProperties() == null ? null : this.innerProperties().userId();
    }

    /**
     * Get the groupId property: An identifier for associating a group of users.
     * 
     * @return the groupId value.
     */
    public Integer groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: An identifier for associating a group of users.
     * 
     * @param groupId the groupId value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withGroupId(Integer groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the allowAclAuthorization property: Indicates whether ACL authorization is allowed for this user. Set it to
     * false to disallow using ACL authorization.
     * 
     * @return the allowAclAuthorization value.
     */
    public Boolean allowAclAuthorization() {
        return this.innerProperties() == null ? null : this.innerProperties().allowAclAuthorization();
    }

    /**
     * Set the allowAclAuthorization property: Indicates whether ACL authorization is allowed for this user. Set it to
     * false to disallow using ACL authorization.
     * 
     * @param allowAclAuthorization the allowAclAuthorization value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withAllowAclAuthorization(Boolean allowAclAuthorization) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withAllowAclAuthorization(allowAclAuthorization);
        return this;
    }

    /**
     * Get the extendedGroups property: Supplementary group membership. Only applicable for local users enabled for
     * NFSv3 access.
     * 
     * @return the extendedGroups value.
     */
    public List<Integer> extendedGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedGroups();
    }

    /**
     * Set the extendedGroups property: Supplementary group membership. Only applicable for local users enabled for
     * NFSv3 access.
     * 
     * @param extendedGroups the extendedGroups value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withExtendedGroups(List<Integer> extendedGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withExtendedGroups(extendedGroups);
        return this;
    }

    /**
     * Get the isNFSv3Enabled property: Indicates if the local user is enabled for access with NFSv3 protocol.
     * 
     * @return the isNFSv3Enabled value.
     */
    public Boolean isNFSv3Enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isNFSv3Enabled();
    }

    /**
     * Set the isNFSv3Enabled property: Indicates if the local user is enabled for access with NFSv3 protocol.
     * 
     * @param isNFSv3Enabled the isNFSv3Enabled value to set.
     * @return the LocalUserInner object itself.
     */
    public LocalUserInner withIsNFSv3Enabled(Boolean isNFSv3Enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LocalUserProperties();
        }
        this.innerProperties().withIsNFSv3Enabled(isNFSv3Enabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LocalUserInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LocalUserInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LocalUserInner.
     */
    public static LocalUserInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LocalUserInner deserializedLocalUserInner = new LocalUserInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLocalUserInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedLocalUserInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLocalUserInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedLocalUserInner.innerProperties = LocalUserProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedLocalUserInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLocalUserInner;
        });
    }
}
