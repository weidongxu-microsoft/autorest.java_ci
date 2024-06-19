// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies Redeploy, Reboot and ScheduledEventsAdditionalPublishingTargets Scheduled Event related configurations.
 */
@Fluent
public final class ScheduledEventsPolicy implements JsonSerializable<ScheduledEventsPolicy> {
    /*
     * The configuration parameters used while creating userInitiatedRedeploy scheduled event setting creation.
     */
    private UserInitiatedRedeploy userInitiatedRedeploy;

    /*
     * The configuration parameters used while creating userInitiatedReboot scheduled event setting creation.
     */
    private UserInitiatedReboot userInitiatedReboot;

    /*
     * The configuration parameters used while publishing scheduledEventsAdditionalPublishingTargets.
     */
    private ScheduledEventsAdditionalPublishingTargets scheduledEventsAdditionalPublishingTargets;

    /**
     * Creates an instance of ScheduledEventsPolicy class.
     */
    public ScheduledEventsPolicy() {
    }

    /**
     * Get the userInitiatedRedeploy property: The configuration parameters used while creating userInitiatedRedeploy
     * scheduled event setting creation.
     * 
     * @return the userInitiatedRedeploy value.
     */
    public UserInitiatedRedeploy userInitiatedRedeploy() {
        return this.userInitiatedRedeploy;
    }

    /**
     * Set the userInitiatedRedeploy property: The configuration parameters used while creating userInitiatedRedeploy
     * scheduled event setting creation.
     * 
     * @param userInitiatedRedeploy the userInitiatedRedeploy value to set.
     * @return the ScheduledEventsPolicy object itself.
     */
    public ScheduledEventsPolicy withUserInitiatedRedeploy(UserInitiatedRedeploy userInitiatedRedeploy) {
        this.userInitiatedRedeploy = userInitiatedRedeploy;
        return this;
    }

    /**
     * Get the userInitiatedReboot property: The configuration parameters used while creating userInitiatedReboot
     * scheduled event setting creation.
     * 
     * @return the userInitiatedReboot value.
     */
    public UserInitiatedReboot userInitiatedReboot() {
        return this.userInitiatedReboot;
    }

    /**
     * Set the userInitiatedReboot property: The configuration parameters used while creating userInitiatedReboot
     * scheduled event setting creation.
     * 
     * @param userInitiatedReboot the userInitiatedReboot value to set.
     * @return the ScheduledEventsPolicy object itself.
     */
    public ScheduledEventsPolicy withUserInitiatedReboot(UserInitiatedReboot userInitiatedReboot) {
        this.userInitiatedReboot = userInitiatedReboot;
        return this;
    }

    /**
     * Get the scheduledEventsAdditionalPublishingTargets property: The configuration parameters used while publishing
     * scheduledEventsAdditionalPublishingTargets.
     * 
     * @return the scheduledEventsAdditionalPublishingTargets value.
     */
    public ScheduledEventsAdditionalPublishingTargets scheduledEventsAdditionalPublishingTargets() {
        return this.scheduledEventsAdditionalPublishingTargets;
    }

    /**
     * Set the scheduledEventsAdditionalPublishingTargets property: The configuration parameters used while publishing
     * scheduledEventsAdditionalPublishingTargets.
     * 
     * @param scheduledEventsAdditionalPublishingTargets the scheduledEventsAdditionalPublishingTargets value to set.
     * @return the ScheduledEventsPolicy object itself.
     */
    public ScheduledEventsPolicy withScheduledEventsAdditionalPublishingTargets(
        ScheduledEventsAdditionalPublishingTargets scheduledEventsAdditionalPublishingTargets) {
        this.scheduledEventsAdditionalPublishingTargets = scheduledEventsAdditionalPublishingTargets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userInitiatedRedeploy() != null) {
            userInitiatedRedeploy().validate();
        }
        if (userInitiatedReboot() != null) {
            userInitiatedReboot().validate();
        }
        if (scheduledEventsAdditionalPublishingTargets() != null) {
            scheduledEventsAdditionalPublishingTargets().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("userInitiatedRedeploy", this.userInitiatedRedeploy);
        jsonWriter.writeJsonField("userInitiatedReboot", this.userInitiatedReboot);
        jsonWriter.writeJsonField("scheduledEventsAdditionalPublishingTargets",
            this.scheduledEventsAdditionalPublishingTargets);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduledEventsPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduledEventsPolicy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScheduledEventsPolicy.
     */
    public static ScheduledEventsPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduledEventsPolicy deserializedScheduledEventsPolicy = new ScheduledEventsPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userInitiatedRedeploy".equals(fieldName)) {
                    deserializedScheduledEventsPolicy.userInitiatedRedeploy = UserInitiatedRedeploy.fromJson(reader);
                } else if ("userInitiatedReboot".equals(fieldName)) {
                    deserializedScheduledEventsPolicy.userInitiatedReboot = UserInitiatedReboot.fromJson(reader);
                } else if ("scheduledEventsAdditionalPublishingTargets".equals(fieldName)) {
                    deserializedScheduledEventsPolicy.scheduledEventsAdditionalPublishingTargets
                        = ScheduledEventsAdditionalPublishingTargets.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduledEventsPolicy;
        });
    }
}
