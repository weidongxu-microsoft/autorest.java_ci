// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteLinkedBackendArmResourceInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of StaticSiteLinkedBackendArmResource.
 */
public interface StaticSiteLinkedBackendArmResource {
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
     * Gets the backendResourceId property: The resource id of the backend linked to the static site.
     * 
     * @return the backendResourceId value.
     */
    String backendResourceId();

    /**
     * Gets the region property: The region of the backend linked to the static site.
     * 
     * @return the region value.
     */
    String region();

    /**
     * Gets the createdOn property: The date and time on which the backend was linked to the static site.
     * 
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the provisioningState property: The provisioning state of the linking process.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteLinkedBackendArmResourceInner object.
     * 
     * @return the inner object.
     */
    StaticSiteLinkedBackendArmResourceInner innerModel();

    /**
     * The entirety of the StaticSiteLinkedBackendArmResource definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The StaticSiteLinkedBackendArmResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the StaticSiteLinkedBackendArmResource definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the StaticSiteLinkedBackendArmResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             * 
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the static site.
             * @return the next definition stage.
             */
            WithCreate withExistingStaticSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the StaticSiteLinkedBackendArmResource definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind, DefinitionStages.WithBackendResourceId, DefinitionStages.WithRegion {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            StaticSiteLinkedBackendArmResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StaticSiteLinkedBackendArmResource create(Context context);
        }

        /**
         * The stage of the StaticSiteLinkedBackendArmResource definition allowing to specify kind.
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
         * The stage of the StaticSiteLinkedBackendArmResource definition allowing to specify backendResourceId.
         */
        interface WithBackendResourceId {
            /**
             * Specifies the backendResourceId property: The resource id of the backend linked to the static site.
             * 
             * @param backendResourceId The resource id of the backend linked to the static site.
             * @return the next definition stage.
             */
            WithCreate withBackendResourceId(String backendResourceId);
        }

        /**
         * The stage of the StaticSiteLinkedBackendArmResource definition allowing to specify region.
         */
        interface WithRegion {
            /**
             * Specifies the region property: The region of the backend linked to the static site.
             * 
             * @param region The region of the backend linked to the static site.
             * @return the next definition stage.
             */
            WithCreate withRegion(String region);
        }
    }

    /**
     * Begins update for the StaticSiteLinkedBackendArmResource resource.
     * 
     * @return the stage of resource update.
     */
    StaticSiteLinkedBackendArmResource.Update update();

    /**
     * The template for StaticSiteLinkedBackendArmResource update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithBackendResourceId, UpdateStages.WithRegion {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        StaticSiteLinkedBackendArmResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StaticSiteLinkedBackendArmResource apply(Context context);
    }

    /**
     * The StaticSiteLinkedBackendArmResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the StaticSiteLinkedBackendArmResource update allowing to specify kind.
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
         * The stage of the StaticSiteLinkedBackendArmResource update allowing to specify backendResourceId.
         */
        interface WithBackendResourceId {
            /**
             * Specifies the backendResourceId property: The resource id of the backend linked to the static site.
             * 
             * @param backendResourceId The resource id of the backend linked to the static site.
             * @return the next definition stage.
             */
            Update withBackendResourceId(String backendResourceId);
        }

        /**
         * The stage of the StaticSiteLinkedBackendArmResource update allowing to specify region.
         */
        interface WithRegion {
            /**
             * Specifies the region property: The region of the backend linked to the static site.
             * 
             * @param region The region of the backend linked to the static site.
             * @return the next definition stage.
             */
            Update withRegion(String region);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    StaticSiteLinkedBackendArmResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StaticSiteLinkedBackendArmResource refresh(Context context);

    /**
     * Validates that a backend can be linked to a static site.
     * 
     * @param staticSiteLinkedBackendEnvelope A JSON representation of the linked backend request properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateBackend(StaticSiteLinkedBackendArmResourceInner staticSiteLinkedBackendEnvelope);

    /**
     * Validates that a backend can be linked to a static site.
     * 
     * @param staticSiteLinkedBackendEnvelope A JSON representation of the linked backend request properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateBackend(StaticSiteLinkedBackendArmResourceInner staticSiteLinkedBackendEnvelope, Context context);
}
