// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The live event ingest interruption data. */
@Fluent
public final class LiveEventIngestInterruption {
    /*
     * UTC time of interruption start, encoder disconnected.
     */
    @JsonProperty(value = "begin")
    private OffsetDateTime begin;

    /*
     * UTC time of interruption end, encoder re-connected.
     */
    @JsonProperty(value = "end")
    private OffsetDateTime end;

    /*
     * Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour and 30 minutes.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * Interruption reason.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /** Creates an instance of LiveEventIngestInterruption class. */
    public LiveEventIngestInterruption() {
    }

    /**
     * Get the begin property: UTC time of interruption start, encoder disconnected.
     *
     * @return the begin value.
     */
    public OffsetDateTime begin() {
        return this.begin;
    }

    /**
     * Set the begin property: UTC time of interruption start, encoder disconnected.
     *
     * @param begin the begin value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withBegin(OffsetDateTime begin) {
        this.begin = begin;
        return this;
    }

    /**
     * Get the end property: UTC time of interruption end, encoder re-connected.
     *
     * @return the end value.
     */
    public OffsetDateTime end() {
        return this.end;
    }

    /**
     * Set the end property: UTC time of interruption end, encoder re-connected.
     *
     * @param end the end value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withEnd(OffsetDateTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get the duration property: Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour
     * and 30 minutes.
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of interruption in ISO 8601 time. For example, use PT1H30M to indicate 1 hour
     * and 30 minutes.
     *
     * @param duration the duration value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the reason property: Interruption reason.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Interruption reason.
     *
     * @param reason the reason value to set.
     * @return the LiveEventIngestInterruption object itself.
     */
    public LiveEventIngestInterruption withReason(String reason) {
        this.reason = reason;
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