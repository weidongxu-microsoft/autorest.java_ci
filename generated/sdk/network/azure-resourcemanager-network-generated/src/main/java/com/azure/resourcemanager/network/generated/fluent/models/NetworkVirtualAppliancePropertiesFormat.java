// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.DelegationProperties;
import com.azure.resourcemanager.network.generated.models.InternetIngressPublicIpsProperties;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualAppliancePropertiesFormatNetworkProfile;
import com.azure.resourcemanager.network.generated.models.PartnerManagedResourceProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceAdditionalNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.generated.models.VirtualApplianceSkuProperties;
import java.io.IOException;
import java.util.List;

/**
 * Network Virtual Appliance definition.
 */
@Fluent
public final class NetworkVirtualAppliancePropertiesFormat
    implements JsonSerializable<NetworkVirtualAppliancePropertiesFormat> {
    /*
     * Network Virtual Appliance SKU.
     */
    private VirtualApplianceSkuProperties nvaSku;

    /*
     * Address Prefix.
     */
    private String addressPrefix;

    /*
     * BootStrapConfigurationBlobs storage URLs.
     */
    private List<String> bootStrapConfigurationBlobs;

    /*
     * The Virtual Hub where Network Virtual Appliance is being deployed.
     */
    private SubResource virtualHub;

    /*
     * CloudInitConfigurationBlob storage URLs.
     */
    private List<String> cloudInitConfigurationBlobs;

    /*
     * CloudInitConfiguration string in plain text.
     */
    private String cloudInitConfiguration;

    /*
     * VirtualAppliance ASN. Microsoft private, public and IANA reserved ASN are not supported.
     */
    private Long virtualApplianceAsn;

    /*
     * Public key for SSH login.
     */
    private String sshPublicKey;

    /*
     * List of Virtual Appliance Network Interfaces.
     */
    private List<VirtualApplianceNicProperties> virtualApplianceNics;

    /*
     * Network Profile containing configurations for Public and Private NIC.
     */
    private NetworkVirtualAppliancePropertiesFormatNetworkProfile networkProfile;

    /*
     * Details required for Additional Network Interface.
     */
    private List<VirtualApplianceAdditionalNicProperties> additionalNics;

    /*
     * List of Resource Uri of Public IPs for Internet Ingress Scenario.
     */
    private List<InternetIngressPublicIpsProperties> internetIngressPublicIps;

    /*
     * List of references to VirtualApplianceSite.
     */
    private List<SubResource> virtualApplianceSites;

    /*
     * List of references to VirtualApplianceConnections.
     */
    private List<SubResource> virtualApplianceConnections;

    /*
     * List of references to InboundSecurityRules.
     */
    private List<SubResource> inboundSecurityRules;

    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The deployment type. PartnerManaged for the SaaS NVA
     */
    private String deploymentType;

    /*
     * The delegation for the Virtual Appliance
     */
    private DelegationProperties delegation;

    /*
     * The delegation for the Virtual Appliance
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("nvaSku", this.nvaSku);
        jsonWriter.writeArrayField("bootStrapConfigurationBlobs", this.bootStrapConfigurationBlobs,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("virtualHub", this.virtualHub);
        jsonWriter.writeArrayField("cloudInitConfigurationBlobs", this.cloudInitConfigurationBlobs,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("cloudInitConfiguration", this.cloudInitConfiguration);
        jsonWriter.writeNumberField("virtualApplianceAsn", this.virtualApplianceAsn);
        jsonWriter.writeStringField("sshPublicKey", this.sshPublicKey);
        jsonWriter.writeJsonField("networkProfile", this.networkProfile);
        jsonWriter.writeArrayField("additionalNics", this.additionalNics,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("internetIngressPublicIps", this.internetIngressPublicIps,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("delegation", this.delegation);
        jsonWriter.writeJsonField("partnerManagedResource", this.partnerManagedResource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkVirtualAppliancePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkVirtualAppliancePropertiesFormat if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkVirtualAppliancePropertiesFormat.
     */
    public static NetworkVirtualAppliancePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkVirtualAppliancePropertiesFormat deserializedNetworkVirtualAppliancePropertiesFormat
                = new NetworkVirtualAppliancePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nvaSku".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.nvaSku
                        = VirtualApplianceSkuProperties.fromJson(reader);
                } else if ("addressPrefix".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.addressPrefix = reader.getString();
                } else if ("bootStrapConfigurationBlobs".equals(fieldName)) {
                    List<String> bootStrapConfigurationBlobs = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkVirtualAppliancePropertiesFormat.bootStrapConfigurationBlobs
                        = bootStrapConfigurationBlobs;
                } else if ("virtualHub".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.virtualHub = SubResource.fromJson(reader);
                } else if ("cloudInitConfigurationBlobs".equals(fieldName)) {
                    List<String> cloudInitConfigurationBlobs = reader.readArray(reader1 -> reader1.getString());
                    deserializedNetworkVirtualAppliancePropertiesFormat.cloudInitConfigurationBlobs
                        = cloudInitConfigurationBlobs;
                } else if ("cloudInitConfiguration".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.cloudInitConfiguration = reader.getString();
                } else if ("virtualApplianceAsn".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.virtualApplianceAsn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("sshPublicKey".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.sshPublicKey = reader.getString();
                } else if ("virtualApplianceNics".equals(fieldName)) {
                    List<VirtualApplianceNicProperties> virtualApplianceNics
                        = reader.readArray(reader1 -> VirtualApplianceNicProperties.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.virtualApplianceNics = virtualApplianceNics;
                } else if ("networkProfile".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.networkProfile
                        = NetworkVirtualAppliancePropertiesFormatNetworkProfile.fromJson(reader);
                } else if ("additionalNics".equals(fieldName)) {
                    List<VirtualApplianceAdditionalNicProperties> additionalNics
                        = reader.readArray(reader1 -> VirtualApplianceAdditionalNicProperties.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.additionalNics = additionalNics;
                } else if ("internetIngressPublicIps".equals(fieldName)) {
                    List<InternetIngressPublicIpsProperties> internetIngressPublicIps
                        = reader.readArray(reader1 -> InternetIngressPublicIpsProperties.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.internetIngressPublicIps
                        = internetIngressPublicIps;
                } else if ("virtualApplianceSites".equals(fieldName)) {
                    List<SubResource> virtualApplianceSites
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.virtualApplianceSites = virtualApplianceSites;
                } else if ("virtualApplianceConnections".equals(fieldName)) {
                    List<SubResource> virtualApplianceConnections
                        = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.virtualApplianceConnections
                        = virtualApplianceConnections;
                } else if ("inboundSecurityRules".equals(fieldName)) {
                    List<SubResource> inboundSecurityRules = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedNetworkVirtualAppliancePropertiesFormat.inboundSecurityRules = inboundSecurityRules;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("deploymentType".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.deploymentType = reader.getString();
                } else if ("delegation".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.delegation
                        = DelegationProperties.fromJson(reader);
                } else if ("partnerManagedResource".equals(fieldName)) {
                    deserializedNetworkVirtualAppliancePropertiesFormat.partnerManagedResource
                        = PartnerManagedResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkVirtualAppliancePropertiesFormat;
        });
    }
}
