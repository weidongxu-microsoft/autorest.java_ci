// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.RestorePointCollectionInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of RestorePointCollection.
 */
public interface RestorePointCollection {
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
     * Gets the source property: The properties of the source resource that this restore point collection is created from.
     * 
     * @return the source value.
     */
    RestorePointCollectionSourceProperties source();

    /**
     * Gets the provisioningState property: The provisioning state of the restore point collection.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the restorePointCollectionId property: The unique id of the restore point collection.
     * 
     * @return the restorePointCollectionId value.
     */
    String restorePointCollectionId();

    /**
     * Gets the restorePoints property: A list containing all restore points created under this restore point collection.
     * 
     * @return the restorePoints value.
     */
    List<RestorePoint> restorePoints();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.RestorePointCollectionInner object.
     * 
     * @return the inner object.
     */
    RestorePointCollectionInner innerModel();

    /**
     * The entirety of the RestorePointCollection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The RestorePointCollection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the RestorePointCollection definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the RestorePointCollection definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the RestorePointCollection definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the RestorePointCollection definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithSource {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            RestorePointCollection create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RestorePointCollection create(Context context);
        }

        /**
         * The stage of the RestorePointCollection definition allowing to specify tags.
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
         * The stage of the RestorePointCollection definition allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: The properties of the source resource that this restore point collection is created from..
             * 
             * @param source The properties of the source resource that this restore point collection is created from.
             * @return the next definition stage.
             */
            WithCreate withSource(RestorePointCollectionSourceProperties source);
        }
    }

    /**
     * Begins update for the RestorePointCollection resource.
     * 
     * @return the stage of resource update.
     */
    RestorePointCollection.Update update();

    /**
     * The template for RestorePointCollection update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSource {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        RestorePointCollection apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RestorePointCollection apply(Context context);
    }

    /**
     * The RestorePointCollection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the RestorePointCollection update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the RestorePointCollection update allowing to specify source.
         */
        interface WithSource {
            /**
             * Specifies the source property: The properties of the source resource that this restore point collection is created from..
             * 
             * @param source The properties of the source resource that this restore point collection is created from.
             * @return the next definition stage.
             */
            Update withSource(RestorePointCollectionSourceProperties source);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    RestorePointCollection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RestorePointCollection refresh(Context context);
}
