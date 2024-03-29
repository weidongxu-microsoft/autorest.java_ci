// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.PolicyDefinitionInner;
import com.azure.resourcemanager.policy.generated.models.ParameterDefinitionsValue;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinition;
import com.azure.resourcemanager.policy.generated.models.PolicyType;
import java.util.Collections;
import java.util.Map;

public final class PolicyDefinitionImpl
    implements PolicyDefinition, PolicyDefinition.Definition, PolicyDefinition.Update {
    private PolicyDefinitionInner innerObject;

    private final com.azure.resourcemanager.policy.generated.PolicyManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PolicyType policyType() {
        return this.innerModel().policyType();
    }

    public String mode() {
        return this.innerModel().mode();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Object policyRule() {
        return this.innerModel().policyRule();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public Map<String, ParameterDefinitionsValue> parameters() {
        Map<String, ParameterDefinitionsValue> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PolicyDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policy.generated.PolicyManager manager() {
        return this.serviceManager;
    }

    private String policyDefinitionName;

    public PolicyDefinition create() {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .createOrUpdateWithResponse(policyDefinitionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public PolicyDefinition create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .createOrUpdateWithResponse(policyDefinitionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PolicyDefinitionImpl(String name, com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerObject = new PolicyDefinitionInner();
        this.serviceManager = serviceManager;
        this.policyDefinitionName = name;
    }

    public PolicyDefinitionImpl update() {
        return this;
    }

    public PolicyDefinition apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .createOrUpdateWithResponse(policyDefinitionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public PolicyDefinition apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .createOrUpdateWithResponse(policyDefinitionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PolicyDefinitionImpl(PolicyDefinitionInner innerObject,
        com.azure.resourcemanager.policy.generated.PolicyManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.policyDefinitionName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "policyDefinitions");
    }

    public PolicyDefinition refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .getWithResponse(policyDefinitionName, Context.NONE)
            .getValue();
        return this;
    }

    public PolicyDefinition refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPolicyDefinitions()
            .getWithResponse(policyDefinitionName, context)
            .getValue();
        return this;
    }

    public PolicyDefinitionImpl withPolicyType(PolicyType policyType) {
        this.innerModel().withPolicyType(policyType);
        return this;
    }

    public PolicyDefinitionImpl withMode(String mode) {
        this.innerModel().withMode(mode);
        return this;
    }

    public PolicyDefinitionImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public PolicyDefinitionImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public PolicyDefinitionImpl withPolicyRule(Object policyRule) {
        this.innerModel().withPolicyRule(policyRule);
        return this;
    }

    public PolicyDefinitionImpl withMetadata(Object metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public PolicyDefinitionImpl withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }
}
