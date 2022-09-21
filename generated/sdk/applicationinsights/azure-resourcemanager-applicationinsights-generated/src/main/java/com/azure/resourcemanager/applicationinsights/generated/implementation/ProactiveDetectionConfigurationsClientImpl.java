// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.applicationinsights.generated.fluent.ProactiveDetectionConfigurationsClient;
import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ProactiveDetectionConfigurationsClient.
 */
public final class ProactiveDetectionConfigurationsClientImpl implements ProactiveDetectionConfigurationsClient {
    /** The proxy service used to perform REST calls. */
    private final ProactiveDetectionConfigurationsService service;

    /** The service client containing this operation class. */
    private final ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ProactiveDetectionConfigurationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProactiveDetectionConfigurationsClientImpl(ApplicationInsightsManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ProactiveDetectionConfigurationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationInsightsManagementClientProactiveDetectionConfigurations
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApplicationInsightsM")
    private interface ProactiveDetectionConfigurationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components"
                + "/{resourceName}/ProactiveDetectionConfigs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceName") String resourceName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components"
                + "/{resourceName}/ProactiveDetectionConfigs/{ConfigurationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceName") String resourceName,
            @PathParam("ConfigurationId") String configurationId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components"
                + "/{resourceName}/ProactiveDetectionConfigs/{ConfigurationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceName") String resourceName,
            @PathParam("ConfigurationId") String configurationId,
            @BodyParam("application/json")
                ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>>>
        listWithResponseAsync(String resourceGroupName, String resourceName) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component along with {@link
     *     Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>>>
        listWithResponseAsync(String resourceGroupName, String resourceName, Context context) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
                resourceName,
                accept,
                context);
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> listAsync(
        String resourceGroupName, String resourceName) {
        return listWithResponseAsync(resourceGroupName, resourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> listWithResponse(
        String resourceGroupName, String resourceName) {
        return listWithResponseAsync(resourceGroupName, resourceName).block();
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        return listWithResponseAsync(resourceGroupName, resourceName, context).block();
    }

    /**
     * Gets a list of ProactiveDetection configurations of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of ProactiveDetection configurations of an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<ApplicationInsightsComponentProactiveDetectionConfigurationInner> list(
        String resourceGroupName, String resourceName) {
        return listWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, String configurationId) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (configurationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceName,
                            configurationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, String configurationId, Context context) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (configurationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationId is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
                resourceName,
                configurationId,
                accept,
                context);
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApplicationInsightsComponentProactiveDetectionConfigurationInner> getAsync(
        String resourceGroupName, String resourceName, String configurationId) {
        return getWithResponseAsync(resourceGroupName, resourceName, configurationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> getWithResponse(
        String resourceGroupName, String resourceName, String configurationId) {
        return getWithResponseAsync(resourceGroupName, resourceName, configurationId).block();
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> getWithResponse(
        String resourceGroupName, String resourceName, String configurationId, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, configurationId, context).block();
    }

    /**
     * Get the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ProactiveDetection configuration for this configuration id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner get(
        String resourceGroupName, String resourceName, String configurationId) {
        return getWithResponse(resourceGroupName, resourceName, configurationId, Context.NONE).getValue();
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> updateWithResponseAsync(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (configurationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationId is required and cannot be null."));
        }
        if (proactiveDetectionProperties == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter proactiveDetectionProperties is required and cannot be null."));
        } else {
            proactiveDetectionProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceName,
                            configurationId,
                            proactiveDetectionProperties,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner>> updateWithResponseAsync(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties,
        Context context) {
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
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (configurationId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configurationId is required and cannot be null."));
        }
        if (proactiveDetectionProperties == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter proactiveDetectionProperties is required and cannot be null."));
        } else {
            proactiveDetectionProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
                resourceName,
                configurationId,
                proactiveDetectionProperties,
                accept,
                context);
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApplicationInsightsComponentProactiveDetectionConfigurationInner> updateAsync(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties) {
        return updateWithResponseAsync(resourceGroupName, resourceName, configurationId, proactiveDetectionProperties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties) {
        return updateWithResponseAsync(resourceGroupName, resourceName, configurationId, proactiveDetectionProperties)
            .block();
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentProactiveDetectionConfigurationInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties,
        Context context) {
        return updateWithResponseAsync(
                resourceGroupName, resourceName, configurationId, proactiveDetectionProperties, context)
            .block();
    }

    /**
     * Update the ProactiveDetection configuration for this configuration id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param configurationId The ProactiveDetection configuration ID. This is unique within a Application Insights
     *     component.
     * @param proactiveDetectionProperties Properties that need to be specified to update the ProactiveDetection
     *     configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties that define a ProactiveDetection configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner update(
        String resourceGroupName,
        String resourceName,
        String configurationId,
        ApplicationInsightsComponentProactiveDetectionConfigurationInner proactiveDetectionProperties) {
        return updateWithResponse(
                resourceGroupName, resourceName, configurationId, proactiveDetectionProperties, Context.NONE)
            .getValue();
    }
}
