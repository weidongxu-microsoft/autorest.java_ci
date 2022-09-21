// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.generated.models.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A resource listing all tags. */
@Fluent
public final class TagsResultInner extends ProxyResource {
    /*
     * The properties of the tag.
     */
    @JsonProperty(value = "properties")
    private TagProperties innerProperties;

    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the
     * user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /** Creates an instance of TagsResultInner class. */
    public TagsResultInner() {
    }

    /**
     * Get the innerProperties property: The properties of the tag.
     *
     * @return the innerProperties value.
     */
    private TagProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tags property: A list of Tag.
     *
     * @return the tags value.
     */
    public List<Tag> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: A list of Tag.
     *
     * @param tags the tags value to set.
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withTags(List<Tag> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.innerProperties() == null ? null : this.innerProperties().nextLink();
    }

    /**
     * Get the previousLink property: The link (url) to the previous page of results.
     *
     * @return the previousLink value.
     */
    public String previousLink() {
        return this.innerProperties() == null ? null : this.innerProperties().previousLink();
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
