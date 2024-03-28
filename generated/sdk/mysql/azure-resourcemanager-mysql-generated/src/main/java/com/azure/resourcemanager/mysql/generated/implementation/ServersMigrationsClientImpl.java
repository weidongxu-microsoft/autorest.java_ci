// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysql.generated.fluent.ServersMigrationsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServersMigrationsClient.
 */
public final class ServersMigrationsClientImpl implements ServersMigrationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ServersMigrationsService service;

    /**
     * The service client containing this operation class.
     */
    private final MySqlManagementClientImpl client;

    /**
     * Initializes an instance of ServersMigrationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServersMigrationsClientImpl(MySqlManagementClientImpl client) {
        this.service
            = RestProxy.create(ServersMigrationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MySqlManagementClientServersMigrations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MySqlManagementClien")
    public interface ServersMigrationsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMySQL/flexibleServers/{serverName}/cutoverMigration")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> cutoverMigration(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> cutoverMigrationWithResponseAsync(String resourceGroupName,
        String serverName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-12-30";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.cutoverMigration(this.client.getEndpoint(), apiVersion,
                this.client.getSubscriptionId(), resourceGroupName, serverName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> cutoverMigrationWithResponseAsync(String resourceGroupName,
        String serverName, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String apiVersion = "2023-12-30";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.cutoverMigration(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
            resourceGroupName, serverName, accept, context);
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents a server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ServerInner>, ServerInner> beginCutoverMigrationAsync(String resourceGroupName,
        String serverName) {
        Mono<Response<Flux<ByteBuffer>>> mono = cutoverMigrationWithResponseAsync(resourceGroupName, serverName);
        return this.client.<ServerInner, ServerInner>getLroResult(mono, this.client.getHttpPipeline(),
            ServerInner.class, ServerInner.class, this.client.getContext());
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of represents a server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ServerInner>, ServerInner> beginCutoverMigrationAsync(String resourceGroupName,
        String serverName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = cutoverMigrationWithResponseAsync(resourceGroupName, serverName, context);
        return this.client.<ServerInner, ServerInner>getLroResult(mono, this.client.getHttpPipeline(),
            ServerInner.class, ServerInner.class, context);
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ServerInner>, ServerInner> beginCutoverMigration(String resourceGroupName,
        String serverName) {
        return this.beginCutoverMigrationAsync(resourceGroupName, serverName).getSyncPoller();
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a server.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ServerInner>, ServerInner> beginCutoverMigration(String resourceGroupName,
        String serverName, Context context) {
        return this.beginCutoverMigrationAsync(resourceGroupName, serverName, context).getSyncPoller();
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerInner> cutoverMigrationAsync(String resourceGroupName, String serverName) {
        return beginCutoverMigrationAsync(resourceGroupName, serverName).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServerInner> cutoverMigrationAsync(String resourceGroupName, String serverName, Context context) {
        return beginCutoverMigrationAsync(resourceGroupName, serverName, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerInner cutoverMigration(String resourceGroupName, String serverName) {
        return cutoverMigrationAsync(resourceGroupName, serverName).block();
    }

    /**
     * Cutover migration for MySQL import, it will switch source elastic server DNS to flexible server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerInner cutoverMigration(String resourceGroupName, String serverName, Context context) {
        return cutoverMigrationAsync(resourceGroupName, serverName, context).block();
    }
}
