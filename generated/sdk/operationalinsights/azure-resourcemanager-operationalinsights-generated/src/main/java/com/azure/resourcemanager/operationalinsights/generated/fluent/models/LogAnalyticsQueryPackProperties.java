// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties that define a Log Analytics QueryPack resource.
 */
@Immutable
public final class LogAnalyticsQueryPackProperties {
    /*
     * The unique ID of your application. This field cannot be changed.
     */
    @JsonProperty(value = "queryPackId", access = JsonProperty.Access.WRITE_ONLY)
    private String queryPackId;

    /*
     * Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     */
    @JsonProperty(value = "timeModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeModified;

    /*
     * Current state of this QueryPack: whether or not is has been provisioned within the resource group it is defined.
     * Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled,
     * and Failed.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Creates an instance of LogAnalyticsQueryPackProperties class.
     */
    public LogAnalyticsQueryPackProperties() {
    }

    /**
     * Get the queryPackId property: The unique ID of your application. This field cannot be changed.
     * 
     * @return the queryPackId value.
     */
    public String queryPackId() {
        return this.queryPackId;
    }

    /**
     * Get the timeCreated property: Creation Date for the Log Analytics QueryPack, in ISO 8601 format.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the timeModified property: Last modified date of the Log Analytics QueryPack, in ISO 8601 format.
     * 
     * @return the timeModified value.
     */
    public OffsetDateTime timeModified() {
        return this.timeModified;
    }

    /**
     * Get the provisioningState property: Current state of this QueryPack: whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value but are able to read from it. Values
     * will include Succeeded, Deploying, Canceled, and Failed.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
