// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.ManagedRuleSetsClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ManagedRuleSetDefinitionInner;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleSetDefinition;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleSets;

public final class ManagedRuleSetsImpl implements ManagedRuleSets {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleSetsImpl.class);

    private final ManagedRuleSetsClient innerClient;

    private final com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager;

    public ManagedRuleSetsImpl(ManagedRuleSetsClient innerClient,
        com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedRuleSetDefinition> list() {
        PagedIterable<ManagedRuleSetDefinitionInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ManagedRuleSetDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedRuleSetDefinition> list(Context context) {
        PagedIterable<ManagedRuleSetDefinitionInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ManagedRuleSetDefinitionImpl(inner1, this.manager()));
    }

    private ManagedRuleSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.generated.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
