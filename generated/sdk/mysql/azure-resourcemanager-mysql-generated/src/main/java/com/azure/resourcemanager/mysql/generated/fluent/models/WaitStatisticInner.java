// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a Wait Statistic. */
@Fluent
public final class WaitStatisticInner extends ProxyResource {
    /*
     * The properties of a wait statistic.
     */
    @JsonProperty(value = "properties")
    private WaitStatisticProperties innerProperties;

    /** Creates an instance of WaitStatisticInner class. */
    public WaitStatisticInner() {
    }

    /**
     * Get the innerProperties property: The properties of a wait statistic.
     *
     * @return the innerProperties value.
     */
    private WaitStatisticProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Observation start time.
     *
     * @param startTime the startTime value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: Observation end time.
     *
     * @param endTime the endTime value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the eventName property: Wait event name.
     *
     * @return the eventName value.
     */
    public String eventName() {
        return this.innerProperties() == null ? null : this.innerProperties().eventName();
    }

    /**
     * Set the eventName property: Wait event name.
     *
     * @param eventName the eventName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEventName(String eventName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withEventName(eventName);
        return this;
    }

    /**
     * Get the eventTypeName property: Wait event type name.
     *
     * @return the eventTypeName value.
     */
    public String eventTypeName() {
        return this.innerProperties() == null ? null : this.innerProperties().eventTypeName();
    }

    /**
     * Set the eventTypeName property: Wait event type name.
     *
     * @param eventTypeName the eventTypeName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEventTypeName(String eventTypeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withEventTypeName(eventTypeName);
        return this;
    }

    /**
     * Get the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    public Long queryId() {
        return this.innerProperties() == null ? null : this.innerProperties().queryId();
    }

    /**
     * Set the queryId property: Database query identifier.
     *
     * @param queryId the queryId value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withQueryId(Long queryId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the databaseName property: Database Name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Set the databaseName property: Database Name.
     *
     * @param databaseName the databaseName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withDatabaseName(String databaseName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the userId property: Database user identifier.
     *
     * @return the userId value.
     */
    public Long userId() {
        return this.innerProperties() == null ? null : this.innerProperties().userId();
    }

    /**
     * Set the userId property: Database user identifier.
     *
     * @param userId the userId value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withUserId(Long userId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withUserId(userId);
        return this;
    }

    /**
     * Get the count property: Wait event count observed in this time interval.
     *
     * @return the count value.
     */
    public Long count() {
        return this.innerProperties() == null ? null : this.innerProperties().count();
    }

    /**
     * Set the count property: Wait event count observed in this time interval.
     *
     * @param count the count value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withCount(Long count) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withCount(count);
        return this;
    }

    /**
     * Get the totalTimeInMs property: Total time of wait in milliseconds in this time interval.
     *
     * @return the totalTimeInMs value.
     */
    public Double totalTimeInMs() {
        return this.innerProperties() == null ? null : this.innerProperties().totalTimeInMs();
    }

    /**
     * Set the totalTimeInMs property: Total time of wait in milliseconds in this time interval.
     *
     * @param totalTimeInMs the totalTimeInMs value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withTotalTimeInMs(Double totalTimeInMs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WaitStatisticProperties();
        }
        this.innerProperties().withTotalTimeInMs(totalTimeInMs);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
