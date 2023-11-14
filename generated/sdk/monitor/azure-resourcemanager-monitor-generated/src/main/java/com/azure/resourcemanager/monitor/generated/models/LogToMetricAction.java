// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Specify action need to be taken when rule type is converting log to metric.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.LogToMetricAction")
@Fluent
public final class LogToMetricAction extends Action {
    /*
     * Criteria of Metric
     */
    @JsonProperty(value = "criteria", required = true)
    private List<Criteria> criteria;

    /**
     * Creates an instance of LogToMetricAction class.
     */
    public LogToMetricAction() {
    }

    /**
     * Get the criteria property: Criteria of Metric.
     * 
     * @return the criteria value.
     */
    public List<Criteria> criteria() {
        return this.criteria;
    }

    /**
     * Set the criteria property: Criteria of Metric.
     * 
     * @param criteria the criteria value to set.
     * @return the LogToMetricAction object itself.
     */
    public LogToMetricAction withCriteria(List<Criteria> criteria) {
        this.criteria = criteria;
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
        if (criteria() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property criteria in model LogToMetricAction"));
        } else {
            criteria().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogToMetricAction.class);
}
