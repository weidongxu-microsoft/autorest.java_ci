// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.generated.models.RunCommandManagedIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommandScriptSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the properties of a Virtual Machine run command. */
@Fluent
public final class VirtualMachineRunCommandProperties {
    /*
     * The source of the run command script.
     */
    @JsonProperty(value = "source")
    private VirtualMachineRunCommandScriptSource source;

    /*
     * The parameters used by the script.
     */
    @JsonProperty(value = "parameters")
    private List<RunCommandInputParameter> parameters;

    /*
     * The parameters used by the script.
     */
    @JsonProperty(value = "protectedParameters")
    private List<RunCommandInputParameter> protectedParameters;

    /*
     * Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script
     * to complete.
     */
    @JsonProperty(value = "asyncExecution")
    private Boolean asyncExecution;

    /*
     * Specifies the user account on the VM when executing the run command.
     */
    @JsonProperty(value = "runAsUser")
    private String runAsUser;

    /*
     * Specifies the user account password on the VM when executing the run command.
     */
    @JsonProperty(value = "runAsPassword")
    private String runAsPassword;

    /*
     * The timeout in seconds to execute the run command.
     */
    @JsonProperty(value = "timeoutInSeconds")
    private Integer timeoutInSeconds;

    /*
     * Specifies the Azure storage blob where script output stream will be uploaded. Use a SAS URI with read, append,
     * create, write access OR use managed identity to provide the VM access to the blob. Refer
     * outputBlobManagedIdentity parameter.
     */
    @JsonProperty(value = "outputBlobUri")
    private String outputBlobUri;

    /*
     * Specifies the Azure storage blob where script error stream will be uploaded. Use a SAS URI with read, append,
     * create, write access OR use managed identity to provide the VM access to the blob. Refer
     * errorBlobManagedIdentity parameter.
     */
    @JsonProperty(value = "errorBlobUri")
    private String errorBlobUri;

    /*
     * User-assigned managed identity that has access to outputBlobUri storage blob. Use an empty object in case of
     * system-assigned identity. Make sure managed identity has been given access to blob's container with 'Storage
     * Blob Data Contributor' role assignment. In case of user-assigned identity, make sure you add it under VM's
     * identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and
     * https://aka.ms/RunCommandManaged
     */
    @JsonProperty(value = "outputBlobManagedIdentity")
    private RunCommandManagedIdentity outputBlobManagedIdentity;

    /*
     * User-assigned managed identity that has access to errorBlobUri storage blob. Use an empty object in case of
     * system-assigned identity. Make sure managed identity has been given access to blob's container with 'Storage
     * Blob Data Contributor' role assignment. In case of user-assigned identity, make sure you add it under VM's
     * identity. For more info on managed identity and Run Command, refer https://aka.ms/ManagedIdentity and
     * https://aka.ms/RunCommandManaged
     */
    @JsonProperty(value = "errorBlobManagedIdentity")
    private RunCommandManagedIdentity errorBlobManagedIdentity;

