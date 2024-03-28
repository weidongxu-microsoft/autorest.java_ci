// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LinkedServiceInner;
import java.util.Map;

/**
 * An immutable client-side representation of LinkedService.
 */
public interface LinkedService {
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
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the resourceId property: The resource id of the resource that will be linked to the workspace. This should
     * be used for linking resources which require read access.
     * 
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the writeAccessResourceId property: The resource id of the resource that will be linked to the workspace.
     * This should be used for linking resources which require write access.
     * 
     * @return the writeAccessResourceId value.
     */
    String writeAccessResourceId();

    /**
     * Gets the provisioningState property: The provisioning state of the linked service.
     * 
     * @return the provisioningState value.
     */
    LinkedServiceEntityStatus provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.operationalinsights.generated.fluent.models.LinkedServiceInner object.
     * 
     * @return the inner object.
     */
    LinkedServiceInner innerModel();

    /**
     * The entirety of the LinkedService definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The LinkedService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the LinkedService definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the LinkedService definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the LinkedService definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithResourceId,
            DefinitionStages.WithWriteAccessResourceId, DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            LinkedService create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LinkedService create(Context context);
        }

        /**
         * The stage of the LinkedService definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the LinkedService definition allowing to specify resourceId.
         */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: The resource id of the resource that will be linked to the workspace.
             * This should be used for linking resources which require read access.
             * 
             * @param resourceId The resource id of the resource that will be linked to the workspace. This should be
             * used for linking resources which require read access.
             * @return the next definition stage.
             */
            WithCreate withResourceId(String resourceId);
        }

        /**
         * The stage of the LinkedService definition allowing to specify writeAccessResourceId.
         */
        interface WithWriteAccessResourceId {
            /**
             * Specifies the writeAccessResourceId property: The resource id of the resource that will be linked to the
             * workspace. This should be used for linking resources which require write access.
             * 
             * @param writeAccessResourceId The resource id of the resource that will be linked to the workspace. This
             * should be used for linking resources which require write access.
             * @return the next definition stage.
             */
            WithCreate withWriteAccessResourceId(String writeAccessResourceId);
        }

        /**
         * The stage of the LinkedService definition allowing to specify provisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning state of the linked service..
             * 
             * @param provisioningState The provisioning state of the linked service.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(LinkedServiceEntityStatus provisioningState);
        }
    }

    /**
     * Begins update for the LinkedService resource.
     * 
     * @return the stage of resource update.
     */
    LinkedService.Update update();

    /**
     * The template for LinkedService update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithResourceId, UpdateStages.WithWriteAccessResourceId,
        UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        LinkedService apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LinkedService apply(Context context);
    }

    /**
     * The LinkedService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the LinkedService update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the LinkedService update allowing to specify resourceId.
         */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: The resource id of the resource that will be linked to the workspace.
             * This should be used for linking resources which require read access.
             * 
             * @param resourceId The resource id of the resource that will be linked to the workspace. This should be
             * used for linking resources which require read access.
             * @return the next definition stage.
             */
            Update withResourceId(String resourceId);
        }

        /**
         * The stage of the LinkedService update allowing to specify writeAccessResourceId.
         */
        interface WithWriteAccessResourceId {
            /**
             * Specifies the writeAccessResourceId property: The resource id of the resource that will be linked to the
             * workspace. This should be used for linking resources which require write access.
             * 
             * @param writeAccessResourceId The resource id of the resource that will be linked to the workspace. This
             * should be used for linking resources which require write access.
             * @return the next definition stage.
             */
            Update withWriteAccessResourceId(String writeAccessResourceId);
        }

        /**
         * The stage of the LinkedService update allowing to specify provisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning state of the linked service..
             * 
             * @param provisioningState The provisioning state of the linked service.
             * @return the next definition stage.
             */
            Update withProvisioningState(LinkedServiceEntityStatus provisioningState);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    LinkedService refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LinkedService refresh(Context context);
}
