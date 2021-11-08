// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a managed rule group override setting. */
@Fluent
public final class ManagedRuleOverride {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRuleOverride.class);

    /*
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /*
     * Describes if the managed rule is in enabled or disabled state. Defaults
     * to Disabled if not specified.
     */
    @JsonProperty(value = "enabledState")
    private ManagedRuleEnabledState enabledState;

    /*
     * Describes the override action to be applied when rule matches.
     */
    @JsonProperty(value = "action")
    private ActionType action;

    /*
     * Describes the exclusions that are applied to this specific rule.
     */
    @JsonProperty(value = "exclusions")
    private List<ManagedRuleExclusion> exclusions;

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
     * Get the enabledState property: Describes if the managed rule is in enabled or disabled state. Defaults to
     * Disabled if not specified.
     *
     * @return the enabledState value.
     */
    public ManagedRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Describes if the managed rule is in enabled or disabled state. Defaults to
     * Disabled if not specified.
     *
     * @param enabledState the enabledState value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withEnabledState(ManagedRuleEnabledState enabledState) {
        this.enabledState = enabledState;
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
     * Get the exclusions property: Describes the exclusions that are applied to this specific rule.
     *
     * @return the exclusions value.
     */
    public List<ManagedRuleExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: Describes the exclusions that are applied to this specific rule.
     *
     * @param exclusions the exclusions value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withExclusions(List<ManagedRuleExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ruleId in model ManagedRuleOverride"));
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
    }
}
