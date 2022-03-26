// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of EventSubscriptions. */
public interface EventSubscriptions {
    /**
     * Get properties of an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription.
     */
    EventSubscription get(String scope, String eventSubscriptionName);

    /**
     * Get properties of an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription along with {@link Response}.
     */
    Response<EventSubscription> getWithResponse(String scope, String eventSubscriptionName, Context context);

    /**
     * Delete an existing event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String eventSubscriptionName);

    /**
     * Delete an existing event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String scope, String eventSubscriptionName, Context context);

    /**
     * Get the full endpoint URL for an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription.
     */
    EventSubscriptionFullUrl getFullUrl(String scope, String eventSubscriptionName);

    /**
     * Get the full endpoint URL for an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription along with {@link Response}.
     */
    Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String scope, String eventSubscriptionName, Context context);

    /**
     * List all aggregated global event subscriptions under a specific Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list();

    /**
     * List all aggregated global event subscriptions under a specific Azure subscription.
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
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list(String filter, Integer top, Context context);

    /**
     * List all global event subscriptions under an Azure subscription for a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(String topicTypeName);

    /**
     * List all global event subscriptions under an Azure subscription for a topic type.
     *
     * @param topicTypeName Name of the topic type.
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
    PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(
        String topicTypeName, String filter, Integer top, Context context);

    /**
     * List all global event subscriptions under a specific Azure subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listByResourceGroup(String resourceGroupName);

    /**
     * List all global event subscriptions under a specific Azure subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
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
    PagedIterable<EventSubscription> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * List all global event subscriptions under a resource group for a specific topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName);

    /**
     * List all global event subscriptions under a resource group for a specific topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param topicTypeName Name of the topic type.
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
    PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName, String filter, Integer top, Context context);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription.
     *
     * @param location Name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listRegionalBySubscription(String location);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription.
     *
     * @param location Name of the location.
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
    PagedIterable<EventSubscription> listRegionalBySubscription(
        String location, String filter, Integer top, Context context);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listRegionalByResourceGroup(String resourceGroupName, String location);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location.
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
    PagedIterable<EventSubscription> listRegionalByResourceGroup(
        String resourceGroupName, String location, String filter, Integer top, Context context);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and topic type.
     *
     * @param location Name of the location.
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(String location, String topicTypeName);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and topic type.
     *
     * @param location Name of the location.
     * @param topicTypeName Name of the topic type.
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
    PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(
        String location, String topicTypeName, String filter, Integer top, Context context);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and resource group and
     * topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location.
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName);

    /**
     * List all event subscriptions from the given location under a specific Azure subscription and resource group and
     * topic type.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param location Name of the location.
     * @param topicTypeName Name of the topic type.
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
    PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName, String filter, Integer top, Context context);

    /**
     * List all event subscriptions that have been created for a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic.
     * @param resourceTypeName Name of the resource type.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listByResource(
        String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName);

    /**
     * List all event subscriptions that have been created for a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param providerNamespace Namespace of the provider of the topic.
     * @param resourceTypeName Name of the resource type.
     * @param resourceName Name of the resource.
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
    PagedIterable<EventSubscription> listByResource(
        String resourceGroupName,
        String providerNamespace,
        String resourceTypeName,
        String resourceName,
        String filter,
        Integer top,
        Context context);

    /**
     * List all event subscriptions that have been created for a specific domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the top level domain.
     * @param topicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> listByDomainTopic(String resourceGroupName, String domainName, String topicName);

    /**
     * List all event subscriptions that have been created for a specific domain topic.
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
    PagedIterable<EventSubscription> listByDomainTopic(
        String resourceGroupName, String domainName, String topicName, String filter, Integer top, Context context);

    /**
     * Get all delivery attributes for an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription.
     */
    DeliveryAttributeListResult getDeliveryAttributes(String scope, String eventSubscriptionName);

    /**
     * Get all delivery attributes for an event subscription.
     *
     * @param scope The scope of the event subscription. The scope can be a subscription, or a resource group, or a top
     *     level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use
     *     '/subscriptions/{subscriptionId}/' for a subscription,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}'
     *     for a resource, and
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}'
     *     for an EventGrid topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription along with {@link Response}.
     */
    Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(
        String scope, String eventSubscriptionName, Context context);

    /**
     * Get properties of an event subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription along with {@link Response}.
     */
    EventSubscription getById(String id);

    /**
     * Get properties of an event subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription along with {@link Response}.
     */
    Response<EventSubscription> getByIdWithResponse(String id, Context context);

    /**
     * Delete an existing event subscription.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an existing event subscription.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new EventSubscription resource.
     *
     * @param name resource name.
     * @return the first stage of the new EventSubscription definition.
     */
    EventSubscription.DefinitionStages.Blank define(String name);
}
