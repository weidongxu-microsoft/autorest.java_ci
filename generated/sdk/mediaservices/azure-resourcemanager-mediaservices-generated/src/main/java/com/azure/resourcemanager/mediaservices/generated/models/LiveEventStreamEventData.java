// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The live event stream event data.
 */
@Fluent
public final class LiveEventStreamEventData {
    /*
     * Name of the track.
     */
    @JsonProperty(value = "trackName")
    private String trackName;

    /*
     * Stream ID in the format "trackName_bitrate"
     */
    @JsonProperty(value = "streamId")
    private String streamId;

    /*
     * Track index.
     */
    @JsonProperty(value = "trackId")
    private Integer trackId;

    /*
     * Type of the track.
     */
    @JsonProperty(value = "mediaType")
    private LiveEventStreamEventMediaType mediaType;

    /*
     * Bitrate of the track.
     */
    @JsonProperty(value = "bitrate")
    private Long bitrate;

    /*
     * Fragment timestamp in timescale.
     */
    @JsonProperty(value = "mediaTimestamp")
    private String mediaTimestamp;

    /*
     * Timescale in which timestamps are expressed.
     */
    @JsonProperty(value = "timescale")
    private String timescale;

    /*
     * Previous fragment timestamp in timescale.
     */
    @JsonProperty(value = "previousFragmentTimestamp")
    private String previousFragmentTimestamp;

    /*
     * Previous fragment duration in timescale.
     */
    @JsonProperty(value = "previousFragmentDuration")
    private String previousFragmentDuration;

    /*
     * Current fragment timestamp in timescale.
     */
    @JsonProperty(value = "currentFragmentTimestamp")
    private String currentFragmentTimestamp;

    /*
     * Timestamp of first fragment used to make a comparison, in timescale.
     */
    @JsonProperty(value = "fragmentOneTimestamp")
    private String fragmentOneTimestamp;

    /*
     * Duration of first fragment used to make a comparison, in timescale.
     */
    @JsonProperty(value = "fragmentOneDuration")
    private String fragmentOneDuration;

    /*
     * Timestamp of second fragment used to make a comparison, in timescale.
     */
    @JsonProperty(value = "fragmentTwoTimestamp")
    private String fragmentTwoTimestamp;

    /*
     * Duration of second fragment used to make a comparison, in timescale.
     */
    @JsonProperty(value = "fragmentTwoDuration")
    private String fragmentTwoDuration;

    /*
     * Reason the fragment was dropped.
     */
    @JsonProperty(value = "fragmentDropReason")
    private String fragmentDropReason;

    /*
     * Length of the discontinuity gap in timescale.
     */
    @JsonProperty(value = "discontinuityGap")
    private Long discontinuityGap;

    /*
     * Identifier of the stream or connection. Encoder or customer is responsible to add this ID in the ingest URL.
     */
    @JsonProperty(value = "streamName")
    private String streamName;

    /*
     * Result code.
     */
    @JsonProperty(value = "resultCode")
    private String resultCode;

    /*
     * Result message.
     */
    @JsonProperty(value = "resultMessage")
    private String resultMessage;

    /*
     * Fragment duration.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /*
     * Width x Height for video, null otherwise.
     */
    @JsonProperty(value = "resolution")
    private String resolution;

    /*
     * The smaller timestamp of the two fragments compared.
     */
    @JsonProperty(value = "minTime")
    private String minTime;

    /*
     * The media type of the smaller timestamp of two fragments compared.
     */
    @JsonProperty(value = "minTimeMediaType")
    private LiveEventStreamEventMinTimeMediaType minTimeMediaType;

    /*
     * The larger timestamp of the two fragments compared.
     */
    @JsonProperty(value = "maxTime")
    private String maxTime;

    /*
     * The media type of the larger timestamp of two fragments compared.
     */
    @JsonProperty(value = "maxTimeMediaType")
    private LiveEventStreamEventMaxTimeMediaType maxTimeMediaType;

    /*
     * Timescale of the fragment with the smaller timestamp.
     */
    @JsonProperty(value = "timescaleOfMinTime")
    private String timescaleOfMinTime;

    /*
     * Timescale of the fragment with the larger timestamp.
     */
    @JsonProperty(value = "timescaleOfMaxTime")
    private String timescaleOfMaxTime;

