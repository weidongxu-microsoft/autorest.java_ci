// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The live event track ingest heart beat event data.
 */
@Fluent
public final class LiveEventTrackEventData {
    /*
     * Name of the track.
     */
    @JsonProperty(value = "trackName")
    private String trackName;

    /*
     * Type of the track.
     */
    @JsonProperty(value = "trackType")
    private LiveEventTrackType trackType;

    /*
     * Bitrate of the track.
     */
    @JsonProperty(value = "bitrate")
    private Long bitrate;

    /*
     * Calculated bitrate based on data chunks coming from encoder.
     */
    @JsonProperty(value = "incomingBitrate")
    private Long incomingBitrate;

    /*
     * Latest timestamp received for a track in last 20 seconds.
     */
    @JsonProperty(value = "lastTimestamp")
    private String lastTimestamp;

    /*
     * Timescale in which timestamps are expressed.
     */
    @JsonProperty(value = "timescale")
    private String timescale;

    /*
     * Number of data chunks that had overlapped timestamps in last 20 seconds.
     */
    @JsonProperty(value = "overlapCount")
    private Long overlapCount;

    /*
     * Number of discontinuities detected in the last 20 seconds.
     */
    @JsonProperty(value = "discontinuityCount")
    private Long discontinuityCount;

    /*
     * Number of data chunks with timestamps in the past that were received in last 20 seconds.
     */
    @JsonProperty(value = "nonincreasingCount")
    private Long nonincreasingCount;

    /*
     * If expected and actual bitrates differ by more than allowed limit in last 20 seconds.
     */
    @JsonProperty(value = "unexpectedBitrate")
    private Boolean unexpectedBitrate;

    /*
     * State of the live event.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Indicates whether ingest is healthy.
     */
    @JsonProperty(value = "healthy")
    private Boolean healthy;

    /*
     * The last timestamp in UTC that a fragment arrived at the ingest endpoint.
     */
    @JsonProperty(value = "lastFragmentArrivalTime")
    private OffsetDateTime lastFragmentArrivalTime;

    /*
     * Indicates the speed of delay, in seconds-per-minute, of the incoming audio or video data during the last minute.
     * The value is greater than zero if data is arriving to the live event slower than expected in the last minute;
     * zero if data arrived with no delay; and "n/a" if no audio or video data was received. For example, if you have a
     * contribution encoder sending in live content, and it is slowing down due to processing issues, or network
     * latency, it may be only able to deliver a total of 58 seconds of audio or video in a one-minute period. This
     * would be reported as two seconds-per-minute of drift. If the encoder is able to catch up and send all 60 seconds
     * or more of data every minute, you will see this value reported as 0. If there was a disconnection or
     * discontinuity from the encoder, this value may still display as 0, as it does not account for breaks in the data
     * - only data that is delayed in timestamps.
     */
    @JsonProperty(value = "ingestDriftValue")
    private String ingestDriftValue;

    /*
     * This value is "On" for audio track heartbeats if live transcription is turned on, otherwise you will see an empty
     * string. This state is only applicable to track type of "audio" for Live transcription. All other tracks will have
     * an empty value.
     */
    @JsonProperty(value = "transcriptionState")
    private String transcriptionState;

    /*
     * The language code (in BCP-47 format) of the transcription language. For example, "de-de" indicates German
     * (Germany). The value is empty for the video track heartbeats, or when live transcription is turned off.
     */
    @JsonProperty(value = "transcriptionLanguage")
    private String transcriptionLanguage;

