// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
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
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * An action group resource.
 */
@Fluent
public final class ActionGroupResourceInner extends Resource {
    /*
     * The action groups properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ActionGroup innerProperties;

    /**
     * Creates an instance of ActionGroupResourceInner class.
     */
    public ActionGroupResourceInner() {
    }

    /**
     * Get the innerProperties property: The action groups properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private ActionGroup innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionGroupResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionGroupResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the groupShortName property: The short name of the action group. This will be used in SMS messages.
     * 
     * @return the groupShortName value.
     */
    public String groupShortName() {
        return this.innerProperties() == null ? null : this.innerProperties().groupShortName();
    }

    /**
     * Set the groupShortName property: The short name of the action group. This will be used in SMS messages.
     * 
     * @param groupShortName the groupShortName value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withGroupShortName(String groupShortName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withGroupShortName(groupShortName);
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its receivers will receive communications.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Indicates whether this action group is enabled. If an action group is not enabled, then
     * none of its receivers will receive communications.
     * 
     * @param enabled the enabled value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the emailReceivers property: The list of email receivers that are part of this action group.
     * 
     * @return the emailReceivers value.
     */
    public List<EmailReceiver> emailReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().emailReceivers();
    }

    /**
     * Set the emailReceivers property: The list of email receivers that are part of this action group.
     * 
     * @param emailReceivers the emailReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withEmailReceivers(List<EmailReceiver> emailReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withEmailReceivers(emailReceivers);
        return this;
    }

    /**
     * Get the smsReceivers property: The list of SMS receivers that are part of this action group.
     * 
     * @return the smsReceivers value.
     */
    public List<SmsReceiver> smsReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().smsReceivers();
    }

    /**
     * Set the smsReceivers property: The list of SMS receivers that are part of this action group.
     * 
     * @param smsReceivers the smsReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withSmsReceivers(List<SmsReceiver> smsReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withSmsReceivers(smsReceivers);
        return this;
    }

    /**
     * Get the webhookReceivers property: The list of webhook receivers that are part of this action group.
     * 
     * @return the webhookReceivers value.
     */
    public List<WebhookReceiver> webhookReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().webhookReceivers();
    }

    /**
     * Set the webhookReceivers property: The list of webhook receivers that are part of this action group.
     * 
     * @param webhookReceivers the webhookReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withWebhookReceivers(List<WebhookReceiver> webhookReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withWebhookReceivers(webhookReceivers);
        return this;
    }

    /**
     * Get the itsmReceivers property: The list of ITSM receivers that are part of this action group.
     * 
     * @return the itsmReceivers value.
     */
    public List<ItsmReceiver> itsmReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().itsmReceivers();
    }

    /**
     * Set the itsmReceivers property: The list of ITSM receivers that are part of this action group.
     * 
     * @param itsmReceivers the itsmReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withItsmReceivers(List<ItsmReceiver> itsmReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withItsmReceivers(itsmReceivers);
        return this;
    }

    /**
     * Get the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this action group.
     * 
     * @return the azureAppPushReceivers value.
     */
    public List<AzureAppPushReceiver> azureAppPushReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().azureAppPushReceivers();
    }

    /**
     * Set the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this action group.
     * 
     * @param azureAppPushReceivers the azureAppPushReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withAzureAppPushReceivers(List<AzureAppPushReceiver> azureAppPushReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withAzureAppPushReceivers(azureAppPushReceivers);
        return this;
    }

    /**
     * Get the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part of this action
     * group.
     * 
     * @return the automationRunbookReceivers value.
     */
    public List<AutomationRunbookReceiver> automationRunbookReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().automationRunbookReceivers();
    }

    /**
     * Set the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part of this action
     * group.
     * 
     * @param automationRunbookReceivers the automationRunbookReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner
        withAutomationRunbookReceivers(List<AutomationRunbookReceiver> automationRunbookReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withAutomationRunbookReceivers(automationRunbookReceivers);
        return this;
    }

    /**
     * Get the voiceReceivers property: The list of voice receivers that are part of this action group.
     * 
     * @return the voiceReceivers value.
     */
    public List<VoiceReceiver> voiceReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().voiceReceivers();
    }

    /**
     * Set the voiceReceivers property: The list of voice receivers that are part of this action group.
     * 
     * @param voiceReceivers the voiceReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withVoiceReceivers(List<VoiceReceiver> voiceReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withVoiceReceivers(voiceReceivers);
        return this;
    }

    /**
     * Get the logicAppReceivers property: The list of logic app receivers that are part of this action group.
     * 
     * @return the logicAppReceivers value.
     */
    public List<LogicAppReceiver> logicAppReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().logicAppReceivers();
    }

    /**
     * Set the logicAppReceivers property: The list of logic app receivers that are part of this action group.
     * 
     * @param logicAppReceivers the logicAppReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withLogicAppReceivers(List<LogicAppReceiver> logicAppReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withLogicAppReceivers(logicAppReceivers);
        return this;
    }

    /**
     * Get the azureFunctionReceivers property: The list of azure function receivers that are part of this action group.
     * 
     * @return the azureFunctionReceivers value.
     */
    public List<AzureFunctionReceiver> azureFunctionReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFunctionReceivers();
    }

    /**
     * Set the azureFunctionReceivers property: The list of azure function receivers that are part of this action group.
     * 
     * @param azureFunctionReceivers the azureFunctionReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withAzureFunctionReceivers(List<AzureFunctionReceiver> azureFunctionReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withAzureFunctionReceivers(azureFunctionReceivers);
        return this;
    }

    /**
     * Get the armRoleReceivers property: The list of ARM role receivers that are part of this action group. Roles are
     * Azure RBAC roles and only built-in roles are supported.
     * 
     * @return the armRoleReceivers value.
     */
    public List<ArmRoleReceiver> armRoleReceivers() {
        return this.innerProperties() == null ? null : this.innerProperties().armRoleReceivers();
    }

    /**
     * Set the armRoleReceivers property: The list of ARM role receivers that are part of this action group. Roles are
     * Azure RBAC roles and only built-in roles are supported.
     * 
     * @param armRoleReceivers the armRoleReceivers value to set.
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withArmRoleReceivers(List<ArmRoleReceiver> armRoleReceivers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActionGroup();
        }
        this.innerProperties().withArmRoleReceivers(armRoleReceivers);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
