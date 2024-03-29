// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role assignment properties.
 */
@Fluent
public final class RoleAssignmentProperties {
    /*
     * The role definition ID used in the role assignment.
     */
    @JsonProperty(value = "roleDefinitionId", required = true)
    private String roleDefinitionId;

    /*
     * The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user, service principal, or security group.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /*
     * The principal type of the assigned principal ID.
     */
    @JsonProperty(value = "principalType")
    private PrincipalType principalType;

    /*
     * The delegation flag used for creating a role assignment
     */
    @JsonProperty(value = "canDelegate")
    private Boolean canDelegate;

    /**
     * Creates an instance of RoleAssignmentProperties class.
     */
    public RoleAssignmentProperties() {
    }

    /**
     * Get the roleDefinitionId property: The role definition ID used in the role assignment.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID used in the role assignment.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user, service principal, or security group.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the role. This maps to the ID inside the Active Directory. It can point to a user, service principal, or security group.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     * 
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the canDelegate property: The delegation flag used for creating a role assignment.
     * 
     * @return the canDelegate value.
     */
    public Boolean canDelegate() {
        return this.canDelegate;
    }

    /**
     * Set the canDelegate property: The delegation flag used for creating a role assignment.
     * 
     * @param canDelegate the canDelegate value to set.
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withCanDelegate(Boolean canDelegate) {
        this.canDelegate = canDelegate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (roleDefinitionId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property roleDefinitionId in model RoleAssignmentProperties"));
        }
        if (principalId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property principalId in model RoleAssignmentProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleAssignmentProperties.class);
}
