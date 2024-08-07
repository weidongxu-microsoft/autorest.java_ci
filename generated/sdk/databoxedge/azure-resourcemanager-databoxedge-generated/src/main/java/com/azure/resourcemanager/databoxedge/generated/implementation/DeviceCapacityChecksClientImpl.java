// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.annotation.BodyParam;
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
import com.azure.resourcemanager.databoxedge.generated.fluent.DeviceCapacityChecksClient;
import com.azure.resourcemanager.databoxedge.generated.models.DeviceCapacityRequestInfo;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DeviceCapacityChecksClient.
 */
public final class DeviceCapacityChecksClientImpl implements DeviceCapacityChecksClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DeviceCapacityChecksService service;

    /**
     * The service client containing this operation class.
     */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of DeviceCapacityChecksClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DeviceCapacityChecksClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service = RestProxy.create(DeviceCapacityChecksService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientDeviceCapacityChecks to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    public interface DeviceCapacityChecksService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName}/deviceCapacityCheck")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> checkResourceCreationFeasibility(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion,
            @PathParam("deviceName") String deviceName, @QueryParam("capacityName") String capacityName,
            @BodyParam("application/json") DeviceCapacityRequestInfo deviceCapacityRequestInfo,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> checkResourceCreationFeasibilityWithResponseAsync(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName) {
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
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (deviceCapacityRequestInfo == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter deviceCapacityRequestInfo is required and cannot be null."));
        } else {
            deviceCapacityRequestInfo.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.checkResourceCreationFeasibility(this.client.getEndpoint(),
                this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), deviceName,
                capacityName, deviceCapacityRequestInfo, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> checkResourceCreationFeasibilityWithResponseAsync(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
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
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (deviceCapacityRequestInfo == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter deviceCapacityRequestInfo is required and cannot be null."));
        } else {
            deviceCapacityRequestInfo.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.checkResourceCreationFeasibility(this.client.getEndpoint(), this.client.getSubscriptionId(),
            resourceGroupName, this.client.getApiVersion(), deviceName, capacityName, deviceCapacityRequestInfo, accept,
            context);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCheckResourceCreationFeasibilityAsync(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName) {
        Mono<Response<Flux<ByteBuffer>>> mono = checkResourceCreationFeasibilityWithResponseAsync(resourceGroupName,
            deviceName, deviceCapacityRequestInfo, capacityName);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            this.client.getContext());
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCheckResourceCreationFeasibilityAsync(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo) {
        final String capacityName = null;
        Mono<Response<Flux<ByteBuffer>>> mono = checkResourceCreationFeasibilityWithResponseAsync(resourceGroupName,
            deviceName, deviceCapacityRequestInfo, capacityName);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            this.client.getContext());
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginCheckResourceCreationFeasibilityAsync(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = checkResourceCreationFeasibilityWithResponseAsync(resourceGroupName,
            deviceName, deviceCapacityRequestInfo, capacityName, context);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            context);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCheckResourceCreationFeasibility(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo) {
        final String capacityName = null;
        return this
            .beginCheckResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo,
                capacityName)
            .getSyncPoller();
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginCheckResourceCreationFeasibility(String resourceGroupName,
        String deviceName, DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
        return this
            .beginCheckResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo,
                capacityName, context)
            .getSyncPoller();
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> checkResourceCreationFeasibilityAsync(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName) {
        return beginCheckResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo,
            capacityName).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> checkResourceCreationFeasibilityAsync(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo) {
        final String capacityName = null;
        return beginCheckResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo,
            capacityName).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> checkResourceCreationFeasibilityAsync(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
        return beginCheckResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo,
            capacityName, context).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void checkResourceCreationFeasibility(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo) {
        final String capacityName = null;
        checkResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo, capacityName)
            .block();
    }

    /**
     * Posts the device capacity request info to check feasibility.
     * 
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param deviceCapacityRequestInfo The device capacity request info.
     * @param capacityName The capacity name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void checkResourceCreationFeasibility(String resourceGroupName, String deviceName,
        DeviceCapacityRequestInfo deviceCapacityRequestInfo, String capacityName, Context context) {
        checkResourceCreationFeasibilityAsync(resourceGroupName, deviceName, deviceCapacityRequestInfo, capacityName,
            context).block();
    }
}
