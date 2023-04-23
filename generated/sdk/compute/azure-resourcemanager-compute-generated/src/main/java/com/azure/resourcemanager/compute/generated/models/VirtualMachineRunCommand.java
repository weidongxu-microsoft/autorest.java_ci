// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of VirtualMachineRunCommand. */
public interface VirtualMachineRunCommand {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the source property: The source of the run command script.
     *
     * @return the source value.
     */
    VirtualMachineRunCommandScriptSource source();

    /**
     * Gets the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    List<RunCommandInputParameter> parameters();

    /**
     * Gets the protectedParameters property: The parameters used by the script.
     *
     * @return the protectedParameters value.
     */
    List<RunCommandInputParameter> protectedParameters();

    /**
     * Gets the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @return the asyncExecution value.
     */
    Boolean asyncExecution();

    /**
     * Gets the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value.
     */
    String runAsUser();

    /**
     * Gets the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value.
     */
    String runAsPassword();

    /**
     * Gets the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value.
     */
    Integer timeoutInSeconds();

    /**
     * Gets the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     * Use a SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the
     * blob. Refer outputBlobManagedIdentity parameter.
     *
     * @return the outputBlobUri value.
     */
    String outputBlobUri();

    /**
     * Gets the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded. Use
     * a SAS URI with read, append, create, write access OR use managed identity to provide the VM access to the blob.
     * Refer errorBlobManagedIdentity parameter.
     *
     * @return the errorBlobUri value.
     */
    String errorBlobUri();

    /**
     * Gets the outputBlobManagedIdentity property: User-assigned managed identity that has access to outputBlobUri
     * storage blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given
     * access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned
     * identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     *
     * @return the outputBlobManagedIdentity value.
     */
    RunCommandManagedIdentity outputBlobManagedIdentity();

    /**
     * Gets the errorBlobManagedIdentity property: User-assigned managed identity that has access to errorBlobUri
     * storage blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been given
     * access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of user-assigned
     * identity, make sure you add it under VM's identity. For more info on managed identity and Run Command, refer
     * https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
     *
     * @return the errorBlobManagedIdentity value.
     */
    RunCommandManagedIdentity errorBlobManagedIdentity();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response. If
     * treatFailureAsDeploymentFailure set to true, any failure in the script will fail the deployment and
     * ProvisioningState will be marked as Failed. If treatFailureAsDeploymentFailure set to false, ProvisioningState
     * would only reflect whether the run command was run or not by the extensions platform, it would not indicate
     * whether script failed in case of script failures. See instance view of run command in case of script failures to
     * see executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the instanceView property: The virtual machine run command instance view.
     *
     * @return the instanceView value.
     */
    VirtualMachineRunCommandInstanceView instanceView();

    /**
     * Gets the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the script will fail
     * the deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would only
     * reflect whether the run command was run or not by the extensions platform, it would not indicate whether script
     * failed in case of script failures. See instance view of run command in case of script failures to see
     * executionMessage, output, error: https://aka.ms/runcommandmanaged#get-execution-status-and-results.
     *
     * @return the treatFailureAsDeploymentFailure value.
     */
    Boolean treatFailureAsDeploymentFailure();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner object.
     *
     * @return the inner object.
     */
    VirtualMachineRunCommandInner innerModel();

