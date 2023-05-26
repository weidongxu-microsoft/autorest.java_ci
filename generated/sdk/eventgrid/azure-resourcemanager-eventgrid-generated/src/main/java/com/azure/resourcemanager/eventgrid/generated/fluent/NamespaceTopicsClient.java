// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceTopicInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.TopicSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.generated.models.NamespaceTopicUpdateParameters;
import com.azure.resourcemanager.eventgrid.generated.models.TopicRegenerateKeyRequest;

/** An instance of this class provides access to all the operations defined in NamespaceTopicsClient. */
public interface NamespaceTopicsClient {
    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NamespaceTopicInner> getWithResponse(
        String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * Get a namespace topic.
     *
     * <p>Get properties of a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a namespace topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceTopicInner get(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Create a namespace topic.
     *
     * <p>Asynchronously creates a new namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicInfo Namespace topic information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamespaceTopicInner>, NamespaceTopicInner> beginCreateOrUpdate(
        String resourceGroupName, String namespaceName, String topicName, NamespaceTopicInner namespaceTopicInfo);

    /**
     * Create a namespace topic.
     *
     * <p>Asynchronously creates a new namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicInfo Namespace topic information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamespaceTopicInner>, NamespaceTopicInner> beginCreateOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicInner namespaceTopicInfo,
        Context context);

    /**
     * Create a namespace topic.
     *
     * <p>Asynchronously creates a new namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicInfo Namespace topic information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceTopicInner createOrUpdate(
        String resourceGroupName, String namespaceName, String topicName, NamespaceTopicInner namespaceTopicInfo);

    /**
     * Create a namespace topic.
     *
     * <p>Asynchronously creates a new namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicInfo Namespace topic information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceTopicInner createOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicInner namespaceTopicInfo,
        Context context);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Delete a namespace topic.
     *
     * <p>Delete existing namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * Update a namespace topic.
     *
     * <p>Asynchronously updates a namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicUpdateParameters Namespace topic update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamespaceTopicInner>, NamespaceTopicInner> beginUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicUpdateParameters namespaceTopicUpdateParameters);

    /**
     * Update a namespace topic.
     *
     * <p>Asynchronously updates a namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicUpdateParameters Namespace topic update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NamespaceTopicInner>, NamespaceTopicInner> beginUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicUpdateParameters namespaceTopicUpdateParameters,
        Context context);

    /**
     * Update a namespace topic.
     *
     * <p>Asynchronously updates a namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicUpdateParameters Namespace topic update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceTopicInner update(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicUpdateParameters namespaceTopicUpdateParameters);

    /**
     * Update a namespace topic.
     *
     * <p>Asynchronously updates a namespace topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param namespaceTopicUpdateParameters Namespace topic update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace topic details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceTopicInner update(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        NamespaceTopicUpdateParameters namespaceTopicUpdateParameters,
        Context context);

    /**
     * List namespace topics under a namespace.
     *
     * <p>List all the namespace topics under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List namespace topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceTopicInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * List namespace topics under a namespace.
     *
     * <p>List all the namespace topics under a namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
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
     * @return result of the List namespace topics operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceTopicInner> listByNamespace(
        String resourceGroupName, String namespaceName, String filter, Integer top, Context context);

    /**
     * List keys for a namespace topic.
     *
     * <p>List the two keys used to publish to a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TopicSharedAccessKeysInner> listSharedAccessKeysWithResponse(
        String resourceGroupName, String namespaceName, String topicName, Context context);

    /**
     * List keys for a namespace topic.
     *
     * <p>List the two keys used to publish to a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopicSharedAccessKeysInner listSharedAccessKeys(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of shared access keys of the Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TopicSharedAccessKeysInner>, TopicSharedAccessKeysInner> beginRegenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of shared access keys of the Topic.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TopicSharedAccessKeysInner>, TopicSharedAccessKeysInner> beginRegenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest,
        Context context);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopicSharedAccessKeysInner regenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate key for a namespace topic.
     *
     * <p>Regenerate a shared access key for a namespace topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the topic.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopicSharedAccessKeysInner regenerateKey(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        TopicRegenerateKeyRequest regenerateKeyRequest,
        Context context);
}