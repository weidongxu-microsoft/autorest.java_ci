// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Channels. */
public interface Channels {
    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel.
     */
    Channel get(String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel along with {@link Response}.
     */
    Response<Channel> getWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Update a Channel.
     *
     * <p>Synchronously updates a channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelUpdateParameters Channel update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters);

    /**
     * Update a Channel.
     *
     * <p>Synchronously updates a channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelUpdateParameters Channel update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> updateWithResponse(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters,
        Context context);

    /**
     * List channels.
     *
     * <p>List all the channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Channels operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Channel> listByPartnerNamespace(String resourceGroupName, String partnerNamespaceName);

    /**
     * List channels.
     *
     * <p>List all the channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
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
     * @return result of the List Channels operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Channel> listByPartnerNamespace(
        String resourceGroupName, String partnerNamespaceName, String filter, Integer top, Context context);

    /**
     * Get full URL of partner destination channel.
     *
     * <p>Get the full endpoint URL of a partner destination channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the Channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL of a partner destination channel.
     */
    EventSubscriptionFullUrl getFullUrl(String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Get full URL of partner destination channel.
     *
     * <p>Get the full endpoint URL of a partner destination channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the Channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL of a partner destination channel along with {@link Response}.
     */
    Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel along with {@link Response}.
     */
    Channel getById(String id);

    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel along with {@link Response}.
     */
    Response<Channel> getByIdWithResponse(String id, Context context);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Channel resource.
     *
     * @param name resource name.
     * @return the first stage of the new Channel definition.
     */
    Channel.DefinitionStages.Blank define(String name);
}
