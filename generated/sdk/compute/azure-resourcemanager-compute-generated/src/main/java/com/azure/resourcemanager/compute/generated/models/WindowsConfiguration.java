// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies Windows operating system settings on the virtual machine.
 */
@Fluent
public final class WindowsConfiguration {
    /*
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. When this property is not specified in the request body, it is set to true by default. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /*
     * Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     */
    @JsonProperty(value = "enableAutomaticUpdates")
    private Boolean enableAutomaticUpdates;

    /*
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     */
    @JsonProperty(value = "additionalUnattendContent")
    private List<AdditionalUnattendContent> additionalUnattendContent;

    /*
     * [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     */
    @JsonProperty(value = "patchSettings")
    private PatchSettings patchSettings;

    /*
     * Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     */
    @JsonProperty(value = "winRM")
    private WinRMConfiguration winRM;

    /*
     * Indicates whether VMAgent Platform Updates is enabled for the Windows virtual machine. Default value is false.
     */
    @JsonProperty(value = "enableVMAgentPlatformUpdates")
    private Boolean enableVMAgentPlatformUpdates;

    /**
     * Creates an instance of WindowsConfiguration class.
     */
    public WindowsConfiguration() {
    }

    /**
     * Get the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual machine. When this property is not specified in the request body, it is set to true by default. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     * @return the provisionVMAgent value.
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual machine. When this property is not specified in the request body, it is set to true by default. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     * @param provisionVMAgent the provisionVMAgent value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Get the enableAutomaticUpdates property: Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     * @return the enableAutomaticUpdates value.
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates property: Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        return this;
    }

    /**
     * Get the timeZone property: Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     * @param timeZone the timeZone value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the additionalUnattendContent property: Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     * @return the additionalUnattendContent value.
     */
    public List<AdditionalUnattendContent> additionalUnattendContent() {
        return this.additionalUnattendContent;
    }

    /**
     * Set the additionalUnattendContent property: Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     * @param additionalUnattendContent the additionalUnattendContent value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration
        withAdditionalUnattendContent(List<AdditionalUnattendContent> additionalUnattendContent) {
        this.additionalUnattendContent = additionalUnattendContent;
        return this;
    }

    /**
     * Get the patchSettings property: [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     * @return the patchSettings value.
     */
    public PatchSettings patchSettings() {
        return this.patchSettings;
    }

    /**
     * Set the patchSettings property: [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     * @param patchSettings the patchSettings value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withPatchSettings(PatchSettings patchSettings) {
        this.patchSettings = patchSettings;
        return this;
    }

    /**
     * Get the winRM property: Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     * @return the winRM value.
     */
    public WinRMConfiguration winRM() {
        return this.winRM;
    }

    /**
     * Set the winRM property: Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     * @param winRM the winRM value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withWinRM(WinRMConfiguration winRM) {
        this.winRM = winRM;
        return this;
    }

    /**
     * Get the enableVMAgentPlatformUpdates property: Indicates whether VMAgent Platform Updates is enabled for the Windows virtual machine. Default value is false.
     * 
     * @return the enableVMAgentPlatformUpdates value.
     */
    public Boolean enableVMAgentPlatformUpdates() {
        return this.enableVMAgentPlatformUpdates;
    }

    /**
     * Set the enableVMAgentPlatformUpdates property: Indicates whether VMAgent Platform Updates is enabled for the Windows virtual machine. Default value is false.
     * 
     * @param enableVMAgentPlatformUpdates the enableVMAgentPlatformUpdates value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableVMAgentPlatformUpdates(Boolean enableVMAgentPlatformUpdates) {
        this.enableVMAgentPlatformUpdates = enableVMAgentPlatformUpdates;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (additionalUnattendContent() != null) {
            additionalUnattendContent().forEach(e -> e.validate());
        }
        if (patchSettings() != null) {
            patchSettings().validate();
        }
        if (winRM() != null) {
            winRM().validate();
        }
    }
}
