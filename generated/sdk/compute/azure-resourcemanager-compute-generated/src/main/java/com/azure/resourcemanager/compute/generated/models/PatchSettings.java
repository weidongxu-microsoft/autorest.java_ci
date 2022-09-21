// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies settings related to VM Guest Patching on Windows. */
@Fluent
public final class PatchSettings {
    /*
     * Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines associated to virtual
     * machine scale set with OrchestrationMode as Flexible.<br /><br /> Possible values are:<br /><br /> **Manual** -
     * You  control the application of patches to a virtual machine. You do this by applying patches manually inside
     * the VM. In this mode, automatic updates are disabled; the property WindowsConfiguration.enableAutomaticUpdates
     * must be false<br /><br /> **AutomaticByOS** - The virtual machine will automatically be updated by the OS. The
     * property WindowsConfiguration.enableAutomaticUpdates must be true. <br /><br /> **AutomaticByPlatform** - the
     * virtual machine will automatically updated by the platform. The properties provisionVMAgent and
     * WindowsConfiguration.enableAutomaticUpdates must be true
     */
    @JsonProperty(value = "patchMode")
    private WindowsVMGuestPatchMode patchMode;

    /*
     * Enables customers to patch their Azure VMs without requiring a reboot. For enableHotpatching, the
     * 'provisionVMAgent' must be set to true and 'patchMode' must be set to 'AutomaticByPlatform'.
     */
    @JsonProperty(value = "enableHotpatching")
    private Boolean enableHotpatching;

    /*
     * Specifies the mode of VM Guest patch assessment for the IaaS virtual machine.<br /><br /> Possible values
     * are:<br /><br /> **ImageDefault** - You control the timing of patch assessments on a virtual machine.<br /><br
     * /> **AutomaticByPlatform** - The platform will trigger periodic patch assessments. The property provisionVMAgent
     * must be true.
     */
    @JsonProperty(value = "assessmentMode")
    private WindowsPatchAssessmentMode assessmentMode;

    /*
     * Specifies additional settings for patch mode AutomaticByPlatform in VM Guest Patching on Windows.
     */
    @JsonProperty(value = "automaticByPlatformSettings")
    private WindowsVMGuestPatchAutomaticByPlatformSettings automaticByPlatformSettings;

    /** Creates an instance of PatchSettings class. */
    public PatchSettings() {
    }

    /**
     * Get the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of patches to a virtual machine. You
     * do this by applying patches manually inside the VM. In this mode, automatic updates are disabled; the property
     * WindowsConfiguration.enableAutomaticUpdates must be false&lt;br /&gt;&lt;br /&gt; **AutomaticByOS** - The virtual
     * machine will automatically be updated by the OS. The property WindowsConfiguration.enableAutomaticUpdates must be
     * true. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - the virtual machine will automatically updated by the
     * platform. The properties provisionVMAgent and WindowsConfiguration.enableAutomaticUpdates must be true.
     *
     * @return the patchMode value.
     */
    public WindowsVMGuestPatchMode patchMode() {
        return this.patchMode;
    }

    /**
     * Set the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You control the application of patches to a virtual machine. You
     * do this by applying patches manually inside the VM. In this mode, automatic updates are disabled; the property
     * WindowsConfiguration.enableAutomaticUpdates must be false&lt;br /&gt;&lt;br /&gt; **AutomaticByOS** - The virtual
     * machine will automatically be updated by the OS. The property WindowsConfiguration.enableAutomaticUpdates must be
     * true. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - the virtual machine will automatically updated by the
     * platform. The properties provisionVMAgent and WindowsConfiguration.enableAutomaticUpdates must be true.
     *
     * @param patchMode the patchMode value to set.
     * @return the PatchSettings object itself.
     */
    public PatchSettings withPatchMode(WindowsVMGuestPatchMode patchMode) {
        this.patchMode = patchMode;
        return this;
    }

    /**
     * Get the enableHotpatching property: Enables customers to patch their Azure VMs without requiring a reboot. For
     * enableHotpatching, the 'provisionVMAgent' must be set to true and 'patchMode' must be set to
     * 'AutomaticByPlatform'.
     *
     * @return the enableHotpatching value.
     */
    public Boolean enableHotpatching() {
        return this.enableHotpatching;
    }

    /**
     * Set the enableHotpatching property: Enables customers to patch their Azure VMs without requiring a reboot. For
     * enableHotpatching, the 'provisionVMAgent' must be set to true and 'patchMode' must be set to
     * 'AutomaticByPlatform'.
     *
     * @param enableHotpatching the enableHotpatching value to set.
     * @return the PatchSettings object itself.
     */
    public PatchSettings withEnableHotpatching(Boolean enableHotpatching) {
        this.enableHotpatching = enableHotpatching;
        return this;
    }

    /**
     * Get the assessmentMode property: Specifies the mode of VM Guest patch assessment for the IaaS virtual
     * machine.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - You control the
     * timing of patch assessments on a virtual machine.&lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The platform
     * will trigger periodic patch assessments. The property provisionVMAgent must be true.
     *
     * @return the assessmentMode value.
     */
    public WindowsPatchAssessmentMode assessmentMode() {
        return this.assessmentMode;
    }

    /**
     * Set the assessmentMode property: Specifies the mode of VM Guest patch assessment for the IaaS virtual
     * machine.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - You control the
     * timing of patch assessments on a virtual machine.&lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The platform
     * will trigger periodic patch assessments. The property provisionVMAgent must be true.
     *
     * @param assessmentMode the assessmentMode value to set.
     * @return the PatchSettings object itself.
     */
    public PatchSettings withAssessmentMode(WindowsPatchAssessmentMode assessmentMode) {
        this.assessmentMode = assessmentMode;
        return this;
    }

    /**
     * Get the automaticByPlatformSettings property: Specifies additional settings for patch mode AutomaticByPlatform in
     * VM Guest Patching on Windows.
     *
     * @return the automaticByPlatformSettings value.
     */
    public WindowsVMGuestPatchAutomaticByPlatformSettings automaticByPlatformSettings() {
        return this.automaticByPlatformSettings;
    }

    /**
     * Set the automaticByPlatformSettings property: Specifies additional settings for patch mode AutomaticByPlatform in
     * VM Guest Patching on Windows.
     *
     * @param automaticByPlatformSettings the automaticByPlatformSettings value to set.
     * @return the PatchSettings object itself.
     */
    public PatchSettings withAutomaticByPlatformSettings(
        WindowsVMGuestPatchAutomaticByPlatformSettings automaticByPlatformSettings) {
        this.automaticByPlatformSettings = automaticByPlatformSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (automaticByPlatformSettings() != null) {
            automaticByPlatformSettings().validate();
        }
    }
}
