// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.applicationinsights.generated.models.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties that define a ProactiveDetection configuration. */
@Fluent
public final class ApplicationInsightsComponentProactiveDetectionConfigurationInner {
    /*
     * The rule name
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * A flag that indicates whether this rule is enabled by the user
     */
    @JsonProperty(value = "Enabled")
    private Boolean enabled;

    /*
     * A flag that indicated whether notifications on this rule should be sent to subscription owners
     */
    @JsonProperty(value = "SendEmailsToSubscriptionOwners")
    private Boolean sendEmailsToSubscriptionOwners;

    /*
     * Custom email addresses for this rule notifications
     */
    @JsonProperty(value = "CustomEmails")
    private List<String> customEmails;

    /*
     * The last time this rule was updated
     */
    @JsonProperty(value = "LastUpdatedTime")
    private String lastUpdatedTime;

    /*
     * Static definitions of the ProactiveDetection configuration rule (same values for all components).
     */
    @JsonProperty(value = "RuleDefinitions")
    private ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions ruleDefinitions;

    /** Creates an instance of ApplicationInsightsComponentProactiveDetectionConfigurationInner class. */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner() {
    }

    /**
     * Get the name property: The rule name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The rule name.
     *
     * @param name the name value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the enabled property: A flag that indicates whether this rule is enabled by the user.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: A flag that indicates whether this rule is enabled by the user.
     *
     * @param enabled the enabled value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the sendEmailsToSubscriptionOwners property: A flag that indicated whether notifications on this rule should
     * be sent to subscription owners.
     *
     * @return the sendEmailsToSubscriptionOwners value.
     */
    public Boolean sendEmailsToSubscriptionOwners() {
        return this.sendEmailsToSubscriptionOwners;
    }

    /**
     * Set the sendEmailsToSubscriptionOwners property: A flag that indicated whether notifications on this rule should
     * be sent to subscription owners.
     *
     * @param sendEmailsToSubscriptionOwners the sendEmailsToSubscriptionOwners value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withSendEmailsToSubscriptionOwners(
        Boolean sendEmailsToSubscriptionOwners) {
        this.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
        return this;
    }

    /**
     * Get the customEmails property: Custom email addresses for this rule notifications.
     *
     * @return the customEmails value.
     */
    public List<String> customEmails() {
        return this.customEmails;
    }

    /**
     * Set the customEmails property: Custom email addresses for this rule notifications.
     *
     * @param customEmails the customEmails value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withCustomEmails(
        List<String> customEmails) {
        this.customEmails = customEmails;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: The last time this rule was updated.
     *
     * @return the lastUpdatedTime value.
     */
    public String lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: The last time this rule was updated.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withLastUpdatedTime(
        String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the ruleDefinitions property: Static definitions of the ProactiveDetection configuration rule (same values
     * for all components).
     *
     * @return the ruleDefinitions value.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions ruleDefinitions() {
        return this.ruleDefinitions;
    }

    /**
     * Set the ruleDefinitions property: Static definitions of the ProactiveDetection configuration rule (same values
     * for all components).
     *
     * @param ruleDefinitions the ruleDefinitions value to set.
     * @return the ApplicationInsightsComponentProactiveDetectionConfigurationInner object itself.
     */
    public ApplicationInsightsComponentProactiveDetectionConfigurationInner withRuleDefinitions(
        ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions ruleDefinitions) {
        this.ruleDefinitions = ruleDefinitions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleDefinitions() != null) {
            ruleDefinitions().validate();
        }
    }
}
