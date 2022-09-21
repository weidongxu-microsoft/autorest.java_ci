// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the gallery image version that you want to update. */
@Fluent
public final class GalleryImageVersionUpdate extends UpdateResourceDefinition {
    /*
     * Describes the properties of a gallery image version.
     */
    @JsonProperty(value = "properties")
    private GalleryImageVersionProperties innerProperties;

    /** Creates an instance of GalleryImageVersionUpdate class. */
    public GalleryImageVersionUpdate() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a gallery image version.
     *
     * @return the innerProperties value.
     */
    private GalleryImageVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image Version.
     *
     * @return the publishingProfile value.
     */
    public GalleryImageVersionPublishingProfile publishingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingProfile();
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image Version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryImageVersionUpdate object itself.
     */
    public GalleryImageVersionUpdate withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageVersionProperties();
        }
        this.innerProperties().withPublishingProfile(publishingProfile);
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
     * Get the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @return the storageProfile value.
     */
    public GalleryImageVersionStorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: This is the storage profile of a Gallery Image Version.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the GalleryImageVersionUpdate object itself.
     */
    public GalleryImageVersionUpdate withStorageProfile(GalleryImageVersionStorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageVersionProperties();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
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
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
