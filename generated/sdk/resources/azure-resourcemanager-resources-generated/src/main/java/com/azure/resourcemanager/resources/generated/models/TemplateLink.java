// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Entity representing the reference to the template. */
@Fluent
public final class TemplateLink {
    /*
     * The URI of the template to deploy. Use either the uri or id property, but not both.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * The resource id of a Template Spec. Use either the id or uri property, but not both.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Applicable only if this template link references a Template Spec. This relativePath property can optionally be
     * used to reference a Template Spec artifact by path.
     */
    @JsonProperty(value = "relativePath")
    private String relativePath;

    /*
     * If included, must match the ContentVersion in the template.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /**
     * Get the uri property: The URI of the template to deploy. Use either the uri or id property, but not both.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the template to deploy. Use either the uri or id property, but not both.
     *
     * @param uri the uri value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the id property: The resource id of a Template Spec. Use either the id or uri property, but not both.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource id of a Template Spec. Use either the id or uri property, but not both.
     *
     * @param id the id value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the relativePath property: Applicable only if this template link references a Template Spec. This
     * relativePath property can optionally be used to reference a Template Spec artifact by path.
     *
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: Applicable only if this template link references a Template Spec. This
     * relativePath property can optionally be used to reference a Template Spec artifact by path.
     *
     * @param relativePath the relativePath value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Get the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @param contentVersion the contentVersion value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
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
