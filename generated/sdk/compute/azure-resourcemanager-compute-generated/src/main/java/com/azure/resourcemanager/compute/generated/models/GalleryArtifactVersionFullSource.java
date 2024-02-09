// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The source of the gallery artifact version.
 */
@Fluent
public final class GalleryArtifactVersionFullSource extends GalleryArtifactVersionSource {
    /*
     * The resource Id of the source Community Gallery Image. Only required when using Community Gallery Image as a
     * source.
     */
    @JsonProperty(value = "communityGalleryImageId")
    private String communityGalleryImageId;

    /*
     * The resource Id of the source virtual machine. Only required when capturing a virtual machine to source this
     * Gallery Image Version.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /**
     * Creates an instance of GalleryArtifactVersionFullSource class.
     */
    public GalleryArtifactVersionFullSource() {
    }

    /**
     * Get the communityGalleryImageId property: The resource Id of the source Community Gallery Image. Only required
     * when using Community Gallery Image as a source.
     * 
     * @return the communityGalleryImageId value.
     */
    public String communityGalleryImageId() {
        return this.communityGalleryImageId;
    }

    /**
     * Set the communityGalleryImageId property: The resource Id of the source Community Gallery Image. Only required
     * when using Community Gallery Image as a source.
     * 
     * @param communityGalleryImageId the communityGalleryImageId value to set.
     * @return the GalleryArtifactVersionFullSource object itself.
     */
    public GalleryArtifactVersionFullSource withCommunityGalleryImageId(String communityGalleryImageId) {
        this.communityGalleryImageId = communityGalleryImageId;
        return this;
    }

    /**
     * Get the virtualMachineId property: The resource Id of the source virtual machine. Only required when capturing
     * a virtual machine to source this Gallery Image Version.
     * 
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set the virtualMachineId property: The resource Id of the source virtual machine. Only required when capturing
     * a virtual machine to source this Gallery Image Version.
     * 
     * @param virtualMachineId the virtualMachineId value to set.
     * @return the GalleryArtifactVersionFullSource object itself.
     */
    public GalleryArtifactVersionFullSource withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GalleryArtifactVersionFullSource withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
