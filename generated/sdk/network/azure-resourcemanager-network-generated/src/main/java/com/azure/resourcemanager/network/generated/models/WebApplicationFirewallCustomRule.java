// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines contents of a web application rule.
 */
@Fluent
public final class WebApplicationFirewallCustomRule {
    /*
     * The name of the resource that is unique within a policy. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     */
    @JsonProperty(value = "state")
    private WebApplicationFirewallState state;

    /*
     * Duration over which Rate Limit policy will be applied. Applies only when ruleType is RateLimitRule.
     */
    @JsonProperty(value = "rateLimitDuration")
    private ApplicationGatewayFirewallRateLimitDuration rateLimitDuration;

    /*
     * Rate Limit threshold to apply in case ruleType is RateLimitRule. Must be greater than or equal to 1
     */
    @JsonProperty(value = "rateLimitThreshold")
    private Integer rateLimitThreshold;

    /*
     * The rule type.
     */
    @JsonProperty(value = "ruleType", required = true)
    private WebApplicationFirewallRuleType ruleType;

    /*
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /*
     * List of user session identifier group by clauses.
     */
    @JsonProperty(value = "groupByUserSession")
    private List<GroupByUserSession> groupByUserSession;

    /*
     * Type of Actions.
     */
    @JsonProperty(value = "action", required = true)
    private WebApplicationFirewallAction action;

    /**
     * Creates an instance of WebApplicationFirewallCustomRule class.
     */
    public WebApplicationFirewallCustomRule() {
    }

    /**
     * Get the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     * 
     * @param name the name value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     * 
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     * 
     * @param priority the priority value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the state property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not
     * specified.
     * 
     * @return the state value.
     */
    public WebApplicationFirewallState state() {
        return this.state;
    }

    /**
     * Set the state property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not
     * specified.
     * 
     * @param state the state value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withState(WebApplicationFirewallState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the rateLimitDuration property: Duration over which Rate Limit policy will be applied. Applies only when
     * ruleType is RateLimitRule.
     * 
     * @return the rateLimitDuration value.
     */
    public ApplicationGatewayFirewallRateLimitDuration rateLimitDuration() {
        return this.rateLimitDuration;
    }

    /**
     * Set the rateLimitDuration property: Duration over which Rate Limit policy will be applied. Applies only when
     * ruleType is RateLimitRule.
     * 
     * @param rateLimitDuration the rateLimitDuration value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule
        withRateLimitDuration(ApplicationGatewayFirewallRateLimitDuration rateLimitDuration) {
        this.rateLimitDuration = rateLimitDuration;
        return this;
    }

    /**
     * Get the rateLimitThreshold property: Rate Limit threshold to apply in case ruleType is RateLimitRule. Must be
     * greater than or equal to 1.
     * 
     * @return the rateLimitThreshold value.
     */
    public Integer rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    /**
     * Set the rateLimitThreshold property: Rate Limit threshold to apply in case ruleType is RateLimitRule. Must be
     * greater than or equal to 1.
     * 
     * @param rateLimitThreshold the rateLimitThreshold value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withRateLimitThreshold(Integer rateLimitThreshold) {
        this.rateLimitThreshold = rateLimitThreshold;
        return this;
    }

    /**
     * Get the ruleType property: The rule type.
     * 
     * @return the ruleType value.
     */
    public WebApplicationFirewallRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: The rule type.
     * 
     * @param ruleType the ruleType value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withRuleType(WebApplicationFirewallRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the matchConditions property: List of match conditions.
     * 
     * @return the matchConditions value.
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: List of match conditions.
     * 
     * @param matchConditions the matchConditions value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the groupByUserSession property: List of user session identifier group by clauses.
     * 
     * @return the groupByUserSession value.
     */
    public List<GroupByUserSession> groupByUserSession() {
        return this.groupByUserSession;
    }

    /**
     * Set the groupByUserSession property: List of user session identifier group by clauses.
     * 
     * @param groupByUserSession the groupByUserSession value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withGroupByUserSession(List<GroupByUserSession> groupByUserSession) {
        this.groupByUserSession = groupByUserSession;
        return this;
    }

    /**
     * Get the action property: Type of Actions.
     * 
     * @return the action value.
     */
    public WebApplicationFirewallAction action() {
        return this.action;
    }

    /**
     * Set the action property: Type of Actions.
     * 
     * @param action the action value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withAction(WebApplicationFirewallAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleType in model WebApplicationFirewallCustomRule"));
        }
        if (matchConditions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property matchConditions in model WebApplicationFirewallCustomRule"));
        } else {
            matchConditions().forEach(e -> e.validate());
        }
        if (groupByUserSession() != null) {
            groupByUserSession().forEach(e -> e.validate());
        }
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property action in model WebApplicationFirewallCustomRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallCustomRule.class);
}
