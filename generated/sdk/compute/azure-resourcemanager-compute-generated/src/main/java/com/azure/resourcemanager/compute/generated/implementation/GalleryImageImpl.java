// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.Architecture;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImage;
import com.azure.resourcemanager.compute.generated.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.GalleryImageUpdate;
import com.azure.resourcemanager.compute.generated.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class GalleryImageImpl implements GalleryImage, GalleryImage.Definition, GalleryImage.Update {
    private GalleryImageInner innerObject;

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

    public String description() {
        return this.innerModel().description();
    }

    public String eula() {
        return this.innerModel().eula();
    }

    public String privacyStatementUri() {
        return this.innerModel().privacyStatementUri();
    }

    public String releaseNoteUri() {
        return this.innerModel().releaseNoteUri();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public OperatingSystemStateTypes osState() {
        return this.innerModel().osState();
    }

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public OffsetDateTime endOfLifeDate() {
        return this.innerModel().endOfLifeDate();
    }

    public GalleryImageIdentifier identifier() {
        return this.innerModel().identifier();
    }

    public RecommendedMachineConfiguration recommended() {
        return this.innerModel().recommended();
    }

    public Disallowed disallowed() {
        return this.innerModel().disallowed();
    }

    public ImagePurchasePlan purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public GalleryProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<GalleryImageFeature> features() {
        List<GalleryImageFeature> inner = this.innerModel().features();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Architecture architecture() {
        return this.innerModel().architecture();
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

    public GalleryImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String galleryName;

    private String galleryImageName;

    private GalleryImageUpdate updateGalleryImage;

    public GalleryImageImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    public GalleryImage create() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), Context.NONE);
        return this;
    }

    public GalleryImage create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), context);
        return this;
    }

    GalleryImageImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new GalleryImageInner();
        this.serviceManager = serviceManager;
        this.galleryImageName = name;
    }

    public GalleryImageImpl update() {
        this.updateGalleryImage = new GalleryImageUpdate();
        return this;
    }

    public GalleryImage apply() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .update(resourceGroupName, galleryName, galleryImageName, updateGalleryImage, Context.NONE);
        return this;
    }

    public GalleryImage apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .update(resourceGroupName, galleryName, galleryImageName, updateGalleryImage, context);
        return this;
    }

    GalleryImageImpl(GalleryImageInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.galleryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "galleries");
        this.galleryImageName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "images");
    }

    public GalleryImage refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .getWithResponse(resourceGroupName, galleryName, galleryImageName, Context.NONE)
            .getValue();
        return this;
    }

    public GalleryImage refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleryImages()
            .getWithResponse(resourceGroupName, galleryName, galleryImageName, context)
            .getValue();
        return this;
    }

    public GalleryImageImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GalleryImageImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GalleryImageImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateGalleryImage.withTags(tags);
            return this;
        }
    }

    public GalleryImageImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateGalleryImage.withDescription(description);
            return this;
        }
    }

    public GalleryImageImpl withEula(String eula) {
        if (isInCreateMode()) {
            this.innerModel().withEula(eula);
            return this;
        } else {
            this.updateGalleryImage.withEula(eula);
            return this;
        }
    }

    public GalleryImageImpl withPrivacyStatementUri(String privacyStatementUri) {
        if (isInCreateMode()) {
            this.innerModel().withPrivacyStatementUri(privacyStatementUri);
            return this;
        } else {
            this.updateGalleryImage.withPrivacyStatementUri(privacyStatementUri);
            return this;
        }
    }

    public GalleryImageImpl withReleaseNoteUri(String releaseNoteUri) {
        if (isInCreateMode()) {
            this.innerModel().withReleaseNoteUri(releaseNoteUri);
            return this;
        } else {
            this.updateGalleryImage.withReleaseNoteUri(releaseNoteUri);
            return this;
        }
    }

    public GalleryImageImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.innerModel().withOsType(osType);
            return this;
        } else {
            this.updateGalleryImage.withOsType(osType);
            return this;
        }
    }

    public GalleryImageImpl withOsState(OperatingSystemStateTypes osState) {
        if (isInCreateMode()) {
            this.innerModel().withOsState(osState);
            return this;
        } else {
            this.updateGalleryImage.withOsState(osState);
            return this;
        }
    }

    public GalleryImageImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (isInCreateMode()) {
            this.innerModel().withHyperVGeneration(hyperVGeneration);
            return this;
        } else {
            this.updateGalleryImage.withHyperVGeneration(hyperVGeneration);
            return this;
        }
    }

    public GalleryImageImpl withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (isInCreateMode()) {
            this.innerModel().withEndOfLifeDate(endOfLifeDate);
            return this;
        } else {
            this.updateGalleryImage.withEndOfLifeDate(endOfLifeDate);
            return this;
        }
    }

    public GalleryImageImpl withIdentifier(GalleryImageIdentifier identifier) {
        if (isInCreateMode()) {
            this.innerModel().withIdentifier(identifier);
            return this;
        } else {
            this.updateGalleryImage.withIdentifier(identifier);
            return this;
        }
    }

    public GalleryImageImpl withRecommended(RecommendedMachineConfiguration recommended) {
        if (isInCreateMode()) {
            this.innerModel().withRecommended(recommended);
            return this;
        } else {
            this.updateGalleryImage.withRecommended(recommended);
            return this;
        }
    }

    public GalleryImageImpl withDisallowed(Disallowed disallowed) {
        if (isInCreateMode()) {
            this.innerModel().withDisallowed(disallowed);
            return this;
        } else {
            this.updateGalleryImage.withDisallowed(disallowed);
            return this;
        }
    }

    public GalleryImageImpl withPurchasePlan(ImagePurchasePlan purchasePlan) {
        if (isInCreateMode()) {
            this.innerModel().withPurchasePlan(purchasePlan);
            return this;
        } else {
            this.updateGalleryImage.withPurchasePlan(purchasePlan);
            return this;
        }
    }

    public GalleryImageImpl withFeatures(List<GalleryImageFeature> features) {
        if (isInCreateMode()) {
            this.innerModel().withFeatures(features);
            return this;
        } else {
            this.updateGalleryImage.withFeatures(features);
            return this;
        }
    }

    public GalleryImageImpl withArchitecture(Architecture architecture) {
        if (isInCreateMode()) {
            this.innerModel().withArchitecture(architecture);
            return this;
        } else {
            this.updateGalleryImage.withArchitecture(architecture);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
