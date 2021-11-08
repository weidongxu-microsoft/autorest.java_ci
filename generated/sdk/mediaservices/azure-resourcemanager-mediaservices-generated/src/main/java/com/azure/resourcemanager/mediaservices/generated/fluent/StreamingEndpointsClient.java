// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.StreamingEndpointInner;
import com.azure.resourcemanager.mediaservices.generated.models.StreamingEntityScaleUnit;

/** An instance of this class provides access to all the operations defined in StreamingEndpointsClient. */
public interface StreamingEndpointsClient {
    /**
     * Lists the streaming endpoints in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return streamingEndpointListResult.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StreamingEndpointInner> list(String resourceGroupName, String accountName);

    /**
     * Lists the streaming endpoints in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return streamingEndpointListResult.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StreamingEndpointInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Gets a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner get(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Gets a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StreamingEndpointInner> getWithResponse(
        String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Creates a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param autoStart The flag indicates if the resource should be automatically started on creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StreamingEndpointInner>, StreamingEndpointInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Boolean autoStart);

    /**
     * Creates a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param autoStart The flag indicates if the resource should be automatically started on creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StreamingEndpointInner>, StreamingEndpointInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Boolean autoStart,
        Context context);

    /**
     * Creates a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param autoStart The flag indicates if the resource should be automatically started on creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner create(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Boolean autoStart);

    /**
     * Creates a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner create(
        String resourceGroupName, String accountName, String streamingEndpointName, StreamingEndpointInner parameters);

    /**
     * Creates a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param autoStart The flag indicates if the resource should be automatically started on creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner create(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Boolean autoStart,
        Context context);

    /**
     * Updates a existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StreamingEndpointInner>, StreamingEndpointInner> beginUpdate(
        String resourceGroupName, String accountName, String streamingEndpointName, StreamingEndpointInner parameters);

    /**
     * Updates a existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<StreamingEndpointInner>, StreamingEndpointInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Context context);

    /**
     * Updates a existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner update(
        String resourceGroupName, String accountName, String streamingEndpointName, StreamingEndpointInner parameters);

    /**
     * Updates a existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint properties needed for creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the streaming endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StreamingEndpointInner update(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEndpointInner parameters,
        Context context);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Deletes a streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Starts an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Stops an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String accountName, String streamingEndpointName, Context context);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint scale parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginScale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint scale parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginScale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters,
        Context context);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint scale parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void scale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters);

    /**
     * Scales an existing streaming endpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the streaming endpoint, maximum length is 24.
     * @param parameters Streaming endpoint scale parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void scale(
        String resourceGroupName,
        String accountName,
        String streamingEndpointName,
        StreamingEntityScaleUnit parameters,
        Context context);
}
