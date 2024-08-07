// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.SecretInner;
import java.util.Map;

/**
 * An immutable client-side representation of Secret.
 */
public interface Secret {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Properties of the secret.
     * 
     * @return the properties value.
     */
    SecretProperties properties();

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
     * Gets the inner com.azure.resourcemanager.keyvault.generated.fluent.models.SecretInner object.
     * 
     * @return the inner object.
     */
    SecretInner innerModel();

    /**
     * The entirety of the Secret definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The Secret definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Secret definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Secret definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vaultName.
             * 
             * @param resourceGroupName The name of the Resource Group to which the vault belongs.
             * @param vaultName Name of the vault.
             * @return the next definition stage.
             */
            WithProperties withExistingVault(String resourceGroupName, String vaultName);
        }

        /**
         * The stage of the Secret definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the secret.
             * 
             * @param properties Properties of the secret.
             * @return the next definition stage.
             */
            WithCreate withProperties(SecretProperties properties);
        }

        /**
         * The stage of the Secret definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Secret create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Secret create(Context context);
        }

        /**
         * The stage of the Secret definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The tags that will be assigned to the secret. .
             * 
             * @param tags The tags that will be assigned to the secret.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }

    /**
     * Begins update for the Secret resource.
     * 
     * @return the stage of resource update.
     */
    Secret.Update update();

    /**
     * The template for Secret update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Secret apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Secret apply(Context context);
    }

    /**
     * The Secret update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Secret update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The tags that will be assigned to the secret. .
             * 
             * @param tags The tags that will be assigned to the secret.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Secret update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the secret.
             * 
             * @param properties Properties of the secret.
             * @return the next definition stage.
             */
            Update withProperties(SecretPatchProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Secret refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Secret refresh(Context context);
}
