// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.ManagedRuleSetDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of managed rule set definitions available for use in a policy. */
@Fluent
public final class ManagedRuleSetDefinitionList {
    /*
     * List of managed rule set definitions.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleSetDefinitionInner> value;

    /*
     * URL to retrieve next set of managed rule set definitions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ManagedRuleSetDefinitionList class. */
    public ManagedRuleSetDefinitionList() {
    }

    /**
     * Get the value property: List of managed rule set definitions.
     *
     * @return the value value.
     */
    public List<ManagedRuleSetDefinitionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to retrieve next set of managed rule set definitions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to retrieve next set of managed rule set definitions.
     *
     * @param nextLink the nextLink value to set.
     * @return the ManagedRuleSetDefinitionList object itself.
     */
    public ManagedRuleSetDefinitionList withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
