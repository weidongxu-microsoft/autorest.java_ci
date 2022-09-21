// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner;

/** Resource collection API of VirtualMachineScaleSetVMs. */
public interface VirtualMachineScaleSetVMs {
    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmScaleSetVMReimageInput Parameters for the Reimaging Virtual machine in ScaleSet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMReimageParameters vmScaleSetVMReimageInput);

    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param vmScaleSetVMReimageInput Parameters for the Reimaging Virtual machine in ScaleSet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMReimageParameters vmScaleSetVMReimageInput,
        Context context);

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is
     * only supported for managed disks.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimageAll(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is
     * only supported for managed disks.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimageAll(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute
     * resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute
     * resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * Updates a virtual machine of a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine Scale Sets VM operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a virtual machine scale set virtual machine.
     */
    VirtualMachineScaleSetVM update(
        String resourceGroupName, String vmScaleSetName, String instanceId, VirtualMachineScaleSetVMInner parameters);

    /**
     * Updates a virtual machine of a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine Scale Sets VM operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a virtual machine scale set virtual machine.
     */
    VirtualMachineScaleSetVM update(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        VirtualMachineScaleSetVMInner parameters,
        Context context);

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param forceDeletion Optional parameter to force delete a virtual machine from a VM scale set. (Feature in
     *     Preview).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmScaleSetName, String instanceId, Boolean forceDeletion);

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param forceDeletion Optional parameter to force delete a virtual machine from a VM scale set. (Feature in
     *     Preview).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String vmScaleSetName, String instanceId, Boolean forceDeletion, Context context);

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the instance view of
     *     the virtual machine. 'UserData' will retrieve the UserData of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine from a VM scale set along with {@link Response}.
     */
    Response<VirtualMachineScaleSetVM> getWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, InstanceViewTypes expand, Context context);

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine from a VM scale set.
     */
    VirtualMachineScaleSetVM get(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Gets the status of a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a virtual machine from a VM scale set along with {@link Response}.
     */
    Response<VirtualMachineScaleSetVMInstanceView> getInstanceViewWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * Gets the status of a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a virtual machine from a VM scale set.
     */
    VirtualMachineScaleSetVMInstanceView getInstanceView(
        String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machines in a VM scale sets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineScaleSetVM> list(String resourceGroupName, String virtualMachineScaleSetName);

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param filter The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code,
     *     'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.
     * @param select The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtual machines in a VM scale sets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachineScaleSetVM> list(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String filter,
        String select,
        String expand,
        Context context);

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param skipShutdown The parameter to request non-graceful VM shutdown. True value for this flag indicates
     *     non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not
     *     specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String vmScaleSetName, String instanceId, Boolean skipShutdown);

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param skipShutdown The parameter to request non-graceful VM shutdown. True value for this flag indicates
     *     non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(
        String resourceGroupName, String vmScaleSetName, String instanceId, Boolean skipShutdown, Context context);

    /**
     * Restarts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Restarts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * Starts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Starts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * The operation to retrieve SAS URIs of boot diagnostic logs for a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param sasUriExpirationTimeInMinutes Expiration duration in minutes for the SAS URIs with a value between 1 to
     *     1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default
     *     expiration duration of 120 minutes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAS URIs of the console screenshot and serial log blobs along with {@link Response}.
     */
    Response<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataWithResponse(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        Integer sasUriExpirationTimeInMinutes,
        Context context);

    /**
     * The operation to retrieve SAS URIs of boot diagnostic logs for a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    RetrieveBootDiagnosticsDataResult retrieveBootDiagnosticsData(
        String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void performMaintenance(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void performMaintenance(String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * The operation to simulate the eviction of spot virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> simulateEvictionWithResponse(
        String resourceGroupName, String vmScaleSetName, String instanceId, Context context);

    /**
     * The operation to simulate the eviction of spot virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void simulateEviction(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Run command on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    RunCommandResult runCommand(
        String resourceGroupName, String vmScaleSetName, String instanceId, RunCommandInput parameters);

    /**
     * Run command on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    RunCommandResult runCommand(
        String resourceGroupName,
        String vmScaleSetName,
        String instanceId,
        RunCommandInput parameters,
        Context context);
}
