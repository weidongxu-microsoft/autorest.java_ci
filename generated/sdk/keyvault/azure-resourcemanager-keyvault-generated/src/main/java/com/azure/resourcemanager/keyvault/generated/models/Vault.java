// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultInner;
import java.util.Map;

/**
 * An immutable client-side representation of Vault.
 */
public interface Vault {
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
     * Gets the systemData property: System metadata for the key vault.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Properties of the vault.
     * 
     * @return the properties value.
     */
    VaultProperties properties();

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
     * Gets the inner com.azure.resourcemanager.keyvault.generated.fluent.models.VaultInner object.
     * 
     * @return the inner object.
     */
    VaultInner innerModel();

    /**
     * The entirety of the Vault definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The Vault definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Vault definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Vault definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The supported Azure location where the key vault should be created.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The supported Azure location where the key vault should be created.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the Vault definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the Resource Group to which the server belongs.
             * @return the next definition stage.
             */
            WithProperties withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Vault definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the vault.
             * 
             * @param properties Properties of the vault.
             * @return the next definition stage.
             */
            WithCreate withProperties(VaultProperties properties);
        }

        /**
         * The stage of the Vault definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Vault create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Vault create(Context context);
        }

        /**
         * The stage of the Vault definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The tags that will be assigned to the key vault..
             * 
             * @param tags The tags that will be assigned to the key vault.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }

    /**
     * Begins update for the Vault resource.
     * 
     * @return the stage of resource update.
     */
    Vault.Update update();

    /**
     * The template for Vault update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Vault apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Vault apply(Context context);
    }

    /**
     * The Vault update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Vault update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: The tags that will be assigned to the key vault. .
             * 
             * @param tags The tags that will be assigned to the key vault.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Vault update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the vault.
             * 
             * @param properties Properties of the vault.
             * @return the next definition stage.
             */
            Update withProperties(VaultPatchProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Vault refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Vault refresh(Context context);
}
