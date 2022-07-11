// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the Shared Image Gallery that you want to update. */
@Fluent
public final class GalleryUpdate extends UpdateResourceDefinition {
    /*
     * Describes the properties of a Shared Image Gallery.
     */
    @JsonProperty(value = "properties")
    private GalleryProperties innerProperties;

    /**
     * Get the innerProperties property: Describes the properties of a Shared Image Gallery.
     *
     * @return the innerProperties value.
     */
    private GalleryProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @param description the description value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the identifier property: Describes the gallery unique name.
     *
     * @return the identifier value.
     */
    public GalleryIdentifier identifier() {
        return this.innerProperties() == null ? null : this.innerProperties().identifier();
    }

    /**
     * Set the identifier property: Describes the gallery unique name.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withIdentifier(GalleryIdentifier identifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryProperties();
        }
        this.innerProperties().withIdentifier(identifier);
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery or gallery artifact.
     *
     * <p>The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the sharingProfile property: Profile for gallery sharing to subscription or tenant.
     *
     * @return the sharingProfile value.
     */
    public SharingProfile sharingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().sharingProfile();
    }

    /**
     * Set the sharingProfile property: Profile for gallery sharing to subscription or tenant.
     *
     * @param sharingProfile the sharingProfile value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withSharingProfile(SharingProfile sharingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryProperties();
        }
        this.innerProperties().withSharingProfile(sharingProfile);
        return this;
    }

    /**
     * Get the softDeletePolicy property: Contains information about the soft deletion policy of the gallery.
     *
     * @return the softDeletePolicy value.
     */
    public SoftDeletePolicy softDeletePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().softDeletePolicy();
    }

    /**
     * Set the softDeletePolicy property: Contains information about the soft deletion policy of the gallery.
     *
     * @param softDeletePolicy the softDeletePolicy value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withSoftDeletePolicy(SoftDeletePolicy softDeletePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryProperties();
        }
        this.innerProperties().withSoftDeletePolicy(softDeletePolicy);
        return this;
    }

    /**
     * Get the sharingStatus property: Sharing status of current gallery.
     *
     * @return the sharingStatus value.
     */
    public SharingStatus sharingStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().sharingStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
