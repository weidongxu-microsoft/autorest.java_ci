// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurekusto.generated.models.ClusterPrincipalRole;
import com.azure.resourcemanager.azurekusto.generated.models.PrincipalType;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Class representing a cluster principal assignment.
 */
@Fluent
public final class ClusterPrincipalAssignmentInner extends ProxyResource {
    /*
     * The cluster principal.
     */
    private ClusterPrincipalProperties innerProperties;

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
     * Creates an instance of ClusterPrincipalAssignmentInner class.
     */
    public ClusterPrincipalAssignmentInner() {
    }

    /**
     * Get the innerProperties property: The cluster principal.
     * 
     * @return the innerProperties value.
     */
    private ClusterPrincipalProperties innerProperties() {
        return this.innerProperties;
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
     * Get the principalId property: The principal ID assigned to the cluster principal. It can be a user email,
     * application ID, or security group name.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID assigned to the cluster principal. It can be a user email,
     * application ID, or security group name.
     * 
     * @param principalId the principalId value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the role property: Cluster principal role.
     * 
     * @return the role value.
     */
    public ClusterPrincipalRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Set the role property: Cluster principal role.
     * 
     * @param role the role value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withRole(ClusterPrincipalRole role) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withRole(role);
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of the principal.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenant id of the principal.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the principalType property: Principal type.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: Principal type.
     * 
     * @param principalType the principalType value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the tenantName property: The tenant name of the principal.
     * 
     * @return the tenantName value.
     */
    public String tenantName() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantName();
    }

    /**
     * Get the principalName property: The principal name.
     * 
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the aadObjectId property: The service principal object id in AAD (Azure active directory).
     * 
     * @return the aadObjectId value.
     */
    public String aadObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadObjectId();
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
     * Reads an instance of ClusterPrincipalAssignmentInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPrincipalAssignmentInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPrincipalAssignmentInner.
     */
    public static ClusterPrincipalAssignmentInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPrincipalAssignmentInner deserializedClusterPrincipalAssignmentInner
                = new ClusterPrincipalAssignmentInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterPrincipalAssignmentInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterPrincipalAssignmentInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterPrincipalAssignmentInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterPrincipalAssignmentInner.innerProperties
                        = ClusterPrincipalProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPrincipalAssignmentInner;
        });
    }
}
