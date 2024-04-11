// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.FirewallPolicyRuleCollection;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the rule collection group draft.
 */
@Fluent
public final class FirewallPolicyRuleCollectionGroupDraftProperties {
    /*
     * A read-only string that represents the size of the FirewallPolicyRuleCollectionGroupProperties in MB. (ex 1.2MB)
     */
    @JsonProperty(value = "size", access = JsonProperty.Access.WRITE_ONLY)
    private String size;

    /*
     * Priority of the Firewall Policy Rule Collection Group resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Group of Firewall Policy rule collections.
     */
    @JsonProperty(value = "ruleCollections")
    private List<FirewallPolicyRuleCollection> ruleCollections;

    /**
     * Creates an instance of FirewallPolicyRuleCollectionGroupDraftProperties class.
     */
    public FirewallPolicyRuleCollectionGroupDraftProperties() {
    }

    /**
     * Get the size property: A read-only string that represents the size of the
     * FirewallPolicyRuleCollectionGroupProperties in MB. (ex 1.2MB).
     * 
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     * 
     * @param priority the priority value to set.
     * @return the FirewallPolicyRuleCollectionGroupDraftProperties object itself.
     */
    public FirewallPolicyRuleCollectionGroupDraftProperties withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the ruleCollections property: Group of Firewall Policy rule collections.
     * 
     * @return the ruleCollections value.
     */
    public List<FirewallPolicyRuleCollection> ruleCollections() {
        return this.ruleCollections;
    }

    /**
     * Set the ruleCollections property: Group of Firewall Policy rule collections.
     * 
     * @param ruleCollections the ruleCollections value to set.
     * @return the FirewallPolicyRuleCollectionGroupDraftProperties object itself.
     */
    public FirewallPolicyRuleCollectionGroupDraftProperties
        withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections) {
        this.ruleCollections = ruleCollections;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleCollections() != null) {
            ruleCollections().forEach(e -> e.validate());
        }
    }
}
