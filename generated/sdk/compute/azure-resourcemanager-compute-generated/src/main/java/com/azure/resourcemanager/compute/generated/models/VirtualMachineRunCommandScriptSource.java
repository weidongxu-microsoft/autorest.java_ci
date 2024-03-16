// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the script sources for run command. Use only one of script, scriptUri, commandId.
 */
@Fluent
public final class VirtualMachineRunCommandScriptSource {
    /*
     * Specifies the script content to be executed on the VM.
     */
    @JsonProperty(value = "script")
    private String script;

    /*
     * Specifies the script download location. It can be either SAS URI of an Azure storage blob with read access or public URI.
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /*
     * Specifies a commandId of predefined built-in script.
     */
    @JsonProperty(value = "commandId")
    private String commandId;

    /*
     * User-assigned managed identity that has access to scriptUri in case of Azure storage blob. Use an empty object in case of system-assigned identity. Make sure the Azure storage blob exists, and managed identity has been given access to blob's container with 'Storage Blob Data Reader' role assignment. In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     */
    @JsonProperty(value = "scriptUriManagedIdentity")
    private RunCommandManagedIdentity scriptUriManagedIdentity;

    /**
     * Creates an instance of VirtualMachineRunCommandScriptSource class.
     */
    public VirtualMachineRunCommandScriptSource() {
    }

    /**
     * Get the script property: Specifies the script content to be executed on the VM.
     * 
     * @return the script value.
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script property: Specifies the script content to be executed on the VM.
     * 
     * @param script the script value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the scriptUri property: Specifies the script download location. It can be either SAS URI of an Azure storage blob with read access or public URI.
     * 
     * @return the scriptUri value.
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set the scriptUri property: Specifies the script download location. It can be either SAS URI of an Azure storage blob with read access or public URI.
     * 
     * @param scriptUri the scriptUri value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get the commandId property: Specifies a commandId of predefined built-in script.
     * 
     * @return the commandId value.
     */
    public String commandId() {
        return this.commandId;
    }

    /**
     * Set the commandId property: Specifies a commandId of predefined built-in script.
     * 
     * @param commandId the commandId value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Get the scriptUriManagedIdentity property: User-assigned managed identity that has access to scriptUri in case of Azure storage blob. Use an empty object in case of system-assigned identity. Make sure the Azure storage blob exists, and managed identity has been given access to blob's container with 'Storage Blob Data Reader' role assignment. In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @return the scriptUriManagedIdentity value.
     */
    public RunCommandManagedIdentity scriptUriManagedIdentity() {
        return this.scriptUriManagedIdentity;
    }

    /**
     * Set the scriptUriManagedIdentity property: User-assigned managed identity that has access to scriptUri in case of Azure storage blob. Use an empty object in case of system-assigned identity. Make sure the Azure storage blob exists, and managed identity has been given access to blob's container with 'Storage Blob Data Reader' role assignment. In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @param scriptUriManagedIdentity the scriptUriManagedIdentity value to set.
     * @return the VirtualMachineRunCommandScriptSource object itself.
     */
    public VirtualMachineRunCommandScriptSource
        withScriptUriManagedIdentity(RunCommandManagedIdentity scriptUriManagedIdentity) {
        this.scriptUriManagedIdentity = scriptUriManagedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scriptUriManagedIdentity() != null) {
            scriptUriManagedIdentity().validate();
        }
    }
}
