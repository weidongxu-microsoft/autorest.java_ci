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
import com.azure.resourcemanager.network.generated.fluent.models.VirtualApplianceSiteInner;

/**
 * An instance of this class provides access to all the operations defined in VirtualApplianceSitesClient.
 */
public interface VirtualApplianceSitesClient {
    /**
     * Deletes the specified site from a Virtual Appliance.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkVirtualApplianceName,
        String siteName);

    /**
     * Deletes the specified site from a Virtual Appliance.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkVirtualApplianceName,
        String siteName, Context context);

    /**
     * Deletes the specified site from a Virtual Appliance.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkVirtualApplianceName, String siteName);

    /**
     * Deletes the specified site from a Virtual Appliance.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkVirtualApplianceName, String siteName, Context context);

    /**
     * Gets the specified Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Appliance Site along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualApplianceSiteInner> getWithResponse(String resourceGroupName, String networkVirtualApplianceName,
        String siteName, Context context);

    /**
     * Gets the specified Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Appliance Site.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualApplianceSiteInner get(String resourceGroupName, String networkVirtualApplianceName, String siteName);

    /**
     * Creates or updates the specified Network Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Site operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualApplianceSiteInner>, VirtualApplianceSiteInner> beginCreateOrUpdate(
        String resourceGroupName, String networkVirtualApplianceName, String siteName,
        VirtualApplianceSiteInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Site operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualApplianceSiteInner>, VirtualApplianceSiteInner> beginCreateOrUpdate(
        String resourceGroupName, String networkVirtualApplianceName, String siteName,
        VirtualApplianceSiteInner parameters, Context context);

    /**
     * Creates or updates the specified Network Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Site operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualApplianceSiteInner createOrUpdate(String resourceGroupName, String networkVirtualApplianceName,
        String siteName, VirtualApplianceSiteInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance Site.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param siteName The name of the site.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Site operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualApplianceSiteInner createOrUpdate(String resourceGroupName, String networkVirtualApplianceName,
        String siteName, VirtualApplianceSiteInner parameters, Context context);

    /**
     * Lists all Network Virtual Appliance Sites in a Network Virtual Appliance resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSites API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualApplianceSiteInner> list(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Lists all Network Virtual Appliance Sites in a Network Virtual Appliance resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualApplianceSites API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualApplianceSiteInner> list(String resourceGroupName, String networkVirtualApplianceName,
        Context context);
}
