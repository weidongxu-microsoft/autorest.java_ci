// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

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
import com.azure.resourcemanager.databoxedge.generated.fluent.AvailableSkusClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DataBoxEdgeSkuInner;
import com.azure.resourcemanager.databoxedge.generated.models.DataBoxEdgeSkuList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AvailableSkusClient.
 */
public final class AvailableSkusClientImpl implements AvailableSkusClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AvailableSkusService service;

    /**
     * The service client containing this operation class.
     */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of AvailableSkusClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AvailableSkusClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service
            = RestProxy.create(AvailableSkusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientAvailableSkus to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    public interface AvailableSkusService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DataBoxEdge/availableSkus")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataBoxEdgeSkuList>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataBoxEdgeSkuList>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataBoxEdgeSkuInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), accept, context))
            .<PagedResponse<DataBoxEdgeSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataBoxEdgeSkuInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(), accept,
                context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataBoxEdgeSkuInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataBoxEdgeSkuInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataBoxEdgeSkuInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * List all the available Skus and information related to them.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataBoxEdgeSkuInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataBoxEdgeSkuInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DataBoxEdgeSkuInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU Information objects along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataBoxEdgeSkuInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
