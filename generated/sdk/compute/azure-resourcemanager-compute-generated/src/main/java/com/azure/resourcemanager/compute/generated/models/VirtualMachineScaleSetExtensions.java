// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualMachineScaleSetExtensions. */
public interface VirtualMachineScaleSetExtensions {
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
    VirtualMachineScaleSetExtension get(String resourceGroupName, String vmScaleSetName, String vmssExtensionName);

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
    Response<VirtualMachineScaleSetExtension> getWithResponse(
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
    PagedIterable<VirtualMachineScaleSetExtension> list(String resourceGroupName, String vmScaleSetName);

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
    PagedIterable<VirtualMachineScaleSetExtension> list(
        String resourceGroupName, String vmScaleSetName, Context context);

    /**
     * The operation to get the extension.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension along with {@link Response}.
     */
    VirtualMachineScaleSetExtension getById(String id);

    /**
     * The operation to get the extension.
     *
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine Scale Set Extension along with {@link Response}.
     */
    Response<VirtualMachineScaleSetExtension> getByIdWithResponse(String id, String expand, Context context);

    /**
     * The operation to delete the extension.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete the extension.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualMachineScaleSetExtension resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualMachineScaleSetExtension definition.
     */
    VirtualMachineScaleSetExtension.DefinitionStages.Blank define(String name);
}
