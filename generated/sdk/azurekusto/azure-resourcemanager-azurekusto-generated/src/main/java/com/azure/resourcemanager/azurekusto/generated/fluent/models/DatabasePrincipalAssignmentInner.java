// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.azurekusto.generated.models.DatabasePrincipalRole;
import com.azure.resourcemanager.azurekusto.generated.models.PrincipalType;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing a database principal assignment.
 */
@Fluent
public final class DatabasePrincipalAssignmentInner extends ProxyResource {
    /*
     * The database principal.
     */
    @JsonProperty(value = "properties")
    private DatabasePrincipalProperties innerProperties;

    /**
     * Creates an instance of DatabasePrincipalAssignmentInner class.
     */
    public DatabasePrincipalAssignmentInner() {
    }

    /**
     * Get the innerProperties property: The database principal.
     * 
     * @return the innerProperties value.
     */
    private DatabasePrincipalProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID assigned to the database principal. It can be a user email,
     * application ID, or security group name.
     * 
     * @param principalId the principalId value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabasePrincipalProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the role property: Database principal role.
     * 
     * @return the role value.
     */
    public DatabasePrincipalRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Set the role property: Database principal role.
     * 
     * @param role the role value to set.
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withRole(DatabasePrincipalRole role) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabasePrincipalProperties();
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
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabasePrincipalProperties();
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
     * @return the DatabasePrincipalAssignmentInner object itself.
     */
    public DatabasePrincipalAssignmentInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabasePrincipalProperties();
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
}
