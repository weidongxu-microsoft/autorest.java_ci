// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of StaticSiteCustomDomainOverviewArmResource.
 */
public interface StaticSiteCustomDomainOverviewArmResource {
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
     * Gets the domainName property: The domain name for the static site custom domain.
     * 
     * @return the domainName value.
     */
    String domainName();

    /**
     * Gets the createdOn property: The date and time on which the custom domain was created for the static site.
     * 
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the status property: The status of the custom domain.
     * 
     * @return the status value.
     */
    CustomDomainStatus status();

    /**
     * Gets the validationToken property: The TXT record validation token.
     * 
     * @return the validationToken value.
     */
    String validationToken();

    /**
     * Gets the errorMessage property: The errorMessage property.
     * 
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner object.
     * 
     * @return the inner object.
     */
    StaticSiteCustomDomainOverviewArmResourceInner innerModel();

    /**
     * The entirety of the StaticSiteCustomDomainOverviewArmResource definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The StaticSiteCustomDomainOverviewArmResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the StaticSiteCustomDomainOverviewArmResource definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the StaticSiteCustomDomainOverviewArmResource definition allowing to specify parent resource.
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
         * The stage of the StaticSiteCustomDomainOverviewArmResource definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithValidationMethod {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            StaticSiteCustomDomainOverviewArmResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StaticSiteCustomDomainOverviewArmResource create(Context context);
        }

        /**
         * The stage of the StaticSiteCustomDomainOverviewArmResource definition allowing to specify kind.
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
         * The stage of the StaticSiteCustomDomainOverviewArmResource definition allowing to specify validationMethod.
         */
        interface WithValidationMethod {
            /**
             * Specifies the validationMethod property: Validation method for adding a custom domain.
             * 
             * @param validationMethod Validation method for adding a custom domain.
             * @return the next definition stage.
             */
            WithCreate withValidationMethod(String validationMethod);
        }
    }

    /**
     * Begins update for the StaticSiteCustomDomainOverviewArmResource resource.
     * 
     * @return the stage of resource update.
     */
    StaticSiteCustomDomainOverviewArmResource.Update update();

    /**
     * The template for StaticSiteCustomDomainOverviewArmResource update.
     */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithValidationMethod {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        StaticSiteCustomDomainOverviewArmResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StaticSiteCustomDomainOverviewArmResource apply(Context context);
    }

    /**
     * The StaticSiteCustomDomainOverviewArmResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the StaticSiteCustomDomainOverviewArmResource update allowing to specify kind.
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
         * The stage of the StaticSiteCustomDomainOverviewArmResource update allowing to specify validationMethod.
         */
        interface WithValidationMethod {
            /**
             * Specifies the validationMethod property: Validation method for adding a custom domain.
             * 
             * @param validationMethod Validation method for adding a custom domain.
             * @return the next definition stage.
             */
            Update withValidationMethod(String validationMethod);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    StaticSiteCustomDomainOverviewArmResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StaticSiteCustomDomainOverviewArmResource refresh(Context context);

    /**
     * Validates a particular custom domain can be added to a static site.
     * 
     * Description for Validates a particular custom domain can be added to a static site.
     * 
     * @param staticSiteCustomDomainRequestPropertiesEnvelope A JSON representation of the static site custom domain request properties. See example.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateCustomDomainCanBeAddedToStaticSite(
        StaticSiteCustomDomainRequestPropertiesArmResource staticSiteCustomDomainRequestPropertiesEnvelope);

    /**
     * Validates a particular custom domain can be added to a static site.
     * 
     * Description for Validates a particular custom domain can be added to a static site.
     * 
     * @param staticSiteCustomDomainRequestPropertiesEnvelope A JSON representation of the static site custom domain request properties. See example.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateCustomDomainCanBeAddedToStaticSite(
        StaticSiteCustomDomainRequestPropertiesArmResource staticSiteCustomDomainRequestPropertiesEnvelope,
        Context context);
}
