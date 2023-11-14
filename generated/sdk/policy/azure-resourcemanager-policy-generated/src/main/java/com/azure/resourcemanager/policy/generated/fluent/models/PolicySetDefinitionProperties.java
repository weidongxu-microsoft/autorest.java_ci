// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.generated.models.ParameterDefinitionsValue;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinitionGroup;
import com.azure.resourcemanager.policy.generated.models.PolicyDefinitionReference;
import com.azure.resourcemanager.policy.generated.models.PolicyType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The policy set definition properties.
 */
@Fluent
public final class PolicySetDefinitionProperties {
    /*
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     */
    @JsonProperty(value = "policyType")
    private PolicyType policyType;

    /*
     * The display name of the policy set definition.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The policy set definition description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The policy set definition metadata. Metadata is an open ended object and is typically a collection of key value
     * pairs.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /*
     * The policy set definition parameters that can be used in policy definition references.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ParameterDefinitionsValue> parameters;

    /*
     * An array of policy definition references.
     */
    @JsonProperty(value = "policyDefinitions", required = true)
    private List<PolicyDefinitionReference> policyDefinitions;

    /*
     * The metadata describing groups of policy definition references within the policy set definition.
     */
    @JsonProperty(value = "policyDefinitionGroups")
    private List<PolicyDefinitionGroup> policyDefinitionGroups;

    /**
     * Creates an instance of PolicySetDefinitionProperties class.
     */
    public PolicySetDefinitionProperties() {
    }

    /**
     * Get the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     * 
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom,
     * and Static.
     * 
     * @param policyType the policyType value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy set definition.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy set definition.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The policy set definition description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The policy set definition description.
     * 
     * @param description the description value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadata property: The policy set definition metadata. Metadata is an open ended object and is
     * typically a collection of key value pairs.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The policy set definition metadata. Metadata is an open ended object and is
     * typically a collection of key value pairs.
     * 
     * @param metadata the metadata value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameters property: The policy set definition parameters that can be used in policy definition
     * references.
     * 
     * @return the parameters value.
     */
    public Map<String, ParameterDefinitionsValue> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The policy set definition parameters that can be used in policy definition
     * references.
     * 
     * @param parameters the parameters value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the policyDefinitions property: An array of policy definition references.
     * 
     * @return the policyDefinitions value.
     */
    public List<PolicyDefinitionReference> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * Set the policyDefinitions property: An array of policy definition references.
     * 
     * @param policyDefinitions the policyDefinitions value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions) {
        this.policyDefinitions = policyDefinitions;
        return this;
    }

    /**
     * Get the policyDefinitionGroups property: The metadata describing groups of policy definition references within
     * the policy set definition.
     * 
     * @return the policyDefinitionGroups value.
     */
    public List<PolicyDefinitionGroup> policyDefinitionGroups() {
        return this.policyDefinitionGroups;
    }

    /**
     * Set the policyDefinitionGroups property: The metadata describing groups of policy definition references within
     * the policy set definition.
     * 
     * @param policyDefinitionGroups the policyDefinitionGroups value to set.
     * @return the PolicySetDefinitionProperties object itself.
     */
    public PolicySetDefinitionProperties
        withPolicyDefinitionGroups(List<PolicyDefinitionGroup> policyDefinitionGroups) {
        this.policyDefinitionGroups = policyDefinitionGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (policyDefinitions() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property policyDefinitions in model PolicySetDefinitionProperties"));
        } else {
            policyDefinitions().forEach(e -> e.validate());
        }
        if (policyDefinitionGroups() != null) {
            policyDefinitionGroups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicySetDefinitionProperties.class);
}
