// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.DelegationProperties;
import com.azure.resourcemanager.network.generated.models.InternetIngressPublicIpsProperties;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualAppliancePropertiesFormatNetworkProfile;
import com.azure.resourcemanager.network.generated.models.PartnerManagedResourceProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceAdditionalNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkuProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network Virtual Appliance definition.
 */
@Fluent
public final class NetworkVirtualAppliancePropertiesFormat {
    /*
     * Network Virtual Appliance SKU.
     */
    @JsonProperty(value = "nvaSku")
    private VirtualApplianceSkuProperties nvaSku;

    /*
     * Address Prefix.
     */
    @JsonProperty(value = "addressPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String addressPrefix;

    /*
     * BootStrapConfigurationBlobs storage URLs.
     */
    @JsonProperty(value = "bootStrapConfigurationBlobs")
    private List<String> bootStrapConfigurationBlobs;

    /*
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /*
     * CloudInitConfigurationBlob storage URLs.
     */
    @JsonProperty(value = "cloudInitConfigurationBlobs")
    private List<String> cloudInitConfigurationBlobs;

    /*
     * CloudInitConfiguration string in plain text.
     */
    @JsonProperty(value = "cloudInitConfiguration")
    private String cloudInitConfiguration;

    /*
     * VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are not supported.
     */
    @JsonProperty(value = "virtualApplianceAsn")
    private Long virtualApplianceAsn;

    /*
     * Public key for SSH login.
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /*
     * List of Virtual Appliance Network Interfaces.
     */
    @JsonProperty(value = "virtualApplianceNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualApplianceNicProperties> virtualApplianceNics;

    /*
     * Network Profile containing configurations for Public and Private NIC.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkVirtualAppliancePropertiesFormatNetworkProfile networkProfile;

    /*
     * Details required for Additional Network Interface.
     */
    @JsonProperty(value = "additionalNics")
    private List<VirtualApplianceAdditionalNicProperties> additionalNics;

    /*
     * List of Resource Uri of Public IPs for Internet Ingress Scenario.
     */
    @JsonProperty(value = "internetIngressPublicIps")
    private List<InternetIngressPublicIpsProperties> internetIngressPublicIps;

    /*
     * List of references to VirtualApplianceSite.
     */
    @JsonProperty(value = "virtualApplianceSites", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualApplianceSites;

    /*
     * List of references to VirtualApplianceConnections.
     */
    @JsonProperty(value = "virtualApplianceConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualApplianceConnections;

    /*
     * List of references to InboundSecurityRules.
     */
    @JsonProperty(value = "inboundSecurityRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundSecurityRules;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The deployment type. PartnerManaged for the SaaS NVA
     */
    @JsonProperty(value = "deploymentType", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentType;

    /*
     * The delegation for the Virtual Appliance
     */
    @JsonProperty(value = "delegation")
    private DelegationProperties delegation;

    /*
     * The delegation for the Virtual Appliance
     */
    @JsonProperty(value = "partnerManagedResource")
    private PartnerManagedResourceProperties partnerManagedResource;

    /**
     * Creates an instance of NetworkVirtualAppliancePropertiesFormat class.
     */
    public NetworkVirtualAppliancePropertiesFormat() {
    }

    /**
     * Get the nvaSku property: Network Virtual Appliance SKU.
     * 
     * @return the nvaSku value.
     */
    public VirtualApplianceSkuProperties nvaSku() {
        return this.nvaSku;
    }

    /**
     * Set the nvaSku property: Network Virtual Appliance SKU.
     * 
     * @param nvaSku the nvaSku value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        this.nvaSku = nvaSku;
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Get the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     * 
     * @return the bootStrapConfigurationBlobs value.
     */
    public List<String> bootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs;
    }

    /**
     * Set the bootStrapConfigurationBlobs property: BootStrapConfigurationBlobs storage URLs.
     * 
     * @param bootStrapConfigurationBlobs the bootStrapConfigurationBlobs value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs) {
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        return this;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where Network Virtual Appliance is being deployed.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     * 
     * @return the cloudInitConfigurationBlobs value.
     */
    public List<String> cloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs;
    }

    /**
     * Set the cloudInitConfigurationBlobs property: CloudInitConfigurationBlob storage URLs.
     * 
     * @param cloudInitConfigurationBlobs the cloudInitConfigurationBlobs value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs) {
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        return this;
    }

    /**
     * Get the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     * 
     * @return the cloudInitConfiguration value.
     */
    public String cloudInitConfiguration() {
        return this.cloudInitConfiguration;
    }

    /**
     * Set the cloudInitConfiguration property: CloudInitConfiguration string in plain text.
     * 
     * @param cloudInitConfiguration the cloudInitConfiguration value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withCloudInitConfiguration(String cloudInitConfiguration) {
        this.cloudInitConfiguration = cloudInitConfiguration;
        return this;
    }

    /**
     * Get the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are
     * not supported.
     * 
     * @return the virtualApplianceAsn value.
     */
    public Long virtualApplianceAsn() {
        return this.virtualApplianceAsn;
    }

    /**
     * Set the virtualApplianceAsn property: VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are
     * not supported.
     * 
     * @param virtualApplianceAsn the virtualApplianceAsn value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.virtualApplianceAsn = virtualApplianceAsn;
        return this;
    }

    /**
     * Get the sshPublicKey property: Public key for SSH login.
     * 
     * @return the sshPublicKey value.
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: Public key for SSH login.
     * 
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * Get the virtualApplianceNics property: List of Virtual Appliance Network Interfaces.
     * 
     * @return the virtualApplianceNics value.
     */
    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        return this.virtualApplianceNics;
    }

    /**
     * Get the networkProfile property: Network Profile containing configurations for Public and Private NIC.
     * 
     * @return the networkProfile value.
     */
    public NetworkVirtualAppliancePropertiesFormatNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Network Profile containing configurations for Public and Private NIC.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withNetworkProfile(NetworkVirtualAppliancePropertiesFormatNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the additionalNics property: Details required for Additional Network Interface.
     * 
     * @return the additionalNics value.
     */
    public List<VirtualApplianceAdditionalNicProperties> additionalNics() {
        return this.additionalNics;
    }

    /**
     * Set the additionalNics property: Details required for Additional Network Interface.
     * 
     * @param additionalNics the additionalNics value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withAdditionalNics(List<VirtualApplianceAdditionalNicProperties> additionalNics) {
        this.additionalNics = additionalNics;
        return this;
    }

    /**
     * Get the internetIngressPublicIps property: List of Resource Uri of Public IPs for Internet Ingress Scenario.
     * 
     * @return the internetIngressPublicIps value.
     */
    public List<InternetIngressPublicIpsProperties> internetIngressPublicIps() {
        return this.internetIngressPublicIps;
    }

    /**
     * Set the internetIngressPublicIps property: List of Resource Uri of Public IPs for Internet Ingress Scenario.
     * 
     * @param internetIngressPublicIps the internetIngressPublicIps value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withInternetIngressPublicIps(List<InternetIngressPublicIpsProperties> internetIngressPublicIps) {
        this.internetIngressPublicIps = internetIngressPublicIps;
        return this;
    }

    /**
     * Get the virtualApplianceSites property: List of references to VirtualApplianceSite.
     * 
     * @return the virtualApplianceSites value.
     */
    public List<SubResource> virtualApplianceSites() {
        return this.virtualApplianceSites;
    }

    /**
     * Get the virtualApplianceConnections property: List of references to VirtualApplianceConnections.
     * 
     * @return the virtualApplianceConnections value.
     */
    public List<SubResource> virtualApplianceConnections() {
        return this.virtualApplianceConnections;
    }

    /**
     * Get the inboundSecurityRules property: List of references to InboundSecurityRules.
     * 
     * @return the inboundSecurityRules value.
     */
    public List<SubResource> inboundSecurityRules() {
        return this.inboundSecurityRules;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentType property: The deployment type. PartnerManaged for the SaaS NVA.
     * 
     * @return the deploymentType value.
     */
    public String deploymentType() {
        return this.deploymentType;
    }

    /**
     * Get the delegation property: The delegation for the Virtual Appliance.
     * 
     * @return the delegation value.
     */
    public DelegationProperties delegation() {
        return this.delegation;
    }

    /**
     * Set the delegation property: The delegation for the Virtual Appliance.
     * 
     * @param delegation the delegation value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat withDelegation(DelegationProperties delegation) {
        this.delegation = delegation;
        return this;
    }

    /**
     * Get the partnerManagedResource property: The delegation for the Virtual Appliance.
     * 
     * @return the partnerManagedResource value.
     */
    public PartnerManagedResourceProperties partnerManagedResource() {
        return this.partnerManagedResource;
    }

    /**
     * Set the partnerManagedResource property: The delegation for the Virtual Appliance.
     * 
     * @param partnerManagedResource the partnerManagedResource value to set.
     * @return the NetworkVirtualAppliancePropertiesFormat object itself.
     */
    public NetworkVirtualAppliancePropertiesFormat
        withPartnerManagedResource(PartnerManagedResourceProperties partnerManagedResource) {
        this.partnerManagedResource = partnerManagedResource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nvaSku() != null) {
            nvaSku().validate();
        }
        if (virtualApplianceNics() != null) {
            virtualApplianceNics().forEach(e -> e.validate());
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (additionalNics() != null) {
            additionalNics().forEach(e -> e.validate());
        }
        if (internetIngressPublicIps() != null) {
            internetIngressPublicIps().forEach(e -> e.validate());
        }
        if (delegation() != null) {
            delegation().validate();
        }
        if (partnerManagedResource() != null) {
            partnerManagedResource().validate();
        }
    }
}
