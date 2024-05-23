// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmRegionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmGeoReplicatedRegionInner;
import com.azure.resourcemanager.keyvault.generated.models.ErrorException;
import com.azure.resourcemanager.keyvault.generated.models.MhsmRegionsListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in MhsmRegionsClient.
 */
public final class MhsmRegionsClientImpl implements MhsmRegionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MhsmRegionsService service;

    /**
     * The service client containing this operation class.
     */
    private final KeyVaultManagementClientImpl client;

    /**
     * Initializes an instance of MhsmRegionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MhsmRegionsClientImpl(KeyVaultManagementClientImpl client) {
        this.service
            = RestProxy.create(MhsmRegionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for KeyVaultManagementClientMhsmRegions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "KeyVaultManagementCl")
    public interface MhsmRegionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/managedHSMs/{name}/regions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<MhsmRegionsListResult>> listByResource(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("name") String name,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<MhsmRegionsListResult>> listByResourceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MhsmGeoReplicatedRegionInner>> listByResourceSinglePageAsync(String resourceGroupName,
        String name) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByResource(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, name, accept, context))
            .<PagedResponse<MhsmGeoReplicatedRegionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MhsmGeoReplicatedRegionInner>> listByResourceSinglePageAsync(String resourceGroupName,
        String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResource(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, name, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MhsmGeoReplicatedRegionInner> listByResourceAsync(String resourceGroupName, String name) {
        return new PagedFlux<>(() -> listByResourceSinglePageAsync(resourceGroupName, name),
            nextLink -> listByResourceNextSinglePageAsync(nextLink));
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<MhsmGeoReplicatedRegionInner> listByResourceAsync(String resourceGroupName, String name,
        Context context) {
        return new PagedFlux<>(() -> listByResourceSinglePageAsync(resourceGroupName, name, context),
            nextLink -> listByResourceNextSinglePageAsync(nextLink, context));
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MhsmGeoReplicatedRegionInner> listByResource(String resourceGroupName, String name) {
        return new PagedIterable<>(listByResourceAsync(resourceGroupName, name));
    }

    /**
     * The List operation gets information about the regions associated with the managed HSM Pool.
     * 
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MhsmGeoReplicatedRegionInner> listByResource(String resourceGroupName, String name,
        Context context) {
        return new PagedIterable<>(listByResourceAsync(resourceGroupName, name, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MhsmGeoReplicatedRegionInner>> listByResourceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByResourceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<MhsmGeoReplicatedRegionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regions associated with a managed HSM Pools along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<MhsmGeoReplicatedRegionInner>> listByResourceNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByResourceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
