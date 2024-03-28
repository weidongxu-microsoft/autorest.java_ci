// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFirewallRuleGroup;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayTierTypes;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the web application firewall rule set.
 */
@Fluent
public final class ApplicationGatewayFirewallRuleSetPropertiesFormat {
    /*
     * The provisioning state of the web application firewall rule set.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The type of the web application firewall rule set.
     */
    @JsonProperty(value = "ruleSetType", required = true)
    private String ruleSetType;

    /*
     * The version of the web application firewall rule set type.
     */
    @JsonProperty(value = "ruleSetVersion", required = true)
    private String ruleSetVersion;

    /*
     * The rule groups of the web application firewall rule set.
     */
    @JsonProperty(value = "ruleGroups", required = true)
    private List<ApplicationGatewayFirewallRuleGroup> ruleGroups;

    /*
     * Tier of an application gateway that support the rule set.
     */
    @JsonProperty(value = "tiers")
    private List<ApplicationGatewayTierTypes> tiers;

    /**
     * Creates an instance of ApplicationGatewayFirewallRuleSetPropertiesFormat class.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall rule set.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleGroups property: The rule groups of the web application firewall rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ApplicationGatewayFirewallRuleGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: The rule groups of the web application firewall rule set.
     * 
     * @param ruleGroups the ruleGroups value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat
        withRuleGroups(List<ApplicationGatewayFirewallRuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Get the tiers property: Tier of an application gateway that support the rule set.
     * 
     * @return the tiers value.
     */
    public List<ApplicationGatewayTierTypes> tiers() {
        return this.tiers;
    }

    /**
     * Set the tiers property: Tier of an application gateway that support the rule set.
     * 
     * @param tiers the tiers value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withTiers(List<ApplicationGatewayTierTypes> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleSetType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleSetType in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        }
        if (ruleSetVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleSetVersion in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        }
        if (ruleGroups() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleGroups in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        } else {
            ruleGroups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(ApplicationGatewayFirewallRuleSetPropertiesFormat.class);
}
