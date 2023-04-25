// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.VipSwapsClient;
import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceInner;
import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceListResultInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VipSwapsClient. */
public final class VipSwapsClientImpl implements VipSwapsClient {
    /** The proxy service used to perform REST calls. */
    private final VipSwapsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VipSwapsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VipSwapsClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VipSwapsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVipSwaps to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface VipSwapsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Compute/cloudServices/{resourceName}/providers/Microsoft.Network/cloudServiceSlots/{singletonResource}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SwapResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("groupName") String groupName,
            @PathParam("resourceName") String resourceName,
            @PathParam("singletonResource") String singletonResource,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Compute/cloudServices/{resourceName}/providers/Microsoft.Network/cloudServiceSlots/{singletonResource}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(
            @HostParam("$host") String endpoint,
            @PathParam("groupName") String groupName,
            @PathParam("resourceName") String resourceName,
            @PathParam("singletonResource") String singletonResource,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") SwapResourceInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Compute/cloudServices/{resourceName}/providers/Microsoft.Network/cloudServiceSlots")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SwapResourceListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("groupName") String groupName,
            @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SwapResourceInner>> getWithResponseAsync(String groupName, String resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String singletonResource = "swap";
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            groupName,
                            resourceName,
                            singletonResource,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SwapResourceInner>> getWithResponseAsync(
        String groupName, String resourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String singletonResource = "swap";
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                groupName,
                resourceName,
                singletonResource,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SwapResourceInner> getAsync(String groupName, String resourceName) {
        return getWithResponseAsync(groupName, resourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SwapResourceInner> getWithResponse(String groupName, String resourceName, Context context) {
        return getWithResponseAsync(groupName, resourceName, context).block();
    }

    /**
     * Gets the SwapResource which identifies the slot type for the specified cloud service. The slot type on a cloud
     * service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SwapResource which identifies the slot type for the specified cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SwapResourceInner get(String groupName, String resourceName) {
        return getWithResponse(groupName, resourceName, Context.NONE).getValue();
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String groupName, String resourceName, SwapResourceInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String singletonResource = "swap";
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            groupName,
                            resourceName,
                            singletonResource,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String groupName, String resourceName, SwapResourceInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String singletonResource = "swap";
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                groupName,
                resourceName,
                singletonResource,
                apiVersion,
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateAsync(
        String groupName, String resourceName, SwapResourceInner parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(groupName, resourceName, parameters);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCreateAsync(
        String groupName, String resourceName, SwapResourceInner parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(groupName, resourceName, parameters, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreate(
        String groupName, String resourceName, SwapResourceInner parameters) {
        return this.beginCreateAsync(groupName, resourceName, parameters).getSyncPoller();
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCreate(
        String groupName, String resourceName, SwapResourceInner parameters, Context context) {
        return this.beginCreateAsync(groupName, resourceName, parameters, context).getSyncPoller();
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createAsync(String groupName, String resourceName, SwapResourceInner parameters) {
        return beginCreateAsync(groupName, resourceName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> createAsync(
        String groupName, String resourceName, SwapResourceInner parameters, Context context) {
        return beginCreateAsync(groupName, resourceName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(String groupName, String resourceName, SwapResourceInner parameters) {
        createAsync(groupName, resourceName, parameters).block();
    }

    /**
     * Performs vip swap operation on swappable cloud services.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param parameters SwapResource object where slot type should be the target slot after vip swap for the specified
     *     cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void create(String groupName, String resourceName, SwapResourceInner parameters, Context context) {
        createAsync(groupName, resourceName, parameters, context).block();
    }

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SwapResourceListResultInner>> listWithResponseAsync(String groupName, String resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            groupName,
                            resourceName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SwapResourceListResultInner>> listWithResponseAsync(
        String groupName, String resourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                groupName,
                resourceName,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SwapResourceListResultInner> listAsync(String groupName, String resourceName) {
        return listWithResponseAsync(groupName, resourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SwapResourceListResultInner> listWithResponse(
        String groupName, String resourceName, Context context) {
        return listWithResponseAsync(groupName, resourceName, context).block();
    }

    /**
     * Gets the list of SwapResource which identifies the slot type for the specified cloud service. The slot type on a
     * cloud service can either be Staging or Production.
     *
     * @param groupName The name of the resource group.
     * @param resourceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of SwapResource which identifies the slot type for the specified cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SwapResourceListResultInner list(String groupName, String resourceName) {
        return listWithResponse(groupName, resourceName, Context.NONE).getValue();
    }
}
