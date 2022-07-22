// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The content link. */
@Fluent
public final class ContentLink {
    /*
     * The content link URI.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * The content version.
     */
    @JsonProperty(value = "contentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String contentVersion;

    /*
     * The content size.
     */
    @JsonProperty(value = "contentSize", access = JsonProperty.Access.WRITE_ONLY)
    private Long contentSize;

    /*
     * The content hash.
     */
    @JsonProperty(value = "contentHash", access = JsonProperty.Access.WRITE_ONLY)
    private ContentHash contentHash;

    /*
     * The metadata.
     */
    @JsonProperty(value = "metadata", access = JsonProperty.Access.WRITE_ONLY)
    private Object metadata;

    /**
     * Get the uri property: The content link URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The content link URI.
     *
     * @param uri the uri value to set.
     * @return the ContentLink object itself.
     */
    public ContentLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentVersion property: The content version.
     *
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Get the contentSize property: The content size.
     *
     * @return the contentSize value.
     */
    public Long contentSize() {
        return this.contentSize;
    }

    /**
     * Get the contentHash property: The content hash.
     *
     * @return the contentHash value.
     */
    public ContentHash contentHash() {
        return this.contentHash;
    }

    /**
     * Get the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentHash() != null) {
            contentHash().validate();
        }
    }
}