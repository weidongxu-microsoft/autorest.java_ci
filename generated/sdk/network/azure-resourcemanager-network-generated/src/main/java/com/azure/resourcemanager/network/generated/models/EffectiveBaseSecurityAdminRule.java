// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Network base admin rule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = EffectiveBaseSecurityAdminRule.class,
    visible = true)
@JsonTypeName("EffectiveBaseSecurityAdminRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Custom", value = EffectiveSecurityAdminRule.class),
    @JsonSubTypes.Type(name = "Default", value = EffectiveDefaultSecurityAdminRule.class) })
@Fluent
public class EffectiveBaseSecurityAdminRule {
    /*
     * Whether the rule is custom or default.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private EffectiveAdminRuleKind kind;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * A description of the security admin configuration.
     */
    @JsonProperty(value = "configurationDescription")
    private String configurationDescription;

    /*
     * A description of the rule collection.
     */
    @JsonProperty(value = "ruleCollectionDescription")
    private String ruleCollectionDescription;

    /*
     * Groups for rule collection
     */
    @JsonProperty(value = "ruleCollectionAppliesToGroups")
    private List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups;

    /*
     * Effective configuration groups.
     */
    @JsonProperty(value = "ruleGroups")
    private List<ConfigurationGroup> ruleGroups;

    /**
     * Creates an instance of EffectiveBaseSecurityAdminRule class.
     */
    public EffectiveBaseSecurityAdminRule() {
        this.kind = EffectiveAdminRuleKind.fromString("EffectiveBaseSecurityAdminRule");
    }

    /**
     * Get the kind property: Whether the rule is custom or default.
     * 
     * @return the kind value.
     */
    public EffectiveAdminRuleKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Whether the rule is custom or default.
     * 
     * @param kind the kind value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    protected EffectiveBaseSecurityAdminRule withKind(EffectiveAdminRuleKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    public EffectiveBaseSecurityAdminRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the configurationDescription property: A description of the security admin configuration.
     * 
     * @return the configurationDescription value.
     */
    public String configurationDescription() {
        return this.configurationDescription;
    }

    /**
     * Set the configurationDescription property: A description of the security admin configuration.
     * 
     * @param configurationDescription the configurationDescription value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    public EffectiveBaseSecurityAdminRule withConfigurationDescription(String configurationDescription) {
        this.configurationDescription = configurationDescription;
        return this;
    }

    /**
     * Get the ruleCollectionDescription property: A description of the rule collection.
     * 
     * @return the ruleCollectionDescription value.
     */
    public String ruleCollectionDescription() {
        return this.ruleCollectionDescription;
    }

    /**
     * Set the ruleCollectionDescription property: A description of the rule collection.
     * 
     * @param ruleCollectionDescription the ruleCollectionDescription value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    public EffectiveBaseSecurityAdminRule withRuleCollectionDescription(String ruleCollectionDescription) {
        this.ruleCollectionDescription = ruleCollectionDescription;
        return this;
    }

    /**
     * Get the ruleCollectionAppliesToGroups property: Groups for rule collection.
     * 
     * @return the ruleCollectionAppliesToGroups value.
     */
    public List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups;
    }

    /**
     * Set the ruleCollectionAppliesToGroups property: Groups for rule collection.
     * 
     * @param ruleCollectionAppliesToGroups the ruleCollectionAppliesToGroups value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    public EffectiveBaseSecurityAdminRule
        withRuleCollectionAppliesToGroups(List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups) {
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        return this;
    }

    /**
     * Get the ruleGroups property: Effective configuration groups.
     * 
     * @return the ruleGroups value.
     */
    public List<ConfigurationGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: Effective configuration groups.
     * 
     * @param ruleGroups the ruleGroups value to set.
     * @return the EffectiveBaseSecurityAdminRule object itself.
     */
    public EffectiveBaseSecurityAdminRule withRuleGroups(List<ConfigurationGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleCollectionAppliesToGroups() != null) {
            ruleCollectionAppliesToGroups().forEach(e -> e.validate());
        }
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
    }
}
