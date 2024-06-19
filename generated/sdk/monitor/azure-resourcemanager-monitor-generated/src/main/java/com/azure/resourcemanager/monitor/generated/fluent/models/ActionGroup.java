// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
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
import java.io.IOException;
import java.util.List;

/**
 * An Azure action group.
 */
@Fluent
public final class ActionGroup implements JsonSerializable<ActionGroup> {
    /*
     * The short name of the action group. This will be used in SMS messages.
     */
    private String groupShortName;

    /*
     * Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers
     * will receive communications.
     */
    private boolean enabled;

    /*
     * The list of email receivers that are part of this action group.
     */
    private List<EmailReceiver> emailReceivers;

    /*
     * The list of SMS receivers that are part of this action group.
     */
    private List<SmsReceiver> smsReceivers;

    /*
     * The list of webhook receivers that are part of this action group.
     */
    private List<WebhookReceiver> webhookReceivers;

    /*
     * The list of ITSM receivers that are part of this action group.
     */
    private List<ItsmReceiver> itsmReceivers;

    /*
     * The list of AzureAppPush receivers that are part of this action group.
     */
    private List<AzureAppPushReceiver> azureAppPushReceivers;

    /*
     * The list of AutomationRunbook receivers that are part of this action group.
     */
    private List<AutomationRunbookReceiver> automationRunbookReceivers;

    /*
     * The list of voice receivers that are part of this action group.
     */
    private List<VoiceReceiver> voiceReceivers;

    /*
     * The list of logic app receivers that are part of this action group.
     */
    private List<LogicAppReceiver> logicAppReceivers;

    /*
     * The list of azure function receivers that are part of this action group.
     */
    private List<AzureFunctionReceiver> azureFunctionReceivers;

    /*
     * The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in
     * roles are supported.
     */
    private List<ArmRoleReceiver> armRoleReceivers;

    /**
     * Creates an instance of ActionGroup class.
     */
    public ActionGroup() {
    }

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
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property groupShortName in model ActionGroup"));
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

    private static final ClientLogger LOGGER = new ClientLogger(ActionGroup.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("groupShortName", this.groupShortName);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeArrayField("emailReceivers", this.emailReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("smsReceivers", this.smsReceivers, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("webhookReceivers", this.webhookReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("itsmReceivers", this.itsmReceivers, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("azureAppPushReceivers", this.azureAppPushReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("automationRunbookReceivers", this.automationRunbookReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("voiceReceivers", this.voiceReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("logicAppReceivers", this.logicAppReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("azureFunctionReceivers", this.azureFunctionReceivers,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("armRoleReceivers", this.armRoleReceivers,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActionGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActionGroup if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ActionGroup.
     */
    public static ActionGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActionGroup deserializedActionGroup = new ActionGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("groupShortName".equals(fieldName)) {
                    deserializedActionGroup.groupShortName = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedActionGroup.enabled = reader.getBoolean();
                } else if ("emailReceivers".equals(fieldName)) {
                    List<EmailReceiver> emailReceivers = reader.readArray(reader1 -> EmailReceiver.fromJson(reader1));
                    deserializedActionGroup.emailReceivers = emailReceivers;
                } else if ("smsReceivers".equals(fieldName)) {
                    List<SmsReceiver> smsReceivers = reader.readArray(reader1 -> SmsReceiver.fromJson(reader1));
                    deserializedActionGroup.smsReceivers = smsReceivers;
                } else if ("webhookReceivers".equals(fieldName)) {
                    List<WebhookReceiver> webhookReceivers
                        = reader.readArray(reader1 -> WebhookReceiver.fromJson(reader1));
                    deserializedActionGroup.webhookReceivers = webhookReceivers;
                } else if ("itsmReceivers".equals(fieldName)) {
                    List<ItsmReceiver> itsmReceivers = reader.readArray(reader1 -> ItsmReceiver.fromJson(reader1));
                    deserializedActionGroup.itsmReceivers = itsmReceivers;
                } else if ("azureAppPushReceivers".equals(fieldName)) {
                    List<AzureAppPushReceiver> azureAppPushReceivers
                        = reader.readArray(reader1 -> AzureAppPushReceiver.fromJson(reader1));
                    deserializedActionGroup.azureAppPushReceivers = azureAppPushReceivers;
                } else if ("automationRunbookReceivers".equals(fieldName)) {
                    List<AutomationRunbookReceiver> automationRunbookReceivers
                        = reader.readArray(reader1 -> AutomationRunbookReceiver.fromJson(reader1));
                    deserializedActionGroup.automationRunbookReceivers = automationRunbookReceivers;
                } else if ("voiceReceivers".equals(fieldName)) {
                    List<VoiceReceiver> voiceReceivers = reader.readArray(reader1 -> VoiceReceiver.fromJson(reader1));
                    deserializedActionGroup.voiceReceivers = voiceReceivers;
                } else if ("logicAppReceivers".equals(fieldName)) {
                    List<LogicAppReceiver> logicAppReceivers
                        = reader.readArray(reader1 -> LogicAppReceiver.fromJson(reader1));
                    deserializedActionGroup.logicAppReceivers = logicAppReceivers;
                } else if ("azureFunctionReceivers".equals(fieldName)) {
                    List<AzureFunctionReceiver> azureFunctionReceivers
                        = reader.readArray(reader1 -> AzureFunctionReceiver.fromJson(reader1));
                    deserializedActionGroup.azureFunctionReceivers = azureFunctionReceivers;
                } else if ("armRoleReceivers".equals(fieldName)) {
                    List<ArmRoleReceiver> armRoleReceivers
                        = reader.readArray(reader1 -> ArmRoleReceiver.fromJson(reader1));
                    deserializedActionGroup.armRoleReceivers = armRoleReceivers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActionGroup;
        });
    }
}
