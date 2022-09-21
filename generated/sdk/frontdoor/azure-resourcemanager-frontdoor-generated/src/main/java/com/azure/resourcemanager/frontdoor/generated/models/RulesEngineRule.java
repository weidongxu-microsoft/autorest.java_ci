// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains a list of match conditions, and an action on how to modify the request/response. If multiple rules match,
 * the actions from one rule that conflict with a previous rule overwrite for a singular action, or append in the case
 * of headers manipulation.
 */
@Fluent
public final class RulesEngineRule {
    /*
     * A name to refer to this specific rule.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A priority assigned to this rule.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * Actions to perform on the request and response if all of the match conditions are met.
     */
    @JsonProperty(value = "action", required = true)
    private RulesEngineAction action;

    /*
     * A list of match conditions that must meet in order for the actions of this rule to run. Having no match
     * conditions means the actions will always run.
     */
    @JsonProperty(value = "matchConditions")
    private List<RulesEngineMatchCondition> matchConditions;

    /*
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present,
     * defaults to Continue.
     */
    @JsonProperty(value = "matchProcessingBehavior")
    private MatchProcessingBehavior matchProcessingBehavior;

    /** Creates an instance of RulesEngineRule class. */
    public RulesEngineRule() {
    }

    /**
     * Get the name property: A name to refer to this specific rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A name to refer to this specific rule.
     *
     * @param name the name value to set.
     * @return the RulesEngineRule object itself.
     */
    public RulesEngineRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the priority property: A priority assigned to this rule.
     *
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: A priority assigned to this rule.
     *
     * @param priority the priority value to set.
     * @return the RulesEngineRule object itself.
     */
    public RulesEngineRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: Actions to perform on the request and response if all of the match conditions are met.
     *
     * @return the action value.
     */
    public RulesEngineAction action() {
        return this.action;
    }

    /**
     * Set the action property: Actions to perform on the request and response if all of the match conditions are met.
     *
     * @param action the action value to set.
     * @return the RulesEngineRule object itself.
     */
    public RulesEngineRule withAction(RulesEngineAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the matchConditions property: A list of match conditions that must meet in order for the actions of this rule
     * to run. Having no match conditions means the actions will always run.
     *
     * @return the matchConditions value.
     */
    public List<RulesEngineMatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: A list of match conditions that must meet in order for the actions of this rule
     * to run. Having no match conditions means the actions will always run.
     *
     * @param matchConditions the matchConditions value to set.
     * @return the RulesEngineRule object itself.
     */
    public RulesEngineRule withMatchConditions(List<RulesEngineMatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @return the matchProcessingBehavior value.
     */
    public MatchProcessingBehavior matchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }

    /**
     * Set the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @param matchProcessingBehavior the matchProcessingBehavior value to set.
     * @return the RulesEngineRule object itself.
     */
    public RulesEngineRule withMatchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
        this.matchProcessingBehavior = matchProcessingBehavior;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model RulesEngineRule"));
        }
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model RulesEngineRule"));
        } else {
            action().validate();
        }
        if (matchConditions() != null) {
            matchConditions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RulesEngineRule.class);
}
