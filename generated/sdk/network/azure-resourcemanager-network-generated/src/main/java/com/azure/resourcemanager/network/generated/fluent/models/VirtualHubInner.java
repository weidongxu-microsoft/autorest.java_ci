// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.PreferredRoutingGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingState;
import com.azure.resourcemanager.network.generated.models.VirtualHubRouteTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VirtualHub Resource. */
@Fluent
public final class VirtualHubInner extends Resource {
    /*
     * Properties of the virtual hub.
     */
    @JsonProperty(value = "properties")
    private VirtualHubProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Kind of service virtual hub. This is metadata used for the Azure portal
     * experience for Route Server.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the virtual hub.
     *
     * @return the innerProperties value.
     */
    private VirtualHubProperties innerProperties() {
        return this.innerProperties;
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
     * Get the kind property: Kind of service virtual hub. This is metadata used for the Azure portal experience for
     * Route Server.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
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
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualHubInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualHubInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualWan();
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualWan(SubResource virtualWan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withVirtualWan(virtualWan);
        return this;
    }

    /**
     * Get the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value.
     */
    public SubResource vpnGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGateway();
    }

    /**
     * Set the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @param vpnGateway the vpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVpnGateway(SubResource vpnGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withVpnGateway(vpnGateway);
        return this;
    }

    /**
     * Get the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value.
     */
    public SubResource p2SVpnGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().p2SVpnGateway();
    }

    /**
     * Set the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @param p2SVpnGateway the p2SVpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withP2SVpnGateway(SubResource p2SVpnGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withP2SVpnGateway(p2SVpnGateway);
        return this;
    }

    /**
     * Get the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value.
     */
    public SubResource expressRouteGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteGateway();
    }

    /**
     * Set the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @param expressRouteGateway the expressRouteGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withExpressRouteGateway(SubResource expressRouteGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withExpressRouteGateway(expressRouteGateway);
        return this;
    }

    /**
     * Get the azureFirewall property: The azureFirewall associated with this VirtualHub.
     *
     * @return the azureFirewall value.
     */
    public SubResource azureFirewall() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFirewall();
    }

    /**
     * Set the azureFirewall property: The azureFirewall associated with this VirtualHub.
     *
     * @param azureFirewall the azureFirewall value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAzureFirewall(SubResource azureFirewall) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withAzureFirewall(azureFirewall);
        return this;
    }

    /**
     * Get the securityPartnerProvider property: The securityPartnerProvider associated with this VirtualHub.
     *
     * @return the securityPartnerProvider value.
     */
    public SubResource securityPartnerProvider() {
        return this.innerProperties() == null ? null : this.innerProperties().securityPartnerProvider();
    }

    /**
     * Set the securityPartnerProvider property: The securityPartnerProvider associated with this VirtualHub.
     *
     * @param securityPartnerProvider the securityPartnerProvider value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSecurityPartnerProvider(SubResource securityPartnerProvider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withSecurityPartnerProvider(securityPartnerProvider);
        return this;
    }

    /**
     * Get the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the routeTable property: The routeTable associated with this virtual hub.
     *
     * @return the routeTable value.
     */
    public VirtualHubRouteTable routeTable() {
        return this.innerProperties() == null ? null : this.innerProperties().routeTable();
    }

    /**
     * Set the routeTable property: The routeTable associated with this virtual hub.
     *
     * @param routeTable the routeTable value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withRouteTable(VirtualHubRouteTable routeTable) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withRouteTable(routeTable);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual hub resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the securityProviderName property: The Security Provider name.
     *
     * @return the securityProviderName value.
     */
    public String securityProviderName() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProviderName();
    }

    /**
     * Set the securityProviderName property: The Security Provider name.
     *
     * @param securityProviderName the securityProviderName value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSecurityProviderName(String securityProviderName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withSecurityProviderName(securityProviderName);
        return this;
    }

    /**
     * Get the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with this
     * VirtualHub.
     *
     * @return the virtualHubRouteTableV2S value.
     */
    public List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHubRouteTableV2S();
    }

    /**
     * Set the virtualHubRouteTableV2S property: List of all virtual hub route table v2s associated with this
     * VirtualHub.
     *
     * @param virtualHubRouteTableV2S the virtualHubRouteTableV2S value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualHubRouteTableV2S(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withVirtualHubRouteTableV2S(virtualHubRouteTableV2S);
        return this;
    }

    /**
     * Get the sku property: The sku of this VirtualHub.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The sku of this VirtualHub.
     *
     * @param sku the sku value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSku(String sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the routingState property: The routing state.
     *
     * @return the routingState value.
     */
    public RoutingState routingState() {
        return this.innerProperties() == null ? null : this.innerProperties().routingState();
    }

    /**
     * Get the bgpConnections property: List of references to Bgp Connections.
     *
     * @return the bgpConnections value.
     */
    public List<SubResource> bgpConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpConnections();
    }

    /**
     * Get the ipConfigurations property: List of references to IpConfigurations.
     *
     * @return the ipConfigurations value.
     */
    public List<SubResource> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualRouterAsn();
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualRouterAsn(Long virtualRouterAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withVirtualRouterAsn(virtualRouterAsn);
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     *
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualRouterIps();
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     *
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualRouterIps(List<String> virtualRouterIps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withVirtualRouterIps(virtualRouterIps);
        return this;
    }

    /**
     * Get the allowBranchToBranchTraffic property: Flag to control transit for VirtualRouter hub.
     *
     * @return the allowBranchToBranchTraffic value.
     */
    public Boolean allowBranchToBranchTraffic() {
        return this.innerProperties() == null ? null : this.innerProperties().allowBranchToBranchTraffic();
    }

    /**
     * Set the allowBranchToBranchTraffic property: Flag to control transit for VirtualRouter hub.
     *
     * @param allowBranchToBranchTraffic the allowBranchToBranchTraffic value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withAllowBranchToBranchTraffic(allowBranchToBranchTraffic);
        return this;
    }

    /**
     * Get the preferredRoutingGateway property: The preferred gateway to route on-prem traffic.
     *
     * @return the preferredRoutingGateway value.
     */
    public PreferredRoutingGateway preferredRoutingGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredRoutingGateway();
    }

    /**
     * Set the preferredRoutingGateway property: The preferred gateway to route on-prem traffic.
     *
     * @param preferredRoutingGateway the preferredRoutingGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withPreferredRoutingGateway(PreferredRoutingGateway preferredRoutingGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualHubProperties();
        }
        this.innerProperties().withPreferredRoutingGateway(preferredRoutingGateway);
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
