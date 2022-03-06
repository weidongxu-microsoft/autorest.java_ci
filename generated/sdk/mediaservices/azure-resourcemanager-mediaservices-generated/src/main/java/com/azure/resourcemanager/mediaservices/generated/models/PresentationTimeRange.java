// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The presentation time range, this is asset related and not recommended for Account Filter. */
@Fluent
public final class PresentationTimeRange {
    /*
     * The absolute start time boundary.
     */
    @JsonProperty(value = "startTimestamp")
    private Long startTimestamp;

    /*
     * The absolute end time boundary.
     */
    @JsonProperty(value = "endTimestamp")
    private Long endTimestamp;

    /*
     * The relative to end sliding window.
     */
    @JsonProperty(value = "presentationWindowDuration")
    private Long presentationWindowDuration;

    /*
     * The relative to end right edge.
     */
    @JsonProperty(value = "liveBackoffDuration")
    private Long liveBackoffDuration;

    /*
     * The time scale of time stamps.
     */
    @JsonProperty(value = "timescale")
    private Long timescale;

    /*
     * The indicator of forcing existing of end time stamp.
     */
    @JsonProperty(value = "forceEndTimestamp")
    private Boolean forceEndTimestamp;

    /**
     * Get the startTimestamp property: The absolute start time boundary.
     *
     * @return the startTimestamp value.
     */
    public Long startTimestamp() {
        return this.startTimestamp;
    }

    /**
     * Set the startTimestamp property: The absolute start time boundary.
     *
     * @param startTimestamp the startTimestamp value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * Get the endTimestamp property: The absolute end time boundary.
     *
     * @return the endTimestamp value.
     */
    public Long endTimestamp() {
        return this.endTimestamp;
    }

    /**
     * Set the endTimestamp property: The absolute end time boundary.
     *
     * @param endTimestamp the endTimestamp value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * Get the presentationWindowDuration property: The relative to end sliding window.
     *
     * @return the presentationWindowDuration value.
     */
    public Long presentationWindowDuration() {
        return this.presentationWindowDuration;
    }

    /**
     * Set the presentationWindowDuration property: The relative to end sliding window.
     *
     * @param presentationWindowDuration the presentationWindowDuration value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withPresentationWindowDuration(Long presentationWindowDuration) {
        this.presentationWindowDuration = presentationWindowDuration;
        return this;
    }

    /**
     * Get the liveBackoffDuration property: The relative to end right edge.
     *
     * @return the liveBackoffDuration value.
     */
    public Long liveBackoffDuration() {
        return this.liveBackoffDuration;
    }

    /**
     * Set the liveBackoffDuration property: The relative to end right edge.
     *
     * @param liveBackoffDuration the liveBackoffDuration value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withLiveBackoffDuration(Long liveBackoffDuration) {
        this.liveBackoffDuration = liveBackoffDuration;
        return this;
    }

    /**
     * Get the timescale property: The time scale of time stamps.
     *
     * @return the timescale value.
     */
    public Long timescale() {
        return this.timescale;
    }

    /**
     * Set the timescale property: The time scale of time stamps.
     *
     * @param timescale the timescale value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withTimescale(Long timescale) {
        this.timescale = timescale;
        return this;
    }

    /**
     * Get the forceEndTimestamp property: The indicator of forcing existing of end time stamp.
     *
     * @return the forceEndTimestamp value.
     */
    public Boolean forceEndTimestamp() {
        return this.forceEndTimestamp;
    }

    /**
     * Set the forceEndTimestamp property: The indicator of forcing existing of end time stamp.
     *
     * @param forceEndTimestamp the forceEndTimestamp value to set.
     * @return the PresentationTimeRange object itself.
     */
    public PresentationTimeRange withForceEndTimestamp(Boolean forceEndTimestamp) {
        this.forceEndTimestamp = forceEndTimestamp;
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
