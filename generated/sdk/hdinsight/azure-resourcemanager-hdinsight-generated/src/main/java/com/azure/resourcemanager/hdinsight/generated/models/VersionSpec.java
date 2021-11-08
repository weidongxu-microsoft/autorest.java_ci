// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The version properties. */
@Fluent
public final class VersionSpec {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VersionSpec.class);

    /*
     * The friendly name
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Whether or not the version is the default version.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * The component version property.
     */
    @JsonProperty(value = "componentVersions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> componentVersions;

    /**
     * Get the friendlyName property: The friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the VersionSpec object itself.
     */
    public VersionSpec withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the displayName property: The display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name.
     *
     * @param displayName the displayName value to set.
     * @return the VersionSpec object itself.
     */
    public VersionSpec withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isDefault property: Whether or not the version is the default version.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: Whether or not the version is the default version.
     *
     * @param isDefault the isDefault value to set.
     * @return the VersionSpec object itself.
     */
    public VersionSpec withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the componentVersions property: The component version property.
     *
     * @return the componentVersions value.
     */
    public Map<String, String> componentVersions() {
        return this.componentVersions;
    }

    /**
     * Set the componentVersions property: The component version property.
     *
     * @param componentVersions the componentVersions value to set.
     * @return the VersionSpec object itself.
     */
    public VersionSpec withComponentVersions(Map<String, String> componentVersions) {
        this.componentVersions = componentVersions;
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
