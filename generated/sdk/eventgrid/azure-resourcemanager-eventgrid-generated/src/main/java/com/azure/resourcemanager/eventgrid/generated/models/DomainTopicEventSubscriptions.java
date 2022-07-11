// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.EventSubscriptionInner;

/** Resource collection API of DomainTopicEventSubscriptions. */
public interface DomainTopicEventSubscriptions {
    /**
     * Get a nested event subscription for domain topic.
     *
     * <p>Get properties of a nested event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a nested event subscription for a domain topic.
     */
    EventSubscription get(String resourceGroupName, String domainName, String topicName, String eventSubscriptionName);

    /**
     * Get a nested event subscription for domain topic.
     *
     * <p>Get properties of a nested event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a nested event subscription for a domain topic along with {@link Response}.
     */
    Response<EventSubscription> getWithResponse(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName, Context context);

    /**
     * Create or update a nested event subscription to a domain topic.
     *
     * <p>Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription createOrUpdate(
        String resourceGroupName,
        String domainName,
        String topicName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update a nested event subscription to a domain topic.
     *
     * <p>Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription createOrUpdate(
        String resourceGroupName,
        String domainName,
        String topicName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo,
        Context context);

    /**
     * Delete a nested event subscription for a domain topic.
     *
     * <p>Delete a nested existing event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String domainName, String topicName, String eventSubscriptionName);

    /**
     * Delete a nested event subscription for a domain topic.
     *
     * <p>Delete a nested existing event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName, Context context);

    /**
     * Update a nested event subscription for a domain topic.
     *
     * <p>Update an existing event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param topicName Name of the topic.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription update(
        String resourceGroupName,
        String domainName,
        String topicName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update a nested event subscription for a domain topic.
     *
     * <p>Update an existing event subscription for a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param topicName Name of the topic.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription update(
        String resourceGroupName,
        String domainName,
        String topicName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context);

    /**
     * Get full URL of a nested event subscription for domain topic.
     *
     * <p>Get the full endpoint URL for a nested event subscription for domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for a nested event subscription for domain topic.
     */
    EventSubscriptionFullUrl getFullUrl(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName);

    /**
     * Get full URL of a nested event subscription for domain topic.
     *
     * <p>Get the full endpoint URL for a nested event subscription for domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for a nested event subscription for domain topic along with {@link Response}.
     */
    Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName, Context context);

    /**
     * List all nested event subscriptions for a specific domain topic.
     *
     * <p>List all event subscriptions that have been created for a specific domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list(String resourceGroupName, String domainName, String topicName);

    /**
     * List all nested event subscriptions for a specific domain topic.
     *
     * <p>List all event subscriptions that have been created for a specific domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
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
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list(
        String resourceGroupName, String domainName, String topicName, String filter, Integer top, Context context);

    /**
     * Get delivery attributes for an event subscription for domain topic.
     *
     * <p>Get all delivery attributes for an event subscription for domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain topic.
     */
    DeliveryAttributeListResult getDeliveryAttributes(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName);

    /**
     * Get delivery attributes for an event subscription for domain topic.
     *
     * <p>Get all delivery attributes for an event subscription for domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain topic along with {@link Response}.
     */
    Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(
        String resourceGroupName, String domainName, String topicName, String eventSubscriptionName, Context context);
}
