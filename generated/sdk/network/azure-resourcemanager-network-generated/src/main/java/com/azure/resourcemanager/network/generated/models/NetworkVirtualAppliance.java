// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of NetworkVirtualAppliance.
 */
public interface NetworkVirtualAppliance {
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
     * Gets the identity property: The service principal that has read access to cloud-init and config blob.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the id property: Resource ID.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the nvaSku property: Network Virtual Appliance SKU.
     * 
     * @return the nvaSku value.
     */
    VirtualApplianceSkuProperties nvaSku();

    /**
     * Gets the addressPrefix property: Address Prefix.
     * 
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     * 
     * @return the bootStrapConfigurationBlobs value.
     */
    List<String> bootStrapConfigurationBlobs();

    /**
     * Gets the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     * 
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * Gets the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     * 
     * @return the cloudInitConfigurationBlobs value.
     */
    List<String> cloudInitConfigurationBlobs();

    /**
     * Gets the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     * 
     * @return the cloudInitConfiguration value.
     */
    String cloudInitConfiguration();

    /**
     * Gets the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are not supported.
     * 
     * @return the virtualApplianceAsn value.
     */
    Long virtualApplianceAsn();

    /**
     * Gets the sshPublicKey property: Public key for SSH login.
     * 
     * @return the sshPublicKey value.
     */
    String sshPublicKey();

    /**
     * Gets the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     * 
     * @return the virtualApplianceNics value.
     */
    List<VirtualApplianceNicProperties> virtualApplianceNics();

    /**
     * Gets the additionalNics property: Details required for Additional Network Interface.
     * 
     * @return the additionalNics value.
     */
    List<VirtualApplianceAdditionalNicProperties> additionalNics();

    /**
     * Gets the internetIngressPublicIps property: List of Resource Uri of Public IPs for Internet Ingress Scenario.
     * 
     * @return the internetIngressPublicIps value.
     */
    List<InternetIngressPublicIpsProperties> internetIngressPublicIps();

    /**
     * Gets the virtualApplianceSites property: List of references to VirtualApplianceSite.
     * 
     * @return the virtualApplianceSites value.
     */
    List<SubResource> virtualApplianceSites();

    /**
     * Gets the virtualApplianceConnections property: List of references to VirtualApplianceConnections.
     * 
     * @return the virtualApplianceConnections value.
     */
    List<SubResource> virtualApplianceConnections();

    /**
     * Gets the inboundSecurityRules property: List of references to InboundSecurityRules.
     * 
     * @return the inboundSecurityRules value.
     */
    List<SubResource> inboundSecurityRules();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the deploymentType property: The deployment type. PartnerManaged for the SaaS NVA.
     * 
     * @return the deploymentType value.
     */
    String deploymentType();

    /**
     * Gets the delegation property: The delegation for the Virtual Appliance.
     * 
     * @return the delegation value.
     */
    DelegationProperties delegation();

    /**
     * Gets the partnerManagedResource property: The delegation for the Virtual Appliance.
     * 
     * @return the partnerManagedResource value.
     */
    PartnerManagedResourceProperties partnerManagedResource();

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
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceInner object.
     * 
     * @return the inner object.
     */
    NetworkVirtualApplianceInner innerModel();

