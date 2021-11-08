// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.ArmRoleReceiver;
import com.azure.resourcemanager.monitor.generated.models.AutomationRunbookReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureFunctionReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.ItsmReceiver;
import com.azure.resourcemanager.monitor.generated.models.LogicAppReceiver;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Azure action group. */
@Fluent
public final class ActionGroup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionGroup.class);

    /*
     * The short name of the action group. This will be used in SMS messages.
     */
    @JsonProperty(value = "groupShortName", required = true)
    private String groupShortName;

    /*
     * Indicates whether this action group is enabled. If an action group is
     * not enabled, then none of its receivers will receive communications.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The list of email receivers that are part of this action group.
     */
    @JsonProperty(value = "emailReceivers")
    private List<EmailReceiver> emailReceivers;

    /*
     * The list of SMS receivers that are part of this action group.
     */
    @JsonProperty(value = "smsReceivers")
    private List<SmsReceiver> smsReceivers;

    /*
     * The list of webhook receivers that are part of this action group.
     */
    @JsonProperty(value = "webhookReceivers")
    private List<WebhookReceiver> webhookReceivers;

    /*
     * The list of ITSM receivers that are part of this action group.
     */
    @JsonProperty(value = "itsmReceivers")
    private List<ItsmReceiver> itsmReceivers;

    /*
     * The list of AzureAppPush receivers that are part of this action group.
     */
    @JsonProperty(value = "azureAppPushReceivers")
    private List<AzureAppPushReceiver> azureAppPushReceivers;

    /*
     * The list of AutomationRunbook receivers that are part of this action
     * group.
     */
    @JsonProperty(value = "automationRunbookReceivers")
    private List<AutomationRunbookReceiver> automationRunbookReceivers;

    /*
     * The list of voice receivers that are part of this action group.
     */
    @JsonProperty(value = "voiceReceivers")
    private List<VoiceReceiver> voiceReceivers;

    /*
     * The list of logic app receivers that are part of this action group.
     */
    @JsonProperty(value = "logicAppReceivers")
    private List<LogicAppReceiver> logicAppReceivers;

    /*
     * The list of azure function receivers that are part of this action group.
     */
    @JsonProperty(value = "azureFunctionReceivers")
    private List<AzureFunctionReceiver> azureFunctionReceivers;

    /*
     * The list of ARM role receivers that are part of this action group. Roles
     * are Azure RBAC roles and only built-in roles are supported.
     */
    @JsonProperty(value = "armRoleReceivers")
    private List<ArmRoleReceiver> armRoleReceivers;

    /**
     * Get the groupShortName property: The short name of the action group. This will be used in SMS messages.
     *
     * @return the groupShortName value.
     */
    public String groupShortName() {
        return this.groupShortName;
    }

    /**
     * Set the groupShortName property: The short name of the action group. This will be used in SMS messages.
     *
     * @param groupShortName the groupShortName value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withGroupShortName(String groupShortName) {
        this.groupShortName = groupShortName;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its receivers will receive communications.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its receivers will receive communications.
     *
     * @param enabled the enabled value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the emailReceivers property: The list of email receivers that are part of this action group.
     *
     * @return the emailReceivers value.
     */
    public List<EmailReceiver> emailReceivers() {
        return this.emailReceivers;
    }

    /**
     * Set the emailReceivers property: The list of email receivers that are part of this action group.
     *
     * @param emailReceivers the emailReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withEmailReceivers(List<EmailReceiver> emailReceivers) {
        this.emailReceivers = emailReceivers;
        return this;
    }

    /**
     * Get the smsReceivers property: The list of SMS receivers that are part of this action group.
     *
     * @return the smsReceivers value.
     */
    public List<SmsReceiver> smsReceivers() {
        return this.smsReceivers;
    }

    /**
     * Set the smsReceivers property: The list of SMS receivers that are part of this action group.
     *
     * @param smsReceivers the smsReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withSmsReceivers(List<SmsReceiver> smsReceivers) {
        this.smsReceivers = smsReceivers;
        return this;
    }

    /**
     * Get the webhookReceivers property: The list of webhook receivers that are part of this action group.
     *
     * @return the webhookReceivers value.
     */
    public List<WebhookReceiver> webhookReceivers() {
        return this.webhookReceivers;
    }

    /**
     * Set the webhookReceivers property: The list of webhook receivers that are part of this action group.
     *
     * @param webhookReceivers the webhookReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withWebhookReceivers(List<WebhookReceiver> webhookReceivers) {
        this.webhookReceivers = webhookReceivers;
        return this;
    }

    /**
     * Get the itsmReceivers property: The list of ITSM receivers that are part of this action group.
     *
     * @return the itsmReceivers value.
     */
    public List<ItsmReceiver> itsmReceivers() {
        return this.itsmReceivers;
    }

    /**
     * Set the itsmReceivers property: The list of ITSM receivers that are part of this action group.
     *
     * @param itsmReceivers the itsmReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withItsmReceivers(List<ItsmReceiver> itsmReceivers) {
        this.itsmReceivers = itsmReceivers;
        return this;
    }

    /**
     * Get the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this action group.
     *
     * @return the azureAppPushReceivers value.
     */
    public List<AzureAppPushReceiver> azureAppPushReceivers() {
        return this.azureAppPushReceivers;
    }

    /**
     * Set the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this action group.
     *
     * @param azureAppPushReceivers the azureAppPushReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withAzureAppPushReceivers(List<AzureAppPushReceiver> azureAppPushReceivers) {
        this.azureAppPushReceivers = azureAppPushReceivers;
        return this;
    }

    /**
     * Get the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part of this action
     * group.
     *
     * @return the automationRunbookReceivers value.
     */
    public List<AutomationRunbookReceiver> automationRunbookReceivers() {
        return this.automationRunbookReceivers;
    }

    /**
     * Set the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part of this action
     * group.
     *
     * @param automationRunbookReceivers the automationRunbookReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withAutomationRunbookReceivers(List<AutomationRunbookReceiver> automationRunbookReceivers) {
        this.automationRunbookReceivers = automationRunbookReceivers;
        return this;
    }

    /**
     * Get the voiceReceivers property: The list of voice receivers that are part of this action group.
     *
     * @return the voiceReceivers value.
     */
    public List<VoiceReceiver> voiceReceivers() {
        return this.voiceReceivers;
    }

    /**
     * Set the voiceReceivers property: The list of voice receivers that are part of this action group.
     *
     * @param voiceReceivers the voiceReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withVoiceReceivers(List<VoiceReceiver> voiceReceivers) {
        this.voiceReceivers = voiceReceivers;
        return this;
    }

    /**
     * Get the logicAppReceivers property: The list of logic app receivers that are part of this action group.
     *
     * @return the logicAppReceivers value.
     */
    public List<LogicAppReceiver> logicAppReceivers() {
        return this.logicAppReceivers;
    }

    /**
     * Set the logicAppReceivers property: The list of logic app receivers that are part of this action group.
     *
     * @param logicAppReceivers the logicAppReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withLogicAppReceivers(List<LogicAppReceiver> logicAppReceivers) {
        this.logicAppReceivers = logicAppReceivers;
        return this;
    }

    /**
     * Get the azureFunctionReceivers property: The list of azure function receivers that are part of this action group.
     *
     * @return the azureFunctionReceivers value.
     */
    public List<AzureFunctionReceiver> azureFunctionReceivers() {
        return this.azureFunctionReceivers;
    }

    /**
     * Set the azureFunctionReceivers property: The list of azure function receivers that are part of this action group.
     *
     * @param azureFunctionReceivers the azureFunctionReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withAzureFunctionReceivers(List<AzureFunctionReceiver> azureFunctionReceivers) {
        this.azureFunctionReceivers = azureFunctionReceivers;
        return this;
    }

    /**
     * Get the armRoleReceivers property: The list of ARM role receivers that are part of this action group. Roles are
     * Azure RBAC roles and only built-in roles are supported.
     *
     * @return the armRoleReceivers value.
     */
    public List<ArmRoleReceiver> armRoleReceivers() {
        return this.armRoleReceivers;
    }

    /**
     * Set the armRoleReceivers property: The list of ARM role receivers that are part of this action group. Roles are
     * Azure RBAC roles and only built-in roles are supported.
     *
     * @param armRoleReceivers the armRoleReceivers value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withArmRoleReceivers(List<ArmRoleReceiver> armRoleReceivers) {
        this.armRoleReceivers = armRoleReceivers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupShortName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property groupShortName in model ActionGroup"));
        }
        if (emailReceivers() != null) {
            emailReceivers().forEach(e -> e.validate());
        }
        if (smsReceivers() != null) {
            smsReceivers().forEach(e -> e.validate());
        }
        if (webhookReceivers() != null) {
            webhookReceivers().forEach(e -> e.validate());
        }
        if (itsmReceivers() != null) {
            itsmReceivers().forEach(e -> e.validate());
        }
        if (azureAppPushReceivers() != null) {
            azureAppPushReceivers().forEach(e -> e.validate());
        }
        if (automationRunbookReceivers() != null) {
            automationRunbookReceivers().forEach(e -> e.validate());
        }
        if (voiceReceivers() != null) {
            voiceReceivers().forEach(e -> e.validate());
        }
        if (logicAppReceivers() != null) {
            logicAppReceivers().forEach(e -> e.validate());
        }
        if (azureFunctionReceivers() != null) {
            azureFunctionReceivers().forEach(e -> e.validate());
        }
        if (armRoleReceivers() != null) {
            armRoleReceivers().forEach(e -> e.validate());
        }
    }
}
