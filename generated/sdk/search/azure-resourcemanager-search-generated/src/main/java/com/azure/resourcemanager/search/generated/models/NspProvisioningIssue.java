// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object to describe any issues with provisioning network security perimeters to a search service.
 */
@Fluent
public final class NspProvisioningIssue {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The properties to describe any issues with provisioning network security perimeters to a search service.
     */
    @JsonProperty(value = "properties")
    private NspProvisioningIssueProperties properties;

    /**
     * Creates an instance of NspProvisioningIssue class.
     */
    public NspProvisioningIssue() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the NspProvisioningIssue object itself.
     */
    public NspProvisioningIssue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The properties to describe any issues with provisioning network security perimeters
     * to a search service.
     * 
     * @return the properties value.
     */
    public NspProvisioningIssueProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties to describe any issues with provisioning network security perimeters
     * to a search service.
     * 
     * @param properties the properties value to set.
     * @return the NspProvisioningIssue object itself.
     */
    public NspProvisioningIssue withProperties(NspProvisioningIssueProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
