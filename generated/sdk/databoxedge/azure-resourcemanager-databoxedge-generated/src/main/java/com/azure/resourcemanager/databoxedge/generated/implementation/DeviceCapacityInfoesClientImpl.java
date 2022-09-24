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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.databoxedge.generated.fluent.DeviceCapacityInfoesClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.DeviceCapacityInfoInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeviceCapacityInfoesClient. */
public final class DeviceCapacityInfoesClientImpl implements DeviceCapacityInfoesClient {
    /** The proxy service used to perform REST calls. */
    private final DeviceCapacityInfoesService service;

    /** The service client containing this operation class. */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of DeviceCapacityInfoesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeviceCapacityInfoesClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service =
            RestProxy
                .create(DeviceCapacityInfoesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientDeviceCapacityInfoes to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    private interface DeviceCapacityInfoesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge"
                + "/dataBoxEdgeDevices/{deviceName}/deviceCapacityInfo/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeviceCapacityInfoInner>> getDeviceCapacityInfo(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("deviceName") String deviceName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the properties of the specified device capacity info.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified device capacity info along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeviceCapacityInfoInner>> getDeviceCapacityInfoWithResponseAsync(
        String resourceGroupName, String deviceName) {
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
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getDeviceCapacityInfo(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            deviceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the properties of the specified device capacity info.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified device capacity info along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeviceCapacityInfoInner>> getDeviceCapacityInfoWithResponseAsync(
        String resourceGroupName, String deviceName, Context context) {
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
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getDeviceCapacityInfo(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                deviceName,
                accept,
                context);
    }

    /**
     * Gets the properties of the specified device capacity info.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified device capacity info on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeviceCapacityInfoInner> getDeviceCapacityInfoAsync(String resourceGroupName, String deviceName) {
        return getDeviceCapacityInfoWithResponseAsync(resourceGroupName, deviceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the properties of the specified device capacity info.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified device capacity info along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeviceCapacityInfoInner> getDeviceCapacityInfoWithResponse(
        String resourceGroupName, String deviceName, Context context) {
        return getDeviceCapacityInfoWithResponseAsync(resourceGroupName, deviceName, context).block();
    }

    /**
     * Gets the properties of the specified device capacity info.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified device capacity info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeviceCapacityInfoInner getDeviceCapacityInfo(String resourceGroupName, String deviceName) {
        return getDeviceCapacityInfoWithResponse(resourceGroupName, deviceName, Context.NONE).getValue();
    }
}
