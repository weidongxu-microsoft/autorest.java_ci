// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.search.generated.models.NspConfigAssociation;
import com.azure.resourcemanager.search.generated.models.NspConfigPerimeter;
import com.azure.resourcemanager.search.generated.models.NspConfigProfile;
import com.azure.resourcemanager.search.generated.models.NspProvisioningIssue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of a network security perimeter configuration.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationProperties {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The perimeter for a network security perimeter configuration.
     */
    @JsonProperty(value = "networkSecurityPerimeter")
    private NspConfigPerimeter networkSecurityPerimeter;

    /*
     * The resource association for the network security perimeter.
     */
    @JsonProperty(value = "resourceAssociation")
    private NspConfigAssociation resourceAssociation;

    /*
     * The profile for a network security perimeter configuration.
     */
    @JsonProperty(value = "profile")
    private NspConfigProfile profile;

    /*
     * The provisioningIssues property.
     */
    @JsonProperty(value = "provisioningIssues")
    private List<NspProvisioningIssue> provisioningIssues;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationProperties class.
     */
    public NetworkSecurityPerimeterConfigurationProperties() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkSecurityPerimeter property: The perimeter for a network security perimeter configuration.
     * 
     * @return the networkSecurityPerimeter value.
     */
    public NspConfigPerimeter networkSecurityPerimeter() {
        return this.networkSecurityPerimeter;
    }

    /**
     * Set the networkSecurityPerimeter property: The perimeter for a network security perimeter configuration.
     * 
     * @param networkSecurityPerimeter the networkSecurityPerimeter value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties
        withNetworkSecurityPerimeter(NspConfigPerimeter networkSecurityPerimeter) {
        this.networkSecurityPerimeter = networkSecurityPerimeter;
        return this;
    }

    /**
     * Get the resourceAssociation property: The resource association for the network security perimeter.
     * 
     * @return the resourceAssociation value.
     */
    public NspConfigAssociation resourceAssociation() {
        return this.resourceAssociation;
    }

    /**
     * Set the resourceAssociation property: The resource association for the network security perimeter.
     * 
     * @param resourceAssociation the resourceAssociation value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties
        withResourceAssociation(NspConfigAssociation resourceAssociation) {
        this.resourceAssociation = resourceAssociation;
        return this;
    }

    /**
     * Get the profile property: The profile for a network security perimeter configuration.
     * 
     * @return the profile value.
     */
    public NspConfigProfile profile() {
        return this.profile;
    }

    /**
     * Set the profile property: The profile for a network security perimeter configuration.
     * 
     * @param profile the profile value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties withProfile(NspConfigProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the provisioningIssues property: The provisioningIssues property.
     * 
     * @return the provisioningIssues value.
     */
    public List<NspProvisioningIssue> provisioningIssues() {
        return this.provisioningIssues;
    }

    /**
     * Set the provisioningIssues property: The provisioningIssues property.
     * 
     * @param provisioningIssues the provisioningIssues value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties
        withProvisioningIssues(List<NspProvisioningIssue> provisioningIssues) {
        this.provisioningIssues = provisioningIssues;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSecurityPerimeter() != null) {
            networkSecurityPerimeter().validate();
        }
        if (resourceAssociation() != null) {
            resourceAssociation().validate();
        }
        if (profile() != null) {
            profile().validate();
        }
        if (provisioningIssues() != null) {
            provisioningIssues().forEach(e -> e.validate());
        }
    }
}