    /** The entirety of the VirtualMachineRunCommand definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The VirtualMachineRunCommand definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualMachineRunCommand definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vmName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param vmName The name of the virtual machine where the run command should be created or updated.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualMachine(String resourceGroupName, String vmName);
        }
        /**
         * The stage of the VirtualMachineRunCommand definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSource,
                DefinitionStages.WithParameters,
                DefinitionStages.WithProtectedParameters,
                DefinitionStages.WithAsyncExecution,
                DefinitionStages.WithRunAsUser,
                DefinitionStages.WithRunAsPassword,
                DefinitionStages.WithTimeoutInSeconds,
                DefinitionStages.WithOutputBlobUri,
                DefinitionStages.WithErrorBlobUri,
                DefinitionStages.WithOutputBlobManagedIdentity,
                DefinitionStages.WithErrorBlobManagedIdentity,
                DefinitionStages.WithTreatFailureAsDeploymentFailure {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualMachineRunCommand create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualMachineRunCommand create(Context context);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: The source of the run command script..
             *
             * @param source The source of the run command script.
             * @return the next definition stage.
             */
            WithCreate withSource(VirtualMachineRunCommandScriptSource source);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameters used by the script..
             *
             * @param parameters The parameters used by the script.
             * @return the next definition stage.
             */
            WithCreate withParameters(List<RunCommandInputParameter> parameters);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify protectedParameters. */
        interface WithProtectedParameters {
            /**
             * Specifies the protectedParameters property: The parameters used by the script..
             *
             * @param protectedParameters The parameters used by the script.
             * @return the next definition stage.
             */
            WithCreate withProtectedParameters(List<RunCommandInputParameter> protectedParameters);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify asyncExecution. */
        interface WithAsyncExecution {
            /**
             * Specifies the asyncExecution property: Optional. If set to true, provisioning will complete as soon as
             * the script starts and will not wait for script to complete..
             *
             * @param asyncExecution Optional. If set to true, provisioning will complete as soon as the script starts
             *     and will not wait for script to complete.
             * @return the next definition stage.
             */
            WithCreate withAsyncExecution(Boolean asyncExecution);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify runAsUser. */
        interface WithRunAsUser {
            /**
             * Specifies the runAsUser property: Specifies the user account on the VM when executing the run command..
             *
             * @param runAsUser Specifies the user account on the VM when executing the run command.
             * @return the next definition stage.
             */
            WithCreate withRunAsUser(String runAsUser);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify runAsPassword. */
        interface WithRunAsPassword {
            /**
             * Specifies the runAsPassword property: Specifies the user account password on the VM when executing the
             * run command..
             *
             * @param runAsPassword Specifies the user account password on the VM when executing the run command.
             * @return the next definition stage.
             */
            WithCreate withRunAsPassword(String runAsPassword);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify timeoutInSeconds. */
        interface WithTimeoutInSeconds {
            /**
             * Specifies the timeoutInSeconds property: The timeout in seconds to execute the run command..
             *
             * @param timeoutInSeconds The timeout in seconds to execute the run command.
             * @return the next definition stage.
             */
            WithCreate withTimeoutInSeconds(Integer timeoutInSeconds);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify outputBlobUri. */
        interface WithOutputBlobUri {
            /**
             * Specifies the outputBlobUri property: Specifies the Azure storage blob where script output stream will be
             * uploaded. Use a SAS URI with read, append, create, write access OR use managed identity to provide the VM
             * access to the blob. Refer outputBlobManagedIdentity parameter. .
             *
             * @param outputBlobUri Specifies the Azure storage blob where script output stream will be uploaded. Use a
             *     SAS URI with read, append, create, write access OR use managed identity to provide the VM access to
             *     the blob. Refer outputBlobManagedIdentity parameter.
             * @return the next definition stage.
             */
            WithCreate withOutputBlobUri(String outputBlobUri);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify errorBlobUri. */
        interface WithErrorBlobUri {
            /**
             * Specifies the errorBlobUri property: Specifies the Azure storage blob where script error stream will be
             * uploaded. Use a SAS URI with read, append, create, write access OR use managed identity to provide the VM
             * access to the blob. Refer errorBlobManagedIdentity parameter..
             *
             * @param errorBlobUri Specifies the Azure storage blob where script error stream will be uploaded. Use a
             *     SAS URI with read, append, create, write access OR use managed identity to provide the VM access to
             *     the blob. Refer errorBlobManagedIdentity parameter.
             * @return the next definition stage.
             */
            WithCreate withErrorBlobUri(String errorBlobUri);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify outputBlobManagedIdentity. */
        interface WithOutputBlobManagedIdentity {
            /**
             * Specifies the outputBlobManagedIdentity property: User-assigned managed identity that has access to
             * outputBlobUri storage blob. Use an empty object in case of system-assigned identity. Make sure managed
             * identity has been given access to blob's container with 'Storage Blob Data Contributor' role assignment.
             * In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed
             * identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged .
             *
             * @param outputBlobManagedIdentity User-assigned managed identity that has access to outputBlobUri storage
             *     blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been
             *     given access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of
             *     user-assigned identity, make sure you add it under VM's identity. For more info on managed identity
             *     and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
             * @return the next definition stage.
             */
            WithCreate withOutputBlobManagedIdentity(RunCommandManagedIdentity outputBlobManagedIdentity);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify errorBlobManagedIdentity. */
        interface WithErrorBlobManagedIdentity {
            /**
             * Specifies the errorBlobManagedIdentity property: User-assigned managed identity that has access to
             * errorBlobUri storage blob. Use an empty object in case of system-assigned identity. Make sure managed
             * identity has been given access to blob's container with 'Storage Blob Data Contributor' role assignment.
             * In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed
             * identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged .
             *
             * @param errorBlobManagedIdentity User-assigned managed identity that has access to errorBlobUri storage
             *     blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been
             *     given access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of
             *     user-assigned identity, make sure you add it under VM's identity. For more info on managed identity
             *     and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
             * @return the next definition stage.
             */
            WithCreate withErrorBlobManagedIdentity(RunCommandManagedIdentity errorBlobManagedIdentity);
        }
        /** The stage of the VirtualMachineRunCommand definition allowing to specify treatFailureAsDeploymentFailure. */
        interface WithTreatFailureAsDeploymentFailure {
            /**
             * Specifies the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the
             * script will fail the deployment and ProvisioningState will be marked as Failed. If set to false,
             * ProvisioningState would only reflect whether the run command was run or not by the extensions platform,
             * it would not indicate whether script failed in case of script failures. See instance view of run command
             * in case of script failures to see executionMessage, output, error:
             * https://aka.ms/runcommandmanaged#get-execution-status-and-results .
             *
             * @param treatFailureAsDeploymentFailure Optional. If set to true, any failure in the script will fail the
             *     deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would
             *     only reflect whether the run command was run or not by the extensions platform, it would not indicate
             *     whether script failed in case of script failures. See instance view of run command in case of script
             *     failures to see executionMessage, output, error:
             *     https://aka.ms/runcommandmanaged#get-execution-status-and-results.
             * @return the next definition stage.
             */
            WithCreate withTreatFailureAsDeploymentFailure(Boolean treatFailureAsDeploymentFailure);
        }
    }
    /**
     * Begins update for the VirtualMachineRunCommand resource.
     *
     * @return the stage of resource update.
     */
    VirtualMachineRunCommand.Update update();

