// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ScheduledEventsProfile model. */
@Fluent
public final class ScheduledEventsProfile {
    /*
     * Specifies Terminate Scheduled Event related configurations.
     */
    @JsonProperty(value = "terminateNotificationProfile")
    private TerminateNotificationProfile terminateNotificationProfile;

    /** Creates an instance of ScheduledEventsProfile class. */
    public ScheduledEventsProfile() {
    }

    /**
     * Get the terminateNotificationProfile property: Specifies Terminate Scheduled Event related configurations.
     *
     * @return the terminateNotificationProfile value.
     */
    public TerminateNotificationProfile terminateNotificationProfile() {
        return this.terminateNotificationProfile;
    }

    /**
     * Set the terminateNotificationProfile property: Specifies Terminate Scheduled Event related configurations.
     *
     * @param terminateNotificationProfile the terminateNotificationProfile value to set.
     * @return the ScheduledEventsProfile object itself.
     */
    public ScheduledEventsProfile withTerminateNotificationProfile(
        TerminateNotificationProfile terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (terminateNotificationProfile() != null) {
            terminateNotificationProfile().validate();
        }
    }
}
