// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.resourcemanager.resourcegraph.generated.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner;
import com.azure.resourcemanager.resourcegraph.generated.models.QueryRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ResourceProvidersClient.
 */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ResourceProvidersService service;

    /**
     * The service client containing this operation class.
     */
    private final ResourceGraphClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(ResourceGraphClientImpl client) {
        this.service
            = RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceGraphClientResourceProviders to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ResourceGraphClientR")
    public interface ResourceProvidersService {
        @Headers({ "Content-Type: application/json" })
        @Post("/providers/Microsoft.ResourceGraph/resources")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QueryResponseInner>> resources(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @BodyParam("application/json") QueryRequest query,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     * 
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResponseInner>> resourcesWithResponseAsync(QueryRequest query) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (query == null) {
            return Mono.error(new IllegalArgumentException("Parameter query is required and cannot be null."));
        } else {
            query.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.resources(this.client.getEndpoint(), this.client.getApiVersion(), query,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     * 
     * @param query Request specifying query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResponseInner>> resourcesWithResponseAsync(QueryRequest query, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (query == null) {
            return Mono.error(new IllegalArgumentException("Parameter query is required and cannot be null."));
        } else {
            query.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.resources(this.client.getEndpoint(), this.client.getApiVersion(), query, accept, context);
    }

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     * 
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QueryResponseInner> resourcesAsync(QueryRequest query) {
        return resourcesWithResponseAsync(query).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     * 
     * @param query Request specifying query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResponseInner> resourcesWithResponse(QueryRequest query, Context context) {
        return resourcesWithResponseAsync(query, context).block();
    }

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     * 
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResponseInner resources(QueryRequest query) {
        return resourcesWithResponse(query, Context.NONE).getValue();
    }
}
