// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/**
 * Properties of the Queue info for event subscription.
 */
@Fluent
public final class QueueInfo {
    /*
     * Maximum period in seconds in which once the message is in received (by the client) state and waiting to be accepted, released or rejected.
     * If this time elapsed after a message has been received by the client and not transitioned into accepted (not processed), released or rejected,
     * the message is available for redelivery. This is an optional field, where default is 60 seconds, minimum is 60 seconds and maximum is 300 seconds.
     */
    @JsonProperty(value = "receiveLockDurationInSeconds")
    private Integer receiveLockDurationInSeconds;

    /*
     * The maximum delivery count of the events.
     */
    @JsonProperty(value = "maxDeliveryCount")
    private Integer maxDeliveryCount;

    /*
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic) to acquire the authentication tokens being used during delivery / dead-lettering.
     */
    @JsonProperty(value = "deadLetterDestinationWithResourceIdentity")
    private DeadLetterWithResourceIdentity deadLetterDestinationWithResourceIdentity;

    /*
     * Time span duration in ISO 8601 format that determines how long messages are available to the subscription from the time the message was published.
     * This duration value is expressed using the following format: \'P(n)Y(n)M(n)DT(n)H(n)M(n)S\', where:
     *     - (n) is replaced by the value of each time element that follows the (n).
     *     - P is the duration (or Period) designator and is always placed at the beginning of the duration.
     *     - Y is the year designator, and it follows the value for the number of years.
     *     - M is the month designator, and it follows the value for the number of months.
     *     - W is the week designator, and it follows the value for the number of weeks.
     *     - D is the day designator, and it follows the value for the number of days.
     *     - T is the time designator, and it precedes the time components.
     *     - H is the hour designator, and it follows the value for the number of hours.
     *     - M is the minute designator, and it follows the value for the number of minutes.
     *     - S is the second designator, and it follows the value for the number of seconds.
     * This duration value cannot be set greater than the topic’s EventRetentionInDays. It is is an optional field where its minimum value is 1 minute, and its maximum is determined
     * by topic’s EventRetentionInDays value. The followings are examples of valid values:
     *     - \'P0DT23H12M\' or \'PT23H12M\': for duration of 23 hours and 12 minutes.
     *     - \'P1D\' or \'P1DT0H0M0S\': for duration of 1 day.
     */
    @JsonProperty(value = "eventTimeToLive")
    private Duration eventTimeToLive;

    /**
     * Creates an instance of QueueInfo class.
     */
    public QueueInfo() {
    }

    /**
     * Get the receiveLockDurationInSeconds property: Maximum period in seconds in which once the message is in received
     * (by the client) state and waiting to be accepted, released or rejected.
     * If this time elapsed after a message has been received by the client and not transitioned into accepted (not
     * processed), released or rejected,
     * the message is available for redelivery. This is an optional field, where default is 60 seconds, minimum is 60
     * seconds and maximum is 300 seconds.
     * 
     * @return the receiveLockDurationInSeconds value.
     */
    public Integer receiveLockDurationInSeconds() {
        return this.receiveLockDurationInSeconds;
    }

    /**
     * Set the receiveLockDurationInSeconds property: Maximum period in seconds in which once the message is in received
     * (by the client) state and waiting to be accepted, released or rejected.
     * If this time elapsed after a message has been received by the client and not transitioned into accepted (not
     * processed), released or rejected,
     * the message is available for redelivery. This is an optional field, where default is 60 seconds, minimum is 60
     * seconds and maximum is 300 seconds.
     * 
     * @param receiveLockDurationInSeconds the receiveLockDurationInSeconds value to set.
     * @return the QueueInfo object itself.
     */
    public QueueInfo withReceiveLockDurationInSeconds(Integer receiveLockDurationInSeconds) {
        this.receiveLockDurationInSeconds = receiveLockDurationInSeconds;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count of the events.
     * 
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The maximum delivery count of the events.
     * 
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the QueueInfo object itself.
     */
    public QueueInfo withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the deadLetterDestinationWithResourceIdentity property: The dead letter destination of the event
     * subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic) to acquire the authentication tokens being
     * used during delivery / dead-lettering.
     * 
     * @return the deadLetterDestinationWithResourceIdentity value.
     */
    public DeadLetterWithResourceIdentity deadLetterDestinationWithResourceIdentity() {
        return this.deadLetterDestinationWithResourceIdentity;
    }

