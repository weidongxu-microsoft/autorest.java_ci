// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Workspace features. */
@Fluent
public final class WorkspaceFeatures {
    /*
     * Flag that indicate if data should be exported.
     */
    @JsonProperty(value = "enableDataExport")
    private Boolean enableDataExport;

    /*
     * Flag that describes if we want to remove the data after 30 days.
     */
    @JsonProperty(value = "immediatePurgeDataOn30Days")
    private Boolean immediatePurgeDataOn30Days;

    /*
     * Flag that indicate which permission to use - resource or workspace or both.
     */
    @JsonProperty(value = "enableLogAccessUsingOnlyResourcePermissions")
    private Boolean enableLogAccessUsingOnlyResourcePermissions;

    /*
     * Dedicated LA cluster resourceId that is linked to the workspaces.
     */
    @JsonProperty(value = "clusterResourceId")
    private String clusterResourceId;

    /*
     * Disable Non-AAD based Auth.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * Workspace features.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of WorkspaceFeatures class. */
    public WorkspaceFeatures() {
    }

    /**
     * Get the enableDataExport property: Flag that indicate if data should be exported.
     *
     * @return the enableDataExport value.
     */
    public Boolean enableDataExport() {
        return this.enableDataExport;
    }

    /**
     * Set the enableDataExport property: Flag that indicate if data should be exported.
     *
     * @param enableDataExport the enableDataExport value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withEnableDataExport(Boolean enableDataExport) {
        this.enableDataExport = enableDataExport;
        return this;
    }

    /**
     * Get the immediatePurgeDataOn30Days property: Flag that describes if we want to remove the data after 30 days.
     *
     * @return the immediatePurgeDataOn30Days value.
     */
    public Boolean immediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days;
    }

    /**
     * Set the immediatePurgeDataOn30Days property: Flag that describes if we want to remove the data after 30 days.
     *
     * @param immediatePurgeDataOn30Days the immediatePurgeDataOn30Days value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
        return this;
    }

    /**
     * Get the enableLogAccessUsingOnlyResourcePermissions property: Flag that indicate which permission to use -
     * resource or workspace or both.
     *
     * @return the enableLogAccessUsingOnlyResourcePermissions value.
     */
    public Boolean enableLogAccessUsingOnlyResourcePermissions() {
        return this.enableLogAccessUsingOnlyResourcePermissions;
    }

    /**
     * Set the enableLogAccessUsingOnlyResourcePermissions property: Flag that indicate which permission to use -
     * resource or workspace or both.
     *
     * @param enableLogAccessUsingOnlyResourcePermissions the enableLogAccessUsingOnlyResourcePermissions value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withEnableLogAccessUsingOnlyResourcePermissions(
        Boolean enableLogAccessUsingOnlyResourcePermissions) {
        this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
        return this;
    }

    /**
     * Get the clusterResourceId property: Dedicated LA cluster resourceId that is linked to the workspaces.
     *
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: Dedicated LA cluster resourceId that is linked to the workspaces.
     *
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Disable Non-AAD based Auth.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Disable Non-AAD based Auth.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the additionalProperties property: Workspace features.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Workspace features.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the WorkspaceFeatures object itself.
     */
    public WorkspaceFeatures withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
