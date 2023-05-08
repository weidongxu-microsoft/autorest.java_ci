// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageQueueInner;
import java.util.Map;

/** An immutable client-side representation of StorageQueue. */
public interface StorageQueue {
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
     * Gets the metadata property: A name-value pair that represents queue metadata.
     *
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * Gets the approximateMessageCount property: Integer indicating an approximate number of messages in the queue.
     * This number is not lower than the actual number of messages in the queue, but could be higher.
     *
     * @return the approximateMessageCount value.
     */
    Integer approximateMessageCount();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.StorageQueueInner object.
     *
     * @return the inner object.
     */
    StorageQueueInner innerModel();

    /** The entirety of the StorageQueue definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The StorageQueue definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageQueue definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the StorageQueue definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             *     insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             *     names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the StorageQueue definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithMetadata {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageQueue create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageQueue create(Context context);
        }

        /** The stage of the StorageQueue definition allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: A name-value pair that represents queue metadata..
             *
             * @param metadata A name-value pair that represents queue metadata.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Map<String, String> metadata);
        }
    }

    /**
     * Begins update for the StorageQueue resource.
     *
     * @return the stage of resource update.
     */
    StorageQueue.Update update();

    /** The template for StorageQueue update. */
    interface Update extends UpdateStages.WithMetadata {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StorageQueue apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageQueue apply(Context context);
    }

    /** The StorageQueue update stages. */
    interface UpdateStages {
        /** The stage of the StorageQueue update allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: A name-value pair that represents queue metadata..
             *
             * @param metadata A name-value pair that represents queue metadata.
             * @return the next definition stage.
             */
            Update withMetadata(Map<String, String> metadata);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageQueue refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageQueue refresh(Context context);
}
