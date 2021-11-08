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
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.EventCategoriesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.models.EventCategoryCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EventCategoriesClient. */
public final class EventCategoriesClientImpl implements EventCategoriesClient {
    private final ClientLogger logger = new ClientLogger(EventCategoriesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final EventCategoriesService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of EventCategoriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EventCategoriesClientImpl(MonitorClientImpl client) {
        this.service =
            RestProxy.create(EventCategoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientEventCategories to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientEventCa")
    private interface EventCategoriesService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Insights/eventcategories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventCategoryCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocalizableStringInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, accept, context))
            .<PagedResponse<LocalizableStringInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocalizableStringInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocalizableStringInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocalizableStringInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalizableStringInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalizableStringInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }
}
