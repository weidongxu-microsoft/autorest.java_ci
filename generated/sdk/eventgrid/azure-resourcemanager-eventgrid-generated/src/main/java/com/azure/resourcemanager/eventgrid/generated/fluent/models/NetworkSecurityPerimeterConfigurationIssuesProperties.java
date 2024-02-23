// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssueSeverity;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssueType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network security perimeter configuration issues properties.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationIssuesProperties {
    /*
     * Provisioning issue type.
     */
    @JsonProperty(value = "issueType")
    private NetworkSecurityPerimeterConfigurationIssueType issueType;

    /*
     * Provisioning issue severity.
     */
    @JsonProperty(value = "severity")
    private NetworkSecurityPerimeterConfigurationIssueSeverity severity;

    /*
     * Provisioning issue description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * ARM IDs of resources that can be associated to the same perimeter to remediate the issue.
     */
    @JsonProperty(value = "suggestedResourceIds")
    private List<String> suggestedResourceIds;

    /*
     * Access rules that can be added to the same profile to remediate the issue.
     */
    @JsonProperty(value = "suggestedAccessRules")
    private List<String> suggestedAccessRules;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationIssuesProperties class.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties() {
    }

    /**
     * Get the issueType property: Provisioning issue type.
     * 
     * @return the issueType value.
     */
    public NetworkSecurityPerimeterConfigurationIssueType issueType() {
        return this.issueType;
    }

    /**
     * Set the issueType property: Provisioning issue type.
     * 
     * @param issueType the issueType value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withIssueType(NetworkSecurityPerimeterConfigurationIssueType issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * Get the severity property: Provisioning issue severity.
     * 
     * @return the severity value.
     */
    public NetworkSecurityPerimeterConfigurationIssueSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Provisioning issue severity.
     * 
     * @param severity the severity value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the description property: Provisioning issue description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Provisioning issue description.
     * 
     * @param description the description value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @return the suggestedResourceIds value.
     */
    public List<String> suggestedResourceIds() {
        return this.suggestedResourceIds;
    }

    /**
     * Set the suggestedResourceIds property: ARM IDs of resources that can be associated to the same perimeter to
     * remediate the issue.
     * 
     * @param suggestedResourceIds the suggestedResourceIds value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSuggestedResourceIds(List<String> suggestedResourceIds) {
        this.suggestedResourceIds = suggestedResourceIds;
        return this;
    }

    /**
     * Get the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @return the suggestedAccessRules value.
     */
    public List<String> suggestedAccessRules() {
        return this.suggestedAccessRules;
    }

    /**
     * Set the suggestedAccessRules property: Access rules that can be added to the same profile to remediate the issue.
     * 
     * @param suggestedAccessRules the suggestedAccessRules value to set.
     * @return the NetworkSecurityPerimeterConfigurationIssuesProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationIssuesProperties
        withSuggestedAccessRules(List<String> suggestedAccessRules) {
        this.suggestedAccessRules = suggestedAccessRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
