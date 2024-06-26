// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayWafDynamicManifestResultInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFirewallManifestRuleSet;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayWafDynamicManifestResult;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewayWafDynamicManifestResultImpl
    implements ApplicationGatewayWafDynamicManifestResult {
    private ApplicationGatewayWafDynamicManifestResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ApplicationGatewayWafDynamicManifestResultImpl(ApplicationGatewayWafDynamicManifestResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets() {
        List<ApplicationGatewayFirewallManifestRuleSet> inner = this.innerModel().availableRuleSets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ruleSetType() {
        return this.innerModel().ruleSetType();
    }

    public String ruleSetVersion() {
        return this.innerModel().ruleSetVersion();
    }

    public ApplicationGatewayWafDynamicManifestResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
