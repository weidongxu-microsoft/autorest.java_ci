// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlVirtualMachines. */
public interface SqlVirtualMachines {
    /**
     * Gets the list of sql virtual machines in a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of sql virtual machines in a SQL virtual machine group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> listBySqlVmGroup(String resourceGroupName, String sqlVirtualMachineGroupName);

    /**
     * Gets the list of sql virtual machines in a SQL virtual machine group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineGroupName Name of the SQL virtual machine group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of sql virtual machines in a SQL virtual machine group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> listBySqlVmGroup(
        String resourceGroupName, String sqlVirtualMachineGroupName, Context context);

    /**
     * Gets all SQL virtual machines in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> list();

    /**
     * Gets all SQL virtual machines in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> list(Context context);

    /**
     * Starts Assessment on SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startAssessment(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Starts Assessment on SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startAssessment(String resourceGroupName, String sqlVirtualMachineName, Context context);

    /**
     * Uninstalls and reinstalls the SQL Iaas Extension.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Uninstalls and reinstalls the SQL Iaas Extension.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String sqlVirtualMachineName, Context context);

    /**
     * Gets a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine.
     */
    SqlVirtualMachine getByResourceGroup(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Gets a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine along with {@link Response}.
     */
    Response<SqlVirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlVirtualMachineName, String expand, Context context);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String sqlVirtualMachineName);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sqlVirtualMachineName, Context context);

    /**
     * Gets all SQL virtual machines in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all SQL virtual machines in a resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SQL virtual machines in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SqlVirtualMachine> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a SQL virtual machine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine along with {@link Response}.
     */
    SqlVirtualMachine getById(String id);

    /**
     * Gets a SQL virtual machine.
     *
     * @param id the resource ID.
     * @param expand The child resources to include in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SQL virtual machine along with {@link Response}.
     */
    Response<SqlVirtualMachine> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a SQL virtual machine.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SqlVirtualMachine resource.
     *
     * @param name resource name.
     * @return the first stage of the new SqlVirtualMachine definition.
     */
    SqlVirtualMachine.DefinitionStages.Blank define(String name);
}
