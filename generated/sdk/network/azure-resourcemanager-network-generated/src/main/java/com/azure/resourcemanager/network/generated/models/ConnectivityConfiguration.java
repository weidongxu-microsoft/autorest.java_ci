// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ConnectivityConfigurationInner;
import java.util.List;

/** An immutable client-side representation of ConnectivityConfiguration. */
public interface ConnectivityConfiguration {
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
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A description of the connectivity configuration.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the connectivityTopology property: Connectivity topology type.
     *
     * @return the connectivityTopology value.
     */
    ConnectivityTopology connectivityTopology();

    /**
     * Gets the hubs property: List of hubItems.
     *
     * @return the hubs value.
     */
    List<Hub> hubs();

    /**
     * Gets the isGlobal property: Flag if global mesh is supported.
     *
     * @return the isGlobal value.
     */
    IsGlobal isGlobal();

    /**
     * Gets the appliesToGroups property: Groups for configuration.
     *
     * @return the appliesToGroups value.
     */
    List<ConnectivityGroupItem> appliesToGroups();

    /**
     * Gets the provisioningState property: The provisioning state of the connectivity configuration resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the deleteExistingPeering property: Flag if need to remove current existing peerings.
     *
     * @return the deleteExistingPeering value.
     */
    DeleteExistingPeering deleteExistingPeering();

    /**
     * Gets the resourceGuid property: Unique identifier for this resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ConnectivityConfigurationInner object.
     *
     * @return the inner object.
     */
    ConnectivityConfigurationInner innerModel();

    /** The entirety of the ConnectivityConfiguration definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The ConnectivityConfiguration definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConnectivityConfiguration definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, networkManagerName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param networkManagerName The name of the network manager.
             * @return the next definition stage.
             */
            WithCreate withExistingNetworkManager(String resourceGroupName, String networkManagerName);
        }

        /**
         * The stage of the ConnectivityConfiguration definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDescription,
                DefinitionStages.WithConnectivityTopology,
                DefinitionStages.WithHubs,
                DefinitionStages.WithIsGlobal,
                DefinitionStages.WithAppliesToGroups,
                DefinitionStages.WithDeleteExistingPeering {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConnectivityConfiguration create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConnectivityConfiguration create(Context context);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the connectivity configuration..
             *
             * @param description A description of the connectivity configuration.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify connectivityTopology. */
        interface WithConnectivityTopology {
            /**
             * Specifies the connectivityTopology property: Connectivity topology type..
             *
             * @param connectivityTopology Connectivity topology type.
             * @return the next definition stage.
             */
            WithCreate withConnectivityTopology(ConnectivityTopology connectivityTopology);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify hubs. */
        interface WithHubs {
            /**
             * Specifies the hubs property: List of hubItems.
             *
             * @param hubs List of hubItems.
             * @return the next definition stage.
             */
            WithCreate withHubs(List<Hub> hubs);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify isGlobal. */
        interface WithIsGlobal {
            /**
             * Specifies the isGlobal property: Flag if global mesh is supported..
             *
             * @param isGlobal Flag if global mesh is supported.
             * @return the next definition stage.
             */
            WithCreate withIsGlobal(IsGlobal isGlobal);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify appliesToGroups. */
        interface WithAppliesToGroups {
            /**
             * Specifies the appliesToGroups property: Groups for configuration.
             *
             * @param appliesToGroups Groups for configuration.
             * @return the next definition stage.
             */
            WithCreate withAppliesToGroups(List<ConnectivityGroupItem> appliesToGroups);
        }

        /** The stage of the ConnectivityConfiguration definition allowing to specify deleteExistingPeering. */
        interface WithDeleteExistingPeering {
            /**
             * Specifies the deleteExistingPeering property: Flag if need to remove current existing peerings..
             *
             * @param deleteExistingPeering Flag if need to remove current existing peerings.
             * @return the next definition stage.
             */
            WithCreate withDeleteExistingPeering(DeleteExistingPeering deleteExistingPeering);
        }
    }

    /**
     * Begins update for the ConnectivityConfiguration resource.
     *
     * @return the stage of resource update.
     */
    ConnectivityConfiguration.Update update();

    /** The template for ConnectivityConfiguration update. */
    interface Update
        extends UpdateStages.WithDescription,
            UpdateStages.WithConnectivityTopology,
            UpdateStages.WithHubs,
            UpdateStages.WithIsGlobal,
            UpdateStages.WithAppliesToGroups,
            UpdateStages.WithDeleteExistingPeering {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConnectivityConfiguration apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConnectivityConfiguration apply(Context context);
    }

    /** The ConnectivityConfiguration update stages. */
    interface UpdateStages {
        /** The stage of the ConnectivityConfiguration update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description of the connectivity configuration..
             *
             * @param description A description of the connectivity configuration.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /** The stage of the ConnectivityConfiguration update allowing to specify connectivityTopology. */
        interface WithConnectivityTopology {
            /**
             * Specifies the connectivityTopology property: Connectivity topology type..
             *
             * @param connectivityTopology Connectivity topology type.
             * @return the next definition stage.
             */
            Update withConnectivityTopology(ConnectivityTopology connectivityTopology);
        }

        /** The stage of the ConnectivityConfiguration update allowing to specify hubs. */
        interface WithHubs {
            /**
             * Specifies the hubs property: List of hubItems.
             *
             * @param hubs List of hubItems.
             * @return the next definition stage.
             */
            Update withHubs(List<Hub> hubs);
        }

        /** The stage of the ConnectivityConfiguration update allowing to specify isGlobal. */
        interface WithIsGlobal {
            /**
             * Specifies the isGlobal property: Flag if global mesh is supported..
             *
             * @param isGlobal Flag if global mesh is supported.
             * @return the next definition stage.
             */
            Update withIsGlobal(IsGlobal isGlobal);
        }

        /** The stage of the ConnectivityConfiguration update allowing to specify appliesToGroups. */
        interface WithAppliesToGroups {
            /**
             * Specifies the appliesToGroups property: Groups for configuration.
             *
             * @param appliesToGroups Groups for configuration.
             * @return the next definition stage.
             */
            Update withAppliesToGroups(List<ConnectivityGroupItem> appliesToGroups);
        }

        /** The stage of the ConnectivityConfiguration update allowing to specify deleteExistingPeering. */
        interface WithDeleteExistingPeering {
            /**
             * Specifies the deleteExistingPeering property: Flag if need to remove current existing peerings..
             *
             * @param deleteExistingPeering Flag if need to remove current existing peerings.
             * @return the next definition stage.
             */
            Update withDeleteExistingPeering(DeleteExistingPeering deleteExistingPeering);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConnectivityConfiguration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConnectivityConfiguration refresh(Context context);
}
