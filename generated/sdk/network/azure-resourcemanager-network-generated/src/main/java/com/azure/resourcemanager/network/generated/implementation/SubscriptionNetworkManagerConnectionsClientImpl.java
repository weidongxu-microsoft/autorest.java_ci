// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.network.generated.fluent.SubscriptionNetworkManagerConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerConnectionListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SubscriptionNetworkManagerConnectionsClient.
 */
public final class SubscriptionNetworkManagerConnectionsClientImpl
    implements SubscriptionNetworkManagerConnectionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SubscriptionNetworkManagerConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionNetworkManagerConnectionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionNetworkManagerConnectionsClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(SubscriptionNetworkManagerConnectionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientSubscriptionNetworkManagerConnections to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface SubscriptionNetworkManagerConnectionsService {
        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkManagerConnections/{networkManagerConnectionName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkManagerConnectionInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("networkManagerConnectionName") String networkManagerConnectionName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") NetworkManagerConnectionInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkManagerConnections/{networkManagerConnectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkManagerConnectionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("networkManagerConnectionName") String networkManagerConnectionName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkManagerConnections/{networkManagerConnectionName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("networkManagerConnectionName") String networkManagerConnectionName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/networkManagerConnections")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkManagerConnectionListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @QueryParam("$top") Integer top, @QueryParam("$skipToken") String skipToken,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkManagerConnectionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Create a network manager connection on this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param parameters Network manager connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Manager Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkManagerConnectionInner>>
        createOrUpdateWithResponseAsync(String networkManagerConnectionName, NetworkManagerConnectionInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(),
                networkManagerConnectionName, apiVersion, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create a network manager connection on this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param parameters Network manager connection to be created/updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Manager Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkManagerConnectionInner>> createOrUpdateWithResponseAsync(
        String networkManagerConnectionName, NetworkManagerConnectionInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(),
            networkManagerConnectionName, apiVersion, parameters, accept, context);
    }

    /**
     * Create a network manager connection on this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param parameters Network manager connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Manager Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NetworkManagerConnectionInner> createOrUpdateAsync(String networkManagerConnectionName,
        NetworkManagerConnectionInner parameters) {
        return createOrUpdateWithResponseAsync(networkManagerConnectionName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create a network manager connection on this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param parameters Network manager connection to be created/updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Manager Connection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkManagerConnectionInner> createOrUpdateWithResponse(String networkManagerConnectionName,
        NetworkManagerConnectionInner parameters, Context context) {
        return createOrUpdateWithResponseAsync(networkManagerConnectionName, parameters, context).block();
    }

    /**
     * Create a network manager connection on this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param parameters Network manager connection to be created/updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Network Manager Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkManagerConnectionInner createOrUpdate(String networkManagerConnectionName,
        NetworkManagerConnectionInner parameters) {
        return createOrUpdateWithResponse(networkManagerConnectionName, parameters, Context.NONE).getValue();
    }

    /**
     * Get a specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specified connection created by this subscription along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkManagerConnectionInner>> getWithResponseAsync(String networkManagerConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                networkManagerConnectionName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specified connection created by this subscription along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkManagerConnectionInner>> getWithResponseAsync(String networkManagerConnectionName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), networkManagerConnectionName,
            apiVersion, accept, context);
    }

    /**
     * Get a specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specified connection created by this subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NetworkManagerConnectionInner> getAsync(String networkManagerConnectionName) {
        return getWithResponseAsync(networkManagerConnectionName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specified connection created by this subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkManagerConnectionInner> getWithResponse(String networkManagerConnectionName,
        Context context) {
        return getWithResponseAsync(networkManagerConnectionName, context).block();
    }

    /**
     * Get a specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specified connection created by this subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkManagerConnectionInner get(String networkManagerConnectionName) {
        return getWithResponse(networkManagerConnectionName, Context.NONE).getValue();
    }

    /**
     * Delete specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String networkManagerConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(),
                networkManagerConnectionName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String networkManagerConnectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (networkManagerConnectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter networkManagerConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(), networkManagerConnectionName,
            apiVersion, accept, context);
    }

    /**
     * Delete specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String networkManagerConnectionName) {
        return deleteWithResponseAsync(networkManagerConnectionName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String networkManagerConnectionName, Context context) {
        return deleteWithResponseAsync(networkManagerConnectionName, context).block();
    }

    /**
     * Delete specified connection created by this subscription.
     * 
     * @param networkManagerConnectionName Name for the network manager connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String networkManagerConnectionName) {
        deleteWithResponse(networkManagerConnectionName, Context.NONE);
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkManagerConnectionInner>> listSinglePageAsync(Integer top, String skipToken) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion,
                top, skipToken, accept, context))
            .<PagedResponse<NetworkManagerConnectionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkManagerConnectionInner>> listSinglePageAsync(Integer top, String skipToken,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2023-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, top, skipToken, accept,
                context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NetworkManagerConnectionInner> listAsync(Integer top, String skipToken) {
        return new PagedFlux<>(() -> listSinglePageAsync(top, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NetworkManagerConnectionInner> listAsync() {
        final Integer top = null;
        final String skipToken = null;
        return new PagedFlux<>(() -> listSinglePageAsync(top, skipToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<NetworkManagerConnectionInner> listAsync(Integer top, String skipToken, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(top, skipToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkManagerConnectionInner> list() {
        final Integer top = null;
        final String skipToken = null;
        return new PagedIterable<>(listAsync(top, skipToken));
    }

    /**
     * List all network manager connections created by this subscription.
     * 
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NetworkManagerConnectionInner> list(Integer top, String skipToken, Context context) {
        return new PagedIterable<>(listAsync(top, skipToken, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of network manager connections along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkManagerConnectionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<NetworkManagerConnectionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
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
     * @return list of network manager connections along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<NetworkManagerConnectionInner>> listNextSinglePageAsync(String nextLink,
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
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
