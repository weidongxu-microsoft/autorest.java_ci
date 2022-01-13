// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.FrontDoorNameAvailabilityWithSubscriptionsClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.frontdoor.generated.models.CheckNameAvailabilityInput;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FrontDoorNameAvailabilityWithSubscriptionsClient.
 */
public final class FrontDoorNameAvailabilityWithSubscriptionsClientImpl
    implements FrontDoorNameAvailabilityWithSubscriptionsClient {
    private final ClientLogger logger = new ClientLogger(FrontDoorNameAvailabilityWithSubscriptionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final FrontDoorNameAvailabilityWithSubscriptionsService service;

    /** The service client containing this operation class. */
    private final FrontDoorManagementClientImpl client;

    /**
     * Initializes an instance of FrontDoorNameAvailabilityWithSubscriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FrontDoorNameAvailabilityWithSubscriptionsClientImpl(FrontDoorManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    FrontDoorNameAvailabilityWithSubscriptionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for FrontDoorManagementClientFrontDoorNameAvailabilityWithSubscriptions
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "FrontDoorManagementC")
    private interface FrontDoorNameAvailabilityWithSubscriptionsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Network/checkFrontDoorNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityOutputInner>> check(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check the availability of a Front Door subdomain.
     *
     * @param checkFrontDoorNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityOutputInner>> checkWithResponseAsync(
        CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput) {
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
        if (checkFrontDoorNameAvailabilityInput == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkFrontDoorNameAvailabilityInput is required and cannot be null."));
        } else {
            checkFrontDoorNameAvailabilityInput.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .check(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            checkFrontDoorNameAvailabilityInput,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check the availability of a Front Door subdomain.
     *
     * @param checkFrontDoorNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityOutputInner>> checkWithResponseAsync(
        CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput, Context context) {
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
        if (checkFrontDoorNameAvailabilityInput == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkFrontDoorNameAvailabilityInput is required and cannot be null."));
        } else {
            checkFrontDoorNameAvailabilityInput.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .check(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                apiVersion,
                checkFrontDoorNameAvailabilityInput,
                accept,
                context);
    }

    /**
     * Check the availability of a Front Door subdomain.
     *
     * @param checkFrontDoorNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityOutputInner> checkAsync(
        CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput) {
        return checkWithResponseAsync(checkFrontDoorNameAvailabilityInput)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of a Front Door subdomain.
     *
     * @param checkFrontDoorNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner check(CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput) {
        return checkAsync(checkFrontDoorNameAvailabilityInput).block();
    }

    /**
     * Check the availability of a Front Door subdomain.
     *
     * @param checkFrontDoorNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityOutputInner> checkWithResponse(
        CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput, Context context) {
        return checkWithResponseAsync(checkFrontDoorNameAvailabilityInput, context).block();
    }
}
