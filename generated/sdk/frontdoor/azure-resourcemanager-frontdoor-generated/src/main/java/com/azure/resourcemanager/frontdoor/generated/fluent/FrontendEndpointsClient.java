// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.FrontendEndpointInner;
import com.azure.resourcemanager.frontdoor.generated.models.CustomHttpsConfiguration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FrontendEndpointsClient. */
public interface FrontendEndpointsClient {
    /**
     * Lists all of the frontend endpoints within a Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list frontend endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontendEndpointInner> listByFrontDoor(String resourceGroupName, String frontDoorName);

    /**
     * Lists all of the frontend endpoints within a Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list frontend endpoints.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FrontendEndpointInner> listByFrontDoor(
        String resourceGroupName, String frontDoorName, Context context);

    /**
     * Gets a Frontend endpoint with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Frontend endpoint with the specified name within the specified Front Door.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FrontendEndpointInner get(String resourceGroupName, String frontDoorName, String frontendEndpointName);

    /**
     * Gets a Frontend endpoint with the specified name within the specified Front Door.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Frontend endpoint with the specified name within the specified Front Door along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FrontendEndpointInner> getWithResponse(
        String resourceGroupName, String frontDoorName, String frontendEndpointName, Context context);

    /**
     * Enables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param customHttpsConfiguration The configuration specifying how to enable HTTPS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration);

    /**
     * Enables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param customHttpsConfiguration The configuration specifying how to enable HTTPS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginEnableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration,
        Context context);

    /**
     * Enables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param customHttpsConfiguration The configuration specifying how to enable HTTPS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration);

    /**
     * Enables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param customHttpsConfiguration The configuration specifying how to enable HTTPS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void enableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration,
        Context context);

    /**
     * Disables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableHttps(
        String resourceGroupName, String frontDoorName, String frontendEndpointName);

    /**
     * Disables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDisableHttps(
        String resourceGroupName, String frontDoorName, String frontendEndpointName, Context context);

    /**
     * Disables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableHttps(String resourceGroupName, String frontDoorName, String frontendEndpointName);

    /**
     * Disables a frontendEndpoint for HTTPS traffic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param frontendEndpointName Name of the Frontend endpoint which is unique within the Front Door.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void disableHttps(String resourceGroupName, String frontDoorName, String frontendEndpointName, Context context);
}
