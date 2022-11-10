// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.costmanagement.generated.fluent.QueriesClient;
import com.azure.resourcemanager.costmanagement.generated.fluent.models.QueryResultInner;
import com.azure.resourcemanager.costmanagement.generated.models.ExternalCloudProviderType;
import com.azure.resourcemanager.costmanagement.generated.models.QueryDefinition;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in QueriesClient. */
public final class QueriesClientImpl implements QueriesClient {
    /** The proxy service used to perform REST calls. */
    private final QueriesService service;

    /** The service client containing this operation class. */
    private final CostManagementClientImpl client;

    /**
     * Initializes an instance of QueriesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QueriesClientImpl(CostManagementClientImpl client) {
        this.service = RestProxy.create(QueriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CostManagementClientQueries to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CostManagementClient")
    public interface QueriesService {
        @Headers({"Content-Type: application/json"})
        @Post("/{scope}/providers/Microsoft.CostManagement/query")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QueryResultInner>> usage(
            @HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") QueryDefinition parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.CostManagement/{externalCloudProviderType}/{externalCloudProviderId}/query")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QueryResultInner>> usageByExternalCloudProviderType(
            @HostParam("$host") String endpoint,
            @PathParam("externalCloudProviderType") ExternalCloudProviderType externalCloudProviderType,
            @PathParam("externalCloudProviderId") String externalCloudProviderId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") QueryDefinition parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Query the usage data for scope defined.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultInner>> usageWithResponseAsync(String scope, QueryDefinition parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .usage(
                            this.client.getEndpoint(), scope, this.client.getApiVersion(), parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Query the usage data for scope defined.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultInner>> usageWithResponseAsync(
        String scope, QueryDefinition parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .usage(this.client.getEndpoint(), scope, this.client.getApiVersion(), parameters, accept, context);
    }

    /**
     * Query the usage data for scope defined.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QueryResultInner> usageAsync(String scope, QueryDefinition parameters) {
        return usageWithResponseAsync(scope, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Query the usage data for scope defined.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResultInner> usageWithResponse(String scope, QueryDefinition parameters, Context context) {
        return usageWithResponseAsync(scope, parameters, context).block();
    }

    /**
     * Query the usage data for scope defined.
     *
     * @param scope The scope associated with query and export operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResultInner usage(String scope, QueryDefinition parameters) {
        return usageWithResponse(scope, parameters, Context.NONE).getValue();
    }

    /**
     * Query the usage data for external cloud provider type defined.
     *
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     *     This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated
     *     account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     *     '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultInner>> usageByExternalCloudProviderTypeWithResponseAsync(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (externalCloudProviderType == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter externalCloudProviderType is required and cannot be null."));
        }
        if (externalCloudProviderId == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter externalCloudProviderId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .usageByExternalCloudProviderType(
                            this.client.getEndpoint(),
                            externalCloudProviderType,
                            externalCloudProviderId,
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Query the usage data for external cloud provider type defined.
     *
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     *     This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated
     *     account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     *     '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QueryResultInner>> usageByExternalCloudProviderTypeWithResponseAsync(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (externalCloudProviderType == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter externalCloudProviderType is required and cannot be null."));
        }
        if (externalCloudProviderId == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter externalCloudProviderId is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .usageByExternalCloudProviderType(
                this.client.getEndpoint(),
                externalCloudProviderType,
                externalCloudProviderId,
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Query the usage data for external cloud provider type defined.
     *
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     *     This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated
     *     account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     *     '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QueryResultInner> usageByExternalCloudProviderTypeAsync(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters) {
        return usageByExternalCloudProviderTypeWithResponseAsync(
                externalCloudProviderType, externalCloudProviderId, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Query the usage data for external cloud provider type defined.
     *
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     *     This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated
     *     account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     *     '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QueryResultInner> usageByExternalCloudProviderTypeWithResponse(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters,
        Context context) {
        return usageByExternalCloudProviderTypeWithResponseAsync(
                externalCloudProviderType, externalCloudProviderId, parameters, context)
            .block();
    }

    /**
     * Query the usage data for external cloud provider type defined.
     *
     * @param externalCloudProviderType The external cloud provider type associated with dimension/query operations.
     *     This includes 'externalSubscriptions' for linked account and 'externalBillingAccounts' for consolidated
     *     account.
     * @param externalCloudProviderId This can be '{externalSubscriptionId}' for linked account or
     *     '{externalBillingAccountId}' for consolidated account used with dimension/query operations.
     * @param parameters Parameters supplied to the CreateOrUpdate Query Config operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QueryResultInner usageByExternalCloudProviderType(
        ExternalCloudProviderType externalCloudProviderType,
        String externalCloudProviderId,
        QueryDefinition parameters) {
        return usageByExternalCloudProviderTypeWithResponse(
                externalCloudProviderType, externalCloudProviderId, parameters, Context.NONE)
            .getValue();
    }
}
