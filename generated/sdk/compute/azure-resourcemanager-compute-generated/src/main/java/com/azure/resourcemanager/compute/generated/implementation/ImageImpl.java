// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.ImageInner;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.generated.models.Image;
import com.azure.resourcemanager.compute.generated.models.ImageStorageProfile;
import com.azure.resourcemanager.compute.generated.models.ImageUpdate;
import java.util.Collections;
import java.util.Map;

public final class ImageImpl implements Image, Image.Definition, Image.Update {
    private ImageInner innerObject;

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

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SubResource sourceVirtualMachine() {
        return this.innerModel().sourceVirtualMachine();
    }

    public ImageStorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HyperVGenerationTypes hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
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

    public ImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String imageName;

    private ImageUpdate updateParameters;

    public ImageImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Image create() {
        this.innerObject = serviceManager.serviceClient().getImages().createOrUpdate(resourceGroupName, imageName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public Image create(Context context) {
        this.innerObject = serviceManager.serviceClient().getImages().createOrUpdate(resourceGroupName, imageName,
            this.innerModel(), context);
        return this;
    }

    ImageImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new ImageInner();
        this.serviceManager = serviceManager;
        this.imageName = name;
    }

    public ImageImpl update() {
        this.updateParameters = new ImageUpdate();
        return this;
    }

    public Image apply() {
        this.innerObject = serviceManager.serviceClient().getImages().update(resourceGroupName, imageName,
            updateParameters, Context.NONE);
        return this;
    }

    public Image apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getImages().update(resourceGroupName, imageName,
            updateParameters, context);
        return this;
    }

    ImageImpl(ImageInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.imageName = Utils.getValueFromIdByName(innerObject.id(), "images");
    }

    public Image refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient().getImages()
            .getByResourceGroupWithResponse(resourceGroupName, imageName, localExpand, Context.NONE).getValue();
        return this;
    }

    public Image refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient().getImages()
            .getByResourceGroupWithResponse(resourceGroupName, imageName, localExpand, context).getValue();
        return this;
    }

    public ImageImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ImageImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ImageImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ImageImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public ImageImpl withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        if (isInCreateMode()) {
            this.innerModel().withSourceVirtualMachine(sourceVirtualMachine);
            return this;
        } else {
            this.updateParameters.withSourceVirtualMachine(sourceVirtualMachine);
            return this;
        }
    }

    public ImageImpl withStorageProfile(ImageStorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.innerModel().withStorageProfile(storageProfile);
            return this;
        } else {
            this.updateParameters.withStorageProfile(storageProfile);
            return this;
        }
    }

    public ImageImpl withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        if (isInCreateMode()) {
            this.innerModel().withHyperVGeneration(hyperVGeneration);
            return this;
        } else {
            this.updateParameters.withHyperVGeneration(hyperVGeneration);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
