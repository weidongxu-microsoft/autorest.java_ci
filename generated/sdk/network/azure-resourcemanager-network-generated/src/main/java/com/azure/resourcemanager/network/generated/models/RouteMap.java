// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.RouteMapInner;
import java.util.List;

/** An immutable client-side representation of RouteMap. */
public interface RouteMap {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the associatedInboundConnections property: List of connections which have this RoutMap associated for
     * inbound traffic.
     *
     * @return the associatedInboundConnections value.
     */
    List<String> associatedInboundConnections();

    /**
     * Gets the associatedOutboundConnections property: List of connections which have this RoutMap associated for
     * outbound traffic.
     *
     * @return the associatedOutboundConnections value.
     */
    List<String> associatedOutboundConnections();

    /**
     * Gets the rules property: List of RouteMap rules to be applied.
     *
     * @return the rules value.
     */
    List<RouteMapRule> rules();

    /**
     * Gets the provisioningState property: The provisioning state of the RouteMap resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.RouteMapInner object.
     *
     * @return the inner object.
     */
    RouteMapInner innerModel();

    /** The entirety of the RouteMap definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The RouteMap definition stages. */
    interface DefinitionStages {
        /** The first stage of the RouteMap definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the RouteMap definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualHubName.
             *
             * @param resourceGroupName The resource group name of the RouteMap's resource group.
             * @param virtualHubName The name of the VirtualHub containing the RouteMap.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }
        /**
         * The stage of the RouteMap definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAssociatedInboundConnections,
                DefinitionStages.WithAssociatedOutboundConnections,
                DefinitionStages.WithRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RouteMap create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RouteMap create(Context context);
        }
        /** The stage of the RouteMap definition allowing to specify associatedInboundConnections. */
        interface WithAssociatedInboundConnections {
            /**
             * Specifies the associatedInboundConnections property: List of connections which have this RoutMap
             * associated for inbound traffic..
             *
             * @param associatedInboundConnections List of connections which have this RoutMap associated for inbound
             *     traffic.
             * @return the next definition stage.
             */
            WithCreate withAssociatedInboundConnections(List<String> associatedInboundConnections);
        }
        /** The stage of the RouteMap definition allowing to specify associatedOutboundConnections. */
        interface WithAssociatedOutboundConnections {
            /**
             * Specifies the associatedOutboundConnections property: List of connections which have this RoutMap
             * associated for outbound traffic..
             *
             * @param associatedOutboundConnections List of connections which have this RoutMap associated for outbound
             *     traffic.
             * @return the next definition stage.
             */
            WithCreate withAssociatedOutboundConnections(List<String> associatedOutboundConnections);
        }
        /** The stage of the RouteMap definition allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: List of RouteMap rules to be applied..
             *
             * @param rules List of RouteMap rules to be applied.
             * @return the next definition stage.
             */
            WithCreate withRules(List<RouteMapRule> rules);
        }
    }
    /**
     * Begins update for the RouteMap resource.
     *
     * @return the stage of resource update.
     */
    RouteMap.Update update();

    /** The template for RouteMap update. */
    interface Update
        extends UpdateStages.WithAssociatedInboundConnections,
            UpdateStages.WithAssociatedOutboundConnections,
            UpdateStages.WithRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RouteMap apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RouteMap apply(Context context);
    }
    /** The RouteMap update stages. */
    interface UpdateStages {
        /** The stage of the RouteMap update allowing to specify associatedInboundConnections. */
        interface WithAssociatedInboundConnections {
            /**
             * Specifies the associatedInboundConnections property: List of connections which have this RoutMap
             * associated for inbound traffic..
             *
             * @param associatedInboundConnections List of connections which have this RoutMap associated for inbound
             *     traffic.
             * @return the next definition stage.
             */
            Update withAssociatedInboundConnections(List<String> associatedInboundConnections);
        }
        /** The stage of the RouteMap update allowing to specify associatedOutboundConnections. */
        interface WithAssociatedOutboundConnections {
            /**
             * Specifies the associatedOutboundConnections property: List of connections which have this RoutMap
             * associated for outbound traffic..
             *
             * @param associatedOutboundConnections List of connections which have this RoutMap associated for outbound
             *     traffic.
             * @return the next definition stage.
             */
            Update withAssociatedOutboundConnections(List<String> associatedOutboundConnections);
        }
        /** The stage of the RouteMap update allowing to specify rules. */
        interface WithRules {
            /**
             * Specifies the rules property: List of RouteMap rules to be applied..
             *
             * @param rules List of RouteMap rules to be applied.
             * @return the next definition stage.
             */
            Update withRules(List<RouteMapRule> rules);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RouteMap refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RouteMap refresh(Context context);
}