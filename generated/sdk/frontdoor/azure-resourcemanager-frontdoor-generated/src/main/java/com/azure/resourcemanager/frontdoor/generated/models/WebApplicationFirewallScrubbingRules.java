// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the contents of the log scrubbing rules.
 */
@Fluent
public final class WebApplicationFirewallScrubbingRules {
    /*
     * The variable to be scrubbed from the logs.
     */
    @JsonProperty(value = "matchVariable", required = true)
    private ScrubbingRuleEntryMatchVariable matchVariable;

    /*
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this rule applies to.
     */
    @JsonProperty(value = "selectorMatchOperator", required = true)
    private ScrubbingRuleEntryMatchOperator selectorMatchOperator;

    /*
     * When matchVariable is a collection, operator used to specify which elements in the collection this rule applies to.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /*
     * Defines the state of a log scrubbing rule. Default value is enabled.
     */
    @JsonProperty(value = "state")
    private ScrubbingRuleEntryState state;

    /**
     * Creates an instance of WebApplicationFirewallScrubbingRules class.
     */
    public WebApplicationFirewallScrubbingRules() {
    }

    /**
     * Get the matchVariable property: The variable to be scrubbed from the logs.
     * 
     * @return the matchVariable value.
     */
    public ScrubbingRuleEntryMatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the matchVariable property: The variable to be scrubbed from the logs.
     * 
     * @param matchVariable the matchVariable value to set.
     * @return the WebApplicationFirewallScrubbingRules object itself.
     */
    public WebApplicationFirewallScrubbingRules withMatchVariable(ScrubbingRuleEntryMatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get the selectorMatchOperator property: When matchVariable is a collection, operate on the selector to specify
     * which elements in the collection this rule applies to.
     * 
     * @return the selectorMatchOperator value.
     */
    public ScrubbingRuleEntryMatchOperator selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    /**
     * Set the selectorMatchOperator property: When matchVariable is a collection, operate on the selector to specify
     * which elements in the collection this rule applies to.
     * 
     * @param selectorMatchOperator the selectorMatchOperator value to set.
     * @return the WebApplicationFirewallScrubbingRules object itself.
     */
    public WebApplicationFirewallScrubbingRules
        withSelectorMatchOperator(ScrubbingRuleEntryMatchOperator selectorMatchOperator) {
        this.selectorMatchOperator = selectorMatchOperator;
        return this;
    }

    /**
     * Get the selector property: When matchVariable is a collection, operator used to specify which elements in the
     * collection this rule applies to.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: When matchVariable is a collection, operator used to specify which elements in the
     * collection this rule applies to.
     * 
     * @param selector the selector value to set.
     * @return the WebApplicationFirewallScrubbingRules object itself.
     */
    public WebApplicationFirewallScrubbingRules withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the state property: Defines the state of a log scrubbing rule. Default value is enabled.
     * 
     * @return the state value.
     */
    public ScrubbingRuleEntryState state() {
        return this.state;
    }

    /**
     * Set the state property: Defines the state of a log scrubbing rule. Default value is enabled.
     * 
     * @param state the state value to set.
     * @return the WebApplicationFirewallScrubbingRules object itself.
     */
    public WebApplicationFirewallScrubbingRules withState(ScrubbingRuleEntryState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariable() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property matchVariable in model WebApplicationFirewallScrubbingRules"));
        }
        if (selectorMatchOperator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property selectorMatchOperator in model WebApplicationFirewallScrubbingRules"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallScrubbingRules.class);
}