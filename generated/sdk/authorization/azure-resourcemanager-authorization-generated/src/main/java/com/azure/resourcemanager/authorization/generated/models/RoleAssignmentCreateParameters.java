// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role assignment create parameters.
 */
@Fluent
public final class RoleAssignmentCreateParameters {
    /*
     * Role assignment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RoleAssignmentProperties innerProperties = new RoleAssignmentProperties();

    /**
     * Creates an instance of RoleAssignmentCreateParameters class.
     */
    public RoleAssignmentCreateParameters() {
    }

    /**
     * Get the innerProperties property: Role assignment properties.
     * 
     * @return the innerProperties value.
     */
    private RoleAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID used in the role assignment.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The role definition ID used in the role assignment.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user, service principal, or security group.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user, service principal, or security group.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     * 
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the canDelegate property: The delegation flag used for creating a role assignment.
     * 
     * @return the canDelegate value.
     */
    public Boolean canDelegate() {
        return this.innerProperties() == null ? null : this.innerProperties().canDelegate();
    }

    /**
     * Set the canDelegate property: The delegation flag used for creating a role assignment.
     * 
     * @param canDelegate the canDelegate value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withCanDelegate(Boolean canDelegate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentProperties();
        }
        this.innerProperties().withCanDelegate(canDelegate);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model RoleAssignmentCreateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleAssignmentCreateParameters.class);
}
