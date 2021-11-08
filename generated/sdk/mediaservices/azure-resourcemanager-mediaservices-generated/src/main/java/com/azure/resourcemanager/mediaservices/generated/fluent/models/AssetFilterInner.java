// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.generated.models.FilterTrackSelection;
import com.azure.resourcemanager.mediaservices.generated.models.FirstQuality;
import com.azure.resourcemanager.mediaservices.generated.models.PresentationTimeRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Asset Filter. */
@Fluent
public final class AssetFilterInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssetFilterInner.class);

    /*
     * The Media Filter properties.
     */
    @JsonProperty(value = "properties")
    private MediaFilterProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The Media Filter properties.
     *
     * @return the innerProperties value.
     */
    private MediaFilterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the presentationTimeRange property: The presentation time range.
     *
     * @return the presentationTimeRange value.
     */
    public PresentationTimeRange presentationTimeRange() {
        return this.innerProperties() == null ? null : this.innerProperties().presentationTimeRange();
    }

    /**
     * Set the presentationTimeRange property: The presentation time range.
     *
     * @param presentationTimeRange the presentationTimeRange value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaFilterProperties();
        }
        this.innerProperties().withPresentationTimeRange(presentationTimeRange);
        return this;
    }

    /**
     * Get the firstQuality property: The first quality.
     *
     * @return the firstQuality value.
     */
    public FirstQuality firstQuality() {
        return this.innerProperties() == null ? null : this.innerProperties().firstQuality();
    }

    /**
     * Set the firstQuality property: The first quality.
     *
     * @param firstQuality the firstQuality value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withFirstQuality(FirstQuality firstQuality) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaFilterProperties();
        }
        this.innerProperties().withFirstQuality(firstQuality);
        return this;
    }

    /**
     * Get the tracks property: The tracks selection conditions.
     *
     * @return the tracks value.
     */
    public List<FilterTrackSelection> tracks() {
        return this.innerProperties() == null ? null : this.innerProperties().tracks();
    }

    /**
     * Set the tracks property: The tracks selection conditions.
     *
     * @param tracks the tracks value to set.
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withTracks(List<FilterTrackSelection> tracks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MediaFilterProperties();
        }
        this.innerProperties().withTracks(tracks);
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
