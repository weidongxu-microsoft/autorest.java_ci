// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.RetentionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The log profile resource.
 */
@Fluent
public final class LogProfileResourceInner extends Resource {
    /*
     * The log profile properties of the resource.
     */
    @JsonProperty(value = "properties", required = true)
    private LogProfileProperties innerProperties = new LogProfileProperties();

    /**
     * Creates an instance of LogProfileResourceInner class.
     */
    public LogProfileResourceInner() {
    }

    /**
     * Get the innerProperties property: The log profile properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private LogProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogProfileResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogProfileResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the storageAccountId property: the resource id of the storage account to which you would like to send the
     * Activity Log.
     * 
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountId();
    }

    /**
     * Set the storageAccountId property: the resource id of the storage account to which you would like to send the
     * Activity Log.
     * 
     * @param storageAccountId the storageAccountId value to set.
     * @return the LogProfileResourceInner object itself.
     */
    public LogProfileResourceInner withStorageAccountId(String storageAccountId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogProfileProperties();
        }
        this.innerProperties().withStorageAccountId(storageAccountId);
        return this;
    }

    /**
     * Get the serviceBusRuleId property: The service bus rule ID of the service bus namespace in which you would like
     * to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource
     * ID}/authorizationrules/{key name}'.
     * 
     * @return the serviceBusRuleId value.
     */
    public String serviceBusRuleId() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusRuleId();
    }

    /**
     * Set the serviceBusRuleId property: The service bus rule ID of the service bus namespace in which you would like
     * to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource
     * ID}/authorizationrules/{key name}'.
     * 
     * @param serviceBusRuleId the serviceBusRuleId value to set.
     * @return the LogProfileResourceInner object itself.
     */
    public LogProfileResourceInner withServiceBusRuleId(String serviceBusRuleId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogProfileProperties();
        }
        this.innerProperties().withServiceBusRuleId(serviceBusRuleId);
        return this;
    }

    /**
     * Get the locations property: List of regions for which Activity Log events should be stored or streamed. It is a
     * comma separated list of valid ARM locations including the 'global' location.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.innerProperties() == null ? null : this.innerProperties().locations();
    }

    /**
     * Set the locations property: List of regions for which Activity Log events should be stored or streamed. It is a
     * comma separated list of valid ARM locations including the 'global' location.
     * 
     * @param locations the locations value to set.
     * @return the LogProfileResourceInner object itself.
     */
    public LogProfileResourceInner withLocations(List<String> locations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogProfileProperties();
        }
        this.innerProperties().withLocations(locations);
        return this;
    }

    /**
     * Get the categories property: the categories of the logs. These categories are created as is convenient to the
     * user. Some values are: 'Write', 'Delete', and/or 'Action.'.
     * 
     * @return the categories value.
     */
    public List<String> categories() {
        return this.innerProperties() == null ? null : this.innerProperties().categories();
    }

    /**
     * Set the categories property: the categories of the logs. These categories are created as is convenient to the
     * user. Some values are: 'Write', 'Delete', and/or 'Action.'.
     * 
     * @param categories the categories value to set.
     * @return the LogProfileResourceInner object itself.
     */
    public LogProfileResourceInner withCategories(List<String> categories) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogProfileProperties();
        }
        this.innerProperties().withCategories(categories);
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy for the events in the log.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionPolicy();
    }

    /**
     * Set the retentionPolicy property: the retention policy for the events in the log.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the LogProfileResourceInner object itself.
     */
    public LogProfileResourceInner withRetentionPolicy(RetentionPolicy retentionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LogProfileProperties();
        }
        this.innerProperties().withRetentionPolicy(retentionPolicy);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model LogProfileResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogProfileResourceInner.class);
}
