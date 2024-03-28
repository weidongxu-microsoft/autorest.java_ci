// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.Action;
import com.azure.resourcemanager.monitor.generated.models.Enabled;
import com.azure.resourcemanager.monitor.generated.models.ProvisioningState;
import com.azure.resourcemanager.monitor.generated.models.Schedule;
import com.azure.resourcemanager.monitor.generated.models.Source;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Log Search Rule Definition.
 */
@Fluent
public final class LogSearchRule {
    /*
     * The api-version used when creating this alert rule
     */
    @JsonProperty(value = "createdWithApiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String createdWithApiVersion;

    /*
     * True if alert rule is legacy Log Analytic rule
     */
    @JsonProperty(value = "isLegacyLogAnalyticsRule", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isLegacyLogAnalyticsRule;

    /*
     * The description of the Log Search rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The display name of the alert rule
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     */
    @JsonProperty(value = "autoMitigate")
    private Boolean autoMitigate;

    /*
     * The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     */
    @JsonProperty(value = "enabled")
    private Enabled enabled;

    /*
     * Last time the rule was updated in IS08601 format.
     */
    @JsonProperty(value = "lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /*
     * Provisioning state of the scheduled query rule
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Data Source against which rule will Query Data
     */
    @JsonProperty(value = "source", required = true)
    private Source source;

    /*
     * Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     */
    @JsonProperty(value = "schedule")
    private Schedule schedule;

    /*
     * Action needs to be taken on rule execution.
     */
    @JsonProperty(value = "action", required = true)
    private Action action;

    /**
     * Creates an instance of LogSearchRule class.
     */
    public LogSearchRule() {
    }

    /**
     * Get the createdWithApiVersion property: The api-version used when creating this alert rule.
     * 
     * @return the createdWithApiVersion value.
     */
    public String createdWithApiVersion() {
        return this.createdWithApiVersion;
    }

    /**
     * Get the isLegacyLogAnalyticsRule property: True if alert rule is legacy Log Analytic rule.
     * 
     * @return the isLegacyLogAnalyticsRule value.
     */
    public Boolean isLegacyLogAnalyticsRule() {
        return this.isLegacyLogAnalyticsRule;
    }

    /**
     * Get the description property: The description of the Log Search rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Log Search rule.
     * 
     * @param description the description value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name of the alert rule.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the alert rule.
     * 
     * @param displayName the displayName value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is false.
     * 
     * @return the autoMitigate value.
     */
    public Boolean autoMitigate() {
        return this.autoMitigate;
    }

    /**
     * Set the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is false.
     * 
     * @param autoMitigate the autoMitigate value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withAutoMitigate(Boolean autoMitigate) {
        this.autoMitigate = autoMitigate;
        return this;
    }

    /**
     * Get the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     * 
     * @return the enabled value.
     */
    public Enabled enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The flag which indicates whether the Log Search rule is enabled. Value should be true
     * or false.
     * 
     * @param enabled the enabled value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withEnabled(Enabled enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: Last time the rule was updated in IS08601 format.
     * 
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get the provisioningState property: Provisioning state of the scheduled query rule.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the source property: Data Source against which rule will Query Data.
     * 
     * @return the source value.
     */
    public Source source() {
        return this.source;
    }

    /**
     * Set the source property: Data Source against which rule will Query Data.
     * 
     * @param source the source value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Get the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     * 
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction.
     * 
     * @param schedule the schedule value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the action property: Action needs to be taken on rule execution.
     * 
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: Action needs to be taken on rule execution.
     * 
     * @param action the action value to set.
     * @return the LogSearchRule object itself.
     */
    public LogSearchRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property source in model LogSearchRule"));
        } else {
            source().validate();
        }
        if (schedule() != null) {
            schedule().validate();
        }
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property action in model LogSearchRule"));
        } else {
            action().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogSearchRule.class);
}
