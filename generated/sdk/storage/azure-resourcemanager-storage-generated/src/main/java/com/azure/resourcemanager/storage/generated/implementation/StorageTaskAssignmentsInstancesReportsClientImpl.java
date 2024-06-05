// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

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
import com.azure.resourcemanager.storage.generated.fluent.StorageTaskAssignmentsInstancesReportsClient;
import com.azure.resourcemanager.storage.generated.fluent.models.StorageTaskReportInstanceInner;
import com.azure.resourcemanager.storage.generated.models.StorageTaskReportSummary;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * StorageTaskAssignmentsInstancesReportsClient.
 */
public final class StorageTaskAssignmentsInstancesReportsClientImpl
    implements StorageTaskAssignmentsInstancesReportsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StorageTaskAssignmentsInstancesReportsService service;

    /**
     * The service client containing this operation class.
     */
    private final StorageManagementClientImpl client;

    /**
     * Initializes an instance of StorageTaskAssignmentsInstancesReportsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StorageTaskAssignmentsInstancesReportsClientImpl(StorageManagementClientImpl client) {
        this.service = RestProxy.create(StorageTaskAssignmentsInstancesReportsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientStorageTaskAssignmentsInstancesReports to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    public interface StorageTaskAssignmentsInstancesReportsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/reports")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StorageTaskReportSummary>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName,
            @QueryParam("$maxpagesize") String maxpagesize, @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StorageTaskReportSummary>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StorageTaskReportInstanceInner>> listSinglePageAsync(String resourceGroupName,
        String accountName, String maxpagesize, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, accountName, maxpagesize, filter, this.client.getApiVersion(), accept, context))
            .<PagedResponse<StorageTaskReportInstanceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StorageTaskReportInstanceInner>> listSinglePageAsync(String resourceGroupName,
        String accountName, String maxpagesize, String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, accountName,
                maxpagesize, filter, this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StorageTaskReportInstanceInner> listAsync(String resourceGroupName, String accountName,
        String maxpagesize, String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StorageTaskReportInstanceInner> listAsync(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StorageTaskReportInstanceInner> listAsync(String resourceGroupName, String accountName,
        String maxpagesize, String filter, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageTaskReportInstanceInner> list(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter));
    }

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/en-us/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageTaskReportInstanceInner> list(String resourceGroupName, String accountName,
        String maxpagesize, String filter, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StorageTaskReportInstanceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<StorageTaskReportInstanceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StorageTaskReportInstanceInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
