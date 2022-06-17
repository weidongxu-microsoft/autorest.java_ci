// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortAuthorizationInner;

/** An immutable client-side representation of ExpressRoutePortAuthorization. */
public interface ExpressRoutePortAuthorization {
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
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * Gets the authorizationUseStatus property: The authorization use status.
     *
     * @return the authorizationUseStatus value.
     */
    ExpressRoutePortAuthorizationUseStatus authorizationUseStatus();

    /**
     * Gets the circuitResourceUri property: The reference to the ExpressRoute circuit resource using the authorization.
     *
     * @return the circuitResourceUri value.
     */
    String circuitResourceUri();

    /**
     * Gets the provisioningState property: The provisioning state of the authorization resource.
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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortAuthorizationInner
     * object.
     *
     * @return the inner object.
     */
    ExpressRoutePortAuthorizationInner innerModel();

    /** The entirety of the ExpressRoutePortAuthorization definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ExpressRoutePortAuthorization definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExpressRoutePortAuthorization definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ExpressRoutePortAuthorization definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, expressRoutePortName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param expressRoutePortName The name of the express route port.
             * @return the next definition stage.
             */
            WithCreate withExistingExpressRoutePort(String resourceGroupName, String expressRoutePortName);
        }
        /**
         * The stage of the ExpressRoutePortAuthorization definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExpressRoutePortAuthorization create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRoutePortAuthorization create(Context context);
        }
        /** The stage of the ExpressRoutePortAuthorization definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
    }
    /**
     * Begins update for the ExpressRoutePortAuthorization resource.
     *
     * @return the stage of resource update.
     */
    ExpressRoutePortAuthorization.Update update();

    /** The template for ExpressRoutePortAuthorization update. */
    interface Update extends UpdateStages.WithName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExpressRoutePortAuthorization apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRoutePortAuthorization apply(Context context);
    }
    /** The ExpressRoutePortAuthorization update stages. */
    interface UpdateStages {
        /** The stage of the ExpressRoutePortAuthorization update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ExpressRoutePortAuthorization refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExpressRoutePortAuthorization refresh(Context context);
}