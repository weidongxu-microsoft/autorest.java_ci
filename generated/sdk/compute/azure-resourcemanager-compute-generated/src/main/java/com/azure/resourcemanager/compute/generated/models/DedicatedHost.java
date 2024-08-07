// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of DedicatedHost.
 */
public interface DedicatedHost {
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
     * Gets the sku property: SKU of the dedicated host for Hardware Generation and VM family. Only name is required to
     * be set. List Microsoft.Compute SKUs for a list of possible values.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host group.
     * 
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * Gets the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced automatically in
     * case of a failure. The value is defaulted to 'true' when not provided.
     * 
     * @return the autoReplaceOnFailure value.
     */
    Boolean autoReplaceOnFailure();

    /**
     * Gets the hostId property: A unique id generated and assigned to the dedicated host by the platform. Does not
     * change throughout the lifetime of the host.
     * 
     * @return the hostId value.
     */
    String hostId();

    /**
     * Gets the virtualMachines property: A list of references to all virtual machines in the Dedicated Host.
     * 
     * @return the virtualMachines value.
     */
    List<SubResourceReadOnly> virtualMachines();

    /**
     * Gets the licenseType property: Specifies the software license type that will be applied to the VMs deployed on
     * the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.** The
     * default value is: **None.**.
     * 
     * @return the licenseType value.
     */
    DedicatedHostLicenseTypes licenseType();

    /**
     * Gets the provisioningTime property: The date when the host was first provisioned.
     * 
     * @return the provisioningTime value.
     */
    OffsetDateTime provisioningTime();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the instanceView property: The dedicated host instance view.
     * 
     * @return the instanceView value.
     */
    DedicatedHostInstanceView instanceView();

    /**
     * Gets the timeCreated property: Specifies the time at which the Dedicated Host resource was created. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostInner object.
     * 
     * @return the inner object.
     */
    DedicatedHostInner innerModel();

    /**
     * The entirety of the DedicatedHost definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * The DedicatedHost definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the DedicatedHost definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify location.
         */
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

        /**
         * The stage of the DedicatedHost definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, hostGroupName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param hostGroupName The name of the dedicated host group.
             * @return the next definition stage.
             */
            WithSku withExistingHostGroup(String resourceGroupName, String hostGroupName);
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: SKU of the dedicated host for Hardware Generation and VM family. Only name is
             * required to be set. List Microsoft.Compute SKUs for a list of possible values..
             * 
             * @param sku SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be
             * set. List Microsoft.Compute SKUs for a list of possible values.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the DedicatedHost definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithPlatformFaultDomain,
            DefinitionStages.WithAutoReplaceOnFailure, DefinitionStages.WithLicenseType {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            DedicatedHost create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DedicatedHost create(Context context);
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify platformFaultDomain.
         */
        interface WithPlatformFaultDomain {
            /**
             * Specifies the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host
             * group..
             * 
             * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group.
             * @return the next definition stage.
             */
            WithCreate withPlatformFaultDomain(Integer platformFaultDomain);
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify autoReplaceOnFailure.
         */
        interface WithAutoReplaceOnFailure {
            /**
             * Specifies the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced
             * automatically in case of a failure. The value is defaulted to 'true' when not provided..
             * 
             * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case
             * of a failure. The value is defaulted to 'true' when not provided.
             * @return the next definition stage.
             */
            WithCreate withAutoReplaceOnFailure(Boolean autoReplaceOnFailure);
        }

        /**
         * The stage of the DedicatedHost definition allowing to specify licenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies the licenseType property: Specifies the software license type that will be applied to the VMs
             * deployed on the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,**
             * **Windows_Server_Perpetual.** The default value is: **None.**.
             * 
             * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the
             * dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.**
             * The default value is: **None.**.
             * @return the next definition stage.
             */
            WithCreate withLicenseType(DedicatedHostLicenseTypes licenseType);
        }
    }

    /**
     * Begins update for the DedicatedHost resource.
     * 
     * @return the stage of resource update.
     */
    DedicatedHost.Update update();

    /**
     * The template for DedicatedHost update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku, UpdateStages.WithPlatformFaultDomain,
        UpdateStages.WithAutoReplaceOnFailure, UpdateStages.WithLicenseType {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        DedicatedHost apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DedicatedHost apply(Context context);
    }

    /**
     * The DedicatedHost update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the DedicatedHost update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the DedicatedHost update allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: [List all available dedicated host sizes for resizing]
             * (https://docs.microsoft.com/rest/api/compute/dedicated-hosts/listavailablesizes). Resizing can be only
             * used to scale up DedicatedHost. Only name is required to be set. .
             * 
             * @param sku [List all available dedicated host sizes for resizing]
             * (https://docs.microsoft.com/rest/api/compute/dedicated-hosts/listavailablesizes). Resizing can be only
             * used to scale up DedicatedHost. Only name is required to be set.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the DedicatedHost update allowing to specify platformFaultDomain.
         */
        interface WithPlatformFaultDomain {
            /**
             * Specifies the platformFaultDomain property: Fault domain of the dedicated host within a dedicated host
             * group..
             * 
             * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group.
             * @return the next definition stage.
             */
            Update withPlatformFaultDomain(Integer platformFaultDomain);
        }

        /**
         * The stage of the DedicatedHost update allowing to specify autoReplaceOnFailure.
         */
        interface WithAutoReplaceOnFailure {
            /**
             * Specifies the autoReplaceOnFailure property: Specifies whether the dedicated host should be replaced
             * automatically in case of a failure. The value is defaulted to 'true' when not provided..
             * 
             * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case
             * of a failure. The value is defaulted to 'true' when not provided.
             * @return the next definition stage.
             */
            Update withAutoReplaceOnFailure(Boolean autoReplaceOnFailure);
        }

        /**
         * The stage of the DedicatedHost update allowing to specify licenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies the licenseType property: Specifies the software license type that will be applied to the VMs
             * deployed on the dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,**
             * **Windows_Server_Perpetual.** The default value is: **None.**.
             * 
             * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the
             * dedicated host. Possible values are: **None,** **Windows_Server_Hybrid,** **Windows_Server_Perpetual.**
             * The default value is: **None.**.
             * @return the next definition stage.
             */
            Update withLicenseType(DedicatedHostLicenseTypes licenseType);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    DedicatedHost refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DedicatedHost refresh(Context context);

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     * 
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart();

    /**
     * Restart the dedicated host. The operation will complete successfully once the dedicated host has restarted and is
     * running. To determine the health of VMs deployed on the dedicated host after the restart check the Resource
     * Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(Context context);

    /**
     * Redeploy the dedicated host. The operation will complete successfully once the dedicated host has migrated to a
     * new node and is running. To determine the health of VMs deployed on the dedicated host after the redeploy check
     * the Resource Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     * 
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy();

    /**
     * Redeploy the dedicated host. The operation will complete successfully once the dedicated host has migrated to a
     * new node and is running. To determine the health of VMs deployed on the dedicated host after the redeploy check
     * the Resource Health Center in the Azure Portal. Please refer to
     * https://docs.microsoft.com/azure/service-health/resource-health-overview for more details.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(Context context);
}
