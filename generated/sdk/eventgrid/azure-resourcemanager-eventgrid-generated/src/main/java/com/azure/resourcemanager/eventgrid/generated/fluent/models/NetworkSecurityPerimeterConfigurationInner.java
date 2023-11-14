// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationIssues;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterConfigurationProfile;
import com.azure.resourcemanager.eventgrid.generated.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.generated.models.ResourceAssociation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Network security perimeter configuration.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationInner extends ProxyResource {
    /*
     * Properties of the network security perimeter configuration.
     */
    @JsonProperty(value = "properties")
    private NetworkSecurityPerimeterConfigurationProperties innerProperties;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationInner class.
     */
    public NetworkSecurityPerimeterConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the network security perimeter configuration.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Provisioning state to reflect configuration state and indicate status of nsp
     * profile configuration retrieval.
     * 
     * @return the provisioningState value.
     */
    public NetworkSecurityPerimeterConfigProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state to reflect configuration state and indicate status of nsp
     * profile configuration retrieval.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProvisioningState(NetworkSecurityPerimeterConfigProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the provisioningIssues property: Provisioning issues to reflect status when attempting to retrieve nsp
     * profile configuration.
     * 
     * @return the provisioningIssues value.
     */
    public List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningIssues();
    }

    /**
     * Set the provisioningIssues property: Provisioning issues to reflect status when attempting to retrieve nsp
     * profile configuration.
     * 
     * @param provisioningIssues the provisioningIssues value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProvisioningIssues(List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningIssues(provisioningIssues);
        return this;
    }

    /**
     * Get the networkSecurityPerimeter property: Perimeter info for nsp association.
     * 
     * @return the networkSecurityPerimeter value.
     */
    public NetworkSecurityPerimeterInfo networkSecurityPerimeter() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityPerimeter();
    }

    /**
     * Set the networkSecurityPerimeter property: Perimeter info for nsp association.
     * 
     * @param networkSecurityPerimeter the networkSecurityPerimeter value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withNetworkSecurityPerimeter(NetworkSecurityPerimeterInfo networkSecurityPerimeter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withNetworkSecurityPerimeter(networkSecurityPerimeter);
        return this;
    }

    /**
     * Get the resourceAssociation property: Nsp association name and access mode of association.
     * 
     * @return the resourceAssociation value.
     */
    public ResourceAssociation resourceAssociation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceAssociation();
    }

    /**
     * Set the resourceAssociation property: Nsp association name and access mode of association.
     * 
     * @param resourceAssociation the resourceAssociation value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner withResourceAssociation(ResourceAssociation resourceAssociation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withResourceAssociation(resourceAssociation);
        return this;
    }

    /**
     * Get the profile property: Nsp profile configuration, access rules and diagnostic settings.
     * 
     * @return the profile value.
     */
    public NetworkSecurityPerimeterConfigurationProfile profile() {
        return this.innerProperties() == null ? null : this.innerProperties().profile();
    }

    /**
     * Set the profile property: Nsp profile configuration, access rules and diagnostic settings.
     * 
     * @param profile the profile value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProfile(NetworkSecurityPerimeterConfigurationProfile profile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProfile(profile);
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
