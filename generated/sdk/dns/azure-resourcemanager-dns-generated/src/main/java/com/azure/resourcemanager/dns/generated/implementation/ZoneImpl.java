// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.generated.fluent.models.ZoneInner;
import com.azure.resourcemanager.dns.generated.models.SigningKey;
import com.azure.resourcemanager.dns.generated.models.Zone;
import com.azure.resourcemanager.dns.generated.models.ZoneType;
import com.azure.resourcemanager.dns.generated.models.ZoneUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ZoneImpl implements Zone, Zone.Definition, Zone.Update {
    private ZoneInner innerObject;

    private final com.azure.resourcemanager.dns.generated.DnsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

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

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Long maxNumberOfRecordSets() {
        return this.innerModel().maxNumberOfRecordSets();
    }

    public Long maxNumberOfRecordsPerRecordSet() {
        return this.innerModel().maxNumberOfRecordsPerRecordSet();
    }

    public Long numberOfRecordSets() {
        return this.innerModel().numberOfRecordSets();
    }

    public List<String> nameServers() {
        List<String> inner = this.innerModel().nameServers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ZoneType zoneType() {
        return this.innerModel().zoneType();
    }

    public List<SubResource> registrationVirtualNetworks() {
        List<SubResource> inner = this.innerModel().registrationVirtualNetworks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> resolutionVirtualNetworks() {
        List<SubResource> inner = this.innerModel().resolutionVirtualNetworks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SigningKey> signingKeys() {
        List<SigningKey> inner = this.innerModel().signingKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
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

    public ZoneInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dns.generated.DnsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String zoneName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private ZoneUpdate updateParameters;

    public ZoneImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Zone create() {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .createOrUpdateWithResponse(resourceGroupName, zoneName, this.innerModel(), createIfMatch,
                createIfNoneMatch, Context.NONE)
            .getValue();
        return this;
    }

    public Zone create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .createOrUpdateWithResponse(resourceGroupName, zoneName, this.innerModel(), createIfMatch,
                createIfNoneMatch, context)
            .getValue();
        return this;
    }

    ZoneImpl(String name, com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerObject = new ZoneInner();
        this.serviceManager = serviceManager;
        this.zoneName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public ZoneImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new ZoneUpdate();
        return this;
    }

    public Zone apply() {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .updateWithResponse(resourceGroupName, zoneName, updateParameters, updateIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public Zone apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .updateWithResponse(resourceGroupName, zoneName, updateParameters, updateIfMatch, context)
            .getValue();
        return this;
    }

    ZoneImpl(ZoneInner innerObject, com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.zoneName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dnsZones");
    }

    public Zone refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .getByResourceGroupWithResponse(resourceGroupName, zoneName, Context.NONE)
            .getValue();
        return this;
    }

    public Zone refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getZones()
            .getByResourceGroupWithResponse(resourceGroupName, zoneName, context)
            .getValue();
        return this;
    }

    public ZoneImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ZoneImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ZoneImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ZoneImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public ZoneImpl withZoneType(ZoneType zoneType) {
        this.innerModel().withZoneType(zoneType);
        return this;
    }

    public ZoneImpl withRegistrationVirtualNetworks(List<SubResource> registrationVirtualNetworks) {
        this.innerModel().withRegistrationVirtualNetworks(registrationVirtualNetworks);
        return this;
    }

    public ZoneImpl withResolutionVirtualNetworks(List<SubResource> resolutionVirtualNetworks) {
        this.innerModel().withResolutionVirtualNetworks(resolutionVirtualNetworks);
        return this;
    }

    public ZoneImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public ZoneImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
