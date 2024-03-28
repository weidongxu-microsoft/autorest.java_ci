// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageVersionStorageProfile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Describes the properties of a gallery image version.
 */
@Fluent
public final class CommunityGalleryImageVersionProperties {
    /*
     * The published date of the gallery image version Definition. This property can be used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "publishedDate")
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery image version Definition. This property can be used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     */
    @JsonProperty(value = "excludeFromLatest")
    private Boolean excludeFromLatest;

    /*
     * Describes the storage profile of the image version.
     */
    @JsonProperty(value = "storageProfile")
    private SharedGalleryImageVersionStorageProfile storageProfile;

    /*
     * The disclaimer for a community gallery resource.
     */
    @JsonProperty(value = "disclaimer")
    private String disclaimer;

    /*
     * The artifact tags of a community gallery resource.
     */
    @JsonProperty(value = "artifactTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> artifactTags;

    /**
     * Creates an instance of CommunityGalleryImageVersionProperties class.
     */
    public CommunityGalleryImageVersionProperties() {
    }

    /**
     * Get the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Set the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     * 
     * @param publishedDate the publishedDate value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     * 
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     * 
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the storageProfile property: Describes the storage profile of the image version.
     * 
     * @return the storageProfile value.
     */
    public SharedGalleryImageVersionStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Describes the storage profile of the image version.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties
        withStorageProfile(SharedGalleryImageVersionStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the disclaimer property: The disclaimer for a community gallery resource.
     * 
     * @return the disclaimer value.
     */
    public String disclaimer() {
        return this.disclaimer;
    }

    /**
     * Set the disclaimer property: The disclaimer for a community gallery resource.
     * 
     * @param disclaimer the disclaimer value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties withDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
        return this;
    }

    /**
     * Get the artifactTags property: The artifact tags of a community gallery resource.
     * 
     * @return the artifactTags value.
     */
    public Map<String, String> artifactTags() {
        return this.artifactTags;
    }

    /**
     * Set the artifactTags property: The artifact tags of a community gallery resource.
     * 
     * @param artifactTags the artifactTags value to set.
     * @return the CommunityGalleryImageVersionProperties object itself.
     */
    public CommunityGalleryImageVersionProperties withArtifactTags(Map<String, String> artifactTags) {
        this.artifactTags = artifactTags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}
