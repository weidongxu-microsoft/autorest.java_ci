// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set assessment schedule for SQL Server.
 */
@Fluent
public final class Schedule {
    /*
     * Enable or disable assessment schedule on SQL virtual machine.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /*
     * Number of weeks to schedule between 2 assessment runs. Takes value from 1-6
     */
    @JsonProperty(value = "weeklyInterval")
    private Integer weeklyInterval;

    /*
     * Occurrence of the DayOfWeek day within a month to schedule assessment. Takes values: 1,2,3,4 and -1. Use -1 for last DayOfWeek day of the month
     */
    @JsonProperty(value = "monthlyOccurrence")
    private Integer monthlyOccurrence;

    /*
     * Day of the week to run assessment.
     */
    @JsonProperty(value = "dayOfWeek")
    private AssessmentDayOfWeek dayOfWeek;

    /*
     * Time of the day in HH:mm format. Eg. 17:30
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /**
     * Creates an instance of Schedule class.
     */
    public Schedule() {
    }

    /**
     * Get the enable property: Enable or disable assessment schedule on SQL virtual machine.
     * 
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: Enable or disable assessment schedule on SQL virtual machine.
     * 
     * @param enable the enable value to set.
     * @return the Schedule object itself.
     */
    public Schedule withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the weeklyInterval property: Number of weeks to schedule between 2 assessment runs. Takes value from 1-6.
     * 
     * @return the weeklyInterval value.
     */
    public Integer weeklyInterval() {
        return this.weeklyInterval;
    }

    /**
     * Set the weeklyInterval property: Number of weeks to schedule between 2 assessment runs. Takes value from 1-6.
     * 
     * @param weeklyInterval the weeklyInterval value to set.
     * @return the Schedule object itself.
     */
    public Schedule withWeeklyInterval(Integer weeklyInterval) {
        this.weeklyInterval = weeklyInterval;
        return this;
    }

    /**
     * Get the monthlyOccurrence property: Occurrence of the DayOfWeek day within a month to schedule assessment. Takes values: 1,2,3,4 and -1. Use -1 for last DayOfWeek day of the month.
     * 
     * @return the monthlyOccurrence value.
     */
    public Integer monthlyOccurrence() {
        return this.monthlyOccurrence;
    }

    /**
     * Set the monthlyOccurrence property: Occurrence of the DayOfWeek day within a month to schedule assessment. Takes values: 1,2,3,4 and -1. Use -1 for last DayOfWeek day of the month.
     * 
     * @param monthlyOccurrence the monthlyOccurrence value to set.
     * @return the Schedule object itself.
     */
    public Schedule withMonthlyOccurrence(Integer monthlyOccurrence) {
        this.monthlyOccurrence = monthlyOccurrence;
        return this;
    }

    /**
     * Get the dayOfWeek property: Day of the week to run assessment.
     * 
     * @return the dayOfWeek value.
     */
    public AssessmentDayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Day of the week to run assessment.
     * 
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the Schedule object itself.
     */
    public Schedule withDayOfWeek(AssessmentDayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the startTime property: Time of the day in HH:mm format. Eg. 17:30.
     * 
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Time of the day in HH:mm format. Eg. 17:30.
     * 
     * @param startTime the startTime value to set.
     * @return the Schedule object itself.
     */
    public Schedule withStartTime(String startTime) {
        this.startTime = startTime;
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
