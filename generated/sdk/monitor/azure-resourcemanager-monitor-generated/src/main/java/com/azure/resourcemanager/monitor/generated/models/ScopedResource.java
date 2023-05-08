// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ScopedResourceInner;

/** An immutable client-side representation of ScopedResource. */
public interface ScopedResource {
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
     * Gets the linkedResourceId property: The resource id of the scoped Azure monitor resource.
     *
     * @return the linkedResourceId value.
     */
    String linkedResourceId();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.ScopedResourceInner object.
     *
     * @return the inner object.
     */
    ScopedResourceInner innerModel();

    /** The entirety of the ScopedResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The ScopedResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ScopedResource definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ScopedResource definition allowing to specify parent resource. */
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
         * The stage of the ScopedResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLinkedResourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ScopedResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ScopedResource create(Context context);
        }

        /** The stage of the ScopedResource definition allowing to specify linkedResourceId. */
        interface WithLinkedResourceId {
            /**
             * Specifies the linkedResourceId property: The resource id of the scoped Azure monitor resource..
             *
             * @param linkedResourceId The resource id of the scoped Azure monitor resource.
             * @return the next definition stage.
             */
            WithCreate withLinkedResourceId(String linkedResourceId);
        }
    }

    /**
     * Begins update for the ScopedResource resource.
     *
     * @return the stage of resource update.
     */
    ScopedResource.Update update();

    /** The template for ScopedResource update. */
    interface Update extends UpdateStages.WithLinkedResourceId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ScopedResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ScopedResource apply(Context context);
    }

    /** The ScopedResource update stages. */
    interface UpdateStages {
        /** The stage of the ScopedResource update allowing to specify linkedResourceId. */
        interface WithLinkedResourceId {
            /**
             * Specifies the linkedResourceId property: The resource id of the scoped Azure monitor resource..
             *
             * @param linkedResourceId The resource id of the scoped Azure monitor resource.
             * @return the next definition stage.
             */
            Update withLinkedResourceId(String linkedResourceId);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ScopedResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ScopedResource refresh(Context context);
}
