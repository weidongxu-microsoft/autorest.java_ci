// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerConfigurationInner;

/** Resource collection API of PartnerConfigurations. */
public interface PartnerConfigurations {
    /**
     * Get a partner configuration.
     *
     * <p>Get properties of a partner configuration.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner configuration.
     */
    PartnerConfiguration getByResourceGroup(String resourceGroupName);

    /**
     * Get a partner configuration.
     *
     * <p>Get properties of a partner configuration.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner configuration along with {@link Response}.
     */
    Response<PartnerConfiguration> getByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Create or update a partner configuration.
     *
     * <p>Synchronously creates or updates a partner configuration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerConfigurationInfo Partner configuration information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration createOrUpdate(String resourceGroupName, PartnerConfigurationInner partnerConfigurationInfo);

    /**
     * Create or update a partner configuration.
     *
     * <p>Synchronously creates or updates a partner configuration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerConfigurationInfo Partner configuration information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration createOrUpdate(
        String resourceGroupName, PartnerConfigurationInner partnerConfigurationInfo, Context context);

    /**
     * Delete a partner configuration.
     *
     * <p>Delete existing partner configuration.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName);

    /**
     * Delete a partner configuration.
     *
     * <p>Delete existing partner configuration.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, Context context);

    /**
     * Update a partner configuration.
     *
     * <p>Synchronously updates a partner configuration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerConfigurationUpdateParameters Partner configuration update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration update(
        String resourceGroupName, PartnerConfigurationUpdateParameters partnerConfigurationUpdateParameters);

    /**
     * Update a partner configuration.
     *
     * <p>Synchronously updates a partner configuration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerConfigurationUpdateParameters Partner configuration update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration update(
        String resourceGroupName,
        PartnerConfigurationUpdateParameters partnerConfigurationUpdateParameters,
        Context context);

    /**
     * List partner configurations under a resource group.
     *
     * <p>List all the partner configurations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List partner configurations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerConfiguration> listByResourceGroup(String resourceGroupName);

    /**
     * List partner configurations under a resource group.
     *
     * <p>List all the partner configurations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List partner configurations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerConfiguration> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List partner configurations under an Azure subscription.
     *
     * <p>List all the partner configurations under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List partner configurations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerConfiguration> list();

    /**
     * List partner configurations under an Azure subscription.
     *
     * <p>List all the partner configurations under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List partner configurations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerConfiguration> list(String filter, Integer top, Context context);

    /**
     * Authorize a partner.
     *
     * <p>Authorize a single partner either by partner registration immutable Id or by partner name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerInfo The information of the partner to be authorized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration authorizePartner(String resourceGroupName, Partner partnerInfo);

    /**
     * Authorize a partner.
     *
     * <p>Authorize a single partner either by partner registration immutable Id or by partner name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerInfo The information of the partner to be authorized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information along with {@link Response}.
     */
    Response<PartnerConfiguration> authorizePartnerWithResponse(
        String resourceGroupName, Partner partnerInfo, Context context);

    /**
     * Unauthorize a partner.
     *
     * <p>Unauthorize a single partner either by partner registration immutable Id or by partner name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerInfo The information of the partner to be unauthorized.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information.
     */
    PartnerConfiguration unauthorizePartner(String resourceGroupName, Partner partnerInfo);

    /**
     * Unauthorize a partner.
     *
     * <p>Unauthorize a single partner either by partner registration immutable Id or by partner name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerInfo The information of the partner to be unauthorized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return partner configuration information along with {@link Response}.
     */
    Response<PartnerConfiguration> unauthorizePartnerWithResponse(
        String resourceGroupName, Partner partnerInfo, Context context);
}
