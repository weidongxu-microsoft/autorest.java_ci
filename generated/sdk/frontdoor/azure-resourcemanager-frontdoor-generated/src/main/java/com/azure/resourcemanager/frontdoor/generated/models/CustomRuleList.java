// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines contents of custom rules. */
@Fluent
public final class CustomRuleList {
    /*
     * List of rules
     */
    @JsonProperty(value = "rules")
    private List<CustomRule> rules;

    /**
     * Get the rules property: List of rules.
     *
     * @return the rules value.
     */
    public List<CustomRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules.
     *
     * @param rules the rules value to set.
     * @return the CustomRuleList object itself.
     */
    public CustomRuleList withRules(List<CustomRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
