// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.generated.models.ServerSecurityAlertPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of a security alert policy.
 */
@Fluent
public final class SecurityAlertPolicyProperties {
    /*
     * Specifies the state of the policy, whether it is enabled or disabled.
     */
    @JsonProperty(value = "state", required = true)
    private ServerSecurityAlertPolicyState state;

    /*
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
     */
    @JsonProperty(value = "disabledAlerts")
    private List<String> disabledAlerts;

    /*
     * Specifies an array of e-mail addresses to which the alert is sent.
     */
    @JsonProperty(value = "emailAddresses")
    private List<String> emailAddresses;

    /*
     * Specifies that the alert is sent to the account administrators.
     */
    @JsonProperty(value = "emailAccountAdmins")
    private Boolean emailAccountAdmins;

    /*
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     */
    @JsonProperty(value = "storageEndpoint")
    private String storageEndpoint;

    /*
     * Specifies the identifier key of the Threat Detection audit storage account.
     */
    @JsonProperty(value = "storageAccountAccessKey")
    private String storageAccountAccessKey;

    /*
     * Specifies the number of days to keep in the Threat Detection audit logs.
     */
    @JsonProperty(value = "retentionDays")
    private Integer retentionDays;

    /**
     * Creates an instance of SecurityAlertPolicyProperties class.
     */
    public SecurityAlertPolicyProperties() {
    }

    /**
     * Get the state property: Specifies the state of the policy, whether it is enabled or disabled.
     * 
     * @return the state value.
     */
    public ServerSecurityAlertPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the policy, whether it is enabled or disabled.
     * 
     * @param state the state value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withState(ServerSecurityAlertPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly.
     * 
     * @return the disabledAlerts value.
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts;
    }

    /**
     * Set the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly.
     * 
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withDisabledAlerts(List<String> disabledAlerts) {
        this.disabledAlerts = disabledAlerts;
        return this;
    }

    /**
     * Get the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     * 
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     * 
     * @param emailAddresses the emailAddresses value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Get the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     * 
     * @return the emailAccountAdmins value.
     */
    public Boolean emailAccountAdmins() {
        return this.emailAccountAdmins;
    }

    /**
     * Set the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     * 
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.emailAccountAdmins = emailAccountAdmins;
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     * 
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     * 
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the SecurityAlertPolicyProperties object itself.
     */
    public SecurityAlertPolicyProperties withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property state in model SecurityAlertPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecurityAlertPolicyProperties.class);
}
