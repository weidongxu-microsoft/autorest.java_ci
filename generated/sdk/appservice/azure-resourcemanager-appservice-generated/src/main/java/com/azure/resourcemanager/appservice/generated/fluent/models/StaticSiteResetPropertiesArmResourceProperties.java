// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSiteResetPropertiesARMResource resource specific properties. */
@Fluent
public final class StaticSiteResetPropertiesArmResourceProperties {
    /*
     * The token which proves admin privileges to the repository.
     */
    @JsonProperty(value = "repositoryToken")
    private String repositoryToken;

    /*
     * Determines whether the repository should be updated with the new properties.
     */
    @JsonProperty(value = "shouldUpdateRepository")
    private Boolean shouldUpdateRepository;

    /** Creates an instance of StaticSiteResetPropertiesArmResourceProperties class. */
    public StaticSiteResetPropertiesArmResourceProperties() {
    }

    /**
     * Get the repositoryToken property: The token which proves admin privileges to the repository.
     *
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.repositoryToken;
    }

    /**
     * Set the repositoryToken property: The token which proves admin privileges to the repository.
     *
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSiteResetPropertiesArmResourceProperties object itself.
     */
    public StaticSiteResetPropertiesArmResourceProperties withRepositoryToken(String repositoryToken) {
        this.repositoryToken = repositoryToken;
        return this;
    }

    /**
     * Get the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     *
     * @return the shouldUpdateRepository value.
     */
    public Boolean shouldUpdateRepository() {
        return this.shouldUpdateRepository;
    }

    /**
     * Set the shouldUpdateRepository property: Determines whether the repository should be updated with the new
     * properties.
     *
     * @param shouldUpdateRepository the shouldUpdateRepository value to set.
     * @return the StaticSiteResetPropertiesArmResourceProperties object itself.
     */
    public StaticSiteResetPropertiesArmResourceProperties withShouldUpdateRepository(Boolean shouldUpdateRepository) {
        this.shouldUpdateRepository = shouldUpdateRepository;
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
