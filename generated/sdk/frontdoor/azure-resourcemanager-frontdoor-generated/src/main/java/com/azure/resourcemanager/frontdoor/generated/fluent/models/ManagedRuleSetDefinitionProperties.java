// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.frontdoor.generated.models.ManagedRuleGroupDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for a managed rule set definition. */
@Immutable
public final class ManagedRuleSetDefinitionProperties {
    /*
     * Provisioning state of the managed rule set.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Id of the managed rule set.
     */
    @JsonProperty(value = "ruleSetId", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetId;

    /*
     * Type of the managed rule set.
     */
    @JsonProperty(value = "ruleSetType", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetType;

    /*
     * Version of the managed rule set type.
     */
    @JsonProperty(value = "ruleSetVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetVersion;

    /*
     * Rule groups of the managed rule set.
     */
    @JsonProperty(value = "ruleGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleGroupDefinition> ruleGroups;

    /**
     * Get the provisioningState property: Provisioning state of the managed rule set.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ruleSetId property: Id of the managed rule set.
     *
     * @return the ruleSetId value.
     */
    public String ruleSetId() {
        return this.ruleSetId;
    }

    /**
     * Get the ruleSetType property: Type of the managed rule set.
     *
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Get the ruleSetVersion property: Version of the managed rule set type.
     *
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Get the ruleGroups property: Rule groups of the managed rule set.
     *
     * @return the ruleGroups value.
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
    }
}
