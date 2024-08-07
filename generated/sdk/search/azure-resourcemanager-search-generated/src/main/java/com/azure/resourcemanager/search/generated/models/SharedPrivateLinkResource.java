// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.search.generated.fluent.models.SharedPrivateLinkResourceInner;
import java.util.UUID;

/**
 * An immutable client-side representation of SharedPrivateLinkResource.
 */
public interface SharedPrivateLinkResource {
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
     * Gets the properties property: Describes the properties of a shared private link resource managed by the Azure AI
     * Search service.
     * 
     * @return the properties value.
     */
    SharedPrivateLinkResourceProperties properties();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.search.generated.fluent.models.SharedPrivateLinkResourceInner object.
     * 
     * @return the inner object.
     */
    SharedPrivateLinkResourceInner innerModel();

    /**
     * The entirety of the SharedPrivateLinkResource definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The SharedPrivateLinkResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the SharedPrivateLinkResource definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the SharedPrivateLinkResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, searchServiceName.
             * 
             * @param resourceGroupName The name of the resource group within the current subscription. You can obtain
             * this value from the Azure Resource Manager API or the portal.
             * @param searchServiceName The name of the Azure AI Search service associated with the specified resource
             * group.
             * @return the next definition stage.
             */
            WithCreate withExistingSearchService(String resourceGroupName, String searchServiceName);
        }

        /**
         * The stage of the SharedPrivateLinkResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties, DefinitionStages.WithClientRequestId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            SharedPrivateLinkResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SharedPrivateLinkResource create(Context context);
        }

        /**
         * The stage of the SharedPrivateLinkResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes the properties of a shared private link resource managed by
             * the Azure AI Search service..
             * 
             * @param properties Describes the properties of a shared private link resource managed by the Azure AI
             * Search service.
             * @return the next definition stage.
             */
            WithCreate withProperties(SharedPrivateLinkResourceProperties properties);
        }

        /**
         * The stage of the SharedPrivateLinkResource definition allowing to specify clientRequestId.
         */
        interface WithClientRequestId {
            /**
             * Specifies the clientRequestId property: A client-generated GUID value that identifies this request. If
             * specified, this will be included in response information as a way to track the request..
             * 
             * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this
             * will be included in response information as a way to track the request.
             * @return the next definition stage.
             */
            WithCreate withClientRequestId(UUID clientRequestId);
        }
    }

    /**
     * Begins update for the SharedPrivateLinkResource resource.
     * 
     * @return the stage of resource update.
     */
    SharedPrivateLinkResource.Update update();

    /**
     * The template for SharedPrivateLinkResource update.
     */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithClientRequestId {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        SharedPrivateLinkResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SharedPrivateLinkResource apply(Context context);
    }

    /**
     * The SharedPrivateLinkResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the SharedPrivateLinkResource update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes the properties of a shared private link resource managed by
             * the Azure AI Search service..
             * 
             * @param properties Describes the properties of a shared private link resource managed by the Azure AI
             * Search service.
             * @return the next definition stage.
             */
            Update withProperties(SharedPrivateLinkResourceProperties properties);
        }

        /**
         * The stage of the SharedPrivateLinkResource update allowing to specify clientRequestId.
         */
        interface WithClientRequestId {
            /**
             * Specifies the clientRequestId property: A client-generated GUID value that identifies this request. If
             * specified, this will be included in response information as a way to track the request..
             * 
             * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this
             * will be included in response information as a way to track the request.
             * @return the next definition stage.
             */
            Update withClientRequestId(UUID clientRequestId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    SharedPrivateLinkResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SharedPrivateLinkResource refresh(Context context);
}
