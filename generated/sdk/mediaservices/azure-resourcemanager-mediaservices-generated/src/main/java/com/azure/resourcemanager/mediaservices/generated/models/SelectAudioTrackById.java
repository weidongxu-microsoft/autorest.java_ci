// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Select audio tracks from the input by specifying a track identifier.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@odata.type",
    defaultImpl = SelectAudioTrackById.class,
    visible = true)
@JsonTypeName("#Microsoft.Media.SelectAudioTrackById")
@Fluent
public final class SelectAudioTrackById extends AudioTrackDescriptor {
    /*
     * Track identifier to select
     */
    @JsonProperty(value = "trackId", required = true)
    private long trackId;

    /**
     * Creates an instance of SelectAudioTrackById class.
     */
    public SelectAudioTrackById() {
        withOdataType("#Microsoft.Media.SelectAudioTrackById");
    }

    /**
     * Get the trackId property: Track identifier to select.
     * 
     * @return the trackId value.
     */
    public long trackId() {
        return this.trackId;
    }

    /**
     * Set the trackId property: Track identifier to select.
     * 
     * @param trackId the trackId value to set.
     * @return the SelectAudioTrackById object itself.
     */
    public SelectAudioTrackById withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SelectAudioTrackById withChannelMapping(ChannelMapping channelMapping) {
        super.withChannelMapping(channelMapping);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
