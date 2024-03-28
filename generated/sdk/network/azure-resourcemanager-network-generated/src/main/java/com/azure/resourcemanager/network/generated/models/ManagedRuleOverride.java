// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule group override setting.
 */
@Fluent
public final class ManagedRuleOverride {
    /*
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /*
     * The state of the managed rule. Defaults to Disabled if not specified.
     */
    @JsonProperty(value = "state")
    private ManagedRuleEnabledState state;

    /*
     * Describes the override action to be applied when rule matches.
     */
    @JsonProperty(value = "action")
    private ActionType action;

    /**
     * Creates an instance of ManagedRuleOverride class.
     */
    public ManagedRuleOverride() {
    }

    /**
     * Get the ruleId property: Identifier for the managed rule.
     * 
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: Identifier for the managed rule.
     * 
     * @param ruleId the ruleId value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the state property: The state of the managed rule. Defaults to Disabled if not specified.
     * 
     * @return the state value.
     */
    public ManagedRuleEnabledState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the managed rule. Defaults to Disabled if not specified.
     * 
     * @param state the state value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withState(ManagedRuleEnabledState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the action property: Describes the override action to be applied when rule matches.
     * 
     * @return the action value.
     */
    public ActionType action() {
        return this.action;
    }

    /**
     * Set the action property: Describes the override action to be applied when rule matches.
     * 
     * @param action the action value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withAction(ActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ruleId in model ManagedRuleOverride"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleOverride.class);
}
