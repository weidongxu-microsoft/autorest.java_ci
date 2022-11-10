// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.implementation;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hdinsight.generated.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.HostInfoInner;
import java.nio.ByteBuffer;
import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachinesClient. */
public final class VirtualMachinesClientImpl implements VirtualMachinesClient {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachinesService service;

    /** The service client containing this operation class. */
    private final HDInsightManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachinesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachinesClientImpl(HDInsightManagementClientImpl client) {
        this.service =
            RestProxy.create(VirtualMachinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HDInsightManagementClientVirtualMachines to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "HDInsightManagementC")
    public interface VirtualMachinesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/listHosts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<HostInfoInner>>> listHosts(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/restartHosts")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> restartHosts(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") List<String> hosts,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters"
                + "/{clusterName}/restartHosts/azureasyncoperations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AsyncOperationResultInner>> getAsyncOperationStatus(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the HDInsight clusters hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list cluster hosts along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<HostInfoInner>>> listHostsWithResponseAsync(
        String resourceGroupName, String clusterName) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listHosts(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the HDInsight clusters hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list cluster hosts along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<HostInfoInner>>> listHostsWithResponseAsync(
        String resourceGroupName, String clusterName, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listHosts(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Lists the HDInsight clusters hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list cluster hosts on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<HostInfoInner>> listHostsAsync(String resourceGroupName, String clusterName) {
        return listHostsWithResponseAsync(resourceGroupName, clusterName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Lists the HDInsight clusters hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list cluster hosts along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<HostInfoInner>> listHostsWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        return listHostsWithResponseAsync(resourceGroupName, clusterName, context).block();
    }

    /**
     * Lists the HDInsight clusters hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list cluster hosts.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<HostInfoInner> listHosts(String resourceGroupName, String clusterName) {
        return listHostsWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> restartHostsWithResponseAsync(
        String resourceGroupName, String clusterName, List<String> hosts) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (hosts == null) {
            return Mono.error(new IllegalArgumentException("Parameter hosts is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .restartHosts(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            this.client.getApiVersion(),
                            hosts,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> restartHostsWithResponseAsync(
        String resourceGroupName, String clusterName, List<String> hosts, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (hosts == null) {
            return Mono.error(new IllegalArgumentException("Parameter hosts is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .restartHosts(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                this.client.getApiVersion(),
                hosts,
                accept,
                context);
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginRestartHostsAsync(
        String resourceGroupName, String clusterName, List<String> hosts) {
        Mono<Response<Flux<ByteBuffer>>> mono = restartHostsWithResponseAsync(resourceGroupName, clusterName, hosts);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginRestartHostsAsync(
        String resourceGroupName, String clusterName, List<String> hosts, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            restartHostsWithResponseAsync(resourceGroupName, clusterName, hosts, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginRestartHosts(
        String resourceGroupName, String clusterName, List<String> hosts) {
        return beginRestartHostsAsync(resourceGroupName, clusterName, hosts).getSyncPoller();
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginRestartHosts(
        String resourceGroupName, String clusterName, List<String> hosts, Context context) {
        return beginRestartHostsAsync(resourceGroupName, clusterName, hosts, context).getSyncPoller();
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> restartHostsAsync(String resourceGroupName, String clusterName, List<String> hosts) {
        return beginRestartHostsAsync(resourceGroupName, clusterName, hosts)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> restartHostsAsync(
        String resourceGroupName, String clusterName, List<String> hosts, Context context) {
        return beginRestartHostsAsync(resourceGroupName, clusterName, hosts, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void restartHosts(String resourceGroupName, String clusterName, List<String> hosts) {
        restartHostsAsync(resourceGroupName, clusterName, hosts).block();
    }

    /**
     * Restarts the specified HDInsight cluster hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param hosts The list of hosts to restart.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void restartHosts(String resourceGroupName, String clusterName, List<String> hosts, Context context) {
        restartHostsAsync(resourceGroupName, clusterName, hosts, context).block();
    }

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AsyncOperationResultInner>> getAsyncOperationStatusWithResponseAsync(
        String resourceGroupName, String clusterName, String operationId) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getAsyncOperationStatus(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            clusterName,
                            this.client.getApiVersion(),
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AsyncOperationResultInner>> getAsyncOperationStatusWithResponseAsync(
        String resourceGroupName, String clusterName, String operationId, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getAsyncOperationStatus(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                clusterName,
                this.client.getApiVersion(),
                operationId,
                accept,
                context);
    }

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AsyncOperationResultInner> getAsyncOperationStatusAsync(
        String resourceGroupName, String clusterName, String operationId) {
        return getAsyncOperationStatusWithResponseAsync(resourceGroupName, clusterName, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AsyncOperationResultInner> getAsyncOperationStatusWithResponse(
        String resourceGroupName, String clusterName, String operationId, Context context) {
        return getAsyncOperationStatusWithResponseAsync(resourceGroupName, clusterName, operationId, context).block();
    }

    /**
     * Gets the async operation status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param operationId The long running operation id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the async operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AsyncOperationResultInner getAsyncOperationStatus(
        String resourceGroupName, String clusterName, String operationId) {
        return getAsyncOperationStatusWithResponse(resourceGroupName, clusterName, operationId, Context.NONE)
            .getValue();
    }
}
