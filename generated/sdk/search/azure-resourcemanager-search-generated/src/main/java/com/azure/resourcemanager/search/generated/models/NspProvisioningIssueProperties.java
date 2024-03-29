// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties to describe any issues with provisioning network security perimeters to a search service.
 */
@Fluent
public final class NspProvisioningIssueProperties {
    /*
     * The issueType property.
     */
    @JsonProperty(value = "issueType")
    private String issueType;

    /*
     * The severity property.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The suggestedResourceIds property.
     */
    @JsonProperty(value = "suggestedResourceIds")
    private List<String> suggestedResourceIds;

    /*
     * The suggestedAccessRules property.
     */
    @JsonProperty(value = "suggestedAccessRules")
    private List<String> suggestedAccessRules;

    /**
     * Creates an instance of NspProvisioningIssueProperties class.
     */
    public NspProvisioningIssueProperties() {
    }

    /**
     * Get the issueType property: The issueType property.
     * 
     * @return the issueType value.
     */
    public String issueType() {
        return this.issueType;
    }

    /**
     * Set the issueType property: The issueType property.
     * 
     * @param issueType the issueType value to set.
     * @return the NspProvisioningIssueProperties object itself.
     */
    public NspProvisioningIssueProperties withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * Get the severity property: The severity property.
     * 
     * @return the severity value.
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity property.
     * 
     * @param severity the severity value to set.
     * @return the NspProvisioningIssueProperties object itself.
     */
    public NspProvisioningIssueProperties withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the description property: The description property.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     * 
     * @param description the description value to set.
     * @return the NspProvisioningIssueProperties object itself.
     */
    public NspProvisioningIssueProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the suggestedResourceIds property: The suggestedResourceIds property.
     * 
     * @return the suggestedResourceIds value.
     */
    public List<String> suggestedResourceIds() {
        return this.suggestedResourceIds;
    }

    /**
     * Set the suggestedResourceIds property: The suggestedResourceIds property.
     * 
     * @param suggestedResourceIds the suggestedResourceIds value to set.
     * @return the NspProvisioningIssueProperties object itself.
     */
    public NspProvisioningIssueProperties withSuggestedResourceIds(List<String> suggestedResourceIds) {
        this.suggestedResourceIds = suggestedResourceIds;
        return this;
    }

    /**
     * Get the suggestedAccessRules property: The suggestedAccessRules property.
     * 
     * @return the suggestedAccessRules value.
     */
    public List<String> suggestedAccessRules() {
        return this.suggestedAccessRules;
    }

    /**
     * Set the suggestedAccessRules property: The suggestedAccessRules property.
     * 
     * @param suggestedAccessRules the suggestedAccessRules value to set.
     * @return the NspProvisioningIssueProperties object itself.
     */
    public NspProvisioningIssueProperties withSuggestedAccessRules(List<String> suggestedAccessRules) {
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
