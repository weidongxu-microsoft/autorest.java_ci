// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceConnectionInner;

/**
 * Resource collection API of NetworkVirtualApplianceConnections.
 */
public interface NetworkVirtualApplianceConnections {
    /**
     * Creates a connection to Network Virtual Appliance, if it doesn't exist else updates the existing NVA connection'.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @param networkVirtualApplianceConnectionParameters Parameters supplied in an NetworkVirtualApplianceConnection
     * PUT operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection resource.
     */
    NetworkVirtualApplianceConnection createOrUpdate(String resourceGroupName, String networkVirtualApplianceName,
        String connectionName, NetworkVirtualApplianceConnectionInner networkVirtualApplianceConnectionParameters);

    /**
     * Creates a connection to Network Virtual Appliance, if it doesn't exist else updates the existing NVA connection'.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @param networkVirtualApplianceConnectionParameters Parameters supplied in an NetworkVirtualApplianceConnection
     * PUT operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection resource.
     */
    NetworkVirtualApplianceConnection createOrUpdate(String resourceGroupName, String networkVirtualApplianceName,
        String connectionName, NetworkVirtualApplianceConnectionInner networkVirtualApplianceConnectionParameters,
        Context context);

    /**
     * Retrieves the details of specified NVA connection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection resource along with {@link Response}.
     */
    Response<NetworkVirtualApplianceConnection> getWithResponse(String resourceGroupName,
        String networkVirtualApplianceName, String connectionName, Context context);

    /**
     * Retrieves the details of specified NVA connection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection resource.
     */
    NetworkVirtualApplianceConnection get(String resourceGroupName, String networkVirtualApplianceName,
        String connectionName);

    /**
     * Deletes a NVA connection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkVirtualApplianceName, String connectionName);

    /**
     * Deletes a NVA connection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param connectionName The name of the NVA connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkVirtualApplianceName, String connectionName, Context context);

    /**
     * Lists NetworkVirtualApplianceConnections under the NVA.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkVirtualApplianceConnection> list(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Lists NetworkVirtualApplianceConnections under the NVA.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualApplianceConnection list as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkVirtualApplianceConnection> list(String resourceGroupName, String networkVirtualApplianceName,
        Context context);
}
