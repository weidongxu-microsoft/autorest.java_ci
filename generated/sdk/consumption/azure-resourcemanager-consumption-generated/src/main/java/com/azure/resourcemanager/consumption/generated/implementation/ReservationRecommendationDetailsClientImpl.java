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
import com.azure.resourcemanager.consumption.generated.fluent.ReservationRecommendationDetailsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ReservationRecommendationDetailsModelInner;
import com.azure.resourcemanager.consumption.generated.models.LookBackPeriod;
import com.azure.resourcemanager.consumption.generated.models.Scope;
import com.azure.resourcemanager.consumption.generated.models.Term;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReservationRecommendationDetailsClient.
 */
public final class ReservationRecommendationDetailsClientImpl implements ReservationRecommendationDetailsClient {
    /** The proxy service used to perform REST calls. */
    private final ReservationRecommendationDetailsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ReservationRecommendationDetailsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReservationRecommendationDetailsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ReservationRecommendationDetailsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientReservationRecommendationDetails to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    public interface ReservationRecommendationDetailsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceScope}/providers/Microsoft.Consumption/reservationRecommendationDetails")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReservationRecommendationDetailsModelInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceScope", encoded = true) String resourceScope,
            @QueryParam("scope") Scope scope,
            @QueryParam("region") String region,
            @QueryParam("term") Term term,
            @QueryParam("lookBackPeriod") LookBackPeriod lookBackPeriod,
            @QueryParam("product") String product,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReservationRecommendationDetailsModelInner>> getWithResponseAsync(
        String resourceScope, Scope scope, String region, Term term, LookBackPeriod lookBackPeriod, String product) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceScope == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceScope is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (region == null) {
            return Mono.error(new IllegalArgumentException("Parameter region is required and cannot be null."));
        }
        if (term == null) {
            return Mono.error(new IllegalArgumentException("Parameter term is required and cannot be null."));
        }
        if (lookBackPeriod == null) {
            return Mono.error(new IllegalArgumentException("Parameter lookBackPeriod is required and cannot be null."));
        }
        if (product == null) {
            return Mono.error(new IllegalArgumentException("Parameter product is required and cannot be null."));
        }
        final String apiVersion = "2021-10-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            resourceScope,
                            scope,
                            region,
                            term,
                            lookBackPeriod,
                            product,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ReservationRecommendationDetailsModelInner>> getWithResponseAsync(
        String resourceScope,
        Scope scope,
        String region,
        Term term,
        LookBackPeriod lookBackPeriod,
        String product,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceScope == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceScope is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (region == null) {
            return Mono.error(new IllegalArgumentException("Parameter region is required and cannot be null."));
        }
        if (term == null) {
            return Mono.error(new IllegalArgumentException("Parameter term is required and cannot be null."));
        }
        if (lookBackPeriod == null) {
            return Mono.error(new IllegalArgumentException("Parameter lookBackPeriod is required and cannot be null."));
        }
        if (product == null) {
            return Mono.error(new IllegalArgumentException("Parameter product is required and cannot be null."));
        }
        final String apiVersion = "2021-10-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                resourceScope,
                scope,
                region,
                term,
                lookBackPeriod,
                product,
                accept,
                context);
    }

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ReservationRecommendationDetailsModelInner> getAsync(
        String resourceScope, Scope scope, String region, Term term, LookBackPeriod lookBackPeriod, String product) {
        return getWithResponseAsync(resourceScope, scope, region, term, lookBackPeriod, product)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReservationRecommendationDetailsModelInner> getWithResponse(
        String resourceScope,
        Scope scope,
        String region,
        Term term,
        LookBackPeriod lookBackPeriod,
        String product,
        Context context) {
        return getWithResponseAsync(resourceScope, scope, region, term, lookBackPeriod, product, context).block();
    }

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReservationRecommendationDetailsModelInner get(
        String resourceScope, Scope scope, String region, Term term, LookBackPeriod lookBackPeriod, String product) {
        return getWithResponse(resourceScope, scope, region, term, lookBackPeriod, product, Context.NONE).getValue();
    }
}
