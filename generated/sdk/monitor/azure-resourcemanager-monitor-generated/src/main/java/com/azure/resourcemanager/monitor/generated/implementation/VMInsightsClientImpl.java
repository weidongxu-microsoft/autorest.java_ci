// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

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
import com.azure.resourcemanager.monitor.generated.fluent.VMInsightsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.VMInsightsOnboardingStatusInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VMInsightsClient.
 */
public final class VMInsightsClientImpl implements VMInsightsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VMInsightsService service;

    /**
     * The service client containing this operation class.
     */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of VMInsightsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VMInsightsClientImpl(MonitorClientImpl client) {
        this.service
            = RestProxy.create(VMInsightsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientVMInsights to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientVMInsig")
    public interface VMInsightsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.Insights/vmInsightsOnboardingStatuses/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VMInsightsOnboardingStatusInner>> getOnboardingStatus(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     * to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VMInsightsOnboardingStatusInner>> getOnboardingStatusWithResponseAsync(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2018-11-27-preview";
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.getOnboardingStatus(this.client.getEndpoint(), apiVersion, resourceUri, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     * to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VMInsightsOnboardingStatusInner>> getOnboardingStatusWithResponseAsync(String resourceUri,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2018-11-27-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getOnboardingStatus(this.client.getEndpoint(), apiVersion, resourceUri, accept, context);
    }

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     * to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VMInsightsOnboardingStatusInner> getOnboardingStatusAsync(String resourceUri) {
        return getOnboardingStatusWithResponseAsync(resourceUri).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     * to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VMInsightsOnboardingStatusInner> getOnboardingStatusWithResponse(String resourceUri,
        Context context) {
        return getOnboardingStatusWithResponseAsync(resourceUri, context).block();
    }

    /**
     * Retrieves the VM Insights onboarding status for the specified resource or resource scope.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource, or scope, whose status
     * to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vM Insights onboarding status for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VMInsightsOnboardingStatusInner getOnboardingStatus(String resourceUri) {
        return getOnboardingStatusWithResponse(resourceUri, Context.NONE).getValue();
    }
}
