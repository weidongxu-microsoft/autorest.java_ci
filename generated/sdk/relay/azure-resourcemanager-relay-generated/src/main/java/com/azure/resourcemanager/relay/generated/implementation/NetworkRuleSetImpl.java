// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.relay.generated.fluent.models.NetworkRuleSetInner;
import com.azure.resourcemanager.relay.generated.models.DefaultAction;
import com.azure.resourcemanager.relay.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.relay.generated.models.NetworkRuleSet;
import java.util.Collections;
import java.util.List;

public final class NetworkRuleSetImpl implements NetworkRuleSet {
    private NetworkRuleSetInner innerObject;

    private final com.azure.resourcemanager.relay.generated.RelayManager serviceManager;

    NetworkRuleSetImpl(
        NetworkRuleSetInner innerObject, com.azure.resourcemanager.relay.generated.RelayManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DefaultAction defaultAction() {
        return this.innerModel().defaultAction();
    }

    public List<NWRuleSetIpRules> ipRules() {
        List<NWRuleSetIpRules> inner = this.innerModel().ipRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkRuleSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.relay.generated.RelayManager manager() {
        return this.serviceManager;
    }
}