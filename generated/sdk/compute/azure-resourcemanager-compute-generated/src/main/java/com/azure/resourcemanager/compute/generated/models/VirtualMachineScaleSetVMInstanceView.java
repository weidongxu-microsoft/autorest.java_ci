// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner;
import java.util.List;

/** An immutable client-side representation of VirtualMachineScaleSetVMInstanceView. */
public interface VirtualMachineScaleSetVMInstanceView {
    /**
     * Gets the platformUpdateDomain property: The Update Domain count.
     *
     * @return the platformUpdateDomain value.
     */
    Integer platformUpdateDomain();

    /**
     * Gets the platformFaultDomain property: The Fault Domain count.
     *
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * Gets the rdpThumbPrint property: The Remote desktop certificate thumbprint.
     *
     * @return the rdpThumbPrint value.
     */
    String rdpThumbPrint();

    /**
     * Gets the vmAgent property: The VM Agent running on the virtual machine.
     *
     * @return the vmAgent value.
     */
    VirtualMachineAgentInstanceView vmAgent();

    /**
     * Gets the maintenanceRedeployStatus property: The Maintenance Operation status on the virtual machine.
     *
     * @return the maintenanceRedeployStatus value.
     */
    MaintenanceRedeployStatus maintenanceRedeployStatus();

    /**
     * Gets the disks property: The disks information.
     *
     * @return the disks value.
     */
    List<DiskInstanceView> disks();

    /**
     * Gets the extensions property: The extensions information.
     *
     * @return the extensions value.
     */
    List<VirtualMachineExtensionInstanceView> extensions();

    /**
     * Gets the vmHealth property: The health status for the VM.
     *
     * @return the vmHealth value.
     */
    VirtualMachineHealthStatus vmHealth();

    /**
     * Gets the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; You can easily view the output of your console
     * log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the hypervisor.
     *
     * @return the bootDiagnostics value.
     */
    BootDiagnosticsInstanceView bootDiagnostics();

    /**
     * Gets the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * Gets the assignedHost property: Resource id of the dedicated host, on which the virtual machine is allocated
     * through automatic placement, when the virtual machine is associated with a dedicated host group that has
     * automatic placement enabled. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the assignedHost value.
     */
    String assignedHost();

    /**
     * Gets the placementGroupId property: The placement group in which the VM is running. If the VM is deallocated it
     * will not have a placementGroupId.
     *
     * @return the placementGroupId value.
     */
    String placementGroupId();

    /**
     * Gets the computerName property: Specifies the host OS name of the virtual machine. &lt;br&gt;&lt;br&gt; This name
     * cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; **Max-length (Windows):** 15 characters
     * &lt;br&gt;&lt;br&gt; **Max-length (Linux):** 64 characters. &lt;br&gt;&lt;br&gt; For naming conventions and
     * restrictions see [Azure infrastructure services implementation
     * guidelines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-infrastructure-subscription-accounts-guidelines?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json#1-naming-conventions).
     *
     * @return the computerName value.
     */
    String computerName();

    /**
     * Gets the osName property: The Operating System running on the hybrid machine.
     *
     * @return the osName value.
     */
    String osName();

    /**
     * Gets the osVersion property: The version of Operating System running on the hybrid machine.
     *
     * @return the osVersion value.
     */
    String osVersion();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine [V1, V2].
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the inner
     * com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner object.
     *
     * @return the inner object.
     */
    VirtualMachineScaleSetVMInstanceViewInner innerModel();
}
