// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.generated.fluent.models.HybridConnectionInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of HybridConnection.
 */
public interface HybridConnection {
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
     * Gets the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the createdAt property: The time the hybrid connection was created.
     * 
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the listenerCount property: The number of listeners for this hybrid connection. Note that min : 1 and max:25
     * are supported.
     * 
     * @return the listenerCount value.
     */
    Integer listenerCount();

    /**
     * Gets the requiresClientAuthorization property: Returns true if client authorization is needed for this hybrid
     * connection; otherwise, false.
     * 
     * @return the requiresClientAuthorization value.
     */
    Boolean requiresClientAuthorization();

    /**
     * Gets the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the
     * hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and
     * their contact information. Also, user-defined configuration settings can be stored.
     * 
     * @return the userMetadata value.
     */
    String userMetadata();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.relay.generated.fluent.models.HybridConnectionInner object.
     * 
     * @return the inner object.
     */
    HybridConnectionInner innerModel();

    /**
     * The entirety of the HybridConnection definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The HybridConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the HybridConnection definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the HybridConnection definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             * 
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param namespaceName The namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the HybridConnection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithRequiresClientAuthorization, DefinitionStages.WithUserMetadata {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            HybridConnection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            HybridConnection create(Context context);
        }

        /**
         * The stage of the HybridConnection definition allowing to specify requiresClientAuthorization.
         */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies the requiresClientAuthorization property: Returns true if client authorization is needed for
             * this hybrid connection; otherwise, false..
             * 
             * @param requiresClientAuthorization Returns true if client authorization is needed for this hybrid
             * connection; otherwise, false.
             * @return the next definition stage.
             */
            WithCreate withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }

        /**
         * The stage of the HybridConnection definition allowing to specify userMetadata.
         */
        interface WithUserMetadata {
            /**
             * Specifies the userMetadata property: The usermetadata is a placeholder to store user-defined string data
             * for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list
             * of teams and their contact information. Also, user-defined configuration settings can be stored..
             * 
             * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the hybrid
             * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and
             * their contact information. Also, user-defined configuration settings can be stored.
             * @return the next definition stage.
             */
            WithCreate withUserMetadata(String userMetadata);
        }
    }

    /**
     * Begins update for the HybridConnection resource.
     * 
     * @return the stage of resource update.
     */
    HybridConnection.Update update();

    /**
     * The template for HybridConnection update.
     */
    interface Update extends UpdateStages.WithRequiresClientAuthorization, UpdateStages.WithUserMetadata {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        HybridConnection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        HybridConnection apply(Context context);
    }

    /**
     * The HybridConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the HybridConnection update allowing to specify requiresClientAuthorization.
         */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies the requiresClientAuthorization property: Returns true if client authorization is needed for
             * this hybrid connection; otherwise, false..
             * 
             * @param requiresClientAuthorization Returns true if client authorization is needed for this hybrid
             * connection; otherwise, false.
             * @return the next definition stage.
             */
            Update withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }

        /**
         * The stage of the HybridConnection update allowing to specify userMetadata.
         */
        interface WithUserMetadata {
            /**
             * Specifies the userMetadata property: The usermetadata is a placeholder to store user-defined string data
             * for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list
             * of teams and their contact information. Also, user-defined configuration settings can be stored..
             * 
             * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the hybrid
             * connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and
             * their contact information. Also, user-defined configuration settings can be stored.
             * @return the next definition stage.
             */
            Update withUserMetadata(String userMetadata);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    HybridConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    HybridConnection refresh(Context context);
}
