// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresql.generated.fluent.models.FirewallRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of firewall rules.
 */
@Fluent
public final class FirewallRuleListResult {
    /*
     * The list of firewall rules in a server.
     */
    @JsonProperty(value = "value")
    private List<FirewallRuleInner> value;

    /**
     * Creates an instance of FirewallRuleListResult class.
     */
    public FirewallRuleListResult() {
    }

    /**
     * Get the value property: The list of firewall rules in a server.
     * 
     * @return the value value.
     */
    public List<FirewallRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of firewall rules in a server.
     * 
     * @param value the value value to set.
     * @return the FirewallRuleListResult object itself.
     */
    public FirewallRuleListResult withValue(List<FirewallRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
