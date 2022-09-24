// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

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
import com.azure.resourcemanager.mysql.generated.fluent.RecommendedActionsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.RecommendationActionInner;
import com.azure.resourcemanager.mysql.generated.models.RecommendationActionsResultList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecommendedActionsClient. */
public final class RecommendedActionsClientImpl implements RecommendedActionsClient {
    /** The proxy service used to perform REST calls. */
    private final RecommendedActionsService service;

    /** The service client containing this operation class. */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of RecommendedActionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RecommendedActionsClientImpl(MySqlManagementClientImpl client) {
        this.service =
            RestProxy.create(RecommendedActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientRecommendedActions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    private interface RecommendedActionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/servers"
                + "/{serverName}/advisors/{advisorName}/recommendedActions/{recommendedActionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendationActionInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("advisorName") String advisorName,
            @PathParam("recommendedActionName") String recommendedActionName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/servers"
                + "/{serverName}/advisors/{advisorName}/recommendedActions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendationActionsResultList>> listByServer(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("advisorName") String advisorName,
            @QueryParam("sessionId") String sessionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendationActionsResultList>> listByServerNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendationActionInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            advisorName,
                            recommendedActionName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendationActionInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String advisorName,
        String recommendedActionName,
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                advisorName,
                recommendedActionName,
                accept,
                context);
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RecommendationActionInner> getAsync(
        String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        return getWithResponseAsync(resourceGroupName, serverName, advisorName, recommendedActionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecommendationActionInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String advisorName,
        String recommendedActionName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, advisorName, recommendedActionName, context).block();
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecommendationActionInner get(
        String resourceGroupName, String serverName, String advisorName, String recommendedActionName) {
        return getWithResponse(resourceGroupName, serverName, advisorName, recommendedActionName, Context.NONE)
            .getValue();
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RecommendationActionInner>> listByServerSinglePageAsync(
        String resourceGroupName, String serverName, String advisorName, String sessionId) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByServer(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            advisorName,
                            sessionId,
                            accept,
                            context))
            .<PagedResponse<RecommendationActionInner>>map(
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
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RecommendationActionInner>> listByServerSinglePageAsync(
        String resourceGroupName, String serverName, String advisorName, String sessionId, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByServer(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                advisorName,
                sessionId,
                accept,
                context)
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
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RecommendationActionInner> listByServerAsync(
        String resourceGroupName, String serverName, String advisorName, String sessionId) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RecommendationActionInner> listByServerAsync(
        String resourceGroupName, String serverName, String advisorName) {
        final String sessionId = null;
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RecommendationActionInner> listByServerAsync(
        String resourceGroupName, String serverName, String advisorName, String sessionId, Context context) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName, advisorName, sessionId, context),
            nextLink -> listByServerNextSinglePageAsync(nextLink, context));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RecommendationActionInner> listByServer(
        String resourceGroupName, String serverName, String advisorName) {
        final String sessionId = null;
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName, advisorName, sessionId));
    }

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RecommendationActionInner> listByServer(
        String resourceGroupName, String serverName, String advisorName, String sessionId, Context context) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName, advisorName, sessionId, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RecommendationActionInner>> listByServerNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByServerNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<RecommendationActionInner>>map(
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
     * @return a list of recommendation actions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RecommendationActionInner>> listByServerNextSinglePageAsync(
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
            .listByServerNext(nextLink, this.client.getEndpoint(), accept, context)
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
