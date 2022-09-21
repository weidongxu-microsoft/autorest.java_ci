// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

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
import com.azure.resourcemanager.eventhubs.generated.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.NetworkSecurityPerimeterConfigurationListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * NetworkSecurityPerimeterConfigurationsClient.
 */
public final class NetworkSecurityPerimeterConfigurationsClientImpl
    implements NetworkSecurityPerimeterConfigurationsClient {
    /** The proxy service used to perform REST calls. */
    private final NetworkSecurityPerimeterConfigurationsService service;

    /** The service client containing this operation class. */
    private final EventHubManagementClientImpl client;

    /**
     * Initializes an instance of NetworkSecurityPerimeterConfigurationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetworkSecurityPerimeterConfigurationsClientImpl(EventHubManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    NetworkSecurityPerimeterConfigurationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for EventHubManagementClientNetworkSecurityPerimeterConfigurations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "EventHubManagementCl")
    private interface NetworkSecurityPerimeterConfigurationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces"
                + "/{namespaceName}/networkSecurityPerimeterConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkSecurityPerimeterConfigurationListInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("namespaceName") String namespaceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkSecurityPerimeterConfigurationListInner>> listWithResponseAsync(
        String resourceGroupName, String namespaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (namespaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter namespaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            namespaceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkSecurityPerimeterConfigurationListInner>> listWithResponseAsync(
        String resourceGroupName, String namespaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (namespaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter namespaceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                namespaceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NetworkSecurityPerimeterConfigurationListInner> listAsync(
        String resourceGroupName, String namespaceName) {
        return listWithResponseAsync(resourceGroupName, namespaceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkSecurityPerimeterConfigurationListInner> listWithResponse(
        String resourceGroupName, String namespaceName) {
        return listWithResponseAsync(resourceGroupName, namespaceName).block();
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkSecurityPerimeterConfigurationListInner> listWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        return listWithResponseAsync(resourceGroupName, namespaceName, context).block();
    }

    /**
     * Gets list of current NetworkSecurityPerimeterConfiguration for Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of current NetworkSecurityPerimeterConfiguration for Namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkSecurityPerimeterConfigurationListInner list(String resourceGroupName, String namespaceName) {
        return listWithResponse(resourceGroupName, namespaceName, Context.NONE).getValue();
    }
}
