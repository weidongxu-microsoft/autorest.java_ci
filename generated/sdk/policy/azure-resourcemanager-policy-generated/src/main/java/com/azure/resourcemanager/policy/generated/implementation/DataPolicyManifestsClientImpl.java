// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

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
import com.azure.resourcemanager.policy.generated.fluent.DataPolicyManifestsClient;
import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;
import com.azure.resourcemanager.policy.generated.models.DataPolicyManifestListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataPolicyManifestsClient. */
public final class DataPolicyManifestsClientImpl implements DataPolicyManifestsClient {
    /** The proxy service used to perform REST calls. */
    private final DataPolicyManifestsService service;

    /** The service client containing this operation class. */
    private final PolicyClientImpl client;

    /**
     * Initializes an instance of DataPolicyManifestsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DataPolicyManifestsClientImpl(PolicyClientImpl client) {
        this.service =
            RestProxy.create(DataPolicyManifestsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyClientDataPolicyManifests to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PolicyClientDataPoli")
    public interface DataPolicyManifestsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/dataPolicyManifests/{policyMode}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataPolicyManifestInner>> getByPolicyMode(
            @HostParam("$host") String endpoint,
            @PathParam("policyMode") String policyMode,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/dataPolicyManifests")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataPolicyManifestListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam(value = "$filter", encoded = true) String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataPolicyManifestListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves a data policy manifest.
     *
     * <p>This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataPolicyManifestInner>> getByPolicyModeWithResponseAsync(String policyMode) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (policyMode == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyMode is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getByPolicyMode(this.client.getEndpoint(), policyMode, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves a data policy manifest.
     *
     * <p>This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataPolicyManifestInner>> getByPolicyModeWithResponseAsync(
        String policyMode, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (policyMode == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyMode is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getByPolicyMode(this.client.getEndpoint(), policyMode, apiVersion, accept, context);
    }

    /**
     * Retrieves a data policy manifest.
     *
     * <p>This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataPolicyManifestInner> getByPolicyModeAsync(String policyMode) {
        return getByPolicyModeWithResponseAsync(policyMode).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves a data policy manifest.
     *
     * <p>This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataPolicyManifestInner> getByPolicyModeWithResponse(String policyMode, Context context) {
        return getByPolicyModeWithResponseAsync(policyMode, context).block();
    }

    /**
     * Retrieves a data policy manifest.
     *
     * <p>This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPolicyManifestInner getByPolicyMode(String policyMode) {
        return getByPolicyModeWithResponse(policyMode, Context.NONE).getValue();
    }

    /**
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataPolicyManifestInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, filter, accept, context))
            .<PagedResponse<DataPolicyManifestInner>>map(
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
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataPolicyManifestInner>> listSinglePageAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, filter, accept, context)
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
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataPolicyManifestInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataPolicyManifestInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataPolicyManifestInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataPolicyManifestInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Retrieves data policy manifests
     *
     * <p>This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataPolicyManifestInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataPolicyManifestInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<DataPolicyManifestInner>>map(
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
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataPolicyManifestInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
