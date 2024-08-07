// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryInner;
import com.azure.resourcemanager.compute.generated.models.SharedGallery;
import java.util.Collections;
import java.util.Map;

public final class SharedGalleryImpl implements SharedGallery {
    private SharedGalleryInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    SharedGalleryImpl(SharedGalleryInner innerObject,
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

    public Map<String, String> artifactTags() {
        Map<String, String> inner = this.innerModel().artifactTags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SharedGalleryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
