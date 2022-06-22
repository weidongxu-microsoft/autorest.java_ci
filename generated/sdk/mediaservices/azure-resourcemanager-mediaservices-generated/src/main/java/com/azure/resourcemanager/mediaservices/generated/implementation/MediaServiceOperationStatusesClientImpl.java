// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

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
import com.azure.resourcemanager.mediaservices.generated.fluent.MediaServiceOperationStatusesClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.MediaServiceOperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MediaServiceOperationStatusesClient. */
public final class MediaServiceOperationStatusesClientImpl implements MediaServiceOperationStatusesClient {
    /** The proxy service used to perform REST calls. */
    private final MediaServiceOperationStatusesService service;

    /** The service client containing this operation class. */
    private final AzureMediaServicesImpl client;

    /**
     * Initializes an instance of MediaServiceOperationStatusesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MediaServiceOperationStatusesClientImpl(AzureMediaServicesImpl client) {
        this.service =
            RestProxy
                .create(
                    MediaServiceOperationStatusesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureMediaServicesMediaServiceOperationStatuses to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureMediaServicesMe")
    private interface MediaServiceOperationStatusesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Media/locations/{locationName}"
                + "/mediaServiceOperationStatuses/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MediaServiceOperationStatusInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("locationName") String locationName,
            @PathParam("operationId") String operationId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MediaServiceOperationStatusInner>> getWithResponseAsync(
        String locationName, String operationId) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            locationName,
                            operationId,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MediaServiceOperationStatusInner>> getWithResponseAsync(
        String locationName, String operationId, Context context) {
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
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                locationName,
                operationId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<MediaServiceOperationStatusInner> getAsync(String locationName, String operationId) {
        return getWithResponseAsync(locationName, operationId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MediaServiceOperationStatusInner get(String locationName, String operationId) {
        return getAsync(locationName, operationId).block();
    }

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MediaServiceOperationStatusInner> getWithResponse(
        String locationName, String operationId, Context context) {
        return getWithResponseAsync(locationName, operationId, context).block();
    }
}
