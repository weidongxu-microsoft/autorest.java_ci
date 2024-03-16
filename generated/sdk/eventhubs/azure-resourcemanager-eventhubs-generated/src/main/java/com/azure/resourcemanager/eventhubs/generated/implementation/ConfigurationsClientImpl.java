// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
import com.azure.resourcemanager.eventhubs.generated.fluent.ConfigurationsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ClusterQuotaConfigurationPropertiesInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ConfigurationsClient.
 */
public final class ConfigurationsClientImpl implements ConfigurationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ConfigurationsService service;

    /**
     * The service client containing this operation class.
     */
    private final EventHubManagementClientImpl client;

    /**
     * Initializes an instance of ConfigurationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ConfigurationsClientImpl(EventHubManagementClientImpl client) {
        this.service
            = RestProxy.create(ConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for EventHubManagementClientConfigurations to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "EventHubManagementCl")
    public interface ConfigurationsService {
        @Headers({ "Content-Type: application/json" })
        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/clusters/{clusterName}/quotaConfiguration/default")
        @ExpectedResponses({ 200, 201, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterQuotaConfigurationPropertiesInner>> patch(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ClusterQuotaConfigurationPropertiesInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/clusters/{clusterName}/quotaConfiguration/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterQuotaConfigurationPropertiesInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("clusterName") String clusterName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterQuotaConfigurationPropertiesInner>> patchWithResponseAsync(String resourceGroupName,
        String clusterName, ClusterQuotaConfigurationPropertiesInner parameters) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.patch(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, clusterName, this.client.getApiVersion(), parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterQuotaConfigurationPropertiesInner>> patchWithResponseAsync(String resourceGroupName,
        String clusterName, ClusterQuotaConfigurationPropertiesInner parameters, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.patch(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, clusterName,
            this.client.getApiVersion(), parameters, accept, context);
    }

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterQuotaConfigurationPropertiesInner> patchAsync(String resourceGroupName, String clusterName,
        ClusterQuotaConfigurationPropertiesInner parameters) {
        return patchWithResponseAsync(resourceGroupName, clusterName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterQuotaConfigurationPropertiesInner> patchWithResponse(String resourceGroupName,
        String clusterName, ClusterQuotaConfigurationPropertiesInner parameters, Context context) {
        return patchWithResponseAsync(resourceGroupName, clusterName, parameters, context).block();
    }

    /**
     * Replace all specified Event Hubs Cluster settings with those contained in the request body. Leaves the settings not specified in the request body unmodified.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param parameters Parameters for creating an Event Hubs Cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains all settings for the cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterQuotaConfigurationPropertiesInner patch(String resourceGroupName, String clusterName,
        ClusterQuotaConfigurationPropertiesInner parameters) {
        return patchWithResponse(resourceGroupName, clusterName, parameters, Context.NONE).getValue();
    }

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterQuotaConfigurationPropertiesInner>> getWithResponseAsync(String resourceGroupName,
        String clusterName) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, clusterName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterQuotaConfigurationPropertiesInner>> getWithResponseAsync(String resourceGroupName,
        String clusterName, Context context) {
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
        if (clusterName == null) {
            return Mono.error(new IllegalArgumentException("Parameter clusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, clusterName,
            this.client.getApiVersion(), accept, context);
    }

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterQuotaConfigurationPropertiesInner> getAsync(String resourceGroupName, String clusterName) {
        return getWithResponseAsync(resourceGroupName, clusterName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterQuotaConfigurationPropertiesInner> getWithResponse(String resourceGroupName,
        String clusterName, Context context) {
        return getWithResponseAsync(resourceGroupName, clusterName, context).block();
    }

    /**
     * Get all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Event Hubs Cluster settings - a collection of key/value pairs which represent the quotas and settings imposed on the cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterQuotaConfigurationPropertiesInner get(String resourceGroupName, String clusterName) {
        return getWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }
}
