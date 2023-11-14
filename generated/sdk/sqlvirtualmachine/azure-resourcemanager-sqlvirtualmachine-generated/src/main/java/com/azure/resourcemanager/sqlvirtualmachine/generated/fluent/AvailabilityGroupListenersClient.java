// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sqlvirtualmachine.generated.fluent.models.AvailabilityGroupListenerInner;

/**
 * An instance of this class provides access to all the operations defined in AvailabilityGroupListenersClient.
 */
public interface AvailabilityGroupListenersClient {
    /**
     * Gets an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an availability group listener along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AvailabilityGroupListenerInner> getWithResponse(String resourceGroupName,
        String sqlVirtualMachineGroupName, String availabilityGroupListenerName, String expand, Context context);

    /**
     * Gets an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an availability group listener.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilityGroupListenerInner get(String resourceGroupName, String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName);

    /**
     * Creates or updates an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param parameters The availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a SQL Server availability group listener.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvailabilityGroupListenerInner>, AvailabilityGroupListenerInner> beginCreateOrUpdate(
        String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName,
        AvailabilityGroupListenerInner parameters);

    /**
     * Creates or updates an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param parameters The availability group listener.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a SQL Server availability group listener.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AvailabilityGroupListenerInner>, AvailabilityGroupListenerInner> beginCreateOrUpdate(
        String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName,
        AvailabilityGroupListenerInner parameters, Context context);

    /**
     * Creates or updates an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param parameters The availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL Server availability group listener.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilityGroupListenerInner createOrUpdate(String resourceGroupName, String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName, AvailabilityGroupListenerInner parameters);

    /**
     * Creates or updates an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param parameters The availability group listener.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL Server availability group listener.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AvailabilityGroupListenerInner createOrUpdate(String resourceGroupName, String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName, AvailabilityGroupListenerInner parameters, Context context);

    /**
     * Deletes an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName);

    /**
     * Deletes an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String sqlVirtualMachineGroupName,
        String availabilityGroupListenerName, Context context);

    /**
     * Deletes an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName);

    /**
     * Deletes an availability group listener.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param availabilityGroupListenerName Name of the availability group listener.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sqlVirtualMachineGroupName, String availabilityGroupListenerName,
        Context context);

    /**
     * Lists all availability group listeners in a SQL virtual machine group.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of availability group listeners as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityGroupListenerInner> listByGroup(String resourceGroupName,
        String sqlVirtualMachineGroupName);

    /**
     * Lists all availability group listeners in a SQL virtual machine group.
     * 
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     * the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of availability group listeners as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailabilityGroupListenerInner> listByGroup(String resourceGroupName,
        String sqlVirtualMachineGroupName, Context context);
}
