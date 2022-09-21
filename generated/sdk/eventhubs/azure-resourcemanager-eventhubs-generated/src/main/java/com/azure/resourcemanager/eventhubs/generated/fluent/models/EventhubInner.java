// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventhubs.generated.models.CaptureDescription;
import com.azure.resourcemanager.eventhubs.generated.models.EntityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Single item in List or Get Event Hub operation. */
@Fluent
public final class EventhubInner extends ProxyResource {
    /*
     * Properties supplied to the Create Or Update Event Hub operation.
     */
    @JsonProperty(value = "properties")
    private EventhubProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /** Creates an instance of EventhubInner class. */
    public EventhubInner() {
    }

    /**
     * Get the innerProperties property: Properties supplied to the Create Or Update Event Hub operation.
     *
     * @return the innerProperties value.
     */
    private EventhubProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the partitionIds property: Current number of shards on the Event Hub.
     *
     * @return the partitionIds value.
     */
    public List<String> partitionIds() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionIds();
    }

    /**
     * Get the createdAt property: Exact time the Event Hub was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     *
     * @return the messageRetentionInDays value.
     */
    public Long messageRetentionInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().messageRetentionInDays();
    }

    /**
     * Set the messageRetentionInDays property: Number of days to retain the events for this Event Hub, value should be
     * 1 to 7 days.
     *
     * @param messageRetentionInDays the messageRetentionInDays value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withMessageRetentionInDays(Long messageRetentionInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventhubProperties();
        }
        this.innerProperties().withMessageRetentionInDays(messageRetentionInDays);
        return this;
    }

    /**
     * Get the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     *
     * @return the partitionCount value.
     */
    public Long partitionCount() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionCount();
    }

    /**
     * Set the partitionCount property: Number of partitions created for the Event Hub, allowed values are from 1 to 32
     * partitions.
     *
     * @param partitionCount the partitionCount value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withPartitionCount(Long partitionCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventhubProperties();
        }
        this.innerProperties().withPartitionCount(partitionCount);
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of the Event Hub.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Enumerates the possible values for the status of the Event Hub.
     *
     * @param status the status value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withStatus(EntityStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventhubProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the captureDescription property: Properties of capture description.
     *
     * @return the captureDescription value.
     */
    public CaptureDescription captureDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().captureDescription();
    }

    /**
     * Set the captureDescription property: Properties of capture description.
     *
     * @param captureDescription the captureDescription value to set.
     * @return the EventhubInner object itself.
     */
    public EventhubInner withCaptureDescription(CaptureDescription captureDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventhubProperties();
        }
        this.innerProperties().withCaptureDescription(captureDescription);
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
