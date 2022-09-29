// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionSafetyProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the gallery Application Version that you want to create or update. */
@Fluent
public final class GalleryApplicationVersionInner extends Resource {
    /*
     * Describes the properties of a gallery image version.
     */
    @JsonProperty(value = "properties")
    private GalleryApplicationVersionProperties innerProperties;

    /** Creates an instance of GalleryApplicationVersionInner class. */
    public GalleryApplicationVersionInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a gallery image version.
     *
     * @return the innerProperties value.
     */
    private GalleryApplicationVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @return the publishingProfile value.
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingProfile();
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryApplicationVersionInner object itself.
     */
    public GalleryApplicationVersionInner withPublishingProfile(
        GalleryApplicationVersionPublishingProfile publishingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationVersionProperties();
        }
        this.innerProperties().withPublishingProfile(publishingProfile);
        return this;
    }

    /**
     * Get the safetyProfile property: The safety profile of the Gallery Application Version.
     *
     * @return the safetyProfile value.
     */
    public GalleryApplicationVersionSafetyProfile safetyProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().safetyProfile();
    }

    /**
     * Set the safetyProfile property: The safety profile of the Gallery Application Version.
     *
     * @param safetyProfile the safetyProfile value to set.
     * @return the GalleryApplicationVersionInner object itself.
     */
    public GalleryApplicationVersionInner withSafetyProfile(GalleryApplicationVersionSafetyProfile safetyProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationVersionProperties();
        }
        this.innerProperties().withSafetyProfile(safetyProfile);
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
     * Get the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
