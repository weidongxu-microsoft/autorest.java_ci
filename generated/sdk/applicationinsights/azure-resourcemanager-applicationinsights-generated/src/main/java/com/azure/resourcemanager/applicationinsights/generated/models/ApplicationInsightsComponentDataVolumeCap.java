// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Application Insights component daily data volume cap. */
@Fluent
public final class ApplicationInsightsComponentDataVolumeCap {
    /*
     * Daily data volume cap in GB.
     */
    @JsonProperty(value = "Cap")
    private Float cap;

    /*
     * Daily data volume cap UTC reset hour.
     */
    @JsonProperty(value = "ResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resetTime;

    /*
     * Reserved, not used for now.
     */
    @JsonProperty(value = "WarningThreshold")
    private Integer warningThreshold;

    /*
     * Reserved, not used for now.
     */
    @JsonProperty(value = "StopSendNotificationWhenHitThreshold")
    private Boolean stopSendNotificationWhenHitThreshold;

    /*
     * Do not send a notification email when the daily data volume cap is met.
     */
    @JsonProperty(value = "StopSendNotificationWhenHitCap")
    private Boolean stopSendNotificationWhenHitCap;

    /*
     * Maximum daily data volume cap that the user can set for this component.
     */
    @JsonProperty(value = "MaxHistoryCap", access = JsonProperty.Access.WRITE_ONLY)
    private Float maxHistoryCap;

    /** Creates an instance of ApplicationInsightsComponentDataVolumeCap class. */
    public ApplicationInsightsComponentDataVolumeCap() {
    }

    /**
     * Get the cap property: Daily data volume cap in GB.
     *
     * @return the cap value.
     */
    public Float cap() {
        return this.cap;
    }

    /**
     * Set the cap property: Daily data volume cap in GB.
     *
     * @param cap the cap value to set.
     * @return the ApplicationInsightsComponentDataVolumeCap object itself.
     */
    public ApplicationInsightsComponentDataVolumeCap withCap(Float cap) {
        this.cap = cap;
        return this;
    }

    /**
     * Get the resetTime property: Daily data volume cap UTC reset hour.
     *
     * @return the resetTime value.
     */
    public Integer resetTime() {
        return this.resetTime;
    }

    /**
     * Get the warningThreshold property: Reserved, not used for now.
     *
     * @return the warningThreshold value.
     */
    public Integer warningThreshold() {
        return this.warningThreshold;
    }

    /**
     * Set the warningThreshold property: Reserved, not used for now.
     *
     * @param warningThreshold the warningThreshold value to set.
     * @return the ApplicationInsightsComponentDataVolumeCap object itself.
     */
    public ApplicationInsightsComponentDataVolumeCap withWarningThreshold(Integer warningThreshold) {
        this.warningThreshold = warningThreshold;
        return this;
    }

    /**
     * Get the stopSendNotificationWhenHitThreshold property: Reserved, not used for now.
     *
     * @return the stopSendNotificationWhenHitThreshold value.
     */
    public Boolean stopSendNotificationWhenHitThreshold() {
        return this.stopSendNotificationWhenHitThreshold;
    }

    /**
     * Set the stopSendNotificationWhenHitThreshold property: Reserved, not used for now.
     *
     * @param stopSendNotificationWhenHitThreshold the stopSendNotificationWhenHitThreshold value to set.
     * @return the ApplicationInsightsComponentDataVolumeCap object itself.
     */
    public ApplicationInsightsComponentDataVolumeCap withStopSendNotificationWhenHitThreshold(
        Boolean stopSendNotificationWhenHitThreshold) {
        this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
        return this;
    }

    /**
     * Get the stopSendNotificationWhenHitCap property: Do not send a notification email when the daily data volume cap
     * is met.
     *
     * @return the stopSendNotificationWhenHitCap value.
     */
    public Boolean stopSendNotificationWhenHitCap() {
        return this.stopSendNotificationWhenHitCap;
    }

    /**
     * Set the stopSendNotificationWhenHitCap property: Do not send a notification email when the daily data volume cap
     * is met.
     *
     * @param stopSendNotificationWhenHitCap the stopSendNotificationWhenHitCap value to set.
     * @return the ApplicationInsightsComponentDataVolumeCap object itself.
     */
    public ApplicationInsightsComponentDataVolumeCap withStopSendNotificationWhenHitCap(
        Boolean stopSendNotificationWhenHitCap) {
        this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
        return this;
    }

    /**
     * Get the maxHistoryCap property: Maximum daily data volume cap that the user can set for this component.
     *
     * @return the maxHistoryCap value.
     */
    public Float maxHistoryCap() {
        return this.maxHistoryCap;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
