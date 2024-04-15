// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleCollectionGroupDraftInner;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollection;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollectionGroupDraft;
import java.util.Collections;
import java.util.List;

public final class FirewallPolicyRuleCollectionGroupDraftImpl implements FirewallPolicyRuleCollectionGroupDraft {
    private FirewallPolicyRuleCollectionGroupDraftInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    FirewallPolicyRuleCollectionGroupDraftImpl(FirewallPolicyRuleCollectionGroupDraftInner innerObject,
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

    public String size() {
        return this.innerModel().size();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public List<FirewallPolicyRuleCollection> ruleCollections() {
        List<FirewallPolicyRuleCollection> inner = this.innerModel().ruleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public FirewallPolicyRuleCollectionGroupDraftInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}