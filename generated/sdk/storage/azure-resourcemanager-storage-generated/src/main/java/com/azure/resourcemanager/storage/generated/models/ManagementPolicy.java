// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.ManagementPolicyInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of ManagementPolicy.
 */
public interface ManagementPolicy {
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
     * Gets the lastModifiedTime property: Returns the date and time the ManagementPolicies was last modified.
     * 
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the policy property: The Storage Account ManagementPolicy, in JSON format. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     * @return the policy value.
     */
    ManagementPolicySchema policy();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.ManagementPolicyInner object.
     * 
     * @return the inner object.
     */
    ManagementPolicyInner innerModel();

    /**
     * The entirety of the ManagementPolicy definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ManagementPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ManagementPolicy definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ManagementPolicy definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             * 
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
             * insensitive.
             * @param accountName The name of the storage account within the specified resource group. Storage account
             * names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the ManagementPolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPolicy {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ManagementPolicy create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagementPolicy create(Context context);
        }

        /**
         * The stage of the ManagementPolicy definition allowing to specify policy.
         */
        interface WithPolicy {
            /**
             * Specifies the policy property: The Storage Account ManagementPolicy, in JSON format. See more details in:
             * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts..
             * 
             * @param policy The Storage Account ManagementPolicy, in JSON format. See more details in:
             * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
             * @return the next definition stage.
             */
            WithCreate withPolicy(ManagementPolicySchema policy);
        }
    }

    /**
     * Begins update for the ManagementPolicy resource.
     * 
     * @return the stage of resource update.
     */
    ManagementPolicy.Update update();

    /**
     * The template for ManagementPolicy update.
     */
    interface Update extends UpdateStages.WithPolicy {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ManagementPolicy apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagementPolicy apply(Context context);
    }

    /**
     * The ManagementPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ManagementPolicy update allowing to specify policy.
         */
        interface WithPolicy {
            /**
             * Specifies the policy property: The Storage Account ManagementPolicy, in JSON format. See more details in:
             * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts..
             * 
             * @param policy The Storage Account ManagementPolicy, in JSON format. See more details in:
             * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
             * @return the next definition stage.
             */
            Update withPolicy(ManagementPolicySchema policy);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ManagementPolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagementPolicy refresh(Context context);
}
