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
import com.azure.resourcemanager.databoxedge.generated.fluent.JobsClient;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.JobInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobsClient. */
public final class JobsClientImpl implements JobsClient {
    /** The proxy service used to perform REST calls. */
    private final JobsService service;

    /** The service client containing this operation class. */
    private final DataBoxEdgeManagementClientImpl client;

    /**
     * Initializes an instance of JobsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    JobsClientImpl(DataBoxEdgeManagementClientImpl client) {
        this.service = RestProxy.create(JobsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataBoxEdgeManagementClientJobs to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataBoxEdgeManagemen")
    private interface JobsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge"
                + "/dataBoxEdgeDevices/{deviceName}/jobs/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<JobInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("deviceName") String deviceName,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobInner>> getWithResponseAsync(String deviceName, String name, String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            deviceName,
                            name,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<JobInner>> getWithResponseAsync(
        String deviceName, String name, String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (deviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter deviceName is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                deviceName,
                name,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<JobInner> getAsync(String deviceName, String name, String resourceGroupName) {
        return getWithResponseAsync(deviceName, name, resourceGroupName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<JobInner> getWithResponse(String deviceName, String name, String resourceGroupName) {
        return getWithResponseAsync(deviceName, name, resourceGroupName).block();
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<JobInner> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context) {
        return getWithResponseAsync(deviceName, name, resourceGroupName, context).block();
    }

    /**
     * Gets the details of a specified job on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param name The job name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a specified job on a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobInner get(String deviceName, String name, String resourceGroupName) {
        return getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
    }
}
