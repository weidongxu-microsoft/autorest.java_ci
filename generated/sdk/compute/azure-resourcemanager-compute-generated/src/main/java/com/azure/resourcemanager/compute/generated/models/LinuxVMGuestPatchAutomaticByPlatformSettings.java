// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies additional settings to be applied when patch mode AutomaticByPlatform is selected in Linux patch settings.
 */
@Fluent
public final class LinuxVMGuestPatchAutomaticByPlatformSettings {
    /*
     * Specifies the reboot setting for all AutomaticByPlatform patch installation operations.
     */
    @JsonProperty(value = "rebootSetting")
    private LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting;

    /*
     * Enables customer to schedule patching without accidental upgrades
     */
    @JsonProperty(value = "bypassPlatformSafetyChecksOnUserSchedule")
    private Boolean bypassPlatformSafetyChecksOnUserSchedule;

    /**
     * Creates an instance of LinuxVMGuestPatchAutomaticByPlatformSettings class.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings() {
    }

    /**
     * Get the rebootSetting property: Specifies the reboot setting for all AutomaticByPlatform patch installation operations.
     * 
     * @return the rebootSetting value.
     */
    public LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting() {
        return this.rebootSetting;
    }

    /**
     * Set the rebootSetting property: Specifies the reboot setting for all AutomaticByPlatform patch installation operations.
     * 
     * @param rebootSetting the rebootSetting value to set.
     * @return the LinuxVMGuestPatchAutomaticByPlatformSettings object itself.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings
        withRebootSetting(LinuxVMGuestPatchAutomaticByPlatformRebootSetting rebootSetting) {
        this.rebootSetting = rebootSetting;
        return this;
    }

    /**
     * Get the bypassPlatformSafetyChecksOnUserSchedule property: Enables customer to schedule patching without accidental upgrades.
     * 
     * @return the bypassPlatformSafetyChecksOnUserSchedule value.
     */
    public Boolean bypassPlatformSafetyChecksOnUserSchedule() {
        return this.bypassPlatformSafetyChecksOnUserSchedule;
    }

    /**
     * Set the bypassPlatformSafetyChecksOnUserSchedule property: Enables customer to schedule patching without accidental upgrades.
     * 
     * @param bypassPlatformSafetyChecksOnUserSchedule the bypassPlatformSafetyChecksOnUserSchedule value to set.
     * @return the LinuxVMGuestPatchAutomaticByPlatformSettings object itself.
     */
    public LinuxVMGuestPatchAutomaticByPlatformSettings
        withBypassPlatformSafetyChecksOnUserSchedule(Boolean bypassPlatformSafetyChecksOnUserSchedule) {
        this.bypassPlatformSafetyChecksOnUserSchedule = bypassPlatformSafetyChecksOnUserSchedule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
