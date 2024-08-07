// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentInner;

/**
 * An immutable client-side representation of RoleAssignment.
 */
public interface RoleAssignment {
    /**
     * Gets the id property: The role assignment ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The role assignment name.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The role assignment type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the scope property: The role assignment scope.
     * 
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the roleDefinitionId property: The role definition ID.
     * 
     * @return the roleDefinitionId value.
     */
    String roleDefinitionId();

    /**
     * Gets the principalId property: The principal ID.
     * 
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the principalType property: The principal type of the assigned principal ID.
     * 
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * Gets the canDelegate property: The Delegation flag for the role assignment.
     * 
     * @return the canDelegate value.
     */
    Boolean canDelegate();

    /**
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentInner object.
     * 
     * @return the inner object.
     */
    RoleAssignmentInner innerModel();

    /**
     * The entirety of the RoleAssignment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope,
        DefinitionStages.WithRoleDefinitionId, DefinitionStages.WithPrincipalId, DefinitionStages.WithCreate {
    }

    /**
     * The RoleAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the RoleAssignment definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the RoleAssignment definition allowing to specify parent resource.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * 
             * @param scope The scope of the role assignment to create. The scope can be any REST resource instance. For
             * example, use '/subscriptions/{subscription-id}/' for a subscription,
             * '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
             * '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
             * for a resource.
             * @return the next definition stage.
             */
            WithRoleDefinitionId withExistingScope(String scope);
        }

        /**
         * The stage of the RoleAssignment definition allowing to specify roleDefinitionId.
         */
        interface WithRoleDefinitionId {
            /**
             * Specifies the roleDefinitionId property: The role definition ID used in the role assignment..
             * 
             * @param roleDefinitionId The role definition ID used in the role assignment.
             * @return the next definition stage.
             */
            WithPrincipalId withRoleDefinitionId(String roleDefinitionId);
        }

        /**
         * The stage of the RoleAssignment definition allowing to specify principalId.
         */
        interface WithPrincipalId {
            /**
             * Specifies the principalId property: The principal ID assigned to the role. This maps to the ID inside the
             * Active Directory. It can point to a user, service principal, or security group..
             * 
             * @param principalId The principal ID assigned to the role. This maps to the ID inside the Active
             * Directory. It can point to a user, service principal, or security group.
             * @return the next definition stage.
             */
            WithCreate withPrincipalId(String principalId);
        }

        /**
         * The stage of the RoleAssignment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPrincipalType, DefinitionStages.WithCanDelegate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            RoleAssignment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RoleAssignment create(Context context);
        }

        /**
         * The stage of the RoleAssignment definition allowing to specify principalType.
         */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: The principal type of the assigned principal ID..
             * 
             * @param principalType The principal type of the assigned principal ID.
             * @return the next definition stage.
             */
            WithCreate withPrincipalType(PrincipalType principalType);
        }

        /**
         * The stage of the RoleAssignment definition allowing to specify canDelegate.
         */
        interface WithCanDelegate {
            /**
             * Specifies the canDelegate property: The delegation flag used for creating a role assignment.
             * 
             * @param canDelegate The delegation flag used for creating a role assignment.
             * @return the next definition stage.
             */
            WithCreate withCanDelegate(Boolean canDelegate);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    RoleAssignment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RoleAssignment refresh(Context context);
}
