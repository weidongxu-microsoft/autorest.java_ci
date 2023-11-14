// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Service Endpoint Policy resource.
 */
@Fluent
public final class ServiceEndpointPolicyPropertiesFormat {
    /*
     * A collection of service endpoint policy definitions of the service endpoint policy.
     */
    @JsonProperty(value = "serviceEndpointPolicyDefinitions")
    private List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /*
     * The resource GUID property of the service endpoint policy resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the service endpoint policy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The alias indicating if the policy belongs to a service
     */
    @JsonProperty(value = "serviceAlias")
    private String serviceAlias;

    /*
     * A collection of contextual service endpoint policy.
     */
    @JsonProperty(value = "contextualServiceEndpointPolicies")
    private List<String> contextualServiceEndpointPolicies;

    /**
     * Creates an instance of ServiceEndpointPolicyPropertiesFormat class.
     */
    public ServiceEndpointPolicyPropertiesFormat() {
    }

    /**
     * Get the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     * 
     * @return the serviceEndpointPolicyDefinitions value.
     */
    public List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions;
    }

    /**
     * Set the serviceEndpointPolicyDefinitions property: A collection of service endpoint policy definitions of the
     * service endpoint policy.
     * 
     * @param serviceEndpointPolicyDefinitions the serviceEndpointPolicyDefinitions value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat withServiceEndpointPolicyDefinitions(
        List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     * 
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the service endpoint policy resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service endpoint policy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the serviceAlias property: The alias indicating if the policy belongs to a service.
     * 
     * @return the serviceAlias value.
     */
    public String serviceAlias() {
        return this.serviceAlias;
    }

    /**
     * Set the serviceAlias property: The alias indicating if the policy belongs to a service.
     * 
     * @param serviceAlias the serviceAlias value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat withServiceAlias(String serviceAlias) {
        this.serviceAlias = serviceAlias;
        return this;
    }

    /**
     * Get the contextualServiceEndpointPolicies property: A collection of contextual service endpoint policy.
     * 
     * @return the contextualServiceEndpointPolicies value.
     */
    public List<String> contextualServiceEndpointPolicies() {
        return this.contextualServiceEndpointPolicies;
    }

    /**
     * Set the contextualServiceEndpointPolicies property: A collection of contextual service endpoint policy.
     * 
     * @param contextualServiceEndpointPolicies the contextualServiceEndpointPolicies value to set.
     * @return the ServiceEndpointPolicyPropertiesFormat object itself.
     */
    public ServiceEndpointPolicyPropertiesFormat
        withContextualServiceEndpointPolicies(List<String> contextualServiceEndpointPolicies) {
        this.contextualServiceEndpointPolicies = contextualServiceEndpointPolicies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceEndpointPolicyDefinitions() != null) {
            serviceEndpointPolicyDefinitions().forEach(e -> e.validate());
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
