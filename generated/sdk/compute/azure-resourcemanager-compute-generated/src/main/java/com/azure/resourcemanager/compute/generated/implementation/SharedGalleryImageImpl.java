// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.Architecture;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImage;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SharedGalleryImageImpl implements SharedGalleryImage {
    private SharedGalleryImageInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    SharedGalleryImageImpl(SharedGalleryImageInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public OperatingSystemStateTypes osState() {
        return this.innerModel().osState();
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

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public List<GalleryImageFeature> features() {
        List<GalleryImageFeature> inner = this.innerModel().features();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ImagePurchasePlan purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public Architecture architecture() {
        return this.innerModel().architecture();
    }

    public String privacyStatementUri() {
        return this.innerModel().privacyStatementUri();
    }

    public String eula() {
        return this.innerModel().eula();
    }

    public Map<String, String> artifactTags() {
        Map<String, String> inner = this.innerModel().artifactTags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SharedGalleryImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
