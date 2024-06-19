// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Role definition properties.
 */
@Fluent
public final class RoleDefinitionProperties implements JsonSerializable<RoleDefinitionProperties> {
    /*
     * The role name.
     */
    private String roleName;

    /*
     * The role definition description.
     */
    private String description;

    /*
     * The role type.
     */
    private String roleType;

    /*
     * Role definition permissions.
     */
    private List<PermissionInner> permissions;

    /*
     * Role definition assignable scopes.
     */
    private List<String> assignableScopes;

    /**
     * Creates an instance of RoleDefinitionProperties class.
     */
    public RoleDefinitionProperties() {
    }

    /**
     * Get the roleName property: The role name.
     * 
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: The role name.
     * 
     * @param roleName the roleName value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the description property: The role definition description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The role definition description.
     * 
     * @param description the description value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roleType property: The role type.
     * 
     * @return the roleType value.
     */
    public String roleType() {
        return this.roleType;
    }

    /**
     * Set the roleType property: The role type.
     * 
     * @param roleType the roleType value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the permissions property: Role definition permissions.
     * 
     * @return the permissions value.
     */
    public List<PermissionInner> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Role definition permissions.
     * 
     * @param permissions the permissions value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withPermissions(List<PermissionInner> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the assignableScopes property: Role definition assignable scopes.
     * 
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes property: Role definition assignable scopes.
     * 
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinitionProperties object itself.
     */
    public RoleDefinitionProperties withAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (permissions() != null) {
            permissions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("roleName", this.roleName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("type", this.roleType);
        jsonWriter.writeArrayField("permissions", this.permissions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("assignableScopes", this.assignableScopes,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleDefinitionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleDefinitionProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleDefinitionProperties.
     */
    public static RoleDefinitionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleDefinitionProperties deserializedRoleDefinitionProperties = new RoleDefinitionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("roleName".equals(fieldName)) {
                    deserializedRoleDefinitionProperties.roleName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedRoleDefinitionProperties.description = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRoleDefinitionProperties.roleType = reader.getString();
                } else if ("permissions".equals(fieldName)) {
                    List<PermissionInner> permissions = reader.readArray(reader1 -> PermissionInner.fromJson(reader1));
                    deserializedRoleDefinitionProperties.permissions = permissions;
                } else if ("assignableScopes".equals(fieldName)) {
                    List<String> assignableScopes = reader.readArray(reader1 -> reader1.getString());
                    deserializedRoleDefinitionProperties.assignableScopes = assignableScopes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleDefinitionProperties;
        });
    }
}
