// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentBaseInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandUpdate;

/** An instance of this class provides access to all the operations defined in VirtualMachineRunCommandsClient. */
public interface VirtualMachineRunCommandsClient {
    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunCommandDocumentBaseInner> list(String location);

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RunCommandDocumentBaseInner> list(String location, Context context);

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RunCommandDocumentInner> getWithResponse(String location, String commandId, Context context);

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RunCommandDocumentInner get(String location, String commandId);

    /**
     * The operation to create or update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be created or updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Create Virtual Machine RunCommand operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginCreateOrUpdate(
        String resourceGroupName, String vmName, String runCommandName, VirtualMachineRunCommandInner runCommand);

    /**
     * The operation to create or update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be created or updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Create Virtual Machine RunCommand operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vmName,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand,
        Context context);

    /**
     * The operation to create or update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be created or updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Create Virtual Machine RunCommand operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner createOrUpdate(
        String resourceGroupName, String vmName, String runCommandName, VirtualMachineRunCommandInner runCommand);

    /**
     * The operation to create or update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be created or updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Create Virtual Machine RunCommand operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner createOrUpdate(
        String resourceGroupName,
        String vmName,
        String runCommandName,
        VirtualMachineRunCommandInner runCommand,
        Context context);

    /**
     * The operation to update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Update Virtual Machine RunCommand operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginUpdate(
        String resourceGroupName, String vmName, String runCommandName, VirtualMachineRunCommandUpdate runCommand);

    /**
     * The operation to update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Update Virtual Machine RunCommand operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineRunCommandInner>, VirtualMachineRunCommandInner> beginUpdate(
        String resourceGroupName,
        String vmName,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand,
        Context context);

    /**
     * The operation to update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Update Virtual Machine RunCommand operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner update(
        String resourceGroupName, String vmName, String runCommandName, VirtualMachineRunCommandUpdate runCommand);

    /**
     * The operation to update the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be updated.
     * @param runCommandName The name of the virtual machine run command.
     * @param runCommand Parameters supplied to the Update Virtual Machine RunCommand operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner update(
        String resourceGroupName,
        String vmName,
        String runCommandName,
        VirtualMachineRunCommandUpdate runCommand,
        Context context);

    /**
     * The operation to delete the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be deleted.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vmName, String runCommandName);

    /**
     * The operation to delete the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be deleted.
     * @param runCommandName The name of the virtual machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmName, String runCommandName, Context context);

    /**
     * The operation to delete the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be deleted.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmName, String runCommandName);

    /**
     * The operation to delete the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be deleted.
     * @param runCommandName The name of the virtual machine run command.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmName, String runCommandName, Context context);

    /**
     * The operation to get the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @param runCommandName The name of the virtual machine run command.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineRunCommandInner> getByVirtualMachineWithResponse(
        String resourceGroupName, String vmName, String runCommandName, String expand, Context context);

    /**
     * The operation to get the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine run command.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineRunCommandInner getByVirtualMachine(String resourceGroupName, String vmName, String runCommandName);

    /**
     * The operation to get all run commands of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List run command operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineRunCommandInner> listByVirtualMachine(String resourceGroupName, String vmName);

    /**
     * The operation to get all run commands of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List run command operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineRunCommandInner> listByVirtualMachine(
        String resourceGroupName, String vmName, String expand, Context context);
}
