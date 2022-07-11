// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DomainInner;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.DomainSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.generated.models.DomainRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.generated.models.DomainUpdateParameters;

/** An instance of this class provides access to all the operations defined in DomainsClient. */
public interface DomainsClient {
    /**
     * Get a domain.
     *
     * <p>Get properties of a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner getByResourceGroup(String resourceGroupName, String domainName);

    /**
     * Get a domain.
     *
     * <p>Get properties of a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DomainInner> getByResourceGroupWithResponse(String resourceGroupName, String domainName, Context context);

    /**
     * Create or update a domain.
     *
     * <p>Asynchronously creates or updates a new domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainInfo Domain information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid Domain.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DomainInner>, DomainInner> beginCreateOrUpdate(
        String resourceGroupName, String domainName, DomainInner domainInfo);

    /**
     * Create or update a domain.
     *
     * <p>Asynchronously creates or updates a new domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainInfo Domain information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of eventGrid Domain.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DomainInner>, DomainInner> beginCreateOrUpdate(
        String resourceGroupName, String domainName, DomainInner domainInfo, Context context);

    /**
     * Create or update a domain.
     *
     * <p>Asynchronously creates or updates a new domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainInfo Domain information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner createOrUpdate(String resourceGroupName, String domainName, DomainInner domainInfo);

    /**
     * Create or update a domain.
     *
     * <p>Asynchronously creates or updates a new domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainInfo Domain information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eventGrid Domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner createOrUpdate(String resourceGroupName, String domainName, DomainInner domainInfo, Context context);

    /**
     * Delete a domain.
     *
     * <p>Delete existing domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String domainName);

    /**
     * Delete a domain.
     *
     * <p>Delete existing domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String domainName, Context context);

    /**
     * Delete a domain.
     *
     * <p>Delete existing domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName);

    /**
     * Delete a domain.
     *
     * <p>Delete existing domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName, Context context);

    /**
     * Update a domain.
     *
     * <p>Asynchronously updates a domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainUpdateParameters Domain update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DomainInner>, DomainInner> beginUpdate(
        String resourceGroupName, String domainName, DomainUpdateParameters domainUpdateParameters);

    /**
     * Update a domain.
     *
     * <p>Asynchronously updates a domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainUpdateParameters Domain update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DomainInner>, DomainInner> beginUpdate(
        String resourceGroupName, String domainName, DomainUpdateParameters domainUpdateParameters, Context context);

    /**
     * Update a domain.
     *
     * <p>Asynchronously updates a domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainUpdateParameters Domain update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner update(String resourceGroupName, String domainName, DomainUpdateParameters domainUpdateParameters);

    /**
     * Update a domain.
     *
     * <p>Asynchronously updates a domain with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainUpdateParameters Domain update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner update(
        String resourceGroupName, String domainName, DomainUpdateParameters domainUpdateParameters, Context context);

    /**
     * List domains under an Azure subscription.
     *
     * <p>List all the domains under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domains operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> list();

    /**
     * List domains under an Azure subscription.
     *
     * <p>List all the domains under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domains operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> list(String filter, Integer top, Context context);

    /**
     * List domains under a resource group.
     *
     * <p>List all the domains under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domains operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> listByResourceGroup(String resourceGroupName);

    /**
     * List domains under a resource group.
     *
     * <p>List all the domains under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domains operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * List keys for a domain.
     *
     * <p>List the two keys used to publish to a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainSharedAccessKeysInner listSharedAccessKeys(String resourceGroupName, String domainName);

    /**
     * List keys for a domain.
     *
     * <p>List the two keys used to publish to a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DomainSharedAccessKeysInner> listSharedAccessKeysWithResponse(
        String resourceGroupName, String domainName, Context context);

    /**
     * Regenerate key for a domain.
     *
     * <p>Regenerate a shared access key for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainSharedAccessKeysInner regenerateKey(
        String resourceGroupName, String domainName, DomainRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate key for a domain.
     *
     * <p>Regenerate a shared access key for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DomainSharedAccessKeysInner> regenerateKeyWithResponse(
        String resourceGroupName, String domainName, DomainRegenerateKeyRequest regenerateKeyRequest, Context context);
}
