// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NetworkSecurityPerimeterConfigurationIssuesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network security perimeter configuration issues.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationIssues {
    /*
     * Provisioning issue name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Provisioning issue properties.
     */
    @JsonProperty(value = "properties")
    private NetworkSecurityPerimeterConfigurationIssuesProperties innerProperties;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationIssues class.
     */
    public NetworkSecurityPerimeterConfigurationIssues() {
    }

    /**
     * Get the name property: Provisioning issue name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Provisioning issue name.
     * 
     * @param name the name value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Provisioning issue properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterConfigurationIssuesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the issueType property: Provisioning issue type.
     * 
     * @return the issueType value.
     */
    public NetworkSecurityPerimeterConfigurationIssueType issueType() {
        return this.innerProperties() == null ? null : this.innerProperties().issueType();
    }

    /**
     * Set the issueType property: Provisioning issue type.
     * 
     * @param issueType the issueType value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues
        withIssueType(NetworkSecurityPerimeterConfigurationIssueType issueType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationIssuesProperties();
        }
        this.innerProperties().withIssueType(issueType);
        return this;
    }

    /**
     * Get the severity property: Provisioning issue severity.
     * 
     * @return the severity value.
     */
    public NetworkSecurityPerimeterConfigurationIssueSeverity severity() {
        return this.innerProperties() == null ? null : this.innerProperties().severity();
    }

    /**
     * Set the severity property: Provisioning issue severity.
     * 
     * @param severity the severity value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues
        withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity severity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationIssuesProperties();
        }
        this.innerProperties().withSeverity(severity);
        return this;
    }

    /**
     * Get the description property: Provisioning issue description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Provisioning issue description.
     * 
     * @param description the description value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationIssuesProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @return the suggestedResourceIds value.
     */
    public List<String> suggestedResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().suggestedResourceIds();
    }

    /**
     * Set the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @param suggestedResourceIds the suggestedResourceIds value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues withSuggestedResourceIds(List<String> suggestedResourceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationIssuesProperties();
        }
        this.innerProperties().withSuggestedResourceIds(suggestedResourceIds);
        return this;
    }

    /**
     * Get the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @return the suggestedAccessRules value.
     */
    public List<String> suggestedAccessRules() {
        return this.innerProperties() == null ? null : this.innerProperties().suggestedAccessRules();
    }

    /**
     * Set the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @param suggestedAccessRules the suggestedAccessRules value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssues object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssues withSuggestedAccessRules(List<String> suggestedAccessRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationIssuesProperties();
        }
        this.innerProperties().withSuggestedAccessRules(suggestedAccessRules);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
