// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterPrincipalAssignmentInner;

/**
 * An immutable client-side representation of ClusterPrincipalAssignment.
 */
public interface ClusterPrincipalAssignment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the principalId property: The principal ID assigned to the cluster principal. It can be a user email,
     * application ID, or security group name.
     * 
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the role property: Cluster principal role.
     * 
     * @return the role value.
     */
    ClusterPrincipalRole role();

    /**
     * Gets the tenantId property: The tenant id of the principal.
     * 
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the principalType property: Principal type.
     * 
     * @return the principalType value.
     */
    PrincipalType principalType();

    /**
     * Gets the tenantName property: The tenant name of the principal.
     * 
     * @return the tenantName value.
     */
    String tenantName();

    /**
     * Gets the principalName property: The principal name.
     * 
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the aadObjectId property: The service principal object id in AAD (Azure active directory).
     * 
     * @return the aadObjectId value.
     */
    String aadObjectId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.azurekusto.generated.fluent.models.ClusterPrincipalAssignmentInner
     * object.
     * 
     * @return the inner object.
     */
    ClusterPrincipalAssignmentInner innerModel();

    /**
     * The entirety of the ClusterPrincipalAssignment definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ClusterPrincipalAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ClusterPrincipalAssignment definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName The name of the Kusto cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPrincipalId, DefinitionStages.WithRole,
            DefinitionStages.WithTenantId, DefinitionStages.WithPrincipalType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ClusterPrincipalAssignment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ClusterPrincipalAssignment create(Context context);
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition allowing to specify principalId.
         */
        interface WithPrincipalId {
            /**
             * Specifies the principalId property: The principal ID assigned to the cluster principal. It can be a user
             * email, application ID, or security group name..
             * 
             * @param principalId The principal ID assigned to the cluster principal. It can be a user email,
             * application ID, or security group name.
             * @return the next definition stage.
             */
            WithCreate withPrincipalId(String principalId);
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition allowing to specify role.
         */
        interface WithRole {
            /**
             * Specifies the role property: Cluster principal role..
             * 
             * @param role Cluster principal role.
             * @return the next definition stage.
             */
            WithCreate withRole(ClusterPrincipalRole role);
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition allowing to specify tenantId.
         */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The tenant id of the principal.
             * 
             * @param tenantId The tenant id of the principal.
             * @return the next definition stage.
             */
            WithCreate withTenantId(String tenantId);
        }

        /**
         * The stage of the ClusterPrincipalAssignment definition allowing to specify principalType.
         */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: Principal type..
             * 
             * @param principalType Principal type.
             * @return the next definition stage.
             */
            WithCreate withPrincipalType(PrincipalType principalType);
        }
    }

    /**
     * Begins update for the ClusterPrincipalAssignment resource.
     * 
     * @return the stage of resource update.
     */
    ClusterPrincipalAssignment.Update update();

    /**
     * The template for ClusterPrincipalAssignment update.
     */
    interface Update extends UpdateStages.WithPrincipalId, UpdateStages.WithRole, UpdateStages.WithTenantId,
        UpdateStages.WithPrincipalType {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ClusterPrincipalAssignment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ClusterPrincipalAssignment apply(Context context);
    }

    /**
     * The ClusterPrincipalAssignment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ClusterPrincipalAssignment update allowing to specify principalId.
         */
        interface WithPrincipalId {
            /**
             * Specifies the principalId property: The principal ID assigned to the cluster principal. It can be a user
             * email, application ID, or security group name..
             * 
             * @param principalId The principal ID assigned to the cluster principal. It can be a user email,
             * application ID, or security group name.
             * @return the next definition stage.
             */
            Update withPrincipalId(String principalId);
        }

        /**
         * The stage of the ClusterPrincipalAssignment update allowing to specify role.
         */
        interface WithRole {
            /**
             * Specifies the role property: Cluster principal role..
             * 
             * @param role Cluster principal role.
             * @return the next definition stage.
             */
            Update withRole(ClusterPrincipalRole role);
        }

        /**
         * The stage of the ClusterPrincipalAssignment update allowing to specify tenantId.
         */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: The tenant id of the principal.
             * 
             * @param tenantId The tenant id of the principal.
             * @return the next definition stage.
             */
            Update withTenantId(String tenantId);
        }

        /**
         * The stage of the ClusterPrincipalAssignment update allowing to specify principalType.
         */
        interface WithPrincipalType {
            /**
             * Specifies the principalType property: Principal type..
             * 
             * @param principalType Principal type.
             * @return the next definition stage.
             */
            Update withPrincipalType(PrincipalType principalType);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ClusterPrincipalAssignment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ClusterPrincipalAssignment refresh(Context context);
}
