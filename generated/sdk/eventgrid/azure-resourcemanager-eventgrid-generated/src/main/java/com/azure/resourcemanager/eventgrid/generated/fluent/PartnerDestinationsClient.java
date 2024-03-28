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
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerDestinationInner;
import com.azure.resourcemanager.eventgrid.generated.models.PartnerDestinationUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in PartnerDestinationsClient.
 */
public interface PartnerDestinationsClient {
    /**
     * Get a partner destination.
     * 
     * Get properties of a partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner destination along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerDestinationInner> getByResourceGroupWithResponse(String resourceGroupName,
        String partnerDestinationName, Context context);

    /**
     * Get a partner destination.
     * 
     * Get properties of a partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner getByResourceGroup(String resourceGroupName, String partnerDestinationName);

    /**
     * Create a partner destination.
     * 
     * Asynchronously creates a new partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestination Partner destination create information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerDestinationInner>, PartnerDestinationInner> beginCreateOrUpdate(
        String resourceGroupName, String partnerDestinationName, PartnerDestinationInner partnerDestination);

    /**
     * Create a partner destination.
     * 
     * Asynchronously creates a new partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestination Partner destination create information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerDestinationInner>, PartnerDestinationInner> beginCreateOrUpdate(
        String resourceGroupName, String partnerDestinationName, PartnerDestinationInner partnerDestination,
        Context context);

    /**
     * Create a partner destination.
     * 
     * Asynchronously creates a new partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestination Partner destination create information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner createOrUpdate(String resourceGroupName, String partnerDestinationName,
        PartnerDestinationInner partnerDestination);

    /**
     * Create a partner destination.
     * 
     * Asynchronously creates a new partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestination Partner destination create information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner createOrUpdate(String resourceGroupName, String partnerDestinationName,
        PartnerDestinationInner partnerDestination, Context context);

    /**
     * Delete a partner destination.
     * 
     * Delete existing partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerDestinationName);

    /**
     * Delete a partner destination.
     * 
     * Delete existing partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String partnerDestinationName,
        Context context);

    /**
     * Delete a partner destination.
     * 
     * Delete existing partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerDestinationName);

    /**
     * Delete a partner destination.
     * 
     * Delete existing partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerDestinationName, Context context);

    /**
     * Update a partner destination.
     * 
     * Asynchronously updates a partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestinationUpdateParameters Partner destination update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerDestinationInner>, PartnerDestinationInner> beginUpdate(String resourceGroupName,
        String partnerDestinationName, PartnerDestinationUpdateParameters partnerDestinationUpdateParameters);

    /**
     * Update a partner destination.
     * 
     * Asynchronously updates a partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestinationUpdateParameters Partner destination update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PartnerDestinationInner>, PartnerDestinationInner> beginUpdate(String resourceGroupName,
        String partnerDestinationName, PartnerDestinationUpdateParameters partnerDestinationUpdateParameters,
        Context context);

    /**
     * Update a partner destination.
     * 
     * Asynchronously updates a partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestinationUpdateParameters Partner destination update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner update(String resourceGroupName, String partnerDestinationName,
        PartnerDestinationUpdateParameters partnerDestinationUpdateParameters);

    /**
     * Update a partner destination.
     * 
     * Asynchronously updates a partner destination with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param partnerDestinationUpdateParameters Partner destination update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner update(String resourceGroupName, String partnerDestinationName,
        PartnerDestinationUpdateParameters partnerDestinationUpdateParameters, Context context);

    /**
     * List partner destinations under an Azure subscription.
     * 
     * List all the partner destinations under an Azure subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Destinations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerDestinationInner> list();

    /**
     * List partner destinations under an Azure subscription.
     * 
     * List all the partner destinations under an Azure subscription.
     * 
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Destinations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerDestinationInner> list(String filter, Integer top, Context context);

    /**
     * List partner destinations under a resource group.
     * 
     * List all the partner destinations under a resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Destinations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerDestinationInner> listByResourceGroup(String resourceGroupName);

    /**
     * List partner destinations under a resource group.
     * 
     * List all the partner destinations under a resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Destinations operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PartnerDestinationInner> listByResourceGroup(String resourceGroupName, String filter, Integer top,
        Context context);

    /**
     * Activate a partner destination.
     * 
     * Activate a newly created partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PartnerDestinationInner> activateWithResponse(String resourceGroupName, String partnerDestinationName,
        Context context);

    /**
     * Activate a partner destination.
     * 
     * Activate a newly created partner destination.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerDestinationName Name of the partner destination.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Destination.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PartnerDestinationInner activate(String resourceGroupName, String partnerDestinationName);
}
