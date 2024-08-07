// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkProfileInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of NetworkProfile.
 */
public interface NetworkProfile {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the containerNetworkInterfaces property: List of child container network interfaces.
     * 
     * @return the containerNetworkInterfaces value.
     */
    List<ContainerNetworkInterface> containerNetworkInterfaces();

    /**
     * Gets the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     * 
     * @return the containerNetworkInterfaceConfigurations value.
     */
    List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations();

    /**
     * Gets the resourceGuid property: The resource GUID property of the network profile resource.
     * 
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the network profile resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkProfileInner object.
     * 
     * @return the inner object.
     */
    NetworkProfileInner innerModel();

    /**
     * The entirety of the NetworkProfile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkProfile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkProfile definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the NetworkProfile definition allowing to specify location.
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
         * The stage of the NetworkProfile definition allowing to specify parent resource.
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
         * The stage of the NetworkProfile definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithContainerNetworkInterfaceConfigurations {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkProfile create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkProfile create(Context context);
        }

        /**
         * The stage of the NetworkProfile definition allowing to specify tags.
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
         * The stage of the NetworkProfile definition allowing to specify containerNetworkInterfaceConfigurations.
         */
        interface WithContainerNetworkInterfaceConfigurations {
            /**
             * Specifies the containerNetworkInterfaceConfigurations property: List of chid container network interface
             * configurations..
             * 
             * @param containerNetworkInterfaceConfigurations List of chid container network interface configurations.
             * @return the next definition stage.
             */
            WithCreate withContainerNetworkInterfaceConfigurations(
                List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations);
        }
    }

    /**
     * Begins update for the NetworkProfile resource.
     * 
     * @return the stage of resource update.
     */
    NetworkProfile.Update update();

    /**
     * The template for NetworkProfile update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkProfile apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkProfile apply(Context context);
    }

    /**
     * The NetworkProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkProfile update allowing to specify tags.
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
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    NetworkProfile refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkProfile refresh(Context context);
}
