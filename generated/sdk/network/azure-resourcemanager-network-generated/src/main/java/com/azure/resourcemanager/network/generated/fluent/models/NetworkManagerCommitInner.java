// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ConfigurationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network Manager Commit. */
@Fluent
public final class NetworkManagerCommitInner {
    /*
     * Commit Id.
     */
    @JsonProperty(value = "commitId", access = JsonProperty.Access.WRITE_ONLY)
    private String commitId;

    /*
     * List of target locations.
     */
    @JsonProperty(value = "targetLocations", required = true)
    private List<String> targetLocations;

    /*
     * List of configuration ids.
     */
    @JsonProperty(value = "configurationIds")
    private List<String> configurationIds;

    /*
     * Commit Type.
     */
    @JsonProperty(value = "commitType", required = true)
    private ConfigurationType commitType;

    /** Creates an instance of NetworkManagerCommitInner class. */
    public NetworkManagerCommitInner() {
    }

    /**
     * Get the commitId property: Commit Id.
     *
     * @return the commitId value.
     */
    public String commitId() {
        return this.commitId;
    }

    /**
     * Get the targetLocations property: List of target locations.
     *
     * @return the targetLocations value.
     */
    public List<String> targetLocations() {
        return this.targetLocations;
    }

    /**
     * Set the targetLocations property: List of target locations.
     *
     * @param targetLocations the targetLocations value to set.
     * @return the NetworkManagerCommitInner object itself.
     */
    public NetworkManagerCommitInner withTargetLocations(List<String> targetLocations) {
        this.targetLocations = targetLocations;
        return this;
    }

    /**
     * Get the configurationIds property: List of configuration ids.
     *
     * @return the configurationIds value.
     */
    public List<String> configurationIds() {
        return this.configurationIds;
    }

    /**
     * Set the configurationIds property: List of configuration ids.
     *
     * @param configurationIds the configurationIds value to set.
     * @return the NetworkManagerCommitInner object itself.
     */
    public NetworkManagerCommitInner withConfigurationIds(List<String> configurationIds) {
        this.configurationIds = configurationIds;
        return this;
    }

    /**
     * Get the commitType property: Commit Type.
     *
     * @return the commitType value.
     */
    public ConfigurationType commitType() {
        return this.commitType;
    }

    /**
     * Set the commitType property: Commit Type.
     *
     * @param commitType the commitType value to set.
     * @return the NetworkManagerCommitInner object itself.
     */
    public NetworkManagerCommitInner withCommitType(ConfigurationType commitType) {
        this.commitType = commitType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetLocations() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetLocations in model NetworkManagerCommitInner"));
        }
        if (commitType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property commitType in model NetworkManagerCommitInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkManagerCommitInner.class);
}
