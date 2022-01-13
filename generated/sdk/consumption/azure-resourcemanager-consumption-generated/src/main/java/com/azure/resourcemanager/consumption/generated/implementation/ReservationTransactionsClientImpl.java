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
import com.azure.resourcemanager.consumption.generated.fluent.ReservationTransactionsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ModernReservationTransactionInner;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationTransactionInner;
import com.azure.resourcemanager.consumption.generated.models.ModernReservationTransactionsListResult;
import com.azure.resourcemanager.consumption.generated.models.ReservationTransactionsListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReservationTransactionsClient. */
public final class ReservationTransactionsClientImpl implements ReservationTransactionsClient {
    private final ClientLogger logger = new ClientLogger(ReservationTransactionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ReservationTransactionsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ReservationTransactionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReservationTransactionsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ReservationTransactionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientReservationTransactions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface ReservationTransactionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.Consumption"
                + "/reservationTransactions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReservationTransactionsListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountId") String billingAccountId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}"
                + "/providers/Microsoft.Consumption/reservationTransactions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ModernReservationTransactionsListResult>> listByBillingProfile(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingAccountId") String billingAccountId,
            @PathParam("billingProfileId") String billingProfileId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReservationTransactionsListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ModernReservationTransactionsListResult>> listByBillingProfileNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReservationTransactionInner>> listSinglePageAsync(
        String billingAccountId, String filter) {
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
                        .list(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            billingAccountId,
                            accept,
                            context))
            .<PagedResponse<ReservationTransactionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReservationTransactionInner>> listSinglePageAsync(
        String billingAccountId, String filter, Context context) {
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
            .list(this.client.getEndpoint(), filter, this.client.getApiVersion(), billingAccountId, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReservationTransactionInner> listAsync(String billingAccountId, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(billingAccountId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReservationTransactionInner> listAsync(String billingAccountId) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(billingAccountId, filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReservationTransactionInner> listAsync(String billingAccountId, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(billingAccountId, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReservationTransactionInner> list(String billingAccountId) {
        final String filter = null;
        return new PagedIterable<>(listAsync(billingAccountId, filter));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReservationTransactionInner> list(String billingAccountId, String filter, Context context) {
        return new PagedIterable<>(listAsync(billingAccountId, filter, context));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ModernReservationTransactionInner>> listByBillingProfileSinglePageAsync(
        String billingAccountId, String billingProfileId, String filter) {
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
        if (billingProfileId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByBillingProfile(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            billingAccountId,
                            billingProfileId,
                            accept,
                            context))
            .<PagedResponse<ModernReservationTransactionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ModernReservationTransactionInner>> listByBillingProfileSinglePageAsync(
        String billingAccountId, String billingProfileId, String filter, Context context) {
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
        if (billingProfileId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingProfileId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByBillingProfile(
                this.client.getEndpoint(),
                filter,
                this.client.getApiVersion(),
                billingAccountId,
                billingProfileId,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ModernReservationTransactionInner> listByBillingProfileAsync(
        String billingAccountId, String billingProfileId, String filter) {
        return new PagedFlux<>(
            () -> listByBillingProfileSinglePageAsync(billingAccountId, billingProfileId, filter),
            nextLink -> listByBillingProfileNextSinglePageAsync(nextLink));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ModernReservationTransactionInner> listByBillingProfileAsync(
        String billingAccountId, String billingProfileId) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listByBillingProfileSinglePageAsync(billingAccountId, billingProfileId, filter),
            nextLink -> listByBillingProfileNextSinglePageAsync(nextLink));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ModernReservationTransactionInner> listByBillingProfileAsync(
        String billingAccountId, String billingProfileId, String filter, Context context) {
        return new PagedFlux<>(
            () -> listByBillingProfileSinglePageAsync(billingAccountId, billingProfileId, filter, context),
            nextLink -> listByBillingProfileNextSinglePageAsync(nextLink, context));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModernReservationTransactionInner> listByBillingProfile(
        String billingAccountId, String billingProfileId) {
        final String filter = null;
        return new PagedIterable<>(listByBillingProfileAsync(billingAccountId, billingProfileId, filter));
    }

    /**
     * List of transactions for reserved instances on billing account scope.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param filter Filter reservation transactions by date range. The properties/EventDate for start date and end
     *     date. The filter supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModernReservationTransactionInner> listByBillingProfile(
        String billingAccountId, String billingProfileId, String filter, Context context) {
        return new PagedIterable<>(listByBillingProfileAsync(billingAccountId, billingProfileId, filter, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReservationTransactionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ReservationTransactionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReservationTransactionInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ModernReservationTransactionInner>> listByBillingProfileNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listByBillingProfileNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ModernReservationTransactionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations along with {@link PagedResponse} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ModernReservationTransactionInner>> listByBillingProfileNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByBillingProfileNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