    /**
     * Set the deadLetterDestinationWithResourceIdentity property: The dead letter destination of the event
     * subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic) to acquire the authentication tokens being
     * used during delivery / dead-lettering.
     * 
     * @param deadLetterDestinationWithResourceIdentity the deadLetterDestinationWithResourceIdentity value to set.
     * @return the QueueInfo object itself.
     */
    public QueueInfo withDeadLetterDestinationWithResourceIdentity(
        DeadLetterWithResourceIdentity deadLetterDestinationWithResourceIdentity) {
        this.deadLetterDestinationWithResourceIdentity = deadLetterDestinationWithResourceIdentity;
        return this;
    }

    /**
     * Get the eventTimeToLive property: Time span duration in ISO 8601 format that determines how long messages are
     * available to the subscription from the time the message was published.
     * This duration value is expressed using the following format: \'P(n)Y(n)M(n)DT(n)H(n)M(n)S\', where:
     * - (n) is replaced by the value of each time element that follows the (n).
     * - P is the duration (or Period) designator and is always placed at the beginning of the duration.
     * - Y is the year designator, and it follows the value for the number of years.
     * - M is the month designator, and it follows the value for the number of months.
     * - W is the week designator, and it follows the value for the number of weeks.
     * - D is the day designator, and it follows the value for the number of days.
     * - T is the time designator, and it precedes the time components.
     * - H is the hour designator, and it follows the value for the number of hours.
     * - M is the minute designator, and it follows the value for the number of minutes.
     * - S is the second designator, and it follows the value for the number of seconds.
     * This duration value cannot be set greater than the topic’s EventRetentionInDays. It is is an optional field where
     * its minimum value is 1 minute, and its maximum is determined
     * by topic’s EventRetentionInDays value. The followings are examples of valid values:
     * - \'P0DT23H12M\' or \'PT23H12M\': for duration of 23 hours and 12 minutes.
     * - \'P1D\' or \'P1DT0H0M0S\': for duration of 1 day.
     * 
     * @return the eventTimeToLive value.
     */
    public Duration eventTimeToLive() {
        return this.eventTimeToLive;
    }

    /**
     * Set the eventTimeToLive property: Time span duration in ISO 8601 format that determines how long messages are
     * available to the subscription from the time the message was published.
     * This duration value is expressed using the following format: \'P(n)Y(n)M(n)DT(n)H(n)M(n)S\', where:
     * - (n) is replaced by the value of each time element that follows the (n).
     * - P is the duration (or Period) designator and is always placed at the beginning of the duration.
     * - Y is the year designator, and it follows the value for the number of years.
     * - M is the month designator, and it follows the value for the number of months.
     * - W is the week designator, and it follows the value for the number of weeks.
     * - D is the day designator, and it follows the value for the number of days.
     * - T is the time designator, and it precedes the time components.
     * - H is the hour designator, and it follows the value for the number of hours.
     * - M is the minute designator, and it follows the value for the number of minutes.
     * - S is the second designator, and it follows the value for the number of seconds.
     * This duration value cannot be set greater than the topic’s EventRetentionInDays. It is is an optional field where
     * its minimum value is 1 minute, and its maximum is determined
     * by topic’s EventRetentionInDays value. The followings are examples of valid values:
     * - \'P0DT23H12M\' or \'PT23H12M\': for duration of 23 hours and 12 minutes.
     * - \'P1D\' or \'P1DT0H0M0S\': for duration of 1 day.
     * 
     * @param eventTimeToLive the eventTimeToLive value to set.
     * @return the QueueInfo object itself.
     */
    public QueueInfo withEventTimeToLive(Duration eventTimeToLive) {
        this.eventTimeToLive = eventTimeToLive;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deadLetterDestinationWithResourceIdentity() != null) {
            deadLetterDestinationWithResourceIdentity().validate();
        }
    }
}