    /*
     * Truncated IP of the encoder.
     */
    @JsonProperty(value = "remoteIp")
    private String remoteIp;

    /*
     * Port of the encoder.
     */
    @JsonProperty(value = "remotePort")
    private String remotePort;

    /**
     * Creates an instance of LiveEventStreamEventData class.
     */
    public LiveEventStreamEventData() {
    }

    /**
     * Get the trackName property: Name of the track.
     * 
     * @return the trackName value.
     */
    public String trackName() {
        return this.trackName;
    }

    /**
     * Set the trackName property: Name of the track.
     * 
     * @param trackName the trackName value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    /**
     * Get the streamId property: Stream ID in the format "trackName_bitrate".
     * 
     * @return the streamId value.
     */
    public String streamId() {
        return this.streamId;
    }

    /**
     * Set the streamId property: Stream ID in the format "trackName_bitrate".
     * 
     * @param streamId the streamId value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * Get the trackId property: Track index.
     * 
     * @return the trackId value.
     */
    public Integer trackId() {
        return this.trackId;
    }

    /**
     * Set the trackId property: Track index.
     * 
     * @param trackId the trackId value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withTrackId(Integer trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * Get the mediaType property: Type of the track.
     * 
     * @return the mediaType value.
     */
    public LiveEventStreamEventMediaType mediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: Type of the track.
     * 
     * @param mediaType the mediaType value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMediaType(LiveEventStreamEventMediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the bitrate property: Bitrate of the track.
     * 
     * @return the bitrate value.
     */
    public Long bitrate() {
        return this.bitrate;
    }

    /**
     * Set the bitrate property: Bitrate of the track.
     * 
     * @param bitrate the bitrate value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Get the mediaTimestamp property: Fragment timestamp in timescale.
     * 
     * @return the mediaTimestamp value.
     */
    public String mediaTimestamp() {
        return this.mediaTimestamp;
    }

    /**
     * Set the mediaTimestamp property: Fragment timestamp in timescale.
     * 
     * @param mediaTimestamp the mediaTimestamp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMediaTimestamp(String mediaTimestamp) {
        this.mediaTimestamp = mediaTimestamp;
        return this;
    }

    /**
     * Get the timescale property: Timescale in which timestamps are expressed.
     * 
     * @return the timescale value.
     */
    public String timescale() {
        return this.timescale;
    }

    /**
     * Set the timescale property: Timescale in which timestamps are expressed.
     * 
     * @param timescale the timescale value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withTimescale(String timescale) {
        this.timescale = timescale;
        return this;
    }

    /**
     * Get the previousFragmentTimestamp property: Previous fragment timestamp in timescale.
     * 
     * @return the previousFragmentTimestamp value.
     */
    public String previousFragmentTimestamp() {
        return this.previousFragmentTimestamp;
    }

    /**
     * Set the previousFragmentTimestamp property: Previous fragment timestamp in timescale.
     * 
     * @param previousFragmentTimestamp the previousFragmentTimestamp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withPreviousFragmentTimestamp(String previousFragmentTimestamp) {
        this.previousFragmentTimestamp = previousFragmentTimestamp;
        return this;
    }

    /**
     * Get the previousFragmentDuration property: Previous fragment duration in timescale.
     * 
     * @return the previousFragmentDuration value.
     */
    public String previousFragmentDuration() {
        return this.previousFragmentDuration;
    }

    /**
     * Set the previousFragmentDuration property: Previous fragment duration in timescale.
     * 
     * @param previousFragmentDuration the previousFragmentDuration value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withPreviousFragmentDuration(String previousFragmentDuration) {
        this.previousFragmentDuration = previousFragmentDuration;
        return this;
    }

    /**
     * Get the currentFragmentTimestamp property: Current fragment timestamp in timescale.
     * 
     * @return the currentFragmentTimestamp value.
     */
    public String currentFragmentTimestamp() {
        return this.currentFragmentTimestamp;
    }

    /**
     * Set the currentFragmentTimestamp property: Current fragment timestamp in timescale.
     * 
     * @param currentFragmentTimestamp the currentFragmentTimestamp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withCurrentFragmentTimestamp(String currentFragmentTimestamp) {
        this.currentFragmentTimestamp = currentFragmentTimestamp;
        return this;
    }

    /**
     * Get the fragmentOneTimestamp property: Timestamp of first fragment used to make a comparison, in timescale.
     * 
     * @return the fragmentOneTimestamp value.
     */
    public String fragmentOneTimestamp() {
        return this.fragmentOneTimestamp;
    }

    /**
     * Set the fragmentOneTimestamp property: Timestamp of first fragment used to make a comparison, in timescale.
     * 
     * @param fragmentOneTimestamp the fragmentOneTimestamp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withFragmentOneTimestamp(String fragmentOneTimestamp) {
        this.fragmentOneTimestamp = fragmentOneTimestamp;
        return this;
    }

    /**
     * Get the fragmentOneDuration property: Duration of first fragment used to make a comparison, in timescale.
     * 
     * @return the fragmentOneDuration value.
     */
    public String fragmentOneDuration() {
        return this.fragmentOneDuration;
    }

    /**
     * Set the fragmentOneDuration property: Duration of first fragment used to make a comparison, in timescale.
     * 
     * @param fragmentOneDuration the fragmentOneDuration value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withFragmentOneDuration(String fragmentOneDuration) {
        this.fragmentOneDuration = fragmentOneDuration;
        return this;
    }

    /**
     * Get the fragmentTwoTimestamp property: Timestamp of second fragment used to make a comparison, in timescale.
     * 
     * @return the fragmentTwoTimestamp value.
     */
    public String fragmentTwoTimestamp() {
        return this.fragmentTwoTimestamp;
    }

    /**
     * Set the fragmentTwoTimestamp property: Timestamp of second fragment used to make a comparison, in timescale.
     * 
     * @param fragmentTwoTimestamp the fragmentTwoTimestamp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withFragmentTwoTimestamp(String fragmentTwoTimestamp) {
        this.fragmentTwoTimestamp = fragmentTwoTimestamp;
        return this;
    }

    /**
     * Get the fragmentTwoDuration property: Duration of second fragment used to make a comparison, in timescale.
     * 
     * @return the fragmentTwoDuration value.
     */
    public String fragmentTwoDuration() {
        return this.fragmentTwoDuration;
    }

    /**
     * Set the fragmentTwoDuration property: Duration of second fragment used to make a comparison, in timescale.
     * 
     * @param fragmentTwoDuration the fragmentTwoDuration value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withFragmentTwoDuration(String fragmentTwoDuration) {
        this.fragmentTwoDuration = fragmentTwoDuration;
        return this;
    }

    /**
     * Get the fragmentDropReason property: Reason the fragment was dropped.
     * 
     * @return the fragmentDropReason value.
     */
    public String fragmentDropReason() {
        return this.fragmentDropReason;
    }

    /**
     * Set the fragmentDropReason property: Reason the fragment was dropped.
     * 
     * @param fragmentDropReason the fragmentDropReason value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withFragmentDropReason(String fragmentDropReason) {
        this.fragmentDropReason = fragmentDropReason;
        return this;
    }

    /**
     * Get the discontinuityGap property: Length of the discontinuity gap in timescale.
     * 
     * @return the discontinuityGap value.
     */
    public Long discontinuityGap() {
        return this.discontinuityGap;
    }

    /**
     * Set the discontinuityGap property: Length of the discontinuity gap in timescale.
     * 
     * @param discontinuityGap the discontinuityGap value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withDiscontinuityGap(Long discontinuityGap) {
        this.discontinuityGap = discontinuityGap;
        return this;
    }

    /**
     * Get the streamName property: Identifier of the stream or connection. Encoder or customer is responsible to add
     * this ID in the ingest URL.
     * 
     * @return the streamName value.
     */
    public String streamName() {
        return this.streamName;
    }

    /**
     * Set the streamName property: Identifier of the stream or connection. Encoder or customer is responsible to add
     * this ID in the ingest URL.
     * 
     * @param streamName the streamName value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Get the resultCode property: Result code.
     * 
     * @return the resultCode value.
     */
    public String resultCode() {
        return this.resultCode;
    }

    /**
     * Set the resultCode property: Result code.
     * 
     * @param resultCode the resultCode value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * Get the resultMessage property: Result message.
     * 
     * @return the resultMessage value.
     */
    public String resultMessage() {
        return this.resultMessage;
    }

    /**
     * Set the resultMessage property: Result message.
     * 
     * @param resultMessage the resultMessage value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }

    /**
     * Get the duration property: Fragment duration.
     * 
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Fragment duration.
     * 
     * @param duration the duration value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the resolution property: Width x Height for video, null otherwise.
     * 
     * @return the resolution value.
     */
    public String resolution() {
        return this.resolution;
    }

    /**
     * Set the resolution property: Width x Height for video, null otherwise.
     * 
     * @param resolution the resolution value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Get the minTime property: The smaller timestamp of the two fragments compared.
     * 
     * @return the minTime value.
     */
    public String minTime() {
        return this.minTime;
    }

    /**
     * Set the minTime property: The smaller timestamp of the two fragments compared.
     * 
     * @param minTime the minTime value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    /**
     * Get the minTimeMediaType property: The media type of the smaller timestamp of two fragments compared.
     * 
     * @return the minTimeMediaType value.
     */
    public LiveEventStreamEventMinTimeMediaType minTimeMediaType() {
        return this.minTimeMediaType;
    }

    /**
     * Set the minTimeMediaType property: The media type of the smaller timestamp of two fragments compared.
     * 
     * @param minTimeMediaType the minTimeMediaType value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMinTimeMediaType(LiveEventStreamEventMinTimeMediaType minTimeMediaType) {
        this.minTimeMediaType = minTimeMediaType;
        return this;
    }

    /**
     * Get the maxTime property: The larger timestamp of the two fragments compared.
     * 
     * @return the maxTime value.
     */
    public String maxTime() {
        return this.maxTime;
    }

    /**
     * Set the maxTime property: The larger timestamp of the two fragments compared.
     * 
     * @param maxTime the maxTime value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * Get the maxTimeMediaType property: The media type of the larger timestamp of two fragments compared.
     * 
     * @return the maxTimeMediaType value.
     */
    public LiveEventStreamEventMaxTimeMediaType maxTimeMediaType() {
        return this.maxTimeMediaType;
    }

    /**
     * Set the maxTimeMediaType property: The media type of the larger timestamp of two fragments compared.
     * 
     * @param maxTimeMediaType the maxTimeMediaType value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withMaxTimeMediaType(LiveEventStreamEventMaxTimeMediaType maxTimeMediaType) {
        this.maxTimeMediaType = maxTimeMediaType;
        return this;
    }

    /**
     * Get the timescaleOfMinTime property: Timescale of the fragment with the smaller timestamp.
     * 
     * @return the timescaleOfMinTime value.
     */
    public String timescaleOfMinTime() {
        return this.timescaleOfMinTime;
    }

    /**
     * Set the timescaleOfMinTime property: Timescale of the fragment with the smaller timestamp.
     * 
     * @param timescaleOfMinTime the timescaleOfMinTime value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withTimescaleOfMinTime(String timescaleOfMinTime) {
        this.timescaleOfMinTime = timescaleOfMinTime;
        return this;
    }

    /**
     * Get the timescaleOfMaxTime property: Timescale of the fragment with the larger timestamp.
     * 
     * @return the timescaleOfMaxTime value.
     */
    public String timescaleOfMaxTime() {
        return this.timescaleOfMaxTime;
    }

    /**
     * Set the timescaleOfMaxTime property: Timescale of the fragment with the larger timestamp.
     * 
     * @param timescaleOfMaxTime the timescaleOfMaxTime value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withTimescaleOfMaxTime(String timescaleOfMaxTime) {
        this.timescaleOfMaxTime = timescaleOfMaxTime;
        return this;
    }

    /**
     * Get the remoteIp property: Truncated IP of the encoder.
     * 
     * @return the remoteIp value.
     */
    public String remoteIp() {
        return this.remoteIp;
    }

    /**
     * Set the remoteIp property: Truncated IP of the encoder.
     * 
     * @param remoteIp the remoteIp value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }

    /**
     * Get the remotePort property: Port of the encoder.
     * 
     * @return the remotePort value.
     */
    public String remotePort() {
        return this.remotePort;
    }

    /**
     * Set the remotePort property: Port of the encoder.
     * 
     * @param remotePort the remotePort value to set.
     * @return the LiveEventStreamEventData object itself.
     */
    public LiveEventStreamEventData withRemotePort(String remotePort) {
        this.remotePort = remotePort;
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
