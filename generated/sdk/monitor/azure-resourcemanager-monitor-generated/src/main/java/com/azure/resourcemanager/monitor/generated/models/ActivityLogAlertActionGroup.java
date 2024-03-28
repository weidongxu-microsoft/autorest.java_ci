// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A pointer to an Azure Action Group.
 */
@Fluent
public final class ActivityLogAlertActionGroup {
    /*
     * The resourceId of the action group. This cannot be null or empty.
     */
    @JsonProperty(value = "actionGroupId", required = true)
    private String actionGroupId;

    /*
     * the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     */
    @JsonProperty(value = "webhookProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> webhookProperties;

    /**
     * Creates an instance of ActivityLogAlertActionGroup class.
     */
    public ActivityLogAlertActionGroup() {
    }

    /**
     * Get the actionGroupId property: The resourceId of the action group. This cannot be null or empty.
     * 
     * @return the actionGroupId value.
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Set the actionGroupId property: The resourceId of the action group. This cannot be null or empty.
     * 
     * @param actionGroupId the actionGroupId value to set.
     * @return the ActivityLogAlertActionGroup object itself.
     */
    public ActivityLogAlertActionGroup withActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
        return this;
    }

    /**
     * Get the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     * 
     * @return the webhookProperties value.
     */
    public Map<String, String> webhookProperties() {
        return this.webhookProperties;
    }

    /**
     * Set the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     * 
     * @param webhookProperties the webhookProperties value to set.
     * @return the ActivityLogAlertActionGroup object itself.
     */
    public ActivityLogAlertActionGroup withWebhookProperties(Map<String, String> webhookProperties) {
        this.webhookProperties = webhookProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionGroupId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property actionGroupId in model ActivityLogAlertActionGroup"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActivityLogAlertActionGroup.class);
}
