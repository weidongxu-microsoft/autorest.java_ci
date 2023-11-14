// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayRewriteRule;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of rewrite rule set of the application gateway.
 */
@Fluent
public final class ApplicationGatewayRewriteRuleSetPropertiesFormat {
    /*
     * Rewrite rules in the rewrite rule set.
     */
    @JsonProperty(value = "rewriteRules")
    private List<ApplicationGatewayRewriteRule> rewriteRules;

    /*
     * The provisioning state of the rewrite rule set resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewayRewriteRuleSetPropertiesFormat class.
     */
    public ApplicationGatewayRewriteRuleSetPropertiesFormat() {
    }

    /**
     * Get the rewriteRules property: Rewrite rules in the rewrite rule set.
     * 
     * @return the rewriteRules value.
     */
    public List<ApplicationGatewayRewriteRule> rewriteRules() {
        return this.rewriteRules;
    }

    /**
     * Set the rewriteRules property: Rewrite rules in the rewrite rule set.
     * 
     * @param rewriteRules the rewriteRules value to set.
     * @return the ApplicationGatewayRewriteRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayRewriteRuleSetPropertiesFormat
        withRewriteRules(List<ApplicationGatewayRewriteRule> rewriteRules) {
        this.rewriteRules = rewriteRules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the rewrite rule set resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rewriteRules() != null) {
            rewriteRules().forEach(e -> e.validate());
        }
    }
}
