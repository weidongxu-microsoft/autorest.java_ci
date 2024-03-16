// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.PrivateEndpointConnectionInner;

/**
 * An immutable client-side representation of PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection {
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
     * Gets the privateEndpoint property: Private endpoint which the connection belongs to.
     * 
     * @return the privateEndpoint value.
     */
    PrivateEndpointProperty privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: Connection state of the private endpoint connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState();

    /**
     * Gets the provisioningState property: State of the private endpoint connection.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.PrivateEndpointConnectionInner object.
     * 
     * @return the inner object.
     */
    PrivateEndpointConnectionInner innerModel();

    /**
     * The entirety of the PrivateEndpointConnection definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The PrivateEndpointConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the PrivateEndpointConnection definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the PrivateEndpointConnection definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, scopeName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
             * @return the next definition stage.
             */
            WithCreate withExistingPrivateLinkScope(String resourceGroupName, String scopeName);
        }

        /**
         * The stage of the PrivateEndpointConnection definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithPrivateLinkServiceConnectionState {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            PrivateEndpointConnection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpointConnection create(Context context);
        }

        /**
         * The stage of the PrivateEndpointConnection definition allowing to specify privateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: Private endpoint which the connection belongs to..
             * 
             * @param privateEndpoint Private endpoint which the connection belongs to.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }

        /**
         * The stage of the PrivateEndpointConnection definition allowing to specify privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: Connection state of the private endpoint connection..
             * 
             * @param privateLinkServiceConnectionState Connection state of the private endpoint connection.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState);
        }
    }

    /**
     * Begins update for the PrivateEndpointConnection resource.
     * 
     * @return the stage of resource update.
     */
    PrivateEndpointConnection.Update update();

    /**
     * The template for PrivateEndpointConnection update.
     */
    interface Update extends UpdateStages.WithPrivateEndpoint, UpdateStages.WithPrivateLinkServiceConnectionState {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        PrivateEndpointConnection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpointConnection apply(Context context);
    }

    /**
     * The PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the PrivateEndpointConnection update allowing to specify privateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: Private endpoint which the connection belongs to..
             * 
             * @param privateEndpoint Private endpoint which the connection belongs to.
             * @return the next definition stage.
             */
            Update withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }

        /**
         * The stage of the PrivateEndpointConnection update allowing to specify privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: Connection state of the private endpoint connection..
             * 
             * @param privateLinkServiceConnectionState Connection state of the private endpoint connection.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh(Context context);
}
