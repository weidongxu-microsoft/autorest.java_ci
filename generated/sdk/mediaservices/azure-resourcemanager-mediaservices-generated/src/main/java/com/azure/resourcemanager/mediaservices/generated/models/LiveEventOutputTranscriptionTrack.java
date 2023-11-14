// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a transcription track in the output of a live event, generated using speech-to-text transcription. This
 * property is reserved for future use, any value set on this property will be ignored.
 */
@Fluent
public final class LiveEventOutputTranscriptionTrack {
    /*
     * The output track name. This property is reserved for future use, any value set on this property will be ignored.
     */
    @JsonProperty(value = "trackName", required = true)
    private String trackName;

    /**
     * Creates an instance of LiveEventOutputTranscriptionTrack class.
     */
    public LiveEventOutputTranscriptionTrack() {
    }

    /**
     * Get the trackName property: The output track name. This property is reserved for future use, any value set on
     * this property will be ignored.
     * 
     * @return the trackName value.
     */
    public String trackName() {
        return this.trackName;
    }

    /**
     * Set the trackName property: The output track name. This property is reserved for future use, any value set on
     * this property will be ignored.
     * 
     * @param trackName the trackName value to set.
     * @return the LiveEventOutputTranscriptionTrack object itself.
     */
    public LiveEventOutputTranscriptionTrack withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trackName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property trackName in model LiveEventOutputTranscriptionTrack"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LiveEventOutputTranscriptionTrack.class);
}
