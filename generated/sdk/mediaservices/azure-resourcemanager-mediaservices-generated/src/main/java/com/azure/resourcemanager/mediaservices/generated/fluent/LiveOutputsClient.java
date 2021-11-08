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
import com.azure.resourcemanager.mediaservices.generated.fluent.models.LiveOutputInner;

/** An instance of this class provides access to all the operations defined in LiveOutputsClient. */
public interface LiveOutputsClient {
    /**
     * Lists the live outputs of a live event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return liveOutputListResult.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LiveOutputInner> list(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Lists the live outputs of a live event.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return liveOutputListResult.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LiveOutputInner> list(
        String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Gets a live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LiveOutputInner get(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Gets a live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live output.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LiveOutputInner> getWithResponse(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context);

    /**
     * Creates a new live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param parameters Live Output properties needed for creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Live Output.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LiveOutputInner>, LiveOutputInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        String liveOutputName,
        LiveOutputInner parameters);

    /**
     * Creates a new live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param parameters Live Output properties needed for creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Live Output.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LiveOutputInner>, LiveOutputInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        String liveOutputName,
        LiveOutputInner parameters,
        Context context);

    /**
     * Creates a new live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param parameters Live Output properties needed for creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Live Output.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LiveOutputInner create(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        String liveOutputName,
        LiveOutputInner parameters);

    /**
     * Creates a new live output.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param parameters Live Output properties needed for creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Live Output.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LiveOutputInner create(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        String liveOutputName,
        LiveOutputInner parameters,
        Context context);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String liveEventName, String liveOutputName);

    /**
     * Deletes a live output. Deleting a live output does not delete the asset the live output is writing to.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param liveOutputName The name of the live output.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context);
}
