// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies the metric alert rule criteria for a web test resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria")
@Fluent
public final class WebtestLocationAvailabilityCriteria extends MetricAlertCriteria {
    /*
     * The Application Insights web test Id.
     */
    @JsonProperty(value = "webTestId", required = true)
    private String webTestId;

    /*
     * The Application Insights resource Id.
     */
    @JsonProperty(value = "componentId", required = true)
    private String componentId;

    /*
     * The number of failed locations.
     */
    @JsonProperty(value = "failedLocationCount", required = true)
    private float failedLocationCount;

    /**
     * Creates an instance of WebtestLocationAvailabilityCriteria class.
     */
    public WebtestLocationAvailabilityCriteria() {
    }

    /**
     * Get the webTestId property: The Application Insights web test Id.
     * 
     * @return the webTestId value.
     */
    public String webTestId() {
        return this.webTestId;
    }

    /**
     * Set the webTestId property: The Application Insights web test Id.
     * 
     * @param webTestId the webTestId value to set.
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withWebTestId(String webTestId) {
        this.webTestId = webTestId;
        return this;
    }

    /**
     * Get the componentId property: The Application Insights resource Id.
     * 
     * @return the componentId value.
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the componentId property: The Application Insights resource Id.
     * 
     * @param componentId the componentId value to set.
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get the failedLocationCount property: The number of failed locations.
     * 
     * @return the failedLocationCount value.
     */
    public float failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * Set the failedLocationCount property: The number of failed locations.
     * 
     * @param failedLocationCount the failedLocationCount value to set.
     * @return the WebtestLocationAvailabilityCriteria object itself.
     */
    public WebtestLocationAvailabilityCriteria withFailedLocationCount(float failedLocationCount) {
        this.failedLocationCount = failedLocationCount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (webTestId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property webTestId in model WebtestLocationAvailabilityCriteria"));
        }
        if (componentId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property componentId in model WebtestLocationAvailabilityCriteria"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebtestLocationAvailabilityCriteria.class);
}
