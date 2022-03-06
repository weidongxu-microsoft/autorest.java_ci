// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.monitor.generated.fluent.PrivateLinkScopeOperationStatusClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.OperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkScopeOperationStatusClient. */
public final class PrivateLinkScopeOperationStatusClientImpl implements PrivateLinkScopeOperationStatusClient {
    /** The proxy service used to perform REST calls. */
    private final PrivateLinkScopeOperationStatusService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of PrivateLinkScopeOperationStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkScopeOperationStatusClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateLinkScopeOperationStatusService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientPrivateLinkScopeOperationStatus to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientPrivate")
    private interface PrivateLinkScopeOperationStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights"
                + "/privateLinkScopeOperationStatuses/{asyncOperationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusInner>> getByResourceGroup(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("asyncOperationId") String asyncOperationId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String asyncOperationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (asyncOperationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter asyncOperationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-10-17-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByResourceGroup(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            asyncOperationId,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param asyncOperationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String asyncOperationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (asyncOperationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter asyncOperationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-10-17-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByResourceGroup(
                this.client.getEndpoint(),
                resourceGroupName,
                asyncOperationId,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> getByResourceGroupAsync(String resourceGroupName, String asyncOperationId) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, asyncOperationId)
            .flatMap(
                (Response<OperationStatusInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner getByResourceGroup(String resourceGroupName, String asyncOperationId) {
        return getByResourceGroupAsync(resourceGroupName, asyncOperationId).block();
    }

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param asyncOperationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation along with
     *     {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusInner> getByResourceGroupWithResponse(
        String resourceGroupName, String asyncOperationId, Context context) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, asyncOperationId, context).block();
    }
}
