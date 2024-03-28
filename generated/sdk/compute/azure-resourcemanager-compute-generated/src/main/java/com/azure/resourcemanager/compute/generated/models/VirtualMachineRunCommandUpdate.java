// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Describes a Virtual Machine run command.
 */
@Fluent
public final class VirtualMachineRunCommandUpdate extends UpdateResource {
    /*
     * Describes the properties of a Virtual Machine run command.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineRunCommandProperties innerProperties;

    /**
     * Creates an instance of VirtualMachineRunCommandUpdate class.
     */
    public VirtualMachineRunCommandUpdate() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine run command.
     * 
     * @return the innerProperties value.
     */
    private VirtualMachineRunCommandProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualMachineRunCommandUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the source property: The source of the run command script.
     * 
     * @return the source value.
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The source of the run command script.
     * 
     * @param source the source value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withSource(VirtualMachineRunCommandScriptSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     * 
     * @return the parameters value.
     */
    public List<RunCommandInputParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The parameters used by the script.
     * 
     * @param parameters the parameters value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withParameters(List<RunCommandInputParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the protectedParameters property: The parameters used by the script.
     * 
     * @return the protectedParameters value.
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedParameters();
    }

    /**
     * Set the protectedParameters property: The parameters used by the script.
     * 
     * @param protectedParameters the protectedParameters value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withProtectedParameters(protectedParameters);
        return this;
    }

    /**
     * Get the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     * 
     * @return the asyncExecution value.
     */
    public Boolean asyncExecution() {
        return this.innerProperties() == null ? null : this.innerProperties().asyncExecution();
    }

    /**
     * Set the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     * 
     * @param asyncExecution the asyncExecution value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withAsyncExecution(Boolean asyncExecution) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withAsyncExecution(asyncExecution);
        return this;
    }

    /**
     * Get the runAsUser property: Specifies the user account on the VM when executing the run command.
     * 
     * @return the runAsUser value.
     */
    public String runAsUser() {
        return this.innerProperties() == null ? null : this.innerProperties().runAsUser();
    }

    /**
     * Set the runAsUser property: Specifies the user account on the VM when executing the run command.
     * 
     * @param runAsUser the runAsUser value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsUser(String runAsUser) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withRunAsUser(runAsUser);
        return this;
    }

    /**
     * Get the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     * 
     * @return the runAsPassword value.
     */
    public String runAsPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().runAsPassword();
    }

    /**
     * Set the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     * 
     * @param runAsPassword the runAsPassword value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withRunAsPassword(String runAsPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withRunAsPassword(runAsPassword);
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout in seconds to execute the run command.
     * 
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().timeoutInSeconds();
    }

    /**
     * Set the timeoutInSeconds property: The timeout in seconds to execute the run command.
     * 
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withTimeoutInSeconds(Integer timeoutInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * Get the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded. Use
     * a SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer outputBlobManagedIdentity parameter.
     * 
     * @return the outputBlobUri value.
     */
    public String outputBlobUri() {
        return this.innerProperties() == null ? null : this.innerProperties().outputBlobUri();
    }

    /**
     * Set the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded. Use
     * a SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer outputBlobManagedIdentity parameter.
     * 
     * @param outputBlobUri the outputBlobUri value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withOutputBlobUri(String outputBlobUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withOutputBlobUri(outputBlobUri);
        return this;
    }

    /**
     * Get the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded. Use a
     * SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer errorBlobManagedIdentity parameter.
     * 
     * @return the errorBlobUri value.
     */
    public String errorBlobUri() {
        return this.innerProperties() == null ? null : this.innerProperties().errorBlobUri();
    }

    /**
     * Set the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded. Use a
     * SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer errorBlobManagedIdentity parameter.
     * 
     * @param errorBlobUri the errorBlobUri value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withErrorBlobUri(String errorBlobUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withErrorBlobUri(errorBlobUri);
        return this;
    }

    /**
     * Get the outputBlobManagedIdentity property: User-assigned managed identity that has access to outputBlobUri
     * storage blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given
     * access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned
     * identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @return the outputBlobManagedIdentity value.
     */
    public RunCommandManagedIdentity outputBlobManagedIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().outputBlobManagedIdentity();
    }

    /**
     * Set the outputBlobManagedIdentity property: User-assigned managed identity that has access to outputBlobUri
     * storage blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given
     * access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned
     * identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @param outputBlobManagedIdentity the outputBlobManagedIdentity value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate
        withOutputBlobManagedIdentity(RunCommandManagedIdentity outputBlobManagedIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withOutputBlobManagedIdentity(outputBlobManagedIdentity);
        return this;
    }

    /**
     * Get the errorBlobManagedIdentity property: User-assigned managed identity that has access to errorBlobUri storage
     * blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given access
     * to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned identity, make
     * sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @return the errorBlobManagedIdentity value.
     */
    public RunCommandManagedIdentity errorBlobManagedIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().errorBlobManagedIdentity();
    }

    /**
     * Set the errorBlobManagedIdentity property: User-assigned managed identity that has access to errorBlobUri storage
     * blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given access
     * to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned identity, make
     * sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     * 
     * @param errorBlobManagedIdentity the errorBlobManagedIdentity value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate
        withErrorBlobManagedIdentity(RunCommandManagedIdentity errorBlobManagedIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withErrorBlobManagedIdentity(errorBlobManagedIdentity);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response. If
     * treatFailureAsDeploymentFailure set to true, any failure in the script will fail the deployment and
     * ProvisioningState will be marked as Failed. If treatFailureAsDeploymentFailure set to false, ProvisioningState
     * would only reflect whether the run command was run or not by the extensions platform, it would not indicate
     * whether script failed in case of script failures. See instance view of run command in case of script failures to
     * see executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The virtual machine run command instance view.
     * 
     * @return the instanceView value.
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the script will fail
     * the deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would only
     * reflect whether the run command was run or not by the extensions platform, it would not indicate whether script
     * failed in case of script failures. See instance view of run command in case of script failures to see
     * executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     * 
     * @return the treatFailureAsDeploymentFailure value.
     */
    public Boolean treatFailureAsDeploymentFailure() {
        return this.innerProperties() == null ? null : this.innerProperties().treatFailureAsDeploymentFailure();
    }

    /**
     * Set the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the script will fail
     * the deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would only
     * reflect whether the run command was run or not by the extensions platform, it would not indicate whether script
     * failed in case of script failures. See instance view of run command in case of script failures to see
     * executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     * 
     * @param treatFailureAsDeploymentFailure the treatFailureAsDeploymentFailure value to set.
     * @return the VirtualMachineRunCommandUpdate object itself.
     */
    public VirtualMachineRunCommandUpdate withTreatFailureAsDeploymentFailure(Boolean treatFailureAsDeploymentFailure) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withTreatFailureAsDeploymentFailure(treatFailureAsDeploymentFailure);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
