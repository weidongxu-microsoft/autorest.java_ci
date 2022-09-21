// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.generated.models.ProvisioningState;
import com.azure.resourcemanager.mediaservices.generated.models.TrackBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a video, audio or text track in the asset. */
@Fluent
public final class AssetTrackProperties {
    /*
     * Detailed information about a track in the asset.
     */
    @JsonProperty(value = "track")
    private TrackBase track;

    /*
     * Provisioning state of the asset track.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of AssetTrackProperties class. */
    public AssetTrackProperties() {
    }

    /**
     * Get the track property: Detailed information about a track in the asset.
     *
     * @return the track value.
     */
    public TrackBase track() {
        return this.track;
    }

    /**
     * Set the track property: Detailed information about a track in the asset.
     *
     * @param track the track value to set.
     * @return the AssetTrackProperties object itself.
     */
    public AssetTrackProperties withTrack(TrackBase track) {
        this.track = track;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the asset track.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (track() != null) {
            track().validate();
        }
    }
}
