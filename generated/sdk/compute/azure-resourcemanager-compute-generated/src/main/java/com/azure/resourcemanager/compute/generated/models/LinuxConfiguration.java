// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies the Linux operating system settings on the virtual machine. For a list of supported Linux distributions,
 * see [Linux on Azure-Endorsed
 * Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
 */
@Fluent
public final class LinuxConfiguration implements JsonSerializable<LinuxConfiguration> {
    /*
     * Specifies whether password authentication should be disabled.
     */
    private Boolean disablePasswordAuthentication;

    /*
     * Specifies the ssh key configuration for a Linux OS.
     */
    private SshConfiguration ssh;

    /*
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. When this property is not
     * specified in the request body, default behavior is to set it to true. This will ensure that VM Agent is installed
     * on the VM so that extensions can be added to the VM later.
     */
    private Boolean provisionVMAgent;

    /*
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     */
    private LinuxPatchSettings patchSettings;

    /*
     * Indicates whether VMAgent Platform Updates is enabled for the Linux virtual machine. Default value is false.
     */
    private Boolean enableVMAgentPlatformUpdates;

    /**
     * Creates an instance of LinuxConfiguration class.
     */
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
     * machine. When this property is not specified in the request body, default behavior is to set it to true. This
     * will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     * @return the provisionVMAgent value.
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. When this property is not specified in the request body, default behavior is to set it to true. This
     * will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("disablePasswordAuthentication", this.disablePasswordAuthentication);
        jsonWriter.writeJsonField("ssh", this.ssh);
        jsonWriter.writeBooleanField("provisionVMAgent", this.provisionVMAgent);
        jsonWriter.writeJsonField("patchSettings", this.patchSettings);
        jsonWriter.writeBooleanField("enableVMAgentPlatformUpdates", this.enableVMAgentPlatformUpdates);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinuxConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinuxConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinuxConfiguration.
     */
    public static LinuxConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinuxConfiguration deserializedLinuxConfiguration = new LinuxConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("disablePasswordAuthentication".equals(fieldName)) {
                    deserializedLinuxConfiguration.disablePasswordAuthentication
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("ssh".equals(fieldName)) {
                    deserializedLinuxConfiguration.ssh = SshConfiguration.fromJson(reader);
                } else if ("provisionVMAgent".equals(fieldName)) {
                    deserializedLinuxConfiguration.provisionVMAgent = reader.getNullable(JsonReader::getBoolean);
                } else if ("patchSettings".equals(fieldName)) {
                    deserializedLinuxConfiguration.patchSettings = LinuxPatchSettings.fromJson(reader);
                } else if ("enableVMAgentPlatformUpdates".equals(fieldName)) {
                    deserializedLinuxConfiguration.enableVMAgentPlatformUpdates
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinuxConfiguration;
        });
    }
}
