// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.authorization.generated.models.DenyAssignmentPermission;
import com.azure.resourcemanager.authorization.generated.models.Principal;
import java.io.IOException;
import java.util.List;

/**
 * Deny assignment properties.
 */
@Fluent
public final class DenyAssignmentProperties implements JsonSerializable<DenyAssignmentProperties> {
    /*
     * The display name of the deny assignment.
     */
    private String denyAssignmentName;

    /*
     * The description of the deny assignment.
     */
    private String description;

    /*
     * An array of permissions that are denied by the deny assignment.
     */
    private List<DenyAssignmentPermission> permissions;

    /*
     * The deny assignment scope.
     */
    private String scope;

    /*
     * Determines if the deny assignment applies to child scopes. Default value is false.
     */
    private Boolean doNotApplyToChildScopes;

    /*
     * Array of principals to which the deny assignment applies.
     */
    private List<Principal> principals;

    /*
     * Array of principals to which the deny assignment does not apply.
     */
    private List<Principal> excludePrincipals;

    /*
     * Specifies whether this deny assignment was created by Azure and cannot be edited or deleted.
     */
    private Boolean isSystemProtected;

    /**
     * Creates an instance of DenyAssignmentProperties class.
     */
    public DenyAssignmentProperties() {
    }

    /**
     * Get the denyAssignmentName property: The display name of the deny assignment.
     * 
     * @return the denyAssignmentName value.
     */
    public String denyAssignmentName() {
        return this.denyAssignmentName;
    }

    /**
     * Set the denyAssignmentName property: The display name of the deny assignment.
     * 
     * @param denyAssignmentName the denyAssignmentName value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withDenyAssignmentName(String denyAssignmentName) {
        this.denyAssignmentName = denyAssignmentName;
        return this;
    }

    /**
     * Get the description property: The description of the deny assignment.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the deny assignment.
     * 
     * @param description the description value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the permissions property: An array of permissions that are denied by the deny assignment.
     * 
     * @return the permissions value.
     */
    public List<DenyAssignmentPermission> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: An array of permissions that are denied by the deny assignment.
     * 
     * @param permissions the permissions value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withPermissions(List<DenyAssignmentPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the scope property: The deny assignment scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The deny assignment scope.
     * 
     * @param scope the scope value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the doNotApplyToChildScopes property: Determines if the deny assignment applies to child scopes. Default
     * value is false.
     * 
     * @return the doNotApplyToChildScopes value.
     */
    public Boolean doNotApplyToChildScopes() {
        return this.doNotApplyToChildScopes;
    }

    /**
     * Set the doNotApplyToChildScopes property: Determines if the deny assignment applies to child scopes. Default
     * value is false.
     * 
     * @param doNotApplyToChildScopes the doNotApplyToChildScopes value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withDoNotApplyToChildScopes(Boolean doNotApplyToChildScopes) {
        this.doNotApplyToChildScopes = doNotApplyToChildScopes;
        return this;
    }

    /**
     * Get the principals property: Array of principals to which the deny assignment applies.
     * 
     * @return the principals value.
     */
    public List<Principal> principals() {
        return this.principals;
    }

    /**
     * Set the principals property: Array of principals to which the deny assignment applies.
     * 
     * @param principals the principals value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withPrincipals(List<Principal> principals) {
        this.principals = principals;
        return this;
    }

    /**
     * Get the excludePrincipals property: Array of principals to which the deny assignment does not apply.
     * 
     * @return the excludePrincipals value.
     */
    public List<Principal> excludePrincipals() {
        return this.excludePrincipals;
    }

    /**
     * Set the excludePrincipals property: Array of principals to which the deny assignment does not apply.
     * 
     * @param excludePrincipals the excludePrincipals value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withExcludePrincipals(List<Principal> excludePrincipals) {
        this.excludePrincipals = excludePrincipals;
        return this;
    }

    /**
     * Get the isSystemProtected property: Specifies whether this deny assignment was created by Azure and cannot be
     * edited or deleted.
     * 
     * @return the isSystemProtected value.
     */
    public Boolean isSystemProtected() {
        return this.isSystemProtected;
    }

    /**
     * Set the isSystemProtected property: Specifies whether this deny assignment was created by Azure and cannot be
     * edited or deleted.
     * 
     * @param isSystemProtected the isSystemProtected value to set.
     * @return the DenyAssignmentProperties object itself.
     */
    public DenyAssignmentProperties withIsSystemProtected(Boolean isSystemProtected) {
        this.isSystemProtected = isSystemProtected;
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
        if (principals() != null) {
            principals().forEach(e -> e.validate());
        }
        if (excludePrincipals() != null) {
            excludePrincipals().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("denyAssignmentName", this.denyAssignmentName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("permissions", this.permissions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeBooleanField("doNotApplyToChildScopes", this.doNotApplyToChildScopes);
        jsonWriter.writeArrayField("principals", this.principals, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("excludePrincipals", this.excludePrincipals,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("isSystemProtected", this.isSystemProtected);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DenyAssignmentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DenyAssignmentProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DenyAssignmentProperties.
     */
    public static DenyAssignmentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DenyAssignmentProperties deserializedDenyAssignmentProperties = new DenyAssignmentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("denyAssignmentName".equals(fieldName)) {
                    deserializedDenyAssignmentProperties.denyAssignmentName = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedDenyAssignmentProperties.description = reader.getString();
                } else if ("permissions".equals(fieldName)) {
                    List<DenyAssignmentPermission> permissions
                        = reader.readArray(reader1 -> DenyAssignmentPermission.fromJson(reader1));
                    deserializedDenyAssignmentProperties.permissions = permissions;
                } else if ("scope".equals(fieldName)) {
                    deserializedDenyAssignmentProperties.scope = reader.getString();
                } else if ("doNotApplyToChildScopes".equals(fieldName)) {
                    deserializedDenyAssignmentProperties.doNotApplyToChildScopes
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("principals".equals(fieldName)) {
                    List<Principal> principals = reader.readArray(reader1 -> Principal.fromJson(reader1));
                    deserializedDenyAssignmentProperties.principals = principals;
                } else if ("excludePrincipals".equals(fieldName)) {
                    List<Principal> excludePrincipals = reader.readArray(reader1 -> Principal.fromJson(reader1));
                    deserializedDenyAssignmentProperties.excludePrincipals = excludePrincipals;
                } else if ("isSystemProtected".equals(fieldName)) {
                    deserializedDenyAssignmentProperties.isSystemProtected = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDenyAssignmentProperties;
        });
    }
}
