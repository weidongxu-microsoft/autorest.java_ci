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
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.BalancesClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.BalanceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BalancesClient. */
public final class BalancesClientImpl implements BalancesClient {
    private final ClientLogger logger = new ClientLogger(BalancesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BalancesService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of BalancesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BalancesClientImpl(ConsumptionManagementClientImpl client) {
        this.service = RestProxy.create(BalancesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientBalances to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface BalancesService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.Consumption/balances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BalanceInner>> getByBillingAccount(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountId") String billingAccountId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingPeriods/{billingPeriodName}"
                + "/providers/Microsoft.Consumption/balances")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BalanceInner>> getForBillingPeriodByBillingAccount(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountId") String billingAccountId,
            @PathParam("billingPeriodName") String billingPeriodName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BalanceInner>> getByBillingAccountWithResponseAsync(String billingAccountId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByBillingAccount(
                            this.client.getEndpoint(), this.client.getApiVersion(), billingAccountId, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BalanceInner>> getByBillingAccountWithResponseAsync(
        String billingAccountId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByBillingAccount(
                this.client.getEndpoint(), this.client.getApiVersion(), billingAccountId, accept, context);
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BalanceInner> getByBillingAccountAsync(String billingAccountId) {
        return getByBillingAccountWithResponseAsync(billingAccountId)
            .flatMap(
                (Response<BalanceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BalanceInner getByBillingAccount(String billingAccountId) {
        return getByBillingAccountAsync(billingAccountId).block();
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or
     * later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BalanceInner> getByBillingAccountWithResponse(String billingAccountId, Context context) {
        return getByBillingAccountWithResponseAsync(billingAccountId, context).block();
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BalanceInner>> getForBillingPeriodByBillingAccountWithResponseAsync(
        String billingAccountId, String billingPeriodName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getForBillingPeriodByBillingAccount(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            billingAccountId,
                            billingPeriodName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BalanceInner>> getForBillingPeriodByBillingAccountWithResponseAsync(
        String billingAccountId, String billingPeriodName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getForBillingPeriodByBillingAccount(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                billingAccountId,
                billingPeriodName,
                accept,
                context);
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BalanceInner> getForBillingPeriodByBillingAccountAsync(
        String billingAccountId, String billingPeriodName) {
        return getForBillingPeriodByBillingAccountWithResponseAsync(billingAccountId, billingPeriodName)
            .flatMap(
                (Response<BalanceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BalanceInner getForBillingPeriodByBillingAccount(String billingAccountId, String billingPeriodName) {
        return getForBillingPeriodByBillingAccountAsync(billingAccountId, billingPeriodName).block();
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the balances for a scope by billing period and billingAccountId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BalanceInner> getForBillingPeriodByBillingAccountWithResponse(
        String billingAccountId, String billingPeriodName, Context context) {
        return getForBillingPeriodByBillingAccountWithResponseAsync(billingAccountId, billingPeriodName, context)
            .block();
    }
}
