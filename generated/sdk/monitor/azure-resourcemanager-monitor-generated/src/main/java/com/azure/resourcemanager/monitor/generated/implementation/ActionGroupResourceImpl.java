// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupPatchBody;
import com.azure.resourcemanager.monitor.generated.models.ActionGroupResource;
import com.azure.resourcemanager.monitor.generated.models.ArmRoleReceiver;
import com.azure.resourcemanager.monitor.generated.models.AutomationRunbookReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureFunctionReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.EnableRequest;
import com.azure.resourcemanager.monitor.generated.models.ItsmReceiver;
import com.azure.resourcemanager.monitor.generated.models.LogicAppReceiver;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ActionGroupResourceImpl
    implements ActionGroupResource, ActionGroupResource.Definition, ActionGroupResource.Update {
    private ActionGroupResourceInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String identity() {
        return this.innerModel().identity();
    }

    public String groupShortName() {
        return this.innerModel().groupShortName();
    }

    public boolean enabled() {
        return this.innerModel().enabled();
    }

    public List<EmailReceiver> emailReceivers() {
        List<EmailReceiver> inner = this.innerModel().emailReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SmsReceiver> smsReceivers() {
        List<SmsReceiver> inner = this.innerModel().smsReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<WebhookReceiver> webhookReceivers() {
        List<WebhookReceiver> inner = this.innerModel().webhookReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ItsmReceiver> itsmReceivers() {
        List<ItsmReceiver> inner = this.innerModel().itsmReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureAppPushReceiver> azureAppPushReceivers() {
        List<AzureAppPushReceiver> inner = this.innerModel().azureAppPushReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AutomationRunbookReceiver> automationRunbookReceivers() {
        List<AutomationRunbookReceiver> inner = this.innerModel().automationRunbookReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VoiceReceiver> voiceReceivers() {
        List<VoiceReceiver> inner = this.innerModel().voiceReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<LogicAppReceiver> logicAppReceivers() {
        List<LogicAppReceiver> inner = this.innerModel().logicAppReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFunctionReceiver> azureFunctionReceivers() {
        List<AzureFunctionReceiver> inner = this.innerModel().azureFunctionReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ArmRoleReceiver> armRoleReceivers() {
        List<ArmRoleReceiver> inner = this.innerModel().armRoleReceivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ActionGroupResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String actionGroupName;

    private ActionGroupPatchBody updateActionGroupPatch;

    public ActionGroupResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ActionGroupResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .createOrUpdateWithResponse(resourceGroupName, actionGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ActionGroupResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .createOrUpdateWithResponse(resourceGroupName, actionGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ActionGroupResourceImpl(String name, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = new ActionGroupResourceInner();
        this.serviceManager = serviceManager;
        this.actionGroupName = name;
    }

    public ActionGroupResourceImpl update() {
        this.updateActionGroupPatch = new ActionGroupPatchBody();
        return this;
    }

    public ActionGroupResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .updateWithResponse(resourceGroupName, actionGroupName, updateActionGroupPatch, Context.NONE)
                .getValue();
        return this;
    }

    public ActionGroupResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .updateWithResponse(resourceGroupName, actionGroupName, updateActionGroupPatch, context)
                .getValue();
        return this;
    }

    ActionGroupResourceImpl(
        ActionGroupResourceInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.actionGroupName = Utils.getValueFromIdByName(innerObject.id(), "actionGroups");
    }

    public ActionGroupResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .getByResourceGroupWithResponse(resourceGroupName, actionGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ActionGroupResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getActionGroups()
                .getByResourceGroupWithResponse(resourceGroupName, actionGroupName, context)
                .getValue();
        return this;
    }

    public void enableReceiver(EnableRequest enableRequest) {
        serviceManager.actionGroups().enableReceiver(resourceGroupName, actionGroupName, enableRequest);
    }

    public Response<Void> enableReceiverWithResponse(EnableRequest enableRequest, Context context) {
        return serviceManager
            .actionGroups()
            .enableReceiverWithResponse(resourceGroupName, actionGroupName, enableRequest, context);
    }

    public ActionGroupResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ActionGroupResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ActionGroupResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateActionGroupPatch.withTags(tags);
            return this;
        }
    }

    public ActionGroupResourceImpl withGroupShortName(String groupShortName) {
        this.innerModel().withGroupShortName(groupShortName);
        return this;
    }

    public ActionGroupResourceImpl withEnabled(boolean enabled) {
        this.innerModel().withEnabled(enabled);
        return this;
    }

    public ActionGroupResourceImpl withEmailReceivers(List<EmailReceiver> emailReceivers) {
        this.innerModel().withEmailReceivers(emailReceivers);
        return this;
    }

    public ActionGroupResourceImpl withSmsReceivers(List<SmsReceiver> smsReceivers) {
        this.innerModel().withSmsReceivers(smsReceivers);
        return this;
    }

    public ActionGroupResourceImpl withWebhookReceivers(List<WebhookReceiver> webhookReceivers) {
        this.innerModel().withWebhookReceivers(webhookReceivers);
        return this;
    }

    public ActionGroupResourceImpl withItsmReceivers(List<ItsmReceiver> itsmReceivers) {
        this.innerModel().withItsmReceivers(itsmReceivers);
        return this;
    }

    public ActionGroupResourceImpl withAzureAppPushReceivers(List<AzureAppPushReceiver> azureAppPushReceivers) {
        this.innerModel().withAzureAppPushReceivers(azureAppPushReceivers);
        return this;
    }

    public ActionGroupResourceImpl withAutomationRunbookReceivers(
        List<AutomationRunbookReceiver> automationRunbookReceivers) {
        this.innerModel().withAutomationRunbookReceivers(automationRunbookReceivers);
        return this;
    }

    public ActionGroupResourceImpl withVoiceReceivers(List<VoiceReceiver> voiceReceivers) {
        this.innerModel().withVoiceReceivers(voiceReceivers);
        return this;
    }

    public ActionGroupResourceImpl withLogicAppReceivers(List<LogicAppReceiver> logicAppReceivers) {
        this.innerModel().withLogicAppReceivers(logicAppReceivers);
        return this;
    }

    public ActionGroupResourceImpl withAzureFunctionReceivers(List<AzureFunctionReceiver> azureFunctionReceivers) {
        this.innerModel().withAzureFunctionReceivers(azureFunctionReceivers);
        return this;
    }

    public ActionGroupResourceImpl withArmRoleReceivers(List<ArmRoleReceiver> armRoleReceivers) {
        this.innerModel().withArmRoleReceivers(armRoleReceivers);
        return this;
    }

    public ActionGroupResourceImpl withEnabled(Boolean enabled) {
        this.updateActionGroupPatch.withEnabled(enabled);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
