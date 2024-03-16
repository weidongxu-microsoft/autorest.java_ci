// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NatGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.models.DdosSettings;
import com.azure.resourcemanager.network.generated.models.DeleteOptions;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpTag;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.NatGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressMigrationPhase;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressSku;
import com.azure.resourcemanager.network.generated.models.PublicIpDdosProtectionStatusResult;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PublicIpAddressImpl implements PublicIpAddress, PublicIpAddress.Definition, PublicIpAddress.Update {
    private PublicIpAddressInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public PublicIpAddressSku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public IpAllocationMethod publicIpAllocationMethod() {
        return this.innerModel().publicIpAllocationMethod();
    }

    public IpVersion publicIpAddressVersion() {
        return this.innerModel().publicIpAddressVersion();
    }

    public IpConfiguration ipConfiguration() {
        IpConfigurationInner inner = this.innerModel().ipConfiguration();
        if (inner != null) {
            return new IpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddressDnsSettings dnsSettings() {
        return this.innerModel().dnsSettings();
    }

    public DdosSettings ddosSettings() {
        return this.innerModel().ddosSettings();
    }

    public List<IpTag> ipTags() {
        List<IpTag> inner = this.innerModel().ipTags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public SubResource publicIpPrefix() {
        return this.innerModel().publicIpPrefix();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PublicIpAddress servicePublicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().servicePublicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NatGateway natGateway() {
        NatGatewayInner inner = this.innerModel().natGateway();
        if (inner != null) {
            return new NatGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddressMigrationPhase migrationPhase() {
        return this.innerModel().migrationPhase();
    }

    public PublicIpAddress linkedPublicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().linkedPublicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeleteOptions deleteOption() {
        return this.innerModel().deleteOption();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PublicIpAddressInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String publicIpAddressName;

    private TagsObject updateParameters;

    public PublicIpAddressImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PublicIpAddress create() {
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(resourceGroupName, publicIpAddressName, this.innerModel(), Context.NONE);
        return this;
    }

    public PublicIpAddress create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .createOrUpdate(resourceGroupName, publicIpAddressName, this.innerModel(), context);
        return this;
    }

    PublicIpAddressImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new PublicIpAddressInner();
        this.serviceManager = serviceManager;
        this.publicIpAddressName = name;
    }

    public PublicIpAddressImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public PublicIpAddress apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .updateTagsWithResponse(resourceGroupName, publicIpAddressName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public PublicIpAddress apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .updateTagsWithResponse(resourceGroupName, publicIpAddressName, updateParameters, context)
            .getValue();
        return this;
    }

    PublicIpAddressImpl(PublicIpAddressInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.publicIpAddressName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "publicIPAddresses");
    }

    public PublicIpAddress refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public PublicIpAddress refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getPublicIpAddresses()
            .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, localExpand, context)
            .getValue();
        return this;
    }

    public PublicIpDdosProtectionStatusResult ddosProtectionStatus() {
        return serviceManager.publicIpAddresses().ddosProtectionStatus(resourceGroupName, publicIpAddressName);
    }

    public PublicIpDdosProtectionStatusResult ddosProtectionStatus(Context context) {
        return serviceManager.publicIpAddresses().ddosProtectionStatus(resourceGroupName, publicIpAddressName, context);
    }

    public PublicIpAddressImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PublicIpAddressImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PublicIpAddressImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public PublicIpAddressImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public PublicIpAddressImpl withSku(PublicIpAddressSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public PublicIpAddressImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public PublicIpAddressImpl withPublicIpAllocationMethod(IpAllocationMethod publicIpAllocationMethod) {
        this.innerModel().withPublicIpAllocationMethod(publicIpAllocationMethod);
        return this;
    }

    public PublicIpAddressImpl withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.innerModel().withPublicIpAddressVersion(publicIpAddressVersion);
        return this;
    }

    public PublicIpAddressImpl withDnsSettings(PublicIpAddressDnsSettings dnsSettings) {
        this.innerModel().withDnsSettings(dnsSettings);
        return this;
    }

    public PublicIpAddressImpl withDdosSettings(DdosSettings ddosSettings) {
        this.innerModel().withDdosSettings(ddosSettings);
        return this;
    }

    public PublicIpAddressImpl withIpTags(List<IpTag> ipTags) {
        this.innerModel().withIpTags(ipTags);
        return this;
    }

    public PublicIpAddressImpl withIpAddress(String ipAddress) {
        this.innerModel().withIpAddress(ipAddress);
        return this;
    }

    public PublicIpAddressImpl withPublicIpPrefix(SubResource publicIpPrefix) {
        this.innerModel().withPublicIpPrefix(publicIpPrefix);
        return this;
    }

    public PublicIpAddressImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.innerModel().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    public PublicIpAddressImpl withServicePublicIpAddress(PublicIpAddressInner servicePublicIpAddress) {
        this.innerModel().withServicePublicIpAddress(servicePublicIpAddress);
        return this;
    }

    public PublicIpAddressImpl withNatGateway(NatGatewayInner natGateway) {
        this.innerModel().withNatGateway(natGateway);
        return this;
    }

    public PublicIpAddressImpl withMigrationPhase(PublicIpAddressMigrationPhase migrationPhase) {
        this.innerModel().withMigrationPhase(migrationPhase);
        return this;
    }

    public PublicIpAddressImpl withLinkedPublicIpAddress(PublicIpAddressInner linkedPublicIpAddress) {
        this.innerModel().withLinkedPublicIpAddress(linkedPublicIpAddress);
        return this;
    }

    public PublicIpAddressImpl withDeleteOption(DeleteOptions deleteOption) {
        this.innerModel().withDeleteOption(deleteOption);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
