// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.CommunityGalleryImageVersion;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageVersionStorageProfile;
import java.time.OffsetDateTime;

public final class CommunityGalleryImageVersionImpl implements CommunityGalleryImageVersion {
    private CommunityGalleryImageVersionInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    CommunityGalleryImageVersionImpl(CommunityGalleryImageVersionInner innerObject,
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

    public String type() {
        return this.innerModel().type();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public OffsetDateTime publishedDate() {
        return this.innerModel().publishedDate();
    }

    public OffsetDateTime endOfLifeDate() {
        return this.innerModel().endOfLifeDate();
    }

    public Boolean excludeFromLatest() {
        return this.innerModel().excludeFromLatest();
    }

    public SharedGalleryImageVersionStorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public CommunityGalleryImageVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
