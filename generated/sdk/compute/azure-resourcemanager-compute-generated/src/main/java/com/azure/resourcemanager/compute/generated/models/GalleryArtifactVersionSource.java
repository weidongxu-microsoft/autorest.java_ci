// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The gallery artifact version source.
 */
@Fluent
public class GalleryArtifactVersionSource {
    /*
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage
     * account resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of GalleryArtifactVersionSource class.
     */
    public GalleryArtifactVersionSource() {
    }

    /**
     * Get the id property: The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user
     * image or storage account resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user
     * image or storage account resource.
     * 
     * @param id the id value to set.
     * @return the GalleryArtifactVersionSource object itself.
     */
    public GalleryArtifactVersionSource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
