// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.IpAllocationInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/**
 * An instance of this class provides access to all the operations defined in IpAllocationsClient.
 */
public interface IpAllocationsClient {
    /**
     * Deletes the specified IpAllocation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipAllocationName);

    /**
     * Deletes the specified IpAllocation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipAllocationName, Context context);

    /**
     * Deletes the specified IpAllocation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipAllocationName);

    /**
     * Deletes the specified IpAllocation.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipAllocationName, Context context);

    /**
     * Gets the specified IpAllocation by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpAllocationInner> getByResourceGroupWithResponse(String resourceGroupName, String ipAllocationName,
        String expand, Context context);

    /**
     * Gets the specified IpAllocation by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified IpAllocation by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpAllocationInner getByResourceGroup(String resourceGroupName, String ipAllocationName);

    /**
     * Creates or updates an IpAllocation in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to the create or update virtual network operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ipAllocation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpAllocationInner>, IpAllocationInner> beginCreateOrUpdate(String resourceGroupName,
        String ipAllocationName, IpAllocationInner parameters);

    /**
     * Creates or updates an IpAllocation in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to the create or update virtual network operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ipAllocation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpAllocationInner>, IpAllocationInner> beginCreateOrUpdate(String resourceGroupName,
        String ipAllocationName, IpAllocationInner parameters, Context context);

    /**
     * Creates or updates an IpAllocation in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to the create or update virtual network operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipAllocation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpAllocationInner createOrUpdate(String resourceGroupName, String ipAllocationName, IpAllocationInner parameters);

    /**
     * Creates or updates an IpAllocation in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to the create or update virtual network operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipAllocation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpAllocationInner createOrUpdate(String resourceGroupName, String ipAllocationName, IpAllocationInner parameters,
        Context context);

    /**
     * Updates a IpAllocation tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to update IpAllocation tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipAllocation resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpAllocationInner> updateTagsWithResponse(String resourceGroupName, String ipAllocationName,
        TagsObject parameters, Context context);

    /**
     * Updates a IpAllocation tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param ipAllocationName The name of the IpAllocation.
     * @param parameters Parameters supplied to update IpAllocation tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipAllocation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpAllocationInner updateTags(String resourceGroupName, String ipAllocationName, TagsObject parameters);

    /**
     * Gets all IpAllocations in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpAllocationInner> list();

    /**
     * Gets all IpAllocations in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpAllocationInner> list(Context context);

    /**
     * Gets all IpAllocations in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpAllocationInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all IpAllocations in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpAllocations in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpAllocationInner> listByResourceGroup(String resourceGroupName, Context context);
}
