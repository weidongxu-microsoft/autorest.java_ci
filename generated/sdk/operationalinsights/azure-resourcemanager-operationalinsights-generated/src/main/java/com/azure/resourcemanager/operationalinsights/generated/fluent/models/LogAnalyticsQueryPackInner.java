// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.models.QueryPacksResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An Log Analytics QueryPack definition.
 */
@Fluent
public final class LogAnalyticsQueryPackInner extends QueryPacksResource {
    /*
     * Properties that define a Log Analytics QueryPack resource.
     */
    @JsonProperty(value = "properties", required = true)
    private LogAnalyticsQueryPackProperties innerProperties = new LogAnalyticsQueryPackProperties();

    /**
     * Creates an instance of LogAnalyticsQueryPackInner class.
     */
    public LogAnalyticsQueryPackInner() {
    }

    /**
     * Get the innerProperties property: Properties that define a Log Analytics QueryPack resource.
     * 
     * @return the innerProperties value.
     */
    private LogAnalyticsQueryPackProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogAnalyticsQueryPackInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogAnalyticsQueryPackInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the queryPackId property: The unique ID of your application. This field cannot be changed.
     * 
     * @return the queryPackId value.
     */
    public String queryPackId() {
        return this.innerProperties() == null ? null : this.innerProperties().queryPackId();
    }

    /**
     * Get the timeCreated property: Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Get the timeModified property: Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     * @return the timeModified value.
     */
    public OffsetDateTime timeModified() {
        return this.innerProperties() == null ? null : this.innerProperties().timeModified();
    }

    /**
     * Get the provisioningState property: Current state of this QueryPack: whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values will
     * include Succeeded, Deploying, Canceled, and Failed.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model LogAnalyticsQueryPackInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogAnalyticsQueryPackInner.class);
}