    /**
     * The entirety of the NetworkVirtualAppliance definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The NetworkVirtualAppliance definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NetworkVirtualAppliance definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition which contains all the minimum required properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithNvaSku,
            DefinitionStages.WithBootStrapConfigurationBlobs, DefinitionStages.WithVirtualHub,
            DefinitionStages.WithCloudInitConfigurationBlobs, DefinitionStages.WithCloudInitConfiguration,
            DefinitionStages.WithVirtualApplianceAsn, DefinitionStages.WithSshPublicKey,
            DefinitionStages.WithAdditionalNics, DefinitionStages.WithInternetIngressPublicIps,
            DefinitionStages.WithDelegation, DefinitionStages.WithPartnerManagedResource {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NetworkVirtualAppliance create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkVirtualAppliance create(Context context);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify tags.
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
         * The stage of the NetworkVirtualAppliance definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The service principal that has read access to cloud-init and config blob..
             * 
             * @param identity The service principal that has read access to cloud-init and config blob.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify nvaSku.
         */
        interface WithNvaSku {
            /**
             * Specifies the nvaSku property: Network Virtual Appliance SKU..
             * 
             * @param nvaSku Network Virtual Appliance SKU.
             * @return the next definition stage.
             */
            WithCreate withNvaSku(VirtualApplianceSkuProperties nvaSku);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify bootStrapConfigurationBlobs.
         */
        interface WithBootStrapConfigurationBlobs {
            /**
             * Specifies the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs..
             * 
             * @param bootStrapConfigurationBlobs BootStrapConfigurationBlobs storage URLs.
             * @return the next definition stage.
             */
            WithCreate withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify virtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed..
             * 
             * @param virtualHub The Virtual Hub where Network Virtual Appliance is being deployed.
             * @return the next definition stage.
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify cloudInitConfigurationBlobs.
         */
        interface WithCloudInitConfigurationBlobs {
            /**
             * Specifies the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs..
             * 
             * @param cloudInitConfigurationBlobs CloudInitConfigurationBlob storage URLs.
             * @return the next definition stage.
             */
            WithCreate withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify cloudInitConfiguration.
         */
        interface WithCloudInitConfiguration {
            /**
             * Specifies the cloudInitConfiguration property: CloudInitConfiguration string in plain text..
             * 
             * @param cloudInitConfiguration CloudInitConfiguration string in plain text.
             * @return the next definition stage.
             */
            WithCreate withCloudInitConfiguration(String cloudInitConfiguration);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify virtualApplianceAsn.
         */
        interface WithVirtualApplianceAsn {
            /**
             * Specifies the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are not supported..
             * 
             * @param virtualApplianceAsn VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are not supported.
             * @return the next definition stage.
             */
            WithCreate withVirtualApplianceAsn(Long virtualApplianceAsn);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify sshPublicKey.
         */
        interface WithSshPublicKey {
            /**
             * Specifies the sshPublicKey property: Public key for SSH login..
             * 
             * @param sshPublicKey Public key for SSH login.
             * @return the next definition stage.
             */
            WithCreate withSshPublicKey(String sshPublicKey);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify additionalNics.
         */
        interface WithAdditionalNics {
            /**
             * Specifies the additionalNics property: Details required for Additional Network Interface..
             * 
             * @param additionalNics Details required for Additional Network Interface.
             * @return the next definition stage.
             */
            WithCreate withAdditionalNics(List<VirtualApplianceAdditionalNicProperties> additionalNics);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify internetIngressPublicIps.
         */
        interface WithInternetIngressPublicIps {
            /**
             * Specifies the internetIngressPublicIps property: List of Resource Uri of Public IPs for Internet Ingress Scenario..
             * 
             * @param internetIngressPublicIps List of Resource Uri of Public IPs for Internet Ingress Scenario.
             * @return the next definition stage.
             */
            WithCreate withInternetIngressPublicIps(List<InternetIngressPublicIpsProperties> internetIngressPublicIps);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify delegation.
         */
        interface WithDelegation {
            /**
             * Specifies the delegation property: The delegation for the Virtual Appliance.
             * 
             * @param delegation The delegation for the Virtual Appliance.
             * @return the next definition stage.
             */
            WithCreate withDelegation(DelegationProperties delegation);
        }

        /**
         * The stage of the NetworkVirtualAppliance definition allowing to specify partnerManagedResource.
         */
        interface WithPartnerManagedResource {
            /**
             * Specifies the partnerManagedResource property: The delegation for the Virtual Appliance.
             * 
             * @param partnerManagedResource The delegation for the Virtual Appliance.
             * @return the next definition stage.
             */
            WithCreate withPartnerManagedResource(PartnerManagedResourceProperties partnerManagedResource);
        }
    }

    /**
     * Begins update for the NetworkVirtualAppliance resource.
     * 
     * @return the stage of resource update.
     */
    NetworkVirtualAppliance.Update update();

    /**
     * The template for NetworkVirtualAppliance update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NetworkVirtualAppliance apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkVirtualAppliance apply(Context context);
    }

    /**
     * The NetworkVirtualAppliance update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NetworkVirtualAppliance update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    NetworkVirtualAppliance refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkVirtualAppliance refresh(Context context);
}
