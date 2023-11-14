// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpGroups;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallSku;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.HubIpAddresses;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Azure Firewall resource.
 */
@Fluent
public final class AzureFirewallInner extends Resource {
    /*
     * Properties of the azure firewall.
     */
    @JsonProperty(value = "properties")
    private AzureFirewallPropertiesFormat innerProperties;

    /*
     * A list of availability zones denoting where the resource needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of AzureFirewallInner class.
     */
    public AzureFirewallInner() {
    }

    /**
     * Get the innerProperties property: Properties of the azure firewall.
     * 
     * @return the innerProperties value.
     */
    private AzureFirewallPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     * 
     * @param zones the zones value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFirewallInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFirewallInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     * 
     * @return the applicationRuleCollections value.
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationRuleCollections();
    }

    /**
     * Set the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     * 
     * @param applicationRuleCollections the applicationRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner
        withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withApplicationRuleCollections(applicationRuleCollections);
        return this;
    }

    /**
     * Get the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     * 
     * @return the natRuleCollections value.
     */
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.innerProperties() == null ? null : this.innerProperties().natRuleCollections();
    }

    /**
     * Set the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     * 
     * @param natRuleCollections the natRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withNatRuleCollections(natRuleCollections);
        return this;
    }

    /**
     * Get the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     * 
     * @return the networkRuleCollections value.
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleCollections();
    }

    /**
     * Set the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     * 
     * @param networkRuleCollections the networkRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner
        withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withNetworkRuleCollections(networkRuleCollections);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Azure Firewall resource.
     * 
     * @return the ipConfigurations value.
     */
    public List<AzureFirewallIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Azure Firewall resource.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the managementIpConfiguration property: IP configuration of the Azure Firewall used for management traffic.
     * 
     * @return the managementIpConfiguration value.
     */
    public AzureFirewallIpConfiguration managementIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().managementIpConfiguration();
    }

    /**
     * Set the managementIpConfiguration property: IP configuration of the Azure Firewall used for management traffic.
     * 
     * @param managementIpConfiguration the managementIpConfiguration value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withManagementIpConfiguration(AzureFirewallIpConfiguration managementIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withManagementIpConfiguration(managementIpConfiguration);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.innerProperties() == null ? null : this.innerProperties().threatIntelMode();
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     * 
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withThreatIntelMode(threatIntelMode);
        return this;
    }

    /**
     * Get the virtualHub property: The virtualHub to which the firewall belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The virtualHub to which the firewall belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Get the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     * 
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallPolicy();
    }

    /**
     * Set the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     * 
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withFirewallPolicy(SubResource firewallPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withFirewallPolicy(firewallPolicy);
        return this;
    }

    /**
     * Get the hubIpAddresses property: IP addresses associated with AzureFirewall.
     * 
     * @return the hubIpAddresses value.
     */
    public HubIpAddresses hubIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().hubIpAddresses();
    }

    /**
     * Set the hubIpAddresses property: IP addresses associated with AzureFirewall.
     * 
     * @param hubIpAddresses the hubIpAddresses value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withHubIpAddresses(HubIpAddresses hubIpAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withHubIpAddresses(hubIpAddresses);
        return this;
    }

    /**
     * Get the ipGroups property: IpGroups associated with AzureFirewall.
     * 
     * @return the ipGroups value.
     */
    public List<AzureFirewallIpGroups> ipGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().ipGroups();
    }

    /**
     * Get the sku property: The Azure Firewall Resource SKU.
     * 
     * @return the sku value.
     */
    public AzureFirewallSku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The Azure Firewall Resource SKU.
     * 
     * @param sku the sku value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withSku(AzureFirewallSku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the additionalProperties property: The additional properties used to further config this azure firewall.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, String> additionalProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalProperties();
    }

    /**
     * Set the additionalProperties property: The additional properties used to further config this azure firewall.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withAdditionalProperties(Map<String, String> additionalProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureFirewallPropertiesFormat();
        }
        this.innerProperties().withAdditionalProperties(additionalProperties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
