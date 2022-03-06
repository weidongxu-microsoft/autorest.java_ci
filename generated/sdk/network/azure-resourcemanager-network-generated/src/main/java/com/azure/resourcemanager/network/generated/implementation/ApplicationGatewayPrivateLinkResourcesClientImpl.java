// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.network.generated.fluent.ApplicationGatewayPrivateLinkResourcesClient;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkResourceInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateLinkResourceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ApplicationGatewayPrivateLinkResourcesClient.
 */
public final class ApplicationGatewayPrivateLinkResourcesClientImpl
    implements ApplicationGatewayPrivateLinkResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final ApplicationGatewayPrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ApplicationGatewayPrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApplicationGatewayPrivateLinkResourcesClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ApplicationGatewayPrivateLinkResourcesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientApplicationGatewayPrivateLinkResources to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface ApplicationGatewayPrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/applicationGateways/{applicationGatewayName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationGatewayPrivateLinkResourceListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("applicationGatewayName") String applicationGatewayName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationGatewayPrivateLinkResourceListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGatewayName) {
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
        if (applicationGatewayName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            applicationGatewayName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>> listSinglePageAsync(
        String resourceGroupName, String applicationGatewayName, Context context) {
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
        if (applicationGatewayName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                applicationGatewayName,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApplicationGatewayPrivateLinkResourceInner> listAsync(
        String resourceGroupName, String applicationGatewayName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGatewayName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApplicationGatewayPrivateLinkResourceInner> listAsync(
        String resourceGroupName, String applicationGatewayName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, applicationGatewayName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationGatewayPrivateLinkResourceInner> list(
        String resourceGroupName, String applicationGatewayName) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGatewayName));
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationGatewayPrivateLinkResourceInner> list(
        String resourceGroupName, String applicationGatewayName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, applicationGatewayName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateLinkResources API service call along with {@link PagedResponse}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationGatewayPrivateLinkResourceInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