    /*
     * The provisioning state, which only appears in the response. If treatFailureAsDeploymentFailure set to true, any
     * failure in the script will fail the deployment and ProvisioningState will be marked as Failed. If
     * treatFailureAsDeploymentFailure set to false, ProvisioningState would only reflect whether the run command was
     * run or not by the extensions platform, it would not indicate whether script failed in case of script failures.
     * See instance view of run command in case of script failures to see executionMessage, output, error:
     * https://aka.ms/runcommandmanaged#get-execution-status-and-results
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The virtual machine run command instance view.
     */
    @JsonProperty(value = "instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineRunCommandInstanceView instanceView;

    /*
     * Optional. If set to true, any failure in the script will fail the deployment and ProvisioningState will be
     * marked as Failed. If set to false, ProvisioningState would only reflect whether the run command was run or not
     * by the extensions platform, it would not indicate whether script failed in case of script failures. See instance
     * view of run command in case of script failures to see executionMessage, output, error:
     * https://aka.ms/runcommandmanaged#get-execution-status-and-results
     */
    @JsonProperty(value = "treatFailureAsDeploymentFailure")
    private Boolean treatFailureAsDeploymentFailure;

    /** Creates an instance of VirtualMachineRunCommandProperties class. */
    public VirtualMachineRunCommandProperties() {
    }

    /**
     * Get the source property: The source of the run command script.
     *
     * @return the source value.
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source of the run command script.
     *
     * @param source the source value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withSource(VirtualMachineRunCommandScriptSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    public List<RunCommandInputParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters used by the script.
     *
     * @param parameters the parameters value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withParameters(List<RunCommandInputParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the protectedParameters property: The parameters used by the script.
     *
     * @return the protectedParameters value.
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.protectedParameters;
    }

    /**
     * Set the protectedParameters property: The parameters used by the script.
     *
     * @param protectedParameters the protectedParameters value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withProtectedParameters(
        List<RunCommandInputParameter> protectedParameters) {
        this.protectedParameters = protectedParameters;
        return this;
    }

    /**
     * Get the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @return the asyncExecution value.
     */
    public Boolean asyncExecution() {
        return this.asyncExecution;
    }

    /**
     * Set the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @param asyncExecution the asyncExecution value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withAsyncExecution(Boolean asyncExecution) {
        this.asyncExecution = asyncExecution;
        return this;
    }

    /**
     * Get the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value.
     */
    public String runAsUser() {
        return this.runAsUser;
    }

    /**
     * Set the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @param runAsUser the runAsUser value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withRunAsUser(String runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * Get the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value.
     */
    public String runAsPassword() {
        return this.runAsPassword;
    }

    /**
     * Set the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @param runAsPassword the runAsPassword value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withRunAsPassword(String runAsPassword) {
        this.runAsPassword = runAsPassword;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
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
        return this.outputBlobUri;
    }

    /**
     * Set the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded. Use
     * a SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer outputBlobManagedIdentity parameter.
     *
     * @param outputBlobUri the outputBlobUri value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withOutputBlobUri(String outputBlobUri) {
        this.outputBlobUri = outputBlobUri;
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
        return this.errorBlobUri;
    }

    /**
     * Set the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded. Use a
     * SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer errorBlobManagedIdentity parameter.
     *
     * @param errorBlobUri the errorBlobUri value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withErrorBlobUri(String errorBlobUri) {
        this.errorBlobUri = errorBlobUri;
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
        return this.outputBlobManagedIdentity;
    }

    /**
     * Set the outputBlobManagedIdentity property: User-assigned managed identity that has access to outputBlobUri
     * storage blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given
     * access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned
     * identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     *
     * @param outputBlobManagedIdentity the outputBlobManagedIdentity value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withOutputBlobManagedIdentity(
        RunCommandManagedIdentity outputBlobManagedIdentity) {
        this.outputBlobManagedIdentity = outputBlobManagedIdentity;
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
        return this.errorBlobManagedIdentity;
    }

    /**
     * Set the errorBlobManagedIdentity property: User-assigned managed identity that has access to errorBlobUri storage
     * blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given access
     * to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned identity, make
     * sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     *
     * @param errorBlobManagedIdentity the errorBlobManagedIdentity value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withErrorBlobManagedIdentity(
        RunCommandManagedIdentity errorBlobManagedIdentity) {
        this.errorBlobManagedIdentity = errorBlobManagedIdentity;
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
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The virtual machine run command instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.instanceView;
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
        return this.treatFailureAsDeploymentFailure;
    }

    /**
     * Set the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the script will fail
     * the deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would only
     * reflect whether the run command was run or not by the extensions platform, it would not indicate whether script
     * failed in case of script failures. See instance view of run command in case of script failures to see
     * executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     *
     * @param treatFailureAsDeploymentFailure the treatFailureAsDeploymentFailure value to set.
     * @return the VirtualMachineRunCommandProperties object itself.
     */
    public VirtualMachineRunCommandProperties withTreatFailureAsDeploymentFailure(
        Boolean treatFailureAsDeploymentFailure) {
        this.treatFailureAsDeploymentFailure = treatFailureAsDeploymentFailure;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
        if (protectedParameters() != null) {
            protectedParameters().forEach(e -> e.validate());
        }
        if (outputBlobManagedIdentity() != null) {
            outputBlobManagedIdentity().validate();
        }
        if (errorBlobManagedIdentity() != null) {
            errorBlobManagedIdentity().validate();
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
