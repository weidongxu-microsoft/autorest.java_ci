// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ConsumerGroups. */
public interface ConsumerGroups {
    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, Context context);

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group.
     */
    ConsumerGroup get(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName);

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param consumerGroupName The consumer group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group.
     */
    Response<ConsumerGroup> getWithResponse(
        String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, Context context);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace.
     */
    PagedIterable<ConsumerGroup> listByEventHub(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the
     * Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param eventHubName The Event Hub name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the consumer groups in a Namespace.
     */
    PagedIterable<ConsumerGroup> listByEventHub(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Gets a description for the specified consumer group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group.
     */
    ConsumerGroup getById(String id);

    /**
     * Gets a description for the specified consumer group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified consumer group.
     */
    Response<ConsumerGroup> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConsumerGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConsumerGroup definition.
     */
    ConsumerGroup.DefinitionStages.Blank define(String name);
}
