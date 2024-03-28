// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storage.generated.models.NetworkSecurityPerimeter;
import com.azure.resourcemanager.storage.generated.models.NetworkSecurityPerimeterConfigurationPropertiesProfile;
import com.azure.resourcemanager.storage.generated.models.NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation;
import com.azure.resourcemanager.storage.generated.models.NetworkSecurityPerimeterConfigurationProvisioningState;
import com.azure.resourcemanager.storage.generated.models.ProvisioningIssue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The Network Security Perimeter configuration resource.
 */
@Immutable
public final class NetworkSecurityPerimeterConfigurationInner extends ProxyResource {
    /*
     * Properties of the Network Security Perimeter Configuration
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkSecurityPerimeterConfigurationProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationInner class.
     */
    public NetworkSecurityPerimeterConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Network Security Perimeter Configuration.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of Network Security Perimeter configuration propagation.
     * 
     * @return the provisioningState value.
     */
    public NetworkSecurityPerimeterConfigurationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the provisioningIssues property: List of Provisioning Issues if any.
     * 
     * @return the provisioningIssues value.
     */
    public List<ProvisioningIssue> provisioningIssues() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningIssues();
    }

    /**
     * Get the networkSecurityPerimeter property: NetworkSecurityPerimeter related information.
     * 
     * @return the networkSecurityPerimeter value.
     */
    public NetworkSecurityPerimeter networkSecurityPerimeter() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityPerimeter();
    }

    /**
     * Get the resourceAssociation property: Information about resource association.
     * 
     * @return the resourceAssociation value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation resourceAssociation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceAssociation();
    }

    /**
     * Get the profile property: Network Security Perimeter profile.
     * 
     * @return the profile value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile profile() {
        return this.innerProperties() == null ? null : this.innerProperties().profile();
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