    /**
     * Creates an instance of LiveEventTrackEventData class.
     */
    public LiveEventTrackEventData() {
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
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    /**
     * Get the trackType property: Type of the track.
     * 
     * @return the trackType value.
     */
    public LiveEventTrackType trackType() {
        return this.trackType;
    }

    /**
     * Set the trackType property: Type of the track.
     * 
     * @param trackType the trackType value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withTrackType(LiveEventTrackType trackType) {
        this.trackType = trackType;
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
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Get the incomingBitrate property: Calculated bitrate based on data chunks coming from encoder.
     * 
     * @return the incomingBitrate value.
     */
    public Long incomingBitrate() {
        return this.incomingBitrate;
    }

    /**
     * Set the incomingBitrate property: Calculated bitrate based on data chunks coming from encoder.
     * 
     * @param incomingBitrate the incomingBitrate value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withIncomingBitrate(Long incomingBitrate) {
        this.incomingBitrate = incomingBitrate;
        return this;
    }

    /**
     * Get the lastTimestamp property: Latest timestamp received for a track in last 20 seconds.
     * 
     * @return the lastTimestamp value.
     */
    public String lastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * Set the lastTimestamp property: Latest timestamp received for a track in last 20 seconds.
     * 
     * @param lastTimestamp the lastTimestamp value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
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
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withTimescale(String timescale) {
        this.timescale = timescale;
        return this;
    }

    /**
     * Get the overlapCount property: Number of data chunks that had overlapped timestamps in last 20 seconds.
     * 
     * @return the overlapCount value.
     */
    public Long overlapCount() {
        return this.overlapCount;
    }

    /**
     * Set the overlapCount property: Number of data chunks that had overlapped timestamps in last 20 seconds.
     * 
     * @param overlapCount the overlapCount value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withOverlapCount(Long overlapCount) {
        this.overlapCount = overlapCount;
        return this;
    }

    /**
     * Get the discontinuityCount property: Number of discontinuities detected in the last 20 seconds.
     * 
     * @return the discontinuityCount value.
     */
    public Long discontinuityCount() {
        return this.discontinuityCount;
    }

    /**
     * Set the discontinuityCount property: Number of discontinuities detected in the last 20 seconds.
     * 
     * @param discontinuityCount the discontinuityCount value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withDiscontinuityCount(Long discontinuityCount) {
        this.discontinuityCount = discontinuityCount;
        return this;
    }

    /**
     * Get the nonincreasingCount property: Number of data chunks with timestamps in the past that were received in last
     * 20 seconds.
     * 
     * @return the nonincreasingCount value.
     */
    public Long nonincreasingCount() {
        return this.nonincreasingCount;
    }

    /**
     * Set the nonincreasingCount property: Number of data chunks with timestamps in the past that were received in last
     * 20 seconds.
     * 
     * @param nonincreasingCount the nonincreasingCount value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withNonincreasingCount(Long nonincreasingCount) {
        this.nonincreasingCount = nonincreasingCount;
        return this;
    }

    /**
     * Get the unexpectedBitrate property: If expected and actual bitrates differ by more than allowed limit in last 20
     * seconds.
     * 
     * @return the unexpectedBitrate value.
     */
    public Boolean unexpectedBitrate() {
        return this.unexpectedBitrate;
    }

    /**
     * Set the unexpectedBitrate property: If expected and actual bitrates differ by more than allowed limit in last 20
     * seconds.
     * 
     * @param unexpectedBitrate the unexpectedBitrate value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withUnexpectedBitrate(Boolean unexpectedBitrate) {
        this.unexpectedBitrate = unexpectedBitrate;
        return this;
    }

    /**
     * Get the state property: State of the live event.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State of the live event.
     * 
     * @param state the state value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the healthy property: Indicates whether ingest is healthy.
     * 
     * @return the healthy value.
     */
    public Boolean healthy() {
        return this.healthy;
    }

    /**
     * Set the healthy property: Indicates whether ingest is healthy.
     * 
     * @param healthy the healthy value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withHealthy(Boolean healthy) {
        this.healthy = healthy;
        return this;
    }

    /**
     * Get the lastFragmentArrivalTime property: The last timestamp in UTC that a fragment arrived at the ingest
     * endpoint.
     * 
     * @return the lastFragmentArrivalTime value.
     */
    public OffsetDateTime lastFragmentArrivalTime() {
        return this.lastFragmentArrivalTime;
    }

    /**
     * Set the lastFragmentArrivalTime property: The last timestamp in UTC that a fragment arrived at the ingest
     * endpoint.
     * 
     * @param lastFragmentArrivalTime the lastFragmentArrivalTime value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withLastFragmentArrivalTime(OffsetDateTime lastFragmentArrivalTime) {
        this.lastFragmentArrivalTime = lastFragmentArrivalTime;
        return this;
    }

    /**
     * Get the ingestDriftValue property: Indicates the speed of delay, in seconds-per-minute, of the incoming audio or
     * video data during the last minute. The value is greater than zero if data is arriving to the live event slower
     * than expected in the last minute; zero if data arrived with no delay; and "n/a" if no audio or video data was
     * received. For example, if you have a contribution encoder sending in live content, and it is slowing down due to
     * processing issues, or network latency, it may be only able to deliver a total of 58 seconds of audio or video in
     * a one-minute period. This would be reported as two seconds-per-minute of drift. If the encoder is able to catch
     * up and send all 60 seconds or more of data every minute, you will see this value reported as 0. If there was a
     * disconnection or discontinuity from the encoder, this value may still display as 0, as it does not account for
     * breaks in the data - only data that is delayed in timestamps.
     * 
     * @return the ingestDriftValue value.
     */
    public String ingestDriftValue() {
        return this.ingestDriftValue;
    }

    /**
     * Set the ingestDriftValue property: Indicates the speed of delay, in seconds-per-minute, of the incoming audio or
     * video data during the last minute. The value is greater than zero if data is arriving to the live event slower
     * than expected in the last minute; zero if data arrived with no delay; and "n/a" if no audio or video data was
     * received. For example, if you have a contribution encoder sending in live content, and it is slowing down due to
     * processing issues, or network latency, it may be only able to deliver a total of 58 seconds of audio or video in
     * a one-minute period. This would be reported as two seconds-per-minute of drift. If the encoder is able to catch
     * up and send all 60 seconds or more of data every minute, you will see this value reported as 0. If there was a
     * disconnection or discontinuity from the encoder, this value may still display as 0, as it does not account for
     * breaks in the data - only data that is delayed in timestamps.
     * 
     * @param ingestDriftValue the ingestDriftValue value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withIngestDriftValue(String ingestDriftValue) {
        this.ingestDriftValue = ingestDriftValue;
        return this;
    }

    /**
     * Get the transcriptionState property: This value is "On" for audio track heartbeats if live transcription is
     * turned on, otherwise you will see an empty string. This state is only applicable to track type of "audio" for
     * Live transcription. All other tracks will have an empty value.
     * 
     * @return the transcriptionState value.
     */
    public String transcriptionState() {
        return this.transcriptionState;
    }

    /**
     * Set the transcriptionState property: This value is "On" for audio track heartbeats if live transcription is
     * turned on, otherwise you will see an empty string. This state is only applicable to track type of "audio" for
     * Live transcription. All other tracks will have an empty value.
     * 
     * @param transcriptionState the transcriptionState value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withTranscriptionState(String transcriptionState) {
        this.transcriptionState = transcriptionState;
        return this;
    }

    /**
     * Get the transcriptionLanguage property: The language code (in BCP-47 format) of the transcription language. For
     * example, "de-de" indicates German (Germany). The value is empty for the video track heartbeats, or when live
     * transcription is turned off.
     * 
     * @return the transcriptionLanguage value.
     */
    public String transcriptionLanguage() {
        return this.transcriptionLanguage;
    }

    /**
     * Set the transcriptionLanguage property: The language code (in BCP-47 format) of the transcription language. For
     * example, "de-de" indicates German (Germany). The value is empty for the video track heartbeats, or when live
     * transcription is turned off.
     * 
     * @param transcriptionLanguage the transcriptionLanguage value to set.
     * @return the LiveEventTrackEventData object itself.
     */
    public LiveEventTrackEventData withTranscriptionLanguage(String transcriptionLanguage) {
        this.transcriptionLanguage = transcriptionLanguage;
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
