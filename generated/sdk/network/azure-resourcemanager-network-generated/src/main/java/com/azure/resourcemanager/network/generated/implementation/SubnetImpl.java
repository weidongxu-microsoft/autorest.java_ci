// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.generated.fluent.models.RouteTableInner;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.Delegation;
import com.azure.resourcemanager.network.generated.models.IpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpConfigurationProfile;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.PrepareNetworkPoliciesRequest;
import com.azure.resourcemanager.network.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.generated.models.RouteTable;
import com.azure.resourcemanager.network.generated.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicy;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.UnprepareNetworkPoliciesRequest;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPrivateEndpointNetworkPolicies;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPrivateLinkServiceNetworkPolicies;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SubnetImpl implements Subnet, Subnet.Definition, Subnet.Update {
    private SubnetInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public List<String> addressPrefixes() {
        List<String> inner = this.innerModel().addressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.innerModel().networkSecurityGroup();
        if (inner != null) {
            return new NetworkSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RouteTable routeTable() {
        RouteTableInner inner = this.innerModel().routeTable();
        if (inner != null) {
            return new RouteTableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SubResource natGateway() {
        return this.innerModel().natGateway();
    }

    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        List<ServiceEndpointPropertiesFormat> inner = this.innerModel().serviceEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceEndpointPolicy> serviceEndpointPolicies() {
        List<ServiceEndpointPolicyInner> inner = this.innerModel().serviceEndpointPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new ServiceEndpointPolicyImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpoint> privateEndpoints() {
        List<PrivateEndpointInner> inner = this.innerModel().privateEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfiguration> ipConfigurations() {
        List<IpConfigurationInner> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new IpConfigurationImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpConfigurationProfile> ipConfigurationProfiles() {
        List<IpConfigurationProfileInner> inner = this.innerModel().ipConfigurationProfiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new IpConfigurationProfileImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> ipAllocations() {
        List<SubResource> inner = this.innerModel().ipAllocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceNavigationLink> resourceNavigationLinks() {
        List<ResourceNavigationLink> inner = this.innerModel().resourceNavigationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServiceAssociationLink> serviceAssociationLinks() {
        List<ServiceAssociationLink> inner = this.innerModel().serviceAssociationLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Delegation> delegations() {
        List<Delegation> inner = this.innerModel().delegations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String purpose() {
        return this.innerModel().purpose();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies() {
        return this.innerModel().privateEndpointNetworkPolicies();
    }

    public VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies() {
        return this.innerModel().privateLinkServiceNetworkPolicies();
    }

    public List<ApplicationGatewayIpConfiguration> applicationGatewayIpConfigurations() {
        List<ApplicationGatewayIpConfiguration> inner = this.innerModel().applicationGatewayIpConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean defaultOutboundAccess() {
        return this.innerModel().defaultOutboundAccess();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SubnetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkName;

    private String subnetName;

    public SubnetImpl withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualNetworkName = virtualNetworkName;
        return this;
    }

    public Subnet create() {
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.innerModel(), Context.NONE);
        return this;
    }

    public Subnet create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.innerModel(), context);
        return this;
    }

    SubnetImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new SubnetInner();
        this.serviceManager = serviceManager;
        this.subnetName = name;
    }

    public SubnetImpl update() {
        return this;
    }

    public Subnet apply() {
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.innerModel(), Context.NONE);
        return this;
    }

    public Subnet apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.innerModel(), context);
        return this;
    }

    SubnetImpl(SubnetInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualNetworks");
        this.subnetName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "subnets");
    }

    public Subnet refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .getWithResponse(resourceGroupName, virtualNetworkName, subnetName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public Subnet refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getSubnets()
            .getWithResponse(resourceGroupName, virtualNetworkName, subnetName, localExpand, context)
            .getValue();
        return this;
    }

    public void prepareNetworkPolicies(PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters) {
        serviceManager.subnets()
            .prepareNetworkPolicies(resourceGroupName, virtualNetworkName, subnetName,
                prepareNetworkPoliciesRequestParameters);
    }

    public void prepareNetworkPolicies(PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters,
        Context context) {
        serviceManager.subnets()
            .prepareNetworkPolicies(resourceGroupName, virtualNetworkName, subnetName,
                prepareNetworkPoliciesRequestParameters, context);
    }

    public void unprepareNetworkPolicies(UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters) {
        serviceManager.subnets()
            .unprepareNetworkPolicies(resourceGroupName, virtualNetworkName, subnetName,
                unprepareNetworkPoliciesRequestParameters);
    }

    public void unprepareNetworkPolicies(UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters,
        Context context) {
        serviceManager.subnets()
            .unprepareNetworkPolicies(resourceGroupName, virtualNetworkName, subnetName,
                unprepareNetworkPoliciesRequestParameters, context);
    }

    public SubnetImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public SubnetImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public SubnetImpl withAddressPrefix(String addressPrefix) {
        this.innerModel().withAddressPrefix(addressPrefix);
        return this;
    }

    public SubnetImpl withAddressPrefixes(List<String> addressPrefixes) {
        this.innerModel().withAddressPrefixes(addressPrefixes);
        return this;
    }

    public SubnetImpl withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.innerModel().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    public SubnetImpl withRouteTable(RouteTableInner routeTable) {
        this.innerModel().withRouteTable(routeTable);
        return this;
    }

    public SubnetImpl withNatGateway(SubResource natGateway) {
        this.innerModel().withNatGateway(natGateway);
        return this;
    }

    public SubnetImpl withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.innerModel().withServiceEndpoints(serviceEndpoints);
        return this;
    }

    public SubnetImpl withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies) {
        this.innerModel().withServiceEndpointPolicies(serviceEndpointPolicies);
        return this;
    }

    public SubnetImpl withIpAllocations(List<SubResource> ipAllocations) {
        this.innerModel().withIpAllocations(ipAllocations);
        return this;
    }

    public SubnetImpl withDelegations(List<Delegation> delegations) {
        this.innerModel().withDelegations(delegations);
        return this;
    }

    public SubnetImpl withPrivateEndpointNetworkPolicies(
        VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies) {
        this.innerModel().withPrivateEndpointNetworkPolicies(privateEndpointNetworkPolicies);
        return this;
    }

    public SubnetImpl withPrivateLinkServiceNetworkPolicies(
        VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies) {
        this.innerModel().withPrivateLinkServiceNetworkPolicies(privateLinkServiceNetworkPolicies);
        return this;
    }

    public SubnetImpl withApplicationGatewayIpConfigurations(
        List<ApplicationGatewayIpConfiguration> applicationGatewayIpConfigurations) {
        this.innerModel().withApplicationGatewayIpConfigurations(applicationGatewayIpConfigurations);
        return this;
    }

    public SubnetImpl withDefaultOutboundAccess(Boolean defaultOutboundAccess) {
        this.innerModel().withDefaultOutboundAccess(defaultOutboundAccess);
        return this;
    }
}
