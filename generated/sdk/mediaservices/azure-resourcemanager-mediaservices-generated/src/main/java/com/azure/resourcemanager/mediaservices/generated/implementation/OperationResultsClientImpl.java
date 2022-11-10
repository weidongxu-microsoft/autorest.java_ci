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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.mediaservices.generated.fluent.OperationResultsClient;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AssetTrackInner;
import com.azure.resourcemanager.mediaservices.generated.models.OperationResultsGetResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationResultsClient. */
public final class OperationResultsClientImpl implements OperationResultsClient {
    /** The proxy service used to perform REST calls. */
    private final OperationResultsService service;

    /** The service client containing this operation class. */
    private final AzureMediaServicesImpl client;

    /**
     * Initializes an instance of OperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationResultsClientImpl(AzureMediaServicesImpl client) {
        this.service =
            RestProxy.create(OperationResultsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureMediaServicesOperationResults to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureMediaServicesOp")
    public interface OperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Media/mediaServices"
                + "/{accountName}/assets/{assetName}/tracks/{trackName}/operationResults/{operationId}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<OperationResultsGetResponse> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("assetName") String assetName,
            @PathParam("trackName") String trackName,
            @PathParam("operationId") String operationId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get operation result.
     *
     * <p>Get asset track operation result.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset track operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultsGetResponse> getWithResponseAsync(
        String resourceGroupName, String accountName, String assetName, String trackName, String operationId) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (assetName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assetName is required and cannot be null."));
        }
        if (trackName == null) {
            return Mono.error(new IllegalArgumentException("Parameter trackName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2022-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            assetName,
                            trackName,
                            operationId,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get operation result.
     *
     * <p>Get asset track operation result.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset track operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultsGetResponse> getWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String assetName,
        String trackName,
        String operationId,
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (assetName == null) {
            return Mono.error(new IllegalArgumentException("Parameter assetName is required and cannot be null."));
        }
        if (trackName == null) {
            return Mono.error(new IllegalArgumentException("Parameter trackName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2022-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                accountName,
                assetName,
                trackName,
                operationId,
                apiVersion,
                accept,
                context);
    }

    /**
     * Get operation result.
     *
     * <p>Get asset track operation result.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset track operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AssetTrackInner> getAsync(
        String resourceGroupName, String accountName, String assetName, String trackName, String operationId) {
        return getWithResponseAsync(resourceGroupName, accountName, assetName, trackName, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get operation result.
     *
     * <p>Get asset track operation result.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset track operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationResultsGetResponse getWithResponse(
        String resourceGroupName,
        String accountName,
        String assetName,
        String trackName,
        String operationId,
        Context context) {
        return getWithResponseAsync(resourceGroupName, accountName, assetName, trackName, operationId, context).block();
    }

    /**
     * Get operation result.
     *
     * <p>Get asset track operation result.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param trackName The Asset Track name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asset track operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AssetTrackInner get(
        String resourceGroupName, String accountName, String assetName, String trackName, String operationId) {
        return getWithResponse(resourceGroupName, accountName, assetName, trackName, operationId, Context.NONE)
            .getValue();
    }
}
