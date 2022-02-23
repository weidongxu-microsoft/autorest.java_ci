// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;

/** The notification associated with a budget. */
@Fluent
public final class Notification {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Notification.class);

    /*
     * The notification is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The comparison operator.
     */
    @JsonProperty(value = "operator", required = true)
    private OperatorType operator;

    /*
     * Threshold value associated with a notification. Notification is sent
     * when the cost exceeded the threshold. It is always percent and has to be
     * between 0 and 1000.
     */
    @JsonProperty(value = "threshold", required = true)
    private BigDecimal threshold;

    /*
     * Email addresses to send the budget notification to when the threshold is
     * exceeded. Must have at least one contact email or contact group
     * specified at the Subscription or Resource Group scopes. All other scopes
     * must have at least one contact email specified.
     */
    @JsonProperty(value = "contactEmails", required = true)
    private List<String> contactEmails;

    /*
     * Contact roles to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactRoles")
    private List<String> contactRoles;

    /*
     * Action groups to send the budget notification to when the threshold is
     * exceeded. Must be provided as a fully qualified Azure resource id. Only
     * supported at Subscription or Resource Group scopes.
     */
    @JsonProperty(value = "contactGroups")
    private List<String> contactGroups;

    /*
     * The type of threshold
     */
    @JsonProperty(value = "thresholdType")
    private ThresholdType thresholdType;

    /*
     * Language in which the recipient will receive the notification
     */
    @JsonProperty(value = "locale")
    private CultureCode locale;

    /**
     * Get the enabled property: The notification is enabled or not.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The notification is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the Notification object itself.
     */
    public Notification withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the operator property: The comparison operator.
     *
     * @return the operator value.
     */
    public OperatorType operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The comparison operator.
     *
     * @param operator the operator value to set.
     * @return the Notification object itself.
     */
    public Notification withOperator(OperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: Threshold value associated with a notification. Notification is sent when the cost
     * exceeded the threshold. It is always percent and has to be between 0 and 1000.
     *
     * @return the threshold value.
     */
    public BigDecimal threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: Threshold value associated with a notification. Notification is sent when the cost
     * exceeded the threshold. It is always percent and has to be between 0 and 1000.
     *
     * @param threshold the threshold value to set.
     * @return the Notification object itself.
     */
    public Notification withThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the contactEmails property: Email addresses to send the budget notification to when the threshold is
     * exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group
     * scopes. All other scopes must have at least one contact email specified.
     *
     * @return the contactEmails value.
     */
    public List<String> contactEmails() {
        return this.contactEmails;
    }

    /**
     * Set the contactEmails property: Email addresses to send the budget notification to when the threshold is
     * exceeded. Must have at least one contact email or contact group specified at the Subscription or Resource Group
     * scopes. All other scopes must have at least one contact email specified.
     *
     * @param contactEmails the contactEmails value to set.
     * @return the Notification object itself.
     */
    public Notification withContactEmails(List<String> contactEmails) {
        this.contactEmails = contactEmails;
        return this;
    }

    /**
     * Get the contactRoles property: Contact roles to send the budget notification to when the threshold is exceeded.
     *
     * @return the contactRoles value.
     */
    public List<String> contactRoles() {
        return this.contactRoles;
    }

    /**
     * Set the contactRoles property: Contact roles to send the budget notification to when the threshold is exceeded.
     *
     * @param contactRoles the contactRoles value to set.
     * @return the Notification object itself.
     */
    public Notification withContactRoles(List<String> contactRoles) {
        this.contactRoles = contactRoles;
        return this;
    }

    /**
     * Get the contactGroups property: Action groups to send the budget notification to when the threshold is exceeded.
     * Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     *
     * @return the contactGroups value.
     */
    public List<String> contactGroups() {
        return this.contactGroups;
    }

    /**
     * Set the contactGroups property: Action groups to send the budget notification to when the threshold is exceeded.
     * Must be provided as a fully qualified Azure resource id. Only supported at Subscription or Resource Group scopes.
     *
     * @param contactGroups the contactGroups value to set.
     * @return the Notification object itself.
     */
    public Notification withContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }

    /**
     * Get the thresholdType property: The type of threshold.
     *
     * @return the thresholdType value.
     */
    public ThresholdType thresholdType() {
        return this.thresholdType;
    }

    /**
     * Set the thresholdType property: The type of threshold.
     *
     * @param thresholdType the thresholdType value to set.
     * @return the Notification object itself.
     */
    public Notification withThresholdType(ThresholdType thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    /**
     * Get the locale property: Language in which the recipient will receive the notification.
     *
     * @return the locale value.
     */
    public CultureCode locale() {
        return this.locale;
    }

    /**
     * Set the locale property: Language in which the recipient will receive the notification.
     *
     * @param locale the locale value to set.
     * @return the Notification object itself.
     */
    public Notification withLocale(CultureCode locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model Notification"));
        }
        if (threshold() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property threshold in model Notification"));
        }
        if (contactEmails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property contactEmails in model Notification"));
        }
    }
}
