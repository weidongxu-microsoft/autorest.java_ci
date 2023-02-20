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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.consumption.generated.fluent.PriceSheetsOperationsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.PriceSheetResultV2Inner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PriceSheetsOperationsClient. */
public final class PriceSheetsOperationsClientImpl implements PriceSheetsOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final PriceSheetsOperationsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of PriceSheetsOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PriceSheetsOperationsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy
                .create(PriceSheetsOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientPriceSheetsOperations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    public interface PriceSheetsOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Consumption/pricesheets/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PriceSheetResultV2Inner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("$expand") String expand,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers"
                + "/Microsoft.Consumption/pricesheets/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PriceSheetResultV2Inner>> getByBillingPeriod(
            @HostParam("$host") String endpoint,
            @QueryParam("$expand") String expand,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingPeriodName") String billingPeriodName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an pricesheet resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultV2Inner>> getWithResponseAsync(
        String subscriptionId, String expand, String skiptoken, Integer top) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2022-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            expand,
                            skiptoken,
                            top,
                            subscriptionId,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an pricesheet resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultV2Inner>> getWithResponseAsync(
        String subscriptionId, String expand, String skiptoken, Integer top, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        final String apiVersion = "2022-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), expand, skiptoken, top, subscriptionId, apiVersion, accept, context);
    }

    /**
     * List the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an pricesheet resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultV2Inner> getAsync(String subscriptionId) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getWithResponseAsync(subscriptionId, expand, skiptoken, top)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an pricesheet resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PriceSheetResultV2Inner> getWithResponse(
        String subscriptionId, String expand, String skiptoken, Integer top, Context context) {
        return getWithResponseAsync(subscriptionId, expand, skiptoken, top, context).block();
    }

    /**
     * List the price sheet for a subscription. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an pricesheet resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PriceSheetResultV2Inner get(String subscriptionId) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getWithResponse(subscriptionId, expand, skiptoken, top, Context.NONE).getValue();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultV2Inner>> getByBillingPeriodWithResponseAsync(
        String subscriptionId, String billingPeriodName, String expand, String skiptoken, Integer top) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String apiVersion = "2022-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByBillingPeriod(
                            this.client.getEndpoint(),
                            expand,
                            skiptoken,
                            top,
                            subscriptionId,
                            apiVersion,
                            billingPeriodName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultV2Inner>> getByBillingPeriodWithResponseAsync(
        String subscriptionId,
        String billingPeriodName,
        String expand,
        String skiptoken,
        Integer top,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (subscriptionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String apiVersion = "2022-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByBillingPeriod(
                this.client.getEndpoint(),
                expand,
                skiptoken,
                top,
                subscriptionId,
                apiVersion,
                billingPeriodName,
                accept,
                context);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultV2Inner> getByBillingPeriodAsync(String subscriptionId, String billingPeriodName) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getByBillingPeriodWithResponseAsync(subscriptionId, billingPeriodName, expand, skiptoken, top)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PriceSheetResultV2Inner> getByBillingPeriodWithResponse(
        String subscriptionId,
        String billingPeriodName,
        String expand,
        String skiptoken,
        Integer top,
        Context context) {
        return getByBillingPeriodWithResponseAsync(subscriptionId, billingPeriodName, expand, skiptoken, top, context)
            .block();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param subscriptionId Azure Subscription ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PriceSheetResultV2Inner getByBillingPeriod(String subscriptionId, String billingPeriodName) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getByBillingPeriodWithResponse(subscriptionId, billingPeriodName, expand, skiptoken, top, Context.NONE)
            .getValue();
    }
}