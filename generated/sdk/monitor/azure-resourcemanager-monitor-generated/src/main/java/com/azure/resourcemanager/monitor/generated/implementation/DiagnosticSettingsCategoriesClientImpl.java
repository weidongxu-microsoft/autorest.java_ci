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
import com.azure.resourcemanager.monitor.generated.fluent.DiagnosticSettingsCategoriesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceCollectionInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiagnosticSettingsCategoriesClient. */
public final class DiagnosticSettingsCategoriesClientImpl implements DiagnosticSettingsCategoriesClient {
    /** The proxy service used to perform REST calls. */
    private final DiagnosticSettingsCategoriesService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of DiagnosticSettingsCategoriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DiagnosticSettingsCategoriesClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DiagnosticSettingsCategoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientDiagnosticSettingsCategories to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientDiagnos")
    private interface DiagnosticSettingsCategoriesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettingsCategories/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiagnosticSettingsCategoryResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @PathParam("name") String name,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{resourceUri}/providers/Microsoft.Insights/diagnosticSettingsCategories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiagnosticSettingsCategoryResourceCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsCategoryResourceInner>> getWithResponseAsync(
        String resourceUri, String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsCategoryResourceInner>> getWithResponseAsync(
        String resourceUri, String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceUri, apiVersion, name, accept, context);
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DiagnosticSettingsCategoryResourceInner> getAsync(String resourceUri, String name) {
        return getWithResponseAsync(resourceUri, name).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsCategoryResourceInner> getWithResponse(String resourceUri, String name) {
        return getWithResponseAsync(resourceUri, name).block();
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsCategoryResourceInner> getWithResponse(
        String resourceUri, String name, Context context) {
        return getWithResponseAsync(resourceUri, name, context).block();
    }

    /**
     * Gets the diagnostic settings category for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic settings category for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsCategoryResourceInner get(String resourceUri, String name) {
        return getWithResponse(resourceUri, name, Context.NONE).getValue();
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsCategoryResourceCollectionInner>> listWithResponseAsync(
        String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceUri, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiagnosticSettingsCategoryResourceCollectionInner>> listWithResponseAsync(
        String resourceUri, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String apiVersion = "2017-05-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), resourceUri, apiVersion, accept, context);
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DiagnosticSettingsCategoryResourceCollectionInner> listAsync(String resourceUri) {
        return listWithResponseAsync(resourceUri).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsCategoryResourceCollectionInner> listWithResponse(String resourceUri) {
        return listWithResponseAsync(resourceUri).block();
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiagnosticSettingsCategoryResourceCollectionInner> listWithResponse(
        String resourceUri, Context context) {
        return listWithResponseAsync(resourceUri, context).block();
    }

    /**
     * Lists the diagnostic settings categories for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of diagnostic setting category resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiagnosticSettingsCategoryResourceCollectionInner list(String resourceUri) {
        return listWithResponse(resourceUri, Context.NONE).getValue();
    }
}
