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
import com.azure.resourcemanager.consumption.generated.fluent.AggregatedCostsClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.ManagementGroupAggregatedCostResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AggregatedCostsClient.
 */
public final class AggregatedCostsClientImpl implements AggregatedCostsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AggregatedCostsService service;

    /**
     * The service client containing this operation class.
     */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of AggregatedCostsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AggregatedCostsClientImpl(ConsumptionManagementClientImpl client) {
        this.service
            = RestProxy.create(AggregatedCostsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientAggregatedCosts to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    public interface AggregatedCostsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.Management/managementGroups/{managementGroupId}/providers/Microsoft.Consumption/aggregatedcost")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagementGroupAggregatedCostResultInner>> getByManagementGroup(
            @HostParam("$host") String endpoint, @PathParam("managementGroupId") String managementGroupId,
            @QueryParam("api-version") String apiVersion, @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.Management/managementGroups/{managementGroupId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers/Microsoft.Consumption/aggregatedCost")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagementGroupAggregatedCostResultInner>> getForBillingPeriodByManagementGroup(
            @HostParam("$host") String endpoint, @PathParam("managementGroupId") String managementGroupId,
            @PathParam("billingPeriodName") String billingPeriodName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementGroupAggregatedCostResultInner>>
        getByManagementGroupWithResponseAsync(String managementGroupId, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getByManagementGroup(this.client.getEndpoint(), managementGroupId,
                this.client.getApiVersion(), filter, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementGroupAggregatedCostResultInner>>
        getByManagementGroupWithResponseAsync(String managementGroupId, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getByManagementGroup(this.client.getEndpoint(), managementGroupId, this.client.getApiVersion(),
            filter, accept, context);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagementGroupAggregatedCostResultInner> getByManagementGroupAsync(String managementGroupId) {
        final String filter = null;
        return getByManagementGroupWithResponseAsync(managementGroupId, filter)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagementGroupAggregatedCostResultInner> getByManagementGroupWithResponse(String managementGroupId,
        String filter, Context context) {
        return getByManagementGroupWithResponseAsync(managementGroupId, filter, context).block();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementGroupAggregatedCostResultInner getByManagementGroup(String managementGroupId) {
        final String filter = null;
        return getByManagementGroupWithResponse(managementGroupId, filter, Context.NONE).getValue();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementGroupAggregatedCostResultInner>>
        getForBillingPeriodByManagementGroupWithResponseAsync(String managementGroupId, String billingPeriodName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getForBillingPeriodByManagementGroup(this.client.getEndpoint(),
                managementGroupId, billingPeriodName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementGroupAggregatedCostResultInner>>
        getForBillingPeriodByManagementGroupWithResponseAsync(String managementGroupId, String billingPeriodName,
            Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (managementGroupId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementGroupId is required and cannot be null."));
        }
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getForBillingPeriodByManagementGroup(this.client.getEndpoint(), managementGroupId,
            billingPeriodName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagementGroupAggregatedCostResultInner>
        getForBillingPeriodByManagementGroupAsync(String managementGroupId, String billingPeriodName) {
        return getForBillingPeriodByManagementGroupWithResponseAsync(managementGroupId, billingPeriodName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagementGroupAggregatedCostResultInner> getForBillingPeriodByManagementGroupWithResponse(
        String managementGroupId, String billingPeriodName, Context context) {
        return getForBillingPeriodByManagementGroupWithResponseAsync(managementGroupId, billingPeriodName, context)
            .block();
    }

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     * 
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementGroupAggregatedCostResultInner getForBillingPeriodByManagementGroup(String managementGroupId,
        String billingPeriodName) {
        return getForBillingPeriodByManagementGroupWithResponse(managementGroupId, billingPeriodName, Context.NONE)
            .getValue();
    }
}
