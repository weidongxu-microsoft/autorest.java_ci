// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInner;
import com.azure.resourcemanager.compute.generated.models.CloudService;
import com.azure.resourcemanager.compute.generated.models.CloudServiceProperties;
import com.azure.resourcemanager.compute.generated.models.CloudServiceUpdate;
import com.azure.resourcemanager.compute.generated.models.RoleInstances;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CloudServiceImpl implements CloudService, CloudService.Definition, CloudService.Update {
    private CloudServiceInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

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

    public CloudServiceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
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

    public CloudServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String cloudServiceName;

    private CloudServiceUpdate updateParameters;

    public CloudServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CloudService create() {
        this.innerObject = serviceManager.serviceClient().getCloudServices().createOrUpdate(resourceGroupName,
            cloudServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public CloudService create(Context context) {
        this.innerObject = serviceManager.serviceClient().getCloudServices().createOrUpdate(resourceGroupName,
            cloudServiceName, this.innerModel(), context);
        return this;
    }

    CloudServiceImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new CloudServiceInner();
        this.serviceManager = serviceManager;
        this.cloudServiceName = name;
    }

    public CloudServiceImpl update() {
        this.updateParameters = new CloudServiceUpdate();
        return this;
    }

    public CloudService apply() {
        this.innerObject = serviceManager.serviceClient().getCloudServices().update(resourceGroupName, cloudServiceName,
            updateParameters, Context.NONE);
        return this;
    }

    public CloudService apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getCloudServices().update(resourceGroupName, cloudServiceName,
            updateParameters, context);
        return this;
    }

    CloudServiceImpl(CloudServiceInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.cloudServiceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "cloudServices");
    }

    public CloudService refresh() {
        this.innerObject = serviceManager.serviceClient().getCloudServices()
            .getByResourceGroupWithResponse(resourceGroupName, cloudServiceName, Context.NONE).getValue();
        return this;
    }

    public CloudService refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCloudServices()
            .getByResourceGroupWithResponse(resourceGroupName, cloudServiceName, context).getValue();
        return this;
    }

    public void start() {
        serviceManager.cloudServices().start(resourceGroupName, cloudServiceName);
    }

    public void start(Context context) {
        serviceManager.cloudServices().start(resourceGroupName, cloudServiceName, context);
    }

    public void powerOff() {
        serviceManager.cloudServices().powerOff(resourceGroupName, cloudServiceName);
    }

    public void powerOff(Context context) {
        serviceManager.cloudServices().powerOff(resourceGroupName, cloudServiceName, context);
    }

    public void restart() {
        serviceManager.cloudServices().restart(resourceGroupName, cloudServiceName);
    }

    public void restart(RoleInstances parameters, Context context) {
        serviceManager.cloudServices().restart(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void reimage() {
        serviceManager.cloudServices().reimage(resourceGroupName, cloudServiceName);
    }

    public void reimage(RoleInstances parameters, Context context) {
        serviceManager.cloudServices().reimage(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void rebuild() {
        serviceManager.cloudServices().rebuild(resourceGroupName, cloudServiceName);
    }

    public void rebuild(RoleInstances parameters, Context context) {
        serviceManager.cloudServices().rebuild(resourceGroupName, cloudServiceName, parameters, context);
    }

    public void deleteInstances() {
        serviceManager.cloudServices().deleteInstances(resourceGroupName, cloudServiceName);
    }

    public void deleteInstances(RoleInstances parameters, Context context) {
        serviceManager.cloudServices().deleteInstances(resourceGroupName, cloudServiceName, parameters, context);
    }

    public CloudServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CloudServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CloudServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public CloudServiceImpl withProperties(CloudServiceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public CloudServiceImpl withSystemData(SystemData systemData) {
        this.innerModel().withSystemData(systemData);
        return this;
    }

    public CloudServiceImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
