// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMNetworkProfileConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProtectionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes the properties of a virtual machine scale set virtual machine.
 */
@Fluent
public final class VirtualMachineScaleSetVMPropertiesInner {
    /*
     * Specifies whether the latest model has been applied to the virtual machine.
     */
    @JsonProperty(value = "latestModelApplied", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean latestModelApplied;

    /*
     * Azure VM unique ID.
     */
    @JsonProperty(value = "vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /*
     * The virtual machine instance view.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetVMInstanceViewInner instanceView;

    /*
     * Specifies the hardware settings for the virtual machine.
     */
    @JsonProperty(value = "hardwareProfile")
    private HardwareProfile hardwareProfile;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance:
     * whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage
     * account type.
     */
    @JsonProperty(value = "additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the operating system settings for the virtual machine.
     */
    @JsonProperty(value = "osProfile")
    private OSProfile osProfile;

    /*
     * Specifies the Security related profile settings for the virtual machine.
     */
    @JsonProperty(value = "securityProfile")
    private SecurityProfile securityProfile;

    /*
     * Specifies the network interfaces of the virtual machine.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Specifies the network profile configuration of the virtual machine.
     */
    @JsonProperty(value = "networkProfileConfiguration")
    private VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration;

    /*
     * Specifies the boot diagnostic settings state. Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual
     * machines specified in the same availability set are allocated to different nodes to maximize availability. For
     * more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). For more information on
     * Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates). Currently, a VM can only be
     * added to availability set at creation time. An existing VM cannot be added to an availability set.
     */
    @JsonProperty(value = "availabilitySet")
    private SubResource availabilitySet;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for
     * Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values
     * for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For
     * more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure
     * Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum
     * api-version: 2015-06-15
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * Specifies whether the model applied to the virtual machine is the model of the virtual machine scale set or the
     * customized model for the virtual machine.
     */
    @JsonProperty(value = "modelDefinitionApplied", access = JsonProperty.Access.WRITE_ONLY)
    private String modelDefinitionApplied;

    /*
     * Specifies the protection policy of the virtual machine.
     */
    @JsonProperty(value = "protectionPolicy")
    private VirtualMachineScaleSetVMProtectionPolicy protectionPolicy;

    /*
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here.
     * <br><br>Minimum api-version: 2021-03-01
     */
    @JsonProperty(value = "userData")
    private String userData;

    /*
     * Specifies the time at which the Virtual Machine resource was created.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /**
     * Creates an instance of VirtualMachineScaleSetVMPropertiesInner class.
     */
    public VirtualMachineScaleSetVMPropertiesInner() {
    }

    /**
     * Get the latestModelApplied property: Specifies whether the latest model has been applied to the virtual machine.
     * 
     * @return the latestModelApplied value.
     */
    public Boolean latestModelApplied() {
        return this.latestModelApplied;
    }

    /**
     * Get the vmId property: Azure VM unique ID.
     * 
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the instanceView property: The virtual machine instance view.
     * 
     * @return the instanceView value.
     */
    public VirtualMachineScaleSetVMInstanceViewInner instanceView() {
        return this.instanceView;
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     * 
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     * 
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     * 
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     * 
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine in the scale set. For instance: whether the virtual machine has the capability to support attaching
     * managed data disks with UltraSSD_LRS storage account type.
     * 
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner
        withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the virtual machine.
     * 
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machine.
     * 
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network interfaces of the virtual machine.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies the network interfaces of the virtual machine.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the networkProfileConfiguration property: Specifies the network profile configuration of the virtual
     * machine.
     * 
     * @return the networkProfileConfiguration value.
     */
    public VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration() {
        return this.networkProfileConfiguration;
    }

    /**
     * Set the networkProfileConfiguration property: Specifies the network profile configuration of the virtual
     * machine.
     * 
     * @param networkProfileConfiguration the networkProfileConfiguration value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withNetworkProfileConfiguration(
        VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration) {
        this.networkProfileConfiguration = networkProfileConfiguration;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. Minimum api-version:
     * 2015-06-15.
     * 
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. Minimum api-version:
     * 2015-06-15.
     * 
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). For more information on
     * Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates). Currently, a VM can only be
     * added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     * @return the availabilitySet value.
     */
    public SubResource availabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). For more information on
     * Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates). Currently, a VM can only be
     * added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     * @param availabilitySet the availabilitySet value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt;
     * Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server
     * operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE)
     * &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     * 
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt;
     * Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server
     * operating system are: &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE)
     * &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     * 
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the modelDefinitionApplied property: Specifies whether the model applied to the virtual machine is the model
     * of the virtual machine scale set or the customized model for the virtual machine.
     * 
     * @return the modelDefinitionApplied value.
     */
    public String modelDefinitionApplied() {
        return this.modelDefinitionApplied;
    }

    /**
     * Get the protectionPolicy property: Specifies the protection policy of the virtual machine.
     * 
     * @return the protectionPolicy value.
     */
    public VirtualMachineScaleSetVMProtectionPolicy protectionPolicy() {
        return this.protectionPolicy;
    }

    /**
     * Set the protectionPolicy property: Specifies the protection policy of the virtual machine.
     * 
     * @param protectionPolicy the protectionPolicy value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner
        withProtectionPolicy(VirtualMachineScaleSetVMProtectionPolicy protectionPolicy) {
        this.protectionPolicy = protectionPolicy;
        return this;
    }

    /**
     * Get the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     * 
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     * 
     * @param userData the userData value to set.
     * @return the VirtualMachineScaleSetVMPropertiesInner object itself.
     */
    public VirtualMachineScaleSetVMPropertiesInner withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Virtual Machine resource was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (instanceView() != null) {
            instanceView().validate();
        }
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (additionalCapabilities() != null) {
            additionalCapabilities().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (networkProfileConfiguration() != null) {
            networkProfileConfiguration().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (protectionPolicy() != null) {
            protectionPolicy().validate();
        }
    }
}
