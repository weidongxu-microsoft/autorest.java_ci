// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.BuildStatus;
import com.azure.resourcemanager.appservice.generated.models.DatabaseConnectionOverview;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteLinkedBackend;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserProvidedFunctionApp;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Static Site Build ARM resource.
 */
@Fluent
public final class StaticSiteBuildArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteBuildARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteBuildArmResourceProperties innerProperties;

    /**
     * Creates an instance of StaticSiteBuildArmResourceInner class.
     */
    public StaticSiteBuildArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteBuildARMResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteBuildArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticSiteBuildArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the buildId property: An identifier for the static site build.
     * 
     * @return the buildId value.
     */
    public String buildId() {
        return this.innerProperties() == null ? null : this.innerProperties().buildId();
    }

    /**
     * Get the sourceBranch property: The source branch.
     * 
     * @return the sourceBranch value.
     */
    public String sourceBranch() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceBranch();
    }

    /**
     * Get the pullRequestTitle property: The title of a pull request that a static site build is related to.
     * 
     * @return the pullRequestTitle value.
     */
    public String pullRequestTitle() {
        return this.innerProperties() == null ? null : this.innerProperties().pullRequestTitle();
    }

    /**
     * Get the hostname property: The hostname for a static site build.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the createdTimeUtc property: When this build was created.
     * 
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTimeUtc();
    }

    /**
     * Get the lastUpdatedOn property: When this build was updated.
     * 
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime lastUpdatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedOn();
    }

    /**
     * Get the status property: The status of the static site build.
     * 
     * @return the status value.
     */
    public BuildStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the userProvidedFunctionApps property: User provided function apps registered with the static site build.
     * 
     * @return the userProvidedFunctionApps value.
     */
    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        return this.innerProperties() == null ? null : this.innerProperties().userProvidedFunctionApps();
    }

    /**
     * Get the linkedBackends property: Backends linked to the static side build.
     * 
     * @return the linkedBackends value.
     */
    public List<StaticSiteLinkedBackend> linkedBackends() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedBackends();
    }

    /**
     * Get the databaseConnections property: Database connections for the static site build.
     * 
     * @return the databaseConnections value.
     */
    public List<DatabaseConnectionOverview> databaseConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseConnections();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
