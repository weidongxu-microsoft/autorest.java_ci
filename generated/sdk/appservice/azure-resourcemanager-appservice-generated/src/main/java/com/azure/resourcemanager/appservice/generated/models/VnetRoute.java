// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner;

/**
 * An immutable client-side representation of VnetRoute.
 */
public interface VnetRoute {
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
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the startAddress property: The starting address for this route. This may also include a CIDR notation, in
     * which case the end address must not be specified.
     * 
     * @return the startAddress value.
     */
    String startAddress();

    /**
     * Gets the endAddress property: The ending address for this route. If the start address is specified in CIDR
     * notation, this must be omitted.
     * 
     * @return the endAddress value.
     */
    String endAddress();

    /**
     * Gets the routeType property: The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     * @return the routeType value.
     */
    RouteType routeType();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner object.
     * 
     * @return the inner object.
     */
    VnetRouteInner innerModel();

    /**
     * The entirety of the VnetRoute definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The VnetRoute definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VnetRoute definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the VnetRoute definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name, vnetName.
             * 
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the App Service plan.
             * @param vnetName Name of the Virtual Network.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName);
        }

        /**
         * The stage of the VnetRoute definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithStartAddress,
            DefinitionStages.WithEndAddress, DefinitionStages.WithRouteType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VnetRoute create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VnetRoute create(Context context);
        }

        /**
         * The stage of the VnetRoute definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the VnetRoute definition allowing to specify startAddress.
         */
        interface WithStartAddress {
            /**
             * Specifies the startAddress property: The starting address for this route. This may also include a CIDR
             * notation, in which case the end address must not be specified..
             * 
             * @param startAddress The starting address for this route. This may also include a CIDR notation, in which
             * case the end address must not be specified.
             * @return the next definition stage.
             */
            WithCreate withStartAddress(String startAddress);
        }

        /**
         * The stage of the VnetRoute definition allowing to specify endAddress.
         */
        interface WithEndAddress {
            /**
             * Specifies the endAddress property: The ending address for this route. If the start address is specified
             * in CIDR notation, this must be omitted..
             * 
             * @param endAddress The ending address for this route. If the start address is specified in CIDR notation,
             * this must be omitted.
             * @return the next definition stage.
             */
            WithCreate withEndAddress(String endAddress);
        }

        /**
         * The stage of the VnetRoute definition allowing to specify routeType.
         */
        interface WithRouteType {
            /**
             * Specifies the routeType property: The type of route this is:
             * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
             * INHERITED - Routes inherited from the real Virtual Network routes
             * STATIC - Static route set on the app only
             * 
             * These values will be used for syncing an app's routes with those from a Virtual Network..
             * 
             * @param routeType The type of route this is:
             * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
             * INHERITED - Routes inherited from the real Virtual Network routes
             * STATIC - Static route set on the app only
             * 
             * These values will be used for syncing an app's routes with those from a Virtual Network.
             * @return the next definition stage.
             */
            WithCreate withRouteType(RouteType routeType);
        }
    }

    /**
     * Begins update for the VnetRoute resource.
     * 
     * @return the stage of resource update.
     */
    VnetRoute.Update update();

    /**
     * The template for VnetRoute update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithStartAddress, UpdateStages.WithEndAddress,
        UpdateStages.WithRouteType {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VnetRoute apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VnetRoute apply(Context context);
    }

    /**
     * The VnetRoute update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VnetRoute update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             * 
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the VnetRoute update allowing to specify startAddress.
         */
        interface WithStartAddress {
            /**
             * Specifies the startAddress property: The starting address for this route. This may also include a CIDR
             * notation, in which case the end address must not be specified..
             * 
             * @param startAddress The starting address for this route. This may also include a CIDR notation, in which
             * case the end address must not be specified.
             * @return the next definition stage.
             */
            Update withStartAddress(String startAddress);
        }

        /**
         * The stage of the VnetRoute update allowing to specify endAddress.
         */
        interface WithEndAddress {
            /**
             * Specifies the endAddress property: The ending address for this route. If the start address is specified
             * in CIDR notation, this must be omitted..
             * 
             * @param endAddress The ending address for this route. If the start address is specified in CIDR notation,
             * this must be omitted.
             * @return the next definition stage.
             */
            Update withEndAddress(String endAddress);
        }

        /**
         * The stage of the VnetRoute update allowing to specify routeType.
         */
        interface WithRouteType {
            /**
             * Specifies the routeType property: The type of route this is:
             * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
             * INHERITED - Routes inherited from the real Virtual Network routes
             * STATIC - Static route set on the app only
             * 
             * These values will be used for syncing an app's routes with those from a Virtual Network..
             * 
             * @param routeType The type of route this is:
             * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
             * INHERITED - Routes inherited from the real Virtual Network routes
             * STATIC - Static route set on the app only
             * 
             * These values will be used for syncing an app's routes with those from a Virtual Network.
             * @return the next definition stage.
             */
            Update withRouteType(RouteType routeType);
        }
    }
}
