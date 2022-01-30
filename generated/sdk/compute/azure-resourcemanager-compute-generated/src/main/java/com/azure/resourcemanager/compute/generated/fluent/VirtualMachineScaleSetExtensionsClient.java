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
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtensionUpdate;

/**
 * An instance of this class provides access to all the operations defined in VirtualMachineScaleSetExtensionsClient.
 */
public interface VirtualMachineScaleSetExtensionsClient {
    /**
     * The operation to create or update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Create VM scale set Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineScaleSetExtensionInner>, VirtualMachineScaleSetExtensionInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            VirtualMachineScaleSetExtensionInner extensionParameters);

    /**
     * The operation to create or update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Create VM scale set Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineScaleSetExtensionInner>, VirtualMachineScaleSetExtensionInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            VirtualMachineScaleSetExtensionInner extensionParameters,
            Context context);

    /**
     * The operation to create or update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Create VM scale set Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineScaleSetExtensionInner createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionInner extensionParameters);

    /**
     * The operation to create or update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Create VM scale set Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineScaleSetExtensionInner createOrUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionInner extensionParameters,
        Context context);

    /**
     * The operation to update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Update VM scale set Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineScaleSetExtensionInner>, VirtualMachineScaleSetExtensionInner> beginUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionUpdate extensionParameters);

    /**
     * The operation to update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Update VM scale set Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineScaleSetExtensionInner>, VirtualMachineScaleSetExtensionInner> beginUpdate(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionUpdate extensionParameters,
        Context context);

    /**
     * The operation to update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Update VM scale set Extension operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineScaleSetExtensionInner update(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionUpdate extensionParameters);

    /**
     * The operation to update an extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Update VM scale set Extension operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineScaleSetExtensionInner update(
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName,
        VirtualMachineScaleSetExtensionUpdate extensionParameters,
        Context context);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName, Context context);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, Context context);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineScaleSetExtensionInner get(String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineScaleSetExtensionInner> getWithResponse(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand, Context context);

    /**
     * Gets a list of all extensions in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all extensions in a VM scale set as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineScaleSetExtensionInner> list(String resourceGroupName, String vmScaleSetName);

    /**
     * Gets a list of all extensions in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all extensions in a VM scale set as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineScaleSetExtensionInner> list(
        String resourceGroupName, String vmScaleSetName, Context context);
}