    /** The template for VirtualMachineRunCommand update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithSource,
            UpdateStages.WithParameters,
            UpdateStages.WithProtectedParameters,
            UpdateStages.WithAsyncExecution,
            UpdateStages.WithRunAsUser,
            UpdateStages.WithRunAsPassword,
            UpdateStages.WithTimeoutInSeconds,
            UpdateStages.WithOutputBlobUri,
            UpdateStages.WithErrorBlobUri,
            UpdateStages.WithOutputBlobManagedIdentity,
            UpdateStages.WithErrorBlobManagedIdentity,
            UpdateStages.WithTreatFailureAsDeploymentFailure {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualMachineRunCommand apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualMachineRunCommand apply(Context context);
    }
    /** The VirtualMachineRunCommand update stages. */
    interface UpdateStages {
        /** The stage of the VirtualMachineRunCommand update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify source. */
        interface WithSource {
            /**
             * Specifies the source property: The source of the run command script..
             *
             * @param source The source of the run command script.
             * @return the next definition stage.
             */
            Update withSource(VirtualMachineRunCommandScriptSource source);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameters used by the script..
             *
             * @param parameters The parameters used by the script.
             * @return the next definition stage.
             */
            Update withParameters(List<RunCommandInputParameter> parameters);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify protectedParameters. */
        interface WithProtectedParameters {
            /**
             * Specifies the protectedParameters property: The parameters used by the script..
             *
             * @param protectedParameters The parameters used by the script.
             * @return the next definition stage.
             */
            Update withProtectedParameters(List<RunCommandInputParameter> protectedParameters);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify asyncExecution. */
        interface WithAsyncExecution {
            /**
             * Specifies the asyncExecution property: Optional. If set to true, provisioning will complete as soon as
             * the script starts and will not wait for script to complete..
             *
             * @param asyncExecution Optional. If set to true, provisioning will complete as soon as the script starts
             *     and will not wait for script to complete.
             * @return the next definition stage.
             */
            Update withAsyncExecution(Boolean asyncExecution);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify runAsUser. */
        interface WithRunAsUser {
            /**
             * Specifies the runAsUser property: Specifies the user account on the VM when executing the run command..
             *
             * @param runAsUser Specifies the user account on the VM when executing the run command.
             * @return the next definition stage.
             */
            Update withRunAsUser(String runAsUser);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify runAsPassword. */
        interface WithRunAsPassword {
            /**
             * Specifies the runAsPassword property: Specifies the user account password on the VM when executing the
             * run command..
             *
             * @param runAsPassword Specifies the user account password on the VM when executing the run command.
             * @return the next definition stage.
             */
            Update withRunAsPassword(String runAsPassword);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify timeoutInSeconds. */
        interface WithTimeoutInSeconds {
            /**
             * Specifies the timeoutInSeconds property: The timeout in seconds to execute the run command..
             *
             * @param timeoutInSeconds The timeout in seconds to execute the run command.
             * @return the next definition stage.
             */
            Update withTimeoutInSeconds(Integer timeoutInSeconds);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify outputBlobUri. */
        interface WithOutputBlobUri {
            /**
             * Specifies the outputBlobUri property: Specifies the Azure storage blob where script output stream will be
             * uploaded. Use a SAS URI with read, append, create, write access OR use managed identity to provide the VM
             * access to the blob. Refer outputBlobManagedIdentity parameter. .
             *
             * @param outputBlobUri Specifies the Azure storage blob where script output stream will be uploaded. Use a
             *     SAS URI with read, append, create, write access OR use managed identity to provide the VM access to
             *     the blob. Refer outputBlobManagedIdentity parameter.
             * @return the next definition stage.
             */
            Update withOutputBlobUri(String outputBlobUri);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify errorBlobUri. */
        interface WithErrorBlobUri {
            /**
             * Specifies the errorBlobUri property: Specifies the Azure storage blob where script error stream will be
             * uploaded. Use a SAS URI with read, append, create, write access OR use managed identity to provide the VM
             * access to the blob. Refer errorBlobManagedIdentity parameter..
             *
             * @param errorBlobUri Specifies the Azure storage blob where script error stream will be uploaded. Use a
             *     SAS URI with read, append, create, write access OR use managed identity to provide the VM access to
             *     the blob. Refer errorBlobManagedIdentity parameter.
             * @return the next definition stage.
             */
            Update withErrorBlobUri(String errorBlobUri);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify outputBlobManagedIdentity. */
        interface WithOutputBlobManagedIdentity {
            /**
             * Specifies the outputBlobManagedIdentity property: User-assigned managed identity that has access to
             * outputBlobUri storage blob. Use an empty object in case of system-assigned identity. Make sure managed
             * identity has been given access to blob's container with 'Storage Blob Data Contributor' role assignment.
             * In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed
             * identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged .
             *
             * @param outputBlobManagedIdentity User-assigned managed identity that has access to outputBlobUri storage
             *     blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been
             *     given access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of
             *     user-assigned identity, make sure you add it under VM's identity. For more info on managed identity
             *     and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
             * @return the next definition stage.
             */
            Update withOutputBlobManagedIdentity(RunCommandManagedIdentity outputBlobManagedIdentity);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify errorBlobManagedIdentity. */
        interface WithErrorBlobManagedIdentity {
            /**
             * Specifies the errorBlobManagedIdentity property: User-assigned managed identity that has access to
             * errorBlobUri storage blob. Use an empty object in case of system-assigned identity. Make sure managed
             * identity has been given access to blob's container with 'Storage Blob Data Contributor' role assignment.
             * In case of user-assigned identity, make sure you add it under VM's identity. For more info on managed
             * identity and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged .
             *
             * @param errorBlobManagedIdentity User-assigned managed identity that has access to errorBlobUri storage
             *     blob. Use an empty object in case of system-assigned identity. Make sure managed identity has been
             *     given access to blob's container with 'Storage Blob Data Contributor' role assignment. In case of
             *     user-assigned identity, make sure you add it under VM's identity. For more info on managed identity
             *     and Run Command, refer https://aka.ms/ManagedIdentity and https://aka.ms/RunCommandManaged.
             * @return the next definition stage.
             */
            Update withErrorBlobManagedIdentity(RunCommandManagedIdentity errorBlobManagedIdentity);
        }
        /** The stage of the VirtualMachineRunCommand update allowing to specify treatFailureAsDeploymentFailure. */
        interface WithTreatFailureAsDeploymentFailure {
            /**
             * Specifies the treatFailureAsDeploymentFailure property: Optional. If set to true, any failure in the
             * script will fail the deployment and ProvisioningState will be marked as Failed. If set to false,
             * ProvisioningState would only reflect whether the run command was run or not by the extensions platform,
             * it would not indicate whether script failed in case of script failures. See instance view of run command
             * in case of script failures to see executionMessage, output, error:
             * https://aka.ms/runcommandmanaged#get-execution-status-and-results .
             *
             * @param treatFailureAsDeploymentFailure Optional. If set to true, any failure in the script will fail the
             *     deployment and ProvisioningState will be marked as Failed. If set to false, ProvisioningState would
             *     only reflect whether the run command was run or not by the extensions platform, it would not indicate
             *     whether script failed in case of script failures. See instance view of run command in case of script
             *     failures to see executionMessage, output, error:
             *     https://aka.ms/runcommandmanaged#get-execution-status-and-results.
             * @return the next definition stage.
             */
            Update withTreatFailureAsDeploymentFailure(Boolean treatFailureAsDeploymentFailure);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualMachineRunCommand refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualMachineRunCommand refresh(Context context);
}
