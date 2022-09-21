// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the Linux operating system settings on the virtual machine. &lt;br&gt;&lt;br&gt;For a list of supported
 * Linux distributions, see [Linux on Azure-Endorsed
 * Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
 */
@Fluent
public final class LinuxConfiguration {
    /*
     * Specifies whether password authentication should be disabled.
     */
    @JsonProperty(value = "disablePasswordAuthentication")
    private Boolean disablePasswordAuthentication;

    /*
     * Specifies the ssh key configuration for a Linux OS.
     */
    @JsonProperty(value = "ssh")
    private SshConfiguration ssh;

    /*
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this
     * property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM
     * Agent is installed on the VM so that extensions can be added to the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /*
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     */
    @JsonProperty(value = "patchSettings")
    private LinuxPatchSettings patchSettings;

    /*
     * Indicates whether VMAgent Platform Updates is enabled for the Linux virtual machine. Default value is false.
     */
    @JsonProperty(value = "enableVMAgentPlatformUpdates")
    private Boolean enableVMAgentPlatformUpdates;

    /** Creates an instance of LinuxConfiguration class. */
    public LinuxConfiguration() {
    }

    /**
     * Get the disablePasswordAuthentication property: Specifies whether password authentication should be disabled.
     *
     * @return the disablePasswordAuthentication value.
     */
    public Boolean disablePasswordAuthentication() {
        return this.disablePasswordAuthentication;
    }

    /**
     * Set the disablePasswordAuthentication property: Specifies whether password authentication should be disabled.
     *
     * @param disablePasswordAuthentication the disablePasswordAuthentication value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withDisablePasswordAuthentication(Boolean disablePasswordAuthentication) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        return this;
    }

    /**
     * Get the ssh property: Specifies the ssh key configuration for a Linux OS.
     *
     * @return the ssh value.
     */
    public SshConfiguration ssh() {
        return this.ssh;
    }

    /**
     * Set the ssh property: Specifies the ssh key configuration for a Linux OS.
     *
     * @param ssh the ssh value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withSsh(SshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Get the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @return the provisionVMAgent value.
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @param provisionVMAgent the provisionVMAgent value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Get the patchSettings property: [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     *
     * @return the patchSettings value.
     */
    public LinuxPatchSettings patchSettings() {
        return this.patchSettings;
    }

    /**
     * Set the patchSettings property: [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     *
     * @param patchSettings the patchSettings value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withPatchSettings(LinuxPatchSettings patchSettings) {
        this.patchSettings = patchSettings;
        return this;
    }

    /**
     * Get the enableVMAgentPlatformUpdates property: Indicates whether VMAgent Platform Updates is enabled for the
     * Linux virtual machine. Default value is false.
     *
     * @return the enableVMAgentPlatformUpdates value.
     */
    public Boolean enableVMAgentPlatformUpdates() {
        return this.enableVMAgentPlatformUpdates;
    }

    /**
     * Set the enableVMAgentPlatformUpdates property: Indicates whether VMAgent Platform Updates is enabled for the
     * Linux virtual machine. Default value is false.
     *
     * @param enableVMAgentPlatformUpdates the enableVMAgentPlatformUpdates value to set.
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withEnableVMAgentPlatformUpdates(Boolean enableVMAgentPlatformUpdates) {
        this.enableVMAgentPlatformUpdates = enableVMAgentPlatformUpdates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ssh() != null) {
            ssh().validate();
        }
        if (patchSettings() != null) {
            patchSettings().validate();
        }
    }
}
