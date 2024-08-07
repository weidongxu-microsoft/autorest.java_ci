// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of VirtualMachineScaleSetVM.
 */
public interface VirtualMachineScaleSetVM {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the instanceId property: The virtual machine instance ID.
     * 
     * @return the instanceId value.
     */
    String instanceId();

    /**
     * Gets the sku property: The virtual machine SKU.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the plan property: Specifies information about the marketplace image used to create the virtual machine.
     * This element is only used for marketplace images. Before you can use a marketplace image from an API, you must
     * enable the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and
     * then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     * 
     * @return the plan value.
     */
    Plan plan();

    /**
     * Gets the resources property: The virtual machine child extension resources.
     * 
     * @return the resources value.
     */
    List<VirtualMachineExtension> resources();

    /**
     * Gets the zones property: The virtual machine zones.
     * 
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the identity property: The identity of the virtual machine, if configured.
     * 
     * @return the identity value.
     */
    VirtualMachineIdentity identity();

    /**
     * Gets the etag property: Etag is property returned in Update/Get response of the VMSS VM, so that customer can
     * supply it in the header to ensure optimistic updates.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the latestModelApplied property: Specifies whether the latest model has been applied to the virtual machine.
     * 
     * @return the latestModelApplied value.
     */
    Boolean latestModelApplied();

    /**
     * Gets the vmId property: Azure VM unique ID.
     * 
     * @return the vmId value.
     */
    String vmId();

    /**
     * Gets the instanceView property: The virtual machine instance view.
     * 
     * @return the instanceView value.
     */
    VirtualMachineScaleSetVMInstanceView instanceView();

    /**
     * Gets the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     * 
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * Gets the storageProfile property: Specifies the storage settings for the virtual machine disks.
     * 
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * Gets the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     * 
     * @return the additionalCapabilities value.
     */
    AdditionalCapabilities additionalCapabilities();

    /**
     * Gets the osProfile property: Specifies the operating system settings for the virtual machine.
     * 
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * Gets the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     * 
     * @return the securityProfile value.
     */
    SecurityProfile securityProfile();

    /**
     * Gets the networkProfile property: Specifies the network interfaces of the virtual machine.
     * 
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * Gets the networkProfileConfiguration property: Specifies the network profile configuration of the virtual
     * machine.
     * 
     * @return the networkProfileConfiguration value.
     */
    VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration();

    /**
     * Gets the diagnosticsProfile property: Specifies the boot diagnostic settings state. Minimum api-version:
     * 2015-06-15.
     * 
     * @return the diagnosticsProfile value.
     */
    DiagnosticsProfile diagnosticsProfile();

    /**
     * Gets the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). For more information on
     * Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates). Currently, a VM can only be
     * added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     * @return the availabilitySet value.
     */
    SubResource availabilitySet();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     * 
     * @return the licenseType value.
     */
    String licenseType();

    /**
     * Gets the modelDefinitionApplied property: Specifies whether the model applied to the virtual machine is the model
     * of the virtual machine scale set or the customized model for the virtual machine.
     * 
     * @return the modelDefinitionApplied value.
     */
    String modelDefinitionApplied();

    /**
     * Gets the protectionPolicy property: Specifies the protection policy of the virtual machine.
     * 
     * @return the protectionPolicy value.
     */
    VirtualMachineScaleSetVMProtectionPolicy protectionPolicy();

    /**
     * Gets the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. Minimum api-version: 2021-03-01.
     * 
     * @return the userData value.
     */
    String userData();

    /**
     * Gets the timeCreated property: Specifies the time at which the Virtual Machine resource was created.
     * 
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner object.
     * 
     * @return the inner object.
     */
    VirtualMachineScaleSetVMInner innerModel();
}
