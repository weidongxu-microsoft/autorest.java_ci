// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.search.generated.fluent.QueryKeysClient;
import com.azure.resourcemanager.search.generated.fluent.models.QueryKeyInner;
import com.azure.resourcemanager.search.generated.models.ListQueryKeysResult;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in QueryKeysClient.
 */
public final class QueryKeysClientImpl implements QueryKeysClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final QueryKeysService service;

    /**
     * The service client containing this operation class.
     */
    private final SearchManagementClientImpl client;

    /**
     * Initializes an instance of QueryKeysClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    QueryKeysClientImpl(SearchManagementClientImpl client) {
        this.service
            = RestProxy.create(QueryKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SearchManagementClientQueryKeys to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SearchManagementClie")
    public interface QueryKeysService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/createQueryKey/{name}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QueryKeyInner>> create(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("searchServiceName") String searchServiceName, @PathParam("name") String name,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/listQueryKeys")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListQueryKeysResult>> listBySearchService(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("searchServiceName") String searchServiceName,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/deleteQueryKey/{key}")
        @ExpectedResponses({ 200, 204, 404 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("searchServiceName") String searchServiceName, @PathParam("key") String key,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListQueryKeysResult>> listBySearchServiceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("x-ms-client-request-id") UUID clientRequestId, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given search service that has permissions for query operations only along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryKeyInner>> createWithResponseAsync(String resourceGroupName, String searchServiceName,
        String name, UUID clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.create(this.client.getEndpoint(), resourceGroupName, searchServiceName,
                name, clientRequestId, this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given search service that has permissions for query operations only along with
     * {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryKeyInner>> createWithResponseAsync(String resourceGroupName, String searchServiceName,
        String name, UUID clientRequestId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), resourceGroupName, searchServiceName, name, clientRequestId,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given search service that has permissions for query operations only on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QueryKeyInner> createAsync(String resourceGroupName, String searchServiceName, String name) {
        final UUID clientRequestId = null;
        return createWithResponseAsync(resourceGroupName, searchServiceName, name, clientRequestId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given search service that has permissions for query operations only along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryKeyInner> createWithResponse(String resourceGroupName, String searchServiceName, String name,
        UUID clientRequestId, Context context) {
        return createWithResponseAsync(resourceGroupName, searchServiceName, name, clientRequestId, context).block();
    }

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param name The name of the new query API key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given search service that has permissions for query operations only.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryKeyInner create(String resourceGroupName, String searchServiceName, String name) {
        final UUID clientRequestId = null;
        return createWithResponse(resourceGroupName, searchServiceName, name, clientRequestId, Context.NONE).getValue();
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryKeyInner>> listBySearchServiceSinglePageAsync(String resourceGroupName,
        String searchServiceName, UUID clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listBySearchService(this.client.getEndpoint(), resourceGroupName, searchServiceName,
                    clientRequestId, this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<QueryKeyInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryKeyInner>> listBySearchServiceSinglePageAsync(String resourceGroupName,
        String searchServiceName, UUID clientRequestId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySearchService(this.client.getEndpoint(), resourceGroupName, searchServiceName, clientRequestId,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryKeyInner> listBySearchServiceAsync(String resourceGroupName, String searchServiceName,
        UUID clientRequestId) {
        return new PagedFlux<>(
            () -> listBySearchServiceSinglePageAsync(resourceGroupName, searchServiceName, clientRequestId),
            nextLink -> listBySearchServiceNextSinglePageAsync(nextLink, clientRequestId));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryKeyInner> listBySearchServiceAsync(String resourceGroupName, String searchServiceName) {
        final UUID clientRequestId = null;
        return new PagedFlux<>(
            () -> listBySearchServiceSinglePageAsync(resourceGroupName, searchServiceName, clientRequestId),
            nextLink -> listBySearchServiceNextSinglePageAsync(nextLink, clientRequestId));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<QueryKeyInner> listBySearchServiceAsync(String resourceGroupName, String searchServiceName,
        UUID clientRequestId, Context context) {
        return new PagedFlux<>(
            () -> listBySearchServiceSinglePageAsync(resourceGroupName, searchServiceName, clientRequestId, context),
            nextLink -> listBySearchServiceNextSinglePageAsync(nextLink, clientRequestId, context));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueryKeyInner> listBySearchService(String resourceGroupName, String searchServiceName) {
        final UUID clientRequestId = null;
        return new PagedIterable<>(listBySearchServiceAsync(resourceGroupName, searchServiceName, clientRequestId));
    }

    /**
     * Returns the list of query API keys for the given search service.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<QueryKeyInner> listBySearchService(String resourceGroupName, String searchServiceName,
        UUID clientRequestId, Context context) {
        return new PagedIterable<>(
            listBySearchServiceAsync(resourceGroupName, searchServiceName, clientRequestId, context));
    }

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String searchServiceName, String key,
        UUID clientRequestId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (key == null) {
            return Mono.error(new IllegalArgumentException("Parameter key is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), resourceGroupName, searchServiceName, key,
                clientRequestId, this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String searchServiceName, String key,
        UUID clientRequestId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (searchServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter searchServiceName is required and cannot be null."));
        }
        if (key == null) {
            return Mono.error(new IllegalArgumentException("Parameter key is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), resourceGroupName, searchServiceName, key, clientRequestId,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String searchServiceName, String key) {
        final UUID clientRequestId = null;
        return deleteWithResponseAsync(resourceGroupName, searchServiceName, key, clientRequestId)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String searchServiceName, String key,
        UUID clientRequestId, Context context) {
        return deleteWithResponseAsync(resourceGroupName, searchServiceName, key, clientRequestId, context).block();
    }

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     * 
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     * value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the search service associated with the specified resource group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String searchServiceName, String key) {
        final UUID clientRequestId = null;
        deleteWithResponse(resourceGroupName, searchServiceName, key, clientRequestId, Context.NONE);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryKeyInner>> listBySearchServiceNextSinglePageAsync(String nextLink,
        UUID clientRequestId) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listBySearchServiceNext(nextLink, this.client.getEndpoint(),
                clientRequestId, accept, context))
            .<PagedResponse<QueryKeyInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given search service along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<QueryKeyInner>> listBySearchServiceNextSinglePageAsync(String nextLink,
        UUID clientRequestId, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listBySearchServiceNext(nextLink, this.client.getEndpoint(), clientRequestId, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
