// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The live event input.
 */
@Fluent
public final class LiveEventInput {
    /*
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     */
    @JsonProperty(value = "streamingProtocol", required = true)
    private LiveEventInputProtocol streamingProtocol;

    /*
     * Access control for live event input.
     */
    @JsonProperty(value = "accessControl")
    private LiveEventInputAccessControl accessControl;

    /*
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     */
    @JsonProperty(value = "keyFrameIntervalDuration")
    private String keyFrameIntervalDuration;

    /*
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /*
     * The input endpoints for the live event.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /*
     * The metadata endpoints for the live event.
     */
    @JsonProperty(value = "timedMetadataEndpoints")
    private List<LiveEventTimedMetadataEndpoint> timedMetadataEndpoints;

    /**
     * Creates an instance of LiveEventInput class.
     */
    public LiveEventInput() {
    }

    /**
     * Get the streamingProtocol property: The input protocol for the live event. This is specified at creation time and
     * cannot be updated.
     * 
     * @return the streamingProtocol value.
     */
    public LiveEventInputProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set the streamingProtocol property: The input protocol for the live event. This is specified at creation time and
     * cannot be updated.
     * 
     * @param streamingProtocol the streamingProtocol value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withStreamingProtocol(LiveEventInputProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get the accessControl property: Access control for live event input.
     * 
     * @return the accessControl value.
     */
    public LiveEventInputAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the accessControl property: Access control for live event input.
     * 
     * @param accessControl the accessControl value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessControl(LiveEventInputAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the keyFrameIntervalDuration property: ISO 8601 time duration of the key frame interval duration of the
     * input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2
     * seconds. Leave the value empty for encoding live events.
     * 
     * @return the keyFrameIntervalDuration value.
     */
    public String keyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration;
    }

    /**
     * Set the keyFrameIntervalDuration property: ISO 8601 time duration of the key frame interval duration of the
     * input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2
     * seconds. Leave the value empty for encoding live events.
     * 
     * @param keyFrameIntervalDuration the keyFrameIntervalDuration value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withKeyFrameIntervalDuration(String keyFrameIntervalDuration) {
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        return this;
    }

    /**
     * Get the accessToken property: A UUID in string form to uniquely identify the stream. This can be specified at
     * creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: A UUID in string form to uniquely identify the stream. This can be specified at
     * creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     * @param accessToken the accessToken value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the endpoints property: The input endpoints for the live event.
     * 
     * @return the endpoints value.
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The input endpoints for the live event.
     * 
     * @param endpoints the endpoints value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the timedMetadataEndpoints property: The metadata endpoints for the live event.
     * 
     * @return the timedMetadataEndpoints value.
     */
    public List<LiveEventTimedMetadataEndpoint> timedMetadataEndpoints() {
        return this.timedMetadataEndpoints;
    }

    /**
     * Set the timedMetadataEndpoints property: The metadata endpoints for the live event.
     * 
     * @param timedMetadataEndpoints the timedMetadataEndpoints value to set.
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withTimedMetadataEndpoints(List<LiveEventTimedMetadataEndpoint> timedMetadataEndpoints) {
        this.timedMetadataEndpoints = timedMetadataEndpoints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streamingProtocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property streamingProtocol in model LiveEventInput"));
        }
        if (accessControl() != null) {
            accessControl().validate();
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (timedMetadataEndpoints() != null) {
            timedMetadataEndpoints().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LiveEventInput.class);
}
