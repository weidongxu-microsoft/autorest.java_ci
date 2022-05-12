// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.iothub.generated.fluent.ResourceProviderCommonsClient;
import com.azure.resourcemanager.iothub.generated.fluent.models.UserSubscriptionQuotaListResultInner;
import com.azure.resourcemanager.iothub.generated.models.ErrorDetailsException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProviderCommonsClient. */
public final class ResourceProviderCommonsClientImpl implements ResourceProviderCommonsClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProviderCommonsService service;

    /** The service client containing this operation class. */
    private final IotHubClientImpl client;

    /**
     * Initializes an instance of ResourceProviderCommonsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProviderCommonsClientImpl(IotHubClientImpl client) {
        this.service =
            RestProxy
                .create(ResourceProviderCommonsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for IotHubClientResourceProviderCommons to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "IotHubClientResource")
    private interface ResourceProviderCommonsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Devices/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorDetailsException.class)
        Mono<Response<UserSubscriptionQuotaListResultInner>> getSubscriptionQuota(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<UserSubscriptionQuotaListResultInner>> getSubscriptionQuotaWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getSubscriptionQuota(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<UserSubscriptionQuotaListResultInner>> getSubscriptionQuotaWithResponseAsync(
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getSubscriptionQuota(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<UserSubscriptionQuotaListResultInner> getSubscriptionQuotaAsync() {
        return getSubscriptionQuotaWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserSubscriptionQuotaListResultInner getSubscriptionQuota() {
        return getSubscriptionQuotaAsync().block();
    }

    /**
     * Get the number of free and paid iot hubs in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorDetailsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of free and paid iot hubs in the subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UserSubscriptionQuotaListResultInner> getSubscriptionQuotaWithResponse(Context context) {
        return getSubscriptionQuotaWithResponseAsync(context).block();
    }
}
