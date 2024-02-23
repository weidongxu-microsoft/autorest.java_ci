// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all settings for the cluster upgrade window.
 */
@Fluent
public final class UpgradePreferences {
    /*
     * Preferred day of the week in UTC time to begin an upgrade. If 'Any' is selected, upgrade will proceed at any
     * given weekday
     */
    @JsonProperty(value = "startDayOfWeek")
    private StartDayOfWeek startDayOfWeek;

    /*
     * Preferred hour of the day in UTC time to begin an upgrade
     */
    @JsonProperty(value = "startHourOfDay")
    private Integer startHourOfDay;

    /**
     * Creates an instance of UpgradePreferences class.
     */
    public UpgradePreferences() {
    }

    /**
     * Get the startDayOfWeek property: Preferred day of the week in UTC time to begin an upgrade. If 'Any' is selected,
     * upgrade will proceed at any given weekday.
     * 
     * @return the startDayOfWeek value.
     */
    public StartDayOfWeek startDayOfWeek() {
        return this.startDayOfWeek;
    }

    /**
     * Set the startDayOfWeek property: Preferred day of the week in UTC time to begin an upgrade. If 'Any' is selected,
     * upgrade will proceed at any given weekday.
     * 
     * @param startDayOfWeek the startDayOfWeek value to set.
     * @return the UpgradePreferences object itself.
     */
    public UpgradePreferences withStartDayOfWeek(StartDayOfWeek startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
        return this;
    }

    /**
     * Get the startHourOfDay property: Preferred hour of the day in UTC time to begin an upgrade.
     * 
     * @return the startHourOfDay value.
     */
    public Integer startHourOfDay() {
        return this.startHourOfDay;
    }

    /**
     * Set the startHourOfDay property: Preferred hour of the day in UTC time to begin an upgrade.
     * 
     * @param startHourOfDay the startHourOfDay value to set.
     * @return the UpgradePreferences object itself.
     */
    public UpgradePreferences withStartHourOfDay(Integer startHourOfDay) {
        this.startHourOfDay = startHourOfDay;
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
