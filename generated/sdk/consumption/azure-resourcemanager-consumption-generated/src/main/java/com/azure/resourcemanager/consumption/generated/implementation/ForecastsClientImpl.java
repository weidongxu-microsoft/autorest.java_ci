// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

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
import com.azure.resourcemanager.consumption.generated.fluent.ForecastsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ForecastInner;
import com.azure.resourcemanager.consumption.generated.models.ForecastsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ForecastsClient. */
public final class ForecastsClientImpl implements ForecastsClient {
    private final ClientLogger logger = new ClientLogger(ForecastsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ForecastsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ForecastsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ForecastsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy.create(ForecastsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientForecasts to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface ForecastsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Consumption/forecasts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ForecastsListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ForecastInner>> listSinglePageAsync(String filter) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<ForecastInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ForecastInner>> listSinglePageAsync(String filter, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                filter,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ForecastInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ForecastInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ForecastInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter, context));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ForecastInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ForecastInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }
}
