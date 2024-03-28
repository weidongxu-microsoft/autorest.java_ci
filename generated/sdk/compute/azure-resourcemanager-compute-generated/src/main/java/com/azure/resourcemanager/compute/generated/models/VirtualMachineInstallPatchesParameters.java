// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for InstallPatches as directly received by the API.
 */
@Fluent
public final class VirtualMachineInstallPatchesParameters {
    /*
     * Specifies the maximum amount of time that the operation will run. It must be an ISO 8601-compliant duration string such as PT4H (4 hours)
     */
    @JsonProperty(value = "maximumDuration")
    private String maximumDuration;

    /*
     * Defines when it is acceptable to reboot a VM during a software update operation.
     */
    @JsonProperty(value = "rebootSetting", required = true)
    private VMGuestPatchRebootSetting rebootSetting;

    /*
     * Input for InstallPatches on a Windows VM, as directly received by the API
     */
    @JsonProperty(value = "windowsParameters")
    private WindowsParameters windowsParameters;

    /*
     * Input for InstallPatches on a Linux VM, as directly received by the API
     */
    @JsonProperty(value = "linuxParameters")
    private LinuxParameters linuxParameters;

    /**
     * Creates an instance of VirtualMachineInstallPatchesParameters class.
     */
    public VirtualMachineInstallPatchesParameters() {
    }

    /**
     * Get the maximumDuration property: Specifies the maximum amount of time that the operation will run. It must be an
     * ISO 8601-compliant duration string such as PT4H (4 hours).
     * 
     * @return the maximumDuration value.
     */
    public String maximumDuration() {
        return this.maximumDuration;
    }

    /**
     * Set the maximumDuration property: Specifies the maximum amount of time that the operation will run. It must be an
     * ISO 8601-compliant duration string such as PT4H (4 hours).
     * 
     * @param maximumDuration the maximumDuration value to set.
     * @return the VirtualMachineInstallPatchesParameters object itself.
     */
    public VirtualMachineInstallPatchesParameters withMaximumDuration(String maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * Get the rebootSetting property: Defines when it is acceptable to reboot a VM during a software update operation.
     * 
     * @return the rebootSetting value.
     */
    public VMGuestPatchRebootSetting rebootSetting() {
        return this.rebootSetting;
    }

    /**
     * Set the rebootSetting property: Defines when it is acceptable to reboot a VM during a software update operation.
     * 
     * @param rebootSetting the rebootSetting value to set.
     * @return the VirtualMachineInstallPatchesParameters object itself.
     */
    public VirtualMachineInstallPatchesParameters withRebootSetting(VMGuestPatchRebootSetting rebootSetting) {
        this.rebootSetting = rebootSetting;
        return this;
    }

    /**
     * Get the windowsParameters property: Input for InstallPatches on a Windows VM, as directly received by the API.
     * 
     * @return the windowsParameters value.
     */
    public WindowsParameters windowsParameters() {
        return this.windowsParameters;
    }

    /**
     * Set the windowsParameters property: Input for InstallPatches on a Windows VM, as directly received by the API.
     * 
     * @param windowsParameters the windowsParameters value to set.
     * @return the VirtualMachineInstallPatchesParameters object itself.
     */
    public VirtualMachineInstallPatchesParameters withWindowsParameters(WindowsParameters windowsParameters) {
        this.windowsParameters = windowsParameters;
        return this;
    }

    /**
     * Get the linuxParameters property: Input for InstallPatches on a Linux VM, as directly received by the API.
     * 
     * @return the linuxParameters value.
     */
    public LinuxParameters linuxParameters() {
        return this.linuxParameters;
    }

    /**
     * Set the linuxParameters property: Input for InstallPatches on a Linux VM, as directly received by the API.
     * 
     * @param linuxParameters the linuxParameters value to set.
     * @return the VirtualMachineInstallPatchesParameters object itself.
     */
    public VirtualMachineInstallPatchesParameters withLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rebootSetting() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rebootSetting in model VirtualMachineInstallPatchesParameters"));
        }
        if (windowsParameters() != null) {
            windowsParameters().validate();
        }
        if (linuxParameters() != null) {
            linuxParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineInstallPatchesParameters.class);
}
