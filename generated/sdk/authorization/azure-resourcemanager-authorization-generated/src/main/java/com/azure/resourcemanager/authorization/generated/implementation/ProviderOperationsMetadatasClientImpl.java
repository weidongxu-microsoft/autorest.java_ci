// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.implementation;

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
import com.azure.resourcemanager.authorization.generated.fluent.ProviderOperationsMetadatasClient;
import com.azure.resourcemanager.authorization.generated.fluent.models.ProviderOperationsMetadataInner;
import com.azure.resourcemanager.authorization.generated.models.ProviderOperationsMetadataListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProviderOperationsMetadatasClient. */
public final class ProviderOperationsMetadatasClientImpl implements ProviderOperationsMetadatasClient {
    /** The proxy service used to perform REST calls. */
    private final ProviderOperationsMetadatasService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of ProviderOperationsMetadatasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProviderOperationsMetadatasClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ProviderOperationsMetadatasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientProviderOperationsMetadatas to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface ProviderOperationsMetadatasService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/providerOperations/{resourceProviderNamespace}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceProviderNamespace", encoded = true) String resourceProviderNamespace,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Authorization/providerOperations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$expand") String expand,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProviderOperationsMetadataListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProviderOperationsMetadataInner>> getWithResponseAsync(
        String resourceProviderNamespace, String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(this.client.getEndpoint(), resourceProviderNamespace, apiVersion, expand, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProviderOperationsMetadataInner>> getWithResponseAsync(
        String resourceProviderNamespace, String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceProviderNamespace == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter resourceProviderNamespace is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceProviderNamespace, apiVersion, expand, accept, context);
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProviderOperationsMetadataInner> getAsync(String resourceProviderNamespace, String expand) {
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(
                (Response<ProviderOperationsMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProviderOperationsMetadataInner> getAsync(String resourceProviderNamespace) {
        final String expand = null;
        return getWithResponseAsync(resourceProviderNamespace, expand)
            .flatMap(
                (Response<ProviderOperationsMetadataInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProviderOperationsMetadataInner get(String resourceProviderNamespace) {
        final String expand = null;
        return getAsync(resourceProviderNamespace, expand).block();
    }

    /**
     * Gets provider operations metadata for the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for the specified resource provider along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProviderOperationsMetadataInner> getWithResponse(
        String resourceProviderNamespace, String expand, Context context) {
        return getWithResponseAsync(resourceProviderNamespace, expand, context).block();
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProviderOperationsMetadataInner>> listSinglePageAsync(String expand) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, expand, accept, context))
            .<PagedResponse<ProviderOperationsMetadataInner>>map(
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
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProviderOperationsMetadataInner>> listSinglePageAsync(String expand, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2018-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, expand, accept, context)
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
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProviderOperationsMetadataInner> listAsync(String expand) {
        return new PagedFlux<>(() -> listSinglePageAsync(expand), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProviderOperationsMetadataInner> listAsync() {
        final String expand = null;
        return new PagedFlux<>(() -> listSinglePageAsync(expand), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ProviderOperationsMetadataInner> listAsync(String expand, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(expand, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderOperationsMetadataInner> list() {
        final String expand = null;
        return new PagedIterable<>(listAsync(expand));
    }

    /**
     * Gets provider operations metadata for all resource providers.
     *
     * @param expand Specifies whether to expand the values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata for all resource providers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderOperationsMetadataInner> list(String expand, Context context) {
        return new PagedIterable<>(listAsync(expand, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider operations metadata list along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProviderOperationsMetadataInner>> listNextSinglePageAsync(String nextLink) {
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
            .<PagedResponse<ProviderOperationsMetadataInner>>map(
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
     * @return provider operations metadata list along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ProviderOperationsMetadataInner>> listNextSinglePageAsync(
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
