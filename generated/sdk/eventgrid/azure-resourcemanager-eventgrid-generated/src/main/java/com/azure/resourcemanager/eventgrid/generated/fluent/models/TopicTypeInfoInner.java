// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceRegionType;
import com.azure.resourcemanager.eventgrid.generated.models.TopicTypePropertiesSupportedScopesForSourceItem;
import com.azure.resourcemanager.eventgrid.generated.models.TopicTypeProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a topic type info. */
@Fluent
public final class TopicTypeInfoInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopicTypeInfoInner.class);

    /*
     * Properties of the topic type info
     */
    @JsonProperty(value = "properties")
    private TopicTypeProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the topic type info.
     *
     * @return the innerProperties value.
     */
    private TopicTypeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provider property: Namespace of the provider of the topic type.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.innerProperties() == null ? null : this.innerProperties().provider();
    }

    /**
     * Set the provider property: Namespace of the provider of the topic type.
     *
     * @param provider the provider value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withProvider(String provider) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withProvider(provider);
        return this;
    }

    /**
     * Get the displayName property: Display Name for the topic type.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display Name for the topic type.
     *
     * @param displayName the displayName value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: Description of the topic type.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the topic type.
     *
     * @param description the description value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the resourceRegionType property: Region type of the resource.
     *
     * @return the resourceRegionType value.
     */
    public ResourceRegionType resourceRegionType() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceRegionType();
    }

    /**
     * Set the resourceRegionType property: Region type of the resource.
     *
     * @param resourceRegionType the resourceRegionType value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withResourceRegionType(ResourceRegionType resourceRegionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withResourceRegionType(resourceRegionType);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the topic type.
     *
     * @return the provisioningState value.
     */
    public TopicTypeProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the topic type.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withProvisioningState(TopicTypeProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the supportedLocations property: List of locations supported by this topic type.
     *
     * @return the supportedLocations value.
     */
    public List<String> supportedLocations() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedLocations();
    }

    /**
     * Set the supportedLocations property: List of locations supported by this topic type.
     *
     * @param supportedLocations the supportedLocations value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withSupportedLocations(List<String> supportedLocations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withSupportedLocations(supportedLocations);
        return this;
    }

    /**
     * Get the sourceResourceFormat property: Source resource format.
     *
     * @return the sourceResourceFormat value.
     */
    public String sourceResourceFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceFormat();
    }

    /**
     * Set the sourceResourceFormat property: Source resource format.
     *
     * @param sourceResourceFormat the sourceResourceFormat value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withSourceResourceFormat(String sourceResourceFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withSourceResourceFormat(sourceResourceFormat);
        return this;
    }

    /**
     * Get the supportedScopesForSource property: Supported source scopes.
     *
     * @return the supportedScopesForSource value.
     */
    public List<TopicTypePropertiesSupportedScopesForSourceItem> supportedScopesForSource() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedScopesForSource();
    }

    /**
     * Set the supportedScopesForSource property: Supported source scopes.
     *
     * @param supportedScopesForSource the supportedScopesForSource value to set.
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withSupportedScopesForSource(
        List<TopicTypePropertiesSupportedScopesForSourceItem> supportedScopesForSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicTypeProperties();
        }
        this.innerProperties().withSupportedScopesForSource(supportedScopesForSource);
        return this;
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
