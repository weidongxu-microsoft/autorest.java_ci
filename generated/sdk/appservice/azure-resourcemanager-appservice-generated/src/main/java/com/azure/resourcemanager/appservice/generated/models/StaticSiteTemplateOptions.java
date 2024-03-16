// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Template Options for the static site.
 */
@Fluent
public final class StaticSiteTemplateOptions {
    /*
     * URL of the template repository. The newly generated repository will be based on this one.
     */
    @JsonProperty(value = "templateRepositoryUrl")
    private String templateRepositoryUrl;

    /*
     * Owner of the newly generated repository.
     */
    @JsonProperty(value = "owner")
    private String owner;

    /*
     * Name of the newly generated repository.
     */
    @JsonProperty(value = "repositoryName")
    private String repositoryName;

    /*
     * Description of the newly generated repository.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     */
    @JsonProperty(value = "isPrivate")
    private Boolean isPrivate;

    /**
     * Creates an instance of StaticSiteTemplateOptions class.
     */
    public StaticSiteTemplateOptions() {
    }

    /**
     * Get the templateRepositoryUrl property: URL of the template repository. The newly generated repository will be based on this one.
     * 
     * @return the templateRepositoryUrl value.
     */
    public String templateRepositoryUrl() {
        return this.templateRepositoryUrl;
    }

    /**
     * Set the templateRepositoryUrl property: URL of the template repository. The newly generated repository will be based on this one.
     * 
     * @param templateRepositoryUrl the templateRepositoryUrl value to set.
     * @return the StaticSiteTemplateOptions object itself.
     */
    public StaticSiteTemplateOptions withTemplateRepositoryUrl(String templateRepositoryUrl) {
        this.templateRepositoryUrl = templateRepositoryUrl;
        return this;
    }

    /**
     * Get the owner property: Owner of the newly generated repository.
     * 
     * @return the owner value.
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Set the owner property: Owner of the newly generated repository.
     * 
     * @param owner the owner value to set.
     * @return the StaticSiteTemplateOptions object itself.
     */
    public StaticSiteTemplateOptions withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the repositoryName property: Name of the newly generated repository.
     * 
     * @return the repositoryName value.
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    /**
     * Set the repositoryName property: Name of the newly generated repository.
     * 
     * @param repositoryName the repositoryName value to set.
     * @return the StaticSiteTemplateOptions object itself.
     */
    public StaticSiteTemplateOptions withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Get the description property: Description of the newly generated repository.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the newly generated repository.
     * 
     * @param description the description value to set.
     * @return the StaticSiteTemplateOptions object itself.
     */
    public StaticSiteTemplateOptions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isPrivate property: Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     * @return the isPrivate value.
     */
    public Boolean isPrivate() {
        return this.isPrivate;
    }

    /**
     * Set the isPrivate property: Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     * @param isPrivate the isPrivate value to set.
     * @return the StaticSiteTemplateOptions object itself.
     */
    public StaticSiteTemplateOptions withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
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
